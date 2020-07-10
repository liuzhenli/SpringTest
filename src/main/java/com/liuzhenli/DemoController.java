package com.liuzhenli;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(produces = "text/plain;charset=UTF-8", value = "/api/ikuaidi/")
public class DemoController {

//    @GetMapping("/info")
//    public String getKDInfo(@RequestParam(name = "company", required = true) String company,
//                            @RequestParam(name = "number", required = true) Integer number) throws Exception {
//        return "hell world liuzhenli";
//    }

    @GetMapping("/info")
    public String getKDInfo() throws Exception {
        return "hell world liuzhenli";
    }
}
