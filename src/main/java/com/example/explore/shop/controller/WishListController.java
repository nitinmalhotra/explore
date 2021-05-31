package com.example.explore.shop.controller;

import com.example.explore.shop.Service.WishListService;
import com.example.explore.shop.dao.WishListDao;
import com.example.explore.shop.repository.WishListRepository;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class WishListController {

@Autowired
 private WishListService wishListService;

 private final Logger logger = LoggerFactory.getLogger(getClass());

 @RequestMapping(value = "/wishlists", method = RequestMethod.GET,headers="Accept=application/json")
 public List<WishListDao> fetch(){
  return wishListService.getAllWishList();
 }

 @RequestMapping(value = "/wishlists", method = RequestMethod.POST, headers="Accept=application/json")
 public String create(@RequestBody WishListDao wishlist,
                    HttpServletRequest request, HttpServletResponse response) throws Exception {

  WishListDao wishlistCreated = wishListService.createWishList(wishlist);
  return wishlistCreated.getId();
 }

}



