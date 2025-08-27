package defpackage;

import android.net.Uri;
import java.io.File;
import kotlin.Lazy;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* renamed from: xeb  reason: default package */
public final class xeb {
    public final w28 a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;
    public final Lazy e;
    public final Lazy f;

    public xeb(Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4, Lazy lazy5, w28 w28) {
        this.a = w28;
        this.b = lazy;
        this.c = lazy3;
        this.d = lazy4;
        this.e = lazy5;
        this.f = lazy2;
    }

    public final p87 a(x10 x10, l20 l20) {
        Uri uri;
        Uri uri2;
        Uri uri3;
        Uri s;
        File file;
        x10 x102 = x10;
        l20 l202 = l20;
        int i = (x102.y > 0 ? 1 : (x102.y == 0 ? 0 : -1));
        d20 d20 = l202.n;
        if (i > 0 && (d20.a() || (d20.b() && !b(x10, l20)))) {
            return p87.m;
        }
        Lazy lazy = this.e;
        String str = l202.r;
        Uri uri4 = null;
        boolean z = x102.v;
        if (z) {
            ln5 ln5 = (ln5) this.c.getValue();
            x10 x103 = l202.b;
            String str2 = x103 != null ? x103.X : null;
            if (str2 == null || str2.length() == 0) {
                String str3 = x103 != null ? x103.z : null;
                file = (str3 == null || str3.length() == 0 || str.length() != 0) ? ((po5) ln5).l(l202.q) : ((po5) ln5).l(String.valueOf(x103.y));
            } else {
                file = ((po5) ln5).l(x103.X);
            }
            uri = file.exists() ? Uri.fromFile(file) : null;
            if (!(str == null || str.length() == 0)) {
                int i2 = cjf.g;
                if (!str.endsWith(".mp4")) {
                    uri2 = po5.s(o5a.z(str));
                    if (uri == null && uri2 != null) {
                        uri = uri2;
                    }
                }
            }
            String str4 = x102.Y;
            if (str4 == null || (uri2 = Uri.parse(str4)) == null) {
                String a2 = x10.a();
                uri2 = a2 != null ? Uri.parse(a2) : null;
            }
            uri = uri2;
        } else {
            if (str == null || str.length() == 0) {
                String a3 = x10.a();
                if (a3.length() <= 0) {
                    return p87.m;
                }
                s = po5.s(a3);
            } else {
                File file2 = new File(str);
                if (file2.exists()) {
                    s = Uri.fromFile(file2);
                } else {
                    uri = ((o20) ((t00) lazy.getValue())).c(l202, false);
                    uri2 = null;
                }
            }
            uri = null;
        }
        g20 g20 = g20.c;
        d20 d202 = d20.c;
        Lazy lazy2 = this.f;
        g20 g202 = l202.a;
        boolean z2 = g202 != g20 || !z ? !(g202 != g20 || ((ed2) lazy2.getValue()).e() || d20 == d202) : !(((ed2) lazy2.getValue()).c(true) || d20 == d202);
        if (uri2 != null) {
            uri3 = uri2;
        } else if (uri == null) {
            return p87.m;
        } else {
            uri3 = uri;
        }
        w28 w28 = this.a;
        int intValue = ((Number) ((Lazy) w28.o).getValue()).intValue();
        if (uri == null) {
            uri = ((o20) ((t00) lazy.getValue())).c(l202, false);
        }
        Uri uri5 = uri;
        v3d K = w28.K(x102.c, x102.o, true);
        String str5 = x102.z;
        if (str5 != null) {
            uri4 = Uri.parse(str5);
        }
        return new p87(x102.y, uri3, x102.c, x102.o, x102.v, intValue, uri5, K, z2, l202.q, uri4, 256);
    }

    public final boolean b(x10 x10, l20 l20) {
        if (!x10.v && l20.n.b()) {
            Duration.Companion companion = Duration.Companion;
            long m = ((qjd) ((x23) this.b.getValue())).m();
            DurationUnit durationUnit = DurationUnit.MILLISECONDS;
            if (Duration.m1352compareToLRDsOJo(Duration.m1388minusLRDsOJo(DurationKt.toDuration(m, durationUnit), DurationKt.toDuration(l20.o, durationUnit)), yeb.a) > 0) {
                return true;
            }
        }
        return false;
    }
}
