package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* renamed from: m92  reason: default package */
public final class m92 extends SuspendLambda implements Function2 {
    public Object a;
    public ia2 b;
    public zx5 c;
    public int o;
    public final /* synthetic */ ia2 v;
    public final /* synthetic */ zx5 w;
    public final /* synthetic */ Function0 x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m92(ia2 ia2, zx5 zx5, Function0 function0, Continuation continuation) {
        super(2, continuation);
        this.v = ia2;
        this.w = zx5;
        this.x = function0;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new m92(this.v, this.w, this.x, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((m92) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: ia2} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0070 A[Catch:{ all -> 0x0085 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x008b A[Catch:{ all -> 0x0085 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00dd A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ee A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0088 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = 0
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.o
            zx5 r4 = r0.w
            r5 = 0
            r6 = 4
            r7 = 3
            r8 = 2
            ia2 r9 = r0.v
            r13 = 1
            if (r3 == 0) goto L_0x0047
            if (r3 == r13) goto L_0x003b
            if (r3 == r8) goto L_0x0036
            if (r3 == r7) goto L_0x0029
            if (r3 != r6) goto L_0x0021
            kotlin.ResultKt.throwOnFailure(r17)
            goto L_0x0116
        L_0x0021:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0029:
            java.lang.Object r1 = r0.a
            r9 = r1
            ia2 r9 = (defpackage.ia2) r9
            kotlin.ResultKt.throwOnFailure(r17)
            r1 = r17
        L_0x0033:
            r11 = r9
            goto L_0x00ef
        L_0x0036:
            kotlin.ResultKt.throwOnFailure(r17)
            goto L_0x00de
        L_0x003b:
            zx5 r3 = r0.c
            ia2 r10 = r0.b
            java.lang.Object r11 = r0.a
            xz9 r11 = (defpackage.xz9) r11
            kotlin.ResultKt.throwOnFailure(r17)
            goto L_0x005d
        L_0x0047:
            kotlin.ResultKt.throwOnFailure(r17)
            a0a r11 = r9.B0
            r0.a = r11
            r0.b = r9
            r0.c = r4
            r0.o = r13
            java.lang.Object r3 = r11.d(r0)
            if (r3 != r2) goto L_0x005b
            return r2
        L_0x005b:
            r3 = r4
            r10 = r9
        L_0x005d:
            kotlin.Lazy r12 = r10.F0     // Catch:{ all -> 0x0085 }
            java.lang.Object r12 = r12.getValue()     // Catch:{ all -> 0x0085 }
            java.util.List r12 = (java.util.List) r12     // Catch:{ all -> 0x0085 }
            java.util.Iterator r12 = r12.iterator()     // Catch:{ all -> 0x0085 }
            r14 = r1
        L_0x006a:
            boolean r15 = r12.hasNext()     // Catch:{ all -> 0x0085 }
            if (r15 == 0) goto L_0x0088
            java.lang.Object r15 = r12.next()     // Catch:{ all -> 0x0085 }
            j5d r15 = (defpackage.j5d) r15     // Catch:{ all -> 0x0085 }
            java.lang.String r15 = r15.a     // Catch:{ all -> 0x0085 }
            java.lang.String r13 = r3.a     // Catch:{ all -> 0x0085 }
            boolean r13 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r15, (java.lang.Object) r13)     // Catch:{ all -> 0x0085 }
            if (r13 == 0) goto L_0x0081
            goto L_0x0089
        L_0x0081:
            int r14 = r14 + 1
            r13 = 1
            goto L_0x006a
        L_0x0085:
            r0 = move-exception
            goto L_0x0119
        L_0x0088:
            r14 = -1
        L_0x0089:
            if (r14 < 0) goto L_0x00aa
            kotlin.Lazy r10 = r10.F0     // Catch:{ all -> 0x0085 }
            java.lang.Object r10 = r10.getValue()     // Catch:{ all -> 0x0085 }
            java.util.List r10 = (java.util.List) r10     // Catch:{ all -> 0x0085 }
            j5d r12 = new j5d     // Catch:{ all -> 0x0085 }
            java.util.UUID r13 = java.util.UUID.randomUUID()     // Catch:{ all -> 0x0085 }
            java.lang.String r13 = r13.toString()     // Catch:{ all -> 0x0085 }
            r15 = 262142(0x3fffe, float:3.67339E-40)
            zx5 r3 = defpackage.zx5.a(r3, r13, r1, r5, r15)     // Catch:{ all -> 0x0085 }
            r12.<init>(r3)     // Catch:{ all -> 0x0085 }
            r10.set(r14, r12)     // Catch:{ all -> 0x0085 }
        L_0x00aa:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0085 }
            a0a r11 = (defpackage.a0a) r11
            r11.e(r5)
            c6d r3 = r9.g()
            j5d r10 = new j5d
            java.util.List r11 = kotlin.collections.CollectionsKt.emptyList()
            r12 = 262127(0x3ffef, float:3.67318E-40)
            zx5 r4 = defpackage.zx5.a(r4, r5, r1, r11, r12)
            r10.<init>(r4)
            r0.a = r5
            r0.b = r5
            r0.c = r5
            r0.o = r8
            r3.getClass()
            u5d r4 = new u5d
            r4.<init>(r3, r10, r1)
            i6d r1 = r3.a
            java.lang.Object r1 = defpackage.i8b.r(r1, r4, r0)
            if (r1 != r2) goto L_0x00de
            return r2
        L_0x00de:
            java.lang.String r1 = defpackage.ia2.K0
            c6d r1 = r9.g()
            r0.a = r9
            r0.o = r7
            java.lang.Object r1 = r1.e(r0)
            if (r1 != r2) goto L_0x0033
            return r2
        L_0x00ef:
            r12 = r1
            java.util.List r12 = (java.util.List) r12
            r0.a = r5
            r0.o = r6
            java.lang.String r1 = defpackage.ia2.K0
            r11.getClass()
            aa2 r1 = new aa2
            r15 = 0
            kotlin.jvm.functions.Function0 r14 = r0.x
            r10 = r1
            r3 = 1
            r13 = r3
            r10.<init>(r11, r12, r13, r14, r15)
            java.lang.Object r0 = defpackage.e14.d(r1, r0)
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto L_0x0111
            goto L_0x0113
        L_0x0111:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
        L_0x0113:
            if (r0 != r2) goto L_0x0116
            return r2
        L_0x0116:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0119:
            a0a r11 = (defpackage.a0a) r11
            r11.e(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m92.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
