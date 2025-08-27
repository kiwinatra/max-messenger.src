package defpackage;

import java.util.Objects;

/* renamed from: rn1  reason: default package */
public final class rn1 {
    public final long a;
    public final ue1 b;

    public rn1(ue1 ue1, long j) {
        this.a = j;
        this.b = ue1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || rn1.class != obj.getClass()) {
            return false;
        }
        rn1 rn1 = (rn1) obj;
        return this.a == rn1.a && Objects.equals(this.b, rn1.b);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Long.valueOf(this.a), this.b});
    }

    public final String toString() {
        return "WaitingParticipantId{addedTs=" + this.a + ", participantId=" + this.b + '}';
    }
}
