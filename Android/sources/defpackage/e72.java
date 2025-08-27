package defpackage;

import java.util.Arrays;

/* renamed from: e72  reason: default package */
public final class e72 extends i2a {
    public final long[] a;

    public e72(long[] jArr) {
        this.a = jArr;
    }

    public final boolean equals(Object obj) {
        if (obj == null || e72.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(new Object[]{this.a}, new Object[]{((e72) obj).a});
    }

    public final int hashCode() {
        Object[] objArr = {this.a};
        return e72.class.hashCode() + (Arrays.hashCode(objArr) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.a};
        String[] split = "a".length() == 0 ? new String[0] : "a".split(";");
        StringBuilder sb = new StringBuilder();
        sb.append(e72.class.getSimpleName());
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
