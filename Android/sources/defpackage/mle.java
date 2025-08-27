package defpackage;

import kotlin.jvm.functions.Function0;

/* renamed from: mle  reason: default package */
public final class mle implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function0 b;

    public /* synthetic */ mle(int i, Function0 function0) {
        this.a = i;
        this.b = function0;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new tib(25, (dle) this.b);
            case 1:
                return new tib(26, (lce) this.b);
            case 2:
                return new tib(27, (npe) this.b);
            case 3:
                return new tib(28, (cte) this.b);
            case 4:
                return new tib(29, (kte) this.b);
            case 5:
                return new sue(0, (dle) this.b);
            case 6:
                return new sue(1, (cve) this.b);
            case 7:
                return new sue(2, (cig) this.b);
            default:
                return new sue(3, this.b);
        }
    }
}
