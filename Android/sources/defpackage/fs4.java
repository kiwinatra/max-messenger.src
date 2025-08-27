package defpackage;

/* renamed from: fs4  reason: default package */
public final class fs4 implements hs4 {
    public final float a;
    public final long b;
    public final long c;

    public fs4(float f, long j, long j2) {
        this.a = f;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fs4)) {
            return false;
        }
        fs4 fs4 = (fs4) obj;
        return Float.compare(this.a, fs4.a) == 0 && this.b == fs4.b && this.c == fs4.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + wzf.i(Float.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Loading(progress=");
        sb.append(this.a);
        sb.append(", time=");
        sb.append(this.b);
        sb.append(", chatId=");
        return wj6.m(sb, this.c, ")");
    }
}
