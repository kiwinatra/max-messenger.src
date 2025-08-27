package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.coroutines.Continuation;
import kotlin.math.MathKt;

/* renamed from: urc  reason: default package */
public final class urc {
    public final Context a;
    public trc b;
    public final lue c;
    public final RecyclerView d;

    public urc(Context context, ExecutorService executorService) {
        this.a = context;
        lue lue = new lue(executorService, new zqc(context), new jkb(12, (Object) this), new ifb(12, this));
        this.c = lue;
        n04 n04 = new n04(vo4.c().getDisplayMetrics().density * 24.0f);
        RecyclerView recyclerView = new RecyclerView(context, (AttributeSet) null);
        recyclerView.setId(kic.one_chat_react_panel_layout);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new GridLayoutManager(8));
        recyclerView.j(new iz5(MathKt.roundToInt(((float) (ld8.f0(context) >= 360 ? 10 : 8)) * vo4.c().getDisplayMetrics().density), new t68(2, this)));
        recyclerView.setOutlineProvider(n04);
        recyclerView.setVisibility(0);
        recyclerView.setAdapter(lue);
        recyclerView.setOverScrollMode(2);
        recyclerView.setItemAnimator((yyc) null);
        recyclerView.setClipToPadding(false);
        recyclerView.setClipChildren(false);
        recyclerView.setClipToOutline(false);
        float f = (float) 8;
        float f2 = (float) 12;
        recyclerView.setPadding(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density));
        b0h.H(recyclerView, new qrb((Object) this, (Continuation) null, 3));
        this.d = recyclerView;
    }

    public final void a(int i, List list) {
        if (list.size() > 8) {
            RecyclerView recyclerView = this.d;
            ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
            if (layoutParams != null) {
                int roundToInt = MathKt.roundToInt(((float) 240) * vo4.c().getDisplayMetrics().density);
                if (i > 0) {
                    roundToInt = Math.min(roundToInt, i);
                }
                layoutParams.height = roundToInt;
                recyclerView.setLayoutParams(layoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        this.c.H(list, new o99(24, this));
    }
}
