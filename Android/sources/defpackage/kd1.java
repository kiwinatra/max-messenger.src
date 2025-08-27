package defpackage;

import kotlin.jvm.functions.Function1;

/* renamed from: kd1  reason: default package */
public final /* synthetic */ class kd1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ ld1 c;

    public /* synthetic */ kd1(Function1 function1, ld1 ld1, int i) {
        this.a = i;
        this.b = function1;
        this.c = ld1;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.invoke(this.c);
                return;
            default:
                this.b.invoke(this.c);
                return;
        }
    }
}
