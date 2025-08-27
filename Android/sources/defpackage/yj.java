package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: yj  reason: default package */
public final class yj extends SuspendLambda implements Function2 {
    public List a;
    public List b;
    public nk c;
    public int o;
    public int v;
    public int w;
    public /* synthetic */ Object x;
    public final /* synthetic */ gk y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yj(gk gkVar, Continuation continuation) {
        super(2, continuation);
        this.y = gkVar;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        yj yjVar = new yj(this.y, continuation);
        yjVar.x = obj;
        return yjVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((yj) create((ds5) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [java.util.List, java.lang.Object, nk] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0195 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = 2
            r2 = 1
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r0.w
            r5 = 0
            r6 = 5
            r7 = 4
            r8 = 3
            gk r9 = r0.y
            r10 = 0
            if (r4 == 0) goto L_0x0056
            if (r4 == r2) goto L_0x0052
            if (r4 == r1) goto L_0x0047
            if (r4 == r8) goto L_0x0043
            if (r4 == r7) goto L_0x002a
            if (r4 != r6) goto L_0x0022
            kotlin.ResultKt.throwOnFailure(r21)
            goto L_0x0196
        L_0x0022:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x002a:
            int r1 = r0.v
            int r4 = r0.o
            nk r8 = r0.c
            java.util.List r11 = r0.b
            java.util.List r11 = (java.util.List) r11
            java.util.List r12 = r0.a
            java.util.List r12 = (java.util.List) r12
            java.lang.Object r13 = r0.x
            ds5 r13 = (defpackage.ds5) r13
            kotlin.ResultKt.throwOnFailure(r21)
            r5 = r21
            goto L_0x00f5
        L_0x0043:
            kotlin.ResultKt.throwOnFailure(r21)
            goto L_0x00b4
        L_0x0047:
            java.lang.Object r1 = r0.x
            ds5 r1 = (defpackage.ds5) r1
            kotlin.ResultKt.throwOnFailure(r21)
            r4 = r1
            r1 = r21
            goto L_0x009d
        L_0x0052:
            kotlin.ResultKt.throwOnFailure(r21)
            goto L_0x0072
        L_0x0056:
            kotlin.ResultKt.throwOnFailure(r21)
            java.lang.Object r4 = r0.x
            ds5 r4 = (defpackage.ds5) r4
            rk r11 = r9.e
            boolean r11 = r11.a()
            if (r11 != 0) goto L_0x0075
            java.util.List r1 = kotlin.collections.CollectionsKt.emptyList()
            r0.w = r2
            java.lang.Object r0 = r4.a(r1, r0)
            if (r0 != r3) goto L_0x0072
            return r3
        L_0x0072:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0075:
            kotlin.Lazy r11 = r9.h
            java.lang.Object r11 = r11.getValue()
            ok r11 = (defpackage.ok) r11
            r0.x = r4
            r0.w = r1
            r11.getClass()
            java.lang.String r12 = "SELECT * FROM animoji_set"
            d7d r12 = defpackage.d7d.a(r5, r12)
            android.os.CancellationSignal r13 = new android.os.CancellationSignal
            r13.<init>()
            ni r14 = new ni
            r14.<init>(r1, r11, r12)
            i6d r1 = r11.a
            java.lang.Object r1 = defpackage.i8b.q(r1, r13, r14, r0)
            if (r1 != r3) goto L_0x009d
            return r3
        L_0x009d:
            java.util.List r1 = (java.util.List) r1
            boolean r11 = r1.isEmpty()
            if (r11 == 0) goto L_0x00b7
            java.util.List r1 = kotlin.collections.CollectionsKt.emptyList()
            r0.x = r10
            r0.w = r8
            java.lang.Object r0 = r4.a(r1, r0)
            if (r0 != r3) goto L_0x00b4
            return r3
        L_0x00b4:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x00b7:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r11 = r1
            java.util.Collection r11 = (java.util.Collection) r11
            int r11 = r11.size()
            r12 = r1
            r13 = r4
            r4 = r5
            r1 = r11
            r11 = r8
        L_0x00c8:
            if (r4 >= r1) goto L_0x017f
            java.lang.Object r8 = r12.get(r4)
            nk r8 = (defpackage.nk) r8
            kotlin.reflect.KProperty[] r14 = defpackage.gk.p
            pi r14 = r9.h()
            java.util.List r15 = r8.f
            java.util.Collection r15 = (java.util.Collection) r15
            r0.x = r13
            r5 = r12
            java.util.List r5 = (java.util.List) r5
            r0.a = r5
            r5 = r11
            java.util.List r5 = (java.util.List) r5
            r0.b = r5
            r0.c = r8
            r0.o = r4
            r0.v = r1
            r0.w = r7
            java.lang.Object r5 = r14.a(r15, r0)
            if (r5 != r3) goto L_0x00f5
            return r3
        L_0x00f5:
            java.util.Collection r5 = (java.util.Collection) r5
            java.util.List r5 = kotlin.collections.CollectionsKt.toMutableList(r5)
            boolean r14 = r5.isEmpty()
            if (r14 == 0) goto L_0x0105
            r19 = r3
            goto L_0x0176
        L_0x0105:
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.List r15 = r8.f
            java.util.Collection r15 = (java.util.Collection) r15
            int r15 = r15.size()
            r7 = 0
        L_0x0113:
            if (r7 >= r15) goto L_0x0166
            java.util.List r6 = r8.f
            java.lang.Object r6 = r6.get(r7)
            java.lang.Number r6 = (java.lang.Number) r6
            long r16 = r6.longValue()
            r6 = r5
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L_0x0128:
            boolean r18 = r6.hasNext()
            if (r18 == 0) goto L_0x0144
            java.lang.Object r18 = r6.next()
            r10 = r18
            dj r10 = (defpackage.dj) r10
            r19 = r3
            long r2 = r10.a
            int r2 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r2 != 0) goto L_0x013f
            goto L_0x0148
        L_0x013f:
            r3 = r19
            r2 = 1
            r10 = 0
            goto L_0x0128
        L_0x0144:
            r19 = r3
            r18 = 0
        L_0x0148:
            r2 = r18
            dj r2 = (defpackage.dj) r2
            if (r2 != 0) goto L_0x0150
        L_0x014e:
            r2 = 1
            goto L_0x0160
        L_0x0150:
            kotlin.reflect.KProperty[] r3 = defpackage.gk.p
            r9.getClass()
            hi r3 = defpackage.gk.l(r2)
            r14.add(r3)
            r5.remove(r2)
            goto L_0x014e
        L_0x0160:
            int r7 = r7 + r2
            r3 = r19
            r6 = 5
            r10 = 0
            goto L_0x0113
        L_0x0166:
            r19 = r3
            lk r3 = new lk
            java.lang.String r5 = r8.c
            java.lang.String r6 = r8.d
            java.lang.String r7 = r8.b
            r3.<init>(r7, r5, r6, r14)
            r11.add(r3)
        L_0x0176:
            int r4 = r4 + r2
            r3 = r19
            r5 = 0
            r6 = 5
            r7 = 4
            r10 = 0
            goto L_0x00c8
        L_0x017f:
            r19 = r3
            r1 = r10
            r0.x = r1
            r0.a = r1
            r0.b = r1
            r0.c = r1
            r1 = 5
            r0.w = r1
            java.lang.Object r0 = r13.a(r11, r0)
            r1 = r19
            if (r0 != r1) goto L_0x0196
            return r1
        L_0x0196:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yj.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
