import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Transport car() {
        return new Car("Car");
    }

    @Bean
    public Transport bus() {
        return new Bus("Bus");
    }

    @Bean
    public Transport pickup() {
        return new Pickup("Pickup");
    }

    @Bean(name = "driver1")
    public Driver driver1() {
        return new Driver("Vadim", car());
    }

    @Bean(name = "driver2")
    public Driver driver2() {
        return new Driver("Valentin", bus());
    }

    @Bean(name = "driver3")
    public Driver driver3() {
        return new Driver("Boris", pickup());
    }
}