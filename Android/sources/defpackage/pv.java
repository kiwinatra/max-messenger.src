package defpackage;

import kotlin.jvm.functions.Function1;

/* renamed from: pv  reason: default package */
public final /* synthetic */ class pv implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jz9 b;

    public /* synthetic */ pv(jz9 jz9, int i) {
        this.a = i;
        this.b = jz9;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return Boolean.valueOf(this.b.a(((gz6) obj).getId()));
            default:
                return Boolean.valueOf(!this.b.e(((hhb) obj).a));
        }
    }
}
