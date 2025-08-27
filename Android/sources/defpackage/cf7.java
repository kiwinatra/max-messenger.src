package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* renamed from: cf7  reason: default package */
public final class cf7 implements yfe {
    public int a;
    public boolean b;
    public final xu0 c;
    public final Inflater o;

    public cf7(gtc gtc, Inflater inflater) {
        this.c = gtc;
        this.o = inflater;
    }

    public final long a(rt0 rt0, long j) {
        Inflater inflater = this.o;
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i < 0) {
            throw new IllegalArgumentException(wj6.i(j, "byteCount < 0: ").toString());
        } else if (!(!this.b)) {
            throw new IllegalStateException("closed".toString());
        } else if (i == 0) {
            return 0;
        } else {
            try {
                hod s0 = rt0.s0(1);
                int min = (int) Math.min(j, (long) (8192 - s0.c));
                boolean needsInput = inflater.needsInput();
                xu0 xu0 = this.c;
                if (needsInput) {
                    if (!xu0.C()) {
                        hod hod = xu0.getBuffer().a;
                        int i2 = hod.c;
                        int i3 = hod.b;
                        int i4 = i2 - i3;
                        this.a = i4;
                        inflater.setInput(hod.a, i3, i4);
                    }
                }
                int inflate = inflater.inflate(s0.a, s0.c, min);
                int i5 = this.a;
                if (i5 != 0) {
                    int remaining = i5 - inflater.getRemaining();
                    this.a -= remaining;
                    xu0.S((long) remaining);
                }
                if (inflate > 0) {
                    s0.c += inflate;
                    long j2 = (long) inflate;
                    rt0.b += j2;
                    return j2;
                }
                if (s0.b == s0.c) {
                    rt0.a = s0.a();
                    zod.a(s0);
                }
                return 0;
            } catch (DataFormatException e) {
                throw new IOException(e);
            }
        }
    }

    public final void close() {
        if (!this.b) {
            this.o.end();
            this.b = true;
            this.c.close();
        }
    }

    public final long e(rt0 rt0, long j) {
        do {
            long a2 = a(rt0, j);
            if (a2 > 0) {
                return a2;
            }
            Inflater inflater = this.o;
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1;
            }
        } while (!this.c.C());
        throw new EOFException("source exhausted prematurely");
    }

    public final lkf q() {
        return this.c.q();
    }
}
