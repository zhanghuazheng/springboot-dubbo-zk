package com.huazheng.providerservice.service.impl;


import com.huazheng.providerservice.service.ISailTicketService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * @Classname SailTicketServiceImpl
 * @Description TODO
 * @Date 2020/7/20 16:48
 * @Created by zhanghuazheng
 */
@Service
@Component
public class SailTicketServiceImpl implements ISailTicketService {
    @Override
    public String sailTicket() {
        return "卖票服务";
    }
}
