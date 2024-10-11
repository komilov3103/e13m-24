package ru.mpei.l5.HomeWork;

import java.util.Objects;

public class SteroidArray {
    private int size;
    private String[] ArrayOfStrings;

    public SteroidArray(int size){
        this.size = size;
        this.ArrayOfStrings = new String[size];
    }

    public boolean add(String s){
        for (int i = 0; i < this.size; i++){
            if (Objects.isNull(this.ArrayOfStrings[i])){
                this.ArrayOfStrings[i] = s;
                return true;
            }
        }
        return false;
    }

    public boolean remove(String s){
        boolean IsRemoved = false;
        for (int i = 0; i < this.size; i++){
            if (s.equals(this.ArrayOfStrings[i])){
                IsRemoved = true;
            }
            if (IsRemoved){
                this.ArrayOfStrings[i] = this.ArrayOfStrings[i + 1];
            }
            if (Objects.isNull(this.ArrayOfStrings[i])){
                break;
            }
        }
        return IsRemoved;
    }

    public boolean remove(int i){
        if (i >= size || i < 0){
            return false;
        }
        for (int j = i; j < size - 1; j++){
            if (Objects.isNull(this.ArrayOfStrings[j])){
                break;
            } else {
                this.ArrayOfStrings[j] = this.ArrayOfStrings[j + 1];
            }
        }
        return true;
    }

    public String get(int i){
        if (i >= size || i < 0){
            return "Index out of bounds!!!";
        }
        return this.ArrayOfStrings[i];
    }

    @Override
    public String toString() {
        String arrayOfStringsOutput = "[";
        for (int i = 0; i < size; i++){
            if (Objects.isNull(this.ArrayOfStrings[i]) || (i == size - 1)) {
                arrayOfStringsOutput += "]";
                break;
            } else if ((i < size - 1) && Objects.isNull(this.ArrayOfStrings[i + 1])) {
                arrayOfStringsOutput += this.ArrayOfStrings[i];
            } else {
                arrayOfStringsOutput += this.ArrayOfStrings[i] + ", ";
            }
        }
        return arrayOfStringsOutput;
    }

    public int length(){
        int stringQuantityInArray = 0;
        for (int i = 0; i < size; i++){
            if (Objects.isNull(this.ArrayOfStrings[i])){
                break;
            } else {
                stringQuantityInArray++;
            }
        }
        return stringQuantityInArray;
    }


    public int maxLength(){
        return size;
    }

}
