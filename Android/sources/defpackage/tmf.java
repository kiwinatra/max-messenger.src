package defpackage;

import kotlin.jvm.functions.Function0;

/* renamed from: tmf  reason: default package */
public final /* synthetic */ class tmf implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function0 b;

    public /* synthetic */ tmf(int i, Function0 function0) {
        this.a = i;
        this.b = function0;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return Integer.valueOf(((k2b) this.b.invoke()).c().c);
            default:
                return Integer.valueOf(((k2b) this.b.invoke()).getIcon().f);
        }
    }
}
