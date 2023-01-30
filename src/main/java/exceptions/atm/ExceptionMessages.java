package exceptions.atm;

import lombok.Getter;

@Getter
public enum ExceptionMessages {
    NOT_ENOUGH_MONEY_IN_ATM("w bankomacie jest za mało pieniędzy, maksymalna kwota do wypłaty "),
    NOT_GET_MONEY_ANYMORE("przekroczono limit pojemności");

    private final String message;

    ExceptionMessages(String message) {
        this.message = message;
    }

}
