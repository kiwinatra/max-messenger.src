package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* renamed from: b63  reason: default package */
public final class b63 extends SuspendLambda implements Function2 {
    public final /* synthetic */ ds5 X;
    public x02 a;
    public byte[] b;
    public int c;
    public int o;
    public int v;
    public /* synthetic */ Object w;
    public final /* synthetic */ bs5[] x;
    public final /* synthetic */ Function0 y;
    public final /* synthetic */ Function3 z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b63(ds5 ds5, Continuation continuation, Function0 function0, Function3 function3, bs5[] bs5Arr) {
        super(2, continuation);
        this.x = bs5Arr;
        this.y = function0;
        this.z = function3;
        this.X = ds5;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        Function3 function3 = this.z;
        Continuation continuation2 = continuation;
        b63 b63 = new b63(this.X, continuation2, this.y, function3, this.x);
        b63.w = obj;
        return b63;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((b63) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: ru0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v9, resolved type: kotlin.collections.IndexedValue} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: ru0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: ru0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: ru0} */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c0 A[LOOP:1: B:28:0x00c0->B:37:0x00e4, LOOP_START, PHI: r9 r13 
      PHI: (r9v2 int) = (r9v1 int), (r9v3 int) binds: [B:25:0x00bb, B:37:0x00e4] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r13v3 kotlin.collections.IndexedValue) = (r13v2 kotlin.collections.IndexedValue), (r13v10 kotlin.collections.IndexedValue) binds: [B:25:0x00bb, B:37:0x00e4] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.v
            bpa r3 = defpackage.q8.f
            r5 = 1
            r6 = 3
            r7 = 0
            r8 = 2
            if (r2 == 0) goto L_0x005f
            if (r2 == r5) goto L_0x0046
            if (r2 == r8) goto L_0x0033
            if (r2 != r6) goto L_0x002b
            int r2 = r0.o
            int r9 = r0.c
            byte[] r10 = r0.b
            x02 r11 = r0.a
            java.lang.Object r12 = r0.w
            java.lang.Object[] r12 = (java.lang.Object[]) r12
            kotlin.ResultKt.throwOnFailure(r21)
            r4 = r2
            r2 = r10
            r10 = r12
            r5 = 0
            goto L_0x0122
        L_0x002b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0033:
            int r2 = r0.o
            int r9 = r0.c
            byte[] r10 = r0.b
            x02 r11 = r0.a
            java.lang.Object r12 = r0.w
            java.lang.Object[] r12 = (java.lang.Object[]) r12
            kotlin.ResultKt.throwOnFailure(r21)
            r4 = r2
            r2 = r10
            r10 = r12
            goto L_0x009e
        L_0x0046:
            int r2 = r0.o
            int r9 = r0.c
            byte[] r10 = r0.b
            x02 r11 = r0.a
            java.lang.Object r12 = r0.w
            java.lang.Object[] r12 = (java.lang.Object[]) r12
            kotlin.ResultKt.throwOnFailure(r21)
            r13 = r21
            e22 r13 = (defpackage.e22) r13
            java.lang.Object r13 = r13.a
            r4 = r2
            r2 = r10
            r10 = r12
            goto L_0x00b3
        L_0x005f:
            kotlin.ResultKt.throwOnFailure(r21)
            java.lang.Object r2 = r0.w
            d14 r2 = (defpackage.d14) r2
            bs5[] r9 = r0.x
            int r9 = r9.length
            if (r9 != 0) goto L_0x006e
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x006e:
            java.lang.Object[] r10 = new java.lang.Object[r9]
            kotlin.collections.ArraysKt___ArraysJvmKt.fill$default((java.lang.Object[]) r10, (java.lang.Object) r3, 0, 0, 6, (java.lang.Object) null)
            r11 = 6
            ru0 r11 = defpackage.o54.a(r9, r11, r7)
            java.util.concurrent.atomic.AtomicInteger r15 = new java.util.concurrent.atomic.AtomicInteger
            r15.<init>(r9)
            r14 = 0
        L_0x007e:
            if (r14 >= r9) goto L_0x009b
            a63 r13 = new a63
            bs5[] r12 = r0.x
            r17 = 0
            r16 = r12
            r12 = r13
            r4 = r13
            r13 = r16
            r18 = r14
            r19 = r15
            r16 = r11
            r12.<init>(r13, r14, r15, r16, r17)
            defpackage.ev0.v(r2, r7, r7, r4, r6)
            int r14 = r18 + 1
            goto L_0x007e
        L_0x009b:
            byte[] r2 = new byte[r9]
            r4 = 0
        L_0x009e:
            int r4 = r4 + r5
            byte r4 = (byte) r4
            r0.w = r10
            r0.a = r11
            r0.b = r2
            r0.c = r9
            r0.o = r4
            r0.v = r5
            java.lang.Object r13 = r11.h(r0)
            if (r13 != r1) goto L_0x00b3
            return r1
        L_0x00b3:
            boolean r12 = r13 instanceof defpackage.d22
            if (r12 != 0) goto L_0x00b8
            goto L_0x00b9
        L_0x00b8:
            r13 = r7
        L_0x00b9:
            kotlin.collections.IndexedValue r13 = (kotlin.collections.IndexedValue) r13
            if (r13 != 0) goto L_0x00c0
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x00c0:
            int r12 = r13.getIndex()
            r14 = r10[r12]
            java.lang.Object r13 = r13.getValue()
            r10[r12] = r13
            if (r14 != r3) goto L_0x00d0
            int r9 = r9 + -1
        L_0x00d0:
            byte r13 = r2[r12]
            if (r13 == r4) goto L_0x00e6
            byte r13 = (byte) r4
            r2[r12] = r13
            java.lang.Object r12 = r11.e()
            boolean r13 = r12 instanceof defpackage.d22
            if (r13 != 0) goto L_0x00e0
            goto L_0x00e1
        L_0x00e0:
            r12 = r7
        L_0x00e1:
            r13 = r12
            kotlin.collections.IndexedValue r13 = (kotlin.collections.IndexedValue) r13
            if (r13 != 0) goto L_0x00c0
        L_0x00e6:
            if (r9 != 0) goto L_0x009e
            kotlin.jvm.functions.Function0 r12 = r0.y
            java.lang.Object r12 = r12.invoke()
            java.lang.Object[] r12 = (java.lang.Object[]) r12
            ds5 r13 = r0.X
            kotlin.jvm.functions.Function3 r14 = r0.z
            if (r12 != 0) goto L_0x0109
            r0.w = r10
            r0.a = r11
            r0.b = r2
            r0.c = r9
            r0.o = r4
            r0.v = r8
            java.lang.Object r12 = r14.invoke(r13, r10, r0)
            if (r12 != r1) goto L_0x009e
            return r1
        L_0x0109:
            r15 = 14
            r5 = 0
            kotlin.collections.ArraysKt___ArraysJvmKt.copyInto$default((java.lang.Object[]) r10, (java.lang.Object[]) r12, 0, 0, (int) r5, (int) r15, (java.lang.Object) null)
            r0.w = r10
            r0.a = r11
            r0.b = r2
            r0.c = r9
            r0.o = r4
            r0.v = r6
            java.lang.Object r12 = r14.invoke(r13, r12, r0)
            if (r12 != r1) goto L_0x0122
            return r1
        L_0x0122:
            r5 = 1
            goto L_0x009e
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b63.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
