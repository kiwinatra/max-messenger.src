package defpackage;

import java.util.concurrent.Executor;

/* renamed from: cr1  reason: default package */
public final /* synthetic */ class cr1 implements eo1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gy0 b;

    public /* synthetic */ cr1(gy0 gy0, int i) {
        this.a = i;
        this.b = gy0;
    }

    public final Object r(do1 do1) {
        int i = this.a;
        gy0 gy0 = this.b;
        gy0.getClass();
        switch (i) {
            case 0:
                ((Executor) gy0.o).execute(new br1(gy0, do1, 1));
                return "addCaptureRequestOptions";
            default:
                ((Executor) gy0.o).execute(new br1(gy0, do1, 0));
                return "clearCaptureRequestOptions";
        }
    }
}
