package defpackage;

/* renamed from: qy3  reason: default package */
public final class qy3 implements ry3 {
    public final int a;

    public qy3(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qy3) && this.a == ((qy3) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return wj6.l(new StringBuilder("StopSeekPlayerProgress(progress="), this.a, ")");
    }
}
