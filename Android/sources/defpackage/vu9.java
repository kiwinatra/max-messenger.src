package defpackage;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: vu9  reason: default package */
public final class vu9 {
    public final String a;
    public final int b;
    public final int c;
    public final int d;
    public final Uri e;

    public vu9(String str, int i, int i2, int i3) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = Uri.parse(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vu9)) {
            return false;
        }
        vu9 vu9 = (vu9) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) vu9.a) && this.b == vu9.b && this.c == vu9.c && this.d == vu9.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + rae.h(this.c, rae.h(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Item(url=");
        sb.append(this.a);
        sb.append(", width=");
        sb.append(this.b);
        sb.append(", height=");
        sb.append(this.c);
        sb.append(", bitrate=");
        return wj6.l(sb, this.d, ")");
    }
}
