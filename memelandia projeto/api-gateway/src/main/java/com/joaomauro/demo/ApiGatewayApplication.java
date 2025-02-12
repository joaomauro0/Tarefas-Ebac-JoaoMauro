package br.com.ebac.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ApiGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }

    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("usuario-service", r -> r.path("/usuarios/**").uri("http://localhost:8081"))
                .route("categoria-service", r -> r.path("/categorias/**").uri("http://localhost:8082"))
                .route("meme-service", r -> r.path("/memes/**").uri("http://localhost:8083"))
                .build();
    }
}
