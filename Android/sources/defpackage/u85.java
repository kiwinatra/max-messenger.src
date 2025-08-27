package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.media3.common.PlaybackException;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;

/* renamed from: u85  reason: default package */
public final class u85 implements ud {
    public static final NumberFormat o;
    public final hkf a = new hkf();
    public final ekf b = new ekf();
    public final long c = SystemClock.elapsedRealtime();

    static {
        NumberFormat instance = NumberFormat.getInstance(Locale.US);
        o = instance;
        instance.setMinimumFractionDigits(2);
        instance.setMaximumFractionDigits(2);
        instance.setGroupingUsed(false);
    }

    public static String a(i70 i70) {
        return i70.a + "," + i70.c + "," + i70.b + "," + i70.d + "," + i70.e + "," + i70.f;
    }

    public static String d(long j) {
        if (j == -9223372036854775807L) {
            return "?";
        }
        return o.format((double) (((float) j) / 1000.0f));
    }

    public final void A(td tdVar, boolean z) {
        f(tdVar, "skipSilenceEnabled", Boolean.toString(z));
    }

    public final void A0(td tdVar, Exception exc) {
        i8b.o(b(tdVar, "internalError", "drmSessionManagerError", exc));
    }

    public final void B(td tdVar, uob uob, uob uob2, int i) {
        String str;
        StringBuilder sb = new StringBuilder("reason=");
        switch (i) {
            case 0:
                str = "AUTO_TRANSITION";
                break;
            case 1:
                str = "SEEK";
                break;
            case 2:
                str = "SEEK_ADJUSTMENT";
                break;
            case 3:
                str = "SKIP";
                break;
            case 4:
                str = "REMOVE";
                break;
            case 5:
                str = "INTERNAL";
                break;
            case 6:
                str = "SILENCE_SKIP";
                break;
            default:
                str = "?";
                break;
        }
        sb.append(str);
        sb.append(", PositionInfo:old [mediaItem=");
        sb.append(uob.b);
        sb.append(", period=");
        sb.append(uob.e);
        sb.append(", pos=");
        sb.append(uob.f);
        int i2 = uob.h;
        if (i2 != -1) {
            sb.append(", contentPos=");
            sb.append(uob.g);
            sb.append(", adGroup=");
            sb.append(i2);
            sb.append(", ad=");
            sb.append(uob.i);
        }
        sb.append("], PositionInfo:new [mediaItem=");
        sb.append(uob2.b);
        sb.append(", period=");
        sb.append(uob2.e);
        sb.append(", pos=");
        sb.append(uob2.f);
        int i3 = uob2.h;
        if (i3 != -1) {
            sb.append(", contentPos=");
            sb.append(uob2.g);
            sb.append(", adGroup=");
            sb.append(i3);
            sb.append(", ad=");
            sb.append(uob2.i);
        }
        sb.append("]");
        f(tdVar, "positionDiscontinuity", sb.toString());
    }

    public final void B0(td tdVar, int i) {
        f(tdVar, "playbackSuppressionReason", i != 0 ? i != 1 ? "?" : "TRANSIENT_AUDIO_FOCUS_LOSS" : "NONE");
    }

    public final void C(td tdVar, gob gob) {
        f(tdVar, "playbackParameters", gob.toString());
    }

    public final void C0(td tdVar) {
        e(tdVar, "drmKeysRestored");
    }

    public final void D(td tdVar, String str) {
        f(tdVar, "audioDecoderInitialized", str);
    }

    public final void D0(td tdVar, es8 es8) {
        f(tdVar, "upstreamDiscarded", ea6.e((ea6) es8.g));
    }

    public final void E(td tdVar, sp9 sp9) {
        i8b.m("metadata [" + c(tdVar));
        g(sp9, "  ");
        i8b.m("]");
    }

    public final void F(td tdVar, int i) {
        f(tdVar, "state", i != 1 ? i != 2 ? i != 3 ? i != 4 ? "?" : "ENDED" : "READY" : "BUFFERING" : "IDLE");
    }

    public final void G(td tdVar, int i) {
        f(tdVar, "droppedFrames", Integer.toString(i));
    }

    public final void I(td tdVar, ea6 ea6) {
        f(tdVar, "audioInputFormat", ea6.e(ea6));
    }

