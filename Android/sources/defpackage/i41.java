package defpackage;

import kotlin.jvm.functions.Function1;
import ru.ok.tamtam.calls.CallDialogViewModel;

/* renamed from: i41  reason: default package */
public final /* synthetic */ class i41 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CallDialogViewModel b;

    public /* synthetic */ i41(CallDialogViewModel callDialogViewModel, int i) {
        this.a = i;
        this.b = callDialogViewModel;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                bj2 bj2 = (bj2) obj;
                vk3 r = this.b.e.r();
                return Boolean.valueOf((r == null || bj2.a.a != r.r()) && !bj2.a.c());
            default:
                return this.b.e.p(((Long) obj).longValue(), false);
        }
    }
}
