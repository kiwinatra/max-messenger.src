package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.GestureDetector;
import java.util.HashMap;

/* renamed from: m0a  reason: default package */
public final class m0a extends w1 {
    public final qr4 b;
    public final qr4 c;
    public final GestureDetector o;
    public final Handler v = new Handler(Looper.getMainLooper());
    public final Rect w = new Rect();
    public r2a x;
    public final nd y;
    public x2a z;

    public m0a(s2a s2a, r2a r2a, Context context, nd ndVar) {
        super(s2a);
        this.x = r2a;
        this.y = ndVar;
        qr4 qr4 = new qr4(context);
        this.b = qr4;
        qr4 qr42 = new qr4(context);
        this.c = qr42;
        this.o = new GestureDetector(context, new q00(18, this));
        qr4.a = new er7(28, (Object) this);
        qr42.a = new wie(29, (Object) this);
        s2a.Z(this.x);
        s2a.R(this);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [n70, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0032, code lost:
        r4 = r1.C0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void W(defpackage.m0a r8, boolean r9, int r10) {
        /*
            x2a r0 = r8.z
            if (r0 != 0) goto L_0x0006
            goto L_0x0092
        L_0x0006:
            android.os.Handler r0 = r8.v
            r1 = 0
            r0.removeCallbacksAndMessages(r1)
            r2a r1 = r8.x
            n70 r2 = new n70
            r2.<init>()
            int r1 = r1.a
            r2.a = r10
            r2.b = r9
            r1 = 1
            r2.c = r1
            r2a r1 = new r2a
            r1.<init>((defpackage.n70) r2)
            r8.x = r1
            f2a r2 = r8.a
            s2a r2 = (defpackage.s2a) r2
            r2.Z(r1)
            x2a r1 = r8.z
            r2 = 0
            if (r1 != 0) goto L_0x0032
        L_0x0030:
            r4 = r2
            goto L_0x0039
        L_0x0032:
            r7g r4 = r1.C0
            if (r4 != 0) goto L_0x0037
            goto L_0x0030
        L_0x0037:
            long r4 = r4.k
        L_0x0039:
            r6 = 10000(0x2710, double:4.9407E-320)
            if (r9 == 0) goto L_0x003f
            long r4 = r4 + r6
            goto L_0x0040
        L_0x003f:
            long r4 = r4 - r6
        L_0x0040:
            if (r1 != 0) goto L_0x0044
        L_0x0042:
            r6 = r2
            goto L_0x004b
        L_0x0044:
            r7g r1 = r1.C0
            if (r1 != 0) goto L_0x0049
            goto L_0x0042
        L_0x0049:
            long r6 = r1.j
        L_0x004b:
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 <= 0) goto L_0x0056
            r8.Y(r10, r9)
            r8.X()
            r4 = r6
        L_0x0056:
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x0061
            r8.Y(r10, r9)
            r8.X()
            goto L_0x0062
        L_0x0061:
            r2 = r4
        L_0x0062:
            x2a r1 = r8.z
            if (r1 == 0) goto L_0x007e
            java.lang.Object r1 = r1.a
            java.util.Set r1 = (java.util.Set) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x006e:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x007e
            java.lang.Object r4 = r1.next()
            n4a r4 = (defpackage.n4a) r4
            r4.z(r2)
            goto L_0x006e
        L_0x007e:
            mk8 r1 = new mk8
            r2 = 1
            r1.<init>(r8, r9, r10, r2)
            r9 = 600(0x258, double:2.964E-321)
            r0.postDelayed(r1, r9)
            o99 r1 = new o99
            r2 = 7
            r1.<init>(r2, r8)
            r0.postDelayed(r1, r9)
        L_0x0092:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m0a.W(m0a, boolean, int):void");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [n70, java.lang.Object] */
    public final void X() {
        r2a r2a = this.x;
        ? obj = new Object();
        obj.a = r2a.a;
        obj.b = r2a.b;
        obj.c = r2a.c;
        obj.a = 0;
        obj.c = false;
        r2a r2a2 = new r2a((n70) obj);
        this.x = r2a2;
        ((s2a) this.a).Z(r2a2);
        this.b.c = 0;
        this.c.c = 0;
    }

    public final void Y(int i, boolean z2) {
        HashMap hashMap = new HashMap();
        hashMap.put("forward", Boolean.valueOf(z2));
        hashMap.put("seconds", Integer.valueOf(i));
        this.y.g("SEEK_BY_DOUBLE_TAP", hashMap);
    }
}
