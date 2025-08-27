package defpackage;

import com.jakewharton.processphoenix.ProcessPhoenix;
import kotlin.Lazy;

/* renamed from: v13  reason: default package */
public final class v13 {
    public final Lazy a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;

    public v13(Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4) {
        this.a = lazy;
        this.b = lazy2;
        this.c = lazy3;
        this.d = lazy4;
    }

    public final void a() {
        Lazy lazy = this.a;
        String g = ((doa) lazy.getValue()).g();
        Lazy lazy2 = this.b;
        long s = ((qjd) ((x23) lazy2.getValue())).s();
        if (g != null && g.length() != 0 && s != -1) {
            ((m98) this.c.getValue()).a(false);
            ((qjd) ((x23) lazy2.getValue())).y(Long.valueOf(s));
            ((doa) lazy.getValue()).i(g, false);
            z68.c("e98", "Run onDropCache", new Object[0]);
            ProcessPhoenix.b(((utc) this.d.getValue()).a);
        }
    }
}
