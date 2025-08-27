package defpackage;

/* renamed from: b93  reason: default package */
public final class b93 {
    public final int a;

    public b93(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b93)) {
            return false;
        }
        b93 b93 = (b93) obj;
        b93.getClass();
        return this.a == b93.a;
    }

    public final int hashCode() {
        return Integer.hashCode(-855638017) + rae.h(this.a, Integer.hashCode(-1) * 31, 31);
    }

    public final String toString() {
        return wj6.l(new StringBuilder("CommonIconColors(contrastStatic=-1, accent="), this.a, ", verificationCapsule=-855638017)");
    }
}
