package defpackage;

/* renamed from: jk9  reason: default package */
public final class jk9 implements lk9 {
    public final int a;

    public jk9(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jk9) && this.a == ((jk9) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return wj6.l(new StringBuilder("ProcessClickMultiSelect(actionId="), this.a, ")");
    }
}
