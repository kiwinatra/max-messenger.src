package defpackage;

import java.util.Map;

/* renamed from: wj  reason: default package */
public final class wj extends ej0 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ qa7 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public wj(s97 s97, r97 r97, qa7 qa7) {
        this.d = s97;
        this.c = r97;
        this.b = qa7;
    }

    private final void g(i0 i0Var) {
    }

    public final void e(i0 i0Var) {
        switch (this.a) {
            case 0:
                return;
            default:
                ((s97) this.d).b((r97) this.c);
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        r0 = defpackage.fk.f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f5, code lost:
        defpackage.a43.b(r7);
        defpackage.y33.U(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00fb, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00f1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(defpackage.i0 r7) {
        /*
            r6 = this;
            r0 = 0
            qa7 r1 = r6.b
            java.lang.String r2 = "webp"
            java.lang.Object r3 = r6.d
            java.lang.Object r4 = r6.c
            int r6 = r6.a
            switch(r6) {
                case 0: goto L_0x0097;
                default: goto L_0x000e;
            }
        L_0x000e:
            boolean r6 = r7.h()
            if (r6 != 0) goto L_0x0016
            goto L_0x008f
        L_0x0016:
            java.lang.Object r6 = r7.e()
            y33 r6 = (defpackage.y33) r6
            r97 r4 = (defpackage.r97) r4
            s97 r3 = (defpackage.s97) r3
            if (r6 != 0) goto L_0x0026
            r3.b(r4)
            goto L_0x008f
        L_0x0026:
            sqb r7 = new sqb
            java.lang.Object r5 = r6.e0()
            e69 r5 = (defpackage.e69) r5
            r7.<init>(r5)
            kotlin.Lazy r5 = defpackage.i97.d     // Catch:{ Exception -> 0x005c }
            h97 r5 = defpackage.ld8.K(r7)     // Catch:{ Exception -> 0x005c }
            java.lang.String r5 = r5.b
            boolean r2 = r2.equalsIgnoreCase(r5)     // Catch:{ Exception -> 0x005c }
            if (r2 == 0) goto L_0x005e
            kotlin.Lazy r2 = r3.a     // Catch:{ Exception -> 0x005c }
            java.lang.Object r2 = r2.getValue()     // Catch:{ Exception -> 0x005c }
            ln5 r2 = (defpackage.ln5) r2     // Catch:{ Exception -> 0x005c }
            ba7 r5 = defpackage.ld9.B()     // Catch:{ Exception -> 0x005c }
            i0 r0 = r5.a(r1, r0)     // Catch:{ Exception -> 0x005c }
            q97 r1 = new q97     // Catch:{ Exception -> 0x005c }
            r1.<init>((defpackage.s97) r3, (defpackage.r97) r4, (defpackage.ln5) r2)     // Catch:{ Exception -> 0x005c }
            io1 r2 = defpackage.io1.a     // Catch:{ Exception -> 0x005c }
            r0.m(r1, r2)     // Catch:{ Exception -> 0x005c }
            goto L_0x007d
        L_0x005a:
            r0 = move-exception
            goto L_0x0090
        L_0x005c:
            r0 = move-exception
            goto L_0x0084
        L_0x005e:
            kotlin.Lazy r0 = r3.a     // Catch:{ Exception -> 0x005c }
            java.lang.Object r0 = r0.getValue()     // Catch:{ Exception -> 0x005c }
            ln5 r0 = (defpackage.ln5) r0     // Catch:{ Exception -> 0x005c }
            java.io.File r0 = r0.a(r5)     // Catch:{ Exception -> 0x005c }
            defpackage.j4b.R(r7, r0)     // Catch:{ Exception -> 0x005c }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ Exception -> 0x005c }
            if (r4 == 0) goto L_0x007d
            uo5 r1 = new uo5     // Catch:{ Exception -> 0x005c }
            r2 = 11
            r1.<init>((int) r2, (java.lang.Object) r4, (java.lang.Object) r0)     // Catch:{ Exception -> 0x005c }
            r3.c(r1)     // Catch:{ Exception -> 0x005c }
        L_0x007d:
            defpackage.a43.b(r7)
            defpackage.y33.U(r6)
            goto L_0x008f
        L_0x0084:
            java.lang.String r1 = "s97"
            java.lang.String r2 = "onNewResultImpl: failed to save image"
            defpackage.z68.f(r1, r2, r0)     // Catch:{ all -> 0x005a }
            r3.b(r4)     // Catch:{ all -> 0x005a }
            goto L_0x007d
        L_0x008f:
            return
        L_0x0090:
            defpackage.a43.b(r7)
            defpackage.y33.U(r6)
            throw r0
        L_0x0097:
            boolean r6 = r7.h()
            if (r6 != 0) goto L_0x009e
            goto L_0x00f4
        L_0x009e:
            java.lang.Object r6 = r7.e()
            y33 r6 = (defpackage.y33) r6
            if (r6 != 0) goto L_0x00a7
            goto L_0x00f4
        L_0x00a7:
            sqb r7 = new sqb
            java.lang.Object r5 = r6.e0()
            e69 r5 = (defpackage.e69) r5
            r7.<init>(r5)
            kotlin.Lazy r5 = defpackage.i97.d     // Catch:{ Exception -> 0x00f1 }
            h97 r5 = defpackage.ld8.K(r7)     // Catch:{ Exception -> 0x00f1 }
            java.lang.String r5 = r5.b     // Catch:{ Exception -> 0x00f1 }
            boolean r2 = kotlin.text.StringsKt__StringsJVMKt.equals(r2, r5, true)     // Catch:{ Exception -> 0x00f1 }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            fk r4 = (defpackage.fk) r4
            if (r2 == 0) goto L_0x00d9
            ba7 r2 = defpackage.ld9.B()     // Catch:{ Exception -> 0x00f1 }
            i0 r0 = r2.a(r1, r0)     // Catch:{ Exception -> 0x00f1 }
            vj r1 = new vj     // Catch:{ Exception -> 0x00f1 }
            r1.<init>(r4, r3)     // Catch:{ Exception -> 0x00f1 }
            io1 r2 = defpackage.io1.a     // Catch:{ Exception -> 0x00f1 }
            r0.m(r1, r2)     // Catch:{ Exception -> 0x00f1 }
            goto L_0x00ea
        L_0x00d7:
            r0 = move-exception
            goto L_0x00f5
        L_0x00d9:
            java.util.concurrent.ConcurrentHashMap r0 = r4.b     // Catch:{ Exception -> 0x00f1 }
            java.lang.Object r1 = r3.getValue()     // Catch:{ Exception -> 0x00f1 }
            m25 r1 = (defpackage.m25) r1     // Catch:{ Exception -> 0x00f1 }
            java.lang.String r1 = r1.a     // Catch:{ Exception -> 0x00f1 }
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeStream(r7)     // Catch:{ Exception -> 0x00f1 }
            r0.put(r1, r2)     // Catch:{ Exception -> 0x00f1 }
        L_0x00ea:
            defpackage.a43.b(r7)
            defpackage.y33.U(r6)
            goto L_0x00f4
        L_0x00f1:
            int r0 = defpackage.fk.f     // Catch:{ all -> 0x00d7 }
            goto L_0x00ea
        L_0x00f4:
            return
        L_0x00f5:
            defpackage.a43.b(r7)
            defpackage.y33.U(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wj.f(i0):void");
    }

    public wj(qa7 qa7, fk fkVar, Map.Entry entry) {
        this.b = qa7;
        this.c = fkVar;
        this.d = entry;
    }
}
