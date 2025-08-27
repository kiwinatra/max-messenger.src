package defpackage;

import kotlin.jvm.functions.Function0;

/* renamed from: x1f  reason: default package */
public final /* synthetic */ class x1f implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ o83 b;

    public /* synthetic */ x1f(o83 o83, int i) {
        this.a = i;
        this.b = o83;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return ((sjd) tr1.h((qra) this.b.c)).j();
            default:
                return (drd) ((sjd) tr1.h((qra) this.b.c)).getAccessor().g(drd.class);
        }
    }
}
