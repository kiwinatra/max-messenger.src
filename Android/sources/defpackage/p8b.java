package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* renamed from: p8b  reason: default package */
public final class p8b implements s28 {
    public final long a;
    public final p74 b;
    public final int c;
    public final sne o;
    public final n8b v;
    public volatile Object w;

    public p8b(h74 h74, Uri uri, int i, n8b n8b) {
        Map emptyMap = Collections.emptyMap();
        if (uri != null) {
            p74 p74 = new p74(uri, 0, 1, (byte[]) null, emptyMap, 0, -1, (String) null, 1, (Object) null);
            this.o = new sne(h74);
            this.b = p74;
            this.c = i;
            this.v = n8b;
            this.a = k28.h.getAndIncrement();
            return;
        }
        throw new IllegalStateException("The uri must be set.");
    }

    public final void a() {
    }

    public final void load() {
        this.o.b = 0;
        l74 l74 = new l74((h74) this.o, this.b);
        try {
            l74.m();
            Uri uri = this.o.a.getUri();
            uri.getClass();
            this.w = this.v.s(uri, l74);
        } finally {
            t0g.h(l74);
        }
    }
}
