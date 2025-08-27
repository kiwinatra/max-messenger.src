package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty;

/* renamed from: wh0  reason: default package */
public final class wh0 extends xag {
    public static final /* synthetic */ KProperty[] X = {rae.s(wh0.class, "bannerJob", "getBannerJob()Lkotlinx/coroutines/Job;", 0)};
    public static final long Y = ((long) new nfd(7).hashCode());
    public final gaf b;
    public final ei0 c;
    public final Function0 o;
    public final Lazy v;
    public final xme w;
    public final xme x;
    public final etc y;
    public final wie z;

    public wh0(Lazy lazy, boolean z2, zp3 zp3, int i) {
        yh0 yh0 = yh0.a;
        nh0 nh0 = (nh0) yh0.getAccessor().g(nh0.class);
        gaf gaf = (gaf) yh0.getAccessor().g(gaf.class);
        ei0 ei0 = (ei0) yh0.getAccessor().g(ei0.class);
        z2 = (i & 16) != 0 ? false : z2;
        Function0 mVar = (i & 32) != 0 ? new m(18) : zp3;
        this.b = gaf;
        this.c = ei0;
        this.o = mVar;
        this.v = lazy;
        xme a = f6e.a(Boolean.valueOf(z2));
        this.w = a;
        etc etc = new etc(a);
        xme a2 = f6e.a((ei0.e || ei0.f) ? j(z2) : CollectionsKt.emptyList());
        this.x = a2;
        this.y = bs0.X(new pc(a2, 7), this.a, z6e.a, CollectionsKt.emptyList());
        this.z = o5a.U();
        bs0.K(new ps5(new i21(new vt5(new ps5(bs0.E(new fs5(2, new bs5[]{new dtc(nh0.b), new pc(nh0.d, 5), new pc(nh0.e, 6)})), new lh0(nh0, (Continuation) null)), new mh0((Object) nh0, (Continuation) null, 0)), etc, new sh0(3, (Continuation) null, 0), 4), new uh0(this, lazy, (Continuation) null), 5), this.a);
    }

    public final List j(boolean z2) {
        zs3 zs3;
        List createListBuilder = CollectionsKt.createListBuilder();
        ei0 ei0 = this.c;
        zs3 zs32 = null;
        if (ei0.e) {
            zs3 = new zs3(((Boolean) this.o.invoke()).booleanValue() ? xs3.a : z2 ? xs3.b : xs3.c);
        } else {
            zs3 = null;
        }
        createListBuilder.add(zs3);
        if (ei0.f) {
            zs32 = new zs3(z2 ? xs3.v : xs3.o);
        }
        createListBuilder.add(zs32);
        Unit unit = Unit.INSTANCE;
        List filterNotNull = CollectionsKt.filterNotNull(CollectionsKt.build(createListBuilder));
        boolean z3 = !filterNotNull.isEmpty();
        Lazy lazy = this.v;
        if (z3) {
            List list = filterNotNull;
            Function1 b2 = ((qh0) lazy.getValue()).b();
            ArrayList arrayList = new ArrayList();
            for (Object next : filterNotNull) {
                if (((Boolean) b2.invoke(next)).booleanValue()) {
                    arrayList.add(next);
                }
            }
            filterNotNull = arrayList;
        }
        if (!(!filterNotNull.isEmpty())) {
            return filterNotNull;
        }
        List list2 = filterNotNull;
        return CollectionsKt.sortedWith(filterNotNull, ((qh0) lazy.getValue()).a());
    }
}
