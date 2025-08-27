package defpackage;

/* renamed from: gy6  reason: default package */
public final class gy6 extends n85 {
    public final huf a;

    public gy6(huf huf) {
        this.a = huf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gy6) && this.a == ((gy6) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "HideErrorInputEvent(typeInput=" + this.a + ")";
    }
}
