package ru.ok.messages.gallery;

import android.app.Application;
import android.net.Uri;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ok/messages/gallery/GalleryViewModel;", "Lyag;", "nn6", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nGalleryViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GalleryViewModel.kt\nru/ok/messages/gallery/GalleryViewModel\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 LiveDataExt.kt\nru/ok/tamtam/shared/lifecycle/LiveDataExtKt\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 ThemeHelper.kt\nru/ok/tamtam/themes/ThemeHelper\n*L\n1#1,905:1\n49#2:906\n51#2:910\n49#2:911\n51#2:915\n49#2:916\n51#2:920\n49#2:921\n51#2:925\n49#2:936\n51#2:940\n46#3:907\n51#3:909\n46#3:912\n51#3:914\n46#3:917\n51#3:919\n46#3:922\n51#3:924\n46#3:937\n51#3:939\n105#4:908\n105#4:913\n105#4:918\n105#4:923\n105#4:938\n131#5,10:926\n77#5:941\n77#5:942\n77#5:943\n295#6,2:944\n1#7:946\n45#8:947\n*S KotlinDebug\n*F\n+ 1 GalleryViewModel.kt\nru/ok/messages/gallery/GalleryViewModel\n*L\n99#1:906\n99#1:910\n120#1:911\n120#1:915\n257#1:916\n257#1:920\n280#1:921\n280#1:925\n316#1:936\n316#1:940\n99#1:907\n99#1:909\n120#1:912\n120#1:914\n257#1:917\n257#1:919\n280#1:922\n280#1:924\n316#1:937\n316#1:939\n99#1:908\n120#1:913\n257#1:918\n280#1:923\n316#1:938\n316#1:926,10\n405#1:941\n434#1:942\n479#1:943\n602#1:944,2\n733#1:947\n*E\n"})
public final class GalleryViewModel extends yag {
    public static final /* synthetic */ KProperty[] S;
    public static final String T = "GalleryViewModel";
    public final xme A;
    public final etc B;
    public final xme C;
    public final etc D;
    public final sqd E;
    public boolean F;
    public pm7 G;
    public aje H;
    public final hs7 I;
    public final fn6 J;
    public aje K;
    public final gn6 L;
    public final go6 M;
    public final xme N;
    public final Lazy O;
    public final xme P;
    public GalleryResultViewModel Q;
    public boolean R;
    public final Application c;
    public final ln5 d;
    public final bud e;
    public final s48 f;
    public final hs7 g;
    public final faf h;
    public final xme i;
    public final etc j;
    public final xme k;
    public final etc l;
    public final pl6 m;
    public final hs7 n;
    public final xme o;
    public final vo6 p;
    public wm6 q;
    public final cdb r;
    public final k26 s;
    public final xme t;
    public final etc u;
    public final sbd v = new sbd(new un6(this, (Continuation) null));
    public final xme w;
    public final etc x;
    public final xme y;
    public final etc z;

    static {
        Class<GalleryViewModel> cls = GalleryViewModel.class;
        S = new KProperty[]{wj6.p(cls, "tamDispatchers", "getTamDispatchers()Lru/ok/tamtam/coroutines/TamDispatchers;", 0), wj6.p(cls, "mediaProcessor", "getMediaProcessor()Lru/ok/tamtam/MediaProcessor;", 0), wj6.p(cls, "analytics", "getAnalytics()Lru/ok/tamtam/stats/Analytics;", 0)};
    }

