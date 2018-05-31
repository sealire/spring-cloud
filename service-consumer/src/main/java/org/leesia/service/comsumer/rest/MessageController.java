package org.leesia.service.comsumer.rest;

import org.leesia.service.comsumer.service.MessageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Auther: leesia
 * @Date: 2018/5/31 13:12
 * @Description:
 */
@RestController
public class MessageController {

    private static final Logger logger = LoggerFactory.getLogger(MessageController.class);

    @Autowired
    private MessageService service;

    @RequestMapping(value = "reverse/{message}", method = RequestMethod.GET)
    @ResponseBody
    public String reverse(HttpServletRequest request, HttpServletResponse response,  @PathVariable("message") String message) {
        logger.info("reverse：{}", message);
        return service.reverse(message);
    }
}
