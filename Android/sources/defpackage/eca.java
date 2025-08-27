package defpackage;

import java.util.Objects;

/* renamed from: eca  reason: default package */
public final class eca {
    public static final eca b = new eca((Object) null);
    public final Object a;

    public eca(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof eca) {
            return Objects.equals(this.a, ((eca) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        Object obj = this.a;
        if (obj == null) {
            return "OnCompleteNotification";
        }
        if (obj instanceof jea) {
            return "OnErrorNotification[" + ((jea) obj).a + "]";
        }
        return "OnNextNotification[" + obj + "]";
    }
}
