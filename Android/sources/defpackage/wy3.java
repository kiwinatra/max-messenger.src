package defpackage;

import kotlin.jvm.functions.Function0;

/* renamed from: wy3  reason: default package */
public final /* synthetic */ class wy3 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zy3 b;

    public /* synthetic */ wy3(zy3 zy3, int i) {
        this.a = i;
        this.b = zy3;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new xy3(this.b, 1);
            default:
                return new xy3(this.b, 0);
        }
    }
}
