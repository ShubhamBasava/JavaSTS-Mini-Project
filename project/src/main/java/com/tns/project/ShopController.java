package com.tns.project;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShopController {
    @Autowired
    private ShopService shopService;

    @GetMapping("/shops")
    public List<Shop> list() {
        return shopService.listAllShops();
    }

    @GetMapping("/shops/{id}")
    public Shop get(@PathVariable int id) {
        return shopService.getShopId(id);
    }

    @PostMapping("/shops")
    public void add(@RequestBody Shop shop) {
        shopService.saveShop(shop);
    }

    @PutMapping("/shops/{id}")
    public void update(@RequestBody Shop shop, @PathVariable int id) {
        shopService.updateShop(shop, id);
    }

    @DeleteMapping("/shops/{id}")
    public void delete(@PathVariable int id) {
        shopService.deleteShop(id);
    }
}
