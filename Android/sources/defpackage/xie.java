package defpackage;

import java.util.List;
import java.util.Objects;

/* renamed from: xie  reason: default package */
public final class xie implements t9d {
    public List a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || xie.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((xie) obj).a);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.a});
    }

    public final String toString() {
        return "StalledParticipantsNotification{participantIds=" + this.a + '}';
    }
}
