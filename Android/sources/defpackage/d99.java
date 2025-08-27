package defpackage;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.messages.list.loader.MessageModel;
import one.me.messages.list.ui.MessagesListWidget;

/* renamed from: d99  reason: default package */
public abstract class d99 extends hg9 implements mb9, vy6 {
    public static final int[] P0 = {16842910, 16842919};
    public static final int[] Q0 = {16842910};
    public final View G0;
    public long H0 = -1;
    public hcg I0 = hcg.None;
    public o00 J0;
    public final Lazy K0;
    public final Lazy L0;
    public final boolean M0;
    public long N0;
    public ValueAnimator O0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public d99(android.content.Context r4, android.view.ViewGroup r5) {
        /*
            r3 = this;
            v89 r0 = new v89
            r0.<init>(r4)
            r3.<init>(r0)
            r3.G0 = r5
            r1 = -1
            r3.H0 = r1
            hcg r4 = defpackage.hcg.None
            r3.I0 = r4
            h49 r4 = new h49
            r1 = 1
            r4.<init>(r1)
            kotlin.LazyThreadSafetyMode r1 = kotlin.LazyThreadSafetyMode.NONE
            kotlin.Lazy r4 = kotlin.LazyKt.lazy((kotlin.LazyThreadSafetyMode) r1, r4)
            r3.K0 = r4
            c28 r4 = new c28
            r2 = 6
            r4.<init>(r2, r3)
            kotlin.Lazy r4 = kotlin.LazyKt.lazy((kotlin.LazyThreadSafetyMode) r1, r4)
            r3.L0 = r4
            r4 = 6
            float r4 = (float) r4
            android.content.res.Resources r1 = defpackage.vo4.c()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            float r4 = r4 * r1
            int r4 = kotlin.math.MathKt.roundToInt((float) r4)
            r1 = 0
            r0.setPaddingRelative(r4, r1, r4, r1)
            u89 r4 = new u89
            r4.<init>()
            android.view.View r2 = r0.x
            if (r2 == 0) goto L_0x004d
            r0.removeView(r2)
        L_0x004d:
            r0.x = r5
            r0.addView(r5, r4)
            r5.setClipChildren(r1)
            r4 = 1
            r3.M0 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d99.<init>(android.content.Context, android.view.ViewGroup):void");
    }

    public void O() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:125:0x01c5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void P(one.me.messages.list.loader.MessageModel r19, java.util.List r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            int r2 = r1.F0
            ig9 r3 = new ig9
            r3.<init>(r2)
            r0.F0 = r3
            long r2 = r1.a
            r0.H0 = r2
            long r2 = r1.b
            r0.N0 = r2
            xz r2 = r1.X
            o00 r3 = r2.d
            r0.J0 = r3
            hcg r3 = r1.x
            r0.I0 = r3
            android.view.View r4 = r0.a
            r5 = r4
            v89 r5 = (defpackage.v89) r5
            yc9 r6 = r1.E0
            if (r6 == 0) goto L_0x002b
            long r6 = r6.a
            goto L_0x002d
        L_0x002b:
            r6 = 0
        L_0x002d:
            r5.setAvatarId(r6)
            yc9 r6 = r1.E0
            r7 = 0
            r8 = 1
            if (r6 == 0) goto L_0x0038
            r6 = r8
            goto L_0x0039
        L_0x0038:
            r6 = r7
        L_0x0039:
            r5.setOffsetBubbleByAvatar(r6)
            int r5 = r19.hashCode()
            android.view.View r6 = r0.G0
            r6.setId(r5)
            boolean r5 = r6 instanceof defpackage.l6b
            if (r5 == 0) goto L_0x004d
            r5 = r6
            l6b r5 = (defpackage.l6b) r5
            goto L_0x004e
        L_0x004d:
            r5 = 0
        L_0x004e:
            boolean r2 = r2.b
            if (r5 == 0) goto L_0x0055
            r5.setDependOnOutsideView(r2)
        L_0x0055:
            r5 = r20
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = r5.isEmpty()
            r5 = r5 ^ r8
            js9 r10 = defpackage.fu4.k
            jf9 r12 = r1.Z
            boolean r13 = r1.Y
            java.lang.CharSequence r14 = r1.v
            if (r5 == 0) goto L_0x01d9
            java.util.Iterator r5 = r20.iterator()
        L_0x006c:
            boolean r15 = r5.hasNext()
            if (r15 == 0) goto L_0x01d5
            java.lang.Object r15 = r5.next()
            boolean r9 = r15 instanceof defpackage.jd9
            if (r9 == 0) goto L_0x006c
            jd9 r15 = (defpackage.jd9) r15
            boolean r9 = r15.a
            if (r9 == 0) goto L_0x0090
            boolean r9 = r6 instanceof defpackage.dsd
            if (r9 == 0) goto L_0x0088
            r9 = r6
            dsd r9 = (defpackage.dsd) r9
            goto L_0x0089
        L_0x0088:
            r9 = 0
        L_0x0089:
            if (r9 == 0) goto L_0x0090
            android.text.Layout r11 = r1.C0
            r9.setSenderName(r11)
        L_0x0090:
            boolean r9 = r15.b
            if (r9 == 0) goto L_0x00a4
            boolean r9 = r6 instanceof defpackage.asd
            if (r9 == 0) goto L_0x009c
            r9 = r6
            asd r9 = (defpackage.asd) r9
            goto L_0x009d
        L_0x009c:
            r9 = 0
        L_0x009d:
            if (r9 == 0) goto L_0x00a4
            android.text.Layout r11 = r1.D0
            r9.setAlias(r11)
        L_0x00a4:
            boolean r9 = r15.d
            if (r9 == 0) goto L_0x00b6
            boolean r9 = r6 instanceof defpackage.a84
            if (r9 == 0) goto L_0x00b0
            r9 = r6
            a84 r9 = (defpackage.a84) r9
            goto L_0x00b1
        L_0x00b0:
            r9 = 0
        L_0x00b1:
            if (r9 == 0) goto L_0x00b6
            r9.setDateViewStatus(r3)
        L_0x00b6:
            boolean r9 = r15.c
            if (r9 == 0) goto L_0x00c8
            boolean r9 = r6 instanceof defpackage.a84
            if (r9 == 0) goto L_0x00c2
            r9 = r6
            a84 r9 = (defpackage.a84) r9
            goto L_0x00c3
        L_0x00c2:
            r9 = 0
        L_0x00c3:
            if (r9 == 0) goto L_0x00c8
            r9.h(r14, r7)
        L_0x00c8:
            boolean r9 = r15.g
            if (r9 == 0) goto L_0x00da
            boolean r9 = r6 instanceof defpackage.a84
            if (r9 == 0) goto L_0x00d4
            r9 = r6
            a84 r9 = (defpackage.a84) r9
            goto L_0x00d5
        L_0x00d4:
            r9 = 0
        L_0x00d5:
            if (r9 == 0) goto L_0x00da
            r9.h(r14, r13)
        L_0x00da:
            boolean r9 = r15.e
            if (r9 == 0) goto L_0x00fb
            boolean r9 = r6 instanceof defpackage.wff
            if (r9 == 0) goto L_0x00e6
            r9 = r6
            wff r9 = (defpackage.wff) r9
            goto L_0x00e7
        L_0x00e6:
            r9 = 0
        L_0x00e7:
            if (r9 == 0) goto L_0x00fb
            if (r12 == 0) goto L_0x00ef
            r9.setTextMessageLayout(r12)
            goto L_0x00fb
        L_0x00ef:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "messageTextLayout is null"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00fb:
            boolean r9 = r15.f
            if (r9 == 0) goto L_0x011b
            r0.S(r1, r8)
            k2b r9 = r10.f(r4)
            hq2 r9 = r9.a()
            int r11 = r1.F0
            r16 = 2080374784(0x7c000000, float:2.658456E36)
            r11 = r11 & r16
            boolean r11 = defpackage.ct0.b(r11)
            ws0 r9 = r9.a(r11)
            r0.b(r9)
        L_0x011b:
            boolean r9 = r15.h
            if (r9 == 0) goto L_0x01bd
            o00 r9 = r0.J0
            boolean r11 = r9 instanceof defpackage.bl5
            if (r11 == 0) goto L_0x0137
            boolean r11 = r6 instanceof defpackage.zm5
            if (r11 == 0) goto L_0x012d
            r11 = r6
            zm5 r11 = (defpackage.zm5) r11
            goto L_0x012e
        L_0x012d:
            r11 = 0
        L_0x012e:
            if (r11 == 0) goto L_0x01bd
            bl5 r9 = (defpackage.bl5) r9
            r11.x(r9)
            goto L_0x01bd
        L_0x0137:
            boolean r11 = r9 instanceof defpackage.l50
            if (r11 == 0) goto L_0x0178
            boolean r11 = r6 instanceof defpackage.q50
            if (r11 == 0) goto L_0x0143
            r11 = r6
            q50 r11 = (defpackage.q50) r11
            goto L_0x0144
        L_0x0143:
            r11 = 0
        L_0x0144:
            if (r11 == 0) goto L_0x01bd
            l50 r9 = (defpackage.l50) r9
            java.lang.String r8 = r11.O0
            int r8 = r8.length()
            if (r8 <= 0) goto L_0x0151
            goto L_0x0159
        L_0x0151:
            java.lang.String r8 = r9.d
            int r8 = r8.length()
            if (r8 != 0) goto L_0x015b
        L_0x0159:
            goto L_0x01bd
        L_0x015b:
            java.lang.String r8 = r9.d
            r11.O0 = r8
            f80 r8 = r11.A0
            byte[] r7 = r9.h
            r17 = r4
            r20 = r5
            long r4 = r9.j
            r8.b(r4, r7)
            androidx.appcompat.widget.AppCompatImageView r4 = r11.x
            m50 r5 = new m50
            r7 = 0
            r5.<init>(r11, r9, r7)
            defpackage.ct.G(r4, 300, r5)
            goto L_0x01c1
        L_0x0178:
            r17 = r4
            r20 = r5
            boolean r4 = r9 instanceof defpackage.o43
            if (r4 == 0) goto L_0x0191
            boolean r4 = r6 instanceof defpackage.k43
            if (r4 == 0) goto L_0x0188
            r4 = r6
            k43 r4 = (defpackage.k43) r4
            goto L_0x0189
        L_0x0188:
            r4 = 0
        L_0x0189:
            if (r4 == 0) goto L_0x01c1
            o43 r9 = (defpackage.o43) r9
            r4.c(r9)
            goto L_0x01c1
        L_0x0191:
            boolean r4 = r9 instanceof defpackage.ybe
            if (r4 == 0) goto L_0x01a8
            boolean r4 = r6 instanceof defpackage.zbe
            if (r4 == 0) goto L_0x019d
            r4 = r6
            zbe r4 = (defpackage.zbe) r4
            goto L_0x019e
        L_0x019d:
            r4 = 0
        L_0x019e:
            if (r4 == 0) goto L_0x01c1
            ybe r9 = (defpackage.ybe) r9
            p87 r5 = r9.c
            r4.b(r5)
            goto L_0x01c1
        L_0x01a8:
            boolean r4 = r9 instanceof defpackage.ede
            if (r4 == 0) goto L_0x01c1
            boolean r4 = r6 instanceof defpackage.fde
            if (r4 == 0) goto L_0x01b4
            r4 = r6
            fde r4 = (defpackage.fde) r4
            goto L_0x01b5
        L_0x01b4:
            r4 = 0
        L_0x01b5:
            if (r4 == 0) goto L_0x01c1
            ede r9 = (defpackage.ede) r9
            r4.j(r9)
            goto L_0x01c1
        L_0x01bd:
            r17 = r4
            r20 = r5
        L_0x01c1:
            boolean r4 = r15.i
            if (r4 == 0) goto L_0x01cd
            if (r2 != 0) goto L_0x01ca
            r18.b0(r19)
        L_0x01ca:
            r18.R(r19)
        L_0x01cd:
            r5 = r20
            r4 = r17
            r7 = 0
            r8 = 1
            goto L_0x006c
        L_0x01d5:
            r6.requestLayout()
            return
        L_0x01d9:
            r17 = r4
            boolean r2 = r6 instanceof defpackage.dsd
            if (r2 == 0) goto L_0x01e3
            r2 = r6
            dsd r2 = (defpackage.dsd) r2
            goto L_0x01e4
        L_0x01e3:
            r2 = 0
        L_0x01e4:
            if (r2 == 0) goto L_0x01eb
            android.text.Layout r4 = r1.C0
            r2.setSenderName(r4)
        L_0x01eb:
            boolean r2 = r6 instanceof defpackage.asd
            if (r2 == 0) goto L_0x01f3
            r2 = r6
            asd r2 = (defpackage.asd) r2
            goto L_0x01f4
        L_0x01f3:
            r2 = 0
        L_0x01f4:
            if (r2 == 0) goto L_0x01fb
            android.text.Layout r4 = r1.D0
            r2.setAlias(r4)
        L_0x01fb:
            boolean r2 = r6 instanceof defpackage.a84
            if (r2 == 0) goto L_0x0203
            r2 = r6
            a84 r2 = (defpackage.a84) r2
            goto L_0x0204
        L_0x0203:
            r2 = 0
        L_0x0204:
            if (r2 == 0) goto L_0x020c
            r2.setDateViewStatus(r3)
            r2.h(r14, r13)
        L_0x020c:
            boolean r2 = r6 instanceof defpackage.tc9
            if (r2 == 0) goto L_0x0221
            nc9 r2 = r1.v0
            if (r2 == 0) goto L_0x021b
            r3 = r6
            tc9 r3 = (defpackage.tc9) r3
            r3.setLink(r2)
            goto L_0x0221
        L_0x021b:
            r2 = r6
            tc9 r2 = (defpackage.tc9) r2
            r2.n()
        L_0x0221:
            if (r12 == 0) goto L_0x0231
            boolean r2 = r6 instanceof defpackage.wff
            if (r2 == 0) goto L_0x022b
            r9 = r6
            wff r9 = (defpackage.wff) r9
            goto L_0x022c
        L_0x022b:
            r9 = 0
        L_0x022c:
            if (r9 == 0) goto L_0x0231
            r9.setTextMessageLayout(r12)
        L_0x0231:
            r18.b0(r19)
            r0.Q(r1, r6)
            r2 = 0
            r0.S(r1, r2)
            r18.R(r19)
            r2 = r17
            k2b r3 = r10.f(r2)
            hq2 r3 = r3.a()
            int r4 = r1.F0
            r5 = 2080374784(0x7c000000, float:2.658456E36)
            r4 = r4 & r5
            boolean r4 = defpackage.ct0.b(r4)
            ws0 r3 = r3.a(r4)
            r0.b(r3)
            android.content.Context r2 = r2.getContext()
            fu4 r2 = r10.e(r2)
            k2b r2 = r2.f()
            hq2 r2 = r2.a()
            a93 r2 = r2.l()
            r0.k(r2)
            r18.W(r19)
            r6.requestLayout()
            r6.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d99.P(one.me.messages.list.loader.MessageModel, java.util.List):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void R(one.me.messages.list.loader.MessageModel r28) {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            xz r2 = r1.X
            zf7 r2 = r2.e
            kotlin.Lazy r3 = r0.L0
            if (r2 != 0) goto L_0x001f
            boolean r0 = r3.isInitialized()
            if (r0 == 0) goto L_0x0201
            java.lang.Object r0 = r3.getValue()
            dg7 r0 = (defpackage.dg7) r0
            r1 = 8
            r0.setVisibility(r1)
            goto L_0x0201
        L_0x001f:
            java.lang.Object r2 = r3.getValue()
            dg7 r2 = (defpackage.dg7) r2
            xz r4 = r1.X
            zf7 r4 = r4.e
            long r5 = r1.a
            r2.c = r5
            r2.o = r4
            lw0 r1 = r2.v
            eq7 r5 = r1.y
            if (r5 == 0) goto L_0x003a
            boolean r5 = r5.b(r4)
            goto L_0x003b
        L_0x003a:
            r5 = 0
        L_0x003b:
            r7 = 1
            r5 = r5 ^ r7
            if (r5 != 0) goto L_0x0044
            r1.invalidate()
            goto L_0x01de
        L_0x0044:
            eq7 r5 = r1.y
            f r8 = new f
            r9 = 2
            r8.<init>((int) r9, (java.lang.Object) r1)
            if (r5 != 0) goto L_0x0051
        L_0x004e:
            r12 = 0
            goto L_0x00c5
        L_0x0051:
            java.util.List r9 = r4.a
            java.util.List r5 = r5.a()
            int r10 = r9.size()
            int r11 = r5.size()
            if (r10 == r11) goto L_0x0062
            goto L_0x004e
        L_0x0062:
            r10 = r9
            java.util.Collection r10 = (java.util.Collection) r10
            int r10 = r10.size()
            r11 = 0
            r12 = 0
        L_0x006b:
            if (r11 >= r10) goto L_0x00c5
            java.lang.Object r13 = r9.get(r11)
            ew0 r13 = (defpackage.ew0) r13
            int r14 = r13.size()
            java.lang.Object r15 = r5.get(r11)
            ew0 r15 = (defpackage.ew0) r15
            int r15 = r15.size()
            if (r14 == r15) goto L_0x0084
            goto L_0x004e
        L_0x0084:
            int r14 = r13.size()
            r15 = 0
        L_0x0089:
            if (r15 >= r14) goto L_0x00bd
            java.lang.Object r16 = r13.get(r15)
            r7 = r16
            xv0 r7 = (defpackage.xv0) r7
            java.lang.Object r16 = r5.get(r11)
            r6 = r16
            ew0 r6 = (defpackage.ew0) r6
            java.lang.Object r6 = r6.get(r15)
            xv0 r6 = (defpackage.xv0) r6
            r16 = r5
            boolean r5 = r7.y
            r18 = r9
            boolean r9 = r6.y
            if (r5 == r9) goto L_0x00b5
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r6)
            if (r5 == 0) goto L_0x00b5
            r8.invoke(r4)
            r12 = 1
        L_0x00b5:
            int r15 = r15 + 1
            r5 = r16
            r9 = r18
            r7 = 1
            goto L_0x0089
        L_0x00bd:
            r16 = r5
            r18 = r9
            int r11 = r11 + 1
            r7 = 1
            goto L_0x006b
        L_0x00c5:
            if (r12 == 0) goto L_0x00c9
            goto L_0x01de
        L_0x00c9:
            r5 = 0
            r1.J0 = r5
            r1.y = r4
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.List r4 = r4.a
            r6 = r4
            java.util.Collection r6 = (java.util.Collection) r6
            int r6 = r6.size()
            r7 = 0
        L_0x00dd:
            if (r7 >= r6) goto L_0x019b
            java.lang.Object r8 = r4.get(r7)
            ew0 r8 = (defpackage.ew0) r8
            int r9 = r8.size()
            int r10 = r8.size()
            r11 = 1
            if (r10 != r11) goto L_0x00f2
            r10 = 1
            goto L_0x00f3
        L_0x00f2:
            r10 = 0
        L_0x00f3:
            int r11 = r8.size()
            r21 = r9
            r9 = 0
        L_0x00fa:
            if (r9 >= r11) goto L_0x0193
            java.lang.Object r12 = r8.get(r9)
            r19 = r12
            xv0 r19 = (defpackage.xv0) r19
            if (r9 != 0) goto L_0x0109
            r23 = 1
            goto L_0x010b
        L_0x0109:
            r23 = 0
        L_0x010b:
            int r12 = r8.size()
            r13 = 1
            int r12 = r12 - r13
            if (r9 != r12) goto L_0x0116
            r24 = r13
            goto L_0x0118
        L_0x0116:
            r24 = 0
        L_0x0118:
            int r12 = r4.size()
            int r12 = r12 - r13
            if (r7 != r12) goto L_0x0121
            r12 = 1
            goto L_0x0122
        L_0x0121:
            r12 = 0
        L_0x0122:
            float r13 = r2.a
            r14 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r15 = (r13 > r14 ? 1 : (r13 == r14 ? 0 : -1))
            r16 = r4
            float r4 = r2.b
            if (r15 != 0) goto L_0x0138
            int r14 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r14 != 0) goto L_0x0138
            r4 = 0
            r25 = r4
            r26 = 1
            goto L_0x0177
        L_0x0138:
            r14 = 4
            float[] r15 = new float[r14]
            r17 = 0
            r15[r17] = r4
            r26 = 1
            r15[r26] = r4
            r18 = 2
            r15[r18] = r4
            r20 = 3
            r15[r20] = r4
            if (r12 == 0) goto L_0x0175
            if (r23 == 0) goto L_0x015c
            if (r24 == 0) goto L_0x015c
            float[] r15 = new float[r14]
            r15[r17] = r4
            r15[r26] = r4
            r15[r18] = r13
            r15[r20] = r13
            goto L_0x0175
        L_0x015c:
            if (r23 == 0) goto L_0x0169
            float[] r15 = new float[r14]
            r15[r17] = r4
            r15[r26] = r4
            r15[r18] = r4
            r15[r20] = r13
            goto L_0x0175
        L_0x0169:
            if (r24 == 0) goto L_0x0175
            float[] r15 = new float[r14]
            r15[r17] = r4
            r15[r26] = r4
            r15[r18] = r13
            r15[r20] = r4
        L_0x0175:
            r25 = r15
        L_0x0177:
            uq0 r4 = new uq0
            a20 r12 = new a20
            r13 = 2
            r12.<init>(r13)
            r18 = r4
            r20 = r12
            r22 = r10
            r18.<init>(r19, r20, r21, r22, r23, r24, r25)
            r5.add(r4)
            int r9 = r9 + 1
            r21 = -1
            r4 = r16
            goto L_0x00fa
        L_0x0193:
            r16 = r4
            r26 = 1
            int r7 = r7 + 1
            goto L_0x00dd
        L_0x019b:
            r1.x = r5
            te7 r2 = r1.E0
            if (r2 != 0) goto L_0x01db
            te7 r2 = new te7
            r2.<init>()
            js9 r4 = defpackage.fu4.k
            android.content.Context r5 = r1.getContext()
            fu4 r5 = r4.e(r5)
            k2b r5 = r5.f()
            au6 r5 = r5.d()
            du6 r5 = r5.f
            int r5 = r5.b
            android.content.Context r6 = r1.getContext()
            fu4 r4 = r4.e(r6)
            k2b r4 = r4.f()
            au6 r4 = r4.d()
            du6 r4 = r4.f
            int r4 = r4.a
            int[] r4 = new int[]{r5, r4}
            r2.b = r4
            r2.setCallback(r1)
            r1.E0 = r2
        L_0x01db:
            r1.requestLayout()
        L_0x01de:
            android.view.View r0 = r0.a
            v89 r0 = (defpackage.v89) r0
            java.lang.Object r1 = r3.getValue()
            android.view.View r1 = (android.view.View) r1
            u89 r2 = new u89
            r2.<init>()
            android.view.View r4 = r0.y
            if (r4 == 0) goto L_0x01f2
            goto L_0x01f7
        L_0x01f2:
            r0.y = r1
            r0.addView(r1, r2)
        L_0x01f7:
            java.lang.Object r0 = r3.getValue()
            android.view.View r0 = (android.view.View) r0
            r1 = 0
            r0.setVisibility(r1)
        L_0x0201:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d99.R(one.me.messages.list.loader.MessageModel):void");
    }

    public final void S(MessageModel messageModel, boolean z) {
        View view = this.G0;
        if (view instanceof tsc) {
            tsc tsc = (tsc) view;
            tsc.setIsIncoming(messageModel.A0);
            if (!z) {
                tsc.setStackFromEnd(!messageModel.A0 && ig9.d(messageModel.F0));
            }
            xd9 xd9 = messageModel.y0;
            if (xd9 != null) {
                tsc.g(xd9, z);
            } else {
                tsc.q(z);
            }
        }
    }

    public final void T() {
        ValueAnimator valueAnimator = this.O0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        View view = this.G0;
        yy6 yy6 = view instanceof yy6 ? (yy6) view : null;
        if (yy6 != null) {
            yy6.d((List) null, (Function2) null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0018, code lost:
        if (r0 == null) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.ShapeDrawable U() {
        /*
            r4 = this;
            android.view.View r0 = r4.G0
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            boolean r1 = r0 instanceof defpackage.r89
            r2 = 0
            if (r1 == 0) goto L_0x000e
            r89 r0 = (defpackage.r89) r0
            goto L_0x000f
        L_0x000e:
            r0 = r2
        L_0x000f:
            if (r0 == 0) goto L_0x001a
            float[] r0 = r0.q
            int r1 = r0.length
            float[] r0 = java.util.Arrays.copyOf(r0, r1)
            if (r0 != 0) goto L_0x0022
        L_0x001a:
            kotlin.Lazy r0 = r4.K0
            java.lang.Object r0 = r0.getValue()
            float[] r0 = (float[]) r0
        L_0x0022:
            android.graphics.drawable.ShapeDrawable r1 = new android.graphics.drawable.ShapeDrawable
            android.graphics.drawable.shapes.RoundRectShape r3 = new android.graphics.drawable.shapes.RoundRectShape
            r3.<init>(r0, r2, r2)
            r1.<init>(r3)
            android.graphics.Paint r0 = r1.getPaint()
            js9 r2 = defpackage.fu4.k
            android.view.View r4 = r4.a
            k2b r4 = r2.f(r4)
            ene r4 = r4.b()
            dne r4 = r4.a
            int r4 = r4.r
            r0.setColor(r4)
            r4 = 150(0x96, float:2.1E-43)
            r1.setAlpha(r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d99.U():android.graphics.drawable.ShapeDrawable");
    }

    public final void V(t89 t89, String str) {
        o00 o00 = this.J0;
        View view = this.G0;
        if (o00 != null) {
            long j = this.H0;
            pn9 pn9 = (pn9) t89;
            pn9.getClass();
            KProperty[] kPropertyArr = MessagesListWidget.R0;
            MessagesListWidget messagesListWidget = pn9.a;
            if (!messagesListWidget.k0().C(o00, j, str)) {
                messagesListWidget.m0(j, view);
                return;
            }
            return;
        }
        long j2 = this.H0;
        pn9 pn92 = (pn9) t89;
        pn92.getClass();
        KProperty[] kPropertyArr2 = MessagesListWidget.R0;
        pn92.a.m0(j2, view);
    }

    public void W(MessageModel messageModel) {
    }

    public void Y(ws0 ws0) {
    }

    public void Z(a93 a93) {
    }

    public final long a() {
        return this.N0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: yy6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: yy6} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a0(defpackage.uy6 r8, kotlin.jvm.functions.Function2 r9) {
        /*
            r7 = this;
            r0 = 0
            if (r8 != 0) goto L_0x0007
            r7.T()
            goto L_0x0072
        L_0x0007:
            long r1 = r7.H0
            long r3 = r8.a
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r2 = 1
            r3 = 0
            android.view.View r4 = r7.G0
            java.util.List r8 = r8.b
            if (r1 != 0) goto L_0x0027
            android.animation.ValueAnimator r5 = r7.O0
            if (r5 == 0) goto L_0x0027
            boolean r7 = r4 instanceof defpackage.yy6
            if (r7 == 0) goto L_0x0020
            r3 = r4
            yy6 r3 = (defpackage.yy6) r3
        L_0x0020:
            if (r3 == 0) goto L_0x0025
            r3.d(r8, r9)
        L_0x0025:
            r0 = r2
            goto L_0x0072
        L_0x0027:
            if (r1 != 0) goto L_0x006f
            android.graphics.drawable.ShapeDrawable r1 = r7.U()
            r4.setForeground(r1)
            android.graphics.drawable.ShapeDrawable r1 = r7.U()
            int r1 = r1.getAlpha()
            int[] r0 = new int[]{r1, r0}
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofInt(r0)
            r5 = 300(0x12c, double:1.48E-321)
            r0.setStartDelay(r5)
            r5 = 800(0x320, double:3.953E-321)
            r0.setDuration(r5)
            z00 r1 = new z00
            r5 = 15
            r1.<init>((int) r5, (java.lang.Object) r7)
            r0.addUpdateListener(r1)
            uf r1 = new uf
            r5 = 4
            r1.<init>(r5, r7)
            r0.addListener(r1)
            r0.start()
            r7.O0 = r0
            boolean r7 = r4 instanceof defpackage.yy6
            if (r7 == 0) goto L_0x0069
            r3 = r4
            yy6 r3 = (defpackage.yy6) r3
        L_0x0069:
            if (r3 == 0) goto L_0x0025
            r3.d(r8, r9)
            goto L_0x0025
        L_0x006f:
            r7.T()
        L_0x0072:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d99.a0(uy6, kotlin.jvm.functions.Function2):boolean");
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [android.graphics.drawable.Drawable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(defpackage.ws0 r9) {
        /*
            r8 = this;
            android.view.View r0 = r8.G0
            boolean r1 = r0 instanceof defpackage.dsd
            r2 = 0
            if (r1 == 0) goto L_0x000b
            r1 = r0
            dsd r1 = (defpackage.dsd) r1
            goto L_0x000c
        L_0x000b:
            r1 = r2
        L_0x000c:
            if (r1 == 0) goto L_0x0015
            zs0 r3 = r9.b
            int r3 = r3.g
            r1.setSenderNameColor(r3)
        L_0x0015:
            boolean r1 = r0 instanceof defpackage.asd
            if (r1 == 0) goto L_0x001d
            r1 = r0
            asd r1 = (defpackage.asd) r1
            goto L_0x001e
        L_0x001d:
            r1 = r2
        L_0x001e:
            if (r1 == 0) goto L_0x0027
            zs0 r3 = r9.b
            int r3 = r3.e
            r1.setAliasColor(r3)
        L_0x0027:
            boolean r1 = r0 instanceof defpackage.wff
            if (r1 == 0) goto L_0x002f
            r1 = r0
            wff r1 = (defpackage.wff) r1
            goto L_0x0030
        L_0x002f:
            r1 = r2
        L_0x0030:
            if (r1 == 0) goto L_0x0035
            r1.setTextMessageColors(r9)
        L_0x0035:
            boolean r1 = r0 instanceof defpackage.tc9
            if (r1 == 0) goto L_0x003d
            r1 = r0
            tc9 r1 = (defpackage.tc9) r1
            goto L_0x003e
        L_0x003d:
            r1 = r2
        L_0x003e:
            if (r1 == 0) goto L_0x0043
            r1.e(r9)
        L_0x0043:
            boolean r1 = r0 instanceof defpackage.tsc
            if (r1 == 0) goto L_0x004b
            r1 = r0
            tsc r1 = (defpackage.tsc) r1
            goto L_0x004c
        L_0x004b:
            r1 = r2
        L_0x004c:
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x0062
            ig9 r5 = r8.F0
            if (r5 == 0) goto L_0x005e
            int r5 = r5.a
            boolean r5 = defpackage.ig9.d(r5)
            if (r5 != 0) goto L_0x005e
            r5 = r3
            goto L_0x005f
        L_0x005e:
            r5 = r4
        L_0x005f:
            r1.l(r9, r5)
        L_0x0062:
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            boolean r1 = r0 instanceof defpackage.r89
            if (r1 == 0) goto L_0x006d
            r2 = r0
            r89 r2 = (defpackage.r89) r2
        L_0x006d:
            if (r2 == 0) goto L_0x00a6
            js9 r0 = defpackage.fu4.k
            android.view.View r1 = r8.a
            k2b r5 = r0.f(r1)
            hq2 r5 = r5.a()
            ws0 r5 = r5.e()
            qs0 r5 = r5.a
            int[] r5 = r5.l
            kotlin.reflect.KProperty[] r6 = defpackage.r89.z
            r4 = r6[r4]
            q89 r7 = r2.v
            r7.setValue(r2, r4, r5)
            k2b r0 = r0.f(r1)
            hq2 r0 = r0.a()
            ws0 r0 = r0.i()
            qs0 r0 = r0.a
            int[] r0 = r0.l
            r1 = r6[r3]
            q89 r3 = r2.w
            r3.setValue(r2, r1, r0)
            r2.invalidateSelf()
        L_0x00a6:
            r8.Y(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d99.b(ws0):void");
    }

    public final void b0(MessageModel messageModel) {
        bt0 bt0;
        Drawable background = this.G0.getBackground();
        r89 r89 = background instanceof r89 ? (r89) background : null;
        if (r89 != null) {
            boolean b = ct0.b(messageModel.F0 & 2080374784);
            ws0 a = fu4.k.f(this.a).a().a(b);
            boolean z = messageModel.X.b;
            int i = a.d.b;
            int i2 = messageModel.F0;
            int i3 = i2 & 2080374784;
            if (ct0.c(i3)) {
                bt0 = bt0.a;
            } else if (ct0.a(i3)) {
                bt0 = bt0.b;
            } else if ((1073741824 & i2) != 0) {
                bt0 = bt0.o;
            } else if ((i2 & 536870912) != 0) {
                bt0 = bt0.c;
            } else {
                String d = ct0.d(i3);
                throw new IllegalStateException(("unknown bubble type " + d).toString());
            }
            if (r89.b(r89, b, bt0, messageModel.z, messageModel.y, i, z, 72)) {
                r89.invalidateSelf();
            }
        }
    }

    public final boolean d() {
        return this.M0;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [android.graphics.drawable.Drawable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void k(defpackage.a93 r5) {
        /*
            r4 = this;
            android.view.View r0 = r4.G0
            boolean r1 = r0 instanceof defpackage.a84
            r2 = 0
            if (r1 == 0) goto L_0x000b
            r1 = r0
            a84 r1 = (defpackage.a84) r1
            goto L_0x000c
        L_0x000b:
            r1 = r2
        L_0x000c:
            if (r1 == 0) goto L_0x0015
            n63 r3 = r5.a
            int r3 = r3.g
            r1.setDateBackgroundColor(r3)
        L_0x0015:
            android.graphics.drawable.Drawable r0 = r0.getForeground()
            boolean r1 = r0 instanceof android.graphics.drawable.ShapeDrawable
            if (r1 == 0) goto L_0x0020
            r2 = r0
            android.graphics.drawable.ShapeDrawable r2 = (android.graphics.drawable.ShapeDrawable) r2
        L_0x0020:
            if (r2 == 0) goto L_0x003b
            android.graphics.Paint r0 = r2.getPaint()
            if (r0 == 0) goto L_0x003b
            js9 r1 = defpackage.fu4.k
            android.view.View r2 = r4.a
            k2b r1 = r1.f(r2)
            ene r1 = r1.b()
            dne r1 = r1.a
            int r1 = r1.r
            r0.setColor(r1)
        L_0x003b:
            r4.Z(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d99.k(a93):void");
    }
}
