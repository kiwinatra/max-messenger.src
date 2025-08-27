package defpackage;

/* renamed from: blg  reason: default package */
public final class blg extends ehg {
    public final boolean a;

    public blg(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof blg) && this.a == ((blg) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return tr1.m(new StringBuilder("NeedCloseConfirmation(needConfirmation="), this.a, ")");
    }
}
