package defpackage;

import android.content.Context;
import android.view.View;
import kotlin.jvm.functions.Function0;

/* renamed from: ok1  reason: default package */
public final /* synthetic */ class ok1 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ rk1 c;

    public /* synthetic */ ok1(Context context, rk1 rk1, int i) {
        this.a = i;
        this.b = context;
        this.c = rk1;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return rk1.M(this.b, this.c);
            default:
                rf1 rf1 = new rf1(this.b);
                rf1.setPipTheme(l2b.a);
                rf1.setPipMode(of1.b);
                rf1.setId(View.generateViewId());
                rk1 rk1 = this.c;
                rf1.setListener(new er7(8, (Object) rk1));
                rf1.setVisibility(8);
                rf1.setVideoLayoutUpdatesControllerProvider(new nk1(rk1, 3));
                return rf1;
        }
    }
}
