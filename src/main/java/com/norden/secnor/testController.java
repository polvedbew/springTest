package com.norden.secnor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * ----------------------*    Norden Communication    *-------------------------
 * Created on 20/09/2022
 * R&D SCK
 * -----------------------------------------------------------------------------
 **/
@Controller
public class testController {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
        return "index";
    }
    @RequestMapping(value = "/testHtml", method = RequestMethod.GET)
    public String testHtml() {
        return "testHtml";
    }

}
