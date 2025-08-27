package defpackage;

import android.content.Context;
import kotlin.Lazy;

/* renamed from: dld  reason: default package */
public final class dld {
    public final Context a;
    public final yva b;
    public final fq2 c;
    public final lua d;
    public final qx2 e;
    public final rtb f;
    public final x23 g;
    public final Lazy h;

    public dld(Context context, yva yva, fq2 fq2, lua lua, qx2 qx2, rtb rtb, x23 x23, Lazy lazy) {
        this.a = context;
        this.b = yva;
        this.c = fq2;
        this.d = lua;
        this.e = qx2;
        this.f = rtb;
        this.g = x23;
        this.h = lazy;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(defpackage.ald r19, kotlin.coroutines.Continuation r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            boolean r3 = r2 instanceof defpackage.cld
            if (r3 == 0) goto L_0x0019
            r3 = r2
            cld r3 = (defpackage.cld) r3
            int r4 = r3.v
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.v = r4
            goto L_0x001e
        L_0x0019:
            cld r3 = new cld
            r3.<init>(r0, r2)
        L_0x001e:
            java.lang.Object r2 = r3.c
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r3.v
            r6 = 1
            if (r5 == 0) goto L_0x0040
            if (r5 != r6) goto L_0x0038
            ald r0 = r3.b
            dld r1 = r3.a
            kotlin.ResultKt.throwOnFailure(r2)
            r17 = r1
            r1 = r0
            r0 = r17
            goto L_0x005a
        L_0x0038:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0040:
            kotlin.ResultKt.throwOnFailure(r2)
            a32 r2 = r1.o
            if (r2 != 0) goto L_0x005c
            qx2 r2 = r0.e
            long r7 = r1.x
            r3.a = r0
            r3.b = r1
            r3.v = r6
            my2 r2 = (defpackage.my2) r2
            java.lang.Object r2 = r2.m(r7, r3)
            if (r2 != r4) goto L_0x005a
            return r4
        L_0x005a:
            a32 r2 = (defpackage.a32) r2
        L_0x005c:
            r11 = r2
            r2 = 0
            if (r11 == 0) goto L_0x007a
            kl0 r3 = defpackage.kl0.c
            jl0 r4 = defpackage.jl0.a
            java.lang.String r3 = r11.h(r3, r4)
            if (r3 == 0) goto L_0x007a
            boolean r4 = kotlin.text.StringsKt.isBlank(r3)
            if (r4 != 0) goto L_0x0071
            goto L_0x0072
        L_0x0071:
            r3 = r2
        L_0x0072:
            if (r3 == 0) goto L_0x007a
            android.net.Uri r3 = defpackage.o5a.x(r3)
            r8 = r3
            goto L_0x007b
        L_0x007a:
            r8 = r2
        L_0x007b:
            b89 r3 = r1.w
            lc9 r4 = r3.z
            r5 = 0
            if (r4 == 0) goto L_0x0085
            int r7 = r4.a
            goto L_0x0086
        L_0x0085:
            r7 = r5
        L_0x0086:
            r9 = 3
            if (r7 != r9) goto L_0x008b
            b89 r3 = r4.c
        L_0x008b:
            r10 = r3
            if (r11 == 0) goto L_0x0093
            r11.l0()
            java.lang.CharSequence r2 = r11.X
        L_0x0093:
            r14 = r2
            java.util.List r2 = r10.A0
            java.util.ArrayList r2 = defpackage.qe8.u(r2)
            java.lang.String r3 = r10.x
            java.lang.String r4 = ""
            if (r3 == 0) goto L_0x00a6
            java.lang.String r3 = defpackage.hhf.f(r3)
            if (r3 != 0) goto L_0x00a7
        L_0x00a6:
            r3 = r4
        L_0x00a7:
            java.util.List r7 = r1.c
            java.util.Collection r7 = (java.util.Collection) r7
            boolean r7 = r7.isEmpty()
            r7 = r7 ^ r6
            if (r7 == 0) goto L_0x0184
            lua r7 = r0.d
            yva r0 = r0.b
            isb r0 = r0.k(r3, r2)
            java.util.List r2 = r1.c
            r7.getClass()
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L_0x00c7
            goto L_0x0182
        L_0x00c7:
            java.lang.CharSequence r3 = r0.a
            java.lang.String r3 = r3.toString()
            java.util.List r3 = defpackage.n54.j(r3, r2)
            r12 = r3
            java.util.Collection r12 = (java.util.Collection) r12
            boolean r12 = r12.isEmpty()
            r12 = r12 ^ r6
            java.lang.String[] r13 = r0.b
            if (r12 == 0) goto L_0x00f7
            js9 r2 = defpackage.fu4.k
            android.content.Context r4 = r7.a
            fu4 r2 = r2.e(r4)
            k2b r2 = r2.f()
            java.lang.CharSequence r0 = r0.a
            android.text.SpannableString r0 = defpackage.n54.o(r0, r3, r2)
            isb r2 = new isb
            r2.<init>(r0, r13)
            r0 = r2
            goto L_0x0182
        L_0x00f7:
            a00 r3 = r10.y
            boolean r12 = r3.isEmpty()
            if (r12 == 0) goto L_0x0101
            goto L_0x0182
        L_0x0101:
            java.util.Iterator r3 = r3.iterator()
        L_0x0105:
            boolean r12 = r3.hasNext()
            if (r12 == 0) goto L_0x0176
            java.lang.Object r12 = r3.next()
            gz r12 = (defpackage.gz) r12
            b10 r15 = r12.a
            if (r15 != 0) goto L_0x0117
            r15 = -1
            goto L_0x011f
        L_0x0117:
            int[] r16 = defpackage.kua.$EnumSwitchMapping$0
            int r15 = r15.ordinal()
            r15 = r16[r15]
        L_0x011f:
            if (r15 == r6) goto L_0x015e
            r6 = 2
            if (r15 == r6) goto L_0x014b
            if (r15 == r9) goto L_0x013a
            r6 = 4
            if (r15 == r6) goto L_0x012b
        L_0x0129:
            r12 = 1
            goto L_0x016d
        L_0x012b:
            v20 r12 = (defpackage.v20) r12
            java.lang.String r4 = r12.z
            java.lang.String[] r4 = new java.lang.String[]{r4}
            java.lang.String r6 = "🎤"
            java.lang.CharSequence r4 = r7.a(r6, r2, r5, r4)
            goto L_0x0129
        L_0x013a:
            al3 r12 = (defpackage.al3) r12
            java.lang.String r4 = r12.x
            java.lang.String r6 = r12.y
            java.lang.String[] r4 = new java.lang.String[]{r4, r6}
            java.lang.String r6 = "👤"
            java.lang.CharSequence r4 = r7.a(r6, r2, r5, r4)
            goto L_0x0129
        L_0x014b:
            v4e r12 = (defpackage.v4e) r12
            java.lang.String r4 = r12.w
            java.lang.String r6 = r12.x
            java.lang.String r12 = r12.y
            java.lang.String[] r4 = new java.lang.String[]{r12, r4, r6}
            java.lang.String r6 = "🔗"
            java.lang.CharSequence r4 = r7.a(r6, r2, r5, r4)
            goto L_0x0129
        L_0x015e:
            nk5 r12 = (defpackage.nk5) r12
            java.lang.String r4 = r12.w
            java.lang.String[] r4 = new java.lang.String[]{r4}
            java.lang.String r6 = "📄"
            r12 = 1
            java.lang.CharSequence r4 = r7.a(r6, r2, r12, r4)
        L_0x016d:
            int r6 = r4.length()
            if (r6 <= 0) goto L_0x0174
            goto L_0x0176
        L_0x0174:
            r6 = r12
            goto L_0x0105
        L_0x0176:
            int r2 = r4.length()
            if (r2 != 0) goto L_0x017d
            goto L_0x0182
        L_0x017d:
            isb r0 = new isb
            r0.<init>(r4, r13)
        L_0x0182:
            r13 = r0
            goto L_0x018b
        L_0x0184:
            yva r0 = r0.b
            isb r0 = r0.k(r3, r2)
            goto L_0x0182
        L_0x018b:
            ge9 r0 = new ge9
            java.util.List r9 = r1.c
            java.lang.String r12 = r1.b
            long r1 = r1.x
            r7 = r0
            r15 = r1
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dld.a(ald, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v5, resolved type: java.lang.CharSequence} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v0, resolved type: java.lang.CharSequence} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v6, resolved type: java.lang.CharSequence} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x025e  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0261  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0268  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x027f  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0287  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0305  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0326  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0329  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x03b8  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x03bb  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x03df  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x03f2  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0461  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x0487  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x0489  */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x04cf  */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x04ea  */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x0523  */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x0526  */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x0534  */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x0537  */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x0589  */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x058b  */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x0596  */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x0599  */
    /* JADX WARNING: Removed duplicated region for block: B:280:0x05b9  */
    /* JADX WARNING: Removed duplicated region for block: B:281:0x05bc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(defpackage.ald r47, kotlin.coroutines.Continuation r48) {
        /*
            r46 = this;
            r0 = r46
            r1 = r47
            r2 = 7
            r3 = 16
            int r4 = r1.a
            jl0 r5 = defpackage.jl0.a
            kl0 r6 = defpackage.kl0.c
            js9 r7 = defpackage.fu4.k
            r8 = 5
            r10 = 4
            r11 = 1
            r12 = 2
            r13 = 0
            if (r4 == r11) goto L_0x036f
            if (r4 != r12) goto L_0x001a
            goto L_0x036f
        L_0x001a:
            r15 = 40
            r14 = 20
            r9 = 10
            if (r4 != r10) goto L_0x0123
            android.content.Context r4 = r0.a
            fu4 r5 = r7.e(r4)
            k2b r5 = r5.f()
            vk3 r6 = r1.v
            java.util.List r7 = r1.c
            java.lang.Object r8 = kotlin.collections.CollectionsKt.firstOrNull(r7)
            java.lang.String r8 = (java.lang.String) r8
            java.util.List r10 = r6.l()
            java.lang.String r6 = r6.m()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            kotlin.sequences.Sequence r10 = kotlin.collections.CollectionsKt.asSequence(r10)
            oo9 r12 = new oo9
            r12.<init>(r3)
            kotlin.sequences.Sequence r3 = kotlin.sequences.SequencesKt.map(r10, r12)
            kotlin.sequences.Sequence r3 = kotlin.sequences.SequencesKt___SequencesKt.plus(r3, r6)
            iz1 r6 = new iz1
            r6.<init>(r8, r2)
            kotlin.sequences.Sequence r2 = kotlin.sequences.SequencesKt.filter(r3, r6)
            ep1 r3 = new ep1
            r3.<init>(r8, r5)
            kotlin.sequences.Sequence r2 = kotlin.sequences.SequencesKt.map(r2, r3)
            java.lang.Object r2 = kotlin.sequences.SequencesKt.first(r2)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            java.util.Collection r7 = (java.util.Collection) r7
            boolean r3 = r7.isEmpty()
            r3 = r3 ^ r11
            vk3 r5 = r1.v
            if (r3 == 0) goto L_0x0090
            int r3 = r2.length()
            if (r3 <= 0) goto L_0x008b
            java.lang.String r3 = r2.toString()
            java.lang.String r6 = r5.f()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r6)
            if (r3 == 0) goto L_0x008b
        L_0x0088:
            r19 = r2
            goto L_0x0097
        L_0x008b:
            java.lang.String r2 = r5.f()
            goto L_0x0088
        L_0x0090:
            yva r2 = r0.b
            java.lang.CharSequence r2 = r5.p(r2)
            goto L_0x0088
        L_0x0097:
            boolean r2 = r5.y()
            rtb r3 = r0.f
            if (r2 == 0) goto L_0x00a2
            r20 = 0
            goto L_0x00d4
        L_0x00a2:
            boolean r2 = r5.w
            if (r2 == 0) goto L_0x00af
            int r2 = defpackage.jad.I
            java.lang.String r2 = r4.getString(r2)
        L_0x00ac:
            r20 = r2
            goto L_0x00d4
        L_0x00af:
            boolean r2 = r5.x()
            if (r2 == 0) goto L_0x00c2
            boolean r2 = r5.A()
            if (r2 == 0) goto L_0x00c2
            int r2 = defpackage.qad.T8
            java.lang.String r2 = r4.getString(r2)
            goto L_0x00ac
        L_0x00c2:
            boolean r2 = r5.x()
            if (r2 == 0) goto L_0x00cf
            int r2 = defpackage.qad.J
            java.lang.String r2 = r4.getString(r2)
            goto L_0x00ac
        L_0x00cf:
            java.lang.CharSequence r2 = r3.d(r5, r11)
            goto L_0x00ac
        L_0x00d4:
            long r6 = r5.r()
            ptb r2 = r3.e()
            mtb r2 = r2.b(r6)
            int r2 = r2.a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r3 = r2.intValue()
            if (r3 == r9) goto L_0x00fc
            int r3 = r2.intValue()
            if (r3 == r14) goto L_0x00fc
            int r2 = r2.intValue()
            if (r2 != r15) goto L_0x00f9
            goto L_0x00fc
        L_0x00f9:
            r21 = r13
            goto L_0x00fe
        L_0x00fc:
            r21 = r11
        L_0x00fe:
            bs3 r2 = new bs3
            long r17 = r5.r()
            boolean r22 = r5.z()
            x23 r0 = r0.g
            qjd r0 = (defpackage.qjd) r0
            java.lang.String r0 = r0.p()
            android.net.Uri r24 = defpackage.yd0.d(r5, r0, r13)
            java.lang.CharSequence r25 = r5.q()
            java.util.List r0 = r1.c
            r16 = r2
            r23 = r0
            r16.<init>(r17, r19, r20, r21, r22, r23, r24, r25)
            goto L_0x05cd
        L_0x0123:
            java.lang.String r2 = ""
            java.lang.String r3 = "Required value was null."
            if (r4 != r8) goto L_0x0211
            bac r10 = r1.y
            if (r10 == 0) goto L_0x0134
            cs3 r8 = r10.c
            if (r8 == 0) goto L_0x0134
            fo3 r8 = r8.a
            goto L_0x0135
        L_0x0134:
            r8 = 0
        L_0x0135:
            if (r8 == 0) goto L_0x0210
            if (r10 == 0) goto L_0x013c
            cs3 r4 = r10.c
            goto L_0x013d
        L_0x013c:
            r4 = 0
        L_0x013d:
            if (r4 == 0) goto L_0x0206
            fo3 r5 = r4.a
            if (r5 == 0) goto L_0x01fc
            ued r3 = new ued
            r3.<init>(r12, r0, r1)
            java.lang.String r0 = r5.a()
            if (r0 == 0) goto L_0x0157
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0155
            goto L_0x0157
        L_0x0155:
            r0 = r13
            goto L_0x0158
        L_0x0157:
            r0 = r11
        L_0x0158:
            r0 = r0 ^ r11
            if (r0 == 0) goto L_0x0168
            java.lang.String r0 = r5.a()
            java.lang.Object r0 = r3.invoke(r0)
            isb r0 = (defpackage.isb) r0
        L_0x0165:
            r20 = r0
            goto L_0x016d
        L_0x0168:
            isb r0 = defpackage.isb.a()
            goto L_0x0165
        L_0x016d:
            java.util.regex.Pattern r0 = defpackage.vua.a
            java.util.List r0 = r5.v
            boolean r6 = r0.isEmpty()
            if (r6 == 0) goto L_0x0179
            r0 = 0
            goto L_0x0181
        L_0x0179:
            java.lang.Object r0 = r0.get(r13)
            er3 r0 = (defpackage.er3) r0
            java.lang.String r0 = r0.a
        L_0x0181:
            if (r0 != 0) goto L_0x0184
            goto L_0x0185
        L_0x0184:
            r2 = r0
        L_0x0185:
            java.util.List r0 = r5.v
            boolean r6 = r0.isEmpty()
            if (r6 == 0) goto L_0x018f
            r0 = 0
            goto L_0x0197
        L_0x018f:
            java.lang.Object r0 = r0.get(r13)
            er3 r0 = (defpackage.er3) r0
            java.lang.String r0 = r0.c
        L_0x0197:
            java.lang.String r19 = defpackage.vua.b(r2, r0)
            java.lang.String r0 = r5.Z
            java.lang.String r0 = defpackage.hhf.c(r0)
            sjd r2 = defpackage.sjd.a
            tld r2 = r2.w()
            java.util.List r6 = r1.c
            java.util.List r2 = r2.d(r0, r6)
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            r2 = r2 ^ r11
            if (r2 == 0) goto L_0x01bf
            java.lang.Object r0 = r3.invoke(r0)
            isb r0 = (defpackage.isb) r0
        L_0x01bc:
            r21 = r0
            goto L_0x01c4
        L_0x01bf:
            isb r0 = defpackage.isb.a()
            goto L_0x01bc
        L_0x01c4:
            ntb r0 = r4.o
            mtb r0 = defpackage.qe8.l(r0)
            int r2 = r0.a
            if (r2 == r9) goto L_0x01d5
            if (r2 == r14) goto L_0x01d5
            if (r2 == r15) goto L_0x01d5
            r22 = r13
            goto L_0x01d7
        L_0x01d5:
            r22 = r11
        L_0x01d7:
            ss6 r2 = new ss6
            eo3 r3 = defpackage.eo3.OFFICIAL
            java.util.List r4 = r5.X
            boolean r23 = r4.contains(r3)
            java.lang.String r3 = r5.b()
            android.net.Uri r24 = defpackage.o5a.x(r3)
            java.util.List r1 = r1.c
            long r3 = r5.a
            r16 = r2
            r17 = r3
            r25 = r0
            r26 = r5
            r27 = r1
            r16.<init>(r17, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            goto L_0x05cd
        L_0x01fc:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r3.toString()
            r0.<init>(r1)
            throw r0
        L_0x0206:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r3.toString()
            r0.<init>(r1)
            throw r0
        L_0x0210:
            r8 = 5
        L_0x0211:
            if (r4 != r8) goto L_0x034a
            bac r8 = r1.y
            if (r8 == 0) goto L_0x021a
            b32 r9 = r8.a
            goto L_0x021b
        L_0x021a:
            r9 = 0
        L_0x021b:
            if (r9 == 0) goto L_0x034a
            if (r8 == 0) goto L_0x0222
            b32 r4 = r8.a
            goto L_0x0223
        L_0x0222:
            r4 = 0
        L_0x0223:
            if (r4 == 0) goto L_0x0340
            java.lang.String r3 = r4.x
            boolean r8 = defpackage.cvg.A(r3)
            if (r8 != 0) goto L_0x0232
            java.lang.String r3 = defpackage.cjf.A(r3, r6, r5)
            goto L_0x0233
        L_0x0232:
            r3 = 0
        L_0x0233:
            if (r3 == 0) goto L_0x0246
            boolean r5 = kotlin.text.StringsKt.isBlank(r3)
            if (r5 != 0) goto L_0x023c
            goto L_0x023d
        L_0x023c:
            r3 = 0
        L_0x023d:
            if (r3 == 0) goto L_0x0246
            android.net.Uri r3 = defpackage.o5a.x(r3)
            r22 = r3
            goto L_0x0248
        L_0x0246:
            r22 = 0
        L_0x0248:
            yva r3 = r0.b
            java.lang.String r5 = r4.w
            isb r23 = r3.j(r5)
            java.lang.CharSequence r27 = defpackage.vua.a(r5, r3)
            java.lang.String r6 = r4.B0
            java.lang.String r6 = defpackage.hhf.c(r6)
            bac r8 = r1.y
            if (r8 == 0) goto L_0x0261
            java.util.List r9 = r8.b
            goto L_0x0262
        L_0x0261:
            r9 = 0
        L_0x0262:
            boolean r9 = defpackage.n54.v(r6, r9)
            if (r9 != 0) goto L_0x0276
            if (r8 == 0) goto L_0x026d
            java.util.List r10 = r8.b
            goto L_0x026e
        L_0x026d:
            r10 = 0
        L_0x026e:
            boolean r5 = defpackage.n54.v(r5, r10)
            if (r5 == 0) goto L_0x0276
            r5 = r11
            goto L_0x0277
        L_0x0276:
            r5 = r13
        L_0x0277:
            int r10 = r4.V0
            r12 = 4
            if (r10 == r12) goto L_0x0287
            r12 = 3
            if (r10 == r12) goto L_0x0287
            isb r3 = defpackage.isb.a()
            r24 = r3
            goto L_0x0301
        L_0x0287:
            java.lang.String r12 = r4.x0
            if (r9 == 0) goto L_0x0290
            isb r14 = r3.j(r6)
            goto L_0x02b1
        L_0x0290:
            if (r5 != 0) goto L_0x02b0
            if (r8 == 0) goto L_0x0297
            java.util.List r5 = r8.b
            goto L_0x0298
        L_0x0297:
            r5 = 0
        L_0x0298:
            sjd r8 = defpackage.sjd.a
            tld r8 = r8.w()
            java.util.List r5 = r8.d(r12, r5)
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = r5.isEmpty()
            r5 = r5 ^ r11
            if (r5 == 0) goto L_0x02b0
            isb r14 = r3.j(r12)
            goto L_0x02b1
        L_0x02b0:
            r14 = 0
        L_0x02b1:
            if (r14 == 0) goto L_0x02bb
            java.lang.CharSequence r5 = r14.a
            int r5 = r5.length()
            if (r5 != 0) goto L_0x02cf
        L_0x02bb:
            if (r12 == 0) goto L_0x02ca
            int r5 = r12.length()
            if (r5 != 0) goto L_0x02c4
            goto L_0x02ca
        L_0x02c4:
            isb r5 = r3.j(r12)
        L_0x02c8:
            r14 = r5
            goto L_0x02cf
        L_0x02ca:
            isb r5 = r3.j(r6)
            goto L_0x02c8
        L_0x02cf:
            java.lang.CharSequence r5 = r14.a
            java.lang.String r5 = r5.toString()
            java.util.List r6 = r1.c
            java.util.List r6 = defpackage.n54.j(r5, r6)
            android.content.Context r8 = r0.a
            fu4 r7 = r7.e(r8)
            k2b r7 = r7.f()
            android.text.SpannableString r5 = defpackage.n54.o(r5, r6, r7)
            int r6 = r5.length()
            if (r6 <= 0) goto L_0x02ff
            isb r14 = new isb
            java.lang.String r6 = r5.toString()
            r3.getClass()
            java.lang.String[] r3 = defpackage.hhf.e(r6, r3)
            r14.<init>(r5, r3)
        L_0x02ff:
            r24 = r14
        L_0x0301:
            b89 r3 = r4.z
            if (r3 == 0) goto L_0x031f
            x23 r2 = r0.g
            qjd r2 = (defpackage.qjd) r2
            java.util.Locale r29 = r2.u()
            long r5 = r3.b
            long r32 = r2.m()
            android.content.Context r0 = r0.a
            r34 = 0
            r28 = r0
            r30 = r5
            java.lang.String r2 = defpackage.j4b.r(r28, r29, r30, r32, r34)
        L_0x031f:
            r21 = r2
            ns6 r2 = new ns6
            r0 = 4
            if (r10 != r0) goto L_0x0329
            r26 = r11
            goto L_0x032b
        L_0x0329:
            r26 = r13
        L_0x032b:
            ll2 r0 = r4.A0
            boolean r0 = r0.c
            long r3 = r4.a
            java.util.List r1 = r1.c
            r18 = r2
            r19 = r3
            r25 = r1
            r28 = r0
            r18.<init>(r19, r21, r22, r23, r24, r25, r26, r27, r28)
            goto L_0x05cd
        L_0x0340:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r3.toString()
            r0.<init>(r1)
            throw r0
        L_0x034a:
            r2 = 3
            if (r4 != r2) goto L_0x035d
            java.lang.Object r0 = r46.a(r47, r48)
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto L_0x0358
            return r0
        L_0x0358:
            r2 = r0
            ykd r2 = (defpackage.ykd) r2
            goto L_0x05cd
        L_0x035d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            int r1 = r1.a
            java.lang.String r1 = defpackage.i2a.q(r1)
            java.lang.String r2 = "Unsupported search result type: "
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L_0x036f:
            a32 r4 = r1.o
            java.lang.String r4 = r4.h(r6, r5)
            if (r4 == 0) goto L_0x0388
            boolean r5 = kotlin.text.StringsKt.isBlank(r4)
            if (r5 != 0) goto L_0x037e
            goto L_0x037f
        L_0x037e:
            r4 = 0
        L_0x037f:
            if (r4 == 0) goto L_0x0388
            android.net.Uri r4 = defpackage.o5a.x(r4)
            r29 = r4
            goto L_0x038a
        L_0x0388:
            r29 = 0
        L_0x038a:
            yva r4 = r0.b
            a32 r5 = r1.o
            r5.l0()
            java.lang.CharSequence r5 = r5.X
            isb r4 = r4.j(r5)
            lua r5 = r0.d
            java.util.List r6 = r1.c
            a32 r8 = r1.o
            r5.getClass()
            m72 r9 = r8.b
            java.lang.String r9 = r9.I
            java.lang.String r9 = defpackage.hhf.c(r9)
            boolean r37 = defpackage.n54.v(r9, r6)
            if (r37 != 0) goto L_0x03bb
            java.lang.String r9 = r8.r()
            boolean r9 = defpackage.n54.v(r9, r6)
            if (r9 == 0) goto L_0x03bb
            r36 = r11
            goto L_0x03bd
        L_0x03bb:
            r36 = r13
        L_0x03bd:
            java.lang.CharSequence r9 = r4.a
            java.lang.String r9 = r9.toString()
            java.util.List r9 = defpackage.n54.j(r9, r6)
            android.content.Context r10 = r5.a
            fu4 r14 = r7.e(r10)
            k2b r14 = r14.f()
            android.text.SpannableString r9 = defpackage.n54.p(r14, r4, r9)
            m72 r14 = r8.b
            java.lang.String r14 = r14.I
            java.lang.String r14 = defpackage.hhf.c(r14)
            if (r37 == 0) goto L_0x03f2
            java.util.List r2 = defpackage.n54.j(r14, r6)
            fu4 r3 = r7.e(r10)
            k2b r3 = r3.f()
            android.text.SpannableString r2 = defpackage.n54.o(r14, r2, r3)
            r38 = r13
            goto L_0x0457
        L_0x03f2:
            if (r36 != 0) goto L_0x0454
            r14 = r6
            java.util.Collection r14 = (java.util.Collection) r14
            boolean r14 = r14.isEmpty()
            r14 = r14 ^ r11
            if (r14 == 0) goto L_0x0454
            vk3 r8 = r8.m()
            if (r8 == 0) goto L_0x0454
            java.lang.Object r6 = r6.get(r13)
            java.lang.String r6 = (java.lang.String) r6
            kotlin.collections.CollectionsKt.listOf(r6)
            fu4 r7 = r7.e(r10)
            k2b r7 = r7.f()
            java.util.List r10 = r8.l()
            java.lang.String r8 = r8.m()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            kotlin.sequences.Sequence r10 = kotlin.collections.CollectionsKt.asSequence(r10)
            oo9 r14 = new oo9
            r14.<init>(r3)
            kotlin.sequences.Sequence r3 = kotlin.sequences.SequencesKt.map(r10, r14)
            kotlin.sequences.Sequence r3 = kotlin.sequences.SequencesKt___SequencesKt.plus(r3, r8)
            iz1 r8 = new iz1
            r8.<init>(r6, r2)
            kotlin.sequences.Sequence r2 = kotlin.sequences.SequencesKt.filter(r3, r8)
            ep1 r3 = new ep1
            r3.<init>(r6, r7)
            kotlin.sequences.Sequence r2 = kotlin.sequences.SequencesKt.map(r2, r3)
            java.lang.Object r2 = kotlin.sequences.SequencesKt.first(r2)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            int r3 = r2.length()
            if (r3 <= 0) goto L_0x0450
            r3 = r11
            goto L_0x0451
        L_0x0450:
            r3 = r13
        L_0x0451:
            r38 = r3
            goto L_0x0457
        L_0x0454:
            r38 = r13
            r2 = 0
        L_0x0457:
            isb r3 = new isb
            java.lang.String[] r4 = r4.b
            r3.<init>(r9, r4)
            if (r2 != 0) goto L_0x0461
            goto L_0x046d
        L_0x0461:
            java.lang.String r2 = r2.toString()
            yva r4 = r5.b
            r4.getClass()
            defpackage.hhf.e(r2, r4)
        L_0x046d:
            a32 r2 = r1.o
            a89 r4 = r2.c
            if (r4 == 0) goto L_0x0489
            vk3 r4 = r4.b
            if (r4 == 0) goto L_0x0489
            long r4 = r4.r()
            x23 r6 = r0.g
            qjd r6 = (defpackage.qjd) r6
            long r6 = r6.s()
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x0489
            r4 = r11
            goto L_0x048a
        L_0x0489:
            r4 = r13
        L_0x048a:
            a89 r2 = r2.c
            if (r2 == 0) goto L_0x04c7
            if (r4 == 0) goto L_0x04c7
            ha9 r2 = r2.a
            oa9 r2 = r2.X
            oa9 r4 = defpackage.oa9.SENT
            if (r2 != r4) goto L_0x0499
            goto L_0x04c7
        L_0x0499:
            if (r2 != 0) goto L_0x049d
            r2 = -1
            goto L_0x04a5
        L_0x049d:
            int[] r4 = defpackage.bld.$EnumSwitchMapping$1
            int r2 = r2.ordinal()
            r2 = r4[r2]
        L_0x04a5:
            if (r2 == r11) goto L_0x04c4
            if (r2 == r12) goto L_0x04c1
            r4 = 3
            if (r2 == r4) goto L_0x04be
            r4 = 4
            if (r2 == r4) goto L_0x04bb
            r4 = 5
            if (r2 != r4) goto L_0x04b5
            wk2 r2 = defpackage.wk2.v
            goto L_0x04c9
        L_0x04b5:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x04bb:
            wk2 r2 = defpackage.wk2.o
            goto L_0x04c9
        L_0x04be:
            wk2 r2 = defpackage.wk2.c
            goto L_0x04c9
        L_0x04c1:
            wk2 r2 = defpackage.wk2.b
            goto L_0x04c9
        L_0x04c4:
            wk2 r2 = defpackage.wk2.a
            goto L_0x04c9
        L_0x04c7:
            wk2 r2 = defpackage.wk2.a
        L_0x04c9:
            int r2 = r2.ordinal()
            if (r2 == 0) goto L_0x04ea
            if (r2 == r11) goto L_0x04e7
            if (r2 == r12) goto L_0x04e4
            r4 = 3
            if (r2 == r4) goto L_0x04e4
            r4 = 4
            if (r2 != r4) goto L_0x04de
            h42 r2 = defpackage.h42.v
        L_0x04db:
            r28 = r2
            goto L_0x04ed
        L_0x04de:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x04e4:
            h42 r2 = defpackage.h42.c
            goto L_0x04db
        L_0x04e7:
            h42 r2 = defpackage.h42.b
            goto L_0x04db
        L_0x04ea:
            h42 r2 = defpackage.h42.a
            goto L_0x04db
        L_0x04ed:
            pp2 r2 = new pp2
            a32 r4 = r1.o
            long r5 = r4.a
            boolean r22 = r4.O()
            a32 r4 = r1.o
            x23 r7 = r0.g
            boolean r23 = r4.X(r7)
            a32 r4 = r1.o
            boolean r24 = r4.D()
            a32 r4 = r1.o
            kotlin.Lazy r7 = r0.h
            java.lang.Object r7 = r7.getValue()
            bud r7 = (defpackage.bud) r7
            r7.getClass()
            gqc r7 = defpackage.gqc.a
            gqc r7 = defpackage.gqc.a
            m72 r4 = r4.b
            java.lang.String r4 = r4.m0
            if (r4 == 0) goto L_0x0526
            int r4 = r4.length()
            if (r4 != 0) goto L_0x0523
            goto L_0x0526
        L_0x0523:
            r25 = r11
            goto L_0x0528
        L_0x0526:
            r25 = r13
        L_0x0528:
            a32 r4 = r1.o
            long r41 = r4.n()
            r7 = 0
            int r7 = (r41 > r7 ? 1 : (r41 == r7 ? 0 : -1))
            if (r7 != 0) goto L_0x0537
            r26 = 0
            goto L_0x055f
        L_0x0537:
            java.lang.String r7 = r4.x0
            if (r7 != 0) goto L_0x055b
            eq2 r7 = r4.z0
            hs7 r7 = r7.b
            java.lang.Object r7 = r7.get()
            yva r7 = (defpackage.yva) r7
            a33 r8 = r7.c
            java.util.Locale r40 = r8.u()
            long r43 = r8.m()
            android.content.Context r7 = r7.a
            r45 = 1
            r39 = r7
            java.lang.String r7 = defpackage.j4b.r(r39, r40, r41, r43, r45)
            r4.x0 = r7
        L_0x055b:
            java.lang.String r4 = r4.x0
            r26 = r4
        L_0x055f:
            a32 r4 = r1.o
            m72 r7 = r4.b
            int r7 = r7.m
            long r30 = r4.g()
            fq2 r0 = r0.c
            a32 r4 = r1.o
            vb2 r0 = (defpackage.vb2) r0
            r0.getClass()
            pb2 r8 = new pb2
            r8.<init>(r4)
            sb2 r0 = r0.w
            java.lang.Object r0 = r0.c(r8)
            r4 = r0
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            if (r4 == 0) goto L_0x058b
            boolean r4 = kotlin.text.StringsKt.isBlank(r4)
            if (r4 == 0) goto L_0x0589
            goto L_0x058b
        L_0x0589:
            r14 = r0
            goto L_0x058c
        L_0x058b:
            r14 = 0
        L_0x058c:
            r33 = r14
            java.lang.CharSequence r33 = (java.lang.CharSequence) r33
            java.util.List r0 = r1.c
            int r4 = r1.a
            if (r4 != r12) goto L_0x0599
            r35 = r11
            goto L_0x059b
        L_0x0599:
            r35 = r13
        L_0x059b:
            a32 r4 = r1.o
            r4.m0()
            java.lang.CharSequence r4 = r4.v0
            a32 r8 = r1.o
            boolean r8 = r8.Y()
            if (r8 != 0) goto L_0x05bc
            a32 r1 = r1.o
            vk3 r1 = r1.m()
            if (r1 == 0) goto L_0x05b9
            boolean r1 = r1.z()
            if (r1 != r11) goto L_0x05b9
            goto L_0x05bc
        L_0x05b9:
            r40 = r13
            goto L_0x05be
        L_0x05bc:
            r40 = r11
        L_0x05be:
            r19 = r2
            r20 = r5
            r27 = r7
            r32 = r3
            r34 = r0
            r39 = r4
            r19.<init>(r20, r22, r23, r24, r25, r26, r27, r28, r29, r30, r32, r33, r34, r35, r36, r37, r38, r39, r40)
        L_0x05cd:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dld.b(ald, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
