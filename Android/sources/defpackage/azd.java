package defpackage;

import java.util.List;
import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: azd  reason: default package */
public final class azd extends SuspendLambda implements Function2 {
    public final /* synthetic */ jzd a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public azd(jzd jzd, Continuation continuation) {
        super(2, continuation);
        this.a = jzd;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new azd(this.a, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((azd) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        xme xme;
        Object value;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        List createListBuilder = CollectionsKt.createListBuilder();
        KProperty[] kPropertyArr = jzd.y0;
        jzd jzd = this.a;
        jzd.getClass();
        igf igf = new igf(rza.r);
        long j = (long) qza.y;
        jnd jnd = jnd.o;
        createListBuilder.add(new zmd(igf, 0, j));
        long j2 = (long) qza.o;
        igf igf2 = new igf(rza.p);
        b1e b1e = new b1e(jzd.m(jzd.k().g.getInt("app.media.load.photo", 0), false), (Integer) null);
        jnd jnd2 = jnd.a;
        createListBuilder.add(new and(jnd2, igf2, 0, j2, b1e));
        long j3 = (long) qza.l;
        igf igf3 = new igf(rza.l);
        b1e b1e2 = new b1e(jzd.m(jzd.k().g.getInt("app.media.load.gif", 0), false), (Integer) null);
        jnd jnd3 = jnd.b;
        createListBuilder.add(new and(jnd3, igf3, 0, j3, b1e2));
        createListBuilder.add(new and(jnd3, new igf(rza.i), 0, (long) qza.k, new b1e(jzd.m(jzd.k().g.getInt("app.media.load.audio", 0), false), (Integer) null)));
        long j4 = (long) qza.n;
        igf igf4 = new igf(rza.o);
        d1e d1e = new d1e(jzd.k().m(), true);
        jnd jnd4 = jnd.c;
        createListBuilder.add(new and(jnd4, igf4, 0, j4, d1e));
        createListBuilder.add(new zmd(new igf(rza.s), 1, (long) qza.z));
        createListBuilder.add(new and(jnd2, new igf(rza.v), 1, (long) qza.p, new b1e(jzd.m(jzd.k().g.getInt("app.video.auto.play", 1), true), (Integer) null)));
        Lazy lazy = jzd.o;
        akd akd = (akd) ((bud) ((rk) lazy.getValue()).b.getValue());
        akd.getClass();
        boolean m = akd.m(PmsKey.f19chatanimojienabled, false);
        long j5 = (long) qza.m;
        createListBuilder.add(new and(m ? jnd3 : jnd4, new igf(rza.m), 1, j5, new d1e(((hq) jzd.k()).g.getBoolean("app.media.autoplay.gif", true), true)));
        if (m) {
            createListBuilder.add(new and(jnd4, new igf(rza.h), 1, (long) qza.j, new d1e(((rk) lazy.getValue()).a(), true)));
        }
        createListBuilder.add(new zmd(new igf(rza.t), 2, (long) qza.A));
        createListBuilder.add(new and(jnd, new igf(rza.w), 2, (long) qza.r, new b1e(new mgf(jzd.k().p().a.a), (Integer) null)));
        createListBuilder.add(new and(jnd, new igf(rza.k), 3, (long) qza.q, a1e.a));
        List build = CollectionsKt.build(createListBuilder);
        do {
            xme = jzd.v;
            value = xme.getValue();
            List list = (List) value;
        } while (!xme.b(value, build));
        return Unit.INSTANCE;
    }
}
