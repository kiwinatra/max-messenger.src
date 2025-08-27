package defpackage;

import java.util.concurrent.Callable;
import kotlin.Unit;

/* renamed from: u5d  reason: default package */
public final class u5d implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j5d b;
    public final /* synthetic */ c6d c;

    public /* synthetic */ u5d(c6d c6d, j5d j5d, int i) {
        this.a = i;
        this.c = c6d;
        this.b = j5d;
    }

    public final Object call() {
        switch (this.a) {
            case 0:
                c6d c6d = this.c;
                i6d i6d = c6d.a;
                i6d.c();
                try {
                    Long valueOf = Long.valueOf(c6d.b.d0(this.b));
                    i6d.r();
                    return valueOf;
                } finally {
                    i6d.l();
                }
            default:
                c6d c6d2 = this.c;
                i6d i6d2 = c6d2.a;
                i6d2.c();
                try {
                    c6d2.d.a0(this.b);
                    i6d2.r();
                    return Unit.INSTANCE;
                } finally {
                    i6d2.l();
                }
        }
    }
}
