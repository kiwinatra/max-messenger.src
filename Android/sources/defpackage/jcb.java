package defpackage;

import android.app.Application;
import android.content.Context;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: jcb  reason: default package */
public final class jcb extends dce {
    public final /* synthetic */ int b;

    public /* synthetic */ jcb(int i) {
        this.b = i;
    }

    public final Object b(q4 q4Var) {
        switch (this.b) {
            case 0:
                return new ocb((Application) q4Var.g(Application.class));
            case 1:
                return new n5g((Context) q4Var.g(Context.class), q4Var.h(nd.class), (x23) q4Var.g(x23.class), (rl) q4Var.g(rl.class), (ln5) q4Var.g(ln5.class), (i4g) q4Var.g(i4g.class), (gaf) q4Var.g(gaf.class));
            case 2:
                return new zpb((Application) q4Var.g(Application.class), (m95) q4Var.g(m95.class), (lb5) q4Var.g(lb5.class), q4Var.h(x23.class));
            case 3:
                return new mce((Application) q4Var.g(Application.class), (m95) q4Var.g(m95.class), (lb5) q4Var.g(lb5.class), q4Var.h(x23.class));
            case 4:
                return new lb5((Context) q4Var.g(Context.class), q4Var.h(bx0.class));
            case 5:
                po5 po5 = (po5) ((ln5) q4Var.g(ln5.class));
                po5.getClass();
                return new tae(po5.g(po5.b(), "videoCache"), new ps7(104857600), (u74) null, true);
            case 6:
                return new Object();
            case 7:
                return (qjd) q4Var.g(a33.class);
            case 8:
                return (x23) q4Var.g(a33.class);
            case 9:
                return new y2((Context) q4Var.g(Context.class), "auth.prefs", (fn5) q4Var.g(fn5.class));
            case 10:
                Context context = (Context) q4Var.g(Context.class);
                fn5 fn5 = (fn5) q4Var.g(fn5.class);
                return new ltb((a33) q4Var.g(a33.class), (cud) q4Var.g(cud.class), (hq) q4Var.g(hq.class), (u80) q4Var.g(u80.class), (vj5) q4Var.g(vj5.class));
            case 11:
                return (jtb) q4Var.g(ltb.class);
            case 12:
                return new hq((Context) q4Var.g(Context.class), (fn5) q4Var.g(fn5.class));
            case 13:
                return (pid) q4Var.g(hq.class);
            case Protos.Attaches.Attach.LOCATION /*14*/:
                return (fq) q4Var.g(hq.class);
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return new akd((Context) q4Var.g(Context.class), (fn5) q4Var.g(fn5.class));
            case 16:
                return (akd) q4Var.g(cud.class);
            case LangUtils.HASH_SEED /*17*/:
                return (bud) q4Var.g(cud.class);
            case 18:
                return new xjd((Context) q4Var.g(Context.class), (fn5) q4Var.g(fn5.class), (akd) q4Var.g(akd.class));
            case 19:
                return (xjd) q4Var.g(vj5.class);
            case 20:
                return (uj5) q4Var.g(vj5.class);
            case 21:
                return ((a74) ((s74) q4Var.g(s74.class))).f;
            case 22:
                return ((a74) ((s74) q4Var.g(s74.class))).d;
            case 23:
                return ((a74) ((s74) q4Var.g(s74.class))).e;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                return ((a74) ((s74) q4Var.g(s74.class))).c;
            case 25:
                return ((a74) ((s74) q4Var.g(s74.class))).b;
            case 26:
                return ((a74) ((s74) q4Var.g(s74.class))).h;
            case 27:
                return ((a74) ((s74) q4Var.g(s74.class))).g;
            case 28:
                return ((a74) ((s74) q4Var.g(s74.class))).j;
            default:
                return ((a74) ((s74) q4Var.g(s74.class))).k;
        }
    }
}
