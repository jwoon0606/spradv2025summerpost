package io.servlet.spradv2025summerpost.contoller.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/post")
@Controller
public class PostController {
    @RequestMapping("/{page}")
    public String page(@PathVariable String page){
        System.out.println("page = " + page);
        return "post/" + page;
    }
    @RequestMapping("/{page}/{id}")
    public String page(@PathVariable String page, @PathVariable String id){
        System.out.println("page = " + page + ", id = " + id);
        return "post/" + page;
    }
}
