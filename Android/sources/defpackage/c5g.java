package defpackage;

import android.os.Build;
import android.util.Range;
import android.util.Size;
import androidx.camera.video.internal.compat.quirk.MediaCodecInfoReportIncorrectInfoQuirk;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* renamed from: c5g  reason: default package */
public final class c5g implements a5g {
    public final a5g a;
    public final Range b;
    public final Range c;
    public final HashSet o;

    public c5g(a5g a5g) {
        HashSet hashSet = new HashSet();
        this.o = hashSet;
        this.a = a5g;
        int D0 = a5g.D0();
        this.b = Range.create(Integer.valueOf(D0), Integer.valueOf(((int) Math.ceil(4096.0d / ((double) D0))) * D0));
        int L0 = a5g.L0();
        this.c = Range.create(Integer.valueOf(L0), Integer.valueOf(((int) Math.ceil(2160.0d / ((double) L0))) * L0));
        List list = MediaCodecInfoReportIncorrectInfoQuirk.a;
        hashSet.addAll(MediaCodecInfoReportIncorrectInfoQuirk.a.contains(Build.MODEL.toLowerCase(Locale.US)) ? Collections.singleton(new Size(1920, 1080)) : Collections.emptySet());
    }

    public static a5g a(a5g a5g, Size size) {
        if (!(a5g instanceof c5g)) {
            if (on4.a.g(MediaCodecInfoReportIncorrectInfoQuirk.class) == null) {
                if (size != null && !a5g.B0(size.getWidth(), size.getHeight())) {
                    Range M0 = a5g.M0();
                    Range R0 = a5g.R0();
                    size.toString();
                    Objects.toString(M0);
                    Objects.toString(R0);
                }
            }
            a5g = new c5g(a5g);
        }
        if (size != null && (a5g instanceof c5g)) {
            ((c5g) a5g).o.add(size);
        }
        return a5g;
    }

    public final int D0() {
        return this.a.D0();
    }

    public final Range E0() {
        return this.a.E0();
    }

    public final boolean F0() {
        return this.a.F0();
    }

    public final Range I0(int i) {
        Integer valueOf = Integer.valueOf(i);
        Range range = this.c;
        boolean contains = range.contains(valueOf);
        a5g a5g = this.a;
        boolean z = contains && i % a5g.L0() == 0;
        bs0.m("Not supported height: " + i + " which is not in " + range + " or can not be divided by alignment " + a5g.L0(), z);
        return this.b;
    }

    public final Range K0(int i) {
        Integer valueOf = Integer.valueOf(i);
        Range range = this.b;
        boolean contains = range.contains(valueOf);
        a5g a5g = this.a;
        boolean z = contains && i % a5g.D0() == 0;
        bs0.m("Not supported width: " + i + " which is not in " + range + " or can not be divided by alignment " + a5g.D0(), z);
        return this.c;
    }

    public final int L0() {
        return this.a.L0();
    }

    public final Range M0() {
        return this.b;
    }

    public final boolean P0(int i, int i2) {
        a5g a5g = this.a;
        if (a5g.P0(i, i2)) {
            return true;
        }
        Iterator it = this.o.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            if (size.getWidth() == i && size.getHeight() == i2) {
                return true;
            }
        }
        if (this.b.contains(Integer.valueOf(i))) {
            return this.c.contains(Integer.valueOf(i2)) && i % a5g.D0() == 0 && i2 % a5g.L0() == 0;
        }
    }

    public final Range R0() {
        return this.c;
    }
}
