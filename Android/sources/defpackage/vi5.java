package defpackage;

import java.util.Collections;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* renamed from: vi5  reason: default package */
public final class vi5 {
    public static final /* synthetic */ int k = 0;
    public final hs7 a;
    public final hs7 b;
    public final hs7 c;
    public final hs7 d;
    public final hs7 e;
    public final hs7 f;
    public final hs7 g;
    public final kc3 h = new Object();
    public final dac i = new dac();
    public final om0 j = om0.I(Collections.emptyList());

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, kc3] */
    public vi5(hs7 hs7, hs7 hs72, hs7 hs73, hs7 hs74, hs7 hs75, hs7 hs76, hs7 hs77) {
        this.a = hs7;
        this.b = hs72;
        this.c = hs73;
        this.d = hs74;
        this.e = hs75;
        this.f = hs76;
        this.g = hs77;
    }

    public final yia a() {
        om0 om0 = this.j;
        om0.getClass();
        return new yia(new gia(om0, 0), new ci5(16), 3);
    }

    public final void b(long j2) {
        z68.c("vi5", "loadFromMarker: marker=%d", Long.valueOf(j2));
        qi5 qi5 = (qi5) this.g.get();
        qi5.getClass();
        fce U = ((jna) qi5.a).U(new yt(0, "FAVORITE_STICKERS", j2, 50, (String) null), qi5.c);
        gcf gcf = qi5.b;
        gcf.getClass();
        xa3 l = new na3(4, new tbe(U.k(new ecf(gcf, 1, 0)).i(new ch2(12, fu.class)).i(new ci5(9)), new si5(this, 4), 3).i(new ci5(17)), new si5(this, 6)).l((lfd) this.d.get());
        ao1 ao1 = new ao1(0, new c10(j2, 26), new wh5(j2, 4));
        l.j(ao1);
        this.h.a(ao1);
    }

    public final bb3 c(long j2, boolean z) {
        xa3 xa3;
        z68.c("vi5", "markAsFavorite: stickerId=%d, favorite=%b", Long.valueOf(j2), Boolean.valueOf(z));
        hs7 hs7 = this.a;
        na3 na3 = new na3(0, z ? new na3(4, new wbe(((rh5) hs7.get()).a(), new lw4(15), 0), new si5(this, 5)) : ua3.a, new na3(4, ((rh5) hs7.get()).a(), new lh5(0, j2, z)));
        if (z) {
            z68.c("vi5", "addToFavorites: stickerId=%d", Long.valueOf(j2));
            qi5 qi5 = (qi5) this.g.get();
            qi5.getClass();
            xa3 = new na3(4, new qbe(new ii5(qi5, j2, 1), 0).i(new ch2(12, au.class)), new ci5(11)).l(qi5.d);
        } else {
            xa3 = f(new long[]{j2});
        }
        return new na3(0, na3, xa3).g(new xh5(1, j2, z)).h(new lh5(4, j2, z));
    }

    public final void d() {
        z68.c("vi5", "reloadFavoritesFromServer: ", new Object[0]);
        ((qjd) ((x23) this.e.get())).k("user.favoritesLastSync", 0L);
        qi5 qi5 = (qi5) this.g.get();
        qi5.getClass();
        z68.c("qi5", "assetsUpdate: request, sync=%d", 0L);
        xa3 l = new na3(0, qi5.e.a(CollectionsKt.listOf(idb.TYPE_ASSETS_ADD, idb.TYPE_ASSETS_REMOVE, idb.TYPE_ASSETS_MOVE, idb.TYPE_ASSETS_LIST_MODIFY)), new qa3(1, new k62(qi5))).l(qi5.c);
        ao1 ao1 = new ao1(0, new c10(), new wh5());
        l.j(ao1);
        qi5.g.a(ao1);
    }

    public final bb3 e(List list) {
        z68.c("vi5", "removeFromFavorites: ids=%s", list);
        return new na3(0, new na3(4, ((rh5) this.a.get()).a(), new x52(12, list)), f(cjf.i(list))).g(new uh5(3, list)).h(new x52(19, list));
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [long[], java.lang.Object, java.io.Serializable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.xa3 f(long[] r4) {
        /*
            r3 = this;
            java.lang.Object[] r0 = new java.lang.Object[]{r4}
            java.lang.String r1 = "vi5"
            java.lang.String r2 = "removeFromFavorites: stickerIds=%s"
            defpackage.z68.c(r1, r2, r0)
            hs7 r3 = r3.g
            java.lang.Object r3 = r3.get()
            qi5 r3 = (defpackage.qi5) r3
            r3.getClass()
            ki5 r0 = new ki5
            r1 = 1
            r0.<init>(r3, r4, r1)
            qbe r4 = new qbe
            r1 = 0
            r4.<init>(r0, r1)
            ch2 r0 = new ch2
            java.lang.Class<ou> r1 = defpackage.ou.class
            r2 = 12
            r0.<init>(r2, r1)
            wbe r4 = r4.i(r0)
            ci5 r0 = new ci5
            r1 = 10
            r0.<init>(r1)
            na3 r1 = new na3
            r2 = 4
            r1.<init>(r2, r4, r0)
            lfd r3 = r3.d
            xa3 r3 = r1.l(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vi5.f(long[]):xa3");
    }

    public final void g(long j2) {
        z68.c("vi5", "setSectionUpdateTime: %d", Long.valueOf(j2));
        ((qjd) ((x23) this.e.get())).k("user.favorites.stickers.updateTime", Long.valueOf(j2));
    }
}