    public final void J(td tdVar, int i, int i2) {
        f(tdVar, "surfaceSize", i + ", " + i2);
    }

    public final void K(td tdVar, z94 z94) {
        e(tdVar, "videoDisabled");
    }

    public final void L(td tdVar, int i) {
        f(tdVar, "repeatMode", i != 0 ? i != 1 ? i != 2 ? "?" : "ALL" : "ONE" : "OFF");
    }

    public final void M(td tdVar, int i, long j) {
    }

    public final void N(td tdVar, i30 i30) {
        f(tdVar, "audioAttributes", i30.a + "," + i30.b + "," + i30.c + "," + i30.d);
    }

    public final void P(td tdVar, i70 i70) {
        f(tdVar, "audioTrackInit", a(i70));
    }

    public final void Q(td tdVar) {
        e(tdVar, "videoEnabled");
    }

    public final void R(td tdVar, es8 es8, IOException iOException, boolean z) {
        i8b.o(b(tdVar, "internalError", "loadError", iOException));
    }

    public final void T(td tdVar, v8g v8g) {
        f(tdVar, "videoSize", v8g.a + ", " + v8g.b);
    }

    public final void U(td tdVar, int i) {
        jkf jkf = tdVar.b;
        int i2 = jkf.i();
        int p = jkf.p();
        StringBuilder sb = new StringBuilder("timeline [");
        sb.append(c(tdVar));
        sb.append(", periodCount=");
        sb.append(i2);
        sb.append(", windowCount=");
        sb.append(p);
        sb.append(", reason=");
        sb.append(i != 0 ? i != 1 ? "?" : "SOURCE_UPDATE" : "PLAYLIST_CHANGED");
        i8b.m(sb.toString());
        for (int i3 = 0; i3 < Math.min(i2, 3); i3++) {
            ekf ekf = this.b;
            jkf.g(i3, ekf, false);
            i8b.m("  period [" + d(v0g.h0(ekf.d)) + "]");
        }
        if (i2 > 3) {
            i8b.m("  ...");
        }
        for (int i4 = 0; i4 < Math.min(p, 3); i4++) {
            hkf hkf = this.a;
            jkf.o(i4, hkf);
            i8b.m("  window [" + d(v0g.h0(hkf.m)) + ", seekable=" + hkf.h + ", dynamic=" + hkf.i + "]");
        }
        if (p > 3) {
            i8b.m("  ...");
        }
        i8b.m("]");
    }

    public final void V(td tdVar, ea6 ea6) {
        f(tdVar, "videoInputFormat", ea6.e(ea6));
    }

    public final void W(td tdVar, es8 es8) {
        f(tdVar, "downstreamFormat", ea6.e((ea6) es8.g));
    }

