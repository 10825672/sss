package com.sss.cloud.springoffer.contorller;

import com.sss.cloud.springoffer.entity.User;
import com.sss.cloud.springoffer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
public class HelloContorller {
    @Autowired
    private DiscoveryClient client;
    @Resource
    private UserService UserService;
    @RequestMapping(value = "/text", method = RequestMethod.GET)
    public List<User> text(User User, Map<String,Object>map){
        List<User> users = UserService.selectByCondition(new User());
        map.put("users",users);
        return	users;
//sssssssssssssss
    }
}
