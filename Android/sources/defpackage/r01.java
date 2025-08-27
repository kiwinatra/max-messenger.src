package defpackage;

import android.app.Application;
import android.content.Context;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: r01  reason: default package */
public final class r01 extends dce {
    public final /* synthetic */ int b;

    public /* synthetic */ r01(int i) {
        this.b = i;
    }

    public final Object b(q4 q4Var) {
        switch (this.b) {
            case 0:
                return new chd(q4Var.h(jz3.class), q4Var.h(cp1.class));
            case 1:
                return new h5d(q4Var.h(Context.class), q4Var.h(bud.class));
            case 2:
                return new kq1(q4Var.h(Context.class), q4Var.h(pwa.class), q4Var.h(ed4.class), q4Var.h(gaf.class), q4Var.h(y91.class));
            case 3:
                return new fq1(q4Var.h(kq1.class), q4Var.h(y91.class), q4Var.h(udg.class));
            case 4:
                return new kgd(q4Var.h(jz3.class));
            case 5:
                return new ym1(q4Var.h(gaf.class), q4Var.h(eu3.class), q4Var.h(x23.class), q4Var.h(is9.class));
            case 6:
                q4Var.h(Context.class);
                return new ng5(q4Var.h(cp1.class), q4Var.h(gaf.class), q4Var.h(nf1.class), q4Var.h(b91.class), q4Var.h(dp1.class));
            case 7:
                return new c91(q4Var.h(Context.class), q4Var.h(dq1.class));
            case 8:
                return new s61(q4Var.h(dp1.class), q4Var.h(h5d.class));
            case 9:
                return new lz0(q4Var.h(dp1.class), q4Var.h(edb.class), q4Var.h(tq1.class));
            case 10:
                return new y91(q4Var.h(Application.class));
            case 11:
                m21 m21 = m21.a;
                dp1 c = m21.c();
                oh1 oh1 = oh1.a;
                return new o81(c, (yg5) oh1.getAccessor().g(yg5.class), (m01) m21.getAccessor().g(m01.class), (dq1) m21.getAccessor().g(dq1.class), oh1.getAccessor().h(nf1.class), oh1.getAccessor().h(s61.class));
            case 12:
                return new Object();
            case 13:
                return new nta(q4Var.h(m95.class), q4Var.h(fa9.class), q4Var.h(bud.class));
            case Protos.Attaches.Attach.LOCATION /*14*/:
                return new tc2(q4Var);
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return new os2((x23) q4Var.g(x23.class));
            case 16:
                return new vb2((Context) q4Var.g(Context.class), q4Var.h(yva.class), q4Var.h(eq2.class), q4Var.h(ne7.class), q4Var.h(t00.class), q4Var.h(ghf.class), q4Var.h(vpa.class), q4Var.h(bl3.class), q4Var.h(qx2.class), (gaf) q4Var.g(gaf.class), q4Var.h(e24.class), new us2(q4Var, 1));
            case LangUtils.HASH_SEED:
                return (fq2) q4Var.g(vb2.class);
            case 18:
                return (luf) q4Var.g(vb2.class);
            case 19:
                return new xs2(q4Var);
            case 20:
                return new fua((u82) q4Var.g(u82.class), (gaf) q4Var.g(gaf.class), (fu2) q4Var.g(fu2.class), (sv0) q4Var.g(sv0.class));
            case 21:
                return new sbe(((osa) ((gaf) xd3.i.getValue())).e());
            case 22:
                return new ce4(((osa) ((gaf) xd3.i.getValue())).a());
            case 23:
                return (aua) xd3.f.getValue();
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                return (jbf) xd3.g.getValue();
            case 25:
                return (gaf) xd3.i.getValue();
            case 26:
                lfd lfd = (lfd) ((kbf) ((jbf) xd3.g.getValue())).e.getValue();
                return new nfd(0);
            case 27:
                return new sfd((lfd) ((kbf) ((jbf) xd3.g.getValue())).d.getValue());
            case 28:
                jbf jbf = (jbf) xd3.g.getValue();
                jbf.getClass();
                return new qfd(((kbf) jbf).a());
            default:
                return new hl7(((osa) ((gaf) xd3.i.getValue())).b());
        }
    }
}
