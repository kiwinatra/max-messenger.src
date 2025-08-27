package defpackage;

/* renamed from: ai  reason: default package */
public final class ai extends ei {
    public final float a;

    public ai(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ai) && Float.compare(this.a, ((ai) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "FloatNumber(value=" + this.a + ")";
    }
}
