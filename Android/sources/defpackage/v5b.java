package defpackage;

import java.util.List;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;

/* renamed from: v5b  reason: default package */
public final class v5b {
    public final long a;
    public final String b;
    public final a00 c;
    public final y5b d;
    public final boolean e;
    public final int f;
    public final boolean g;
    public final List h;
    public final cl4 i;
    public final int j;
    public final boolean k;

    public v5b(u5b u5b) {
        this.a = u5b.a;
        this.b = u5b.b;
        this.c = u5b.c;
        this.d = u5b.d;
        this.e = u5b.e;
        this.f = u5b.f;
        this.g = u5b.g;
        this.h = u5b.h;
        this.i = u5b.i;
        this.j = u5b.j;
        this.k = u5b.k;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [qae, ts] */
    public final ts a() {
        ? qae = new qae(0);
        qae.put("cid", Long.valueOf(this.a));
        qae.put("zoom", Integer.valueOf(this.j));
        qae.put("attachMEL", Boolean.valueOf(this.k));
        String str = this.b;
        if (!cvg.A(str)) {
            qae.put("text", str);
        }
        qae.put("detectShare", Boolean.valueOf(this.e));
        a00 a00 = this.c;
        if (a00 != null && a00.size() > 0) {
            qae.put("attaches", a00);
        }
        y5b y5b = this.d;
        if (y5b != null) {
            qae.put("link", y5b);
        }
        int i2 = this.f;
        if (i2 > 0) {
            qae.put("ttl", Integer.valueOf(i2));
        }
        qae.put("isLive", Boolean.valueOf(this.g));
        List list = this.h;
        if (list != null) {
            qae.put("elements", list);
        }
        cl4 cl4 = this.i;
        if (cl4 != null) {
            qae.put("delayedAttributes", MapsKt.mapOf(TuplesKt.to("timeToFire", Long.valueOf(cl4.a)), TuplesKt.to("notifySender", Boolean.valueOf(cl4.b))));
        }
        return qae;
    }

    public final String toString() {
        dbe.w.getClass();
        int o = kv0.o(this.h);
        StringBuilder sb = new StringBuilder("OutgoingMessage{cid=");
        sb.append(this.a);
        sb.append(", text=");
        sb.append("***");
        sb.append(", attaches=");
        sb.append(this.c);
        sb.append(", link=");
        sb.append(this.d);
        sb.append(", detectShare=");
        sb.append(this.e);
        sb.append(", ttl=");
        sb.append(this.f);
        sb.append(", live='");
        sb.append(this.g);
        sb.append("', elements=");
        sb.append(o);
        sb.append(", zoom=");
        sb.append(this.j);
        sb.append(", attachMEL=");
        return tr1.m(sb, this.k, "}");
    }
}
