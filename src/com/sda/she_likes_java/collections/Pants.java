package com.sda.she_likes_java.collections;

import java.util.Objects;

public class Pants {
        private String brand;
        private String material;

    public Pants(String brand, String material) {
        this.brand = brand;
        this.material = material;
    }

    @Override
    public String toString() {
        return "Pants{" +
                "brand='" + brand + '\'' +
                ", material='" + material + '\'' +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pants pants = (Pants) o;
        return Objects.equals(brand, pants.brand) && Objects.equals(material, pants.material);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, material);
    }
}
