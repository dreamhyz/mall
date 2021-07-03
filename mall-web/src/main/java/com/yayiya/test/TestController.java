package com.yayiya.test;

import com.yayiya.mall.client.test.rpc.RPCTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试
 *
 * @author xfd
 * 2021/7/3
 */
@RestController
public class TestController {

    @Autowired
    private RPCTestService testService;

    @GetMapping("/test")
    public String test()
    {
        return testService.list();
    }
}
