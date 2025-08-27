package defpackage;

/* renamed from: l08  reason: default package */
public final class l08 {
    public final Object a;
    public vq5 b = new vq5(0);
    public boolean c;

    public l08(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l08.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((l08) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
