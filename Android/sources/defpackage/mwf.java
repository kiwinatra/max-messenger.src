package defpackage;

import java.util.Map;
import java.util.Objects;

/* renamed from: mwf  reason: default package */
public final class mwf implements w9d {
    public final Map a;

    public mwf(Map map) {
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || mwf.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((mwf) obj).a);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.a});
    }

    public final String toString() {
        return "UpdateDisplayLayoutCommandV2Response{participantsToErrorMap=" + this.a + '}';
    }
}
