package defpackage;

import java.util.Objects;

/* renamed from: r2d  reason: default package */
public final class r2d implements w9d {
    public final Integer a;

    public r2d(Integer num) {
        this.a = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r2d.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.a, ((r2d) obj).a);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.a});
    }

    public final String toString() {
        return "ReportPerfStatResponse{estimatedPerformanceIndex=" + this.a + '}';
    }
}
