package com.ewallet.demo.ThirdPartyServices;

import com.ewallet.demo.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {

    @Autowired
    private RestTemplate restTemplate;

    //REST call to another endpoint // network call
    public User findUserById(int userid){
        String url = "http://user-service/users/findUser/{id}";
        Map<String, Integer> params= new HashMap<String, Integer>();
        params.put("id", userid);
        try {
            ResponseEntity<User> responseEntity = restTemplate.getForEntity(url, User.class, params);
            if(responseEntity.getStatusCode().equals(HttpStatus.NOT_FOUND)){
                return null;
            }else{
                return responseEntity.getBody();
            }
        }catch(Exception exception){
            System.out.println(exception);
            return null;
        }
    }
}
