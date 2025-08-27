package defpackage;

import java.util.List;

/* renamed from: ol2  reason: default package */
public final /* synthetic */ class ol2 implements qk3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ dac b;

    public /* synthetic */ ol2(dac dac, int i) {
        this.a = i;
        this.b = dac;
    }

    public final void accept(Object obj) {
        int i = this.a;
        dac dac = this.b;
        switch (i) {
            case 0:
                dac.d((Integer) obj);
                return;
            case 1:
                dac.d((List) obj);
                return;
            default:
                dac.onError((Throwable) obj);
                return;
        }
    }
}
