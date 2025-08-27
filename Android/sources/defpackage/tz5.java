package defpackage;

import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: tz5  reason: default package */
public final class tz5 extends SuspendLambda implements Function2 {
    public zx5 a;
    public Set b;
    public List c;
    public int o;
    public final /* synthetic */ m06 v;
    public final /* synthetic */ Lazy w;
    public final /* synthetic */ Lazy x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tz5(m06 m06, Lazy lazy, Lazy lazy2, Continuation continuation) {
        super(2, continuation);
        this.v = m06;
        this.w = lazy;
        this.x = lazy2;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new tz5(this.v, this.w, this.x, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((tz5) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x018e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            r24 = this;
            r0 = r24
            r1 = 0
            r2 = 2
            r3 = 1
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r0.o
            r6 = 0
            if (r5 == 0) goto L_0x0030
            if (r5 == r3) goto L_0x002a
            if (r5 != r2) goto L_0x0022
            java.util.List r2 = r0.c
            java.util.List r2 = (java.util.List) r2
            java.util.Set r4 = r0.b
            zx5 r5 = r0.a
            kotlin.ResultKt.throwOnFailure(r25)
            r8 = r2
            r2 = r25
            goto L_0x00f4
        L_0x0022:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x002a:
            kotlin.ResultKt.throwOnFailure(r25)
            r5 = r25
            goto L_0x0044
        L_0x0030:
            kotlin.ResultKt.throwOnFailure(r25)
            m06 r5 = r0.v
            u82 r7 = r5.v
            java.lang.String r5 = r5.b
            r0.o = r3
            ia2 r7 = (defpackage.ia2) r7
            java.lang.Object r5 = r7.d(r5, r0)
            if (r5 != r4) goto L_0x0044
            return r4
        L_0x0044:
            zx5 r5 = (defpackage.zx5) r5
            if (r5 != 0) goto L_0x005a
            m06 r0 = r0.v
            xme r0 = r0.Y
            oz5 r1 = new oz5
            r1.<init>()
            r0.getClass()
            r0.m(r6, r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x005a:
            m06 r7 = r0.v
            r7.A0 = r5
            kotlin.Lazy r7 = r0.w
            java.lang.Object r7 = r7.getValue()
            xva r7 = (defpackage.xva) r7
            java.lang.CharSequence r8 = r5.b
            java.util.List r9 = r5.w0
            wa9 r10 = defpackage.wa9.a
            java.lang.CharSequence r7 = r7.a(r8, r9, defpackage.wa9.b, false, 0, true)
            m06 r8 = r0.v
            xme r9 = r8.Y
            pz5 r10 = new pz5
            java.lang.String r8 = r8.b
            r11 = 4
            r10.<init>((java.lang.String) r8, (java.lang.CharSequence) r7, (int) r11)
            r9.getClass()
            r9.m(r6, r10)
            jz5 r8 = new jz5
            mgf r9 = new mgf
            r9.<init>(r7)
            java.util.Set r7 = r5.A0
            a26 r10 = defpackage.a26.NO_TITLE_EDIT
            boolean r7 = r7.contains(r10)
            r7 = r7 ^ r3
            r8.<init>(r9, r7)
            m06 r7 = r0.v
            xme r7 = r7.v0
            l16 r9 = new l16
            r9.<init>(r2)
            lz7[] r10 = new defpackage.lz7[r2]
            r10[r1] = r8
            r10[r3] = r9
            java.util.List r9 = kotlin.collections.CollectionsKt.listOf(r10)
            r7.setValue(r9)
            java.util.Set r7 = r5.Y
            l16 r9 = new l16
            boolean r10 = r7.isEmpty()
            r10 = r10 ^ r3
            if (r10 == 0) goto L_0x00ba
            r10 = 536870914(0x20000002, float:1.0842024E-19)
            goto L_0x00bb
        L_0x00ba:
            r10 = r2
        L_0x00bb:
            r9.<init>(r10)
            lz7[] r10 = new defpackage.lz7[r2]
            r10[r1] = r8
            r10[r3] = r9
            java.util.List r8 = kotlin.collections.CollectionsKt.mutableListOf(r10)
            boolean r9 = r7.isEmpty()
            r9 = r9 ^ r3
            if (r9 == 0) goto L_0x0184
            m06 r9 = r0.v
            u82 r10 = r9.v
            java.lang.String r9 = r9.b
            r0.a = r5
            r0.b = r7
            r11 = r8
            java.util.List r11 = (java.util.List) r11
            r0.c = r11
            r0.o = r2
            ia2 r10 = (defpackage.ia2) r10
            r10.getClass()
            k92 r2 = new k92
            r2.<init>(r10, r9, r6)
            kotlin.coroutines.CoroutineContext r9 = r10.x
            java.lang.Object r2 = defpackage.ev0.I(r9, r2, r0)
            if (r2 != r4) goto L_0x00f3
            return r4
        L_0x00f3:
            r4 = r7
        L_0x00f4:
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            m06 r7 = r0.v
            kotlin.Lazy r9 = r0.x
            java.util.Iterator r2 = r2.iterator()
            r10 = r1
        L_0x00ff:
            boolean r11 = r2.hasNext()
            if (r11 == 0) goto L_0x0184
            java.lang.Object r11 = r2.next()
            int r12 = r10 + 1
            if (r10 >= 0) goto L_0x0110
            kotlin.collections.CollectionsKt.throwIndexOverflow()
        L_0x0110:
            a32 r11 = (defpackage.a32) r11
            kotlin.reflect.KProperty[] r13 = defpackage.m06.D0
            kotlin.Lazy r13 = r7.w
            java.lang.Object r13 = r13.getValue()
            x23 r13 = (defpackage.x23) r13
            android.net.Uri r13 = defpackage.m06.m(r11, r13)
            int r14 = r4.size()
            int r14 = r14 - r3
            if (r10 != r14) goto L_0x012d
            r10 = -2147483644(0xffffffff80000004, float:-5.6E-45)
        L_0x012a:
            r23 = r10
            goto L_0x0131
        L_0x012d:
            r10 = 1073741828(0x40000004, float:2.000001)
            goto L_0x012a
        L_0x0131:
            m16 r10 = new m16
            m72 r14 = r11.b
            long r14 = r14.a
            if (r13 == 0) goto L_0x0140
            java.lang.String r13 = r13.toString()
            r17 = r13
            goto L_0x0142
        L_0x0140:
            r17 = r6
        L_0x0142:
            java.lang.Object r13 = r9.getValue()
            fq2 r13 = (defpackage.fq2) r13
            vb2 r13 = (defpackage.vb2) r13
            r13.getClass()
            r11.l0()
            java.lang.CharSequence r13 = r11.X
            long r19 = r11.g()
            r11.m0()
            java.lang.CharSequence r1 = r11.v0
            boolean r16 = r11.Y()
            if (r16 != 0) goto L_0x0172
            vk3 r11 = r11.m()
            if (r11 == 0) goto L_0x016e
            boolean r11 = r11.z()
            if (r11 != r3) goto L_0x016e
            goto L_0x0172
        L_0x016e:
            r15 = r14
            r22 = 0
            goto L_0x0175
        L_0x0172:
            r22 = r3
            r15 = r14
        L_0x0175:
            r14 = r10
            r18 = r13
            r21 = r1
            r14.<init>(r15, r17, r18, r19, r21, r22, r23)
            r8.add(r10)
            r10 = r12
            r1 = 0
            goto L_0x00ff
        L_0x0184:
            java.util.Set r1 = r5.A0
            a26 r2 = defpackage.a26.NO_DELETE
            boolean r1 = r1.contains(r2)
            if (r1 != 0) goto L_0x0193
            oy5 r1 = defpackage.oy5.a
            r8.add(r1)
        L_0x0193:
            m06 r0 = r0.v
            xme r0 = r0.v0
            r0.setValue(r8)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tz5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
