package defpackage;

import android.content.Context;
import android.content.Intent;
import java.util.List;

/* renamed from: it4  reason: default package */
public final class it4 implements ct4 {
    public final Context a;
    public final et4 b;
    public final boolean c;
    public final Class d;
    public jt4 e;

    public it4(Context context, et4 et4, boolean z, Class cls) {
        this.a = context;
        this.b = et4;
        this.c = z;
        this.d = cls;
        et4.e.add(this);
    }

    public final void a(et4 et4) {
        jt4 jt4 = this.e;
        if (jt4 != null) {
            jt4.a(jt4, et4.l);
        }
    }

    public final void b() {
        boolean z = this.b.k;
    }

    public final void c() {
        jt4 jt4 = this.e;
        if (jt4 != null) {
            jt4.c();
        }
    }

    public final void d(et4 et4, boolean z) {
        if (!z && !et4.i) {
            jt4 jt4 = this.e;
            if (jt4 == null || jt4.y) {
                List list = et4.l;
                for (int i = 0; i < list.size(); i++) {
                    if (((rr4) list.get(i)).b == 0) {
                        g();
                        return;
                    }
                }
            }
        }
    }

    public final void e(rr4 rr4, Exception exc) {
        jt4 jt4 = this.e;
        if (jt4 != null) {
            jt4.getClass();
        }
        jt4 jt42 = this.e;
        if ((jt42 == null || jt42.y) && jt4.b(rr4.b)) {
            i8b.V("DownloadService wasn't running. Restarting.");
            g();
        }
    }

    public final void f(et4 et4, rr4 rr4) {
        jt4 jt4 = this.e;
        if (jt4 != null) {
            jt4.getClass();
        }
    }

    public final void g() {
        boolean z = this.c;
        Class cls = this.d;
        Context context = this.a;
        if (z) {
            try {
                Intent action = new Intent(context, cls).setAction("androidx.media3.exoplayer.downloadService.action.RESTART");
                if (v0g.a >= 26) {
                    context.startForegroundService(action);
                } else {
                    context.startService(action);
                }
            } catch (IllegalStateException unused) {
                i8b.V("Failed to restart (foreground launch restriction)");
            }
        } else {
            try {
                context.startService(new Intent(context, cls).setAction("androidx.media3.exoplayer.downloadService.action.INIT"));
            } catch (IllegalStateException unused2) {
                i8b.V("Failed to restart (process is idle)");
            }
        }
    }
}
