package defpackage;

import kotlin.jvm.functions.Function0;

/* renamed from: al4  reason: default package */
public final /* synthetic */ class al4 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bl4 b;

    public /* synthetic */ al4(bl4 bl4, int i) {
        this.a = i;
        this.b = bl4;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return Boolean.valueOf(this.b == bl4.REGULAR);
            default:
                return Boolean.valueOf(this.b == bl4.DELAYED);
        }
    }
}
