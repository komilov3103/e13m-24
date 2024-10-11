package ru.mpei.l3;

public class MyOptional<T> {

    private T object;

    private MyOptional(T object){
        this.object = object;
    }

    public boolean isEmpty(){
        return this.object != null;
    }

    public T get() {
        return object;
    }

    public static <T> MyOptional<T> of(T t){
        return new MyOptional<T>(t);
    }

}
