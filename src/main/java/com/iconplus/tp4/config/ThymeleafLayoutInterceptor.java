package com.iconplus.tp4.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by mrapry on 2/5/17.
 */
@Configuration
@EnableWebMvc
public class ThymeleafLayoutInterceptor extends HandlerInterceptorAdapter {
    private static final String DEFAULT_LAYOUT = "shared/layout";
    private static final String DEFAULT_VIEW_ATTRIBUTE_NAME = "view";

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

        if (modelAndView == null || !modelAndView.hasView()) {
            return;
        }
        String originalViewName = modelAndView.getViewName();

        if (originalViewName.startsWith("redirect:")) {
            return;
        }

        System.out.println("request.getRequestURI()"+request.getRequestURI());

        if (request.getRequestURI().startsWith("/login")) {
        } else {
            modelAndView.setViewName(DEFAULT_LAYOUT);
        }

        modelAndView.addObject(DEFAULT_VIEW_ATTRIBUTE_NAME, originalViewName);
    }
}
