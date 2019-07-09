package aaa.test_git2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 部门管理控制器
 */
@Controller
public class DeptController {


    /**
     * 测试请求
     * @return
     */
    @RequestMapping("/test")
    @ResponseBody
    public String  test(){
        System.out.println("hello world");
        return "hello world";
    }

}
