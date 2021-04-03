package com.example.project.model;

public class Meal {

    String name;
    String recipe;
    int image;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRecipe() {
        return recipe;
    }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public Meal(String name, String recipe, int image) {
        this.name = name;
        this.recipe = recipe;
        this.image = image;
    }
}
