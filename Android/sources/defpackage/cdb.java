package defpackage;

import android.content.Context;

/* renamed from: cdb  reason: default package */
public final class cdb implements ome {
    public final Context a;
    public final String[] b;
    public final xme c;

    public cdb(Context context, String[] strArr) {
        this.a = context;
        this.b = strArr;
        this.c = f6e.a(n54.e(context, strArr) ? ycb.a : ycb.b);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e(defpackage.ds5 r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.adb
            if (r0 == 0) goto L_0x0013
            r0 = r6
            adb r0 = (defpackage.adb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.c = r1
            goto L_0x0018
        L_0x0013:
            adb r0 = new adb
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
            goto L_0x003f
        L_0x0031:
            kotlin.ResultKt.throwOnFailure(r6)
            r0.c = r3
            xme r4 = r4.c
            java.lang.Object r4 = r4.e(r5, r0)
            if (r4 != r1) goto L_0x003f
            return r1
        L_0x003f:
            kotlin.KotlinNothingValueException r4 = new kotlin.KotlinNothingValueException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdb.e(ds5, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object getValue() {
        return (ycb) this.c.getValue();
    }
}