    public final void Z(td tdVar, int i) {
        StringBuilder sb = new StringBuilder("mediaItem [");
        sb.append(c(tdVar));
        sb.append(", reason=");
        sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? "?" : "PLAYLIST_CHANGED" : "SEEK" : "AUTO" : "REPEAT");
        sb.append("]");
        i8b.m(sb.toString());
    }

    public final String b(td tdVar, String str, String str2, Throwable th) {
        StringBuilder m = g63.m(str, " [");
        m.append(c(tdVar));
        String sb = m.toString();
        if (th instanceof PlaybackException) {
            StringBuilder m2 = g63.m(sb, ", errorCode=");
            m2.append(((PlaybackException) th).b());
            sb = m2.toString();
        }
        if (str2 != null) {
            sb = g63.i(sb, ", ", str2);
        }
        String z = i8b.z(th);
        if (!TextUtils.isEmpty(z)) {
            StringBuilder m3 = g63.m(sb, "\n  ");
            m3.append(z.replace("\n", "\n  "));
            m3.append(10);
            sb = m3.toString();
        }
        return tr1.j(sb, "]");
    }

    public final String c(td tdVar) {
        String str = "window=" + tdVar.c;
        nz8 nz8 = tdVar.d;
        if (nz8 != null) {
            StringBuilder m = g63.m(str, ", period=");
            m.append(tdVar.b.b(nz8.a));
            str = m.toString();
            if (nz8.b()) {
                StringBuilder m2 = g63.m(str, ", adGroup=");
                m2.append(nz8.b);
                StringBuilder m3 = g63.m(m2.toString(), ", ad=");
                m3.append(nz8.c);
                str = m3.toString();
            }
        }
        return "eventTime=" + d(tdVar.a - this.c) + ", mediaPos=" + d(tdVar.e) + ", " + str;
    }

    public final void e(td tdVar, String str) {
        i8b.m(b(tdVar, str, (String) null, (Throwable) null));
    }

    public final void e0(td tdVar, Object obj, long j) {
        f(tdVar, "renderedFirstFrame", String.valueOf(obj));
    }

    public final void f(td tdVar, String str, String str2) {
        i8b.m(b(tdVar, str, str2, (Throwable) null));
    }

    public final void g(sp9 sp9, String str) {
        for (qp9 append : sp9.a) {
            StringBuilder o2 = tr1.o(str);
            o2.append(append);
            i8b.m(o2.toString());
        }
    }

    public final void g0(td tdVar, String str) {
        f(tdVar, "videoDecoderReleased", str);
    }

    public final void h0(td tdVar, i70 i70) {
        f(tdVar, "audioTrackReleased", a(i70));
    }

    public final void i0(td tdVar) {
        e(tdVar, "audioEnabled");
    }

    public final void j0(td tdVar, int i) {
        f(tdVar, "drmSessionAcquired", "state=" + i);
    }

    public final void k0(td tdVar) {
        e(tdVar, "audioDisabled");
    }

    public final void l0(td tdVar, PlaybackException playbackException) {
        i8b.o(b(tdVar, "playerFailed", (String) null, playbackException));
    }

    public final void m0(td tdVar, float f) {
        f(tdVar, "volume", Float.toString(f));
    }

    public final void n0(td tdVar, int i, long j, long j2) {
        i8b.o(b(tdVar, "audioTrackUnderrun", i + ", " + j + ", " + j2, (Throwable) null));
    }

    public final void s(td tdVar, boolean z) {
        f(tdVar, "shuffleModeEnabled", Boolean.toString(z));
    }

    public final void t(td tdVar) {
        e(tdVar, "drmKeysLoaded");
    }

    public final void u(td tdVar, boolean z) {
        f(tdVar, "isPlaying", Boolean.toString(z));
    }

    public final void u0(td tdVar) {
        e(tdVar, "drmSessionReleased");
    }

    public final void v(td tdVar) {
        e(tdVar, "drmKeysRemoved");
    }

    public final void v0(td tdVar, String str) {
        f(tdVar, "videoDecoderInitialized", str);
    }

    public final void x0(td tdVar, boolean z) {
        f(tdVar, "loading", Boolean.toString(z));
    }

    public final void y(td tdVar, String str) {
        f(tdVar, "audioDecoderReleased", str);
    }

    public final void y0(td tdVar, boolean z, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(z);
        sb.append(", ");
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "?" : "END_OF_MEDIA_ITEM" : "REMOTE" : "AUDIO_BECOMING_NOISY" : "AUDIO_FOCUS_LOSS" : "USER_REQUEST");
        f(tdVar, "playWhenReady", sb.toString());
    }

    public final void z0(td tdVar, qqf qqf) {
        sp9 sp9;
        i8b.m("tracks [" + c(tdVar));
        tb7 a2 = qqf.a();
        for (int i = 0; i < a2.size(); i++) {
            pqf pqf = (pqf) a2.get(i);
            i8b.m("  group [");
            for (int i2 = 0; i2 < pqf.a; i2++) {
                String str = pqf.g(i2) ? "[X]" : "[ ]";
                i8b.m("    " + str + " Track:" + i2 + ", " + ea6.e(pqf.c(i2)) + ", supported=" + v0g.z(pqf.d(i2)));
            }
            i8b.m("  ]");
        }
        boolean z = false;
        int i3 = 0;
        while (!z && i3 < a2.size()) {
            pqf pqf2 = (pqf) a2.get(i3);
            int i4 = 0;
            while (!z && i4 < pqf2.a) {
                if (pqf2.g(i4) && (sp9 = pqf2.c(i4).k) != null && sp9.d() > 0) {
                    i8b.m("  Metadata [");
                    g(sp9, "    ");
                    i8b.m("  ]");
                    z = true;
                }
                i4++;
            }
            i3++;
        }
        i8b.m("]");
    }
}
