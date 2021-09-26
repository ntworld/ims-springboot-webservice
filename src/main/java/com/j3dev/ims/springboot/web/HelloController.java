package com.j3dev.ims.springboot.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// @RestController 컨트롤러를 JSON 으로 반환
// SpringBoot 에선 @ResponseBody 쓸 필요없음
@RestController
public class HelloController {

    // HTTP Method  GET 방식 API
    @GetMapping("/hello")
    public String hello() {
        // 깃 푸시 테스트22
        return "hello";
    }
}
