package com.exception;

public class CheckedException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public Exception() {
    }

    public CheckedException(String var1) {
        super(var1);
    }

    public CheckedException(Throwable var1) {
        super(var1);
    }

    public CheckedException(String var1, Throwable var2) {
        super(var1, var2);
    }

    public CheckedException(String var1, Throwable var2, boolean var3, boolean var4) {
        super(var1, var2, var3, var4);
    }

}
