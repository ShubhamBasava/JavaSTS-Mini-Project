package com.tns.project;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Shop {
    private int shopId;
    private String shopCategory;
    private String shopName;
    private String customers;
    private String shopStatus;
    private String leaseStatus;

    public Shop() {
        // Default constructor
    }

    public Shop(int shopId, String shopCategory, String shopName, String customers, String shopStatus, String leaseStatus) {
        this.shopId = shopId;
        this.shopCategory = shopCategory;
        this.shopName = shopName;
        this.customers = customers;
        this.shopStatus = shopStatus;
        this.leaseStatus = leaseStatus;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getShopId() {
        return shopId;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }

    public String getShopCategory() {
        return shopCategory;
    }

    public void setShopCategory(String shopCategory) {
        this.shopCategory = shopCategory;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getCustomers() {
        return customers;
    }

    public void setCustomers(String customers) {
        this.customers = customers;
    }

    public String getShopStatus() {
        return shopStatus;
    }

    public void setShopStatus(String shopStatus) {
        this.shopStatus = shopStatus;
    }

    public String getLeaseStatus() {
        return leaseStatus;
    }

    public void setLeaseStatus(String leaseStatus) {
        this.leaseStatus = leaseStatus;
    }

    @Override
    public String toString() {
        return "Shop [shopId=" + shopId + ", shopCategory=" + shopCategory + ", shopName=" + shopName
                + ", customers=" + customers + ", shopStatus=" + shopStatus + ", leaseStatus=" + leaseStatus + "]";
    }
}