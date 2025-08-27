package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* renamed from: pu  reason: default package */
public final class pu extends qm implements lcf {
    public final int o;
    public final long v;
    public final long w;

    public pu(int i, long j, long j2, long j3) {
        super(j);
        this.o = i;
        this.v = j2;
        this.w = j3;
    }

    public final void e(ibf ibf) {
        long j;
        long j2;
        qu quVar = (qu) ibf;
        rm rmVar = this.c;
        if (rmVar == null) {
            rmVar = null;
        }
        su suVar = (su) rmVar.w.getValue();
        long j3 = this.w;
        int i = this.o;
        suVar.getClass();
        if (i == 0) {
            i = 2;
        }
        ArrayList arrayList = new ArrayList();
        List emptyList = Collections.emptyList();
        if (!quVar.o.isEmpty()) {
            List<lmd> list = quVar.o;
            bjd bjd = suVar.g;
            ArrayList arrayList2 = new ArrayList();
            for (lmd lmd : list) {
                ekd ekd = lmd.a;
                if (ekd == ekd.y) {
                    j2 = j3;
                    arrayList2.add(new vte(lmd.b, lmd.c, lmd.d, lmd.g));
                } else {
                    j2 = j3;
                    if (ekd == ekd.z) {
                        arrayList2.add(new fre(lmd.b, lmd.c, lmd.e, lmd.g));
                    } else if (ekd == ekd.X) {
                        ArrayList k = qe8.k(lmd.k);
                        k.addAll(qe8.p(lmd.l, bjd));
                        arrayList2.add(new lvc(lmd.b, k));
                    } else {
                        z68.f("qe8", "Unknown section " + lmd, (Throwable) null);
                    }
                }
                j3 = j2;
            }
            j = j3;
            moe moe = suVar.a;
            moe.getClass();
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                mmd mmd = (mmd) it.next();
                int y = tr1.y(mmd.a);
                if (y == 1) {
                    arrayList3.addAll(moe.f(((vte) mmd).o));
                } else if (y == 3) {
                    arrayList3.addAll(moe.f((List) new yia(new mha(jha.n(((lvc) mmd).c), new mqd(15), 1).e(vpe.class), new mqd(16), 3).B().f()));
                }
            }
            arrayList.addAll(arrayList3);
            emptyList = arrayList2;
        } else {
            j = j3;
        }
        if (j == 0) {
            if (!emptyList.isEmpty()) {
                moe moe2 = suVar.a;
                synchronized (moe2) {
                    moe2.k(emptyList);
                    moe2.j(emptyList);
                    jbd.a(new loe(moe2, 0), moe2.i, (x6) null, new mqd(14), (lfd) null);
                }
            }
            if (i == 2) {
                ((ltb) suVar.b).a.k("user.stickersLastSync", Long.valueOf(quVar.c));
            } else if (i == 5 || i == 4) {
                z68.c("su", "onAssetsUpdate: set favorites sync=%d", Long.valueOf(quVar.c));
                ((ltb) suVar.b).a.k("user.favoritesLastSync", Long.valueOf(quVar.c));
                ai5 ai5 = suVar.e;
                List<lmd> list2 = quVar.o;
                ai5.getClass();
                for (lmd lmd2 : list2) {
                    if ("FAVORITE_STICKER_SETS".equals(lmd2.b)) {
                        long j4 = lmd2.g;
                        Long valueOf = Long.valueOf(j4);
                        long j5 = lmd2.j;
                        Long valueOf2 = Long.valueOf(j5);
                        List list3 = lmd2.e;
                        z68.c("ai5", "onAssetsUpdate: sets=%s, marker=%d, updateTime=%d", list3, valueOf, valueOf2);
                        ai5.k(j5);
                        xa3 l = new na3(4, ai5.b(), new x52(14, list3)).l((lfd) ai5.o.getValue());
                        ao1 ao1 = new ao1(0, new lw4(29), new ue4(7));
                        l.j(ao1);
                        ai5.z.a(ao1);
                        if (j4 != 0) {
                            ai5.g(j4);
                        }
                    }
                }
                vi5 vi5 = suVar.f;
                List<lmd> list4 = quVar.o;
                vi5.getClass();
                for (lmd lmd3 : list4) {
                    if ("FAVORITE_STICKERS".equals(lmd3.b)) {
                        long j6 = lmd3.g;
                        Long valueOf3 = Long.valueOf(j6);
                        long j7 = lmd3.j;
                        Long valueOf4 = Long.valueOf(j7);
                        List list5 = lmd3.d;
                        z68.c("vi5", "onAssetsUpdate: stickers=%s, marker=%d, updateTime=%d", list5, valueOf3, valueOf4);
                        vi5.g(j7);
                        xa3 l2 = new na3(4, ((rh5) vi5.a.get()).a(), new x52(10, list5)).l((lfd) vi5.c.get());
                        ao1 ao12 = new ao1(0, new x52(20, list5), new uh5(4, list5));
                        l2.j(ao12);
                        vi5.h.a(ao12);
                        if (j6 != 0) {
                            vi5.b(j6);
                        }
                    }
                }
            } else if (i == 10) {
                gk gkVar = suVar.h;
                List list6 = quVar.o;
                Map map = quVar.y;
                ((qjd) gkVar.c).k("user.reactionsLastSync", Long.valueOf(quVar.c));
                gkVar.l.setValue(gkVar, gk.p[1], ev0.v(gkVar.j, (CoroutineContext) null, f14.b, new zj(gkVar, list6, map, (Continuation) null), 1));
            }
        } else {
            r62 r62 = suVar.c;
            r62.getClass();
            StringBuilder sb = new StringBuilder("onAssetsUpdate, chatId = ");
            long j8 = j;
            sb.append(j8);
            z68.c("r62", sb.toString(), new Object[0]);
            a32 G = r62.G(j8);
            if (G != null) {
                r62.i(G.a, false, new ba(18, r62, quVar));
            }
        }
        if (!quVar.v.isEmpty()) {
            for (Map.Entry entry : quVar.v.entrySet()) {
                moe moe3 = suVar.a;
                Long l3 = (Long) entry.getKey();
                l3.getClass();
                boe boe = (boe) moe3.a.get(l3);
                if (boe == null || boe.v < ((Long) entry.getValue()).longValue()) {
                    arrayList.add((Long) entry.getKey());
                }
            }
        }
        if (!arrayList.isEmpty()) {
            cjf.N(arrayList);
            Iterator it2 = cjf.Q(arrayList).iterator();
            while (it2.hasNext()) {
                suVar.d.c(2, (List) it2.next());
            }
        }
        Map map2 = quVar.w;
        if (!map2.isEmpty()) {
            ArrayList arrayList4 = new ArrayList();
            List list7 = (List) suVar.e.y.J();
            if (!cjf.B(list7)) {
                for (Map.Entry entry2 : map2.entrySet()) {
                    Long l4 = (Long) entry2.getKey();
                    Iterator it3 = list7.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            arrayList4.add(l4);
                            break;
                        }
                        bqe bqe = (bqe) it3.next();
                        if (bqe.a == l4.longValue()) {
                            if (bqe.f >= ((Long) entry2.getValue()).longValue()) {
                                break;
                            }
                        }
                    }
                }
            } else {
                arrayList4.addAll(map2.keySet());
            }
            if (!arrayList4.isEmpty()) {
                suVar.d.c(3, arrayList4);
            }
        }
        rm rmVar2 = this.c;
        (rmVar2 != null ? rmVar2 : null).b().c(new ru(this.a, this.w));
    }

    public final fbf g() {
        long j;
        long j2;
        vk3 m;
        long j3 = this.w;
        if (j3 == 0) {
            return new yt(this.o, this.v, 0, 0);
        }
        rm rmVar = this.c;
        if (rmVar == null) {
            rmVar = null;
        }
        a32 G = rmVar.c().G(j3);
        if (G != null) {
            long j4 = G.b.a;
            if (!G.N() || (m = G.m()) == null) {
                j = 0;
                j2 = j4;
            } else {
                j = m.r();
                j2 = 0;
            }
            if (!(j2 == 0 && j == 0)) {
                return new yt(this.o, this.v, j2, j);
            }
        }
        return null;
    }

    public final void h(qaf qaf) {
        rm rmVar = this.c;
        if (rmVar == null) {
            rmVar = null;
        }
        rmVar.b().c(new hj0(this.a, qaf));
    }
}
