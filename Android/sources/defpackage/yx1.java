package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* renamed from: yx1  reason: default package */
public final class yx1 extends fzc {
    public final /* synthetic */ int a = 1;
    public final Object b;
    public final Object c;

    public yx1(ok8 ok8, LinearLayoutManager linearLayoutManager) {
        this.c = ok8;
        this.b = linearLayoutManager;
    }

    public void a(RecyclerView recyclerView, int i) {
        switch (this.a) {
            case 1:
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.b;
                int G = linearLayoutManager.G();
                boolean z = linearLayoutManager.X0() + 3 >= G;
                if (G > 0 && z) {
                    ok8 ok8 = (ok8) this.c;
                    ok8.z(ok8.J0.isShown());
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void b(RecyclerView recyclerView, int i, int i2) {
        int S0;
        switch (this.a) {
            case 0:
                GridLayoutManager u = y7e.u(recyclerView);
                if (u != null && (S0 = u.S0()) != -1) {
                    ((Function1) this.c).invoke((lz7) CollectionsKt.getOrNull(((ov) ((pae) this.b).o).f, S0));
                    return;
                }
                return;
            default:
                ok8 ok8 = (ok8) this.c;
                View view = (View) ok8.x0.c;
                if (view != null) {
                    float translationY = view.getTranslationY();
                    Toolbar toolbar = ok8.L0;
                    Rect rect = rcg.a;
                    rcg.d(rect, toolbar);
                    if (translationY > ((float) rect.bottom)) {
                        return;
                    }
                }
                int height = ok8.L0.getHeight() + (-recyclerView.computeVerticalScrollOffset());
                ok8.S0.s(ok8.K0.getHeight() + height, false, false);
                return;
        }
    }

    public yx1(pae pae, Function1 function1) {
        this.b = pae;
        this.c = function1;
    }
}
