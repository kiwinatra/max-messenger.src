package defpackage;

/* renamed from: ng9  reason: default package */
public final class ng9 extends qg9 {
    public final tb9 a;

    public ng9(tb9 tb9) {
        this.a = tb9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ng9) && this.a == ((ng9) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "NewInputState(expandableState=" + this.a + ")";
    }
}
