package org.leesia.service.comsumer.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther: leesia
 * @Date: 2018/5/31 13:13
 * @Description:
 */
@Service
public class MessageService {

    private static final Logger logger = LoggerFactory.getLogger(MessageService.class);

    @Autowired
    private RestTemplate restTemplate;

    public String reverse(String message) {
        logger.info("reverse：{}", message);
        return restTemplate.getForObject("http://SERVICE-PROVIDER/reverse/" + message, String.class);
    }
}
