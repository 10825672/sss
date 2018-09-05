package com.sss.cloud.springribbon;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("hello-server")
public interface HelloServres {
    @RequestMapping(value = "/text", method = RequestMethod.GET)
    String add();
}
