package defpackage;

import android.net.Uri;

/* renamed from: m00  reason: default package */
public final class m00 extends o48 {
    public srd w;

    public final void a() {
        super.a();
        srd srd = this.w;
        if (srd != null) {
            jbd.c((or7) srd.o);
        }
        this.w = null;
    }

    public final void c() {
        Uri uri;
        sqd sqd = this.b;
        d48 d48 = this.v;
        dfb f = sqd.f(d48);
        if (f == null) {
            uri = Uri.parse(d48.o);
        } else {
            uri = f.w;
            if (uri == null && (uri = f.b) == null && (uri = f.a) == null) {
                uri = Uri.parse(d48.o);
            }
        }
        this.a.B1(d48, uri, 0, f != null ? f.v : null);
    }
}
