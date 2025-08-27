package defpackage;

import android.media.MediaDataSource;
import java.io.IOException;

/* renamed from: ua5  reason: default package */
public final class ua5 extends MediaDataSource {
    public long a;
    public final /* synthetic */ za5 b;

    public ua5(za5 za5) {
        this.b = za5;
    }

    public final void close() {
    }

    public final long getSize() {
        return -1;
    }

    public final int readAt(long j, byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (j < 0) {
            return -1;
        }
        try {
            long j2 = this.a;
            int i3 = (j2 > j ? 1 : (j2 == j ? 0 : -1));
            za5 za5 = this.b;
            if (i3 != 0) {
                if (j2 >= 0) {
                    if (j >= j2 + ((long) za5.a.available())) {
                        return -1;
                    }
                }
                za5.b(j);
                this.a = j;
            }
            if (i2 > za5.a.available()) {
                i2 = za5.a.available();
            }
            int read = za5.read(bArr, i, i2);
            if (read >= 0) {
                this.a += (long) read;
                return read;
            }
        } catch (IOException unused) {
        }
        this.a = -1;
        return -1;
    }
}
