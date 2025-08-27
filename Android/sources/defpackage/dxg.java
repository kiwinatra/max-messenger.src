package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.internal.a;

/* renamed from: dxg  reason: default package */
public abstract class dxg {
    public Object a;
    public boolean b = false;
    public final /* synthetic */ a c;
    public final int d;
    public final Bundle e;
    public final /* synthetic */ a f;

    public dxg(a aVar, int i, Bundle bundle) {
        this.f = aVar;
        Boolean bool = Boolean.TRUE;
        this.c = aVar;
        this.a = bool;
        this.d = i;
        this.e = bundle;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ void a() {
        /*
            r4 = this;
            r0 = 1
            com.google.android.gms.common.internal.a r1 = r4.f
            r2 = 0
            int r3 = r4.d
            if (r3 != 0) goto L_0x001c
            boolean r3 = r4.c()
            if (r3 != 0) goto L_0x001b
            r1.v(r0, r2)
            bi3 r0 = new bi3
            r1 = 8
            r0.<init>(r1, r2)
            r4.b(r0)
        L_0x001b:
            return
        L_0x001c:
            r1.v(r0, r2)
            android.os.Bundle r0 = r4.e
            if (r0 == 0) goto L_0x002c
            java.lang.String r1 = "pendingIntent"
            android.os.Parcelable r0 = r0.getParcelable(r1)
            r2 = r0
            android.app.PendingIntent r2 = (android.app.PendingIntent) r2
        L_0x002c:
            bi3 r0 = new bi3
            r0.<init>(r3, r2)
            r4.b(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dxg.a():void");
    }

    public abstract void b(bi3 bi3);

    public abstract boolean c();

    public final void d() {
        synchronized (this) {
            this.a = null;
        }
        synchronized (this.c.Y) {
            this.c.Y.remove(this);
        }
    }
}
