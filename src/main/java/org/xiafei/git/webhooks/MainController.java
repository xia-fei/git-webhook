package org.xiafei.git.webhooks;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class MainController {
    @RequestMapping
    public String main() throws IOException {
        System.out.println("请求来了");
       Process process= Runtime.getRuntime().exec("/root/xiafei/webhtml.sh 1");
        return "ok";
    }
}
