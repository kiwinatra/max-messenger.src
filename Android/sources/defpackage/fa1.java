package defpackage;

/* renamed from: fa1  reason: default package */
public final class fa1 extends ka1 {
    public final boolean a;

    public fa1(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fa1) && this.a == ((fa1) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return tr1.m(new StringBuilder("LoadingState(isEnabled="), this.a, ")");
    }
}
