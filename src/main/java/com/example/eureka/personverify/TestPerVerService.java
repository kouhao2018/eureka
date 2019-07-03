package com.example.eureka.personverify;

import org.springframework.stereotype.Service;

@Service("test")
public class TestPerVerService implements IPersonVerifyService {
    @Override
    public EPersonVerifyResult verify(String realName, String idCard, String mobileNumber) {

        System.out.println("TestPerVerService");

        return null;
    }
}
