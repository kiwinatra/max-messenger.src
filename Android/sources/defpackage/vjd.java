package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* renamed from: vjd  reason: default package */
public final class vjd extends Lambda implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zz7 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vjd(zz7 zz7, int i) {
        super(1);
        this.a = i;
        this.b = zz7;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                Throwable th = (Throwable) obj;
                this.b.cancel(false);
                return Unit.INSTANCE;
            default:
                Throwable th2 = (Throwable) obj;
                this.b.cancel(false);
                return Unit.INSTANCE;
        }
    }
}
