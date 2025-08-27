package defpackage;

import android.content.Context;
import java.lang.Thread;
import java.util.EnumMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.StringsKt;

/* renamed from: lpa  reason: default package */
public final class lpa implements dn4 {
    public final /* synthetic */ int a = 1;
    public final Lazy b;
    public final long c;
    public final long o;
    public final long v;
    public final Object w;
    public final Object x;
    public Object y;
    public final ome z;

    public lpa(Lazy lazy) {
        this.b = lazy;
        this.c = System.nanoTime();
        this.o = System.nanoTime();
        this.v = System.nanoTime();
        this.w = new EnumMap(Thread.State.class);
        this.x = e14.a(((osa) ((gaf) lazy.getValue())).a());
        Unit unit = Unit.INSTANCE;
        sa3 sa3 = new sa3((pm7) null);
        sa3.R(unit);
        this.y = sa3;
        this.z = new tif(this);
    }

    public final ome a() {
        switch (this.a) {
            case 0:
                return (xme) this.z;
            default:
                return (tif) this.z;
        }
    }

    /* JADX WARNING: type inference failed for: r7v23, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    public final void b(o94 o94) {
        switch (this.a) {
            case 0:
                long j = o94.a;
                if (j == this.c) {
                    String g = ((f8f) ((Lazy) this.w).getValue()).g();
                    b59.k((Context) this.b.getValue(), g);
                    z68.c("PushToken", "Current pushToken: \"" + g + "\"", new Object[0]);
                    return;
                } else if (j == this.o) {
                    try {
                        ev0.v(ys6.a, (CoroutineContext) null, (f14) null, new kpa(this, (Continuation) null), 3);
                        return;
                    } catch (Throwable th) {
                        z68.o("PushToken", "Refresh current token failed", th);
                        return;
                    }
                } else if (j == this.v) {
                    a33 a33 = (a33) ((x23) ((Lazy) this.x).getValue());
                    a33.i("ok_push_disabled", !((a33) ((x23) ((Lazy) this.x).getValue())).C());
                    a33.m = null;
                    ((xme) this.z).setValue(d());
                    return;
                } else {
                    return;
                }
            default:
                if (o94.a == this.c && !((qn7) this.y).isActive()) {
                    this.y = ev0.v((jx3) this.x, (CoroutineContext) null, (f14) null, new SuspendLambda(2, (Continuation<Object>) null), 3);
                    return;
                }
                return;
        }
    }

    public List d() {
        String str;
        String takeLast;
        mgf mgf = new mgf("Скопировать Push token");
        String g = ((f8f) ((Lazy) this.w).getValue()).g();
        if (g == null || (takeLast = StringsKt.takeLast(g, 10)) == null || (str = "...".concat(takeLast)) == null) {
            str = "null";
        }
        return CollectionsKt.listOf(new o94(this.c, mgf, 0, new mgf(str), (ev0) null, 20), new o94(this.o, new mgf("Обновить Push token"), 0, new mgf(((xt6) ((cxe) ((Lazy) this.y).getValue())).f), (ev0) null, 20), new o94(this.v, new mgf("Показывать пуши из сокета"), 0, (ngf) null, new n94(!((a33) ((x23) ((Lazy) this.x).getValue())).C()), 12));
    }

    public lpa(q4 q4Var) {
        this.b = q4Var.h(Context.class);
        this.w = q4Var.h(f8f.class);
        this.x = q4Var.h(x23.class);
        this.y = q4Var.h(cxe.class);
        this.c = System.nanoTime();
        this.o = System.nanoTime();
        this.v = System.nanoTime();
        this.z = f6e.a(d());
    }
}
