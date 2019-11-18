package com.top.javatest;

import org.apache.zookeeper.ZooKeeper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class zkController {
    @Autowired
    ZkApi zkApi;
    @RequestMapping("/zk")
    public String GetValue(@RequestParam String id)
    {

        zkApi.createNode("/"+id,"1111");
        String str=zkApi.getData("/"+id,new WatcherApi());

        return  str;
    }


}
