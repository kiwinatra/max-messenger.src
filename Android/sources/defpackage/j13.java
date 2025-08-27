package defpackage;

import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: j13  reason: default package */
public final class j13 implements bq9 {
    public static final Logger a = Logger.getLogger(j13.class.getName());

    public final InputStream c(String str) {
        InputStream resourceAsStream = j13.class.getResourceAsStream(str);
        if (resourceAsStream == null) {
            Level level = Level.WARNING;
            a.log(level, "File " + str + " not found");
        }
        return resourceAsStream;
    }
}
