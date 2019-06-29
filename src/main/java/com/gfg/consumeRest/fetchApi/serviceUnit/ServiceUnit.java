package com.gfg.consumeRest.fetchApi.serviceUnit;

import com.gfg.consumeRest.fetchApi.doaUnit.Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ServiceUnit {

    @Autowired
    Dao dao;

    public Map<String, Object> getUserfromSer(String handle){
        return dao.getUserHandle(handle);
    }

}
