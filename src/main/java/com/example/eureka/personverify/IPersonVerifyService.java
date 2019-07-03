package com.example.eureka.personverify;

public interface IPersonVerifyService {
    EPersonVerifyResult verify(String realName, String idCard, String mobileNumber);
}
