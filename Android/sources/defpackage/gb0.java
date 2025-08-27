package defpackage;

/* renamed from: gb0  reason: default package */
public final class gb0 {
    public final String a;
    public final String b;

    public gb0(String str, String str2) {
        this.a = str;
        if (str2 != null) {
            this.b = str2;
            return;
        }
        throw new NullPointerException("Null version");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gb0)) {
            return false;
        }
        gb0 gb0 = (gb0) obj;
        return this.a.equals(gb0.a) && this.b.equals(gb0.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LibraryVersion{libraryName=");
        sb.append(this.a);
        sb.append(", version=");
        return wj6.n(sb, this.b, "}");
    }
}
