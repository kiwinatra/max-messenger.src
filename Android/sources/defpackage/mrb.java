package defpackage;

import android.view.View;
import android.widget.FrameLayout;

/* renamed from: mrb  reason: default package */
public final class mrb extends fqc {
    public final /* synthetic */ int h;
    public int i;
    public final /* synthetic */ FrameLayout j;

    public /* synthetic */ mrb(FrameLayout frameLayout, int i2) {
        this.h = i2;
        this.j = frameLayout;
    }

    public final void H(View view, int i2, int i3, int i4) {
        float f;
        int i5;
        float f2;
        int i6;
        switch (this.h) {
            case 0:
                nrb nrb = (nrb) this.j;
                if (nrb.a.a == 2 && nrb.c == 0) {
                    int c = nrb.b.c();
                    if (nrb.v) {
                        int i7 = this.i;
                        f = (float) (i3 - i7);
                        i5 = c - i7;
                    } else {
                        int i8 = this.i;
                        f = (float) (i8 - i3);
                        i5 = i8 - c;
                    }
                    nrb.setBackgroundAlpha(1.0f - Math.abs(f / ((float) i5)));
                    if (nrb.v && i3 >= c) {
                        nrb.b.f();
                    }
                    if (!nrb.v && i3 <= c) {
                        nrb.b.f();
                    }
                }
                nrb.b.j(i3);
                return;
            default:
                orb orb = (orb) this.j;
                orb.getHalfExpandedViewHelper().a(i3);
                frb callback = orb.getCallback();
                if (callback != null) {
                    if (orb.w.a == 2 && orb.getScrollState() == lrb.a) {
                        int e = callback.e();
                        if (orb.getStackFromBottom()) {
                            int i9 = this.i;
                            f2 = (float) (i3 - i9);
                            i6 = e - i9;
                        } else {
                            int i10 = this.i;
                            f2 = (float) (i10 - i3);
                            i6 = i10 - e;
                        }
                        orb.setBackgroundAlpha(((float) 1) - Math.abs(f2 / ((float) i6)));
                        if (orb.getStackFromBottom() && i3 >= e) {
                            callback.h();
                        }
                        if (!orb.getStackFromBottom() && i3 <= e) {
                            callback.h();
                        }
                    }
                    callback.m(i3);
                    return;
                }
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01e7, code lost:
        if (r8.i < (((r4.b.c() - r4.b.b()) / 2) + r4.b.b())) goto L_0x01e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x016c, code lost:
        if (r11 > defpackage.c44.DEFAULT_ASPECT_RATIO) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0171, code lost:
        if (r11 > defpackage.c44.DEFAULT_ASPECT_RATIO) goto L_0x01e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0181, code lost:
        if (r11 < defpackage.c44.DEFAULT_ASPECT_RATIO) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0186, code lost:
        if (r11 < defpackage.c44.DEFAULT_ASPECT_RATIO) goto L_0x01e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01bf, code lost:
        if (r8.i > (((r4.b.c() - r4.b.b()) / 2) + r4.b.b())) goto L_0x01e9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01f7  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0200  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void I(android.view.View r9, float r10, float r11) {
        /*
            r8 = this;
            int r10 = r8.h
            switch(r10) {
                case 0: goto L_0x013a;
                default: goto L_0x0005;
            }
        L_0x0005:
            int r10 = r9.getTop()
            r8.i = r10
            android.widget.FrameLayout r10 = r8.j
            orb r10 = (defpackage.orb) r10
            frb r0 = r10.getCallback()
            if (r0 != 0) goto L_0x0017
            goto L_0x0139
        L_0x0017:
            double r1 = (double) r11
            double r3 = java.lang.Math.abs(r1)
            r5 = 4641240890982006784(0x4069000000000000, double:200.0)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r4 = 2
            r5 = 0
            if (r3 <= 0) goto L_0x00b1
            double r1 = java.lang.Math.abs(r1)
            r6 = 4665518107723300864(0x40bf400000000000, double:8000.0)
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 >= 0) goto L_0x0097
            irb r1 = r0.b()
            r1.getClass()
            int[] r2 = defpackage.hrb.$EnumSwitchMapping$0
            int r1 = r1.ordinal()
            r1 = r2[r1]
            r2 = 1
            if (r1 == r2) goto L_0x0051
            if (r1 != r4) goto L_0x004b
            lrb r11 = r10.getScrollState()
            goto L_0x0100
        L_0x004b:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        L_0x0051:
            boolean r1 = r10.getStackFromBottom()
            if (r1 == 0) goto L_0x0077
            int r1 = r8.i
            int r2 = r0.c()
            if (r1 >= r2) goto L_0x006b
            int r11 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r11 <= 0) goto L_0x0067
            lrb r11 = defpackage.lrb.b
            goto L_0x0100
        L_0x0067:
            lrb r11 = defpackage.lrb.c
            goto L_0x0100
        L_0x006b:
            int r11 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r11 <= 0) goto L_0x0073
            lrb r11 = defpackage.lrb.a
            goto L_0x0100
        L_0x0073:
            lrb r11 = defpackage.lrb.b
            goto L_0x0100
        L_0x0077:
            int r1 = r8.i
            int r2 = r0.c()
            if (r1 <= r2) goto L_0x008b
            int r11 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r11 >= 0) goto L_0x0087
            lrb r11 = defpackage.lrb.b
            goto L_0x0100
        L_0x0087:
            lrb r11 = defpackage.lrb.c
            goto L_0x0100
        L_0x008b:
            int r11 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r11 >= 0) goto L_0x0093
            lrb r11 = defpackage.lrb.a
            goto L_0x0100
        L_0x0093:
            lrb r11 = defpackage.lrb.b
            goto L_0x0100
        L_0x0097:
            boolean r1 = r10.getStackFromBottom()
            if (r1 == 0) goto L_0x00a7
            int r11 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r11 <= 0) goto L_0x00a4
            lrb r11 = defpackage.lrb.a
            goto L_0x0100
        L_0x00a4:
            lrb r11 = defpackage.lrb.c
            goto L_0x0100
        L_0x00a7:
            int r11 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r11 >= 0) goto L_0x00ae
            lrb r11 = defpackage.lrb.a
            goto L_0x0100
        L_0x00ae:
            lrb r11 = defpackage.lrb.c
            goto L_0x0100
        L_0x00b1:
            boolean r11 = r10.getStackFromBottom()
            if (r11 == 0) goto L_0x00dc
            int r11 = r8.i
            int r1 = r0.c()
            int r1 = r1 / r4
            if (r11 >= r1) goto L_0x00c3
            lrb r11 = defpackage.lrb.c
            goto L_0x0100
        L_0x00c3:
            int r11 = r8.i
            int r1 = r0.c()
            int r2 = r0.e()
            int r3 = r0.c()
            int r2 = r2 - r3
            int r2 = r2 / r4
            int r2 = r2 + r1
            if (r11 <= r2) goto L_0x00d9
            lrb r11 = defpackage.lrb.a
            goto L_0x0100
        L_0x00d9:
            lrb r11 = defpackage.lrb.b
            goto L_0x0100
        L_0x00dc:
            int r11 = r8.i
            int r1 = r0.c()
            int r1 = r1 / r4
            if (r11 <= r1) goto L_0x00e8
            lrb r11 = defpackage.lrb.c
            goto L_0x0100
        L_0x00e8:
            int r11 = r8.i
            int r1 = r0.c()
            int r2 = r0.e()
            int r3 = r0.c()
            int r2 = r2 - r3
            int r2 = r2 / r4
            int r2 = r2 + r1
            if (r11 >= r2) goto L_0x00fe
            lrb r11 = defpackage.lrb.a
            goto L_0x0100
        L_0x00fe:
            lrb r11 = defpackage.lrb.b
        L_0x0100:
            lrb r1 = r10.getScrollState()
            lrb r11 = r0.g(r1, r11)
            r10.setScrollState(r11)
            int r8 = r8.i
            int r11 = r10.getScrollStateOffset()
            if (r8 != r11) goto L_0x0122
            lrb r8 = r10.getScrollState()
            lrb r11 = defpackage.lrb.a
            if (r8 != r11) goto L_0x0122
            r0.h()
            r10.setBackgroundAlpha(r5)
            goto L_0x0139
        L_0x0122:
            int r8 = r9.getLeft()
            int r9 = r10.getScrollStateOffset()
            kag r11 = r10.w
            r11.p(r8, r9)
            lrb r8 = r10.getScrollState()
            r0.l(r8)
            r10.invalidate()
        L_0x0139:
            return
        L_0x013a:
            int r10 = r9.getTop()
            r8.i = r10
            float r10 = java.lang.Math.abs(r11)
            r0 = 1128792064(0x43480000, float:200.0)
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            r0 = 0
            r1 = 1
            r2 = 0
            r3 = 2
            android.widget.FrameLayout r4 = r8.j
            nrb r4 = (defpackage.nrb) r4
            if (r10 <= 0) goto L_0x0197
            float r10 = java.lang.Math.abs(r11)
            r5 = 1174011904(0x45fa0000, float:8000.0)
            int r10 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r10 >= 0) goto L_0x0189
            boolean r10 = r4.v
            if (r10 == 0) goto L_0x0175
            int r10 = r8.i
            erb r5 = r4.b
            int r5 = r5.b()
            if (r10 >= r5) goto L_0x016f
            int r10 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r10 <= 0) goto L_0x01a6
            goto L_0x01c2
        L_0x016f:
            int r10 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r10 <= 0) goto L_0x01c2
            goto L_0x01e9
        L_0x0175:
            int r10 = r8.i
            erb r5 = r4.b
            int r5 = r5.b()
            if (r10 <= r5) goto L_0x0184
            int r10 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r10 >= 0) goto L_0x01a6
            goto L_0x01c2
        L_0x0184:
            int r10 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r10 >= 0) goto L_0x01c2
            goto L_0x01e9
        L_0x0189:
            boolean r10 = r4.v
            if (r10 == 0) goto L_0x0192
            int r10 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r10 <= 0) goto L_0x01a6
            goto L_0x01e9
        L_0x0192:
            int r10 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r10 >= 0) goto L_0x01a6
            goto L_0x01e9
        L_0x0197:
            boolean r10 = r4.v
            if (r10 == 0) goto L_0x01c4
            int r10 = r8.i
            erb r11 = r4.b
            int r11 = r11.b()
            int r11 = r11 / r3
            if (r10 >= r11) goto L_0x01a8
        L_0x01a6:
            r0 = r3
            goto L_0x01e9
        L_0x01a8:
            int r10 = r8.i
            erb r11 = r4.b
            int r11 = r11.b()
            erb r5 = r4.b
            int r5 = r5.c()
            erb r6 = r4.b
            int r6 = r6.b()
            int r5 = r5 - r6
            int r5 = r5 / r3
            int r5 = r5 + r11
            if (r10 <= r5) goto L_0x01c2
            goto L_0x01e9
        L_0x01c2:
            r0 = r1
            goto L_0x01e9
        L_0x01c4:
            int r10 = r8.i
            erb r11 = r4.b
            int r11 = r11.b()
            int r11 = r11 / r3
            if (r10 <= r11) goto L_0x01d0
            goto L_0x01a6
        L_0x01d0:
            int r10 = r8.i
            erb r11 = r4.b
            int r11 = r11.b()
            erb r5 = r4.b
            int r5 = r5.c()
            erb r6 = r4.b
            int r6 = r6.b()
            int r5 = r5 - r6
            int r5 = r5 / r3
            int r5 = r5 + r11
            if (r10 >= r5) goto L_0x01c2
        L_0x01e9:
            r4.c = r0
            int r8 = r8.i
            int r10 = r4.getScrollStateOffset()
            if (r8 != r10) goto L_0x0200
            int r8 = r4.c
            if (r8 != 0) goto L_0x0200
            erb r8 = r4.b
            r8.f()
            r4.setBackgroundAlpha(r2)
            goto L_0x0217
        L_0x0200:
            int r8 = r9.getLeft()
            int r9 = r4.getScrollStateOffset()
            kag r10 = r4.a
            r10.p(r8, r9)
            erb r8 = r4.b
            int r9 = r4.c
            r8.i(r9)
            r4.invalidate()
        L_0x0217:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mrb.I(android.view.View, float, float):void");
    }

    public final boolean Q(View view, int i2) {
        switch (this.h) {
            case 0:
                nrb nrb = (nrb) this.j;
                return view == nrb.b.d() && nrb.o;
            default:
                orb orb = (orb) this.j;
                frb callback = orb.getCallback();
                return view == (callback != null ? callback.f() : null) && orb.o;
        }
    }

    public int f(View view, int i2) {
        switch (this.h) {
            case 0:
                return view.getLeft();
            default:
                return super.f(view, i2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0053  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int g(android.view.View r4, int r5) {
        /*
            r3 = this;
            int r4 = r3.h
            switch(r4) {
                case 0: goto L_0x005c;
                default: goto L_0x0005;
            }
        L_0x0005:
            android.widget.FrameLayout r3 = r3.j
            orb r3 = (defpackage.orb) r3
            boolean r4 = r3.getStackFromBottom()
            r0 = 0
            if (r4 == 0) goto L_0x0021
            frb r4 = r3.getCallback()
            if (r4 == 0) goto L_0x001f
            int r4 = r4.a()
        L_0x001a:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L_0x002c
        L_0x001f:
            r4 = r0
            goto L_0x002c
        L_0x0021:
            frb r4 = r3.getCallback()
            if (r4 == 0) goto L_0x001f
            int r4 = r4.e()
            goto L_0x001a
        L_0x002c:
            r1 = 0
            if (r4 == 0) goto L_0x0034
            int r4 = r4.intValue()
            goto L_0x0035
        L_0x0034:
            r4 = r1
        L_0x0035:
            boolean r2 = r3.getStackFromBottom()
            frb r3 = r3.getCallback()
            if (r2 == 0) goto L_0x004a
            if (r3 == 0) goto L_0x0051
            int r3 = r3.e()
        L_0x0045:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            goto L_0x0051
        L_0x004a:
            if (r3 == 0) goto L_0x0051
            int r3 = r3.a()
            goto L_0x0045
        L_0x0051:
            if (r0 == 0) goto L_0x0057
            int r1 = r0.intValue()
        L_0x0057:
            int r3 = kotlin.ranges.RangesKt.coerceIn((int) r5, (int) r4, (int) r1)
            return r3
        L_0x005c:
            android.widget.FrameLayout r3 = r3.j
            nrb r3 = (defpackage.nrb) r3
            boolean r4 = r3.v
            if (r4 == 0) goto L_0x006b
            erb r4 = r3.b
            int r4 = r4.a()
            goto L_0x0071
        L_0x006b:
            erb r4 = r3.b
            int r4 = r4.c()
        L_0x0071:
            boolean r0 = r3.v
            erb r3 = r3.b
            if (r0 == 0) goto L_0x007c
            int r3 = r3.c()
            goto L_0x0080
        L_0x007c:
            int r3 = r3.a()
        L_0x0080:
            if (r5 >= r4) goto L_0x0083
            r5 = r4
        L_0x0083:
            if (r5 <= r3) goto L_0x0086
            goto L_0x0087
        L_0x0086:
            r3 = r5
        L_0x0087:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mrb.g(android.view.View, int):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r0 = r0.f();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int q(int r4) {
        /*
            r3 = this;
            android.widget.FrameLayout r4 = r3.j
            int r3 = r3.h
            switch(r3) {
                case 0: goto L_0x0053;
                default: goto L_0x0007;
            }
        L_0x0007:
            orb r4 = (defpackage.orb) r4
            r3 = 0
            kotlin.Result$Companion r0 = kotlin.Result.Companion     // Catch:{ all -> 0x0021 }
            frb r0 = r4.getCallback()     // Catch:{ all -> 0x0021 }
            if (r0 == 0) goto L_0x0023
            android.view.View r0 = r0.f()     // Catch:{ all -> 0x0021 }
            if (r0 == 0) goto L_0x0023
            int r4 = r4.indexOfChild(r0)     // Catch:{ all -> 0x0021 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0021 }
            goto L_0x0024
        L_0x0021:
            r4 = move-exception
            goto L_0x0029
        L_0x0023:
            r4 = r3
        L_0x0024:
            java.lang.Object r4 = kotlin.Result.m23constructorimpl(r4)     // Catch:{ all -> 0x0021 }
            goto L_0x0033
        L_0x0029:
            kotlin.Result$Companion r0 = kotlin.Result.Companion
            java.lang.Object r4 = kotlin.ResultKt.createFailure(r4)
            java.lang.Object r4 = kotlin.Result.m23constructorimpl(r4)
        L_0x0033:
            java.lang.Throwable r0 = kotlin.Result.m26exceptionOrNullimpl(r4)
            if (r0 == 0) goto L_0x0040
            java.lang.String r1 = "PopupLayout"
            java.lang.String r2 = "getOrderedChildIndex fail, issue ONEME-9645"
            defpackage.z68.f(r1, r2, r0)
        L_0x0040:
            boolean r0 = kotlin.Result.m29isFailureimpl(r4)
            if (r0 == 0) goto L_0x0047
            goto L_0x0048
        L_0x0047:
            r3 = r4
        L_0x0048:
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 == 0) goto L_0x0051
            int r3 = r3.intValue()
            goto L_0x0052
        L_0x0051:
            r3 = -1
        L_0x0052:
            return r3
        L_0x0053:
            nrb r4 = (defpackage.nrb) r4
            erb r3 = r4.b
            android.view.View r3 = r3.d()
            int r3 = r4.indexOfChild(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mrb.q(int):int");
    }

    public int t(View view) {
        switch (this.h) {
            case 0:
                return 0;
            default:
                return super.t(view);
        }
    }

    public final int u(View view) {
        switch (this.h) {
            case 0:
                return view.getHeight();
            default:
                return view.getHeight();
        }
    }
}
