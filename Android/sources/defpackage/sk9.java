package defpackage;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* renamed from: sk9  reason: default package */
public final class sk9 extends SuspendLambda implements Function2 {
    public wj9 a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ en9 o;
    public final /* synthetic */ Ref.BooleanRef v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sk9(en9 en9, Ref.BooleanRef booleanRef, Continuation continuation) {
        super(2, continuation);
        this.o = en9;
        this.v = booleanRef;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        sk9 sk9 = new sk9(this.o, this.v, continuation);
        sk9.c = obj;
        return sk9;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((sk9) create((Pair) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00b4, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) defpackage.wj9.o) != false) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00c0, code lost:
        if (((defpackage.zhd) r8.s1.a.getValue()) != null) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00c6, code lost:
        if (r8.s1.b == false) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00c8, code lost:
        r10 = r2.a;
        r0.c = r9;
        r0.a = r2;
        r0.b = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00d5, code lost:
        if (defpackage.en9.j(r8, r9, r10, r0) != r1) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00d7, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00da, code lost:
        if (r4.element != false) goto L_0x0174;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00dc, code lost:
        r10 = defpackage.kr7.t(r9);
        r12 = r2.g(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00e4, code lost:
        if (r12 >= 0) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e6, code lost:
        r12 = java.lang.Math.abs(r12) - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00eb, code lost:
        r13 = r2.a;
        r14 = (one.me.messages.list.loader.MessageModel) kotlin.collections.CollectionsKt.getOrNull(r13, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00f3, code lost:
        if (r14 == null) goto L_0x00fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00f9, code lost:
        if (r14.c != r10) goto L_0x00fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00fb, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00fd, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00fe, code lost:
        if (r12 != 0) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0102, code lost:
        if (r2.c == false) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0104, code lost:
        if (r6 != false) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0106, code lost:
        r4.element = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x010a, code lost:
        if (r14 == null) goto L_0x0171;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x010c, code lost:
        r7 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0111, code lost:
        if (r10 >= r14.c) goto L_0x0126;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0113, code lost:
        r3 = r8.r1;
        r0.c = r2;
        r0.a = null;
        r0.b = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0121, code lost:
        if (r3.h(r10, r0) != r1) goto L_0x0124;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0123, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0126, code lost:
        if (r6 == false) goto L_0x0159;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0128, code lost:
        r3 = (one.me.messages.list.loader.MessageModel) kotlin.collections.CollectionsKt.getOrNull(r13, r12 + 1);
        r12 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0134, code lost:
        if (r3 == null) goto L_0x0142;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x013a, code lost:
        if (r3.b != 0) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x013d, code lost:
        r12 = r3.c - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0144, code lost:
        if (r2.b == false) goto L_0x0148;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0146, code lost:
        r12 = r10 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0148, code lost:
        r3 = r8.r1;
        r0.c = r2;
        r0.a = null;
        r0.b = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0156, code lost:
        if (r3.h(r12, r0) != r1) goto L_0x0124;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0158, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0159, code lost:
        r3 = r8.r1;
        r4 = defpackage.kr7.t(r9);
        r0.c = r2;
        r0.a = null;
        r0.b = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x016b, code lost:
        if (r3.h(r4, r0) != r1) goto L_0x0124;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x016d, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x016e, code lost:
        r7.element = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0171, code lost:
        r4.element = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0174, code lost:
        r3 = r8.l1;
        r0.c = null;
        r0.a = null;
        r0.b = 6;
        r3.setValue(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0183, code lost:
        if (kotlin.Unit.INSTANCE != r1) goto L_0x0186;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0185, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0188, code lost:
        return kotlin.Unit.INSTANCE;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            r19 = this;
            r0 = r19
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.b
            r3 = 3
            kotlin.jvm.internal.Ref$BooleanRef r4 = r0.v
            r5 = 0
            r6 = 1
            r7 = 0
            en9 r8 = r0.o
            switch(r2) {
                case 0: goto L_0x0040;
                case 1: goto L_0x0035;
                case 2: goto L_0x002a;
                case 3: goto L_0x0020;
                case 4: goto L_0x0020;
                case 5: goto L_0x0020;
                case 6: goto L_0x001b;
                default: goto L_0x0013;
            }
        L_0x0013:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x001b:
            kotlin.ResultKt.throwOnFailure(r20)
            goto L_0x0186
        L_0x0020:
            java.lang.Object r2 = r0.c
            wj9 r2 = (defpackage.wj9) r2
            kotlin.ResultKt.throwOnFailure(r20)
            r7 = r4
            goto L_0x0124
        L_0x002a:
            wj9 r2 = r0.a
            java.lang.Object r9 = r0.c
            a32 r9 = (defpackage.a32) r9
            kotlin.ResultKt.throwOnFailure(r20)
            goto L_0x00d8
        L_0x0035:
            wj9 r2 = r0.a
            java.lang.Object r9 = r0.c
            a32 r9 = (defpackage.a32) r9
            kotlin.ResultKt.throwOnFailure(r20)
            goto L_0x00ae
        L_0x0040:
            kotlin.ResultKt.throwOnFailure(r20)
            java.lang.Object r2 = r0.c
            kotlin.Pair r2 = (kotlin.Pair) r2
            java.lang.Object r9 = r2.component1()
            a32 r9 = (defpackage.a32) r9
            java.lang.Object r2 = r2.component2()
            wj9 r2 = (defpackage.wj9) r2
            java.util.List r10 = r2.a
            int r10 = r10.size()
            r0.c = r9
            r0.a = r2
            r0.b = r6
            xme r11 = r8.o1
            java.lang.Object r12 = r11.getValue()
            r13 = r12
            hid r13 = (defpackage.hid) r13
            m72 r12 = r9.b
            int r14 = r12.m
            boolean r16 = r9.D()
            java.lang.Object r12 = r11.getValue()
            hid r12 = (defpackage.hid) r12
            boolean r12 = r12.b
            if (r12 == 0) goto L_0x007e
            if (r10 == 0) goto L_0x007e
            r15 = r6
            goto L_0x007f
        L_0x007e:
            r15 = r5
        L_0x007f:
            r17 = 0
            r18 = 8
            hid r12 = defpackage.hid.a(r13, r14, r15, r16, r17, r18)
            r11.m(r7, r12)
            m72 r11 = r9.b
            java.lang.String r11 = r11.m0
            if (r11 == 0) goto L_0x0099
            int r11 = r11.length()
            if (r11 != 0) goto L_0x0097
            goto L_0x0099
        L_0x0097:
            r11 = r5
            goto L_0x009a
        L_0x0099:
            r11 = r6
        L_0x009a:
            r11 = r11 ^ r6
            if (r11 == 0) goto L_0x00a9
            if (r10 == 0) goto L_0x00a9
            dn9 r10 = new dn9
            r10.<init>(r9, r8, r7)
            jx3 r11 = r8.a
            defpackage.ev0.v(r11, r7, r7, r10, r3)
        L_0x00a9:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            if (r10 != r1) goto L_0x00ae
            return r1
        L_0x00ae:
            wj9 r10 = defpackage.wj9.o
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r10)
            if (r10 != 0) goto L_0x00d8
            cid r10 = r8.s1
            tz9 r10 = r10.a
            java.lang.Object r10 = r10.getValue()
            zhd r10 = (defpackage.zhd) r10
            if (r10 != 0) goto L_0x00d8
            cid r10 = r8.s1
            boolean r10 = r10.b
            if (r10 == 0) goto L_0x00d8
            java.util.List r10 = r2.a
            r0.c = r9
            r0.a = r2
            r11 = 2
            r0.b = r11
            java.lang.Object r10 = defpackage.en9.j(r8, r9, r10, r0)
            if (r10 != r1) goto L_0x00d8
            return r1
        L_0x00d8:
            boolean r10 = r4.element
            if (r10 != 0) goto L_0x0174
            long r10 = defpackage.kr7.t(r9)
            int r12 = r2.g(r10)
            if (r12 >= 0) goto L_0x00eb
            int r12 = java.lang.Math.abs(r12)
            int r12 = r12 - r6
        L_0x00eb:
            java.util.List r13 = r2.a
            java.lang.Object r14 = kotlin.collections.CollectionsKt.getOrNull(r13, r12)
            one.me.messages.list.loader.MessageModel r14 = (one.me.messages.list.loader.MessageModel) r14
            if (r14 == 0) goto L_0x00fd
            long r6 = r14.c
            int r6 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r6 != 0) goto L_0x00fd
            r6 = 1
            goto L_0x00fe
        L_0x00fd:
            r6 = r5
        L_0x00fe:
            if (r12 != 0) goto L_0x010a
            boolean r7 = r2.c
            if (r7 == 0) goto L_0x010a
            if (r6 != 0) goto L_0x010a
            r4.element = r5
            goto L_0x0174
        L_0x010a:
            if (r14 == 0) goto L_0x0171
            r7 = r4
            long r3 = r14.c
            int r3 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r3 >= 0) goto L_0x0126
            s85 r3 = r8.r1
            r0.c = r2
            r4 = 0
            r0.a = r4
            r4 = 3
            r0.b = r4
            java.lang.Object r3 = r3.h(r10, r0)
            if (r3 != r1) goto L_0x0124
            return r1
        L_0x0124:
            r3 = 1
            goto L_0x016e
        L_0x0126:
            if (r6 == 0) goto L_0x0159
            r3 = 1
            int r12 = r12 + r3
            java.lang.Object r3 = kotlin.collections.CollectionsKt.getOrNull(r13, r12)
            one.me.messages.list.loader.MessageModel r3 = (one.me.messages.list.loader.MessageModel) r3
            r4 = 1
            r12 = 0
            if (r3 == 0) goto L_0x0142
            long r9 = r3.b
            int r6 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r6 != 0) goto L_0x013d
            goto L_0x0148
        L_0x013d:
            long r9 = r3.c
            long r12 = r9 - r4
            goto L_0x0148
        L_0x0142:
            boolean r3 = r2.b
            if (r3 == 0) goto L_0x0148
            long r12 = r10 + r4
        L_0x0148:
            s85 r3 = r8.r1
            r0.c = r2
            r4 = 0
            r0.a = r4
            r4 = 4
            r0.b = r4
            java.lang.Object r3 = r3.h(r12, r0)
            if (r3 != r1) goto L_0x0124
            return r1
        L_0x0159:
            s85 r3 = r8.r1
            long r4 = defpackage.kr7.t(r9)
            r0.c = r2
            r6 = 0
            r0.a = r6
            r6 = 5
            r0.b = r6
            java.lang.Object r3 = r3.h(r4, r0)
            if (r3 != r1) goto L_0x0124
            return r1
        L_0x016e:
            r7.element = r3
            goto L_0x0174
        L_0x0171:
            r7 = r4
            r7.element = r5
        L_0x0174:
            xme r3 = r8.l1
            r4 = 0
            r0.c = r4
            r0.a = r4
            r4 = 6
            r0.b = r4
            r3.setValue(r2)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            if (r0 != r1) goto L_0x0186
            return r1
        L_0x0186:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sk9.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
