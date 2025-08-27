package defpackage;

import android.content.Context;
import kotlin.jvm.functions.Function0;

/* renamed from: cn1  reason: default package */
public final /* synthetic */ class cn1 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ gn1 c;

    public /* synthetic */ cn1(Context context, gn1 gn1, int i) {
        this.a = i;
        this.b = context;
        this.c = gn1;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return gn1.O(this.b, this.c);
            default:
                on1 on1 = new on1(this.b);
                on1.setLayoutParams(new fj3(-1, -1));
                kne.S(on1, false);
                gn1 gn1 = this.c;
                on1.setListener(new d9d(22, gn1));
                on1.setVideoLayoutUpdatesControllerProvider(new an1(gn1, 1));
                return on1;
        }
    }
}
