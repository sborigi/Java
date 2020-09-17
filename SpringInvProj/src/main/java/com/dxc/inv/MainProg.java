package com.dxc.inv;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ApplicationContext ctx= new ClassPathXmlApplicationContext("order.xml");
      OrderLogic ol=(OrderLogic)ctx.getBean("orderlogic");
      ol.displayOrders();
	}
	}