    public GalleryViewModel(Application application, po5 po5, bud bud, hdd hdd, m95 m95, s48 s48, h48 h48, hs7 hs7, hs7 hs72, hs7 hs73) {
        this.c = application;
        this.d = po5;
        this.e = bud;
        this.f = s48;
        this.g = hs73;
        faf faf = new faf(m95, new of3(25));
        this.h = faf;
        xme a = f6e.a(CollectionsKt.emptyList());
        this.i = a;
        this.j = new etc(a);
        xme a2 = f6e.a((Object) null);
        this.k = a2;
        this.l = new etc(a2);
        pl6 pl6 = (pl6) hdd.b("gallery_mode");
        this.m = pl6;
        this.n = hs7;
        xme a3 = f6e.a(new o85(CollectionsKt.emptyList()));
        this.o = a3;
        this.p = new vo6(a3, this, 0);
        this.q = h88.a(application);
        cdb cdb = new cdb(application, n54.n());
        this.r = cdb;
        this.s = new k26(cdb, 11);
        Boolean bool = Boolean.FALSE;
        xme a4 = f6e.a(new o85(bool));
        this.t = a4;
        this.u = new etc(a4);
        xme a5 = f6e.a(bool);
        this.w = a5;
        this.x = new etc(a5);
        xme a6 = f6e.a((Object) null);
        this.y = a6;
        this.z = new etc(a6);
        xme a7 = f6e.a(((ycb) cdb.c.getValue()) == ycb.a ? zk6.LOADING : zk6.NONE);
        this.A = a7;
        this.B = new etc(a7);
        xme a8 = f6e.a((Object) null);
        this.C = a8;
        this.D = new etc(a8);
        sqd sqd = h48.f;
        this.E = sqd;
        this.I = hs72;
        fn6 fn6 = new fn6(1, this);
        this.J = fn6;
        gn6 gn6 = new gn6(1, this);
        this.L = gn6;
        go6 go6 = new go6(0, this);
        this.M = go6;
        this.N = f6e.a((Object) null);
        Lazy lazy = LazyKt.lazy(new u75(19, this));
        this.O = lazy;
        xme a9 = f6e.a((Object) null);
        this.P = a9;
        yd7 yd7 = (yd7) s48;
        pm7 pm7 = yd7.w0;
        if (pm7 == null || !pm7.e0()) {
            yd7.g();
        }
        z68.c(T, "init", new Object[0]);
        bs0.K(bs0.F(new ps5(new vo6(pl6.c ? yd7.x : yd7.X, this, 1), new in6(this, (Continuation) null), 5), ((osa) o()).e()), e14.g(b0h.C(this), faf));
        bs0.K(bs0.F(new ps5(new vo6(yd7.Z, this, 2), new jn6(this, (Continuation) null), 5), ((osa) o()).a()), e14.g(b0h.C(this), faf));
        if (pl6.o) {
            sqd.c.add(gn6);
            sqd.e.add(go6);
            sqd.f.add(fn6);
            sqd.l.add((hn6) lazy.getValue());
        }
        Duration.Companion companion = Duration.Companion;
        sbd a10 = vme.a(a9, DurationKt.toDuration(300, DurationUnit.MILLISECONDS));
        bs0.K(new k26(new ps5(new on2(a10, 28), new qo6(a10, (Continuation) null, this), 5), 10), e14.g(b0h.C(this), faf));
    }

