package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;

/* renamed from: ai5  reason: default package */
public final class ai5 implements s98 {
    public final Lazy a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy o;
    public final Lazy v;
    public final Lazy w;
    public final dac x = new dac();
    public final om0 y = om0.I(Collections.emptyList());
    public final kc3 z = new Object();

    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, kc3] */
    public ai5(Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4, Lazy lazy5, Lazy lazy6) {
        this.a = lazy;
        this.b = lazy2;
        this.w = lazy3;
        this.c = lazy4;
        this.o = lazy5;
        this.v = lazy6;
    }

    public final void a() {
        z68.c("ai5", "clear: ", new Object[0]);
        mi5 mi5 = (mi5) this.w.getValue();
        mi5.getClass();
        z68.c("mi5", "cancelRequests: ", new Object[0]);
        mi5.f.clear();
        mi5.g.d();
        this.z.d();
        ryg.k0(new na3(4, b(), new lw4(27)).m(), m58.f, new lw4(28), new ue4(6));
        this.y.d(Collections.emptyList());
    }

    public final mka b() {
        Lazy lazy = this.a;
        Objects.requireNonNull(lazy);
        return new mka(2, new h5(5, lazy));
    }

    public final yia c() {
        om0 om0 = this.y;
        om0.getClass();
        return new yia(new gia(om0, 0), new ci5(16), 3);
    }

    public final yia d(long j) {
        c10 c10 = new c10(j, 19);
        om0 om0 = this.y;
        om0.getClass();
        return new yia(om0, c10, 1);
    }

    public final void g(long j) {
        z68.c("ai5", "loadFromMarker: marker=%d", Long.valueOf(j));
        mi5 mi5 = (mi5) this.w.getValue();
        mi5.getClass();
        fce U = ((jna) mi5.a).U(new yt(0, "FAVORITE_STICKER_SETS", j, 50, (String) null), mi5.c);
        gcf gcf = mi5.b;
        gcf.getClass();
        xa3 l = new na3(4, new tbe(U.k(new ecf(gcf, 1, 0)).i(new ch2(12, fu.class)).i(new ci5(5)), new sh5(this, 0), 3).i(new lw4(20)), new sh5(this, 5)).l((lfd) this.o.getValue());
        ao1 ao1 = new ao1(0, new c10(j, 21), new wh5(j, 1));
        l.j(ao1);
        this.z.a(ao1);
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [long[], java.io.Serializable] */
    public final bb3 h(long j, boolean z2) {
        xa3 xa3;
        z68.c("ai5", "markAsFavorite: setId=%d, favorite=%b", Long.valueOf(j), Boolean.valueOf(z2));
        na3 na3 = new na3(0, z2 ? new na3(4, new wbe(b(), new lw4(26), 0), new sh5(this, 6)) : ua3.a, new na3(4, b(), new lh5(1, j, z2)));
        Lazy lazy = this.w;
        if (z2) {
            mi5 mi5 = (mi5) lazy.getValue();
            mi5.getClass();
            xa3 = new na3(4, new qbe(new ii5(mi5, j, 0), 0).i(new ch2(12, au.class)), new ci5(6)).l(mi5.d);
        } else {
            mi5 mi52 = (mi5) lazy.getValue();
            mi52.getClass();
            xa3 = new na3(4, new qbe(new ki5(mi52, new long[]{j}, 0), 0).i(new ch2(12, ou.class)), new ci5(8)).l(mi52.d);
        }
        return new na3(0, na3, xa3).g(new xh5(0, j, z2)).h(new lh5(2, j, z2));
    }

    public final void i(ArrayList arrayList) {
        List list;
        List<bqe> list2 = (List) this.y.J();
        if (!cjf.B(list2)) {
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                for (Object next : list2) {
                    try {
                        if (arrayList.contains(Long.valueOf(((bqe) next).a))) {
                            arrayList2.add(next);
                        }
                    } catch (Throwable th) {
                        throw new RuntimeException(th);
                    }
                }
                list = arrayList2;
            } else {
                list = Collections.emptyList();
            }
            if (!list.isEmpty()) {
                ArrayList arrayList3 = new ArrayList(list2.size());
                for (bqe bqe : list2) {
                    try {
                        arrayList3.add(Long.valueOf(bqe.a));
                    } catch (Throwable th2) {
                        throw new RuntimeException(th2);
                    }
                }
                this.x.d(arrayList3);
            }
        }
    }

    public final void j() {
        z68.c("ai5", "reloadFavoritesFromServer: ", new Object[0]);
        ((qjd) ((acf) this.v.getValue()).a).k("user.favoritesLastSync", 0L);
        l(0);
    }

    public final void k(long j) {
        z68.c("ai5", "setSectionUpdateTime: %d", Long.valueOf(j));
        ((qjd) ((acf) this.v.getValue()).a).k("user.favorites.stickerSets.updateTime", Long.valueOf(j));
    }

    public final void l(long j) {
        mi5 mi5 = (mi5) this.w.getValue();
        mi5.getClass();
        z68.c("mi5", "assetsUpdate: request, sync=%d", Long.valueOf(j));
        xa3 l = new na3(0, mi5.e.a(CollectionsKt.listOf(idb.TYPE_ASSETS_ADD, idb.TYPE_ASSETS_REMOVE, idb.TYPE_ASSETS_MOVE, idb.TYPE_ASSETS_LIST_MODIFY)), new qa3(1, new k62(mi5, j, 3))).l(mi5.c);
        ao1 ao1 = new ao1(0, new c10(j, 22), new wh5(j, 2));
        l.j(ao1);
        mi5.g.a(ao1);
    }

    public final void m() {
        long j = ((qjd) ((acf) this.v.getValue()).a).g.getLong("user.favoritesLastSync", 0);
        z68.c("ai5", "updateFavoritesFromServerFromLastSync: last sync =%d", Long.valueOf(j));
        l(j);
    }
}
