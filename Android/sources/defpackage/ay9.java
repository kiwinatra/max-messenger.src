package defpackage;

/* renamed from: ay9  reason: default package */
public final class ay9 extends o5a {
    public final long j;

    public ay9(long j2) {
        this.j = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ay9) && this.j == ((ay9) obj).j;
    }

    public final int hashCode() {
        return Long.hashCode(this.j);
    }

    public final String toString() {
        return wj6.m(new StringBuilder("AudioRecord(recordAudioId="), this.j, ")");
    }
}
