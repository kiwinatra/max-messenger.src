package defpackage;

import com.facebook.common.time.RealtimeSinceBootClock;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: xc4  reason: default package */
public final class xc4 implements tu4 {
    public final b8d a;
    public final ScheduledExecutorService b;
    public final ExecutorService c;
    public final ys9 d;
    public final ynb e;
    public final t14 f;
    public final r2f g;
    public final r2f h;
    public final r2f i;
    public final r2f j;
    public final r2f k;
    public final r2f l;

    public xc4(b8d b8d, dvf dvf, ysd ysd, RealtimeSinceBootClock realtimeSinceBootClock, ynb ynb, t14 t14, C0003if ifVar, C0003if ifVar2, m74 m74, m74 m742, m74 m743, m74 m744) {
        this.a = b8d;
        this.b = dvf;
        this.c = ysd;
        this.d = realtimeSinceBootClock;
        this.e = ynb;
        this.f = t14;
        this.g = ifVar;
        this.h = ifVar2;
        this.i = m74;
        this.k = m743;
        this.j = m742;
        this.l = m744;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: jq5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: lf6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: jq5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v8, resolved type: wef} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: jq5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: ni0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: wef} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: lf6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: lf6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: lf6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: ece} */
    /* JADX WARNING: type inference failed for: r15v6 */
    /* JADX WARNING: type inference failed for: r15v7, types: [eg, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.Drawable a(defpackage.v33 r15) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof defpackage.t33
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            t33 r15 = (defpackage.t33) r15
            monitor-enter(r15)
            m7f r0 = r15.o     // Catch:{ all -> 0x0148 }
            if (r0 != 0) goto L_0x000f
            r0 = r1
            goto L_0x0013
        L_0x000f:
            java.lang.Object r0 = r0.a     // Catch:{ all -> 0x0148 }
            com.facebook.animated.gif.GifImage r0 = (com.facebook.animated.gif.GifImage) r0     // Catch:{ all -> 0x0148 }
        L_0x0013:
            monitor-exit(r15)
            monitor-enter(r15)
            m7f r2 = r15.o     // Catch:{ all -> 0x0145 }
            monitor-exit(r15)
            r2.getClass()
            if (r0 == 0) goto L_0x0020
            android.graphics.Bitmap$Config r15 = r0.a
            goto L_0x0021
        L_0x0020:
            r15 = r1
        L_0x0021:
            java.lang.Object r0 = r2.a
            com.facebook.animated.gif.GifImage r0 = (com.facebook.animated.gif.GifImage) r0
            android.graphics.Rect r3 = new android.graphics.Rect
            int r4 = r0.k()
            int r0 = r0.h()
            r5 = 0
            r3.<init>(r5, r5, r4, r0)
            b8d r0 = r14.a
            ef r0 = r0.j(r2, r3)
            grg r3 = new grg
            r4 = 2
            r3.<init>(r4, r0)
            r2f r4 = r14.g
            java.lang.Object r4 = r4.get()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r6 = 1
            if (r4 == r6) goto L_0x007e
            r6 = 2
            if (r4 == r6) goto L_0x0068
            r5 = 3
            if (r4 == r5) goto L_0x005c
            ece r4 = new ece
            r5 = 15
            r4.<init>(r5)
            goto L_0x0093
        L_0x005c:
            ni0 r4 = new ni0
            r5 = 10
            r6 = 0
            r4.<init>((int) r5, (boolean) r6)
            r5 = -1
            r4.b = r5
            goto L_0x0093
        L_0x0068:
            lf6 r4 = new lf6
            eud r6 = new eud
            kg r7 = new kg
            int r8 = r2.hashCode()
            r7.<init>(r8, r5)
            t14 r8 = r14.f
            r6.<init>((defpackage.kg) r7, (defpackage.t14) r8)
            r4.<init>((defpackage.eud) r6, (boolean) r5)
            goto L_0x0093
        L_0x007e:
            lf6 r4 = new lf6
            eud r7 = new eud
            kg r8 = new kg
            int r9 = r2.hashCode()
            r8.<init>(r9, r5)
            t14 r5 = r14.f
            r7.<init>((defpackage.kg) r8, (defpackage.t14) r5)
            r4.<init>((defpackage.eud) r7, (boolean) r6)
        L_0x0093:
            pv0 r5 = new pv0
            r2f r12 = r14.i
            java.lang.Object r6 = r12.get()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            r5.<init>(r4, r0, r6)
            r2f r0 = r14.h
            java.lang.Object r0 = r0.get()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            ynb r6 = r14.e
            if (r0 <= 0) goto L_0x00c8
            jq5 r1 = new jq5
            r7 = 0
            r1.<init>(r0, r7)
            zc4 r0 = new zc4
            if (r15 == 0) goto L_0x00bf
            goto L_0x00c1
        L_0x00bf:
            android.graphics.Bitmap$Config r15 = android.graphics.Bitmap.Config.ARGB_8888
        L_0x00c1:
            java.util.concurrent.ExecutorService r7 = r14.c
            r0.<init>((defpackage.ynb) r6, (defpackage.pv0) r5, (android.graphics.Bitmap.Config) r15, (java.util.concurrent.ExecutorService) r7)
            r13 = r0
            goto L_0x00c9
        L_0x00c8:
            r13 = r1
        L_0x00c9:
            java.lang.Object r15 = r12.get()
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            if (r15 == 0) goto L_0x010c
            wef r15 = new wef
            ke6 r10 = new ke6
            r2f r0 = r14.k
            java.lang.Object r0 = r0.get()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r2f r1 = r14.l
            java.lang.Object r1 = r1.get()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r10.<init>(r6, r0, r1)
            r2f r0 = r14.j
            java.lang.Object r0 = r0.get()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r11 = r0.booleanValue()
            java.lang.Object r0 = r2.b
            r7 = r0
            java.lang.String r7 = (java.lang.String) r7
            r6 = r15
            r8 = r3
            r9 = r5
            r6.<init>(r7, r8, r9, r10, r11)
            goto L_0x010d
        L_0x010c:
            r15 = r1
        L_0x010d:
            xn0 r0 = new xn0
            java.lang.Object r1 = r12.get()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r11 = r1.booleanValue()
            ynb r7 = r14.e
            r6 = r0
            r8 = r4
            r9 = r3
            r10 = r5
            r12 = r15
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            eg r15 = new eg
            ys9 r1 = r14.d
            java.util.concurrent.ScheduledExecutorService r14 = r14.b
            r15.<init>()
            r15.c = r0
            r2 = 0
            r15.a = r2
            cf r2 = new cf
            r3 = 1
            r2.<init>(r3, r15)
            r15.x = r2
            r15.w = r0
            r15.o = r1
            r15.v = r14
            df r14 = new df
            r14.<init>(r15)
            return r14
        L_0x0145:
            r14 = move-exception
            monitor-exit(r15)     // Catch:{ all -> 0x0145 }
            throw r14
        L_0x0148:
            r14 = move-exception
            monitor-exit(r15)     // Catch:{ all -> 0x0148 }
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xc4.a(v33):android.graphics.drawable.Drawable");
    }

    public final boolean b(v33 v33) {
        return v33 instanceof t33;
    }
}
