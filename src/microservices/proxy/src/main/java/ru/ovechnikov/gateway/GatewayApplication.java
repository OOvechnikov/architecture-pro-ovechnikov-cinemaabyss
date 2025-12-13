package ru.ovechnikov.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ru.ovechnikov.gateway.filter.FeatureFlagFilterFunctions;

@SpringBootApplication
public class GatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }

    @Bean
    public FeatureFlagFilterFunctions.FilterSupplier supplier() {
        // asdasfasfaf
        return new FeatureFlagFilterFunctions.FilterSupplier();
    }

}
