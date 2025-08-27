package defpackage;

import android.app.Application;
import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: vn4  reason: default package */
public final class vn4 implements Function0 {
    public final Application a;
    public final Context b;
    public final String c = "https";
    public final String o = "max.ru";

    public vn4(Application application, yna yna) {
        this.a = application;
        this.b = yna;
    }

    public final Object invoke() {
        try {
            if (!bs0.m) {
                hd8.e = true;
                bs0.m = true;
                ld8.Z = new o9a(7);
            }
            rx2 rx2 = new rx2(10, this);
            fwf fwf = new fwf("app-scope");
            rx2.invoke(fwf);
            bs0.l = fwf.a();
        } catch (Throwable unused) {
        }
        return Unit.INSTANCE;
    }
}
