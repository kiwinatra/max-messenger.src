package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.math.MathKt;

/* renamed from: h35  reason: default package */
public final class h35 extends tyc {
    public final /* synthetic */ int o = 0;
    public Object v;

    public /* synthetic */ h35() {
    }

    public final int j() {
        switch (this.o) {
            case 0:
                return 1;
            default:
                return ((List) ((ome) this.v).getValue()).size();
        }
    }

    public int l(int i) {
        switch (this.o) {
            case 0:
                return tic.view_type_smiles_separator;
            default:
                return super.l(i);
        }
    }

    public final void s(pzc pzc, int i) {
        switch (this.o) {
            case 0:
                g35 g35 = (g35) pzc;
                xoe xoe = (xoe) this.v;
                if (xoe != null) {
                    g35.a.setBackgroundColor(xoe.f);
                    return;
                }
                return;
            default:
                String str = (String) CollectionsKt.getOrNull((List) ((ome) this.v).getValue(), i);
                View view = ((w98) pzc).a;
                ((TextView) view).setText(str);
                view.setBackgroundColor((str == null || !StringsKt__StringsKt.contains((CharSequence) str, (CharSequence) "exception", true)) ? (str == null || !StringsKt__StringsKt.contains((CharSequence) str, (CharSequence) "error", true)) ? 0 : j4b.l0(0.75f, -65536) : j4b.l0(0.75f, -65536));
                return;
        }
    }

    public final pzc u(ViewGroup viewGroup, int i) {
        switch (this.o) {
            case 0:
                return new pzc(LayoutInflater.from(viewGroup.getContext()).inflate(ljc.smiles_separator_view, viewGroup, false));
            default:
                TextView textView = new TextView(viewGroup.getContext());
                puf.k.b(textView, uy4.b);
                float f = (float) 6;
                float f2 = (float) 3;
                textView.setPadding(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density));
                textView.setTextColor(fu4.k.e(textView.getContext()).f().getText().e);
                textView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                return new pzc(textView);
        }
    }

    public h35(xme xme) {
        this.v = xme;
    }
}
