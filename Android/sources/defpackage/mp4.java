package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: mp4  reason: default package */
public final class mp4 extends jk0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mp4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void a() {
        switch (this.a) {
            case 0:
                ((AtomicBoolean) this.b).set(true);
                return;
            default:
                csb csb = (csb) this.b;
                if (csb.n()) {
                    csb.b.c();
                    return;
                }
                return;
        }
    }
}
