package defpackage;

import kotlin.jvm.functions.Function0;

/* renamed from: c61  reason: default package */
public final /* synthetic */ class c61 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ f61 b;

    public /* synthetic */ c61(f61 f61, int i) {
        this.a = i;
        this.b = f61;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                Function0 function0 = this.b.K0;
                if (function0 != null) {
                    return (p6g) function0.invoke();
                }
                return null;
            default:
                return Integer.valueOf(this.b.J0.a);
        }
    }
}
