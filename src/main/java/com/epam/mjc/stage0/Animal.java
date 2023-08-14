package com.epam.mjc.stage0;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription(){
        String result = "";
        switch (numberOfPaws > 1 ? 0 : 1) {
            case 0:
                switch (hasFur == true ? 0 : 1) {
                    case 0:
                        result = "This animal is mostly " + color + ". It has " + numberOfPaws + " paws and a fur.";
                        break;
                    case 1:
                        result = "This animal is mostly " + color + ". It has " + numberOfPaws + " paws and no fur.";
                        break;
                }
                break;
            case 1:
                switch (hasFur == true ? 0 : 1) {
                    case 0:
                        result = "This animal is mostly " + color + ". It has " + numberOfPaws + " paw and a fur.";
                        break;
                    case 1:
                        result = "This animal is mostly " + color + ". It has " + numberOfPaws + " paw and no fur.";
                        break;
                }
                break;
        }
        return result;
    }
}
