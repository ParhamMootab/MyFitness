package com.example.project.model;

public class Exercise {

    private String name;
    private String instruction;
    private String muscle;
    private int image;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    public String getMuscle() {
        return muscle;
    }

    public void setMuscle(String muscle) {
        this.muscle = muscle;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public Exercise(String name, String instruction, String muscle) {
        this.name = name;
        this.instruction = instruction;
        this.muscle = muscle;
    }
}
