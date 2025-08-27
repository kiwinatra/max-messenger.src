package defpackage;

/* renamed from: an5  reason: default package */
public final class an5 {
    public final xa0 a;
    public final xa0 b;

    public an5(xa0 xa0) {
        this.a = xa0;
        this.b = xa0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof an5)) {
            return false;
        }
        return this.b.equals(((an5) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return this.b.toString().replaceFirst("FileOutputOptionsInternal", "FileOutputOptions");
    }
}
