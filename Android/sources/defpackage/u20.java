package defpackage;

import java.util.List;
import java.util.Objects;

/* renamed from: u20  reason: default package */
public final class u20 implements t9d {
    public List a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u20.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((u20) obj).a);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.a});
    }

    public final String toString() {
        return "AudioActivityNotification{participantIds=" + this.a + '}';
    }
}
