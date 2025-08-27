package defpackage;

/* renamed from: s1h  reason: default package */
public final class s1h implements y1h {
    public final y1h[] a;

    public s1h(y1h... y1hArr) {
        this.a = y1hArr;
    }

    public final j2h a(Class cls) {
        for (int i = 0; i < 2; i++) {
            y1h y1h = this.a[i];
            if (y1h.b(cls)) {
                return y1h.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    public final boolean b(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (this.a[i].b(cls)) {
                return true;
            }
        }
        return false;
    }
}
