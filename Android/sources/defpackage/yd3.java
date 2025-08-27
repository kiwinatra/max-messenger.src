package defpackage;

import android.content.Context;
import android.util.SparseIntArray;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.SetsKt;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: yd3  reason: default package */
public final class yd3 extends dce {
    public final /* synthetic */ int b;

    public /* synthetic */ yd3(int i) {
        this.b = i;
    }

    /* JADX WARNING: type inference failed for: r10v35, types: [cd4, java.lang.Object] */
    public final Object b(q4 q4Var) {
        switch (this.b) {
            case 0:
                return new gl7(((osa) ((gaf) xd3.i.getValue())).b());
            case 1:
                return new jc8(((osa) ((gaf) xd3.i.getValue())).c());
            case 2:
                Lazy h = q4Var.h(ns3.class);
                return new kp3(q4Var.h(gaf.class), q4Var.h(eu3.class), q4Var.h(ph4.class), q4Var.h(ptb.class), q4Var.h(rtb.class), h, (ocb) q4Var.g(ocb.class), (Context) q4Var.g(Context.class), (bo3) q4Var.g(bo3.class));
            case 3:
                return new na4(q4Var.d(oa4.class, false));
            case 4:
                return new ta4(q4Var.h(na4.class), LazyKt.lazy(new us2(q4Var, 2)), q4Var.h(va4.class), q4Var.h(ja4.class));
            case 5:
                return new p25((Context) q4Var.g(Context.class), (t25) q4Var.g(t25.class), (jbf) q4Var.g(jbf.class), (m95) q4Var.g(m95.class));
            case 6:
                return new x15(q4Var.h(yva.class), q4Var.h(ce0.class));
            case 7:
                p7d p7d = new p7d(19);
                p7d.c = "legacy";
                p7d.b = new pqb(1048576, 2097152, new SparseIntArray(), -1);
                return new oqb(new nqb(p7d));
            case 8:
                return ((oqb) q4Var.g(oqb.class)).a();
            case 9:
                ca7 ca7 = (ca7) q4Var.g(ca7.class);
                ca7.getClass();
                return new da7(ca7);
            case 10:
                Class<Context> cls = Context.class;
                Context context = (Context) q4Var.g(cls);
                Lazy h2 = q4Var.h(po5.class);
                jp4 jp4 = new jp4(context);
                jp4.a = "fresco";
                jp4.b = new m74(2, h2);
                jp4.c = 314572800;
                jp4.d = 104857600;
                jp4.e = 52428800;
                kp4 kp4 = new kp4(jp4);
                ca7 ca72 = new ca7(context);
                ca72.f = new dbf(q4Var.h(rla.class));
                Class<oqb> cls2 = oqb.class;
                ca72.g = (oqb) q4Var.g(cls2);
                ca72.e = kp4;
                ca72.j = kp4;
                ox0 ox0 = new ox0(14, false);
                ox0.s(kr7.o, rf6.a, new qf6(q4Var.h(cls2), q4Var.h(ynb.class)));
                ox0.s(j4b.w, l38.a, new m38((Context) q4Var.g(cls), ((osa) ((gaf) q4Var.g(gaf.class))).c()));
                ca72.k = new ata(ox0);
                ca72.c = nt4.a;
                ca72.a = new Object();
                ca72.h = SetsKt.setOf(new h3d());
                ca72.d = new q13(q4Var.h(aua.class));
                return ca72;
            case 11:
                q4Var.g(pf6.class);
                return ea7.g();
            case 12:
                return ((ea7) q4Var.g(ea7.class)).f();
            case 13:
                return ((ea7) q4Var.g(ea7.class)).i();
            case Protos.Attaches.Attach.LOCATION /*14*/:
                return ((ea7) q4Var.g(ea7.class)).h();
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return new xt6((Context) q4Var.g(Context.class), q4Var.h(aua.class), q4Var.h(bud.class));
            case 16:
                return new tc7();
            case LangUtils.HASH_SEED /*17*/:
                return new vq((Context) q4Var.g(Context.class));
            case 18:
                return new vc7((Context) q4Var.g(Context.class));
            case 19:
                return uc7.a;
            case 20:
                return new uua(q4Var.h(ln5.class), q4Var.h(ba7.class), q4Var.h(oqb.class), q4Var.h(t8c.class), q4Var.h(no0.class), q4Var.h(gaf.class));
            case 21:
                return new kf7(q4Var);
            case 22:
                return new t8c((Context) q4Var.g(Context.class), q4Var.h(ea7.class), q4Var.h(no0.class));
            case 23:
                return new n48(q4Var.h(sqd.class), q4Var.h(jbf.class), q4Var.h(sz.class));
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                return new hq6((Context) q4Var.g(Context.class), q4Var.h(u82.class), q4Var.h(yva.class));
            case 25:
                return new ys7(q4Var);
            case 26:
                return new jab((Context) q4Var.g(Context.class));
            case 27:
                return new me((Context) q4Var.g(Context.class), (jab) q4Var.g(jab.class), (zs7) q4Var.g(zs7.class));
            case 28:
                return new Object();
            default:
                return new Object();
        }
    }
}
