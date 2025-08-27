package defpackage;

/* renamed from: pod  reason: default package */
public final class pod {
    public final long a;
    public final long b;

    public pod(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || pod.class != obj.getClass()) {
            return false;
        }
        pod pod = (pod) obj;
        return this.a == pod.a && this.b == pod.b;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}
