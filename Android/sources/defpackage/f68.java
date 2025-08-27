package defpackage;

import android.content.Context;
import kotlin.Lazy;

/* renamed from: f68  reason: default package */
public final /* synthetic */ class f68 implements u2f {
    public final /* synthetic */ int a;
    public final /* synthetic */ g68 b;
    public final /* synthetic */ Lazy c;
    public final /* synthetic */ Context o;
    public final /* synthetic */ jtb v;

    public /* synthetic */ f68(g68 g68, Lazy lazy, Context context, jtb jtb, int i) {
        this.a = i;
        this.b = g68;
        this.c = lazy;
        this.o = context;
        this.v = jtb;
    }

    public final Object get() {
        switch (this.a) {
            case 0:
                g68 g68 = this.b;
                g68.getClass();
                return new ug0((lt6) this.c.getValue(), g68, this.o, this.v, 1);
            default:
                g68 g682 = this.b;
                g682.getClass();
                return new ug0((lt6) this.c.getValue(), g682, this.o, this.v, 0);
        }
    }
}
