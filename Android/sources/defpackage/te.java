package defpackage;

import android.os.Process;

/* renamed from: te  reason: default package */
public final class te implements nif {
    public static final te a = new Object();
    public static final bz9 b;

    /* JADX WARNING: type inference failed for: r0v0, types: [te, java.lang.Object] */
    static {
        bz9 bz9 = new bz9(10);
        bz9.e(1, 10);
        bz9.e(2, 16);
        bz9.e(3, 13);
        bz9.e(4, 16);
        bz9.e(5, 0);
        bz9.e(6, -2);
        bz9.e(7, -4);
        bz9.e(8, -6);
        bz9.e(9, -5);
        bz9.e(10, -8);
        b = bz9;
    }

    public final void a(int i) {
        bz9 bz9 = b;
        int a2 = bz9.a(i);
        int i2 = a2 >= 0 ? bz9.c[a2] : -1;
        if (i2 != -1) {
            try {
                Process.setThreadPriority(i2);
            } catch (Throwable unused) {
            }
        }
    }
}
