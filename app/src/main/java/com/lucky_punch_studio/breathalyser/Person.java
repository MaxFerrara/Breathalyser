package com.lucky_punch_studio.breathalyser;

public class Person {
    private GenderType genderType;
    private int age;
    private int height;
    private int bodyWeight;

    public Person(GenderType genderType, int age, int height, int bodyWeight) {
        this.genderType = genderType;
        this.age = age;
        this.height = height;
        this.bodyWeight = bodyWeight;
    }

    public GenderType getGenderType() {
        return genderType;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public int getBodyWeight() {
        return bodyWeight;
    }

    public void setGenderType(GenderType genderType) {
        this.genderType = genderType;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setBodyWeight(int bodyWeight) {
        this.bodyWeight = bodyWeight;
    }
}
