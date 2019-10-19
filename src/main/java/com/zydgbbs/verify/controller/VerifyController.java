package com.zydgbbs.verify.controller;

import com.zydgbbs.verify.domain.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.io.IOException;

@RestController
public class VerifyController {

    @PostMapping("/testVerify")
    public String testVerify(@Valid User user){
        System.out.println(user);
        return user.toString();
    }

    @RequestMapping("/testOutput")
    public void testOutput(HttpServletResponse response){
        response.setContentType("application/json;charset=utf-8");
        ServletOutputStream out;
        String result = "{\"name\":\"梁亚飞\"}";
        try {
            out = response.getOutputStream();
            byte data[] = result.getBytes();
            out.write(data);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
