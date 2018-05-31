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
public class MessageController {

    private static final Logger logger = LoggerFactory.getLogger(MessageController.class);

    @RequestMapping(value = "reverse/{message}", method = RequestMethod.GET)
    @ResponseBody
    public String reverse(HttpServletRequest request, HttpServletResponse response, @PathVariable("message") String message) {
        logger.info("reverse：{}", message);

        if (message == null) {
            return "";
        }
        return new StringBuffer(message).reverse().toString();
    }
}
