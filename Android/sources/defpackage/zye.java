package defpackage;

/* renamed from: zye  reason: default package */
public final class zye implements Comparable {
    public final long a;
    public final byte[] b;

    public zye(long j, byte[] bArr) {
        this.a = j;
        this.b = bArr;
    }

    public final int compareTo(Object obj) {
        return Long.compare(this.a, ((zye) obj).a);
    }
}
