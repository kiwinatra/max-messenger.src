package defpackage;

import java.util.Objects;

/* renamed from: oaa  reason: default package */
public final class oaa {
    public final long a;
    public final b10 b;

    public oaa(long j, b10 b10) {
        this.a = j;
        this.b = b10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oaa)) {
            return false;
        }
        oaa oaa = (oaa) obj;
        return this.a == oaa.a && this.b == oaa.b;
    }

    public final int hashCode() {
        return Objects.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }
}
