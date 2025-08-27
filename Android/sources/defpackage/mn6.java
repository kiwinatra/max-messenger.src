package defpackage;

import kotlin.jvm.functions.Function0;

/* renamed from: mn6  reason: default package */
public final /* synthetic */ class mn6 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ id3 b;

    public /* synthetic */ mn6(qra qra, int i) {
        this.a = i;
        this.b = qra;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return (wj0) ((qra) this.b).getAccessor().g(wj0.class);
            case 1:
                return ((qra) this.b).c();
            default:
                return ((qra) this.b).G();
        }
    }
}
