package defpackage;

import android.net.Uri;
import java.util.List;
import java.util.UUID;

/* renamed from: nq8  reason: default package */
public final class nq8 {
    public String a;
    public Uri b;
    public String c;
    public oq8 d;
    public gc4 e;
    public List f;
    public String g;
    public tb7 h;
    public mq8 i;
    public Object j;
    public long k;
    public us8 l;
    public uq8 m;
    public ar8 n;

    public final ir8 a() {
        xq8 xq8;
        gc4 gc4 = this.e;
        n79.n(((Uri) gc4.e) == null || ((UUID) gc4.d) != null);
        Uri uri = this.b;
        tq8 tq8 = null;
        if (uri != null) {
            gc4 gc42 = this.e;
            if (((UUID) gc42.d) != null) {
                tq8 = gc42.a();
            }
            xq8 = new xq8(uri, this.c, tq8, this.i, this.f, this.g, this.h, this.j, this.k);
        } else {
            xq8 = null;
        }
        String str = this.a;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        sq8 c2 = this.d.c();
        wq8 a2 = this.m.a();
        us8 us8 = this.l;
        if (us8 == null) {
            us8 = us8.J;
        }
        return new ir8(str2, c2, xq8, a2, us8, this.n);
    }

    public final void b(qq8 qq8) {
        this.d = qq8.a();
    }
}
