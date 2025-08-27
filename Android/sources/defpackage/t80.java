package defpackage;

import kotlin.Lazy;

/* renamed from: t80  reason: default package */
public final class t80 {
    public final Lazy a;
    public final Lazy b;

    public t80(Lazy lazy, Lazy lazy2) {
        this.a = lazy;
        this.b = lazy2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.String r7, java.lang.String r8, kotlin.coroutines.Continuation r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.s80
            if (r0 == 0) goto L_0x0013
            r0 = r9
            s80 r0 = (defpackage.s80) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.o = r1
            goto L_0x0018
        L_0x0013:
            s80 r0 = new s80
            r0.<init>(r6, r9)
        L_0x0018:
            java.lang.Object r9 = r0.b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.o
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            t80 r6 = r0.a
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x008b
        L_0x002b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0033:
            kotlin.ResultKt.throwOnFailure(r9)
            kotlin.Lazy r9 = r6.b
            java.lang.Object r9 = r9.getValue()
            coa r9 = (defpackage.coa) r9
            r0.a = r6
            r0.o = r3
            r9.getClass()
            k80[] r2 = defpackage.k80.a
            kotlin.Lazy r9 = r9.a
            java.lang.Object r9 = r9.getValue()
            ocf r9 = (defpackage.ocf) r9
            i80 r2 = new i80
            x3b r4 = defpackage.x3b.AUTH
            r2.<init>((defpackage.x3b) r4)
            r4 = 0
            if (r8 == 0) goto L_0x0062
            int r5 = r8.length()
            if (r5 != 0) goto L_0x0060
            goto L_0x0062
        L_0x0060:
            r5 = r4
            goto L_0x0063
        L_0x0062:
            r5 = r3
        L_0x0063:
            r5 = r5 ^ r3
            if (r5 == 0) goto L_0x00a7
            java.lang.String r5 = "token"
            r2.t(r5, r8)
            if (r7 == 0) goto L_0x0073
            int r8 = r7.length()
            if (r8 != 0) goto L_0x0074
        L_0x0073:
            r4 = r3
        L_0x0074:
            r8 = r4 ^ 1
            if (r8 == 0) goto L_0x009b
            java.lang.String r8 = "verifyCode"
            r2.t(r8, r7)
            java.lang.String r7 = "authTokenType"
            java.lang.String r8 = "CHECK_CODE"
            r2.t(r7, r8)
            java.lang.Object r9 = r9.e(r2, r0)
            if (r9 != r1) goto L_0x008b
            return r1
        L_0x008b:
            j80 r9 = (defpackage.j80) r9
            kotlin.Lazy r6 = r6.a
            java.lang.Object r6 = r6.getValue()
            nd r6 = (defpackage.nd) r6
            java.lang.String r7 = "CONFIRM_PHONE_SUCCESS"
            r6.e(r7)
            return r9
        L_0x009b:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "AuthCmd param 'verifyCode' can't be null when param 'authTokenType' is 'PHONE' or 'PHONE_CONFIRM'"
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L_0x00a7:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "AuthCmd param 'token' can't be null"
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t80.a(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
