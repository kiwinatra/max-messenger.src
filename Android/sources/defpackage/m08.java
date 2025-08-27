package defpackage;

/* renamed from: m08  reason: default package */
public final class m08 {
    public final Object a;
    public vq5 b = new vq5(1);
    public boolean c;
    public boolean d;

    public m08(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m08.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((m08) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
