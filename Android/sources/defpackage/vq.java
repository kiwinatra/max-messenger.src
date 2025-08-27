package defpackage;

import android.content.Context;

/* renamed from: vq  reason: default package */
public final class vq implements sq {
    public final p3h b;

    public vq(Context context) {
        p3a p3a;
        synchronized (ryg.class) {
            try {
                if (ryg.b == null) {
                    Context applicationContext = context.getApplicationContext();
                    ryg.b = new p3a(new u13(applicationContext != null ? applicationContext : context));
                }
                p3a = ryg.b;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        this.b = (p3h) ((kxg) p3a.a).y();
    }
}
