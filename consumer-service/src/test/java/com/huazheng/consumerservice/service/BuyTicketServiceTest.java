package com.huazheng.consumerservice.service;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @Classname BuyTicketServiceTest
 * @Description TODO
 * @Date 2020/7/20 17:04
 * @Created by zhanghuazheng
 */
@RunWith(SpringRunner.class)
public class BuyTicketServiceTest {

    @Resource
    private BuyTicketService buyTicketService;

    @Test
    public void buyTicket() {
        buyTicketService.buyTicket();
    }
}
