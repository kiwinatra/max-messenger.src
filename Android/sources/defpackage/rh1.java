package defpackage;

/* renamed from: rh1  reason: default package */
public final class rh1 extends ji1 {
    public final vag b;

    public rh1(vag vag) {
        this.b = vag;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rh1) && this.b == ((rh1) obj).b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "ChangeMode(mode=" + this.b + ")";
    }
}
