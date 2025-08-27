package defpackage;

/* renamed from: ljg  reason: default package */
public final class ljg implements ijg {
    public final boolean a;

    public ljg(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ljg) && this.a == ((ljg) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return tr1.m(new StringBuilder("ShowWebView(showBackButton="), this.a, ")");
    }
}
