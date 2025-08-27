package defpackage;

/* renamed from: paa  reason: default package */
public final class paa {
    public final hs7 a;
    public final hs7 b;
    public final hs7 c;
    public final hs7 d;
    public final hs7 e;

    public paa(hs7 hs7, hs7 hs72, hs7 hs73, hs7 hs74, hs7 hs75) {
        this.a = hs7;
        this.b = hs72;
        this.c = hs73;
        this.d = hs74;
        this.e = hs75;
    }

    public final void a(qaa qaa) {
        long j = qaa.y;
        if (j != 0) {
            z68.c("paa", "setFavoritesSync: %d", Long.valueOf(j));
            ((qjd) ((x23) this.c.get())).k("user.favoritesLastSync", Long.valueOf(qaa.y));
        }
    }
}
