package ru.mpei.l6.HomeWork;

import ru.mpei.l6.HomeWork.exceptions.DataException;
import ru.mpei.l6.HomeWork.exceptions.EmptyDataException;
import ru.mpei.l6.HomeWork.exceptions.UnknownCharacterException;

import java.nio.charset.CharacterCodingException;

public class StringDataValidator implements Validator {

    public boolean validate(String first, String second) {
        if (isNull(first, second) || isEmpty(first, second)) {
            throw new EmptyDataException("String is empty or is null");
        } else if (!containOnlyEnglish(first, second)) {
            throw new UnknownCharacterException("Unknown character");
        }
        return first.equals(second);
    }

    @Override
    public boolean isNull(String first, String second) {
        return first == null || second == null;
    }

    @Override
    public boolean isEmpty(String first, String second) {
        return first.isEmpty() || second.isEmpty();
    }

    @Override
    public boolean containOnlyEnglish(String first, String second) {
        return first.matches("[a-zA-Z0-9]*") && second.matches("[a-zA-Z0-9]*");

//    public boolean containOnlyEnglish(String first, String second) {
//        boolean result = true;
//        for (char c : first.toCharArray()) {
//            if (c < 48 || (c > 57 && c < 65) || c > 90) {
//                result = false;
//                break;
//            }
//        }
//        for (char c : second.toCharArray()) {
//            if (c < 48 || (c > 57 && c < 65) || c > 90) {
//                result = false;
//                break;
//            }
//        }
//        return result;
//    }
    }
}
