package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: dg3  reason: default package */
public final class dg3 extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ String c;
    public final /* synthetic */ eg3 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dg3(String str, eg3 eg3, Continuation continuation) {
        super(2, continuation);
        this.c = str;
        this.o = eg3;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        dg3 dg3 = new dg3(this.c, this.o, continuation);
        dg3.b = obj;
        return dg3;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((dg3) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: d14} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ad  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r10.a
            r2 = 0
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 1
            r7 = 2
            eg3 r8 = r10.o
            if (r1 == 0) goto L_0x003c
            if (r1 == r6) goto L_0x0038
            if (r1 == r7) goto L_0x0034
            if (r1 == r5) goto L_0x0030
            if (r1 == r4) goto L_0x0027
            if (r1 != r3) goto L_0x001f
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x00c2
        L_0x001f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0027:
            java.lang.Object r1 = r10.b
            d14 r1 = (defpackage.d14) r1
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x00a4
        L_0x0030:
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x0090
        L_0x0034:
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x007f
        L_0x0038:
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x006e
        L_0x003c:
            kotlin.ResultKt.throwOnFailure(r11)
            java.lang.Object r11 = r10.b
            r1 = r11
            d14 r1 = (defpackage.d14) r1
            kotlin.Lazy r11 = defpackage.m65.a
            java.lang.String r11 = r10.c
            java.lang.String r11 = defpackage.m65.a(r11)
            boolean r9 = defpackage.e14.f(r1)
            if (r9 != 0) goto L_0x0055
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        L_0x0055:
            java.lang.String r9 = r8.b
            boolean r11 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r11, (java.lang.Object) r9)
            xme r9 = r8.x
            if (r11 != 0) goto L_0x0093
            bg3 r11 = defpackage.bg3.c
            r10.a = r6
            r9.getClass()
            r9.m(r2, r11)
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            if (r11 != r0) goto L_0x006e
            return r0
        L_0x006e:
            kotlin.time.Duration$Companion r11 = kotlin.time.Duration.Companion
            kotlin.time.DurationUnit r11 = kotlin.time.DurationUnit.SECONDS
            long r3 = kotlin.time.DurationKt.toDuration((int) r7, (kotlin.time.DurationUnit) r11)
            r10.a = r7
            java.lang.Object r11 = defpackage.xk4.c(r3, r10)
            if (r11 != r0) goto L_0x007f
            return r0
        L_0x007f:
            xme r11 = r8.x
            bg3 r1 = defpackage.bg3.a
            r10.a = r5
            r11.getClass()
            r11.m(r2, r1)
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            if (r10 != r0) goto L_0x0090
            return r0
        L_0x0090:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        L_0x0093:
            bg3 r11 = defpackage.bg3.b
            r10.b = r1
            r10.a = r4
            r9.getClass()
            r9.m(r2, r11)
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            if (r11 != r0) goto L_0x00a4
            return r0
        L_0x00a4:
            boolean r11 = defpackage.e14.f(r1)
            if (r11 != 0) goto L_0x00ad
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        L_0x00ad:
            r10.b = r2
            r10.a = r3
            kotlin.reflect.KProperty[] r11 = defpackage.eg3.Z
            r8.getClass()
            cg3 r11 = new cg3
            r11.<init>(r8, r2)
            java.lang.Object r10 = defpackage.e14.d(r11, r10)
            if (r10 != r0) goto L_0x00c2
            return r0
        L_0x00c2:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dg3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
