package defpackage;

import java.util.Objects;

/* renamed from: mge  reason: default package */
public final class mge implements t9d {
    public ue1 a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || mge.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((mge) obj).a);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.a});
    }

    public final String toString() {
        return "SpeakerChangedNotification{speaker=" + this.a + '}';
    }
}
