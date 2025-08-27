package defpackage;

import android.content.Context;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: rx6  reason: default package */
public final class rx6 {
    public static final rx6 a = new Object();
    public static final AtomicBoolean b = new AtomicBoolean(true);
    public static Context c;

    public static void a(File file) {
        if (file.exists()) {
            file.toString();
            file.delete();
        }
    }
}
