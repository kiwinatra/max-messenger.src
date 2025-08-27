package defpackage;

import android.content.Context;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: tb5  reason: default package */
public final /* synthetic */ class tb5 implements s2f {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ tb5(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [java.lang.Object, bk3] */
    public final Object get() {
        vc4 vc4;
        wc4 wc4;
        switch (this.a) {
            case 0:
                return new yh4(this.b);
            case 1:
                return new fh4(this.b, new jf4());
            case 2:
                new HashMap();
                this.b.getApplicationContext();
                Object obj = new Object();
                new HashMap();
                new HashSet();
                new HashMap();
                return obj;
            case 3:
                return new rj4(this.b, new Object());
            case 4:
                return new fh4(this.b, new jf4());
            case 5:
                return new sj4(this.b);
            case 6:
                Context context = this.b;
                k0d k0d = vc4.n;
                synchronized (vc4.class) {
                    try {
                        if (vc4.t == null) {
                            gy gyVar = new gy(context, 2);
                            boolean z = gyVar.b;
                            vc4.t = new vc4((Context) gyVar.o, (HashMap) gyVar.v, gyVar.c, (b7f) gyVar.w, z);
                        }
                        vc4 = vc4.t;
                    } catch (Throwable th) {
                        while (true) {
                            throw th;
                            break;
                        }
                    }
                }
                return vc4;
            default:
                Context context2 = this.b;
                k0d k0d2 = wc4.n;
                synchronized (wc4.class) {
                    try {
                        if (wc4.t == null) {
                            gy gyVar2 = new gy(context2, 3);
                            boolean z2 = gyVar2.b;
                            wc4.t = new wc4((Context) gyVar2.o, (HashMap) gyVar2.v, gyVar2.c, (c7f) gyVar2.w, z2);
                        }
                        wc4 = wc4.t;
                    } catch (Throwable th2) {
                        while (true) {
                            throw th2;
                            break;
                        }
                    }
                }
                return wc4;
        }
    }
}
