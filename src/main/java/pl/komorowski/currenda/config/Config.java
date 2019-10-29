package pl.komorowski.currenda.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public MongoInMemory mongoInMemory(
            @Value("${spring.data.mongodb.port}") int port,
            @Value("${spring.data.mongodb.host}")  String host) {
        return new MongoInMemory(port, host);
    }
}
