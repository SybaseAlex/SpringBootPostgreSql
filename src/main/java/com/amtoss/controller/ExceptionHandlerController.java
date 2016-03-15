
package com.amtoss.controller;

import com.amtoss.exception.RestException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Alex
 * own implementation of Exception
 */
@Controller
public class ExceptionHandlerController {

    private static final Logger LOG = LoggerFactory.getLogger(ExceptionHandlerController.class);

    /**
     * If we caught the exception in our controller, it will be processed further in this method
     * @param e
     * @return 
     */
    @ExceptionHandler(RestException.class)
    public @ResponseBody
    String handleException(RestException e) {
        LOG.error("Error: {}" , e.getMessage(), e);
        return "Error: " + e.getMessage();
    }
}
