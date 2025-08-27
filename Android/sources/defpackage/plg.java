package defpackage;

import android.content.Context;
import kotlin.jvm.functions.Function0;

/* renamed from: plg  reason: default package */
public final /* synthetic */ class plg implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ r10 b;
    public final /* synthetic */ bud c;

    public /* synthetic */ plg(r10 r10, bud bud, int i) {
        this.a = i;
        this.b = r10;
        this.c = bud;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                r10 r10 = this.b;
                return new hlg(r10.a, r10.b, (Context) r10.c, this.c);
            default:
                r10 r102 = this.b;
                bud bud = this.c;
                return new ilg(r102.a, r102.b, (Context) r102.c, bud);
        }
    }
}