    public static final pm6 j(GalleryViewModel galleryViewModel, wk6 wk6, boolean z2, Uri uri, Integer num) {
        String str;
        GalleryViewModel galleryViewModel2 = galleryViewModel;
        wk6 wk62 = wk6;
        galleryViewModel.getClass();
        Pair pair = wk62.d ? TuplesKt.to(Integer.valueOf(qad.t3), Integer.valueOf(qad.u3)) : TuplesKt.to(Integer.valueOf(qad.v3), Integer.valueOf(qad.w3));
        int intValue = ((Number) pair.component1()).intValue();
        int intValue2 = ((Number) pair.component2()).intValue();
        Lazy lazy = scf.b0;
        Application application = galleryViewModel2.c;
        scf k0 = j4b.k0(application);
        h3 c2 = wk62.a.c();
        if (c2 instanceof lk6) {
            str = application.getString(((lk6) c2).a);
        } else if (c2 instanceof mk6) {
            str = ((mk6) c2).a;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        pm6 pm6 = new pm6(wk6, z2, str, application.getString(intValue), application.getString(intValue2), uri, num, z2 ? k0.l : k0.G, galleryViewModel2.q.g);
        qa7 qa7 = pm6.j;
        if (qa7 != null) {
            ld9.B().f(qa7, (f0) null);
        }
        return pm6;
    }

    public static final Object k(GalleryViewModel galleryViewModel, List list, Continuation continuation) {
        return ev0.I(((osa) galleryViewModel.o()).e(), new bp6(galleryViewModel, list, (Continuation) null), continuation);
    }

    public final void i() {
        z68.c(T, "onCleared()", new Object[0]);
        sqd sqd = this.E;
        sqd.e.remove(this.M);
        sqd.f.remove(this.J);
        sqd.c.remove(this.L);
        sqd.l.remove((hn6) this.O.getValue());
        ((yd7) this.f).c();
    }

    public final void l(boolean z2) {
        z68.c(T, "clearSelections()", new Object[0]);
        ev0.v(b0h.C(this), ((osa) o()).e().plus(this.h), (f14) null, new on6(this, z2, (Continuation) null), 2);
    }

    public final List m() {
        return (List) ((o85) this.o.getValue()).a;
    }

    public final int n(k48 k48) {
        return this.E.h(cvg.M(k48));
    }

    public final gaf o() {
        KProperty kProperty = S[0];
        return (gaf) this.g.get();
    }

    public final void p() {
        zk6 zk6;
        z68.c(T, "onAlbumTitleClicked()", new Object[0]);
        if (!((List) this.i.getValue()).isEmpty()) {
            xme xme = this.A;
            int ordinal = ((zk6) xme.getValue()).ordinal();
            boolean z2 = true;
            if (ordinal == 0) {
                zk6 = zk6.NONE;
            } else if (ordinal == 1) {
                zk6 = zk6.LOADING;
            } else if (ordinal == 2) {
                zk6 = zk6.COLLAPSED;
            } else if (ordinal == 3) {
                zk6 = zk6.EXPANDED;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            xme.setValue(zk6);
            if (xme.getValue() != zk6.EXPANDED) {
                z2 = false;
            }
            o85 o85 = new o85(Boolean.valueOf(z2));
            xme xme2 = this.k;
            xme2.getClass();
            xme2.m((Object) null, o85);
        }
    }

    public final void q() {
        z68.c(T, "onCloseButtonClicked()", new Object[0]);
        if (this.A.getValue() == zk6.EXPANDED) {
            p();
            return;
        }
        o85 o85 = new o85(wl6.c);
        xme xme = this.C;
        xme.getClass();
        xme.m((Object) null, o85);
    }

    public final void r(int i2, um6 um6) {
        z68.c(T, "onItemClicked: " + um6, new Object[0]);
        o85 o85 = new o85(TuplesKt.to(Integer.valueOf(i2), um6));
        xme xme = this.P;
        xme.getClass();
        xme.m((Object) null, o85);
    }

    public final int s(k48 k48, boolean z2, boolean z3) {
        z68.c(T, "onItemSelect: " + k48, new Object[0]);
        this.F = true;
        d48 M2 = cvg.M(k48);
        sqd sqd = this.E;
        int h2 = sqd.h(M2);
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = (h2 == 0 || h2 == sqd.a.size()) ? false : true;
        if (z3) {
            sqd.u(M2);
        }
        if (z2) {
            booleanRef.element = true;
        }
        ev0.v(b0h.C(this), ((osa) o()).e().plus(this.h), (f14) null, new eo6(this, booleanRef, z3, (Continuation) null), 2);
        this.F = false;
        return sqd.h(cvg.M(k48));
    }

    public final void t(boolean z2) {
        z68.c(T, i2a.i("onStoragePermissionGranted: ", z2), new Object[0]);
        cdb cdb = this.r;
        ycb ycb = (ycb) cdb.c.getValue();
        ycb ycb2 = ycb.a;
        boolean z3 = ycb == ycb2;
        if (!n54.e(cdb.a, cdb.b)) {
            ycb2 = ycb.b;
        }
        xme xme = cdb.c;
        xme.getClass();
        xme.m((Object) null, ycb2);
        if (z2 && z3 != z2) {
            o85 o85 = new o85(Boolean.TRUE);
            xme xme2 = this.t;
            xme2.getClass();
            xme2.m((Object) null, o85);
            Boolean bool = Boolean.FALSE;
            xme xme3 = this.w;
            xme3.getClass();
            xme3.m((Object) null, bool);
            o85 o852 = new o85(CollectionsKt.emptyList());
            xme xme4 = this.o;
            xme4.getClass();
            xme4.m((Object) null, o852);
            zk6 zk6 = zk6.LOADING;
            xme xme5 = this.A;
            xme5.getClass();
            xme5.m((Object) null, zk6);
            ((yd7) this.f).g();
        }
    }
}
