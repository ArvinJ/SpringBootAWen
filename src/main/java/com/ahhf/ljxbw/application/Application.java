package com.ahhf.ljxbw.application;

import java.util.Date;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * Spring Boot建议将我们main方法所在的这个主要的配置类配置在根包名下。
 * @author wenjin.zhu
 * @SpringBootApplication 由于大量项目都会在主要的配置类上添加@Configuration,@EnableAutoConfiguration,@ComponentScan三个注解。
 * 因此Spring Boot提供了@SpringBootApplication注解，该注解可以替代上面三个注解（使用Spring注解继承实现）。
 */
@RestController    // @RestController 注解相当于同时添加@Controller和@ResponseBody注解。
//@EnableAutoConfiguration  // Spring Boot建议只有一个带有该注解的类。
@SpringBootApplication
public class Application {

	@RequestMapping("/")
	String home() {
		return "Hello World!";
	}

	@RequestMapping("/now")    // 这些方法都添加了@RequestMapping("xxx")，这个注解起到路由的作用。
	String hehe() {
		return "现在时间：" + (new Date()).toLocaleString();
	}

	public static void main(String[] args) {
		//SpringApplication.run(Example.class, args);
	}

}