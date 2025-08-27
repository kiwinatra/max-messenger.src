package defpackage;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: os8  reason: default package */
public final class os8 {
    public final long a;
    public final long b;
    public final Set c;
    public final long d;

    public os8(long j, long j2, Set set, long j3) {
        this.a = j;
        this.b = j2;
        this.c = set;
        this.d = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof os8)) {
            return false;
        }
        os8 os8 = (os8) obj;
        return this.a == os8.a && this.b == os8.b && Intrinsics.areEqual((Object) this.c, (Object) os8.c) && this.d == os8.d;
    }

    public final int hashCode() {
        int i = wzf.i(Long.hashCode(this.a) * 31, 31, this.b);
        return Long.hashCode(this.d) + ((this.c.hashCode() + i) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaMarkers(backward=");
        sb.append(this.a);
        sb.append(", forward=");
        sb.append(this.b);
        sb.append(", types=");
        sb.append(this.c);
        sb.append(", chatId=");
        return wj6.m(sb, this.d, ")");
    }
}
