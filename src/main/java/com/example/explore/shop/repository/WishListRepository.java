package com.example.explore.shop.repository;


import com.example.explore.shop.dao.WishListDao;
import org.junit.platform.commons.logging.LoggerFactory;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.logging.Logger;

@Repository
public interface WishListRepository {

    public List<WishListDao> getAllWishList();

    public WishListDao createWishList(WishListDao wishlist);

}

