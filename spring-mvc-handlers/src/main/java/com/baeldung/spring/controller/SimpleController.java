package com.baeldung.spring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class SimpleController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest request,
	         HttpServletResponse response) throws Exception {
	    ModelAndView model = new ModelAndView("Greeting");
	    model.addObject("message", "Dinesh Madhwal");
	    return model;
    }
}