package com.skillsoft.controller;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.web.servlet.ModelAndView;

public class MessageDisplayControllerTest {

    private final MessageDisplayController controller = new MessageDisplayController();

    @Test
    public void hiReturnsCorrectMessage() {
        ExtendedModelMap model = new ExtendedModelMap();
        ModelAndView mav = controller.hi(model);
        Assert.assertEquals("index", mav.getViewName());
        Assert.assertEquals("Hi there!", model.get("message"));
    }

    @Test
    public void beginLearningReturnsCorrectMessage() {
        ExtendedModelMap model = new ExtendedModelMap();
        ModelAndView mav = controller.beginLearning(model);
        Assert.assertEquals("index", mav.getViewName());
        Assert.assertEquals("Let's begin learning!", model.get("message"));
    }
}
