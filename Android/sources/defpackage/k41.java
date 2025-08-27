package defpackage;

import android.app.Application;
import androidx.lifecycle.SavedStateHandlesVM;
import ru.ok.messages.calls.utils.StartCallsViewModel;
import ru.ok.tamtam.calls.CallDialogViewModel;

/* renamed from: k41  reason: default package */
public final class k41 implements dbg {
    public final /* synthetic */ int a;

    public /* synthetic */ k41(int i) {
        this.a = i;
    }

    public final yag b(Class cls, zy9 zy9) {
        switch (this.a) {
            case 0:
                sjd sjd = (sjd) ((y9f) y7e.p(zy9)).a();
                return new CallDialogViewModel(y7e.p(zy9), b59.q(zy9), sjd.g(), sjd.i(), sjd.y(), sjd.d(), sjd.f(), sjd.z(), (gcf) sjd.getAccessor().g(gcf.class), sjd.s(), ((a74) ((s74) sjd.getAccessor().g(s74.class))).o);
            case 1:
                return new SavedStateHandlesVM();
            default:
                Application p = y7e.p(zy9);
                y7e.p(zy9);
                id3 e = ym.e();
                hdd q = b59.q(zy9);
                qra qra = (qra) e;
                doa j = qra.j();
                w21 k = qra.k();
                nd c = qra.c();
                r62 l = qra.l();
                gaf G = qra.G();
                y91 y91 = (y91) qra.getAccessor().g(y91.class);
                return new StartCallsViewModel(p, q, j, k, c, l, G);
        }
    }
}
