package hello.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //스프링 부트의 가장 기본적인 설정을 선언해줌
public class CoreApplication {

	public static void main(String[] args) { //스프링 부트는 main 메소드가 선언된 클래스를 기준으로 실행됨
		SpringApplication.run(CoreApplication.class, args);
	}

}
