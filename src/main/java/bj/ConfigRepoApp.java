package bj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

/**
 * Hello world!
 */
@SpringBootApplication
@PropertySources({
    @PropertySource("config-client.yml")
})
public class ConfigRepoApp {
    public static void main(String[] args) {
        SpringApplication.run(ConfigRepoApp.class);
    }
}
