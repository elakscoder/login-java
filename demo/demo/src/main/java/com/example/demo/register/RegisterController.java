package com.example.demo.register;


import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path="api/v1/register")
@AllArgsConstructor
public class RegisterController {

    private RegisterService registerService;
    public String register(@RequestBody RegisterRequest request){
        return RegisterService.register(request);
    }


}
