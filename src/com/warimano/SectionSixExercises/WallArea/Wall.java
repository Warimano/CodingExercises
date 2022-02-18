package com.warimano.SectionSixExercises.WallArea;

public class Wall {
    private double width;
    private double height;

    public Wall() {}

    public Wall(double width, double height) {
        if (width < 0f) {
            this.width = 0f;
        } else {
            this.width = width;
        }
        if (height < 0f) {
            this.height = 0f;
        } else {
            this.height = height;
        }
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        if (width < 0f) {
            this.width = 0f;
        } else {
            this.width = width;
        }
    }

    public void setHeight(double height) {
        if (height < 0f) {
            this.height = 0f;
        } else {
            this.height = height;
        }
    }

    public double getArea() {
        return this.height * this.width;
    }
}
