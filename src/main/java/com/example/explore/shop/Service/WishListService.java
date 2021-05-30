package com.example.explore.shop.Service;


import com.example.explore.shop.dao.WishListDao;
import com.example.explore.shop.repository.WishListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WishListService {


    @Autowired
    public WishListRepository wishListRepository;


    public List<WishListDao> getAllWishList(){



    }




}
