package defpackage;

import java.util.Iterator;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: i0e  reason: default package */
public final class i0e extends SuspendLambda implements Function2 {
    public Iterator a;
    public Long b;
    public n0e c;
    public Map o;
    public Map v;
    public int w;
    public /* synthetic */ Object x;
    public final /* synthetic */ n0e y;
    public final /* synthetic */ Lazy z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i0e(n0e n0e, Lazy lazy, Continuation continuation) {
        super(2, continuation);
        this.y = n0e;
        this.z = lazy;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        i0e i0e = new i0e(this.y, this.z, continuation);
        i0e.x = obj;
        return i0e;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((i0e) create((fp0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x009f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.w
            r3 = 2
            r4 = 1
            n0e r5 = r0.y
            if (r2 == 0) goto L_0x0038
            if (r2 == r4) goto L_0x001f
            if (r2 != r3) goto L_0x0017
            kotlin.ResultKt.throwOnFailure(r19)
            goto L_0x014d
        L_0x0017:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x001f:
            java.util.Map r2 = r0.v
            java.util.Map r3 = r0.o
            n0e r6 = r0.c
            java.lang.Long r7 = r0.b
            java.util.Iterator r8 = r0.a
            java.lang.Object r9 = r0.x
            fp0 r9 = (defpackage.fp0) r9
            kotlin.ResultKt.throwOnFailure(r19)
            r10 = r9
            r9 = r8
            r8 = r7
            r7 = r6
            r6 = r3
            r3 = r19
            goto L_0x009b
        L_0x0038:
            kotlin.ResultKt.throwOnFailure(r19)
            java.lang.Object r2 = r0.x
            fp0 r2 = (defpackage.fp0) r2
            boolean r6 = r2 instanceof defpackage.cp0
            r7 = 0
            if (r6 == 0) goto L_0x0108
            r5.Y = r7
            r3 = r2
            cp0 r3 = (defpackage.cp0) r3
            wo3 r3 = r3.a
            java.util.List r3 = r3.o
            java.util.Iterator r3 = r3.iterator()
            r9 = r2
            r8 = r3
        L_0x0053:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L_0x00df
            java.lang.Object r2 = r8.next()
            r7 = r2
            java.lang.Long r7 = (java.lang.Long) r7
            java.util.Map r2 = kotlin.collections.MapsKt.createMapBuilder()
            xme r3 = r5.z
            java.lang.Object r3 = r3.getValue()
            java.util.Map r3 = (java.util.Map) r3
            r2.putAll(r3)
            boolean r3 = r2.containsKey(r7)
            if (r3 != 0) goto L_0x00c8
            kotlin.Lazy r3 = r0.z
            java.lang.Object r3 = r3.getValue()
            eu3 r3 = (defpackage.eu3) r3
            long r10 = r7.longValue()
            r0.x = r9
            r0.a = r8
            r0.b = r7
            r0.c = r5
            r0.o = r2
            r0.v = r2
            r0.w = r4
            java.lang.Object r3 = r3.b(r10, r0)
            if (r3 != r1) goto L_0x0096
            return r1
        L_0x0096:
            r6 = r2
            r10 = r9
            r9 = r8
            r8 = r7
            r7 = r5
        L_0x009b:
            vk3 r3 = (defpackage.vk3) r3
            if (r3 == 0) goto L_0x00c5
            kotlin.reflect.KProperty[] r11 = defpackage.n0e.x0
            r7.getClass()
            bp0 r7 = new bp0
            long r13 = r3.r()
            kl0 r11 = defpackage.kl0.b
            java.lang.String r15 = r3.t(r11)
            java.lang.String r11 = r3.f()
            if (r11 != 0) goto L_0x00b8
            java.lang.String r11 = ""
        L_0x00b8:
            r16 = r11
            java.lang.CharSequence r17 = r3.q()
            r12 = r7
            r12.<init>(r13, r15, r16, r17)
            r2.put(r8, r7)
        L_0x00c5:
            r2 = r6
            r8 = r9
            goto L_0x00c9
        L_0x00c8:
            r10 = r9
        L_0x00c9:
            java.util.Map r2 = kotlin.collections.MapsKt.build(r2)
            xme r3 = r5.z
        L_0x00cf:
            java.lang.Object r6 = r3.getValue()
            r7 = r6
            java.util.Map r7 = (java.util.Map) r7
            boolean r6 = r3.b(r6, r2)
            if (r6 == 0) goto L_0x00cf
            r9 = r10
            goto L_0x0053
        L_0x00df:
            int r0 = r5.Z
            cp0 r9 = (defpackage.cp0) r9
            wo3 r1 = r9.a
            java.util.List r1 = r1.o
            int r1 = r1.size()
            int r1 = r1 + r0
            r5.Z = r1
            wo3 r0 = r9.a
            java.util.List r1 = r0.o
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0102
            java.util.List r0 = r0.o
            int r0 = r0.size()
            r1 = 40
            if (r0 >= r1) goto L_0x014d
        L_0x0102:
            r0 = 2147483647(0x7fffffff, float:NaN)
            r5.Z = r0
            goto L_0x014d
        L_0x0108:
            boolean r4 = r2 instanceof defpackage.dp0
            if (r4 == 0) goto L_0x0131
            r0.w = r3
            kotlin.Lazy r2 = r5.y
            java.lang.Object r2 = r2.getValue()
            gaf r2 = (defpackage.gaf) r2
            osa r2 = (defpackage.osa) r2
            q04 r2 = r2.b()
            k0e r3 = new k0e
            r3.<init>(r5, r7)
            java.lang.Object r0 = defpackage.ev0.I(r2, r3, r0)
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r2) goto L_0x012c
            goto L_0x012e
        L_0x012c:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
        L_0x012e:
            if (r0 != r1) goto L_0x014d
            return r1
        L_0x0131:
            boolean r0 = r2 instanceof defpackage.ep0
            if (r0 == 0) goto L_0x0150
            ep0 r2 = (defpackage.ep0) r2
            long r0 = r2.a
            java.lang.Long r2 = r5.Y
            if (r2 != 0) goto L_0x013e
            goto L_0x014d
        L_0x013e:
            long r2 = r2.longValue()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x014d
            r5.Y = r7
            int r0 = r5.Z
            r5.j(r0)
        L_0x014d:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0150:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i0e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
