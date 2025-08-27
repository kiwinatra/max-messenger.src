package defpackage;

/* renamed from: na0  reason: default package */
public final class na0 {
    public final int a;
    public final int b;
    public final do1 c;

    public na0(int i, int i2, do1 do1) {
        this.a = i;
        this.b = i2;
        this.c = do1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof na0)) {
            return false;
        }
        na0 na0 = (na0) obj;
        return this.a == na0.a && this.b == na0.b && this.c.equals(na0.c);
    }

    public final int hashCode() {
        return this.c.hashCode() ^ ((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003);
    }

    public final String toString() {
        return "PendingSnapshot{jpegQuality=" + this.a + ", rotationDegrees=" + this.b + ", completer=" + this.c + "}";
    }
}
