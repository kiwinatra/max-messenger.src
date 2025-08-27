package defpackage;

/* renamed from: m37  reason: default package */
public final class m37 extends i37 {
    public boolean o;

    public final void close() {
        if (!this.b) {
            if (!this.o) {
                m();
            }
            this.b = true;
        }
    }

    public final long e(rt0 rt0, long j) {
        if (!(j >= 0)) {
            throw new IllegalArgumentException(wj6.i(j, "byteCount < 0: ").toString());
        } else if (!(!this.b)) {
            throw new IllegalStateException("closed".toString());
        } else if (this.o) {
            return -1;
        } else {
            long e = super.e(rt0, j);
            if (e != -1) {
                return e;
            }
            this.o = true;
            m();
            return -1;
        }
    }
}
