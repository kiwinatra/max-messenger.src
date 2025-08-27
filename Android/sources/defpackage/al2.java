package defpackage;

import kotlin.jvm.functions.Function0;

/* renamed from: al2  reason: default package */
public final /* synthetic */ class al2 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ hs7 b;

    public /* synthetic */ al2(hs7 hs7, int i) {
        this.a = i;
        this.b = hs7;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return Boolean.valueOf(((ed2) this.b.get()).e());
            default:
                return this.b.get();
        }
    }
}
