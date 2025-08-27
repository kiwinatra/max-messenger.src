package defpackage;

/* renamed from: ru6  reason: default package */
public final class ru6 {
    public final int a;
    public final int b;

    public ru6(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final int a() {
        return this.b - this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ru6.class != obj.getClass()) {
            return false;
        }
        ru6 ru6 = (ru6) obj;
        return this.b == ru6.b && this.a == ru6.a;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        sb.append(this.a);
        sb.append(", ");
        return wj6.l(sb, this.b, "]");
    }
}
