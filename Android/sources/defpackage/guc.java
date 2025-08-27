package defpackage;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.math.MathKt;

/* renamed from: guc  reason: default package */
public final class guc extends RecyclerView {
    public final t56 T1;
    public final GradientDrawable U1;

    public guc(Context context, gu2 gu2) {
        super(context, (AttributeSet) null);
        t56 t56 = new t56((Object) gu2, sjd.a.t().a(), 22);
        this.T1 = t56;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setSize(MathKt.roundToInt(((float) 1) * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(((double) vo4.c().getDisplayMetrics().density) * 0.5d));
        this.U1 = gradientDrawable;
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setLayoutManager(new LinearLayoutManager(0, false));
        setAdapter(t56);
        setItemAnimator((yyc) null);
        j(new fr(7));
        ar4 ar4 = new ar4(context);
        ar4.c = gradientDrawable;
        j(ar4);
        b0h.H(this, new qrb(3, (Continuation) null, 4));
    }

    public final void setContacts(List<cuc> list) {
        this.T1.G(list);
    }
}
