package com.mybatis.dao.impl;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.mybatis.dao.OrdersCustomerDao;
import com.mybatis.entity.OrderCustomer;
import com.mybatis.test.OrderCustomerTest;

public class OrdersCustomerDaoImpl implements OrdersCustomerDao {


	@Override
	public List<OrderCustomer> findOrderCustomerList() {
		// 创建会话工厂并加载配置文件
		SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(
				OrderCustomerTest.class.getClassLoader().getResourceAsStream("mybatis-config.xml"));

		InputStream inputStream = Resoures.getResourceAsStream("mybatis-config.xml");

		// 通过SqlSessionFactory创建SqlSession
		SqlSession session = ssf.openSession();
		// 通过SqlSession操作数据库
		// 第一个参数：Statement的位置，等于namespace+Statement的id
		// 第二个参数：传入的参数
		List<OrderCustomer> list = session.selectList("findOrderCustomerList");
		return list;
	}


}
