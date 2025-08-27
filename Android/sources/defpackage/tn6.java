package defpackage;

import java.util.Collection;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: tn6  reason: default package */
public final class tn6 extends SuspendLambda implements Function2 {
    public Collection a;
    public int b;
    public final /* synthetic */ gp6 c;
    public final /* synthetic */ wk6 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tn6(gp6 gp6, wk6 wk6, Continuation continuation) {
        super(2, continuation);
        this.c = gp6;
        this.o = wk6;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new tn6(this.c, this.o, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((tn6) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r8.b
            java.lang.String r2 = "gp6"
            r3 = 3
            r4 = 2
            r5 = 1
            wk6 r6 = r8.o
            gp6 r7 = r8.c
            if (r1 == 0) goto L_0x0034
            if (r1 == r5) goto L_0x0030
            if (r1 == r4) goto L_0x0028
            if (r1 != r3) goto L_0x0020
            java.util.Collection r8 = r8.a
            java.util.Collection r8 = (java.util.Collection) r8
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x00bf
        L_0x0020:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0028:
            java.util.Collection r1 = r8.a
            java.util.List r1 = (java.util.List) r1
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x0093
        L_0x0030:
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x0075
        L_0x0034:
            kotlin.ResultKt.throwOnFailure(r9)
            xme r9 = r7.x0
            java.lang.Object r9 = r9.getValue()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x0048
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        L_0x0048:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r1 = "start fetch medias for "
            r9.<init>(r1)
            r9.append(r6)
            java.lang.String r9 = r9.toString()
            defpackage.z68.c(r2, r9, new java.lang.Object[0])
            java.lang.Boolean r9 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r5)
            xme r1 = r7.x0
            r1.setValue(r9)
            vk6 r9 = r6.a
            s48 r1 = r7.v
            yd7 r1 = (defpackage.yd7) r1
            java.util.List r9 = r1.d(r9)
            r8.b = r5
            java.lang.Object r9 = defpackage.gp6.j(r7, r9, r8)
            if (r9 != r0) goto L_0x0075
            return r0
        L_0x0075:
            r1 = r9
            java.util.List r1 = (java.util.List) r1
            xme r9 = r7.Z
            r9.setValue(r1)
            xm6 r9 = r7.w0
            int r9 = r9.b
            r5 = r1
            java.util.Collection r5 = (java.util.Collection) r5
            r8.a = r5
            r8.b = r4
            s48 r4 = r7.v
            yd7 r4 = (defpackage.yd7) r4
            java.lang.Object r9 = r4.e(r6, r9, r8)
            if (r9 != r0) goto L_0x0093
            return r0
        L_0x0093:
            r48 r9 = (defpackage.r48) r9
            xme r4 = r7.x0
            r5 = 0
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r5)
            r4.setValue(r5)
            boolean r4 = r9 instanceof defpackage.p48
            if (r4 == 0) goto L_0x00a6
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        L_0x00a6:
            boolean r4 = r9 instanceof defpackage.q48
            if (r4 == 0) goto L_0x00de
            java.util.Collection r1 = (java.util.Collection) r1
            q48 r9 = (defpackage.q48) r9
            java.util.List r9 = r9.a
            r4 = r1
            java.util.Collection r4 = (java.util.Collection) r4
            r8.a = r4
            r8.b = r3
            java.lang.Object r9 = defpackage.gp6.j(r7, r9, r8)
            if (r9 != r0) goto L_0x00be
            return r0
        L_0x00be:
            r8 = r1
        L_0x00bf:
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.List r8 = kotlin.collections.CollectionsKt.plus(r8, r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "finish fetch medias for "
            r9.<init>(r0)
            r9.append(r6)
            java.lang.String r9 = r9.toString()
            defpackage.z68.c(r2, r9, new java.lang.Object[0])
            xme r9 = r7.Z
            r9.setValue(r8)
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        L_0x00de:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tn6.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
