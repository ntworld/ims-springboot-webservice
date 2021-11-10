package com.j3dev.ims.springboot.web;

import com.j3dev.ims.springboot.web.api.user.User;
import com.j3dev.ims.springboot.web.api.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// @RestController 컨트롤러를 JSON 으로 반환
// SpringBoot 에선 @ResponseBody 쓸 필요없음
@RestController(value = "/api")
public class HelloController {

    @Autowired
    private UserRepository userRepository;

    // HTTP Method  GET 방식 API
    @GetMapping("/hello")
    public String hello() {
        // 깃 푸시 테스트22 zzz dev0
        return "hello";
    }

    @GetMapping("/getUser")
    public List<User> getUser() {
        return userRepository.findAll();
    }
}
