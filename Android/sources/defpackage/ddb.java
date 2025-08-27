package defpackage;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;

/* renamed from: ddb  reason: default package */
public final class ddb implements ome {
    public final String[] a;
    public final Lazy b = fdb.a.c();
    public final Lazy c;
    public final tz9 o;

    public ddb(String[] strArr) {
        this.a = strArr;
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, new c28(28, this));
        this.c = lazy;
        tz9 tz9 = (tz9) lazy.getValue();
        this.o = (tz9) lazy.getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e(defpackage.ds5 r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.bdb
            if (r0 == 0) goto L_0x0013
            r0 = r6
            bdb r0 = (defpackage.bdb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.c = r1
            goto L_0x0018
        L_0x0013:
            bdb r0 = new bdb
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 == r3) goto L_0x002d
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x002d:
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x0045
        L_0x0031:
            kotlin.ResultKt.throwOnFailure(r6)
            kotlin.Lazy r4 = r4.c
            java.lang.Object r4 = r4.getValue()
            tz9 r4 = (defpackage.tz9) r4
            r0.c = r3
            java.lang.Object r4 = r4.e(r5, r0)
            if (r4 != r1) goto L_0x0045
            return r1
        L_0x0045:
            kotlin.KotlinNothingValueException r4 = new kotlin.KotlinNothingValueException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ddb.e(ds5, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object getValue() {
        return (zcb) this.o.getValue();
    }

    public final void h() {
        ((tz9) this.c.getValue()).setValue(((edb) this.b.getValue()).b(this.a) ? zcb.a : zcb.b);
    }

    public final boolean i() {
        return ((zcb) this.o.getValue()) == zcb.a;
    }
}
