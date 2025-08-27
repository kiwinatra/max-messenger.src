package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;
import kotlin.jvm.internal.LongCompanionObject;

/* renamed from: kef  reason: default package */
public final class kef implements h74 {
    public final h74 a;
    public final fx0 b;
    public boolean c;
    public long o;

    public kef(h74 h74, fx0 fx0) {
        h74.getClass();
        this.a = h74;
        fx0.getClass();
        this.b = fx0;
    }

    public final long N(p74 p74) {
        long N = this.a.N(p74);
        this.o = N;
        if (N == 0) {
            return 0;
        }
        if (p74.g == -1 && N != -1) {
            p74 = p74.c(0, N);
        }
        this.c = true;
        fx0 fx0 = this.b;
        fx0.getClass();
        p74.h.getClass();
        int i = (p74.g > -1 ? 1 : (p74.g == -1 ? 0 : -1));
        int i2 = p74.i;
        if (i == 0 && (i2 & 2) == 2) {
            fx0.j = null;
        } else {
            fx0.j = p74;
            fx0.d = (i2 & 4) == 4 ? fx0.b : LongCompanionObject.MAX_VALUE;
            fx0.h = 0;
            try {
                fx0.b(p74);
            } catch (IOException e) {
                throw new IOException(e);
            }
        }
        return this.o;
    }

    public final void O(arf arf) {
        arf.getClass();
        this.a.O(arf);
    }

    public final void close() {
        boolean z;
        p74 p74;
        fx0 fx0 = this.b;
        try {
            this.a.close();
            if (!z) {
                return;
            }
            if (p74 != null) {
                try {
                } catch (IOException e) {
                    throw new IOException(e);
                }
            }
        } finally {
            if (this.c) {
                this.c = false;
                if (((p74) fx0.j) != null) {
                    try {
                        fx0.a();
                    } catch (IOException e2) {
                        throw new IOException(e2);
                    }
                }
            }
        }
    }

    public final Uri getUri() {
        return this.a.getUri();
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (this.o == 0) {
            return -1;
        }
        int read = this.a.read(bArr, i, i2);
        if (read > 0) {
            fx0 fx0 = this.b;
            p74 p74 = (p74) fx0.j;
            if (p74 != null) {
                int i3 = 0;
                while (i3 < read) {
                    try {
                        if (fx0.g == fx0.d) {
                            fx0.a();
                            fx0.b(p74);
                        }
                        int min = (int) Math.min((long) (read - i3), fx0.d - fx0.g);
                        OutputStream outputStream = fx0.f;
                        int i4 = t0g.a;
                        outputStream.write(bArr, i + i3, min);
                        i3 += min;
                        long j = (long) min;
                        fx0.g += j;
                        fx0.h += j;
                    } catch (IOException e) {
                        throw new IOException(e);
                    }
                }
            }
            long j2 = this.o;
            if (j2 != -1) {
                this.o = j2 - ((long) read);
            }
        }
        return read;
    }

    public final Map x() {
        return this.a.x();
    }
}
