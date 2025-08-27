package defpackage;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;
import ru.ok.tamtam.nano.Protos;

/* renamed from: us2  reason: default package */
public final class us2 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ q4 b;

    public /* synthetic */ us2(q4 q4Var, int i) {
        this.a = i;
        this.b = q4Var;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                q4 q4Var = this.b;
                return new pjb(q4Var.h(x23.class), q4Var.h(rtb.class), q4Var.h(ptb.class));
            case 1:
                return Long.valueOf(((qjd) ((x23) this.b.g(x23.class))).s());
            case 2:
                return (y7d) this.b.g(y7d.class);
            case 3:
                return new j16((yva) this.b.g(yva.class));
            case 4:
                q4 q4Var2 = this.b;
                return new my6((tcf) q4Var2.g(tcf.class), (gaf) q4Var2.g(gaf.class));
            case 5:
                return ((kbf) ((jbf) this.b.g(jbf.class))).a();
            case 6:
                return Long.valueOf(((ltb) ((jtb) this.b.g(jtb.class))).a.s());
            case 7:
                return ((kbf) ((jbf) this.b.g(jbf.class))).a();
            case 8:
                return ((kbf) ((jbf) this.b.g(jbf.class))).a();
            case 9:
                hx0 hx0 = new hx0();
                q4 q4Var3 = this.b;
                hx0.a = (bx0) q4Var3.g(tae.class);
                hx0.d = new ud4((Context) q4Var3.g(Context.class), (g74) q4Var3.g(xf4.class));
                hx0.c = true;
                hx0.e = 2;
                return hx0;
            case 10:
                return ((xpc) this.b.g(xpc.class)).a;
            case 11:
                return ((x47) this.b.g(x47.class)).a;
            case 12:
                return ((aua) this.b.g(aua.class)).b();
            case 13:
                return Boolean.valueOf(((kn4) this.b.g(kn4.class)).compareTo(kn4.w) >= 0);
            case Protos.Attaches.Attach.LOCATION:
                akd akd = (akd) ((bud) this.b.g(bud.class));
                Integer num = (Integer) ((om0) akd.j.getValue()).J();
                return i94.a(num != null ? num.intValue() : akd.n());
            case Protos.Attaches.Attach.DAILY_MEDIA:
                return new y95(((osa) ((gaf) this.b.g(gaf.class))).d().f(5, "file-logging"));
            case 16:
                aua aua = (aua) this.b.g(aua.class);
                aua.getClass();
                KProperty kProperty = aua.o[4];
                return aua.d(aua.j);
            case LangUtils.HASH_SEED:
                jbf jbf = (jbf) this.b.g(jbf.class);
                jbf.getClass();
                return ((kbf) jbf).a();
            case 18:
                return ((kbf) ((jbf) this.b.g(jbf.class))).c();
            case 19:
                return ((kbf) ((jbf) this.b.g(jbf.class))).b();
            case 20:
                return ((kbf) ((jbf) this.b.g(jbf.class))).b();
            case 21:
                return new ajd(this.b);
            case 22:
                return ((kbf) ((jbf) this.b.g(jbf.class))).a();
            case 23:
                return ((qjd) ((x23) this.b.g(x23.class))).u();
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                ((fn4) this.b.g(fn4.class)).e();
                return ina.a;
            case 25:
                return ((kbf) ((jbf) this.b.g(jbf.class))).c();
            case 26:
                return Long.valueOf(((qjd) ((x23) this.b.g(x23.class))).s());
            case 27:
                return ((aua) this.b.g(aua.class)).b();
            case 28:
                return new gjd(this.b);
            default:
                return ((OneMeRoomDatabase) ((cya) this.b.g(cya.class)).m()).X();
        }
    }
}
