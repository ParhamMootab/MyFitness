package com.example.project.model;

public class Meal {

    String name;
    String recipe;
    int image;
    String recipeUrl;

    public Meal(String name, String recipe, int image, String recipeUrl) {
        this.name = name;
        this.recipe = recipe;
        this.image = image;
        this.recipeUrl = recipeUrl;
    }

    public String getRecipeUrl() {
        return recipeUrl;
    }

    public void setRecipeUrl(String recipeUrl) {
        this.recipeUrl = recipeUrl;
    }

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


}
