package defpackage;

import java.util.concurrent.Callable;
import kotlin.jvm.functions.Function0;

/* renamed from: e6d  reason: default package */
public final /* synthetic */ class e6d implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function0 b;

    public /* synthetic */ e6d(int i, Function0 function0) {
        this.a = i;
        this.b = function0;
    }

    public final Object call() {
        switch (this.a) {
            case 0:
                return this.b.invoke();
            default:
                return this.b.invoke();
        }
    }
}
