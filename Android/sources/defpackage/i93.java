package defpackage;

/* renamed from: i93  reason: default package */
public final class i93 {
    public final int a;

    public i93(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i93) && this.a == ((i93) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return wj6.l(new StringBuilder("CommonStatesBackgroundActiveActionColors(themed="), this.a, ")");
    }
}
