package com.company;

public class VictorianChair implements Chair{
    private String material;

    @Override
    public String sit() {
        return "WOW! You sit on victorian chair!";
    }

    @Override
    public String get_chair() {
        return "This is victorian chair!";
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

}