package cn.analysis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author zhaojie
 * @date 2021/10/14 10:17:54
 */
@SpringBootApplication
// @ComponentScan(value = {"cn.analysis"})
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}