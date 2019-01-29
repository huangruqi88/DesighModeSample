package com.example.huangruqi.pattern.prototype.user;

/**
 * @data: 2019/1/25 19:32
 * @author: 黄汝琪
 * @Email:
 * @Description:
 */
public class Address {
    public String city;
    public String district;
    public String street;

    public Address(String city, String district, String street) {
        this.city = city;
        this.district = district;
        this.street = street;
    }

    @Override
    public String toString() {
        return "Address [ city = " + city + ", district = " + district + ", street = " + street + " ]";
    }
}
