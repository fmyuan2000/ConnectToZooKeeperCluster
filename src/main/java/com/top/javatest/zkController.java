package com.top.javatest;

import org.apache.zookeeper.ZooKeeper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class zkController {
    @Autowired
    ZkApi zkApi;
    @RequestMapping("/zk")
    public String GetValue()
    {

        zkApi.createNode("/test","1111");
        String str=zkApi.getData("/test",new WatcherApi());

        return  str;
    }


}
