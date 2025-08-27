package ru.ok.tamtam.messages.scheduled;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ok/tamtam/messages/scheduled/SliderLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "yde", "scheduled-send-picker-dialog_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSliderLayoutManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SliderLayoutManager.kt\nru/ok/tamtam/messages/scheduled/SliderLayoutManager\n+ 2 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 ThemeHelper.kt\nru/ok/tamtam/themes/ThemeHelper\n*L\n1#1,163:1\n63#2:164\n66#2,3:165\n66#2,3:168\n60#2:171\n105#2:172\n1863#3,2:173\n1863#3,2:178\n49#4,2:175\n45#4:177\n*S KotlinDebug\n*F\n+ 1 SliderLayoutManager.kt\nru/ok/tamtam/messages/scheduled/SliderLayoutManager\n*L\n25#1:164\n26#1:165,3\n27#1:168,3\n28#1:171\n28#1:172\n70#1:173,2\n103#1:178,2\n93#1:175,2\n93#1:177\n*E\n"})
public final class SliderLayoutManager extends LinearLayoutManager {
    public final yde E;
    public RecyclerView F;
    public final int G;
    public final float H;
    public final float I;
    public final int J;
    public final w74 K = new hfe();

    /* JADX WARNING: type inference failed for: r4v4, types: [w74, hfe] */
    public SliderLayoutManager(Context context, yde yde) {
        this.E = yde;
        this.G = context.getResources().getInteger(cjc.picker_min_distance);
        int i = aec.picker_scale_factor;
        TypedValue typedValue = new TypedValue();
        context.getResources().getValue(i, typedValue, true);
        this.H = typedValue.getFloat();
        int i2 = aec.picker_min_scale_factor;
        TypedValue typedValue2 = new TypedValue();
        context.getResources().getValue(i2, typedValue2, true);
        this.I = typedValue2.getFloat();
        this.J = context.getResources().getDimensionPixelSize(aec.date_picker_selection_rect_offset) * 2;
        n1(1);
    }

    public final void W(RecyclerView recyclerView) {
        this.F = recyclerView;
        this.K.a(recyclerView);
    }

    public final void j0(hzc hzc, lzc lzc) {
        super.j0(hzc, lzc);
        s1();
    }

    public final void n0(int i) {
        int T;
        RecyclerView recyclerView = this.F;
        if (recyclerView != null && i == 0) {
            int height = recyclerView.getHeight();
            int height2 = recyclerView.getHeight() / 2;
            Iterator it = RangesKt.until(0, recyclerView.getChildCount()).iterator();
            int i2 = -1;
            while (it.hasNext()) {
                int nextInt = ((IntIterator) it).nextInt();
                View childAt = recyclerView.getChildAt(nextInt);
                int abs = Math.abs((((a.z(childAt) - a.F(childAt)) / 2) + a.F(childAt)) - height2);
                if (nextInt != recyclerView.getChildCount() - 1) {
                    if (abs < height) {
                        T = RecyclerView.T(childAt);
                    }
                } else if (abs <= height) {
                    T = RecyclerView.T(childAt);
                }
                i2 = T;
                height = abs;
            }
            yde yde = this.E;
            if (yde != null) {
                yde.a(i2);
            }
        }
    }

    public final void s1() {
        scf scf;
        RecyclerView recyclerView = this.F;
        if (recyclerView != null) {
            if (recyclerView.isInEditMode()) {
                scf = vi4.f0;
            } else {
                Context context = recyclerView.getContext();
                Lazy lazy = scf.b0;
                scf = j4b.k0(context);
            }
            float f = (((float) this.J) * 1.05f) / 2.0f;
            float f2 = (float) (this.o / 2);
            float f3 = f2 - f;
            float f4 = f + f2;
            HashSet hashSet = new HashSet();
            Iterator it = RangesKt.until(0, w()).iterator();
            while (it.hasNext()) {
                View v = v(((IntIterator) it).nextInt());
                AppCompatTextView appCompatTextView = v instanceof AppCompatTextView ? (AppCompatTextView) v : null;
                if (appCompatTextView != null) {
                    float height = (((float) appCompatTextView.getHeight()) / 2.0f) + appCompatTextView.getY();
                    if (!hashSet.contains(appCompatTextView.getText()) && ((float) appCompatTextView.getTop()) >= f3 && ((float) appCompatTextView.getBottom()) <= f4) {
                        hashSet.add(appCompatTextView.getText());
                        b0h.K(appCompatTextView, pw6.CLOCK_TICK);
                    }
                    float abs = Math.abs(height - f2);
                    boolean z = abs <= ((float) this.G);
                    float sqrt = z ? 1.0f : ((float) 1) - (((float) Math.sqrt((double) (abs / ((float) this.o)))) * this.H);
                    float f5 = this.I;
                    if (sqrt < f5) {
                        sqrt = f5;
                    }
                    appCompatTextView.setScaleX(sqrt);
                    appCompatTextView.setScaleY(sqrt);
                    appCompatTextView.setTextColor(z ? scf.G : scf.N);
                }
            }
        }
    }

    public final int y0(int i, hzc hzc, lzc lzc) {
        if (this.p != 1) {
            return 0;
        }
        int y0 = super.y0(i, hzc, lzc);
        if (y0 != 0) {
            s1();
        }
        return y0;
    }
}
