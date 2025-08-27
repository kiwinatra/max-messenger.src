package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;

/* renamed from: et4  reason: default package */
public final class et4 {
    public static final l3d n = new l3d(1);
    public final Context a;
    public final uqg b;
    public final bt4 c;
    public final rt3 d;
    public final CopyOnWriteArraySet e = new CopyOnWriteArraySet();
    public int f;
    public int g;
    public boolean h;
    public boolean i = true;
    public int j;
    public boolean k;
    public List l = Collections.emptyList();
    public sb0 m;

    public et4(Context context, u74 u74, bx0 bx0, g74 g74, ExecutorService executorService) {
        de4 de4 = new de4(u74);
        hx0 hx0 = new hx0();
        hx0.a = bx0;
        hx0.d = g74;
        ee4 ee4 = new ee4(hx0, executorService);
        this.a = context.getApplicationContext();
        this.b = de4;
        Handler p = v0g.p(new xp4(1, this));
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:DownloadManager");
        handlerThread.start();
        bt4 bt4 = new bt4(handlerThread, de4, ee4, p, this.i);
        this.c = bt4;
        rt3 rt3 = new rt3(18, (Object) this);
        this.d = rt3;
        sb0 sb0 = new sb0(context, rt3, n);
        this.m = sb0;
        int d2 = sb0.d();
        this.j = d2;
        this.f = 1;
        bt4.obtainMessage(1, d2, 0).sendToTarget();
    }

    public final void a() {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((ct4) it.next()).d(this, this.k);
        }
    }

    public final void b(sb0 sb0, int i2) {
        Object obj = sb0.d;
        if (this.j != i2) {
            this.j = i2;
            this.f++;
            this.c.obtainMessage(3, i2, 0).sendToTarget();
        }
        boolean d2 = d();
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((ct4) it.next()).b();
        }
        if (d2) {
            a();
        }
    }

    public final void c(boolean z) {
        if (this.i != z) {
            this.i = z;
            this.f++;
            this.c.obtainMessage(2, z ? 1 : 0, 0).sendToTarget();
            boolean d2 = d();
            Iterator it = this.e.iterator();
            while (it.hasNext()) {
                ((ct4) it.next()).getClass();
            }
            if (d2) {
                a();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean d() {
        /*
            r4 = this;
            boolean r0 = r4.i
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0024
            int r0 = r4.j
            if (r0 == 0) goto L_0x0024
            r0 = r2
        L_0x000b:
            java.util.List r3 = r4.l
            int r3 = r3.size()
            if (r0 >= r3) goto L_0x0024
            java.util.List r3 = r4.l
            java.lang.Object r3 = r3.get(r0)
            rr4 r3 = (defpackage.rr4) r3
            int r3 = r3.b
            if (r3 != 0) goto L_0x0021
            r0 = r1
            goto L_0x0025
        L_0x0021:
            int r0 = r0 + 1
            goto L_0x000b
        L_0x0024:
            r0 = r2
        L_0x0025:
            boolean r3 = r4.k
            if (r3 == r0) goto L_0x002a
            goto L_0x002b
        L_0x002a:
            r1 = r2
        L_0x002b:
            r4.k = r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.et4.d():boolean");
    }
}
