package com.jiayaming.dubbo.customer.dao;

import java.util.Map;

import com.jiayaming.dubbo.customer.model.CustomerInfo;

public interface CustomerInfoMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table customer_info
	 * @mbg.generated  Sat Feb 10 16:32:41 CST 2018
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table customer_info
	 * @mbg.generated  Sat Feb 10 16:32:41 CST 2018
	 */
	int insert(CustomerInfo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table customer_info
	 * @mbg.generated  Sat Feb 10 16:32:41 CST 2018
	 */
	int insertSelective(CustomerInfo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table customer_info
	 * @mbg.generated  Sat Feb 10 16:32:41 CST 2018
	 */
	CustomerInfo selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table customer_info
	 * @mbg.generated  Sat Feb 10 16:32:41 CST 2018
	 */
	int updateByPrimaryKeySelective(CustomerInfo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table customer_info
	 * @mbg.generated  Sat Feb 10 16:32:41 CST 2018
	 */
	int updateByPrimaryKey(CustomerInfo record);
	
	CustomerInfo selectCustomerByMap(Map<String,Object> map);
}