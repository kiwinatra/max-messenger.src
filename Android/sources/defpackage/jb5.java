package defpackage;

import kotlin.Lazy;
import kotlin.jvm.functions.Function0;

/* renamed from: jb5  reason: default package */
public final /* synthetic */ class jb5 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Lazy b;
    public final /* synthetic */ kb5 c;

    public /* synthetic */ jb5(Lazy lazy, kb5 kb5, int i) {
        this.a = i;
        this.b = lazy;
        this.c = kb5;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                gx0 gx0 = new gx0();
                gx0.a = (cx0) this.b.getValue();
                gx0.c = (f74) this.c.c.getValue();
                gx0.d = 2;
                return gx0;
            case 1:
                return new xaf(((vaf) this.b.getValue()).e(), (vc4) this.c.b.getValue());
            default:
                gx0 gx02 = new gx0();
                gx02.a = (cx0) this.b.getValue();
                gx02.c = (f74) this.c.e.getValue();
                gx02.d = 2;
                return gx02;
        }
    }
}
