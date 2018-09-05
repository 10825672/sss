package com.sss.cloud.springribbon;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Contorllers {
    @Autowired HelloServres helloServres;
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add() {
        return helloServres.add();
    }

}
