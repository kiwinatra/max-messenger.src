package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: jm4  reason: default package */
public final class jm4 implements tzb {
    public final String a;
    public final ngf b;
    public final int c;

    public jm4(String str, igf igf, int i) {
        this.a = str;
        this.b = igf;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jm4)) {
            return false;
        }
        jm4 jm4 = (jm4) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) jm4.a) && Intrinsics.areEqual((Object) this.b, (Object) jm4.b) && this.c == jm4.c;
    }

    public final boolean f(lz7 lz7) {
        return ((long) 4) == lz7.getItemId();
    }

    public final long getItemId() {
        return (long) 4;
    }

    public final int hashCode() {
        String str = this.a;
        return Integer.hashCode(this.c) + i2a.g((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
    }

    public final int i() {
        return 4;
    }

    public final boolean r(Object obj) {
        return Intrinsics.areEqual((Object) this, (Object) (lz7) obj);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DescriptionItem(text=");
        sb.append(this.a);
        sb.append(", hint=");
        sb.append(this.b);
        sb.append(", limitCharacters=");
        return wj6.l(sb, this.c, ")");
    }
}
