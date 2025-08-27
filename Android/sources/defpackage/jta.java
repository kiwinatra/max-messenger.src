package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: jta  reason: default package */
public final class jta implements ct4 {
    public final /* synthetic */ String a;
    public final /* synthetic */ cwb b;

    public jta(String str, cwb cwb) {
        this.a = str;
        this.b = cwb;
    }

    public final void e(rr4 rr4, Exception exc) {
        if (Intrinsics.areEqual((Object) rr4.a.a, (Object) this.a)) {
            String str = rr4.a.a;
            int i = rr4.b;
            float f = rr4.h.b;
            z68.c("OneMeDownloadController", "onDownloadChanged, " + str + ", " + i + ", " + f + "%", new Object[0]);
            if (exc != null) {
                ((zvb) this.b).p(exc);
                return;
            }
            zvb zvb = (zvb) this.b;
            zvb.getClass();
            zvb.s(rr4);
            int i2 = rr4.b;
            if (i2 == 1 || i2 == 3 || i2 == 4 || i2 == 5) {
                zvb zvb2 = (zvb) this.b;
                zvb2.getClass();
                if (!zvb2.o.u()) {
                    zvb zvb3 = (zvb) this.b;
                    zvb3.getClass();
                    zvb3.p((Throwable) null);
                }
            }
        }
    }

    public final void f(et4 et4, rr4 rr4) {
        if (Intrinsics.areEqual((Object) rr4.a.a, (Object) this.a)) {
            et4.e.remove(this);
            zvb zvb = (zvb) this.b;
            zvb.getClass();
            if (!zvb.o.u()) {
                zvb.getClass();
                zvb.p((Throwable) null);
            }
        }
    }
}
