package tech.liuxiaogang.dubbo.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by xiaoyi on 2016/7/19.
 */
@SpringBootApplication
@ImportResource({"classpath:spring-dubbo.xml"})
public class App {

    public static void main(String[] args){
        SpringApplication.run(App.class);
    }
}
