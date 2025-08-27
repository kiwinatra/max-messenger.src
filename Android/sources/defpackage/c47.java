package defpackage;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.UByte;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: c47  reason: default package */
public final class c47 implements yfe {
    public int a;
    public int b;
    public int c;
    public int o;
    public int v;
    public final xu0 w;

    public c47(xu0 xu0) {
        this.w = xu0;
    }

    public final void close() {
    }

    public final long e(rt0 rt0, long j) {
        int i;
        int readInt;
        do {
            int i2 = this.o;
            xu0 xu0 = this.w;
            if (i2 == 0) {
                xu0.S((long) this.v);
                this.v = 0;
                if ((this.b & 4) != 0) {
                    return -1;
                }
                i = this.c;
                int r = u0g.r(xu0);
                this.o = r;
                this.a = r;
                byte readByte = xu0.readByte() & UByte.MAX_VALUE;
                this.b = xu0.readByte() & UByte.MAX_VALUE;
                Logger logger = d47.v;
                if (logger.isLoggable(Level.FINE)) {
                    vw0 vw0 = n37.a;
                    logger.fine(n37.a(true, this.c, this.a, readByte, this.b));
                }
                readInt = xu0.readInt() & IntCompanionObject.MAX_VALUE;
                this.c = readInt;
                if (readByte != 9) {
                    throw new IOException(readByte + " != TYPE_CONTINUATION");
                }
            } else {
                long e = xu0.e(rt0, Math.min(j, (long) i2));
                if (e == -1) {
                    return -1;
                }
                this.o -= (int) e;
                return e;
            }
        } while (readInt == i);
        throw new IOException("TYPE_CONTINUATION streamId changed");
    }

    public final lkf q() {
        return this.w.q();
    }
}
