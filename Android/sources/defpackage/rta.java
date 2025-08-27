package defpackage;

import java.util.WeakHashMap;

/* renamed from: rta  reason: default package */
public final class rta {
    public final ome a;
    public final WeakHashMap b = new WeakHashMap();

    public rta(ome ome) {
        this.a = ome;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(android.content.Context r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.qta
            if (r0 == 0) goto L_0x0013
            r0 = r6
            qta r0 = (defpackage.qta) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.c = r1
            goto L_0x0018
        L_0x0013:
            qta r0 = new qta
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
            goto L_0x0055
        L_0x0031:
            kotlin.ResultKt.throwOnFailure(r6)
            android.content.Context r5 = r5.getApplicationContext()
            android.app.Application r5 = (android.app.Application) r5
            lj5 r6 = new lj5
            r2 = 1
            r6.<init>(r2, r4)
            r5.registerActivityLifecycleCallbacks(r6)
            bx r5 = new bx
            r6 = 10
            r5.<init>((int) r6, (java.lang.Object) r4)
            r0.c = r3
            ome r4 = r4.a
            java.lang.Object r4 = r4.e(r5, r0)
            if (r4 != r1) goto L_0x0055
            return r1
        L_0x0055:
            kotlin.KotlinNothingValueException r4 = new kotlin.KotlinNothingValueException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rta.a(android.content.Context, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
