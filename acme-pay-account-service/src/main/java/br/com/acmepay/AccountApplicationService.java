package br.com.acmepay;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableRabbit
public class AccountApplicationService {
    public static void main(String[] args) {
        SpringApplication.run(AccountApplicationService.class, args);
    }
}