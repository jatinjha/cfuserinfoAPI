package com.gfg.consumeRest.fetchApi.doaUnit;

import com.gfg.consumeRest.fetchApi.serviceUnit.ServiceUnit;
import com.gfg.consumeRest.fetchApi.user.Result;
import com.gfg.consumeRest.fetchApi.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Component
public class Dao {


    public Map<String, Object> getUserHandle(String handle) {
        RestTemplate restTemplate = new RestTemplate();
        Result jsonString = restTemplate.getForObject("http://codeforces.com/api/user.info?handles="+handle, Result.class);
        System.out.println(jsonString.getAdditionalProperties());
        return jsonString.getAdditionalProperties();
    }

}
