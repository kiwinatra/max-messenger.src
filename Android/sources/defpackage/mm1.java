package defpackage;

import kotlin.jvm.functions.Function0;
import ru.ok.android.externcalls.sdk.util.CallsThreadUtilsKt;

/* renamed from: mm1  reason: default package */
public final /* synthetic */ class mm1 implements m8d, ice {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function0 b;

    public /* synthetic */ mm1(int i, Function0 function0) {
        this.a = i;
        this.b = function0;
    }

    public void b() {
        int i = this.a;
        Function0 function0 = this.b;
        switch (i) {
            case 0:
                tm1.setPositiveAction$lambda$61$lambda$60(function0);
                return;
            default:
                tm1.setNegativeAction$lambda$59$lambda$58(function0);
                return;
        }
    }

    public void h(pbe pbe) {
        CallsThreadUtilsKt.executeOnIoThread$lambda$0(this.b, pbe);
    }
}
