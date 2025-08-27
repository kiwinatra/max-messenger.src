package defpackage;

/* renamed from: m45  reason: default package */
public final class m45 implements oe7 {
    public final boolean a;

    public m45(boolean z) {
        this.a = z;
    }

    public final x9a b() {
        return null;
    }

    public final boolean isActive() {
        return this.a;
    }

    public final String toString() {
        return g63.l(new StringBuilder("Empty{"), this.a ? "Active" : "New", '}');
    }
}
