package defpackage;

import android.content.Context;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: kof  reason: default package */
public final class kof {
    public static final kof a = new Object();
    public static volatile boolean b;
    public static gy8 c;
    public static Context d;
    public static kxd e;
    public static c9f f;
    public static final AtomicBoolean g = new AtomicBoolean();
    public static final Lazy h = LazyKt.lazy(ds.v);
    public static final Lazy i = LazyKt.lazy(ds.o);
    public static volatile Map j = MapsKt.emptyMap();

    public static String a() {
        Object obj;
        String str = null;
        if (b) {
            return null;
        }
        Object obj2 = c().get(iq.c);
        if ((obj2 instanceof l04 ? (l04) obj2 : null) == null) {
            new xe8(9).f();
        }
        try {
            obj = Result.m23constructorimpl((Object) null);
        } catch (Throwable th) {
            Result.Companion companion = Result.Companion;
            obj = Result.m23constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m29isFailureimpl(obj)) {
            obj = null;
        }
        String str2 = (String) obj;
        if (str2 != null) {
            return str2;
        }
        Context context = d;
        if (context == null) {
            context = null;
        }
        String p = ev0.p(context, "tracer_app_token");
        if (p != null) {
            if (!Intrinsics.areEqual((Object) p, (Object) "0000000000000000000000000000000000000000000")) {
                str = p;
            }
            return str;
        }
        throw new IllegalStateException("Could not find Tracer's appToken. Is Tracer plugin configured properly?");
    }

    public static gx4 b() {
        return (gx4) i.getValue();
    }

    public static Map c() {
        if (g.get()) {
            return j;
        }
        throw new IllegalStateException("Tracer is not initialized");
    }

    public static List d(vw6 vw6) {
        xe8 xe8 = new xe8(9);
        xe8.c = 2147482647;
        Unit unit = Unit.INSTANCE;
        l04 l04 = new l04(xe8);
        d24 d24 = new d24(new djd(10));
        e4 e4Var = new e4(11, false);
        Boolean bool = Boolean.TRUE;
        e4Var.b = bool;
        b24 b24 = new b24(e4Var);
        grg grg = new grg(22);
        grg.b = bool;
        nx6 nx6 = new nx6(grg);
        y35 y35 = new y35(18, false);
        y35.b = bool;
        vp4 vp4 = new vp4(y35);
        ncd ncd = new ncd(1);
        ncd ncd2 = new ncd(0);
        ni0 ni0 = new ni0(14);
        ni0.c = bool;
        ni0.b = 1000;
        return CollectionsKt.listOf(l04, d24, b24, nx6, vp4, ncd, ncd2, new dcb(ni0));
    }
}
