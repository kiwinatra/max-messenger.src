package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* renamed from: dvd  reason: default package */
public final class dvd extends SuspendLambda implements Function2 {
    public Ref.IntRef a;
    public int b;
    public final /* synthetic */ evd c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dvd(evd evd, Continuation continuation) {
        super(2, continuation);
        this.c = evd;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new dvd(this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((dvd) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01b9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            r19 = this;
            r0 = r19
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.b
            java.lang.String r3 = "ONEME-11049"
            r4 = 0
            r5 = 2
            r6 = 0
            java.lang.String r7 = "Got "
            r14 = 1
            if (r2 == 0) goto L_0x002c
            if (r2 == r14) goto L_0x0025
            if (r2 != r5) goto L_0x001d
            kotlin.ResultKt.throwOnFailure(r20)
            r2 = r20
            goto L_0x012a
        L_0x001d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0025:
            kotlin.jvm.internal.Ref$IntRef r1 = r0.a
            kotlin.ResultKt.throwOnFailure(r20)
            goto L_0x00d7
        L_0x002c:
            kotlin.ResultKt.throwOnFailure(r20)
            evd r2 = r0.c
            hud r2 = r2.a
            if (r2 == 0) goto L_0x0036
            goto L_0x0037
        L_0x0036:
            r2 = r6
        L_0x0037:
            kotlin.Lazy r2 = r2.W
            java.lang.Object r2 = r2.getValue()
            k78 r2 = (defpackage.k78) r2
            kotlin.Lazy r2 = r2.y
            java.lang.Object r2 = r2.getValue()
            java.util.EnumSet r2 = (java.util.EnumSet) r2
            h78 r8 = defpackage.h78.b
            boolean r2 = r2.contains(r8)
            if (r2 != 0) goto L_0x0071
            evd r2 = r0.c
            hud r2 = r2.a
            if (r2 == 0) goto L_0x0056
            goto L_0x0057
        L_0x0056:
            r2 = r6
        L_0x0057:
            kotlin.Lazy r2 = r2.j0
            java.lang.Object r2 = r2.getValue()
            nh3 r2 = (defpackage.nh3) r2
            boolean r2 = r2.f()
            if (r2 != 0) goto L_0x0071
            evd r0 = r0.c
            java.lang.String r0 = r0.o
            java.lang.String r1 = "Not logged in session, skip task"
            defpackage.z68.c(r0, r1, new java.lang.Object[0])
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0071:
            evd r2 = r0.c
            boolean r8 = r2.c
            if (r8 == 0) goto L_0x00f5
            java.lang.String r2 = r2.o
            a67 r4 = defpackage.z68.b
            if (r4 != 0) goto L_0x007e
            goto L_0x008b
        L_0x007e:
            boolean r8 = r4.c()
            if (r8 == 0) goto L_0x008b
            w78 r8 = defpackage.w78.o
            java.lang.String r9 = "Starting flushing all strategy"
            r4.d(r8, r2, r9, r6)
        L_0x008b:
            kotlin.jvm.internal.Ref$IntRef r2 = new kotlin.jvm.internal.Ref$IntRef
            r2.<init>()
            evd r4 = r0.c
            hud r4 = r4.a
            if (r4 == 0) goto L_0x0097
            goto L_0x0098
        L_0x0097:
            r4 = r6
        L_0x0098:
            kotlin.Lazy r4 = r4.W
            java.lang.Object r4 = r4.getValue()
            k78 r4 = (defpackage.k78) r4
            evd r8 = r0.c
            ued r9 = new ued
            r10 = 4
            r9.<init>(r10, r8, r2)
            r0.a = r2
            r0.b = r14
            o7d r4 = r4.b()
            gaf r8 = r4.a
            osa r8 = (defpackage.osa) r8
            q04 r8 = r8.b()
            l7d r10 = new l7d
            r10.<init>(r4, r9, r6)
            java.lang.Object r4 = defpackage.ev0.I(r8, r10, r0)
            java.lang.Object r8 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r4 != r8) goto L_0x00c8
            goto L_0x00ca
        L_0x00c8:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
        L_0x00ca:
            java.lang.Object r8 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r4 != r8) goto L_0x00d1
            goto L_0x00d3
        L_0x00d1:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
        L_0x00d3:
            if (r4 != r1) goto L_0x00d6
            return r1
        L_0x00d6:
            r1 = r2
        L_0x00d7:
            int r2 = r1.element
            r4 = 1000(0x3e8, float:1.401E-42)
            if (r2 <= r4) goto L_0x01d1
            evd r0 = r0.c
            m95 r0 = r0.j()
            ru.ok.tamtam.ExceptionHandler$HandledException r2 = new ru.ok.tamtam.ExceptionHandler$HandledException
            int r1 = r1.element
            java.lang.String r4 = " analytic events!"
            java.lang.String r1 = defpackage.a81.j(r1, r7, r4)
            r2.<init>(r1, r6, r5, r3)
            ((defpackage.uta) r0).c(r2, false)
            goto L_0x01d1
        L_0x00f5:
            hud r2 = r2.a
            if (r2 == 0) goto L_0x00fa
            goto L_0x00fb
        L_0x00fa:
            r2 = r6
        L_0x00fb:
            kotlin.Lazy r2 = r2.W
            java.lang.Object r2 = r2.getValue()
            k78 r2 = (defpackage.k78) r2
            r0.b = r5
            o7d r2 = r2.b()
            rne r2 = r2.a()
            r2.getClass()
            java.lang.String r8 = "\n            SELECT id FROM events\n            WHERE status = 0 AND isCritical = 1\n        "
            d7d r8 = defpackage.d7d.a(r4, r8)
            android.os.CancellationSignal r9 = new android.os.CancellationSignal
            r9.<init>()
            qne r10 = new qne
            r11 = 3
            r10.<init>(r2, r8, r11)
            i6d r2 = r2.a
            java.lang.Object r2 = defpackage.i8b.q(r2, r9, r10, r0)
            if (r2 != r1) goto L_0x012a
            return r1
        L_0x012a:
            java.util.List r2 = (java.util.List) r2
            evd r1 = r0.c
            java.lang.String r1 = r1.o
            a67 r8 = defpackage.z68.b
            if (r8 != 0) goto L_0x0135
            goto L_0x014e
        L_0x0135:
            boolean r9 = r8.c()
            if (r9 == 0) goto L_0x014e
            w78 r9 = defpackage.w78.o
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "Starting critical ids="
            r10.<init>(r11)
            r10.append(r2)
            java.lang.String r10 = r10.toString()
            r8.d(r9, r1, r10, r6)
        L_0x014e:
            r1 = r2
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ r14
            if (r1 == 0) goto L_0x01b1
            evd r1 = r0.c
            rl r1 = r1.a()
            evd r8 = r0.c
            boolean r15 = r8.b
            jna r1 = (defpackage.jna) r1
            r1.getClass()
            boolean r8 = r2.isEmpty()
            if (r8 == 0) goto L_0x016e
            goto L_0x01b1
        L_0x016e:
            r8 = r2
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.List r13 = kotlin.collections.CollectionsKt___CollectionsKt.windowed(r8, 100, 100, true)
            int r12 = r13.size()
            long[] r11 = new long[r12]
        L_0x017b:
            if (r4 >= r12) goto L_0x01b1
            java.lang.Object r8 = r13.get(r4)
            r16 = r8
            java.util.List r16 = (java.util.List) r16
            jtb r8 = r1.D()
            ltb r8 = (defpackage.ltb) r8
            a33 r8 = r8.a
            long r9 = r8.n()
            d78 r8 = new d78
            r20 = r8
            r17 = r11
            r11 = r16
            r16 = r12
            r12 = r14
            r18 = r13
            r13 = r15
            r8.<init>(r9, r11, r12, r13)
            long r8 = defpackage.jna.z(r1, r8)
            r17[r4] = r8
            int r4 = r4 + 1
            r12 = r16
            r11 = r17
            r13 = r18
            goto L_0x017b
        L_0x01b1:
            int r1 = r2.size()
            r4 = 10
            if (r1 <= r4) goto L_0x01d1
            evd r0 = r0.c
            m95 r0 = r0.j()
            ru.ok.tamtam.ExceptionHandler$HandledException r1 = new ru.ok.tamtam.ExceptionHandler$HandledException
            int r2 = r2.size()
            java.lang.String r4 = " critical analytic events!"
            java.lang.String r2 = defpackage.a81.j(r2, r7, r4)
            r1.<init>(r2, r6, r5, r3)
            ((defpackage.uta) r0).c(r1, false)
        L_0x01d1:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dvd.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
