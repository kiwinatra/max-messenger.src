package defpackage;

/* renamed from: ia1  reason: default package */
public final class ia1 extends ka1 {
    public final boolean a;

    public ia1(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ia1) && this.a == ((ia1) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return tr1.m(new StringBuilder("TalkingState(isEnabled="), this.a, ")");
    }
}
