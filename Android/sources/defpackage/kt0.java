package defpackage;

import java.io.IOException;
import java.io.InputStream;
import kotlin.UByte;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: kt0  reason: default package */
public final class kt0 extends InputStream {
    public final /* synthetic */ int a;
    public final /* synthetic */ xu0 b;

    public /* synthetic */ kt0(xu0 xu0, int i) {
        this.a = i;
        this.b = xu0;
    }

    private final void m() {
    }

    public final int available() {
        switch (this.a) {
            case 0:
                return (int) Math.min(((rt0) this.b).b, (long) IntCompanionObject.MAX_VALUE);
            default:
                gtc gtc = (gtc) this.b;
                if (!gtc.b) {
                    return (int) Math.min(gtc.a.b, (long) IntCompanionObject.MAX_VALUE);
                }
                throw new IOException("closed");
        }
    }

    public final void close() {
        switch (this.a) {
            case 0:
                return;
            default:
                ((gtc) this.b).close();
                return;
        }
    }

    public final int read() {
        switch (this.a) {
            case 0:
                rt0 rt0 = (rt0) this.b;
                if (rt0.b > 0) {
                    return rt0.readByte() & UByte.MAX_VALUE;
                }
                return -1;
            default:
                gtc gtc = (gtc) this.b;
                if (!gtc.b) {
                    rt0 rt02 = gtc.a;
                    if (rt02.b == 0 && gtc.c.e(rt02, (long) ConstantsKt.DEFAULT_BUFFER_SIZE) == -1) {
                        return -1;
                    }
                    return gtc.a.readByte() & UByte.MAX_VALUE;
                }
                throw new IOException("closed");
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return ((rt0) this.b) + ".inputStream()";
            default:
                return ((gtc) this.b) + ".inputStream()";
        }
    }

    public final int read(byte[] bArr, int i, int i2) {
        switch (this.a) {
            case 0:
                return ((rt0) this.b).e0(bArr, i, i2);
            default:
                gtc gtc = (gtc) this.b;
                if (!gtc.b) {
                    n79.l((long) bArr.length, (long) i, (long) i2);
                    rt0 rt0 = gtc.a;
                    if (rt0.b == 0 && gtc.c.e(rt0, (long) ConstantsKt.DEFAULT_BUFFER_SIZE) == -1) {
                        return -1;
                    }
                    return gtc.a.e0(bArr, i, i2);
                }
                throw new IOException("closed");
        }
    }
}
