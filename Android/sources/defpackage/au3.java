package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: au3  reason: default package */
public final class au3 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ bu3 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public au3(bu3 bu3, Continuation continuation) {
        super(2, continuation);
        this.b = bu3;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new au3(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((au3) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: zo3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r12v0 */
    /* JADX WARNING: type inference failed for: r12v2 */
    /* JADX WARNING: type inference failed for: r12v4 */
    /* JADX WARNING: type inference failed for: r12v7 */
    /* JADX WARNING: type inference failed for: r12v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.a
            r3 = 1
            if (r2 == 0) goto L_0x001a
            if (r2 != r3) goto L_0x0012
            kotlin.ResultKt.throwOnFailure(r17)
            goto L_0x0108
        L_0x0012:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x001a:
            kotlin.ResultKt.throwOnFailure(r17)
            bu3 r2 = r0.b
            zc4 r4 = r2.a
            java.lang.Object r4 = r4.v
            java.util.concurrent.atomic.AtomicReference r4 = (java.util.concurrent.atomic.AtomicReference) r4
            java.lang.Object r4 = r4.get()
            java.util.Set r4 = (java.util.Set) r4
            java.util.List r4 = kotlin.collections.CollectionsKt.toList(r4)
            kotlin.Lazy r5 = r2.b
            java.lang.Object r5 = r5.getValue()
            cp3 r5 = (defpackage.cp3) r5
            ome r5 = r5.c()
            java.lang.Object r5 = r5.getValue()
            po3 r5 = (defpackage.po3) r5
            boolean r6 = r5.b()
            if (r6 == 0) goto L_0x004a
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x004a:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r8 = r4
            java.util.Collection r8 = (java.util.Collection) r8
            int r8 = r8.size()
            r9 = 0
        L_0x005c:
            if (r9 >= r8) goto L_0x00f2
            java.lang.Object r10 = r4.get(r9)
            dkb r10 = (defpackage.dkb) r10
            ckb r11 = r10.b
            int r11 = r11.ordinal()
            r12 = 0
            long r13 = r10.a
            if (r11 == r3) goto L_0x00be
            r10 = 2
            if (r11 == r10) goto L_0x0076
            r17 = r4
            goto L_0x00eb
        L_0x0076:
            java.util.List r10 = r5.c
            if (r10 == 0) goto L_0x00a0
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r10 = r10.iterator()
        L_0x0080:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x009a
            java.lang.Object r11 = r10.next()
            r15 = r11
            zo3 r15 = (defpackage.zo3) r15
            r17 = r4
            long r3 = r15.a
            int r3 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r3 != 0) goto L_0x0096
            goto L_0x009d
        L_0x0096:
            r4 = r17
            r3 = 1
            goto L_0x0080
        L_0x009a:
            r17 = r4
            r11 = r12
        L_0x009d:
            zo3 r11 = (defpackage.zo3) r11
            goto L_0x00a3
        L_0x00a0:
            r17 = r4
            r11 = r12
        L_0x00a3:
            if (r11 == 0) goto L_0x00eb
            vdb r3 = new vdb
            java.lang.CharSequence r4 = r11.b
            java.lang.String r4 = r4.toString()
            android.net.Uri r10 = r11.x
            if (r10 == 0) goto L_0x00b5
            java.lang.String r12 = r10.toString()
        L_0x00b5:
            long r10 = r11.a
            r3.<init>(r10, r4, r12)
            r7.add(r3)
            goto L_0x00eb
        L_0x00be:
            r17 = r4
            java.util.List r3 = r5.a
            if (r3 == 0) goto L_0x00e0
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L_0x00ca:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x00de
            java.lang.Object r4 = r3.next()
            r10 = r4
            zo3 r10 = (defpackage.zo3) r10
            long r10 = r10.a
            int r10 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r10 != 0) goto L_0x00ca
            r12 = r4
        L_0x00de:
            zo3 r12 = (defpackage.zo3) r12
        L_0x00e0:
            if (r12 == 0) goto L_0x00eb
            long r3 = r12.a
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r6.add(r3)
        L_0x00eb:
            int r9 = r9 + 1
            r4 = r17
            r3 = 1
            goto L_0x005c
        L_0x00f2:
            gr3 r3 = new gr3
            r3.<init>(r6, r7)
            n6e r2 = r2.f
            wt3 r4 = new wt3
            r4.<init>(r3)
            r3 = 1
            r0.a = r3
            java.lang.Object r0 = r2.a(r4, r0)
            if (r0 != r1) goto L_0x0108
            return r1
        L_0x0108:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.au3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
