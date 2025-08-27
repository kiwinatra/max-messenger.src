package defpackage;

import kotlin.jvm.functions.Function1;

/* renamed from: d71  reason: default package */
public final /* synthetic */ class d71 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e71 b;

    public /* synthetic */ d71(e71 e71, int i) {
        this.a = i;
        this.b = e71;
    }

    public final Object invoke(Object obj) {
        k2b k2b = (k2b) obj;
        switch (this.a) {
            case 0:
                fu4.k.f(this.b.a).getIcon().getClass();
                return -1;
            default:
                fu4.k.f(this.b.a).c().getClass();
                return 0;
        }
    }
}
