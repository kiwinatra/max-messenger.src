package defpackage;

/* renamed from: vgg  reason: default package */
public final class vgg extends xgg {
    public final long a;

    public vgg(long j) {
        this.a = j;
    }

    public final long a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vgg) && this.a == ((vgg) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return wj6.m(new StringBuilder("Completed(requestId="), this.a, ")");
    }
}
