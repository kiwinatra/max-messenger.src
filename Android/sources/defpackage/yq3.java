package defpackage;

import android.content.Context;
import kotlin.jvm.functions.Function0;

/* renamed from: yq3  reason: default package */
public final /* synthetic */ class yq3 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ zq3 c;

    public /* synthetic */ yq3(Context context, zq3 zq3, int i) {
        this.a = i;
        this.b = context;
        this.c = zq3;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return zq3.a(this.b, this.c);
            default:
                return zq3.b(this.b, this.c);
        }
    }
}
