package defpackage;

import java.util.Objects;

/* renamed from: o41  reason: default package */
public final class o41 {
    public final ln1 a;
    public final y4g b;

    public o41(ln1 ln1, y4g y4g) {
        this.a = ln1;
        this.b = y4g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o41.class != obj.getClass()) {
            return false;
        }
        o41 o41 = (o41) obj;
        return this.a.equals(o41.a) && this.b.equals(o41.b);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, this.b});
    }

    public final String toString() {
        return "DisplayLayoutItem{videoTrackParticipantKey=" + this.a + ", layout=" + this.b + '}';
    }
}
