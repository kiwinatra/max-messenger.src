package defpackage;

/* renamed from: gn4  reason: default package */
public final class gn4 implements jv0 {
    public final int a;
    public final int b;
    public final int c;

    public gn4(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gn4)) {
            return false;
        }
        gn4 gn4 = (gn4) obj;
        return this.a == gn4.a && this.b == gn4.b && this.c == gn4.c;
    }

    public final int hashCode() {
        return ((((527 + this.a) * 31) + this.b) * 31) + this.c;
    }
}
