package defpackage;

import java.io.InputStream;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: za5  reason: default package */
public final class za5 extends va5 {
    public za5(byte[] bArr) {
        super(bArr);
        this.a.mark(IntCompanionObject.MAX_VALUE);
    }

    public final void b(long j) {
        int i = this.c;
        if (((long) i) > j) {
            this.c = 0;
            this.a.reset();
        } else {
            j -= (long) i;
        }
        a((int) j);
    }

    public za5(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.a.mark(IntCompanionObject.MAX_VALUE);
            return;
        }
        throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
    }
}
