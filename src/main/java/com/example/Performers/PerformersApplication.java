package com.example.Performers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class PerformersApplication {

    private static final Logger log =
            LoggerFactory.getLogger(PerformersApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(PerformersApplication.class, args);
	}


    @Bean
    public CommandLineRunner demo(NewsRepository repository, MusicRepository repository2, UserRepository repository3) {
        return (args) -> {
            // save a few customers
            repository.save(new News(repository3.save(new User(Long.valueOf(12))), "Podsjetnik za događaj 1", new Date(), true));
            repository.save(new News(repository3.save(new User(Long.valueOf(122))),"Podsjetnik za događaj 2", new Date(), true));
            repository.save(new News(repository3.save(new User(Long.valueOf(123))),"Podsjetnik za događaj 3", new Date(), true));

            log.info("Notifications found with findAll():");
            log.info("-------------------------------");

            for (News notification : repository.findAll()) {
                log.info(notification.toString());
            }
            log.info("");

            repository2.save(new Music(Long.valueOf(1)));
            repository2.save(new Music(Long.valueOf(2)));
            repository2.save(new Music(Long.valueOf(3)));

            log.info("Events found with findAll():");
            log.info("-------------------------------");

            for (Music event : repository2.findAll()) {
                log.info(event.toString());
            }
            log.info("");

            repository3.save(new User(Long.valueOf(12)));
            repository3.save(new User(Long.valueOf(23)));
            repository3.save(new User(Long.valueOf(123)));

            log.info("Events found with findAll():");
            log.info("-------------------------------");

            for (User user : repository3.findAll()) {
                log.info(user.toString());
            }
            log.info("");
        };
    }
}
