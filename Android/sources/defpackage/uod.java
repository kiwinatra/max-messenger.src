package defpackage;

import android.net.Uri;

/* renamed from: uod  reason: default package */
public final class uod extends yad {
    public final /* synthetic */ yod X;
    public final /* synthetic */ j74 y;
    public final /* synthetic */ q74 z;

    public uod(yod yod, jx0 jx0, q74 q74) {
        this.X = yod;
        this.y = jx0;
        this.z = q74;
    }

    /* JADX INFO: finally extract failed */
    public final Object c() {
        o8b o8b = this.X.b;
        j74 j74 = this.y;
        tne tne = new tne(j74);
        l28.c.getAndIncrement();
        tne.b = 0;
        l74 l74 = new l74((j74) tne, this.z);
        try {
            l74.m();
            Uri uri = j74.getUri();
            uri.getClass();
            Object j = o8b.j(uri, l74);
            v0g.h(l74);
            j.getClass();
            return (to5) j;
        } catch (Throwable th) {
            v0g.h(l74);
            throw th;
        }
    }
}
