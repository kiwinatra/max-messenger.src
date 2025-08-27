package ru.ok.messages.actions;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import kotlin.Lazy;

public class ExtraActionsView<Action> extends nrb implements mf5 {
    public static final /* synthetic */ int x0 = 0;
    public d9d v0;
    public final RecyclerView w0;
    public final ro4 x = ro4.b();
    public c73 y;
    public yk6 z;

    public ExtraActionsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        getContext();
        this.v = false;
        RecyclerView recyclerView = new RecyclerView(getContext(), (AttributeSet) null);
        this.w0 = recyclerView;
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        c();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wnc.ExtraActionsView);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(wnc.ExtraActionsView_topAndBottomSpacing, 0);
            if (dimensionPixelSize > 0) {
                recyclerView.j(new w51(dimensionPixelSize, 6));
            }
            obtainStyledAttributes.recycle();
        }
        addView(recyclerView, new FrameLayout.LayoutParams(-1, -2));
        setCallback(new hk3(this, 1));
    }

    public final void c() {
        float[] fArr;
        int i = this.x.d;
        if (this.v) {
            float f = (float) i;
            fArr = new float[]{f, f, f, f, 0.0f, 0.0f, 0.0f, 0.0f};
        } else {
            float f2 = (float) i;
            fArr = new float[]{0.0f, 0.0f, 0.0f, 0.0f, f2, f2, f2, f2};
        }
        Context context = getContext();
        Lazy lazy = scf.b0;
        this.w0.setBackground(i8b.P(Integer.valueOf(j4b.k0(context).n), (Integer) null, (Integer) null, fArr));
    }

    public void r(lf5 lf5) {
        yk6 yk6 = this.z;
        yk6.getClass();
        Object obj = lf5.c;
        if (obj != null) {
            yk6.a.invoke((pm6) obj);
        }
        if (this.w == null) {
            l((Runnable) null, true);
        }
    }

    public final void s() {
        c73 c73 = this.y;
        Iterable<pm6> iterable = this.z.b;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
        for (pm6 lf5 : iterable) {
            arrayList.add(new lf5(lf5));
        }
        c73.G(arrayList);
    }

    public void setStackFromBottom(boolean z2) {
        super.setStackFromBottom(z2);
        c();
    }

    public boolean t() {
        if (!(this.w == null)) {
            return false;
        }
        setVisibility(0);
        setHalfScreen((grb) new arb(this, 1));
        return true;
    }
}
