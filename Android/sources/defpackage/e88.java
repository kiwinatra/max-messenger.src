package defpackage;

import java.io.Writer;
import kotlin.uuid.Uuid;

/* renamed from: e88  reason: default package */
public final class e88 extends Writer {
    public final StringBuilder a = new StringBuilder(Uuid.SIZE_BITS);

    public final void close() {
        m();
    }

    public final void flush() {
        m();
    }

    public final void m() {
        StringBuilder sb = this.a;
        if (sb.length() > 0) {
            sb.toString();
            sb.delete(0, sb.length());
        }
    }

    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == 10) {
                m();
            } else {
                this.a.append(c);
            }
        }
    }
}
