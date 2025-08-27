package defpackage;

import kotlin.jvm.internal.Ref;

/* renamed from: rs5  reason: default package */
public final class rs5 implements ds5 {
    public final /* synthetic */ Ref.ObjectRef a;
    public final /* synthetic */ int b;
    public final /* synthetic */ ds5 c;

    public rs5(Ref.ObjectRef objectRef, int i, ds5 ds5) {
        this.a = objectRef;
        this.b = i;
        this.c = ds5;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.qs5
            if (r0 == 0) goto L_0x0013
            r0 = r7
            qs5 r0 = (defpackage.qs5) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.o = r1
            goto L_0x0018
        L_0x0013:
            qs5 r0 = new qs5
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.o
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            rs5 r5 = r0.a
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x005d
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0033:
            kotlin.ResultKt.throwOnFailure(r7)
            kotlin.jvm.internal.Ref$ObjectRef r7 = r5.a
            T r2 = r7.element
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r4 = r5.b
            if (r2 != 0) goto L_0x0047
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r4)
            r7.element = r2
        L_0x0047:
            r2.add(r6)
            int r6 = r2.size()
            if (r6 < r4) goto L_0x0062
            r0.a = r5
            r0.o = r3
            ds5 r6 = r5.c
            java.lang.Object r6 = r6.a(r2, r0)
            if (r6 != r1) goto L_0x005d
            return r1
        L_0x005d:
            kotlin.jvm.internal.Ref$ObjectRef r5 = r5.a
            r6 = 0
            r5.element = r6
        L_0x0062:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rs5.a(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
