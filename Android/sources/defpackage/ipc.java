package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.math.MathKt;

/* renamed from: ipc  reason: default package */
public final class ipc extends LinearLayout {
    public gpc a;
    public int b;
    public List c;

    private final void setDataList(List<hpc> list) {
        int size = list.size();
        int i = this.b;
        if (size > i) {
            this.c = CollectionsKt.take(list, i);
            a();
            String name = ipc.class.getName();
            int size2 = list.size();
            z68.f(name, "Buttons count out of limit. Size -> " + size2, (Throwable) null);
            return;
        }
        this.c = list;
        a();
    }

    private final void setMaxButtonsCount(int i) {
        if (i >= 1) {
            this.b = i;
            requestLayout();
        }
    }

    public final void a() {
        int i;
        if (getChildCount() < this.c.size()) {
            int size = this.c.size() - getChildCount();
            for (int i2 = 0; i2 < size; i2++) {
                fpc fpc = new fpc(getContext());
                fpc.setId(View.generateViewId());
                addView(fpc);
            }
        }
        int i3 = 0;
        while (true) {
            if (i3 < getChildCount()) {
                int i4 = i3 + 1;
                View childAt = getChildAt(i3);
                if (childAt != null) {
                    childAt.setVisibility(8);
                    i3 = i4;
                } else {
                    throw new IndexOutOfBoundsException();
                }
            } else {
                int i5 = 0;
                for (Object next : this.c) {
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    hpc hpc = (hpc) next;
                    fpc fpc2 = (fpc) getChildAt(i5);
                    fpc2.setId(hpc.a);
                    fpc2.setVisibility(0);
                    epc epc = hpc.b;
                    fpc2.setSize(epc);
                    fpc2.setEnabled(hpc.d);
                    fpc2.setText(hpc.c);
                    ct.G(fpc2, 300, new h24(29, (Object) this, (Object) hpc));
                    ViewGroup.LayoutParams layoutParams = fpc2.getLayoutParams();
                    if (layoutParams != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        if (i5 != 0) {
                            int ordinal = epc.ordinal();
                            if (ordinal == 0) {
                                i = MathKt.roundToInt(((float) 40) * vo4.c().getDisplayMetrics().density);
                            } else if (ordinal == 1) {
                                i = MathKt.roundToInt(((float) 24) * vo4.c().getDisplayMetrics().density);
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                            marginLayoutParams.setMarginStart(i);
                            fpc2.setLayoutParams(marginLayoutParams);
                        }
                        i5 = i6;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                }
                return;
            }
        }
    }

    public final void setButtonToolDataList(List<hpc> list) {
        setDataList(list);
    }

    public final void setListener(gpc gpc) {
        this.a = gpc;
    }
}
