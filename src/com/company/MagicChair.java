package com.company;

public class MagicChair implements Chair{
    private String material;

    @Override
    public String get_chair() {
        return "This is magic chair!";
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String sit() {
        return "WOW! You sit on magic chair!";
    }

}