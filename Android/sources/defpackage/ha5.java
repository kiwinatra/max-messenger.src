package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: ha5  reason: default package */
public final /* synthetic */ class ha5 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Runnable b;

    public /* synthetic */ ha5(Runnable runnable, int i) {
        this.a = i;
        this.b = runnable;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                this.b.run();
                return Unit.INSTANCE;
            case 1:
                this.b.run();
                return Unit.INSTANCE;
            case 2:
                this.b.run();
                return Unit.INSTANCE;
            default:
                this.b.run();
                return Unit.INSTANCE;
        }
    }
}
