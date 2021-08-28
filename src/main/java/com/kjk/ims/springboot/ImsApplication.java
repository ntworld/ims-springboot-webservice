package com.kjk.ims.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// @SpringBootApplication 로 인해 스프링부트 자동설정, Bean 읽기와 생성 모두 자동
// 여기서부터 읽어나가기 시작함 항상 Application 은 상위에 존재 해야함
@SpringBootApplication
public class ImsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImsApplication.class, args);
	}

}