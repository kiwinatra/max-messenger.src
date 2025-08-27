package defpackage;

import android.os.SystemClock;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: yc7  reason: default package */
public final /* synthetic */ class yc7 implements Function1 {
    public final /* synthetic */ long a;
    public final /* synthetic */ int b;

    public /* synthetic */ yc7(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public final Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.a;
        String str = yd7.C0;
        int i = this.b;
        if (th == null) {
            z68.c(str, "prefetch " + i + " completed, all time = " + elapsedRealtime + "ms", new Object[0]);
        } else {
            z68.f(str, "prefetch " + i + " completion error, all time = " + elapsedRealtime + "ms", th);
        }
        return Unit.INSTANCE;
    }
}
