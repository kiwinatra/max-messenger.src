package defpackage;

/* renamed from: ga0  reason: default package */
public final class ga0 {
    public final int a;
    public final Throwable b;

    public ga0(Throwable th, int i) {
        this.a = i;
        this.b = th;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ga0)) {
            return false;
        }
        ga0 ga0 = (ga0) obj;
        if (this.a == ga0.a) {
            Throwable th = ga0.b;
            Throwable th2 = this.b;
            if (th2 == null) {
                if (th == null) {
                    return true;
                }
            } else if (th2.equals(th)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.a ^ 1000003) * 1000003;
        Throwable th = this.b;
        return (th == null ? 0 : th.hashCode()) ^ i;
    }

    public final String toString() {
        return "StateError{code=" + this.a + ", cause=" + this.b + "}";
    }
}
