package defpackage;

/* renamed from: qbc  reason: default package */
public final class qbc implements sbc {
    public final long a;

    public qbc(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qbc) && this.a == ((qbc) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return wj6.m(new StringBuilder("ModeRecordingVideo(startTimeMs="), this.a, ")");
    }
}
