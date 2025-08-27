package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.math.MathKt;

/* renamed from: wte  reason: default package */
public final class wte extends ViewGroup implements phf {
    public final yte a;
    public final RecyclerView b;

    public wte(Context context) {
        super(context, (AttributeSet) null);
        yte yte = new yte(context);
        this.a = yte;
        RecyclerView recyclerView = new RecyclerView(context, (AttributeSet) null);
        recyclerView.setId(fza.f);
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setOverScrollMode(2);
        int roundToInt = MathKt.roundToInt(((float) 4) * vo4.c().getDisplayMetrics().density);
        MathKt.roundToInt(((float) 12) * vo4.c().getDisplayMetrics().density);
        recyclerView.j(new cl2(roundToInt, roundToInt, 5));
        recyclerView.setHasFixedSize(true);
        this.b = recyclerView;
        setClipChildren(false);
        addView(yte);
        addView(recyclerView);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        yte yte = this.a;
        yte yte2 = this.a;
        ct.A(paddingStart, paddingTop, yte.getMeasuredWidth() + paddingStart, yte2.getMeasuredHeight() + paddingTop, yte, this);
        RecyclerView recyclerView = this.b;
        ct.A(0, yte2.getBottom(), getMeasuredWidth(), recyclerView.getMeasuredHeight() + yte2.getBottom(), recyclerView, this);
    }

    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        yte yte = this.a;
        yte.measure(i, i2);
        RecyclerView recyclerView = this.b;
        recyclerView.measure(i, i2);
        setMeasuredDimension(size, recyclerView.getMeasuredHeight() + yte.getMeasuredHeight());
    }

    public final void onThemeChanged(k2b k2b) {
        this.a.onThemeChanged(k2b);
    }

    public final void setHeaderClickAction(Function0<Unit> function0) {
        ct.G(this.a.getHeaderButton(), 300, new e7(27, function0));
    }
}
