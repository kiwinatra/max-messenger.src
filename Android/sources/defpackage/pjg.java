package defpackage;

/* renamed from: pjg  reason: default package */
public final class pjg {
    public static final ojg Companion = new Object();
    public final boolean a;

    public /* synthetic */ pjg(int i, boolean z) {
        if (1 == (i & 1)) {
            this.a = z;
        } else {
            gsg.G(i, 1, njg.a.d());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pjg) && this.a == ((pjg) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return tr1.m(new StringBuilder("WebAppSetupBackButtonRequest(isVisible="), this.a, ")");
    }
}
