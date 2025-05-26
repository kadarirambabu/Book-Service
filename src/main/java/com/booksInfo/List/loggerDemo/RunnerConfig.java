package com.booksInfo.List.loggerDemo;

import com.booksInfo.List.service.BooksService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RunnerConfig {
    @Bean
    public CommandLineRunner run(BooksService booksService) {
        return args -> {
            booksService.doSomething();
        };
    }
}
