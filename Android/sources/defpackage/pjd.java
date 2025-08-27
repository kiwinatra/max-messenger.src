package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: pjd  reason: default package */
public final class pjd implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ q4 b;

    public /* synthetic */ pjd(q4 q4Var, int i) {
        this.a = i;
        this.b = q4Var;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return this.b.g(fa9.class);
            case 1:
                return this.b.g(eef.class);
            case 2:
                return this.b.g(d6b.class);
            case 3:
                return this.b.g(jqg.class);
            case 4:
                return this.b.g(o82.class);
            case 5:
                return this.b.g(qa2.class);
            case 6:
                return this.b.g(nd.class);
            case 7:
                return this.b.g(iof.class);
            case 8:
                return this.b.g(s74.class);
            case 9:
                return this.b.g(qfa.class);
            case 10:
                return this.b.g(m95.class);
            case 11:
                return this.b.g(rl.class);
            case 12:
                return this.b.g(gcf.class);
            case 13:
                return this.b.g(gvc.class);
            case Protos.Attaches.Attach.LOCATION /*14*/:
                return this.b.g(s74.class);
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return this.b.g(ln5.class);
            case 16:
                return this.b.g(rl.class);
            case LangUtils.HASH_SEED:
                return this.b.g(ju4.class);
            case 18:
                return this.b.g(yf9.class);
            case 19:
                return this.b.g(bud.class);
            case 20:
                return this.b.g(qi5.class);
            case 21:
                return this.b.g(rh5.class);
            case 22:
                return this.b.g(moe.class);
            case 23:
                return this.b.g(x23.class);
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                return this.b.g(fa9.class);
            case 25:
                return this.b.g(jqg.class);
            case 26:
                ys6 ys6 = ys6.a;
                q4 q4Var = this.b;
                ev0.v(ys6, ((osa) ((gaf) q4Var.g(gaf.class))).b(), (f14) null, new d3e(q4Var, (Continuation) null), 2);
                return Unit.INSTANCE;
            default:
                return ((aua) this.b.g(aua.class)).b();
        }
    }
}
