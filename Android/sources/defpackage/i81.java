package defpackage;

import kotlin.jvm.functions.Function0;

/* renamed from: i81  reason: default package */
public final /* synthetic */ class i81 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ o81 b;

    public /* synthetic */ i81(o81 o81, int i) {
        this.a = i;
        this.b = o81;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new j81(this.b);
            default:
                return new k81(this.b);
        }
    }
}
