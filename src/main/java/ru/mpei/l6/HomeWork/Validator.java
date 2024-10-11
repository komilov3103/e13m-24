package ru.mpei.l6.HomeWork;

public interface Validator {
    boolean isNull(String first, String second);
    boolean isEmpty(String first, String second);
    boolean containOnlyEnglish(String first, String second);

}
