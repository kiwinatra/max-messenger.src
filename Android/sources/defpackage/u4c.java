package defpackage;

/* renamed from: u4c  reason: default package */
public final class u4c extends j91 {
    public final int b;

    public u4c(int i) {
        super(12);
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u4c) && this.b == ((u4c) obj).b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b);
    }

    public final String toString() {
        return wj6.l(new StringBuilder("CallByNumber(contactId="), this.b, ")");
    }
}
