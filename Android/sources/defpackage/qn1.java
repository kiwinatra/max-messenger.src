package defpackage;

import java.util.Objects;

/* renamed from: qn1  reason: default package */
public final class qn1 {
    public final rn1 a;
    public final e51 b;

    public qn1(rn1 rn1, e51 e51) {
        this.a = rn1;
        this.b = e51;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qn1.class != obj.getClass()) {
            return false;
        }
        qn1 qn1 = (qn1) obj;
        return this.a.equals(qn1.a) && Objects.equals(this.b, qn1.b);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, this.b});
    }

    public final String toString() {
        return "WaitingParticipant{waitingParticipantId=" + this.a + ", externalId=" + this.b + '}';
    }
}
