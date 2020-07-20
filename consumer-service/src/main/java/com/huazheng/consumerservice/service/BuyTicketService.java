package com.huazheng.consumerservice.service;

import com.huazheng.providerservice.service.ISailTicketService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

/**
 * @Classname BuyTicketService
 * @Description TODO
 * @Date 2020/7/20 17:52
 * @Created by zhanghuazheng
 */
@Service
public class BuyTicketService {
    @Reference
    ISailTicketService iSailTicketService;
    public void buyTicket(){
        String s = iSailTicketService.sailTicket();
        System.out.println(s);
    }
}
