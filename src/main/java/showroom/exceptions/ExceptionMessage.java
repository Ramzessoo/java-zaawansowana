package showroom.exceptions;

import lombok.Getter;

@Getter

public enum ExceptionMessage {

    OBJECT_CANT_BE_NUUL("E-000001", "Obiekt nie może mieć wartości null");

    private final String code;
    private final String message;

    ExceptionMessage(String code, String message) {
        this.code = code;
        this.message = message;
    }

}
