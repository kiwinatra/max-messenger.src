package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: ek5  reason: default package */
public final class ek5 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ i0 b;

    public /* synthetic */ ek5(i0 i0Var, int i) {
        this.a = i;
        this.b = i0Var;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                if (((Throwable) obj) != null) {
                    this.b.a();
                }
                return Unit.INSTANCE;
            case 1:
                Throwable th = (Throwable) obj;
                this.b.a();
                return Unit.INSTANCE;
            default:
                Throwable th2 = (Throwable) obj;
                this.b.a();
                return Unit.INSTANCE;
        }
    }
}
