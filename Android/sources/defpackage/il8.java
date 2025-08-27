package defpackage;

import android.os.Build;
import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: il8  reason: default package */
public final class il8 extends xag {
    public static final /* synthetic */ KProperty[] G0;
    public final k26 A0;
    public final etc B0;
    public final etc C0;
    public final etc D0;
    public final wie E0;
    public final wie F0;
    public volatile List X;
    public final zqd Y = new zqd(11);
    public final s85 Z = new s85(0);
    public final Function0 b;
    public final Lazy c;
    public final Lazy o;
    public final Lazy v;
    public final xme v0;
    public final Lazy w;
    public final ddb w0;
    public final Lazy x;
    public final ddb x0;
    public final xme y = f6e.a(n00.a);
    public final etc y0;
    public final ru0 z = o54.a(-2, 6, (cu0) null);
    public final i21 z0;

    static {
        Class<il8> cls = il8.class;
        G0 = new KProperty[]{rae.s(cls, "fillByEditMessagesAttachmentsJob", "getFillByEditMessagesAttachmentsJob()Lkotlinx/coroutines/Job;", 0), rae.s(cls, "finalActionJob", "getFinalActionJob()Lkotlinx/coroutines/Job;", 0)};
    }

    public il8(Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4, gm2 gm2) {
        Lazy lazy5 = tn2.a;
        this.b = gm2;
        this.c = lazy;
        this.o = lazy2;
        this.v = lazy5;
        this.w = lazy3;
        this.x = lazy4;
        xme a = f6e.a(CollectionsKt.emptyList());
        this.v0 = a;
        String[] strArr = edb.m;
        ddb ddb = new ddb(strArr);
        this.w0 = ddb;
        ddb ddb2 = new ddb(Build.VERSION.SDK_INT >= 34 ? new String[]{"android.permission.READ_MEDIA_VISUAL_USER_SELECTED"} : strArr);
        this.x0 = ddb2;
        i21 i21 = new i21(ddb, ddb2, new cl8(3, (Continuation) null, 0), 4);
        pub pub = pub.a;
        o9a o9a = z6e.a;
        etc X2 = bs0.X(i21, this.a, o9a, pub);
        this.y0 = X2;
        this.z0 = new i21(ddb, ddb2, new cl8(3, (Continuation) null, 1), 4);
        this.A0 = new k26(X2, 27);
        k26 k26 = new k26(a, 28);
        Boolean bool = Boolean.FALSE;
        this.B0 = bs0.X(k26, this.a, o9a, bool);
        k26 k262 = new k26(a, 29);
        xme xme = pq7.f;
        this.C0 = bs0.X(new i21(k262, xme, new c11(3, (Continuation) null, 1), 4), this.a, o9a, bool);
        this.D0 = bs0.X(new wb(24, new i21(xme, a, al8.a, 4), this), this.a, o9a, prd.b);
        this.E0 = o5a.U();
        this.F0 = o5a.U();
        xag.g(this, (CoroutineContext) null, (f14) null, new bl8(this, (Continuation) null), 3);
    }

    public static final h48 j(il8 il8) {
        return (h48) il8.o.getValue();
    }

    public final sqd k() {
        return (sqd) this.v.getValue();
    }

    public final boolean l() {
        return this.b.invoke() != null;
    }

    public final void m(boolean z2) {
        ru0 ru0 = this.z;
        if (!z2) {
            int i = pq7.a;
            if (pq7.b(pq7.c)) {
                ru0.s(nj8.a);
                return;
            }
        }
        Long l = (Long) this.b.invoke();
        wie wie = this.F0;
        KProperty[] kPropertyArr = G0;
        if (l != null) {
            long longValue = l.longValue();
            akd akd = (akd) ((bud) this.x.getValue());
            akd.getClass();
            int r = (int) akd.r(PmsKey.f60maxattachcount, (long) 12);
            if (k().c() > r) {
                ru0.s(new uj8(r));
                return;
            }
            wie.setValue(this, kPropertyArr[1], ev0.u(this.a, ((osa) ((gaf) this.w.getValue())).b(), f14.b, new yk8(this, longValue, (Continuation) null)));
            return;
        }
        wie.setValue(this, kPropertyArr[1], xag.g(this, (CoroutineContext) null, f14.b, new dl8(this, (Continuation) null), 1));
        xag.h(this.Z, sk8.a);
    }

    public final boolean n() {
        if ((!(!((Collection) this.v0.getValue()).isEmpty()) || l()) && (this.X == null || Intrinsics.areEqual(this.v0.getValue(), (Object) this.X))) {
            return true;
        }
        this.z.s(qj8.a);
        return false;
    }
}
