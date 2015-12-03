
package com.amtoss.controller;

import com.amtoss.exception.RestException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * наша реализация Exception а
 * @author Alex
 */
@Controller
public class ExceptionHandlerController {

    private static final Logger LOG = LoggerFactory.getLogger(ExceptionHandlerController.class);

    /**
     * Если мы словили такую ошибку в нашем контроллере, то она будет обработана дополнительно в этом методе
     * @param e
     * @return 
     */
    @ExceptionHandler(RestException.class)
    public @ResponseBody
    String handleException(RestException e) {
        LOG.error("Ошибка: {}" , e.getMessage(), e);
        return "Ошибка: " + e.getMessage();
    }
}
