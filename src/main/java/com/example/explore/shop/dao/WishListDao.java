package com.example.explore.shop.dao;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

import java.util.Date;

@Document("collection = wishlist")
public class WishListDao {


    @Id
    private long id;
    private String name;
    private String itemId;
    private Date creationDate = new Date();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String address) {
        this.itemId = address;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }


}
