package com.gfg.consumeRest.fetchApi.controller;

import com.gfg.consumeRest.fetchApi.serviceUnit.ServiceUnit;
import com.gfg.consumeRest.fetchApi.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class Controller {

    @Autowired
    ServiceUnit service;

    @GetMapping("/codeforces/{handle}")
    public Map<String, Object> getUserfromSer(@PathVariable String handle){
        return service.getUserfromSer(handle);
    }

}
