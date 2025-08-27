package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty;

/* renamed from: ya1  reason: default package */
public final class ya1 extends xag {
    public static final /* synthetic */ KProperty[] z0 = {rae.s(ya1.class, "requestParticipantsJob", "getRequestParticipantsJob()Lkotlinx/coroutines/Job;", 0)};
    public final Lazy X;
    public final Lazy Y = LazyKt.lazy(LazyThreadSafetyMode.NONE, new j6(24, this));
    public final xme Z;
    public final String b;
    public final tvb c;
    public final eng o;
    public final qcb v;
    public final xme v0;
    public final Lazy w;
    public final wie w0;
    public final Lazy x;
    public volatile Long x0;
    public final Lazy y;
    public final s85 y0;
    public final Lazy z;

    public ya1(String str, tvb tvb, eng eng, qcb qcb, Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4, Lazy lazy5, Lazy lazy6) {
        this.b = str;
        this.c = tvb;
        this.o = eng;
        this.v = qcb;
        this.w = lazy;
        this.x = lazy4;
        this.y = lazy5;
        this.z = lazy6;
        this.X = lazy3;
        aj8 aj8 = aj8.b;
        xme a = f6e.a(new qa1((zd0) null, aj8, aj8, true, new mgf(""), (List) null, (ngf) null));
        this.Z = a;
        this.v0 = a;
        this.w0 = o5a.U();
        this.y0 = new s85(0);
        ev0.v(this.a, ((osa) ((gaf) lazy3.getValue())).b(), (f14) null, new oa1(this, (Continuation) null), 2);
        bs0.K(new ps5(new pc(new dtc(((rp1) lazy2.getValue()).a), 11), new pa1(this, (Continuation) null), 5), this.a);
        if (this.x0 == null) {
            ev0.v(this.a, (CoroutineContext) null, (f14) null, new ra1(this, (Continuation) null), 3);
        }
    }

    public static final ngf j(ya1 ya1, List list, int i) {
        List l;
        pm3 pm3;
        ya1.getClass();
        if (i == 0) {
            return new igf(sqa.Q0);
        }
        String str = null;
        if (i == 1) {
            vk3 vk3 = (vk3) CollectionsKt.firstOrNull(list);
            if (!(vk3 == null || (l = vk3.l()) == null || (pm3 = (pm3) CollectionsKt.firstOrNull(l)) == null)) {
                str = pm3.a();
            }
            if (str == null) {
                str = "";
            }
            return new mgf(str);
        } else if (i != 2) {
            return new egf(rqa.a, i);
        } else {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                pm3 pm32 = (pm3) CollectionsKt.firstOrNull(((vk3) it.next()).l());
                String str2 = pm32 != null ? pm32.a : null;
                if (str2 != null) {
                    arrayList.add(str2);
                }
            }
            return new mgf(CollectionsKt___CollectionsKt.joinToString$default(arrayList, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null));
        }
    }

    public final void k(boolean z2) {
        xme xme;
        Object value;
        qcb qcb = this.v;
        edb a = qcb.a();
        String[] strArr = edb.h;
        if (!a.b(strArr)) {
            edb a2 = qcb.a();
            int i = sqa.c;
            a2.getClass();
            int i2 = bmc.permissions_audio_title;
            int i3 = aza.e;
            eng eng = this.o;
            if (edb.i(eng, strArr)) {
                eng.c(strArr, 160, i2, i, i3);
            } else {
                a2.f(eng, strArr, 160);
            }
        } else {
            tq1 tq1 = (tq1) this.x.getValue();
            tq1.getClass();
            tq1.a(tq1, "AUDIO_ENABLED", (String) null, (String) null, Integer.valueOf(z2 ? 1 : 0), (String) null, (String) null, true, 52);
            do {
                xme = this.Z;
                value = xme.getValue();
            } while (!xme.b(value, qa1.a((qa1) value, (zd0) null, !qcb.a().b(edb.h) ? aj8.v : z2 ? aj8.c : aj8.b, (aj8) null, false, (ngf) null, (ArrayList) null, (ngf) null, 125)));
        }
    }

    public final void l(boolean z2) {
        xme xme;
        Object value;
        qcb qcb = this.v;
        if (!qcb.a().b(edb.l)) {
            qcb.a().h(this.o);
            return;
        }
        tq1 tq1 = (tq1) this.x.getValue();
        tq1.getClass();
        tq1.a(tq1, "VIDEO_ENABLED", (String) null, (String) null, Integer.valueOf(z2 ? 1 : 0), (String) null, (String) null, true, 52);
        do {
            xme = this.Z;
            value = xme.getValue();
        } while (!xme.b(value, qa1.a((qa1) value, (zd0) null, (aj8) null, !qcb.a().b(edb.l) ? aj8.v : z2 ? aj8.c : aj8.b, false, (ngf) null, (ArrayList) null, (ngf) null, 123)));
    }
}
