package defpackage;

import kotlin.Lazy;

/* renamed from: n80  reason: default package */
public final class n80 {
    public final Lazy a;

    public n80(Lazy lazy) {
        this.a = lazy;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(defpackage.f0d r9, kotlin.coroutines.Continuation r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.m80
            if (r0 == 0) goto L_0x0013
            r0 = r10
            m80 r0 = (defpackage.m80) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.c = r1
            goto L_0x0018
        L_0x0013:
            m80 r0 = new m80
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x00b6
        L_0x002a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0032:
            kotlin.ResultKt.throwOnFailure(r10)
            kotlin.Lazy r8 = r8.a
            java.lang.Object r8 = r8.getValue()
            coa r8 = (defpackage.coa) r8
            java.lang.String r10 = r9.a
            java.lang.Long r2 = r9.v
            if (r2 == 0) goto L_0x0046
            he0 r4 = defpackage.he0.PRESET_AVATAR
            goto L_0x0047
        L_0x0046:
            r4 = 0
        L_0x0047:
            r0.c = r3
            r8.getClass()
            yt r5 = new yt
            x3b r6 = defpackage.x3b.AUTH_CONFIRM
            r7 = 7
            r5.<init>((defpackage.x3b) r6, (int) r7)
            r6 = 0
            if (r10 == 0) goto L_0x0060
            int r7 = r10.length()
            if (r7 != 0) goto L_0x005e
            goto L_0x0060
        L_0x005e:
            r7 = r6
            goto L_0x0061
        L_0x0060:
            r7 = r3
        L_0x0061:
            r7 = r7 ^ r3
            if (r7 == 0) goto L_0x00c5
            java.lang.String r7 = "token"
            r5.t(r7, r10)
            java.lang.String r10 = "tokenType"
            java.lang.String r7 = "REGISTER"
            r5.t(r10, r7)
            java.lang.String r10 = r9.c
            if (r10 == 0) goto L_0x007a
            int r7 = r10.length()
            if (r7 != 0) goto L_0x007b
        L_0x007a:
            r6 = r3
        L_0x007b:
            r3 = r3 ^ r6
            if (r3 == 0) goto L_0x00b9
            java.lang.String r3 = "firstName"
            r5.t(r3, r10)
            java.lang.String r9 = r9.o
            if (r9 == 0) goto L_0x0093
            int r10 = r9.length()
            if (r10 != 0) goto L_0x008e
            goto L_0x0093
        L_0x008e:
            java.lang.String r10 = "lastName"
            r5.t(r10, r9)
        L_0x0093:
            if (r2 == 0) goto L_0x009e
            long r9 = r2.longValue()
            java.lang.String r2 = "photoId"
            r5.p(r9, r2)
        L_0x009e:
            if (r4 == 0) goto L_0x00a7
            java.lang.String r9 = "avatarType"
            java.lang.String r10 = r4.a
            r5.t(r9, r10)
        L_0x00a7:
            kotlin.Lazy r8 = r8.a
            java.lang.Object r8 = r8.getValue()
            ocf r8 = (defpackage.ocf) r8
            java.lang.Object r10 = r8.e(r5, r0)
            if (r10 != r1) goto L_0x00b6
            return r1
        L_0x00b6:
            l80 r10 = (defpackage.l80) r10
            return r10
        L_0x00b9:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "AuthConfirmCmd param 'firstName' can't be null"
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L_0x00c5:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "AuthConfirmCmd param 'token' can't be null"
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n80.a(f0d, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
