package defpackage;

import kotlin.math.MathKt;

/* renamed from: ibb  reason: default package */
public final class ibb {
    public final boolean a;
    public final boolean b;
    public final String c;
    public final String d;
    public final Integer e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final hbb j;
    public final boolean k;
    public final String l;

    public ibb(boolean z, boolean z2, String str, String str2, Integer num, boolean z3, boolean z4, boolean z5, boolean z6, hbb hbb, boolean z7, String str3) {
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = str2;
        this.e = num;
        this.f = z3;
        this.g = z4;
        this.h = z5;
        this.i = z6;
        this.j = hbb;
        this.k = z7;
        this.l = str3;
    }

    public static String a(boolean z) {
        return tr1.j(tr1.j(tr1.j(!z ? "CallsSDK-Audio-OpusNOLACE/Enabled/" : "", "WebRTC-AdjustOpusBandwidth/Enabled/"), "CallsSDK-DREDLowBitrate/Enabled/"), "WebRTC-Audio-StableTargetAdaptation/Enabled/");
    }

    public final gbb b() {
        gbb gbb;
        Integer num;
        hbb hbb = this.j;
        if (hbb != null) {
            if (!hbb.a || hbb.f == null || (num = hbb.e) == null) {
                gbb = null;
            } else {
                Integer valueOf = Integer.valueOf(MathKt.roundToInt(((float) num.intValue()) / 1000.0f));
                gbb = new gbb(valueOf, Integer.valueOf(MathKt.roundToInt(((float) num.intValue()) / 1000.0f)), Boolean.TRUE, (Integer) null, (Integer) null, (Double) null);
            }
            if (gbb != null) {
                return gbb;
            }
        }
        return new gbb((Integer) null, (Integer) null, (Boolean) null, (Integer) null, (Integer) null, (Double) null);
    }
}
