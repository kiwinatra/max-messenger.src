package defpackage;

import java.io.Closeable;
import java.io.IOException;

/* renamed from: ltc  reason: default package */
public final class ltc implements Closeable {
    public final xu0 a;
    public final wu0 b;
    public final /* synthetic */ ce c;

    public ltc(ce ceVar, gtc gtc, ftc ftc) {
        this.c = ceVar;
        this.a = gtc;
        this.b = ftc;
    }

    public final void close() {
        this.c.f(true, true, (IOException) null);
    }
}
