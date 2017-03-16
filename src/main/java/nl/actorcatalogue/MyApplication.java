package nl.actorcatalogue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableConfigurationProperties(AppConfig.class)
@EnableCaching
public class MyApplication {

    public static void main(String args[]) {
        SpringApplication.run(MyApplication.class);
    }

}
