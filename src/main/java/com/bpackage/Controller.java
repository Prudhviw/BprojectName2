package com.bpackage;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Raj on 11/15/2016.
 */


@RestController
public class Controller {
    @RequestMapping("/")
    String function(){

        return "welcome";
    }
}
