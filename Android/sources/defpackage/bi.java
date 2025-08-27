package defpackage;

/* renamed from: bi  reason: default package */
public final class bi extends ei {
    public final int a;

    public bi(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bi) && this.a == ((bi) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return wj6.l(new StringBuilder("IntNumber(value="), this.a, ")");
    }
}
