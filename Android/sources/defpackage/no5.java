package defpackage;

import kotlin.reflect.KProperty;

/* renamed from: no5  reason: default package */
public final class no5 implements o5g, zi6, it1 {
    public long a;
    public Object b;
    public Object c;

    public /* synthetic */ no5(long j, Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
        this.a = j;
    }

    public ft1 C() {
        it1 it1 = (it1) this.b;
        return it1 != null ? it1.C() : ft1.a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(kotlin.coroutines.Continuation r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.lo5
            if (r0 == 0) goto L_0x0013
            r0 = r9
            lo5 r0 = (defpackage.lo5) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.c = r1
            goto L_0x0018
        L_0x0013:
            lo5 r0 = new lo5
            r0.<init>(r8, r9)
        L_0x0018:
            java.lang.Object r9 = r0.a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x0069
        L_0x0029:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0031:
            kotlin.ResultKt.throwOnFailure(r9)
            java.lang.Object r9 = r8.c
            java.lang.String r9 = (java.lang.String) r9
            a67 r2 = defpackage.z68.b
            if (r2 != 0) goto L_0x003d
            goto L_0x0051
        L_0x003d:
            boolean r4 = r2.c()
            if (r4 == 0) goto L_0x0051
            w78 r4 = defpackage.w78.o
            long r5 = r8.a
            java.lang.String r7 = "Fetch video. File fetcher, fileId "
            java.lang.String r5 = defpackage.wj6.i(r5, r7)
            r6 = 0
            r2.d(r4, r9, r5, r6)
        L_0x0051:
            java.lang.Object r9 = r8.b
            rl r9 = (defpackage.rl) r9
            np2 r2 = new np2
            long r4 = r8.a
            r8 = 15
            r2.<init>((long) r4, (int) r8)
            r0.c = r3
            jna r9 = (defpackage.jna) r9
            java.lang.Object r9 = r9.T(r2, r0)
            if (r9 != r1) goto L_0x0069
            return r1
        L_0x0069:
            am5 r9 = (defpackage.am5) r9
            ik5 r8 = new ik5
            p5g r0 = defpackage.p5g.MP4
            java.lang.String r9 = r9.c
            r8.<init>(r0, r9)
            kk5 r9 = new kk5
            java.util.List r8 = kotlin.collections.CollectionsKt.listOf(r8)
            r9.<init>(r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.no5.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public Object apply(Object obj) {
        a32 a32 = (a32) obj;
        qfa qfa = (qfa) this.b;
        qfa.getClass();
        KProperty kProperty = qfa.y[3];
        long s = ((qjd) ((x23) qfa.o.get())).s();
        if (s == -1) {
            return lbe.g(new IllegalStateException("logged out"));
        }
        a32 a322 = (a32) this.c;
        long o = a322.o();
        long j = this.a;
        boolean z = false;
        if (o < j) {
            z68.c(qfa.z, "changeSelfReadMarkInChatsCache: chatId=" + a322.a + ", mark=" + j, new Object[0]);
            qfa.c().z0(a322.a, s, j, (Integer) null, false);
            if (o != a322.o()) {
                z = true;
            }
        }
        return qfa.b(a322.b.a, this.a).i(new qr0((Object) a322, z));
    }

    public a9f d() {
        return (a9f) this.c;
    }

    public long getTimestamp() {
        it1 it1 = (it1) this.b;
        if (it1 != null) {
            return it1.getTimestamp();
        }
        long j = this.a;
        if (j != -1) {
            return j;
        }
        throw new IllegalStateException("No timestamp is available.");
    }

    public gt1 l() {
        it1 it1 = (it1) this.b;
        return it1 != null ? it1.l() : gt1.a;
    }

    public int n() {
        it1 it1 = (it1) this.b;
        if (it1 != null) {
            return it1.n();
        }
        return 1;
    }

    public et1 x() {
        it1 it1 = (it1) this.b;
        return it1 != null ? it1.x() : et1.a;
    }

    public no5() {
        this.b = new u05(this);
        this.c = new u05(this);
    }
}
