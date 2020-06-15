package com.mybatis.test;

import java.util.List;

import org.junit.Test;

import com.mybatis.dao.OrdersCustomerDao;
import com.mybatis.dao.impl.OrdersCustomerDaoImpl;
import com.mybatis.entity.OrderCustomer;

public class OrderCustomerTest {
	
	@Test
	public void test() throws Exception {
		OrdersCustomerDao ocdao = new OrdersCustomerDaoImpl();		
		List<OrderCustomer> list = ocdao.findOrderCustomerList();
		System.out.println(list);
		
	}
}

