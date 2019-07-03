package com.example.eureka.personverify.juhe;

import com.example.eureka.personverify.EPersonVerifyResult;
import com.example.eureka.personverify.IPersonVerifyService;
import org.springframework.stereotype.Service;

@Service("juhe")
public class PersonVerifyService implements IPersonVerifyService {

    private String url="http://v.juhe.cn/telecom/query";
    private String key = "774e951baca29d1a7c3de0ee87eb584d";


    @Override
    public EPersonVerifyResult verify(String realName, String idCard, String mobileNumber) {

//        Map<String,String> param = new HashMap<>();
//        param.put("key",key);
//        param.put("idcard",idCard);
//        param.put("realname",realName);
//        param.put("mobile",mobileNumber);
//        param.put("type","1");
//        param.put("showid","1");
//        param.put("province","1");
//        param.put("detail","1");

//        List<String> param = new ArrayList<>();
//        param.add("?key="+key);
//        param.add("&idcard="+idCard);
//        param.add("&realname="+realName);
//        param.add("&mobile="+mobileNumber);
//        param.add("&type="+idCard);
//        param.add("&showid="+idCard);
//        param.add("&province="+idCard);
//        param.add("&detail="+idCard);
//
//
//
//
//
//        HttpClient.ResponseSpec<JuHePerVerResult> responseSpec = HttpClient.create().uri(url).get(JuHePerVerResult.class);
//        responseSpec.
//        ResponseEntity<JuHePerVerResult> responseEntity = responseSpec.entity();
//        JuHePerVerResult juHePerVerResult = responseEntity.getBody();

        System.out.println("PersonVerifyService");
        return null;

    }
}
