package com.wishlist.backend.controllers;

import org.springframework.web.bind.annotation.*;
import com.wishlist.backend.models.WishlistItem;
import com.wishlist.backend.services.WishlistService;

import java.util.List;

@RestController
@RequestMapping("/wishlist")
public class WishlistController {

    private final WishlistService service;

    public WishlistController(WishlistService service) {
        this.service = service;
    }

    @GetMapping
    public List<WishlistItem> findAll() {
        return service.findAll();
    }

    @PostMapping
    public WishlistItem save(@RequestBody WishlistItem item) {
        return service.save(item);
    }
}