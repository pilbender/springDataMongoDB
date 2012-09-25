package net.raescott.springdatamongodb;

import com.mongodb.Mongo;
import java.net.UnknownHostException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

/**
 * MongoDB with Spring Data and Entity Beans.
 *
 */
public class App {
	private static final Logger logger = LoggerFactory.getLogger(App.class);

	public static void main(String[] args) {
		try {
            MongoOperations mongoOps = new MongoTemplate(new Mongo(), "mydb");
            mongoOps.insert(new Person("Joe", 34));
			Person person = mongoOps.findOne(new Query(Criteria.where("name").is("Joe")), Person.class);
            logger.info(person.toString());
            mongoOps.dropCollection("person");
        }
        catch(UnknownHostException ex) {
            logger.error(ex.getMessage());
        }
	}
}
