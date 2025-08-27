package ru.ok.tamtam.util;

import java.util.Locale;

@Deprecated
public class HandledException extends Exception {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HandledException(Throwable th) {
        super(th == null ? "Empty throwable" : th.toString(), th);
    }

    public HandledException(String str, Object... objArr) {
        super(String.format(Locale.ENGLISH, str, objArr));
    }
}
