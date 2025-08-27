package defpackage;

import android.os.Looper;
import java.util.ArrayList;

/* renamed from: ng  reason: default package */
public final class ng {
    public static final ThreadLocal i = new ThreadLocal();
    public final qae a = new qae(0);
    public final ArrayList b = new ArrayList();
    public final y35 c = new y35(3, (Object) this);
    public final b d = new b(8, (Object) this);
    public final xe8 e;
    public boolean f = false;
    public float g = 1.0f;
    public fj h;

    public ng(xe8 xe8) {
        this.e = xe8;
    }

    public final boolean a() {
        xe8 xe8 = this.e;
        xe8.getClass();
        return Thread.currentThread() == ((Looper) xe8.c).getThread();
    }
}
