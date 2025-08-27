package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: nf4  reason: default package */
public final /* synthetic */ class nf4 implements fc3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pac b;

    public /* synthetic */ nf4(pac pac, int i) {
        this.a = i;
        this.b = pac;
    }

    public final Object g(soc soc) {
        switch (this.a) {
            case 0:
                return new pf4((Context) soc.a(Context.class), ((hp5) soc.a(hp5.class)).c(), soc.b(pac.a(sx6.class)), soc.c(tj4.class), (Executor) soc.g(this.b));
            default:
                return rae.w(soc.a(np5.class));
        }
    }
}
