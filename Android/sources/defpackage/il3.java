package defpackage;

import android.content.Context;
import kotlin.jvm.functions.Function0;

/* renamed from: il3  reason: default package */
public final /* synthetic */ class il3 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ kl3 c;

    public /* synthetic */ il3(Context context, kl3 kl3, int i) {
        this.a = i;
        this.b = context;
        this.c = kl3;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return kl3.M(this.b, this.c);
            case 1:
                return kl3.L(this.b, this.c);
            default:
                return kl3.N(this.b, this.c);
        }
    }
}
