package com.trygym.solution.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by hasini on 3/23/17.
 */
@Controller
@RequestMapping(value="/gym")
public class InterfaceController {
    @RequestMapping(value="/index", method = RequestMethod.GET)
    public String viewMyChildDetails() {

        return "index";
    }

    @RequestMapping(value="/blog", method = RequestMethod.GET)
    public String viewBlog() {//write class for get blog details

        return "blog";
    }

    @RequestMapping(value="/contact", method = RequestMethod.GET)
    public String viewContact() {

        return "contact";
    }

    @RequestMapping(value="/details", method = RequestMethod.GET)
    public String viewDetails() {

        return "details";
    }

    @RequestMapping(value="/products", method = RequestMethod.GET)
    public String viewProduct() {

        return "products";
    }

    @RequestMapping(value="/singlepage", method = RequestMethod.GET)
    public String viewSinglepage() {

        return "singlepage";
    }

    @RequestMapping(value="/features", method = RequestMethod.GET)
    public String viewFeaatures() {

        return "features";
    }

}
