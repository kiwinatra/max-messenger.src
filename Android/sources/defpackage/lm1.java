package defpackage;

import android.content.Context;
import kotlin.jvm.functions.Function0;

/* renamed from: lm1  reason: default package */
public final /* synthetic */ class lm1 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ tm1 c;

    public /* synthetic */ lm1(Context context, tm1 tm1, int i) {
        this.a = i;
        this.b = context;
        this.c = tm1;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return tm1.O(this.b, this.c);
            default:
                return tm1.M(this.b, this.c);
        }
    }
}
