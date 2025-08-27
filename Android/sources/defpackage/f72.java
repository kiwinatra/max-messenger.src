package defpackage;

import java.io.Serializable;

/* renamed from: f72  reason: default package */
public final class f72 implements Serializable, l03 {
    public final long a;
    public final long b;

    public f72(long j, long j2) {
        this.a = j;
        this.b = j2;
        if (j == -1) {
            z68.o("Chunk", "", new IllegalStateException("start time is -1"));
        }
        if (j2 == -1) {
            z68.o("Chunk", "", new IllegalStateException("end time is -1"));
        }
    }

    public final long a() {
        return this.a;
    }

    public final long b() {
        return this.b;
    }

    public final ap0 c() {
        ap0 ap0 = new ap0(2);
        long j = this.a;
        if (j == -1) {
            z68.o("Chunk.Builder", "", new IllegalStateException("start time is -1"));
        }
        ap0.b = j;
        ap0.b(this.b);
        return ap0;
    }
}
