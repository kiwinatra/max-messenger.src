package defpackage;

import androidx.recyclerview.widget.b;
import kotlin.jvm.functions.Function0;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: pi1  reason: default package */
public final /* synthetic */ class pi1 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jj1 b;

    public /* synthetic */ pi1(jj1 jj1, int i) {
        this.a = i;
        this.b = jj1;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return Boolean.valueOf(((vj5) ((uj5) this.b.X.getValue())).o());
            case 1:
                vj5 vj5 = (vj5) ((uj5) this.b.X.getValue());
                vj5.getClass();
                return Boolean.valueOf(vj5.m(PmsKey.gsse, false));
            case 2:
                vj5 vj52 = (vj5) ((uj5) this.b.X.getValue());
                vj52.getClass();
                return Boolean.valueOf(vj52.m(PmsKey.sse, false));
            case 3:
                vj5 vj53 = (vj5) ((uj5) this.b.X.getValue());
                vj53.getClass();
                return Boolean.valueOf(vj53.m(PmsKey.grse, false));
            default:
                int i = this.b.y.e ? 6 : 8;
                b bVar = new b();
                bVar.setMaxRecycledViews(1, i);
                return bVar;
        }
    }
}
