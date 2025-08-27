package defpackage;

import kotlin.jvm.internal.Ref;

/* renamed from: bu5  reason: default package */
public final class bu5 implements ds5 {
    public final /* synthetic */ ds5 a;
    public final /* synthetic */ Ref.ObjectRef b;

    public bu5(ds5 ds5, Ref.ObjectRef objectRef) {
        this.a = ds5;
        this.b = objectRef;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.au5
            if (r0 == 0) goto L_0x0013
            r0 = r6
            au5 r0 = (defpackage.au5) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.o = r1
            goto L_0x0018
        L_0x0013:
            au5 r0 = new au5
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.o
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            bu5 r4 = r0.a
            kotlin.ResultKt.throwOnFailure(r6)     // Catch:{ all -> 0x002b }
            goto L_0x0045
        L_0x002b:
            r5 = move-exception
            goto L_0x0048
        L_0x002d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0035:
            kotlin.ResultKt.throwOnFailure(r6)
            ds5 r6 = r4.a     // Catch:{ all -> 0x002b }
            r0.a = r4     // Catch:{ all -> 0x002b }
            r0.o = r3     // Catch:{ all -> 0x002b }
            java.lang.Object r4 = r6.a(r5, r0)     // Catch:{ all -> 0x002b }
            if (r4 != r1) goto L_0x0045
            return r1
        L_0x0045:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L_0x0048:
            kotlin.jvm.internal.Ref$ObjectRef r4 = r4.b
            r4.element = r5
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bu5.a(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
