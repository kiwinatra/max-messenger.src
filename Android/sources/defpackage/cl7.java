package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import kotlin.Lazy;
import kotlin.coroutines.Continuation;

/* renamed from: cl7  reason: default package */
public final class cl7 extends xag {
    public final Lazy b;
    public final Lazy c;
    public final Lazy o;
    public final Lazy v;
    public final Lazy w;
    public final xme x;
    public final etc y;

    public cl7() {
        bk7 bk7 = bk7.a;
        Lazy h = bk7.getAccessor().h(Context.class);
        Lazy h2 = bk7.getAccessor().h(eu3.class);
        Lazy h3 = bk7.getAccessor().h(po5.class);
        Lazy h4 = bk7.getAccessor().h(bud.class);
        Lazy h5 = bk7.getAccessor().h(gaf.class);
        this.b = h;
        this.c = h2;
        this.o = h3;
        this.v = h4;
        this.w = h5;
        xme a = f6e.a(new mac("", (String) null, (Bitmap) null));
        this.x = a;
        this.y = new etc(a);
        ev0.v(this.a, ((osa) ((gaf) h5.getValue())).b(), (f14) null, new al7(this, (Continuation) null), 2);
    }
}
