package defpackage;

import java.util.regex.Pattern;

/* renamed from: q2g  reason: default package */
public abstract class q2g {
    static {
        Pattern.compile("[-_./;:]");
    }

    public static final void a() {
        throw new RuntimeException("Internal error: this code path should never get executed");
    }
}
