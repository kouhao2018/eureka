package com.example.eureka;

import com.example.eureka.personverify.IPersonVerifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TestController {

//    @Qualifier(value = "${credit-chain.ver}")
//    @Autowired
    @Resource(name = "${credit.chain}")
    private IPersonVerifyService iPersonVerifyService;

    @GetMapping("test")
    public void test(){
        iPersonVerifyService.verify("aaaa","ddd","");
    }
}
