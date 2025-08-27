package defpackage;

import java.util.Objects;

/* renamed from: ln1  reason: default package */
public final class ln1 {
    public final a9g a;
    public final ue1 b;
    public final vt9 c;

    public ln1(l15 l15) {
        this.a = (a9g) l15.b;
        this.b = (ue1) l15.a;
        this.c = (vt9) l15.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ln1.class != obj.getClass()) {
            return false;
        }
        ln1 ln1 = (ln1) obj;
        return this.a == ln1.a && this.b.equals(ln1.b) && Objects.equals(this.c, ln1.c);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, this.b, this.c});
    }

    public final String toString() {
        return "CallVideoTrackParticipantKey{" + this.b + ", type=" + this.a + ", mid=" + this.c + "}";
    }
}
