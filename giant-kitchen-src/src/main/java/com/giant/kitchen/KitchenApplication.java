package com.giant.kitchen;
import org.springframework.boot.SpringApplication;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication@ComponentScan(basePackages = {"com.giant.kitchen.**"})
@MapperScan("com.giant.kitchen.**.mapper")
public class KitchenApplication {
    public static void main(String[] args) {
        SpringApplication.run(KitchenApplication.class);
    }
}
