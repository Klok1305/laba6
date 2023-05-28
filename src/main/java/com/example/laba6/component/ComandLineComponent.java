package com.example.laba6.component;

import com.example.laba6.dto.HelloWorldDto;
import com.example.laba6.gateway.HelloWorldGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class ComandLineComponent implements CommandLineRunner {
    private final HelloWorldGateway helloWorldGateway;

    @Autowired
    public ComandLineComponent(HelloWorldGateway helloWorldGateway) {
        this.helloWorldGateway = helloWorldGateway;
    }
    // хочу кофе
    @Override
    public void run(String... args) throws Exception {

        for (int i = 0; i < 10; i++) {
            HelloWorldDto dto = new HelloWorldDto();
            Random random = new Random();
            int Rand = random.nextInt(67);
            if (Rand % 2 != 0) {
                dto.setMessage("Никита Безыкорнов 13.05.2002 ", Rand);
                helloWorldGateway.send(dto);
            }
        }
    }
}
