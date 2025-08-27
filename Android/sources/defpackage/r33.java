package defpackage;

import android.util.CloseGuard;

/* renamed from: r33  reason: default package */
public final class r33 implements s33 {
    public final CloseGuard a = new CloseGuard();

    public final void a() {
        this.a.warnIfOpen();
    }

    public final void c(String str) {
        this.a.open(str);
    }

    public final void close() {
        this.a.close();
    }
}
