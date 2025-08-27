package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.util.SparseArray;
import java.util.Objects;

/* renamed from: u30  reason: default package */
public final class u30 {
    public static final u30 c = new u30(tb7.t(s30.d));
    public static final k0d d;
    public static final wb7 e;
    public final SparseArray a = new SparseArray();
    public final int b;

    static {
        Object[] objArr = {2, 5, 6};
        f6e.g(3, objArr);
        d = tb7.n(3, objArr);
        cs csVar = new cs(4);
        csVar.F(5, 6);
        csVar.F(17, 6);
        csVar.F(7, 6);
        csVar.F(30, 10);
        csVar.F(18, 6);
        csVar.F(6, 8);
        csVar.F(8, 8);
        csVar.F(14, 8);
        e = csVar.h();
    }

    public u30(k0d k0d) {
        for (int i = 0; i < k0d.o; i++) {
            s30 s30 = (s30) k0d.get(i);
            this.a.put(s30.a, s30);
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.a.size(); i3++) {
            i2 = Math.max(i2, ((s30) this.a.valueAt(i3)).b);
        }
        this.b = i2;
    }

    public static k0d a(int i, int[] iArr) {
        qb7 o = tb7.o();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int s30 : iArr) {
            o.a(new s30(s30, i));
        }
        return o.j();
    }

    public static u30 b(Context context, i30 i30, g40 g40) {
        return c(context, context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), i30, g40);
    }

    /* JADX WARNING: type inference failed for: r8v2, types: [cc7, jb7] */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a6, code lost:
        if ("Xiaomi".equals(r3) == false) goto L_0x00b5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.u30 c(android.content.Context r5, android.content.Intent r6, defpackage.i30 r7, defpackage.g40 r8) {
        /*
            java.lang.String r0 = "audio"
            java.lang.Object r0 = r5.getSystemService(r0)
            r0.getClass()
            android.media.AudioManager r0 = (android.media.AudioManager) r0
            r1 = 33
            if (r8 == 0) goto L_0x0010
            goto L_0x001a
        L_0x0010:
            int r8 = defpackage.v0g.a
            if (r8 < r1) goto L_0x0019
            g40 r8 = defpackage.r30.b(r0, r7)
            goto L_0x001a
        L_0x0019:
            r8 = 0
        L_0x001a:
            int r2 = defpackage.v0g.a
            java.lang.String r3 = "android.hardware.type.automotive"
            r4 = 23
            if (r2 < r1) goto L_0x0039
            boolean r1 = defpackage.v0g.P(r5)
            if (r1 != 0) goto L_0x0034
            if (r2 < r4) goto L_0x0039
            android.content.pm.PackageManager r1 = r5.getPackageManager()
            boolean r1 = r1.hasSystemFeature(r3)
            if (r1 == 0) goto L_0x0039
        L_0x0034:
            u30 r5 = defpackage.r30.a(r0, r7)
            return r5
        L_0x0039:
            if (r2 < r4) goto L_0x0044
            boolean r8 = defpackage.o30.b(r0, r8)
            if (r8 == 0) goto L_0x0044
            u30 r5 = c
            return r5
        L_0x0044:
            cc7 r8 = new cc7
            r0 = 4
            r8.<init>(r0)
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.a(r0)
            r0 = 29
            r1 = 10
            if (r2 < r0) goto L_0x0083
            boolean r0 = defpackage.v0g.P(r5)
            if (r0 != 0) goto L_0x006a
            if (r2 < r4) goto L_0x0083
            android.content.pm.PackageManager r0 = r5.getPackageManager()
            boolean r0 = r0.hasSystemFeature(r3)
            if (r0 == 0) goto L_0x0083
        L_0x006a:
            tb7 r5 = defpackage.q30.a(r7)
            r8.k(r5)
            u30 r5 = new u30
            dc7 r6 = r8.l()
            int[] r6 = defpackage.cvg.L(r6)
            k0d r6 = a(r1, r6)
            r5.<init>(r6)
            return r5
        L_0x0083:
            android.content.ContentResolver r5 = r5.getContentResolver()
            java.lang.String r7 = "use_external_surround_sound_flag"
            r0 = 0
            int r7 = android.provider.Settings.Global.getInt(r5, r7, r0)
            r2 = 1
            if (r7 != r2) goto L_0x0093
            r7 = r2
            goto L_0x0094
        L_0x0093:
            r7 = r0
        L_0x0094:
            if (r7 != 0) goto L_0x00a8
            java.lang.String r3 = defpackage.v0g.c
            java.lang.String r4 = "Amazon"
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L_0x00a8
            java.lang.String r4 = "Xiaomi"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x00b5
        L_0x00a8:
            java.lang.String r3 = "external_surround_sound_enabled"
            int r5 = android.provider.Settings.Global.getInt(r5, r3, r0)
            if (r5 != r2) goto L_0x00b5
            k0d r5 = d
            r8.k(r5)
        L_0x00b5:
            if (r6 == 0) goto L_0x00e8
            if (r7 != 0) goto L_0x00e8
            java.lang.String r5 = "android.media.extra.AUDIO_PLUG_STATE"
            int r5 = r6.getIntExtra(r5, r0)
            if (r5 != r2) goto L_0x00e8
            java.lang.String r5 = "android.media.extra.ENCODINGS"
            int[] r5 = r6.getIntArrayExtra(r5)
            if (r5 == 0) goto L_0x00d0
            java.util.List r5 = defpackage.cvg.d(r5)
            r8.k(r5)
        L_0x00d0:
            u30 r5 = new u30
            dc7 r7 = r8.l()
            int[] r7 = defpackage.cvg.L(r7)
            java.lang.String r8 = "android.media.extra.MAX_CHANNEL_COUNT"
            int r6 = r6.getIntExtra(r8, r1)
            k0d r6 = a(r6, r7)
            r5.<init>(r6)
            return r5
        L_0x00e8:
            u30 r5 = new u30
            dc7 r6 = r8.l()
            int[] r6 = defpackage.cvg.L(r6)
            k0d r6 = a(r1, r6)
            r5.<init>(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u30.c(android.content.Context, android.content.Intent, i30, g40):u30");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00c8, code lost:
        if (r12 != 5) goto L_0x00cb;
     */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00e3 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00e4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.util.Pair d(defpackage.i30 r14, defpackage.ea6 r15) {
        /*
            r13 = this;
            java.lang.String r0 = r15.n
            r0.getClass()
            java.lang.String r1 = r15.j
            int r0 = defpackage.vq9.b(r0, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            wb7 r2 = e
            boolean r1 = r2.containsKey(r1)
            r3 = 0
            if (r1 != 0) goto L_0x0019
            return r3
        L_0x0019:
            r1 = 7
            r4 = 6
            r5 = 8
            r6 = 18
            android.util.SparseArray r13 = r13.a
            if (r0 != r6) goto L_0x002b
            boolean r7 = defpackage.v0g.l(r13, r6)
            if (r7 != 0) goto L_0x002b
            r0 = r4
            goto L_0x003e
        L_0x002b:
            if (r0 != r5) goto L_0x0033
            boolean r7 = defpackage.v0g.l(r13, r5)
            if (r7 == 0) goto L_0x003d
        L_0x0033:
            r7 = 30
            if (r0 != r7) goto L_0x003e
            boolean r7 = defpackage.v0g.l(r13, r7)
            if (r7 != 0) goto L_0x003e
        L_0x003d:
            r0 = r1
        L_0x003e:
            boolean r7 = defpackage.v0g.l(r13, r0)
            if (r7 != 0) goto L_0x0045
            return r3
        L_0x0045:
            java.lang.Object r13 = r13.get(r0)
            s30 r13 = (defpackage.s30) r13
            r13.getClass()
            r7 = 1
            r8 = 0
            r9 = -1
            int r10 = r13.b
            dc7 r11 = r13.c
            int r12 = r15.B
            if (r12 == r9) goto L_0x0089
            if (r0 != r6) goto L_0x005c
            goto L_0x0089
        L_0x005c:
            java.lang.String r13 = r15.n
            java.lang.String r14 = "audio/vnd.dts.uhd;profile=p2"
            boolean r13 = r13.equals(r14)
            if (r13 == 0) goto L_0x0071
            int r13 = defpackage.v0g.a
            r14 = 33
            if (r13 >= r14) goto L_0x0071
            r13 = 10
            if (r12 <= r13) goto L_0x00b7
            return r3
        L_0x0071:
            if (r11 != 0) goto L_0x0077
            if (r12 > r10) goto L_0x0086
            r8 = r7
            goto L_0x0086
        L_0x0077:
            int r13 = defpackage.v0g.t(r12)
            if (r13 != 0) goto L_0x007e
            goto L_0x0086
        L_0x007e:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            boolean r8 = r11.contains(r13)
        L_0x0086:
            if (r8 != 0) goto L_0x00b7
            return r3
        L_0x0089:
            int r15 = r15.C
            if (r15 == r9) goto L_0x008e
            goto L_0x0091
        L_0x008e:
            r15 = 48000(0xbb80, float:6.7262E-41)
        L_0x0091:
            if (r11 == 0) goto L_0x0094
            goto L_0x00b6
        L_0x0094:
            int r6 = defpackage.v0g.a
            r9 = 29
            int r13 = r13.a
            if (r6 < r9) goto L_0x00a1
            int r10 = defpackage.q30.b(r13, r15, r14)
            goto L_0x00b6
        L_0x00a1:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r8)
            java.lang.Object r13 = r2.get(r13)
            if (r13 == 0) goto L_0x00b0
            r14 = r13
        L_0x00b0:
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r10 = r14.intValue()
        L_0x00b6:
            r12 = r10
        L_0x00b7:
            int r13 = defpackage.v0g.a
            r14 = 28
            if (r13 > r14) goto L_0x00cb
            if (r12 != r1) goto L_0x00c1
            r4 = r5
            goto L_0x00cc
        L_0x00c1:
            r14 = 3
            if (r12 == r14) goto L_0x00cc
            r14 = 4
            if (r12 == r14) goto L_0x00cc
            r14 = 5
            if (r12 != r14) goto L_0x00cb
            goto L_0x00cc
        L_0x00cb:
            r4 = r12
        L_0x00cc:
            r14 = 26
            if (r13 > r14) goto L_0x00dd
            java.lang.String r13 = "fugu"
            java.lang.String r14 = defpackage.v0g.b
            boolean r13 = r13.equals(r14)
            if (r13 == 0) goto L_0x00dd
            if (r4 != r7) goto L_0x00dd
            r4 = 2
        L_0x00dd:
            int r13 = defpackage.v0g.t(r4)
            if (r13 != 0) goto L_0x00e4
            return r3
        L_0x00e4:
            java.lang.Integer r14 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            android.util.Pair r13 = android.util.Pair.create(r14, r13)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u30.d(i30, ea6):android.util.Pair");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0049, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0014, code lost:
        if (r3 == null) goto L_0x0049;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 1
            if (r8 != r9) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r9 instanceof defpackage.u30
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            u30 r9 = (defpackage.u30) r9
            android.util.SparseArray r1 = r8.a
            android.util.SparseArray r3 = r9.a
            int r4 = defpackage.v0g.a
            if (r1 != 0) goto L_0x0017
            if (r3 != 0) goto L_0x0019
            goto L_0x0049
        L_0x0017:
            if (r3 != 0) goto L_0x001b
        L_0x0019:
            r1 = r2
            goto L_0x004a
        L_0x001b:
            int r4 = defpackage.v0g.a
            r5 = 31
            if (r4 < r5) goto L_0x0026
            boolean r1 = r1.contentEquals(r3)
            goto L_0x004a
        L_0x0026:
            int r4 = r1.size()
            int r5 = r3.size()
            if (r4 == r5) goto L_0x0031
            goto L_0x0019
        L_0x0031:
            r5 = r2
        L_0x0032:
            if (r5 >= r4) goto L_0x0049
            int r6 = r1.keyAt(r5)
            java.lang.Object r7 = r1.valueAt(r5)
            java.lang.Object r6 = r3.get(r6)
            boolean r6 = java.util.Objects.equals(r7, r6)
            if (r6 != 0) goto L_0x0047
            goto L_0x0019
        L_0x0047:
            int r5 = r5 + r0
            goto L_0x0032
        L_0x0049:
            r1 = r0
        L_0x004a:
            if (r1 == 0) goto L_0x0053
            int r8 = r8.b
            int r9 = r9.b
            if (r8 != r9) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            r0 = r2
        L_0x0054:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u30.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        SparseArray sparseArray = this.a;
        if (v0g.a >= 31) {
            i = sparseArray.contentHashCode();
        } else {
            int i2 = 17;
            for (int i3 = 0; i3 < sparseArray.size(); i3++) {
                int keyAt = sparseArray.keyAt(i3);
                i2 = Objects.hashCode(sparseArray.valueAt(i3)) + ((keyAt + (i2 * 31)) * 31);
            }
            i = i2;
        }
        return (i * 31) + this.b;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.b + ", audioProfiles=" + this.a + "]";
    }
}
