package tech.liuxiaogang.dubbo.consumer;

import tech.liuxiaogang.dubbo.api.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
/**
 * Created by liuxiaogang on 2016/7/10.
 */
@RestController
public class HelloController {
    @Autowired
    private HelloService helloService;
    @RequestMapping("/index")
    @ResponseBody
    public String run() {
        return helloService.sayHello("dubbo");
    }
}
