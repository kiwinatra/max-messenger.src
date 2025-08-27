package defpackage;

import android.app.Application;
import android.content.Context;
import kotlin.Lazy;
import one.me.calls.impl.service.CallServiceImpl;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: s4  reason: default package */
public final class s4 extends dce {
    public final /* synthetic */ int b;

    public /* synthetic */ s4(int i) {
        this.b = i;
    }

    /* JADX WARNING: type inference failed for: r2v31, types: [ic3, xrb] */
    public final Object b(q4 q4Var) {
        q4 q4Var2 = q4Var;
        switch (this.b) {
            case 0:
                return new doa(q4Var2.h(jtb.class), q4Var2.h(w4.class), (u4) q4Var2.g(u4.class), q4Var2.h(jqg.class));
            case 1:
                return new w4((Context) q4Var2.g(Context.class), q4Var2.h(m95.class), (u4) q4Var2.g(u4.class));
            case 2:
                return new z80((Context) q4Var2.g(Context.class), (u4) q4Var2.g(u4.class), q4Var2.h(w4.class), q4Var2.h(doa.class), q4Var2.h(jqg.class));
            case 3:
                return new coa(q4Var2.h(ocf.class), q4Var2.h(x23.class), q4Var2.h(bud.class), q4Var2.h(fn4.class));
            case 4:
                return new oqa(q4Var2.h(ocf.class), q4Var2.h(x23.class), q4Var2.h(doa.class));
            case 5:
                return new tra(q4Var2.h(ocf.class));
            case 6:
                return new dxa(q4Var2.h(ocf.class));
            case 7:
                return new awa(q4Var2.h(ocf.class));
            case 8:
                gaf gaf = (gaf) q4Var2.g(gaf.class);
                Lazy h = q4Var2.h(et0.class);
                Lazy h2 = q4Var2.h(ds7.class);
                return new vj9(gaf, (xe3) q4Var2.g(xe3.class), h, q4Var2.h(qgf.class), h2, (Context) q4Var2.g(Context.class));
            case 9:
                Lazy h3 = q4Var2.h(bl3.class);
                Lazy h4 = q4Var2.h(cpb.class);
                Lazy h5 = q4Var2.h(s7g.class);
                Lazy h6 = q4Var2.h(iz.class);
                Lazy h7 = q4Var2.h(t00.class);
                Lazy h8 = q4Var2.h(ed2.class);
                Lazy h9 = q4Var2.h(j00.class);
                return new zz(q4Var2.h(ln5.class), q4Var2.h(hn4.class), q4Var2.h(x23.class), h4, q4Var2.h(uk5.class), q4Var2.h(taf.class), h3, h5, q4Var2.h(n5g.class), q4Var2.h(h90.class), h6, h7, h8, h9, q4Var2.h(z89.class), (Context) q4Var2.g(Context.class));
            case 10:
                Lazy h10 = q4Var2.h(ds7.class);
                return new z89((Context) q4Var2.g(Context.class), q4Var2.h(e24.class), h10, q4Var2.h(et0.class), q4Var2.h(yva.class), q4Var2.h(rta.class));
            case 11:
                Class<yva> cls = yva.class;
                Lazy h11 = q4Var2.h(cls);
                Class<gb9> cls2 = gb9.class;
                Lazy h12 = q4Var2.h(cls2);
                Lazy h13 = q4Var2.h(eu3.class);
                Lazy h14 = q4Var2.h(esb.class);
                Lazy h15 = q4Var2.h(vj9.class);
                Class<bl3> cls3 = bl3.class;
                Lazy h16 = q4Var2.h(cls3);
                Class<Context> cls4 = Context.class;
                Lazy h17 = q4Var2.h(fq.class);
                Lazy h18 = q4Var2.h(ghf.class);
                Lazy h19 = q4Var2.h(x23.class);
                Lazy h20 = q4Var2.h(gaf.class);
                Lazy h21 = q4Var2.h(cls4);
                Lazy h22 = q4Var2.h(cls2);
                Class<qx2> cls5 = qx2.class;
                oz ozVar = new oz(h17, h18, h19, h20, h21, h22, q4Var2.h(cls5), q4Var2.h(cls3), q4Var2.h(cls));
                Lazy h23 = q4Var2.h(is9.class);
                Lazy h24 = q4Var2.h(t00.class);
                return new msa(h11, h12, h15, h13, h16, h14, (Context) q4Var2.g(cls4), (zz) q4Var2.g(zz.class), (z89) q4Var2.g(z89.class), ozVar, h23, h24, q4Var2.h(cls5), (cjd) q4Var2.g(cjd.class));
            case 12:
                return new ei0(q4Var2.h(edb.class), q4Var2.h(eu3.class), q4Var2.h(ph4.class), q4Var2.h(gaf.class));
            case 13:
                return new xq1((cp1) q4Var2.g(cp1.class), q4Var2.h(x23.class), q4Var2.h(oqa.class), q4Var2.h(vpa.class));
            case Protos.Attaches.Attach.LOCATION:
                Class<x23> cls6 = x23.class;
                Class<bud> cls7 = bud.class;
                o21 o21 = new o21(q4Var2.h(cls6), q4Var2.h(cls7), q4Var2.h(uq1.class));
                Lazy h25 = q4Var2.h(Context.class);
                Lazy h26 = q4Var2.h(nq1.class);
                Class<vpa> cls8 = vpa.class;
                Lazy h27 = q4Var2.h(cls8);
                Lazy h28 = q4Var2.h(cls6);
                Lazy h29 = q4Var2.h(cls7);
                ? ic3 = new ic3(5);
                Lazy h30 = q4Var2.h(fn4.class);
                Lazy h31 = q4Var2.h(cls8);
                Lazy h32 = q4Var2.h(cls7);
                Object obj = new Object();
                ic3 ic32 = new ic3(5);
                ic32.v = o21;
                ic32.x = o21;
                ic32.w = o21;
                ic32.c = new wz0(0, h30);
                ((vpa) h31.getValue()).getClass();
                if (((akd) ((bud) h32.getValue())).n() == 3) {
                    ic32.o = obj;
                }
                ic3.Z = ic32.h().a();
                return new j51(h25, h26, h27, new lh4(ic3), h28, h29);
            case Protos.Attaches.Attach.DAILY_MEDIA:
                Class<sp1> cls9 = sp1.class;
                Class<dq1> cls10 = dq1.class;
                c31 c31 = new c31((sp1) q4Var2.g(cls9), q4Var2.h(cls10), q4Var2.h(um1.class));
                Lazy h33 = q4Var2.h(by4.class);
                Lazy h34 = q4Var2.h(h5d.class);
                Lazy h35 = q4Var2.h(m01.class);
                Lazy h36 = q4Var2.h(kq1.class);
                Lazy h37 = q4Var2.h(ahd.class);
                Lazy h38 = q4Var2.h(h9b.class);
                Lazy h39 = q4Var2.h(x9b.class);
                Lazy h40 = q4Var2.h(fq1.class);
                Lazy h41 = q4Var2.h(lq4.class);
                Lazy h42 = q4Var2.h(a21.class);
                cp1 cp1 = (cp1) q4Var2.g(cp1.class);
                Lazy h43 = q4Var2.h(rp1.class);
                Lazy h44 = q4Var2.h(gaf.class);
                Lazy h45 = q4Var2.h(vpa.class);
                Lazy h46 = q4Var2.h(e24.class);
                Lazy h47 = q4Var2.h(x23.class);
                Lazy h48 = q4Var2.h(fq.class);
                Lazy h49 = q4Var2.h(bud.class);
                Lazy h50 = q4Var2.h(tq1.class);
                Lazy h51 = q4Var2.h(edb.class);
                Lazy h52 = q4Var2.h(is9.class);
                Lazy h53 = q4Var2.h(km3.class);
                return new mp1(q4Var2.h(Application.class), q4Var2.h(nj1.class), q4Var2.h(cls10), q4Var2.h(jz3.class), q4Var2.h(q11.class), h33, h35, h34, h41, h39, h42, h36, h38, h37, q4Var2.h(kgd.class), h40, h43, h44, h45, h46, h47, h48, h49, q4Var2.h(uj5.class), h50, h51, q4Var2.h(uz0.class), cp1, c31, (sp1) q4Var2.g(cls9), h52, h53);
            case 16:
                return new uz0(q4Var2.h(jz3.class), q4Var2.h(q11.class), q4Var2.h(m01.class));
            case LangUtils.HASH_SEED:
                ym1 ym1 = new ym1(q4Var2.h(gaf.class), q4Var2.h(eu3.class), q4Var2.h(x23.class), q4Var2.h(is9.class));
                Lazy h54 = q4Var2.h(jz3.class);
                Class<kgd> cls11 = kgd.class;
                nc1 nc1 = new nc1(q4Var2.h(cls11));
                Lazy h55 = q4Var2.h(dq1.class);
                return new v9b(h54, q4Var2.h(cls11), (cp1) q4Var2.g(cp1.class), ym1, nc1, h55, q4Var2.h(bo3.class));
            case 18:
                return new dq1();
            case 19:
                return new jz3();
            case 20:
                return new by4((cp1) q4Var2.g(cp1.class));
            case 21:
                return new q11(q4Var2.h(jz3.class));
            case 22:
                return new o01(q4Var2.h(jz3.class), new oo1(q4Var2.h(Context.class), q4Var2.h(q11.class), new q9c(q4Var2.h(p9c.class)), q4Var2.h(vpa.class), q4Var2.h(bud.class)));
            case 23:
                return CallServiceImpl.y;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                return new y9b(q4Var2.h(jz3.class), q4Var2.h(h9b.class), q4Var2.h(q11.class));
            case 25:
                return new lq4(q4Var2.h(x9b.class), (cp1) q4Var2.g(cp1.class));
            case 26:
                return new rp1(q4Var2.h(sv0.class), q4Var2.h(gaf.class));
            case 27:
                return new k21((cp1) q4Var2.g(cp1.class), q4Var2.h(qx2.class), q4Var2.h(rl.class), q4Var2.h(rp1.class), q4Var2.h(yva.class), q4Var2.h(gaf.class), q4Var2.h(km3.class), q4Var2.h(bo3.class), q4Var2.h(is9.class));
            case 28:
                return new Object();
            default:
                return new cp1(q4Var2.h(gaf.class), q4Var2.h(s04.class));
        }
    }
}
