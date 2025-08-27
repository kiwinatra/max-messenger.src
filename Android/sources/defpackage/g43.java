package defpackage;

import kotlin.Lazy;
import kotlin.LazyKt;
import one.me.rlottie.network.LottieFetchCall;
import one.me.rlottie.network.LottieNetworkFetcher;

/* renamed from: g43  reason: default package */
public final class g43 implements LottieNetworkFetcher {
    public final Lazy a;

    public g43(int i) {
        switch (i) {
            case 2:
                this.a = LazyKt.lazy(new red(25));
                return;
            default:
                this.a = LazyKt.lazy(new ve(12, (Object) this));
                return;
        }
    }

    public LottieFetchCall fetch(String str) {
        hr6 hr6 = new hr6();
        hr6.C(str);
        return new sla(((rla) this.a.getValue()).b(hr6.c()).h());
    }

    public g43(Lazy lazy) {
        this.a = lazy;
    }
}
