package defpackage;

/* renamed from: ci1  reason: default package */
public final class ci1 extends ji1 {
    public final boolean b;

    public ci1(boolean z) {
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ci1) && this.b == ((ci1) obj).b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b);
    }

    public final String toString() {
        return tr1.m(new StringBuilder("RecordStop(needRemoveFromChat="), this.b, ")");
    }
}
