package com.karthik.order.bo;

import com.karthik.order.bo.exception.BOException;
import com.karthik.order.dto.Order;

public interface OrderBO {

	boolean placeOrder(Order order) throws BOException;

	boolean cancelOrder(int id) throws BOException;

	boolean deleteOrder(int id) throws BOException;

}
