package defpackage;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: l27  reason: default package */
public final class l27 implements g4g {
    public final String a;
    public final zy b;
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final int h;
    public final int i;
    public final Uri j;
    public final long k;

    public l27(int i2, int i3, long j2, long j3, long j4, zy zyVar, String str, boolean z, boolean z2) {
        this.a = str;
        this.b = zyVar;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = z;
        this.g = z2;
        this.h = i2;
        this.i = i3;
        this.j = Uri.parse(str);
        this.k = j3;
        p5g p5g = p5g.HLS;
    }

    public final g4g a(long j2) {
        String str = this.a;
        zy zyVar = this.b;
        return new l27(this.h, this.i, this.c, this.d, j2, zyVar, str, this.f, this.g);
    }

    public final zy b() {
        return this.b;
    }

    public final boolean c() {
        return this.f;
    }

    public final long d() {
        return this.e;
    }

    public final long e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l27)) {
            return false;
        }
        l27 l27 = (l27) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) l27.a) && Intrinsics.areEqual((Object) this.b, (Object) l27.b) && this.c == l27.c && this.d == l27.d && this.e == l27.e && this.f == l27.f && this.g == l27.g && this.h == l27.h && this.i == l27.i;
    }

    public final long f() {
        return this.c;
    }

    public final long g() {
        return this.k;
    }

    public final int getHeight() {
        return this.i;
    }

    public final int getWidth() {
        return this.h;
    }

    public final Uri h() {
        return this.j;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        zy zyVar = this.b;
        return Integer.hashCode(this.i) + rae.h(this.h, g63.e(g63.e(wzf.i(wzf.i(wzf.i((hashCode + (zyVar == null ? 0 : zyVar.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HlsVideoContent(url=");
        sb.append(this.a);
        sb.append(", videoCollage=");
        sb.append(this.b);
        sb.append(", videoId=");
        sb.append(this.c);
        sb.append(", duration=");
        sb.append(this.d);
        sb.append(", initSeekPos=");
        sb.append(this.e);
        sb.append(", isLive=");
        sb.append(this.f);
        sb.append(", isMute=");
        sb.append(this.g);
        sb.append(", width=");
        sb.append(this.h);
        sb.append(", height=");
        return wj6.l(sb, this.i, ")");
    }
}
