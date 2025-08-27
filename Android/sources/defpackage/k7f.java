package defpackage;

import android.os.Handler;
import java.util.ArrayList;

/* renamed from: k7f  reason: default package */
public final class k7f implements iw6 {
    public static final ArrayList b = new ArrayList(50);
    public final Handler a;

    public k7f(Handler handler) {
        this.a = handler;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: i7f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: i7f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: i7f} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.i7f c() {
        /*
            java.util.ArrayList r0 = b
            monitor-enter(r0)
            boolean r1 = r0.isEmpty()     // Catch:{ all -> 0x000f }
            if (r1 == 0) goto L_0x0011
            i7f r1 = new i7f     // Catch:{ all -> 0x000f }
            r1.<init>()     // Catch:{ all -> 0x000f }
            goto L_0x001d
        L_0x000f:
            r1 = move-exception
            goto L_0x001f
        L_0x0011:
            int r1 = r0.size()     // Catch:{ all -> 0x000f }
            int r1 = r1 + -1
            java.lang.Object r1 = r0.remove(r1)     // Catch:{ all -> 0x000f }
            i7f r1 = (defpackage.i7f) r1     // Catch:{ all -> 0x000f }
        L_0x001d:
            monitor-exit(r0)     // Catch:{ all -> 0x000f }
            return r1
        L_0x001f:
            monitor-exit(r0)     // Catch:{ all -> 0x000f }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k7f.c():i7f");
    }

    public final i7f a(int i, Object obj) {
        i7f c = c();
        c.a = this.a.obtainMessage(i, obj);
        return c;
    }

    public final i7f b(Object obj, int i, int i2, int i3) {
        i7f c = c();
        c.a = this.a.obtainMessage(i, i2, i3, obj);
        return c;
    }

    public final boolean d(Runnable runnable) {
        return this.a.post(runnable);
    }

    public final void e(int i) {
        n79.g(i != 0);
        this.a.removeMessages(i);
    }

    public final boolean f(int i) {
        return this.a.sendEmptyMessage(i);
    }

    public final boolean g() {
        return this.a.sendEmptyMessageDelayed(3, (long) 10);
    }
}
