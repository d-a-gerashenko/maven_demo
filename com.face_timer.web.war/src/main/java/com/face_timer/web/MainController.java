package com.face_timer.web;

import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


import static org.slf4j.LoggerFactory.getLogger;

@Controller
public class MainController {
    private static final Logger LOG = getLogger(MainController.class.getName());

    @RequestMapping(method = RequestMethod.GET, path = "/test")
    @ResponseBody
    public String test() {
        LOG.debug("debug");
        LOG.info("info");
        LOG.error("error");
        LOG.warn("warn");
        return "ddd";
    }
}
