package com.example.explore.shop.Service;


import com.example.explore.shop.dao.WishListDao;
import com.example.explore.shop.repository.WishListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WishListService implements WishListRepository {


    @Autowired
    public MongoTemplate mongoTemplate;

    @Override
    public List<WishListDao> getAllWishList(){
        return mongoTemplate.findAll(WishListDao.class);
    }

    @Override
    public WishListDao createWishList(WishListDao wishlist) {
        return mongoTemplate.save(wishlist);
    }

}
