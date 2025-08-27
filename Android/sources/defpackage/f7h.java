package defpackage;

import android.content.Context;
import java.io.File;

/* renamed from: f7h  reason: default package */
public final class f7h {
    public final Context a;

    public f7h(Context context) {
        this.a = context;
    }

    public static long a(File file) {
        if (!file.isDirectory()) {
            return file.length();
        }
        File[] listFiles = file.listFiles();
        long j = 0;
        if (listFiles != null) {
            for (File a2 : listFiles) {
                j += a(a2);
            }
        }
        return j;
    }
}
