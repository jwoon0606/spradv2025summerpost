package io.servlet.spradv2025summerpost.contoller.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DefaultController {
    @RequestMapping({"/index", "", "/"}) // @RequestMapping 의 주소값은 스트링 한개도 가능, 스트링 배열도 가능!
    public String index() {
        return "index";
    }
}