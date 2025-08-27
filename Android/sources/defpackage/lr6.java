package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Lazy;

/* renamed from: lr6  reason: default package */
public final class lr6 {
    public static final long[] g = new long[0];
    public final Lazy a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;
    public final Lazy e;
    public final Lazy f;

    public lr6(Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4, Lazy lazy5, Lazy lazy6) {
        this.a = lazy;
        this.b = lazy2;
        this.c = lazy3;
        this.d = lazy4;
        this.e = lazy5;
        this.f = lazy6;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0090 A[Catch:{ all -> 0x0082 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0091 A[Catch:{ all -> 0x0082 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(long r17, defpackage.ij2 r19, long r20, java.lang.String r22, kotlin.coroutines.Continuation r23) {
        /*
            r16 = this;
            r0 = r16
            r1 = r23
            boolean r2 = r1 instanceof defpackage.kr6
            if (r2 == 0) goto L_0x0017
            r2 = r1
            kr6 r2 = (defpackage.kr6) r2
            int r3 = r2.o
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.o = r3
            goto L_0x001c
        L_0x0017:
            kr6 r2 = new kr6
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.b
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r2.o
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L_0x003d
            if (r4 != r6) goto L_0x0035
            lr6 r0 = r2.a
            kotlin.ResultKt.throwOnFailure(r1)     // Catch:{ all -> 0x0033 }
        L_0x002f:
            r15 = r1
            r1 = r0
            r0 = r15
            goto L_0x007c
        L_0x0033:
            r1 = r0
            goto L_0x0084
        L_0x0035:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x003d:
            kotlin.ResultKt.throwOnFailure(r1)
            yt r1 = new yt
            r4 = r19
            java.lang.String r10 = r4.a
            kotlin.Lazy r4 = r0.b
            java.lang.Object r4 = r4.getValue()
            bud r4 = (defpackage.bud) r4
            akd r4 = (defpackage.akd) r4
            r4.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r7 = ru.ok.tamtam.android.prefs.PmsKey.f71maxreadmarks
            r8 = 300(0x12c, float:4.2E-43)
            long r8 = (long) r8
            long r7 = r4.r(r7, r8)
            int r13 = (int) r7
            r7 = r1
            r8 = r17
            r11 = r20
            r14 = r22
            r7.<init>((long) r8, (java.lang.String) r10, (long) r11, (int) r13, (java.lang.String) r14)
            kotlin.Lazy r4 = r0.a     // Catch:{ all -> 0x0033 }
            java.lang.Object r4 = r4.getValue()     // Catch:{ all -> 0x0033 }
            rl r4 = (defpackage.rl) r4     // Catch:{ all -> 0x0033 }
            r2.a = r0     // Catch:{ all -> 0x0033 }
            r2.o = r6     // Catch:{ all -> 0x0033 }
            jna r4 = (defpackage.jna) r4     // Catch:{ all -> 0x0033 }
            java.lang.Object r1 = r4.T(r1, r2)     // Catch:{ all -> 0x0033 }
            if (r1 != r3) goto L_0x002f
            return r3
        L_0x007c:
            jj2 r0 = (defpackage.jj2) r0     // Catch:{ all -> 0x0084 }
            r1.b(r0)     // Catch:{ all -> 0x0082 }
            return r0
        L_0x0082:
            r0 = move-exception
            goto L_0x009f
        L_0x0084:
            java.lang.Class r0 = r1.getClass()     // Catch:{ all -> 0x0082 }
            java.lang.String r0 = r0.getName()     // Catch:{ all -> 0x0082 }
            a67 r2 = defpackage.z68.b     // Catch:{ all -> 0x0082 }
            if (r2 != 0) goto L_0x0091
            goto L_0x009e
        L_0x0091:
            boolean r3 = r2.c()     // Catch:{ all -> 0x0082 }
            if (r3 == 0) goto L_0x009e
            w78 r3 = defpackage.w78.x     // Catch:{ all -> 0x0082 }
            java.lang.String r4 = "fail to get chat members"
            r2.d(r3, r0, r4, r5)     // Catch:{ all -> 0x0082 }
        L_0x009e:
            return r5
        L_0x009f:
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "fail"
            defpackage.z68.f(r1, r2, r0)
            boolean r1 = r0 instanceof java.util.concurrent.CancellationException
            if (r1 != 0) goto L_0x00b1
            return r5
        L_0x00b1:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lr6.a(long, ij2, long, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void b(jj2 jj2) {
        if (!jj2.c.isEmpty()) {
            ArrayList arrayList = new ArrayList(jj2.c.size());
            ws wsVar = new ws(jj2.c.size());
            Iterator it = jj2.c.iterator();
            while (it.hasNext()) {
                bj2 bj2 = (bj2) it.next();
                arrayList.add(bj2.a);
                fo3 fo3 = bj2.a;
                wsVar.add(Long.valueOf(fo3.a));
                ((rtb) this.d.getValue()).e().h(fo3.a, qe8.l(bj2.b));
            }
            if (!arrayList.isEmpty()) {
                ((km3) this.c.getValue()).B(arrayList, g);
            }
            if (!wsVar.isEmpty()) {
                ((oj7) this.e.getValue()).a(wsVar);
            }
            ((sv0) this.f.getValue()).c(new zu3(0, wsVar));
        }
    }
}
