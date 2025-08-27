package defpackage;

/* renamed from: oz6  reason: default package */
public final class oz6 extends tz6 {
    public final hz6 a;

    public oz6(hz6 hz6) {
        this.a = hz6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oz6) && this.a == ((oz6) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CallType(callMediaType=" + this.a + ")";
    }
}
