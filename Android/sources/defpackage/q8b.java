package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* renamed from: q8b  reason: default package */
public final class q8b implements t28 {
    public final long a = l28.c.getAndIncrement();
    public final q74 b;
    public final int c;
    public final tne o;
    public final o8b v;
    public volatile Object w;

    public q8b(j74 j74, Uri uri, int i, o8b o8b) {
        Map emptyMap = Collections.emptyMap();
        n79.p(uri, "The uri must be set.");
        q74 q74 = new q74(uri, 0, 1, (byte[]) null, emptyMap, 0, -1, (String) null, 1, (Object) null);
        this.o = new tne(j74);
        this.b = q74;
        this.c = i;
        this.v = o8b;
    }

    public final void a() {
    }

    public final void load() {
        this.o.b = 0;
        l74 l74 = new l74((j74) this.o, this.b);
        try {
            l74.m();
            Uri uri = this.o.a.getUri();
            uri.getClass();
            this.w = this.v.j(uri, l74);
        } finally {
            v0g.h(l74);
        }
    }
}
