package com.huazheng.consumerservice;

import com.huazheng.consumerservice.service.BuyTicketService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ConsumerServiceApplicationTests {

	@Test
	public void contextLoads() {

	}

	@Resource
	private BuyTicketService buyTicketService;

	@Test
	public void buyTicket() {
		buyTicketService.buyTicket();
	}


}
