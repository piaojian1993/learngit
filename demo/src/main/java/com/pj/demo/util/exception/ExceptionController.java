package com.pj.demo.util.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class ExceptionController {

    private static final Logger logger = LoggerFactory.getLogger(ExceptionController.class);


    /**
     * 统一异常处理
     *
     * @param exception
     *            exception
     * @return
     */
//    @ExceptionHandler({ RuntimeException.class })
//    @ResponseStatus(HttpStatus.OK)
//    public ModelAndView processException(RuntimeException exception) {
//        System.out.println("456");
//        ModelAndView m = new ModelAndView();
//        m.addObject("roncooException", exception.getMessage());
//        m.setViewName("error/500");
//        return m;
//    }

    /**
     * 统一异常处理
     *
     * @param exception
     *            exception
     * @return
     */
    @ExceptionHandler({ Exception.class })
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public Map<String, String> processException(Exception exception) {
        System.out.println("123");
        logger.error("系统异常",exception);
//        ModelAndView m = new ModelAndView();
//        m.addObject("roncooException", exception.getMessage());
//        m.setViewName("error/500");
//        return m;
        Map<String, String> map = new HashMap<String, String>();
        map.put("status", "S000");
        map.put("success", "success");
        return map;
    }
}
