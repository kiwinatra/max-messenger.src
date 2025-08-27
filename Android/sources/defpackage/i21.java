package defpackage;

import kotlin.jvm.functions.Function3;

/* renamed from: i21  reason: default package */
public final class i21 implements bs5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bs5 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ i21(bs5 bs5, Object obj, Object obj2, int i) {
        this.a = i;
        this.b = bs5;
        this.c = obj;
        this.o = obj2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e(defpackage.ds5 r9, kotlin.coroutines.Continuation r10) {
        /*
            r8 = this;
            r0 = 0
            r1 = 4
            r2 = 1
            r3 = 2
            bs5 r4 = r8.b
            java.lang.Object r5 = r8.o
            java.lang.Object r6 = r8.c
            int r7 = r8.a
            switch(r7) {
                case 0: goto L_0x00e9;
                case 1: goto L_0x00d2;
                case 2: goto L_0x00ba;
                case 3: goto L_0x0046;
                case 4: goto L_0x0026;
                default: goto L_0x000f;
            }
        L_0x000f:
            y40 r8 = new y40
            ru.ok.messages.calls.utils.StartCallsViewModel r6 = (ru.ok.messages.calls.utils.StartCallsViewModel) r6
            pje r5 = (defpackage.pje) r5
            r8.<init>(r9, r6, r5, r1)
            java.lang.Object r8 = r4.e(r8, r10)
            java.lang.Object r9 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r8 != r9) goto L_0x0023
            goto L_0x0025
        L_0x0023:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
        L_0x0025:
            return r8
        L_0x0026:
            bs5 r6 = (defpackage.bs5) r6
            bs5[] r8 = new defpackage.bs5[r3]
            r3 = 0
            r8[r3] = r4
            r8[r2] = r6
            gy3 r2 = defpackage.gy3.x
            uu5 r3 = new uu5
            kotlin.jvm.functions.Function3 r5 = (kotlin.jvm.functions.Function3) r5
            r3.<init>((java.lang.Object) r5, (kotlin.coroutines.Continuation) r0, (int) r1)
            java.lang.Object r8 = defpackage.fqc.h(r9, r10, r2, r3, r8)
            java.lang.Object r9 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r8 != r9) goto L_0x0043
            goto L_0x0045
        L_0x0043:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
        L_0x0045:
            return r8
        L_0x0046:
            boolean r1 = r10 instanceof defpackage.nv5
            if (r1 == 0) goto L_0x0059
            r1 = r10
            nv5 r1 = (defpackage.nv5) r1
            int r4 = r1.b
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r4 & r5
            if (r7 == 0) goto L_0x0059
            int r4 = r4 - r5
            r1.b = r4
            goto L_0x005e
        L_0x0059:
            nv5 r1 = new nv5
            r1.<init>(r8, r10)
        L_0x005e:
            java.lang.Object r10 = r1.a
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r1.b
            if (r5 == 0) goto L_0x0084
            if (r5 == r2) goto L_0x0078
            if (r5 != r3) goto L_0x0070
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x00b7
        L_0x0070:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0078:
            kotlin.jvm.internal.Ref$ObjectRef r8 = r1.w
            ds5 r9 = r1.v
            i21 r2 = r1.o
            kotlin.ResultKt.throwOnFailure(r10)
            r10 = r8
            r8 = r2
            goto L_0x009d
        L_0x0084:
            kotlin.ResultKt.throwOnFailure(r10)
            kotlin.jvm.internal.Ref$ObjectRef r10 = new kotlin.jvm.internal.Ref$ObjectRef
            r10.<init>()
            r10.element = r6
            r1.o = r8
            r1.v = r9
            r1.w = r10
            r1.b = r2
            java.lang.Object r2 = r9.a(r6, r1)
            if (r2 != r4) goto L_0x009d
            goto L_0x00b9
        L_0x009d:
            bs5 r2 = r8.b
            pv5 r5 = new pv5
            java.lang.Object r8 = r8.o
            kotlin.jvm.functions.Function3 r8 = (kotlin.jvm.functions.Function3) r8
            r5.<init>(r10, r8, r9)
            r1.o = r0
            r1.v = r0
            r1.w = r0
            r1.b = r3
            java.lang.Object r8 = r2.e(r5, r1)
            if (r8 != r4) goto L_0x00b7
            goto L_0x00b9
        L_0x00b7:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
        L_0x00b9:
            return r4
        L_0x00ba:
            y40 r8 = new y40
            lp2 r6 = (defpackage.lp2) r6
            kotlin.Lazy r5 = (kotlin.Lazy) r5
            r0 = 3
            r8.<init>(r9, r6, r5, r0)
            java.lang.Object r8 = r4.e(r8, r10)
            java.lang.Object r9 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r8 != r9) goto L_0x00cf
            goto L_0x00d1
        L_0x00cf:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
        L_0x00d1:
            return r8
        L_0x00d2:
            y40 r8 = new y40
            srd r6 = (defpackage.srd) r6
            android.content.Context r5 = (android.content.Context) r5
            r8.<init>(r9, r6, r5, r3)
            java.lang.Object r8 = r4.e(r8, r10)
            java.lang.Object r9 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r8 != r9) goto L_0x00e6
            goto L_0x00e8
        L_0x00e6:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
        L_0x00e8:
            return r8
        L_0x00e9:
            y40 r8 = new y40
            k21 r6 = (defpackage.k21) r6
            a32 r5 = (defpackage.a32) r5
            r8.<init>(r9, r6, r5, r2)
            java.lang.Object r8 = r4.e(r8, r10)
            java.lang.Object r9 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r8 != r9) goto L_0x00fd
            goto L_0x00ff
        L_0x00fd:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
        L_0x00ff:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i21.e(ds5, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public i21(Object obj, bs5 bs5, Function3 function3) {
        this.a = 3;
        this.c = obj;
        this.b = bs5;
        this.o = function3;
    }
}
