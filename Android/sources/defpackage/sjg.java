package defpackage;

/* renamed from: sjg  reason: default package */
public final class sjg {
    public static final rjg Companion = new Object();
    public final boolean a;

    public /* synthetic */ sjg(int i, boolean z) {
        if (1 == (i & 1)) {
            this.a = z;
        } else {
            gsg.G(i, 1, qjg.a.d());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sjg) && this.a == ((sjg) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return tr1.m(new StringBuilder("WebAppSetupClosingBehaviorRequest(needConfirmation="), this.a, ")");
    }
}
