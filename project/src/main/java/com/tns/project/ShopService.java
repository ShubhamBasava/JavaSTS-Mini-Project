package com.tns.project;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ShopService {
    @Autowired
    private ShopRepository shopRepository;

    public List<Shop> listAllShops() {
        return shopRepository.findAll();
    }

    public void saveShop(Shop shop) {
        shopRepository.save(shop);
    }

    public Shop getShopById(int id) {
        return shopRepository.findById(id).orElse(null);
    }

    public void updateShop(Shop shop, int id) {
        if (shopRepository.existsById(id)) {
            shop.setShopId(id);
            shopRepository.save(shop);
        }
    }

    public void deleteShop(int id) {
        shopRepository.deleteById(id);
    }

    public Shop getShopId(int id) {
        return null;
    }
}
