package defpackage;

import kotlin.jvm.functions.Function0;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: kf1  reason: default package */
public final /* synthetic */ class kf1 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ lf1 b;

    public /* synthetic */ kf1(lf1 lf1, int i) {
        this.a = i;
        this.b = lf1;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                vj5 vj5 = (vj5) ((uj5) this.b.f.getValue());
                vj5.getClass();
                return Boolean.valueOf(vj5.m(PmsKey.gce, false));
            default:
                return Boolean.valueOf(((vj5) ((uj5) this.b.f.getValue())).o());
        }
    }
}
