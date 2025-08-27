package defpackage;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: tr6  reason: default package */
public final class tr6 implements g4g {
    public final Uri a;
    public final int b;
    public final int c;

    public tr6(Uri uri, int i, int i2) {
        this.a = uri;
        this.b = i;
        this.c = i2;
        p5g p5g = p5g.HLS;
    }

    public final boolean c() {
        return false;
    }

    public final long d() {
        return 0;
    }

    public final long e() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tr6)) {
            return false;
        }
        tr6 tr6 = (tr6) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) tr6.a) && this.b == tr6.b && this.c == tr6.c;
    }

    public final long f() {
        return 0;
    }

    public final long g() {
        return 0;
    }

    public final int getHeight() {
        return this.c;
    }

    public final int getWidth() {
        return this.b;
    }

    public final Uri h() {
        return this.a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + rae.h(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GifVideoContent(contentUri=");
        sb.append(this.a);
        sb.append(", width=");
        sb.append(this.b);
        sb.append(", height=");
        return wj6.l(sb, this.c, ")");
    }
}
