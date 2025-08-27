package defpackage;

import kotlin.Lazy;
import kotlin.LazyKt;

/* renamed from: kq8  reason: default package */
public final class kq8 implements zpf {
    public ea6 a;
    public final Lazy b = LazyKt.lazy(new ck7(26));

    public final void a(long j, int i, int i2, int i3, xpf xpf) {
    }

    public final void b(l8b l8b, int i, int i2) {
        while (i > 0) {
            Lazy lazy = this.b;
            int min = Math.min(i, ((byte[]) lazy.getValue()).length);
            l8b.e(0, (byte[]) lazy.getValue(), min);
            i -= min;
        }
    }

    public final int c(c74 c74, int i, boolean z) {
        int i2 = i;
        while (i2 > 0) {
            Lazy lazy = this.b;
            int read = c74.read((byte[]) lazy.getValue(), 0, Math.min(i2, ((byte[]) lazy.getValue()).length));
            if (read != -1) {
                i2 -= read;
            } else {
                throw new RuntimeException("Unexpected end of track");
            }
        }
        return i;
    }

    public final void e(ea6 ea6) {
        this.a = ea6;
    }
}
