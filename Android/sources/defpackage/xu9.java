package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: xu9  reason: default package */
public final class xu9 implements g4g {
    public final List a;
    public final zy b;
    public final long c;
    public final long d;
    public final boolean e;
    public final int f;
    public final int g;
    public final long h;
    public final Uri i;

    public xu9(ArrayList arrayList, zy zyVar, long j, long j2, boolean z, int i2, int i3) {
        this.a = arrayList;
        this.b = zyVar;
        this.c = j;
        this.d = j2;
        this.e = z;
        this.f = i2;
        this.g = i3;
        this.h = j2;
        this.i = arrayList.isEmpty() ? Uri.EMPTY : Uri.parse(((vu9) arrayList.get(0)).a);
        p5g p5g = p5g.HLS;
    }

    public final zy b() {
        return this.b;
    }

    public final boolean c() {
        return false;
    }

    public final long d() {
        return 0;
    }

    public final long e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xu9)) {
            return false;
        }
        xu9 xu9 = (xu9) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) xu9.a) && Intrinsics.areEqual((Object) this.b, (Object) xu9.b) && this.c == xu9.c && this.d == xu9.d && this.e == xu9.e && this.f == xu9.f && this.g == xu9.g;
    }

    public final long f() {
        return this.c;
    }

    public final long g() {
        return this.h;
    }

    public final int getHeight() {
        return this.g;
    }

    public final int getWidth() {
        return this.f;
    }

    public final Uri h() {
        return this.i;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        zy zyVar = this.b;
        return Integer.hashCode(this.g) + rae.h(this.f, g63.e(wzf.i(wzf.i((hashCode + (zyVar == null ? 0 : zyVar.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Mp4VideoContent(items=");
        sb.append(this.a);
        sb.append(", videoCollage=");
        sb.append(this.b);
        sb.append(", videoId=");
        sb.append(this.c);
        sb.append(", duration=");
        sb.append(this.d);
        sb.append(", isMute=");
        sb.append(this.e);
        sb.append(", width=");
        sb.append(this.f);
        sb.append(", height=");
        return wj6.l(sb, this.g, ")");
    }
}
