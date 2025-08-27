package ru.ok.tamtam.errors;

public class TamErrorException extends Exception {
    public final qaf a;

    public TamErrorException(qaf qaf) {
        super(qaf.b);
        this.a = qaf;
    }
}
