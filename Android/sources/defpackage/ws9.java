package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.util.concurrent.CountDownLatch;

/* renamed from: ws9  reason: default package */
public class ws9 extends Handler {
    public final /* synthetic */ int a;

    public /* synthetic */ ws9() {
        this.a = 1;
    }

    public void handleMessage(Message message) {
        switch (this.a) {
            case 0:
                vs9 vs9 = (vs9) message.obj;
                int i = message.what;
                if (i == 1) {
                    xx xxVar = vs9.a;
                    Object obj = vs9.b[0];
                    if (xxVar.o.get()) {
                        CountDownLatch countDownLatch = xxVar.w;
                        try {
                            j0h j0h = xxVar.x;
                            if (j0h.i == xxVar) {
                                SystemClock.uptimeMillis();
                                j0h.i = null;
                                j0h.b();
                            }
                        } finally {
                            countDownLatch.countDown();
                        }
                    } else {
                        try {
                            j0h j0h2 = xxVar.x;
                            if (j0h2.h != xxVar) {
                                if (j0h2.i == xxVar) {
                                    SystemClock.uptimeMillis();
                                    j0h2.i = null;
                                    j0h2.b();
                                }
                            } else if (!j0h2.d) {
                                SystemClock.uptimeMillis();
                                j0h2.h = null;
                                z28 z28 = j0h2.b;
                                if (z28 != null) {
                                    if (Looper.myLooper() == Looper.getMainLooper()) {
                                        z28.k(obj);
                                    } else {
                                        z28.i(obj);
                                    }
                                }
                            }
                        } finally {
                            xxVar.w.countDown();
                        }
                    }
                    xxVar.c = 3;
                    return;
                } else if (i == 2) {
                    vs9.a.getClass();
                    return;
                } else {
                    return;
                }
            default:
                super.handleMessage(message);
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ws9(Looper looper, int i, boolean z) {
        super(looper);
        this.a = i;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ws9(Looper looper, Handler.Callback callback, int i) {
        super(looper, callback);
        this.a = i;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ws9(Looper looper, int i) {
        super(looper);
        this.a = i;
        switch (i) {
            case 5:
                super(looper);
                Looper.getMainLooper();
                return;
            default:
                Looper.getMainLooper();
                return;
        }
    }
}
