package com.sw.config;

 
import io.swagger.v3.oas.models.*;
import io.swagger.v3.oas.models.info.*;
import org.springframework.context.annotation.*;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Banking Microservices API")
                        .version("1.0")
                        .description("API documentation for Banking Project"));
    }
}