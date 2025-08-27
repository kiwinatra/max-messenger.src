package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.IntCompanionObject;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR$\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b8B@BX\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Landroidx/appcompat/widget/TamButtonBarLayout;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "allowStacking", "", "setAllowStacking", "(Z)V", "stacked", "isStacked", "()Z", "setStacked", "material-dialogs_release"}, k = 1, mv = {2, 0, 0})
public final class TamButtonBarLayout extends LinearLayout {
    public boolean a;
    public boolean b;
    public int c = -1;

    public TamButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, koc.ButtonBarLayout);
        int[] iArr = koc.ButtonBarLayout;
        WeakHashMap weakHashMap = gag.a;
        bag.d(this, context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        this.a = obtainStyledAttributes.getBoolean(koc.ButtonBarLayout_allowStacking, true);
        obtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.a);
        }
    }

    private final void setStacked(boolean z) {
        if (this.b == z) {
            return;
        }
        if (!z || this.a) {
            this.b = z;
            setOrientation(z ? 1 : 0);
            setGravity(z ? 8388613 : 80);
            View findViewById = findViewById(egc.spacer);
            if (findViewById != null) {
                findViewById.setVisibility(z ? 8 : 4);
            }
            for (int childCount = getChildCount() - 2; -1 < childCount; childCount--) {
                bringChildToFront(getChildAt(childCount));
            }
        }
    }

    public final void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        int i4;
        int paddingBottom;
        int size = View.MeasureSpec.getSize(i);
        int i5 = 0;
        if (this.a) {
            if (size > this.c && this.b) {
                setStacked(false);
            }
            this.c = size;
        }
        if (this.b || View.MeasureSpec.getMode(i) != 1073741824) {
            i3 = i;
            z = false;
        } else {
            i3 = View.MeasureSpec.makeMeasureSpec(size, IntCompanionObject.MIN_VALUE);
            z = true;
        }
        super.onMeasure(i3, i2);
        if (this.a && !this.b && (getMeasuredWidthAndState() & -16777216) == 16777216) {
            setStacked(true);
            z = true;
        }
        if (z) {
            super.onMeasure(i, i2);
        }
        int childCount = getChildCount();
        int i6 = 0;
        while (true) {
            i4 = -1;
            if (i6 >= childCount) {
                i6 = -1;
                break;
            } else if (getChildAt(i6).getVisibility() == 0) {
                break;
            } else {
                i6++;
            }
        }
        if (i6 >= 0) {
            View childAt = getChildAt(i6);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            i5 = layoutParams.bottomMargin + childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin;
            if (this.b) {
                int i7 = i6 + 1;
                int childCount2 = getChildCount();
                while (true) {
                    if (i7 >= childCount2) {
                        break;
                    } else if (getChildAt(i7).getVisibility() == 0) {
                        i4 = i7;
                        break;
                    } else {
                        i7++;
                    }
                }
                if (i4 >= 0) {
                    paddingBottom = getChildAt(i4).getPaddingTop() + ((int) (((float) 16) * getResources().getDisplayMetrics().density));
                }
            } else {
                paddingBottom = getPaddingBottom();
            }
            i5 += paddingBottom;
        }
        WeakHashMap weakHashMap = gag.a;
        if (getMinimumHeight() != i5) {
            setMinimumHeight(i5);
            if (i2 == 0) {
                super.onMeasure(i, i2);
            }
        }
    }

    public final void setAllowStacking(boolean z) {
        if (this.a != z) {
            this.a = z;
            if (!z && this.b) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
