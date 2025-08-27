package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.errors.TamErrorException;

/* renamed from: kw7  reason: default package */
public final class kw7 extends qm implements lcf {
    public final /* synthetic */ int o = 1;
    public final String v;
    public final boolean w;
    public final String x;

    public kw7(long j, String str) {
        super(j);
        this.v = str;
        this.w = false;
        this.x = null;
    }

    public final void e(ibf ibf) {
        Object obj;
        Long l;
        switch (this.o) {
            case 0:
                mw7 mw7 = (mw7) ibf;
                String str = mw7.w;
                b32 b32 = mw7.c;
                rm rmVar = null;
                if (b32 != null) {
                    try {
                        p().m(b32);
                    } catch (TamErrorException unused) {
                    }
                    List n0 = l().n0(CollectionsKt.listOf(b32));
                    if (n0.size() > 0) {
                        Long l2 = (Long) n0.get(0);
                        if (mw7.v != null) {
                            l = Long.valueOf(o().g(l2.longValue(), ((ltb) q()).a.s(), mw7.v));
                        } else {
                            l = null;
                        }
                        k().c(new nw7(this.a, l2, l, (cs3) null, (gv6) null, (d4g) null, (Long) null, str));
                        return;
                    }
                    return;
                }
                d4g d4g = mw7.y;
                if (d4g != null) {
                    try {
                        Result.Companion companion = Result.Companion;
                        p().w(d4g);
                        obj = Result.m23constructorimpl(Unit.INSTANCE);
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.Companion;
                        obj = Result.m23constructorimpl(ResultKt.createFailure(th));
                    }
                    Throwable r14 = Result.m26exceptionOrNullimpl(obj);
                    if (r14 != null) {
                        z68.f(kw7.class.getName(), "fail to fetch video conference missed ids", r14);
                    }
                    k().c(new nw7(this.a, (Long) null, (Long) null, (cs3) null, (gv6) null, d4g, (Long) null, str));
                    return;
                }
                cqe cqe = mw7.z;
                if (cqe != null) {
                    rm rmVar2 = this.c;
                    if (rmVar2 != null) {
                        rmVar = rmVar2;
                    }
                    vqe vqe = (vqe) rmVar.s.getValue();
                    Collection listOf = CollectionsKt.listOf(cqe);
                    vqe.getClass();
                    z68.c("vqe", "storeStickerSetsFromServer: sticker sets: %s", listOf);
                    oha B = new yia(jha.n(listOf), new sqe(vqe, 0), 3).B();
                    ere ere = vqe.a;
                    Objects.requireNonNull(ere);
                    ryg.k0(new na3(4, B, new tqe(ere, 0)).g(new ivc(4, listOf)).h(new mg6(listOf)).l(vqe.v).m(), m58.f, new e4(23, (Object) this), m58.e);
                    k().c(new nw7(this.a, (Long) null, (Long) null, (cs3) null, (gv6) null, (d4g) null, Long.valueOf(cqe.a), str));
                    return;
                }
                cs3 cs3 = mw7.o;
                if (cs3 != null) {
                    km3 m = m();
                    fo3 fo3 = cs3.a;
                    if (m.m(fo3.a)) {
                        m().D(CollectionsKt.listOf(fo3));
                    } else {
                        km3 m2 = m();
                        tm3 tm3 = tm3.b;
                        m2.getClass();
                        m2.C(Collections.singletonList(fo3), tm3);
                        rtb rtb = (rtb) m2.l.get();
                        mtb l3 = qe8.l(cs3.o);
                        rtb.getClass();
                        rtb.l(Collections.singletonMap(Long.valueOf(fo3.a), l3));
                    }
                    k().c(new nw7(this.a, (Long) null, (Long) null, cs3, (gv6) null, (d4g) null, (Long) null, str));
                }
                gv6 gv6 = mw7.x;
                if (gv6 != null) {
                    k().c(new nw7(this.a, (Long) null, (Long) null, (cs3) null, gv6, (d4g) null, (Long) null, str));
                    return;
                }
                return;
            default:
                uk1 uk1 = (uk1) ibf;
                k().c(new d31(uk1.c, uk1.w, this.a, uk1.o));
                return;
        }
    }

    public final fbf g() {
        switch (this.o) {
            case 0:
                return new lw7(this.v, this.w);
            default:
                yt ytVar = new yt((x3b) null, 10);
                ytVar.d("withJoinLink", true);
                ytVar.t(ApiProtocol.PARAM_CONVERSATION_ID, this.v);
                ytVar.t("type", this.w ? "VIDEO" : "AUDIO");
                String str = this.x;
                if (!cvg.A(str)) {
                    ytVar.t("sdpOffer", str);
                }
                return ytVar;
        }
    }

    public final void h(qaf qaf) {
        switch (this.o) {
            case 0:
                k().c(new hj0(this.a, qaf));
                return;
            default:
                k().c(new hj0(this.a, qaf));
                return;
        }
    }

    public kw7(long j, String str, boolean z) {
        super(j);
        this.v = str;
        this.w = z;
        this.x = kw7.class.getName();
    }
}
