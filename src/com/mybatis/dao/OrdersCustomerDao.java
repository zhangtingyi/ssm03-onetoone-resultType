package com.mybatis.dao;

import java.util.List;

import com.mybatis.entity.OrderCustomer;

public interface OrdersCustomerDao {
	
	public List<OrderCustomer> findOrderCustomerList();
	
}
