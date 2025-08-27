package defpackage;

import android.content.res.Configuration;
import androidx.fragment.app.c;

/* renamed from: uc6  reason: default package */
public final /* synthetic */ class uc6 implements tk3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;

    public /* synthetic */ uc6(c cVar, int i) {
        this.a = i;
        this.b = cVar;
    }

    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                Configuration configuration = (Configuration) obj;
                c cVar = this.b;
                if (cVar.N()) {
                    cVar.i(false, configuration);
                    return;
                }
                return;
            case 1:
                Integer num = (Integer) obj;
                c cVar2 = this.b;
                if (cVar2.N() && num.intValue() == 80) {
                    cVar2.m(false);
                    return;
                }
                return;
            case 2:
                jx9 jx9 = (jx9) obj;
                c cVar3 = this.b;
                if (cVar3.N()) {
                    cVar3.n(jx9.a, false);
                    return;
                }
                return;
            default:
                xkb xkb = (xkb) obj;
                c cVar4 = this.b;
                if (cVar4.N()) {
                    cVar4.s(xkb.a, false);
                    return;
                }
                return;
        }
    }
}
