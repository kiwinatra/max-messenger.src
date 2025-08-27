package defpackage;

import android.content.Context;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* renamed from: ebf  reason: default package */
public final class ebf {
    public final Context a;
    public final ekd b = new ekd(10);
    public List c = CollectionsKt.emptyList();
    public List d = CollectionsKt.emptyList();

    public ebf(Context context) {
        this.a = context;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [fc4, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00b5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.ok0[] a(android.os.Handler r13, defpackage.mc5 r14, defpackage.mc5 r15, defpackage.mc5 r16, defpackage.mc5 r17) {
        /*
            r12 = this;
            r0 = r12
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            rx0 r10 = defpackage.rx0.w
            io8 r11 = new io8
            android.content.Context r3 = r0.a
            r6 = 5000(0x1388, double:2.4703E-320)
            ekd r4 = r0.b
            r2 = r11
            r5 = r10
            r8 = r13
            r9 = r14
            r2.<init>(r3, r4, r5, r6, r8, r9)
            r1.add(r11)
            r0.d = r1
            fc4 r2 = new fc4
            r2.<init>()
            t30 r3 = defpackage.t30.c
            r2.d = r3
            r9 = 0
            r2.a = r9
            v02 r4 = defpackage.v02.b
            r2.f = r4
            android.content.IntentFilter r4 = new android.content.IntentFilter
            java.lang.String r5 = "android.media.action.HDMI_AUDIO_PLUG"
            r4.<init>(r5)
            r5 = 0
            android.content.Context r6 = r0.a
            android.content.Intent r4 = r6.registerReceiver(r5, r4)
            int r5 = defpackage.t0g.a
            r7 = 17
            if (r5 < r7) goto L_0x0062
            java.lang.String r7 = defpackage.t0g.c
            java.lang.String r8 = "Amazon"
            boolean r8 = r8.equals(r7)
            if (r8 != 0) goto L_0x0052
            java.lang.String r8 = "Xiaomi"
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L_0x0062
        L_0x0052:
            android.content.ContentResolver r7 = r6.getContentResolver()
            java.lang.String r8 = "external_surround_sound_enabled"
            int r7 = android.provider.Settings.Global.getInt(r7, r8, r9)
            r8 = 1
            if (r7 != r8) goto L_0x0062
            t30 r3 = defpackage.t30.d
            goto L_0x00a4
        L_0x0062:
            r7 = 29
            r8 = 8
            if (r5 < r7) goto L_0x0088
            boolean r7 = defpackage.t0g.C(r6)
            if (r7 != 0) goto L_0x007e
            r7 = 23
            if (r5 < r7) goto L_0x0088
            android.content.pm.PackageManager r5 = r6.getPackageManager()
            java.lang.String r6 = "android.hardware.type.automotive"
            boolean r5 = r5.hasSystemFeature(r6)
            if (r5 == 0) goto L_0x0088
        L_0x007e:
            t30 r3 = new t30
            int[] r4 = defpackage.p30.a()
            r3.<init>(r8, r4)
            goto L_0x00a4
        L_0x0088:
            if (r4 == 0) goto L_0x00a4
            java.lang.String r5 = "android.media.extra.AUDIO_PLUG_STATE"
            int r5 = r4.getIntExtra(r5, r9)
            if (r5 != 0) goto L_0x0093
            goto L_0x00a4
        L_0x0093:
            t30 r3 = new t30
            java.lang.String r5 = "android.media.extra.ENCODINGS"
            int[] r5 = r4.getIntArrayExtra(r5)
            java.lang.String r6 = "android.media.extra.MAX_CHANNEL_COUNT"
            int r4 = r4.getIntExtra(r6, r8)
            r3.<init>(r4, r5)
        L_0x00a4:
            r3.getClass()
            r2.d = r3
            r2.b = r9
            r2.c = r9
            r2.a = r9
            java.lang.Object r3 = r2.e
            g6d r3 = (defpackage.g6d) r3
            if (r3 != 0) goto L_0x00be
            g6d r3 = new g6d
            k60[] r4 = new defpackage.k60[r9]
            r3.<init>((defpackage.k60[]) r4)
            r2.e = r3
        L_0x00be:
            rc4 r8 = new rc4
            r8.<init>(r2)
            kn8 r11 = new kn8
            ekd r4 = r0.b
            android.content.Context r3 = r0.a
            r2 = r11
            r5 = r10
            r6 = r13
            r7 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r1.add(r11)
            r0.c = r1
            android.os.Looper r0 = r13.getLooper()
            agf r2 = new agf
            r3 = r16
            r2.<init>(r3, r0)
            r1.add(r2)
            android.os.Looper r0 = r13.getLooper()
            dq9 r2 = new dq9
            r3 = r17
            r2.<init>(r3, r0)
            r1.add(r2)
            zu1 r0 = new zu1
            r0.<init>()
            r1.add(r0)
            ok0[] r0 = new defpackage.ok0[r9]
            java.lang.Object[] r0 = r1.toArray(r0)
            ok0[] r0 = (defpackage.ok0[]) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ebf.a(android.os.Handler, mc5, mc5, mc5, mc5):ok0[]");
    }
}
