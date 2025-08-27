package defpackage;

import java.nio.ByteBuffer;
import javax.net.ssl.SSLEngine;
import kotlin.jvm.functions.Function0;

/* renamed from: xkf  reason: default package */
public final /* synthetic */ class xkf implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rlf b;
    public final /* synthetic */ nw0 c;

    public /* synthetic */ xkf(rlf rlf, nw0 nw0, int i) {
        this.a = i;
        this.b = rlf;
        this.c = nw0;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                rlf rlf = this.b;
                SSLEngine sSLEngine = rlf.a;
                nw0 nw0 = this.c;
                return sSLEngine.wrap(nw0.a, nw0.b, nw0.c, rlf.j.e());
            default:
                rlf rlf2 = this.b;
                SSLEngine sSLEngine2 = rlf2.a;
                ByteBuffer e = rlf2.i.e();
                nw0 nw02 = this.c;
                return sSLEngine2.unwrap(e, nw02.a, nw02.b, nw02.c);
        }
    }
}
