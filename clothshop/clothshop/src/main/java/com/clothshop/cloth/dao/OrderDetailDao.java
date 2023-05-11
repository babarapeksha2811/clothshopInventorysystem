package com.clothshop.cloth.dao;

import org.springframework.data.repository.CrudRepository;

import com.clothshop.cloth.entity.OrderDetail;
import com.clothshop.cloth.entity.User;

import java.util.List;

public interface OrderDetailDao extends CrudRepository<OrderDetail, Integer> {
    public List<OrderDetail> findByUser(User user);

    public List<OrderDetail> findByOrderStatus(String status);
}
