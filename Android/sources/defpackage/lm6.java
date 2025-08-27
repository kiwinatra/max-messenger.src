package defpackage;

/* renamed from: lm6  reason: default package */
public final class lm6 implements nm6 {
    public final int a;

    public lm6(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lm6) && this.a == ((lm6) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return wj6.l(new StringBuilder("UpdateCameraLayoutParams(size="), this.a, ")");
    }
}
