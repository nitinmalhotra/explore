package com.example.explore.shop.controller;

import com.example.explore.shop.repository.WishListRepository;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/wishlist/v1")
public class WishListController {

@Autowired
 private WishListRepository wishListRepository;

 private final Logger logger = LoggerFactory.getLogger(getClass());



}



