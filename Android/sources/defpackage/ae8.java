package defpackage;

import android.os.Looper;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: ae8  reason: default package */
public final class ae8 {
    public final Map a = Collections.synchronizedMap(new wi6(10, 0));
    public final Map b = Collections.synchronizedMap(new wi6(10, 0));
    public final Map c = Collections.synchronizedMap(new wi6(10, 0));
    public final Map d = Collections.synchronizedMap(new wi6(10, 0));
    public final ConcurrentHashMap e = new ConcurrentHashMap();
    public final abf f;
    public final v02 g;
    public final boolean h;

    public ae8(abf abf, v02 v02) {
        this.f = abf;
        this.g = v02;
        this.h = true;
    }

    public static void a() {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            throw new RuntimeException("This thread is main!");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: xd8} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.xd8 b(android.content.Context r10, defpackage.tf8 r11, boolean r12, boolean r13) {
        /*
            r9 = this;
            a()
            java.util.Map r0 = r9.a
            java.util.Map r1 = r9.c
            java.util.Map r2 = r9.b
            java.lang.String r3 = "Wrong marker weight"
            abf r4 = r9.f
            r5 = 1
            if (r12 == 0) goto L_0x0059
            r6 = 0
            if (r13 == 0) goto L_0x0037
            java.lang.Object r7 = r2.get(r11)
            xd8 r7 = (defpackage.xd8) r7
            int r8 = r11.ordinal()
            if (r8 == 0) goto L_0x002f
            if (r8 != r5) goto L_0x0029
            r4.getClass()
            int r3 = defpackage.abf.a(r5, r5)
            goto L_0x0079
        L_0x0029:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r3)
            throw r9
        L_0x002f:
            r4.getClass()
            int r3 = defpackage.abf.a(r6, r5)
            goto L_0x0079
        L_0x0037:
            java.lang.Object r7 = r1.get(r11)
            xd8 r7 = (defpackage.xd8) r7
            int r8 = r11.ordinal()
            if (r8 == 0) goto L_0x0053
            if (r8 != r5) goto L_0x004d
            r4.getClass()
            int r3 = defpackage.abf.a(r5, r6)
            goto L_0x0079
        L_0x004d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r3)
            throw r9
        L_0x0053:
            r4.getClass()
            int r3 = defpackage.nad.x0
            goto L_0x0079
        L_0x0059:
            java.lang.Object r6 = r0.get(r11)
            r7 = r6
            xd8 r7 = (defpackage.xd8) r7
            int r6 = r11.ordinal()
            if (r6 == 0) goto L_0x0074
            if (r6 != r5) goto L_0x006e
            r4.getClass()
            int r3 = defpackage.nad.y0
            goto L_0x0079
        L_0x006e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r3)
            throw r9
        L_0x0074:
            r4.getClass()
            int r3 = defpackage.nad.y0
        L_0x0079:
            if (r7 != 0) goto L_0x009f
            r4.b()
            android.graphics.Bitmap r10 = defpackage.o5a.i0(r3, r10)
            v02 r9 = r9.g
            r9.getClass()
            ao0 r9 = defpackage.v02.g(r10)
            xd8 r7 = new xd8
            r7.<init>(r10, r9)
            if (r12 == 0) goto L_0x009c
            if (r13 == 0) goto L_0x0098
            r2.put(r11, r7)
            goto L_0x009f
        L_0x0098:
            r1.put(r11, r7)
            goto L_0x009f
        L_0x009c:
            r0.put(r11, r7)
        L_0x009f:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ae8.b(android.content.Context, tf8, boolean, boolean):xd8");
    }
}
