package defpackage;

import java.util.Arrays;

/* renamed from: bv  reason: default package */
public final class bv extends i2a implements za3 {
    public final za3 a;

    public bv(za3 za3) {
        this.a = za3;
    }

    public final void b(pa3 pa3) {
        try {
            this.a.b(pa3);
        } catch (RuntimeException e) {
            if (!(e.getCause() instanceof InterruptedException)) {
                throw e;
            } else if (!pa3.f()) {
                Throwable cause = e.getCause();
                if (!pa3.a(cause)) {
                    n54.D(cause);
                }
            } else {
                Thread.currentThread().interrupt();
            }
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == null || bv.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(new Object[]{this.a}, new Object[]{((bv) obj).a});
    }

    public final int hashCode() {
        Object[] objArr = {this.a};
        return bv.class.hashCode() + (Arrays.hashCode(objArr) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.a};
        String[] split = "a".length() == 0 ? new String[0] : "a".split(";");
        StringBuilder sb = new StringBuilder();
        sb.append(bv.class.getSimpleName());
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
