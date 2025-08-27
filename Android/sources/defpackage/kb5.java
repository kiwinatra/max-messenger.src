package defpackage;

import android.content.Context;
import android.net.Uri;
import kotlin.Lazy;
import kotlin.LazyKt;

/* renamed from: kb5  reason: default package */
public final class kb5 {
    public final Lazy a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;
    public final Lazy e;
    public final Lazy f;

    public kb5(Context context, Lazy lazy, Lazy lazy2) {
        this.a = lazy;
        this.b = LazyKt.lazy(new p35(context, 2));
        this.c = LazyKt.lazy(new j35(3, (Object) context, (Object) this));
        this.d = LazyKt.lazy(new jb5(lazy2, this, 0));
        this.e = LazyKt.lazy(new jb5(lazy, this, 1));
        this.f = LazyKt.lazy(new jb5(lazy2, this, 2));
    }

    public final f74 a(Uri uri, boolean z) {
        vaf vaf = (vaf) this.a.getValue();
        boolean z2 = false;
        if (vaf.c && uri != null && vaf.d(uri.getHost())) {
            z2 = true;
        }
        return z ? z2 ? (f74) this.f.getValue() : (f74) this.d.getValue() : z2 ? (f74) this.e.getValue() : (f74) this.c.getValue();
    }
}
