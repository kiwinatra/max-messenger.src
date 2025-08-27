package defpackage;

import android.content.Context;
import kotlin.jvm.functions.Function0;

/* renamed from: sc2  reason: default package */
public final class sc2 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ q4 c;

    public /* synthetic */ sc2(Context context, q4 q4Var, int i) {
        this.a = i;
        this.b = context;
        this.c = q4Var;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                q4 q4Var = this.c;
                return new bsd(this.b, q4Var.h(ds7.class), q4Var.h(et0.class), q4Var.h(rta.class), tr2.g, 20);
            case 1:
                q4 q4Var2 = this.c;
                return new bsd(this.b, q4Var2.h(ds7.class), q4Var2.h(et0.class), q4Var2.h(rta.class));
            case 2:
                q4 q4Var3 = this.c;
                return new bsd(this.b, q4Var3.h(ds7.class), q4Var3.h(et0.class), q4Var3.h(rta.class), tr2.g, 20);
            default:
                q4 q4Var4 = this.c;
                return new bsd(this.b, q4Var4.h(ds7.class), q4Var4.h(et0.class), q4Var4.h(rta.class));
        }
    }
}
