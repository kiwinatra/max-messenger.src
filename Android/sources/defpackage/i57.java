package defpackage;

import java.io.Closeable;

/* renamed from: i57  reason: default package */
public final class i57 implements Closeable {
    public final /* synthetic */ int a;
    public final int b;
    public final Object c;
    public final Closeable o;

    public /* synthetic */ i57(int i, Object obj, Closeable closeable, int i2) {
        this.a = i2;
        this.b = i;
        this.c = obj;
        this.o = closeable;
    }

    private final void m() {
    }

    public final void close() {
        switch (this.a) {
            case 0:
                return;
            default:
                af6 af6 = (af6) this.o;
                if (af6 != null) {
                    af6.close();
                    return;
                }
                return;
        }
    }
}
