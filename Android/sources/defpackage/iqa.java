package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.math.MathKt;

/* renamed from: iqa  reason: default package */
public final class iqa extends LinearLayout {
    public hqa a;
    public int b = 5;
    public int c = MathKt.roundToInt(((float) 4) * vo4.c().getDisplayMetrics().density);
    public k2b o;
    public List v;

    public iqa(Context context) {
        super(context, (AttributeSet) null);
        setOrientation(0);
        this.v = CollectionsKt.emptyList();
    }

    private final void setDataList(List<gqa> list) {
        int size = list.size();
        int i = this.b;
        if (size > i) {
            this.v = CollectionsKt.take(list, i);
            b();
            String name = iqa.class.getName();
            int size2 = list.size();
            z68.f(name, "Buttons count out of limit. Size -> " + size2, (Throwable) null);
            return;
        }
        this.v = list;
        b();
    }

    public final void a(List list) {
        this.o = l2b.a;
        setDataList(list);
    }

    public final void b() {
        if (getChildCount() < this.v.size()) {
            int size = this.v.size() - getChildCount();
            for (int i = 0; i < size; i++) {
                fqa fqa = new fqa(getContext());
                fqa.setId(View.generateViewId());
                fqa.setCustomTheme(this.o);
                fqa.setLayoutParams(new LinearLayout.LayoutParams(MathKt.roundToInt(((float) 0) * vo4.c().getDisplayMetrics().density), -2));
                addView(fqa);
            }
        }
        setWeightSum((float) this.v.size());
        int i2 = 0;
        while (true) {
            if (i2 < getChildCount()) {
                int i3 = i2 + 1;
                View childAt = getChildAt(i2);
                if (childAt != null) {
                    childAt.setVisibility(8);
                    i2 = i3;
                } else {
                    throw new IndexOutOfBoundsException();
                }
            } else {
                int i4 = 0;
                for (Object next : this.v) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    gqa gqa = (gqa) next;
                    fqa fqa2 = (fqa) getChildAt(i4);
                    fqa2.setId(gqa.a);
                    fqa2.setVisibility(0);
                    fqa2.setMode(gqa.b);
                    fqa2.setAppearance(gqa.c);
                    fqa2.setEnabled(gqa.h);
                    Integer num = gqa.f;
                    if (num != null) {
                        fqa2.setText(num.intValue());
                    } else {
                        fqa2.setText(gqa.d);
                    }
                    Integer num2 = gqa.g;
                    if (num2 != null) {
                        fqa2.setIcon(num2.intValue());
                    } else {
                        fqa2.setIcon(gqa.e);
                    }
                    ct.G(fqa2, 300, new u99(10, (Object) this));
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) fqa2.getLayoutParams();
                    layoutParams.weight = 1.0f;
                    layoutParams.setMarginStart(i4 == 0 ? 0 : this.c);
                    layoutParams.setMarginEnd(i4 == this.v.size() - 1 ? 0 : this.c);
                    fqa2.setLayoutParams(layoutParams);
                    i4 = i5;
                }
                return;
            }
        }
    }

    public final int getMaxButtonsCount() {
        return this.b;
    }

    public final int getSpace() {
        return this.c;
    }

    public final void setButtonToolDataList(List<gqa> list) {
        setDataList(list);
    }

    public final void setListener(hqa hqa) {
        this.a = hqa;
    }

    public final void setMaxButtonsCount(int i) {
        if (i >= 1) {
            this.b = i;
            requestLayout();
        }
    }

    public final void setSpace(int i) {
        this.c = i;
    }
}
