package defpackage;

import android.content.Context;
import kotlin.jvm.functions.Function0;

/* renamed from: lr4  reason: default package */
public final /* synthetic */ class lr4 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ nr4 b;
    public final /* synthetic */ Context c;

    public /* synthetic */ lr4(nr4 nr4, Context context, int i) {
        this.a = i;
        this.b = nr4;
        this.c = context;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return this.b.f(this.c, true);
            default:
                return this.b.f(this.c, false);
        }
    }
}
