package org.leesia.sevice.provider.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Auther: leesia
 * @Date: 2018/5/30 08:08
 * @Description:
 */
@RestController
public class Service {

    private static final Logger logger = LoggerFactory.getLogger(Service.class);

    @RequestMapping(value = "hello", method = RequestMethod.GET)
    @ResponseBody
    public Object hello(HttpServletRequest request, HttpServletResponse response, @RequestParam String message) {
        logger.info("hello {}", message);

        return "Hello " + message;
    }
}
