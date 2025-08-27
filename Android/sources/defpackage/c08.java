package defpackage;

/* renamed from: c08  reason: default package */
public final class c08 extends d08 {
    public final t64 a;

    public c08(t64 t64) {
        this.a = t64;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c08.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((c08) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (c08.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Success {mOutputData=" + this.a + '}';
    }
}
