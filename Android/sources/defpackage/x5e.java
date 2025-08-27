package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import kotlin.jvm.functions.Function0;

/* renamed from: x5e  reason: default package */
public final /* synthetic */ class x5e implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ a6e c;

    public /* synthetic */ x5e(Context context, a6e a6e, int i) {
        this.a = i;
        this.b = context;
        this.c = a6e;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                s87 s87 = new s87(this.b);
                this.c.addView(s87, new ViewGroup.LayoutParams(-2, -2));
                return s87;
            case 1:
                return a6e.a(this.b, this.c);
            case 2:
                return a6e.f(this.b, this.c);
            default:
                return a6e.c(this.b, this.c);
        }
    }
}
