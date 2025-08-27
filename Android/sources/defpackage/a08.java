package defpackage;

/* renamed from: a08  reason: default package */
public final class a08 extends d08 {
    public final t64 a;

    public a08(t64 t64) {
        this.a = t64;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a08.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((a08) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (a08.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Failure {mOutputData=" + this.a + '}';
    }
}
