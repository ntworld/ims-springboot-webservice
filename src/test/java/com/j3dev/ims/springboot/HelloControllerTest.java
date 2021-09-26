package com.j3dev.ims.springboot;

import com.j3dev.ims.springboot.web.HelloController;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)               // 테스트할 때 JUnit 에 내장된 실행자 외에 다른 실행자 실행
@WebMvcTest(controllers = HelloController.class) // Web(SpringMVC)
public class HelloControllerTest {

    @Autowired
    private MockMvc mvc; // 웹 API 테스트할때 사용 GET,POST 둘 다 가능

    @Test
    public void helloReturn() throws Exception {
        String hello = "hello";

        mvc.perform(get("/hello"))
                .andExpect(status().isOk())          // Status 200 검증 (200, 404, 500)
                .andExpect(content().string(hello)); // 응답내용이 hello 인지 검증
    }
}
