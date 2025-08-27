package defpackage;

import java.util.NoSuchElementException;

/* renamed from: vj0  reason: default package */
public abstract class vj0 implements zm8, an8 {
    public final /* synthetic */ int a;
    public final long b;
    public final long c;
    public long o;

    public vj0(int i, long j, long j2) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = j;
                this.c = j2;
                this.o = j - 1;
                return;
            default:
                this.b = j;
                this.c = j2;
                this.o = j - 1;
                return;
        }
    }

    public final void c() {
        switch (this.a) {
            case 0:
                long j = this.o;
                if (j < this.b || j > this.c) {
                    throw new NoSuchElementException();
                }
                return;
            default:
                long j2 = this.o;
                if (j2 < this.b || j2 > this.c) {
                    throw new NoSuchElementException();
                }
                return;
        }
    }

    public final boolean next() {
        switch (this.a) {
            case 0:
                long j = this.o + 1;
                this.o = j;
                return !(j > this.c);
            default:
                long j2 = this.o + 1;
                this.o = j2;
                return !(j2 > this.c);
        }
    }
}
