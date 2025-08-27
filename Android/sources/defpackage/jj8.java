package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: jj8  reason: default package */
public final class jj8 implements p6a {
    public final gme a;
    public final yoc b;
    public final rjf c;
    public final voc d;
    public final kz3 e;
    public long f;
    public int g;
    public int h;
    public final gj8 i;
    public kbb j;
    public cj8 k;
    public final CopyOnWriteArrayList l;

    /* JADX WARNING: Removed duplicated region for block: B:45:0x0210  */
    /* JADX WARNING: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public jj8(defpackage.gme r17, defpackage.gj8 r18, defpackage.yoc r19, defpackage.rjf r20, defpackage.voc r21, defpackage.kz3 r22) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r21
            r16.<init>()
            r0.a = r1
            r4 = r19
            r0.b = r4
            r4 = r20
            r0.c = r4
            r0.d = r3
            r4 = r22
            r0.e = r4
            java.lang.String r4 = "MediaAdaptation"
            if (r2 == 0) goto L_0x01e0
            ej8 r5 = r2.a
            double r6 = r5.e
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            java.lang.String r11 = "Invalid badNetwork.rttLeaveLevel2Mode: "
            java.lang.String r12 = " Must be >= 0"
            if (r10 > 0) goto L_0x0046
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r11)
            r2.append(r6)
            r2.append(r12)
            java.lang.String r2 = r2.toString()
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            r5.<init>(r2)
            r3.reportException(r4, r2, r5)
            goto L_0x01e0
        L_0x0046:
            double r13 = r5.d
            int r10 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r10 > 0) goto L_0x0067
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "Invalid badNetwork.rttEnterLevel2Mode: "
            r2.<init>(r5)
            r2.append(r13)
            r2.append(r12)
            java.lang.String r2 = r2.toString()
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            r5.<init>(r2)
            r3.reportException(r4, r2, r5)
            goto L_0x01e0
        L_0x0067:
            double r0 = r5.a
            int r10 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            java.lang.String r15 = "Invalid badNetwork.rttThreshold: "
            if (r10 > 0) goto L_0x0088
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r15)
            r2.append(r0)
            r2.append(r12)
            java.lang.String r0 = r2.toString()
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            r3.reportException(r4, r0, r1)
            goto L_0x01e0
        L_0x0088:
            int r10 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            java.lang.String r8 = " Must be < badNetwork.rttEnterLevel2Mode ("
            java.lang.String r9 = ")"
            if (r10 < 0) goto L_0x00af
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r15)
            r2.append(r0)
            r2.append(r8)
            r2.append(r13)
            r2.append(r9)
            java.lang.String r0 = r2.toString()
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            r3.reportException(r4, r0, r1)
            goto L_0x01e0
        L_0x00af:
            int r0 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r0 < 0) goto L_0x00d2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r11)
            r0.append(r6)
            r0.append(r8)
            r0.append(r13)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            r3.reportException(r4, r0, r1)
            goto L_0x01e0
        L_0x00d2:
            double r0 = r5.b
            r10 = 0
            int r8 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r8 > 0) goto L_0x00f5
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "Invalid badNetwork.lostPacketsLimitForRttBelowLowBound: "
            r2.<init>(r5)
            r2.append(r0)
            r2.append(r12)
            java.lang.String r0 = r2.toString()
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            r3.reportException(r4, r0, r1)
            goto L_0x01e0
        L_0x00f5:
            double r0 = r5.c
            r10 = 0
            int r8 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r8 > 0) goto L_0x0118
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "Invalid badNetwork.lostPacketsLimitForRttAboveLowBound: "
            r2.<init>(r5)
            r2.append(r0)
            r2.append(r12)
            java.lang.String r0 = r2.toString()
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            r3.reportException(r4, r0, r1)
            goto L_0x01e0
        L_0x0118:
            fj8 r0 = r2.b
            double r10 = r0.a
            double r13 = r0.c
            int r1 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r1 < 0) goto L_0x0145
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Invalid goodNetwork.rttLowBound: "
            r0.<init>(r1)
            r0.append(r10)
            java.lang.String r1 = " Must be < goodNetwork.rttHighBound ("
            r0.append(r1)
            r0.append(r13)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            r3.reportException(r4, r0, r1)
            goto L_0x01e0
        L_0x0145:
            double r10 = r0.b
            r13 = 0
            int r1 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r1 > 0) goto L_0x0168
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Invalid badNetwork.lostPacketsLimitForRttLowBound: "
            r0.<init>(r1)
            r0.append(r10)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            r3.reportException(r4, r0, r1)
            goto L_0x01e0
        L_0x0168:
            double r10 = r0.d
            r13 = 0
            int r1 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r1 > 0) goto L_0x018a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Invalid badNetwork.lostPacketsLimitForRttHighBound: "
            r0.<init>(r1)
            r0.append(r10)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            r3.reportException(r4, r0, r1)
            goto L_0x01e0
        L_0x018a:
            long r0 = r0.e
            r10 = 0
            int r8 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r8 > 0) goto L_0x01a1
            java.lang.String r2 = "Invalid badNetwork.recoveryTimeoutMs: "
            java.lang.String r0 = defpackage.wj6.j(r0, r2, r12)
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            r3.reportException(r4, r0, r1)
            goto L_0x01e0
        L_0x01a1:
            int r0 = r5.f
            if (r0 >= 0) goto L_0x01c7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid badNetwork.videoBitrateLevel1K : "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = " Must be >= 0 ("
            r1.append(r0)
            r1.append(r6)
            r1.append(r9)
            java.lang.String r0 = r1.toString()
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            r3.reportException(r4, r0, r1)
            goto L_0x01e0
        L_0x01c7:
            int r1 = r5.g
            if (r1 <= r0) goto L_0x01dc
            java.lang.String r2 = "Invalid badNetwork.videoBitrateLevel2K : "
            java.lang.String r5 = " Must be <= ("
            java.lang.String r0 = defpackage.a81.l(r2, r1, r5, r0, r9)
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            r3.reportException(r4, r0, r1)
            goto L_0x01e0
        L_0x01dc:
            r1 = r16
            r0 = r2
            goto L_0x01e7
        L_0x01e0:
            gj8 r0 = new gj8
            r0.<init>()
            r1 = r16
        L_0x01e7:
            r1.i = r0
            cj8 r2 = defpackage.cj8.a
            r1.k = r2
            java.util.concurrent.CopyOnWriteArrayList r2 = new java.util.concurrent.CopyOnWriteArrayList
            r2.<init>()
            r1.l = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "Media adaptation control enabled. Configuration is "
            r2.<init>(r5)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r3.log(r4, r0)
            r0 = r17
            java.util.concurrent.CopyOnWriteArrayList r0 = r0.i
            boolean r2 = r0.contains(r1)
            if (r2 == 0) goto L_0x0210
            goto L_0x0213
        L_0x0210:
            r0.add(r1)
        L_0x0213:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jj8.<init>(gme, gj8, yoc, rjf, voc, kz3):void");
    }

    public final void a(bj8 bj8) {
        this.l.remove(bj8);
    }

    public final kbb b(cj8 cj8) {
        mbb mbb;
        String str;
        int i2;
        int i3;
        int i4;
        int i5;
        kbb kbb;
        kbb kbb2 = this.j;
        if (kbb2 == null) {
            i5 = 1280;
            i3 = 1280;
            str = "maintain-framerate";
            i4 = 1000;
            i2 = 30;
            mbb = null;
        } else {
            int i6 = kbb2.a;
            int i7 = kbb2.b;
            int i8 = kbb2.c;
            int i9 = kbb2.d;
            mbb mbb2 = kbb2.f;
            String str2 = kbb2.e;
            str = str2 == null ? "maintain-framerate" : str2;
            i5 = i6;
            i3 = i7;
            i4 = i8;
            i2 = i9;
            mbb = mbb2;
        }
        int i10 = ij8.$EnumSwitchMapping$0[cj8.ordinal()];
        gj8 gj8 = this.i;
        if (i10 == 1) {
            ej8 ej8 = gj8.a;
            if (ej8.i) {
                i5 = 320;
            }
            kbb = new kbb(i5, i3, ej8.j ? ej8.g : i4, i2, str, mbb, 4, ej8.k ? 3 : 0, cj8.name());
        } else if (i10 != 2) {
            kbb kbb3 = this.j;
            if (kbb3 == null) {
                return new kbb(i5, i3, i4, i2, str, mbb, 1, 0, cj8.name());
            }
            return new kbb(kbb3.a, kbb3.b, kbb3.c, kbb3.d, "maintain-framerate", kbb3.f, 1, kbb3.h, cj8.name());
        } else {
            ej8 ej82 = gj8.a;
            if (ej82.i) {
                i5 = 640;
            }
            kbb = new kbb(i5, i3, ej82.j ? ej82.f : i4, i2, str, mbb, 2, ej82.k ? 2 : 0, cj8.name());
        }
        return kbb;
    }

    public final void c(cj8 cj8, hj8 hj8) {
        cj8 cj82 = this.k;
        this.d.log("MediaAdaptation", "Update network condition. Current condition is " + cj82 + ", new one is " + cj8 + ", state is " + hj8);
        int i2 = ij8.$EnumSwitchMapping$0[cj8.ordinal()];
        jme jme = jme.switches_to_bad_net;
        kz3 kz3 = this.e;
        yoc yoc = this.b;
        boolean z = true;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    int i3 = this.h + 1;
                    this.h = i3;
                    yoc.logSimple(jme.switches_to_good_net, ((lz3) kz3).a, String.valueOf(i3));
                }
            } else if (this.k == cj8.a) {
                int i4 = this.g + 1;
                this.g = i4;
                yoc.logSimple(jme, ((lz3) kz3).a, String.valueOf(i4));
            }
        } else if (this.k == cj8.a) {
            int i5 = this.g + 1;
            this.g = i5;
            yoc.logSimple(jme, ((lz3) kz3).a, String.valueOf(i5));
        }
        this.k = cj8;
        kbb b2 = b(cj8);
        if (cj8 == cj8.a || !this.i.a.h) {
            z = false;
        }
        dj8 dj8 = new dj8(cj8, b2, z);
        Iterator it = this.l.iterator();
        while (it.hasNext()) {
            ((bj8) it.next()).q(dj8);
        }
    }

    public final void d(bj8 bj8) {
        this.l.add(bj8);
        cj8 cj8 = this.k;
        dj8 dj8 = new dj8(cj8, b(cj8), this.k != cj8.a && this.i.a.h);
        this.d.log("MediaAdaptation", "Got new subscriber, trigger my state event: " + dj8);
        bj8.q(dj8);
    }

    public final void e(kbb kbb) {
        this.j = kbb;
        cj8 cj8 = this.k;
        dj8 dj8 = new dj8(cj8, b(cj8), cj8 != cj8.a && this.i.a.h);
        Iterator it = this.l.iterator();
        while (it.hasNext()) {
            ((bj8) it.next()).q(dj8);
        }
    }
}
