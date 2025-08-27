package defpackage;

import java.util.concurrent.Executor;

/* renamed from: br1  reason: default package */
public final /* synthetic */ class br1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gy0 b;
    public final /* synthetic */ do1 c;

    public /* synthetic */ br1(gy0 gy0, do1 do1, int i) {
        this.a = i;
        this.b = gy0;
        this.c = do1;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                gy0 gy0 = this.b;
                gy0.w = true;
                Exception exc = new Exception("Camera2CameraControl was updated with new options.");
                do1 do1 = (do1) gy0.y;
                if (do1 != null) {
                    do1.d(exc);
                    gy0.y = null;
                }
                gy0.y = this.c;
                if (gy0.b) {
                    lr1 lr1 = (lr1) gy0.c;
                    lr1.getClass();
                    hd8.J(m5a.F(new d9d(25, lr1))).d(new b(28, (Object) gy0), (Executor) gy0.o);
                    gy0.w = false;
                    return;
                }
                return;
            default:
                gy0 gy02 = this.b;
                gy02.w = true;
                Exception exc2 = new Exception("Camera2CameraControl was updated with new options.");
                do1 do12 = (do1) gy02.y;
                if (do12 != null) {
                    do12.d(exc2);
                    gy02.y = null;
                }
                gy02.y = this.c;
                if (gy02.b) {
                    lr1 lr12 = (lr1) gy02.c;
                    lr12.getClass();
                    hd8.J(m5a.F(new d9d(25, lr12))).d(new b(28, (Object) gy02), (Executor) gy02.o);
                    gy02.w = false;
                    return;
                }
                return;
        }
    }
}
