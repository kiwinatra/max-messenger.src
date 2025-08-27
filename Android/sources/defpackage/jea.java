package defpackage;

import java.io.Serializable;
import java.util.Objects;

/* renamed from: jea  reason: default package */
public final class jea implements Serializable {
    public final Throwable a;

    public jea(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jea) {
            return Objects.equals(this.a, ((jea) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "NotificationLite.Error[" + this.a + "]";
    }
}
