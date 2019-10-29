package pl.komorowski.currenda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.embedded.EmbeddedMongoAutoConfiguration;

@SpringBootApplication(exclude = EmbeddedMongoAutoConfiguration.class)
public class CurrendaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrendaApplication.class, args);
	}
}
