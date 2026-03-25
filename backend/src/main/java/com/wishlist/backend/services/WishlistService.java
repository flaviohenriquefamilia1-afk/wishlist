package com.wishlist.backend.services;

import org.springframework.stereotype.Service;
import com.wishlist.backend.models.WishlistItem;
import com.wishlist.backend.repositories.WishlistItemRepository;

import java.util.List;

@Service
public class WishlistService {

    private final WishlistItemRepository repository;

    public WishlistService(WishlistItemRepository repository) {
        this.repository = repository;
    }

    public List<WishlistItem> findAll() {
        return repository.findAll();
    }

    public WishlistItem save(WishlistItem item) {
        return repository.save(item);
    }
}