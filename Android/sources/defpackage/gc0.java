package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: gc0  reason: default package */
public final class gc0 {
    public static final gc0 d = new gc0(0, 2, (oc0) null);
    public static final Set e = Collections.unmodifiableSet(new HashSet(Arrays.asList(new Integer[]{0, -1})));
    public static final xi3 f = new xi3(new gc0(0, 1, (oc0) null));
    public final int a;
    public final int b;
    public final oc0 c;

    public gc0(int i, int i2, oc0 oc0) {
        this.a = i;
        if (i2 != 0) {
            this.b = i2;
            this.c = oc0;
            return;
        }
        throw new NullPointerException("Null streamState");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gc0)) {
            return false;
        }
        gc0 gc0 = (gc0) obj;
        if (this.a == gc0.a && tr1.c(this.b, gc0.b)) {
            oc0 oc0 = gc0.c;
            oc0 oc02 = this.c;
            if (oc02 == null) {
                if (oc0 == null) {
                    return true;
                }
            } else if (oc02.equals(oc0)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int y = (((this.a ^ 1000003) * 1000003) ^ tr1.y(this.b)) * 1000003;
        oc0 oc0 = this.c;
        return (oc0 == null ? 0 : oc0.hashCode()) ^ y;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StreamInfo{id=");
        sb.append(this.a);
        sb.append(", streamState=");
        int i = this.b;
        sb.append(i != 1 ? i != 2 ? "null" : "INACTIVE" : "ACTIVE");
        sb.append(", inProgressTransformationInfo=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
