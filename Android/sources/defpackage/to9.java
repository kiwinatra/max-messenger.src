package defpackage;

import java.util.Collection;
import kotlin.Lazy;
import kotlin.coroutines.Continuation;

/* renamed from: to9  reason: default package */
public final class to9 {
    public final z6d a;
    public final Lazy b;
    public final Lazy c;

    public to9(z6d z6d, Lazy lazy, Lazy lazy2) {
        this.a = z6d;
        this.b = lazy;
        this.c = lazy2;
    }

    public final Object a(long j, Continuation continuation) {
        z6d z6d = this.a;
        return ev0.I(((osa) z6d.c()).b(), new u6d(z6d, j, (Continuation) null), continuation);
    }

    public final Object b(Collection collection, Continuation continuation) {
        z6d z6d = this.a;
        return ev0.I(((osa) z6d.c()).b(), new v6d(z6d, collection, (Continuation) null), continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(long r18, long r20, long r22, boolean r24, int r25, defpackage.bl4 r26, kotlin.coroutines.Continuation r27) {
        /*
            r17 = this;
            r0 = r17
            r1 = r27
            boolean r2 = r1 instanceof defpackage.so9
            if (r2 == 0) goto L_0x0017
            r2 = r1
            so9 r2 = (defpackage.so9) r2
            int r3 = r2.o
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.o = r3
            goto L_0x001c
        L_0x0017:
            so9 r2 = new so9
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.b
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r2.o
            r5 = 1
            if (r4 == 0) goto L_0x0037
            if (r4 != r5) goto L_0x002f
            boolean r0 = r2.a
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x006c
        L_0x002f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0037:
            kotlin.ResultKt.throwOnFailure(r1)
            r1 = r24
            r2.a = r1
            r2.o = r5
            z6d r6 = r0.a
            gaf r0 = r6.c()
            osa r0 = (defpackage.osa) r0
            q04 r0 = r0.b()
            x6d r15 = new x6d
            r16 = 0
            r4 = r15
            r5 = r26
            r7 = r18
            r9 = r20
            r11 = r22
            r13 = r25
            r14 = r24
            r1 = r15
            r15 = r16
            r4.<init>(r5, r6, r7, r9, r11, r13, r14, r15)
            java.lang.Object r1 = defpackage.ev0.I(r0, r1, r2)
            if (r1 != r3) goto L_0x006a
            return r3
        L_0x006a:
            r0 = r24
        L_0x006c:
            r2 = r1
            java.util.List r2 = (java.util.List) r2
            if (r0 == 0) goto L_0x0076
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            kotlin.collections.CollectionsKt.reversed(r2)
        L_0x0076:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.to9.c(long, long, long, boolean, int, bl4, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
