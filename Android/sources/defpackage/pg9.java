package defpackage;

/* renamed from: pg9  reason: default package */
public final class pg9 extends qg9 {
    public final og9 a;

    public pg9(og9 og9) {
        this.a = og9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pg9) && this.a == ((pg9) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ToggleEmoji(state=" + this.a + ")";
    }
}
