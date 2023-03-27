package com.sda.she_likes_java.classes.constructor;

public class FullAddress {
    public String country;
    public String city;
    public String street;
    // 02-987
    // 011
    public String postalCode;

    @Override
    public String toString() {
        return "FullAddress{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", postalCode='" + postalCode + '\'' +
                '}';
    }

    // constructor
    public FullAddress(String country, String city, String street, String postalCode) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.postalCode = postalCode;
    }
// default constructor - without any parameters
    public FullAddress() {
    }

    public static void main(String[] args) {
        FullAddress myaddress;
        myaddress = new FullAddress();

        myaddress.city = "Sofia";
        myaddress.country = "Timbuktu";
        myaddress.street = "Torpedo";
        myaddress.postalCode = "0001";
        System.out.println(myaddress);

        FullAddress myAddressWithFullConstructor;
        myAddressWithFullConstructor = new FullAddress("Zimbabue", "Somewhere", "One", "1220");
        System.out.println(myAddressWithFullConstructor);

    }
}
