package defpackage;

import java.util.Arrays;
import java.util.List;

/* renamed from: ed8  reason: default package */
public final class ed8 extends i2a {
    public final dd8 a;
    public final List b;

    public ed8(dd8 dd8, List list) {
        this.a = dd8;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (obj == null || ed8.class != obj.getClass()) {
            return false;
        }
        ed8 ed8 = (ed8) obj;
        return Arrays.equals(new Object[]{this.a, this.b}, new Object[]{ed8.a, ed8.b});
    }

    public final int hashCode() {
        Object[] objArr = {this.a, this.b};
        return ed8.class.hashCode() + (Arrays.hashCode(objArr) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.a, this.b};
        String[] split = "a;b".length() == 0 ? new String[0] : "a;b".split(";");
        StringBuilder sb = new StringBuilder();
        sb.append(ed8.class.getSimpleName());
        sb.append("[");
        for (int i = 0; i < split.length; i++) {
            sb.append(split[i]);
            sb.append("=");
            sb.append(objArr[i]);
            if (i != split.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
