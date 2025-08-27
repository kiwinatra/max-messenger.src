package defpackage;

/* renamed from: oy  reason: default package */
public final class oy implements v8c {
    public final int b;

    public oy(int i) {
        this.b = i;
    }

    public final Class annotationType() {
        return v8c.class;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v8c)) {
            return false;
        }
        oy oyVar = (oy) ((v8c) obj);
        if (this.b == oyVar.b) {
            u8c u8c = u8c.a;
            oyVar.getClass();
            if (u8c.equals(u8c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.b ^ 14552422) + (u8c.a.hashCode() ^ 2041407134);
    }

    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.b + "intEncoding=" + u8c.a + ')';
    }
}
