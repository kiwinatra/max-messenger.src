package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import java.util.WeakHashMap;

/* renamed from: yv7  reason: default package */
public abstract class yv7 extends ViewGroup {
    private static final String ACCESSIBILITY_CLASS_NAME = "androidx.appcompat.widget.LinearLayoutCompat";
    public static final int HORIZONTAL = 0;
    private static final int INDEX_BOTTOM = 2;
    private static final int INDEX_CENTER_VERTICAL = 0;
    private static final int INDEX_FILL = 3;
    private static final int INDEX_TOP = 1;
    public static final int SHOW_DIVIDER_BEGINNING = 1;
    public static final int SHOW_DIVIDER_END = 4;
    public static final int SHOW_DIVIDER_MIDDLE = 2;
    public static final int SHOW_DIVIDER_NONE = 0;
    public static final int VERTICAL = 1;
    private static final int VERTICAL_GRAVITY_COUNT = 4;
    private boolean mBaselineAligned = true;
    private int mBaselineAlignedChildIndex = -1;
    private int mBaselineChildTop = 0;
    private Drawable mDivider;
    private int mDividerHeight;
    private int mDividerPadding;
    private int mDividerWidth;
    private int mGravity = 8388659;
    private int[] mMaxAscent;
    private int[] mMaxDescent;
    private int mOrientation;
    private int mShowDividers;
    private int mTotalLength;
    private boolean mUseLargestChild;
    private float mWeightSum;

    public yv7(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        g6d w = g6d.w(context, attributeSet, koc.LinearLayoutCompat, i, 0);
        int[] iArr = koc.LinearLayoutCompat;
        WeakHashMap weakHashMap = gag.a;
        bag.d(this, context, iArr, attributeSet, (TypedArray) w.c, i, 0);
        int i2 = koc.LinearLayoutCompat_android_orientation;
        TypedArray typedArray = (TypedArray) w.c;
        int i3 = typedArray.getInt(i2, -1);
        if (i3 >= 0) {
            setOrientation(i3);
        }
        int i4 = typedArray.getInt(koc.LinearLayoutCompat_android_gravity, -1);
        if (i4 >= 0) {
            setGravity(i4);
        }
        boolean z = typedArray.getBoolean(koc.LinearLayoutCompat_android_baselineAligned, true);
        if (!z) {
            setBaselineAligned(z);
        }
        this.mWeightSum = typedArray.getFloat(koc.LinearLayoutCompat_android_weightSum, -1.0f);
        this.mBaselineAlignedChildIndex = typedArray.getInt(koc.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
        this.mUseLargestChild = typedArray.getBoolean(koc.LinearLayoutCompat_measureWithLargestChild, false);
        setDividerDrawable(w.q(koc.LinearLayoutCompat_divider));
        this.mShowDividers = typedArray.getInt(koc.LinearLayoutCompat_showDividers, 0);
        this.mDividerPadding = typedArray.getDimensionPixelSize(koc.LinearLayoutCompat_dividerPadding, 0);
        w.x();
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof xv7;
    }

    public void drawDividersHorizontal(Canvas canvas) {
        int i;
        int left;
        int i2;
        int virtualChildCount = getVirtualChildCount();
        boolean z = getLayoutDirection() == 1;
        for (int i3 = 0; i3 < virtualChildCount; i3++) {
            View virtualChildAt = getVirtualChildAt(i3);
            if (!(virtualChildAt == null || virtualChildAt.getVisibility() == 8 || !hasDividerBeforeChildAt(i3))) {
                xv7 xv7 = (xv7) virtualChildAt.getLayoutParams();
                drawVerticalDivider(canvas, z ? virtualChildAt.getRight() + xv7.rightMargin : (virtualChildAt.getLeft() - xv7.leftMargin) - this.mDividerWidth);
            }
        }
        if (hasDividerBeforeChildAt(virtualChildCount)) {
            View virtualChildAt2 = getVirtualChildAt(virtualChildCount - 1);
            if (virtualChildAt2 != null) {
                xv7 xv72 = (xv7) virtualChildAt2.getLayoutParams();
                if (z) {
                    left = virtualChildAt2.getLeft() - xv72.leftMargin;
                    i2 = this.mDividerWidth;
                } else {
                    i = virtualChildAt2.getRight() + xv72.rightMargin;
                    drawVerticalDivider(canvas, i);
                }
            } else if (z) {
                i = getPaddingLeft();
                drawVerticalDivider(canvas, i);
            } else {
                left = getWidth() - getPaddingRight();
                i2 = this.mDividerWidth;
            }
            i = left - i2;
            drawVerticalDivider(canvas, i);
        }
    }

    public void drawDividersVertical(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        for (int i = 0; i < virtualChildCount; i++) {
            View virtualChildAt = getVirtualChildAt(i);
            if (!(virtualChildAt == null || virtualChildAt.getVisibility() == 8 || !hasDividerBeforeChildAt(i))) {
                drawHorizontalDivider(canvas, (virtualChildAt.getTop() - ((xv7) virtualChildAt.getLayoutParams()).topMargin) - this.mDividerHeight);
            }
        }
        if (hasDividerBeforeChildAt(virtualChildCount)) {
            View virtualChildAt2 = getVirtualChildAt(virtualChildCount - 1);
            drawHorizontalDivider(canvas, virtualChildAt2 == null ? (getHeight() - getPaddingBottom()) - this.mDividerHeight : virtualChildAt2.getBottom() + ((xv7) virtualChildAt2.getLayoutParams()).bottomMargin);
        }
    }

    public void drawHorizontalDivider(Canvas canvas, int i) {
        this.mDivider.setBounds(getPaddingLeft() + this.mDividerPadding, i, (getWidth() - getPaddingRight()) - this.mDividerPadding, this.mDividerHeight + i);
        this.mDivider.draw(canvas);
    }

    public void drawVerticalDivider(Canvas canvas, int i) {
        this.mDivider.setBounds(i, getPaddingTop() + this.mDividerPadding, this.mDividerWidth + i, (getHeight() - getPaddingBottom()) - this.mDividerPadding);
        this.mDivider.draw(canvas);
    }

    public int getBaseline() {
        int i;
        if (this.mBaselineAlignedChildIndex < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.mBaselineAlignedChildIndex;
        if (childCount > i2) {
            View childAt = getChildAt(i2);
            int baseline = childAt.getBaseline();
            if (baseline != -1) {
                int i3 = this.mBaselineChildTop;
                if (this.mOrientation == 1 && (i = this.mGravity & 112) != 48) {
                    if (i == 16) {
                        i3 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.mTotalLength) / 2;
                    } else if (i == 80) {
                        i3 = ((getBottom() - getTop()) - getPaddingBottom()) - this.mTotalLength;
                    }
                }
                return i3 + ((xv7) childAt.getLayoutParams()).topMargin + baseline;
            } else if (this.mBaselineAlignedChildIndex == 0) {
                return -1;
            } else {
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
        } else {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
    }

    public int getBaselineAlignedChildIndex() {
        return this.mBaselineAlignedChildIndex;
    }

    public int getChildrenSkipCount(View view, int i) {
        return 0;
    }

    public Drawable getDividerDrawable() {
        return this.mDivider;
    }

    public int getDividerPadding() {
        return this.mDividerPadding;
    }

    public int getDividerWidth() {
        return this.mDividerWidth;
    }

    public int getGravity() {
        return this.mGravity;
    }

    public int getLocationOffset(View view) {
        return 0;
    }

    public int getNextLocationOffset(View view) {
        return 0;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public int getShowDividers() {
        return this.mShowDividers;
    }

    public View getVirtualChildAt(int i) {
        return getChildAt(i);
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.mWeightSum;
    }

    public boolean hasDividerBeforeChildAt(int i) {
        if (i == 0) {
            return (this.mShowDividers & 1) != 0;
        }
        if (i == getChildCount()) {
            return (this.mShowDividers & 4) != 0;
        }
        if ((this.mShowDividers & 2) == 0) {
            return false;
        }
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (getChildAt(i2).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    public boolean isBaselineAligned() {
        return this.mBaselineAligned;
    }

    public boolean isMeasureWithLargestChildEnabled() {
        return this.mUseLargestChild;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0101  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void layoutHorizontal(int r23, int r24, int r25, int r26) {
        /*
            r22 = this;
            r0 = r22
            int r1 = r22.getLayoutDirection()
            r2 = 0
            r3 = 1
            if (r1 != r3) goto L_0x000c
            r1 = r3
            goto L_0x000d
        L_0x000c:
            r1 = r2
        L_0x000d:
            int r4 = r22.getPaddingTop()
            int r5 = r26 - r24
            int r6 = r22.getPaddingBottom()
            int r6 = r5 - r6
            int r5 = r5 - r4
            int r7 = r22.getPaddingBottom()
            int r5 = r5 - r7
            int r7 = r22.getVirtualChildCount()
            int r8 = r0.mGravity
            r9 = 8388615(0x800007, float:1.1754953E-38)
            r9 = r9 & r8
            r8 = r8 & 112(0x70, float:1.57E-43)
            boolean r10 = r0.mBaselineAligned
            int[] r11 = r0.mMaxAscent
            int[] r12 = r0.mMaxDescent
            int r13 = r22.getLayoutDirection()
            int r9 = android.view.Gravity.getAbsoluteGravity(r9, r13)
            r13 = 2
            if (r9 == r3) goto L_0x0050
            r14 = 5
            if (r9 == r14) goto L_0x0044
            int r9 = r22.getPaddingLeft()
            goto L_0x005b
        L_0x0044:
            int r9 = r22.getPaddingLeft()
            int r9 = r9 + r25
            int r9 = r9 - r23
            int r14 = r0.mTotalLength
            int r9 = r9 - r14
            goto L_0x005b
        L_0x0050:
            int r9 = r22.getPaddingLeft()
            int r14 = r25 - r23
            int r15 = r0.mTotalLength
            int r14 = r14 - r15
            int r14 = r14 / r13
            int r9 = r9 + r14
        L_0x005b:
            if (r1 == 0) goto L_0x0061
            int r1 = r7 + -1
            r15 = -1
            goto L_0x0063
        L_0x0061:
            r1 = r2
            r15 = r3
        L_0x0063:
            if (r2 >= r7) goto L_0x0132
            int r16 = r15 * r2
            int r3 = r16 + r1
            android.view.View r13 = r0.getVirtualChildAt(r3)
            if (r13 != 0) goto L_0x0082
            int r3 = r0.measureNullChild(r3)
            int r3 = r3 + r9
            r25 = r1
            r9 = r3
        L_0x0077:
            r26 = r7
            r16 = r8
            r18 = r10
            r19 = r15
        L_0x007f:
            r1 = 1
            goto L_0x0123
        L_0x0082:
            int r14 = r13.getVisibility()
            r25 = r1
            r1 = 8
            if (r14 == r1) goto L_0x0077
            int r1 = r13.getMeasuredWidth()
            int r14 = r13.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r16 = r13.getLayoutParams()
            r26 = r7
            r7 = r16
            xv7 r7 = (defpackage.xv7) r7
            r16 = r8
            if (r10 == 0) goto L_0x00ae
            int r8 = r7.height
            r18 = r10
            r10 = -1
            if (r8 == r10) goto L_0x00b0
            int r10 = r13.getBaseline()
            goto L_0x00b1
        L_0x00ae:
            r18 = r10
        L_0x00b0:
            r10 = -1
        L_0x00b1:
            int r8 = r7.gravity
            if (r8 >= 0) goto L_0x00b7
            r8 = r16
        L_0x00b7:
            r8 = r8 & 112(0x70, float:1.57E-43)
            r19 = r15
            r15 = 16
            if (r8 == r15) goto L_0x00ef
            r15 = 48
            if (r8 == r15) goto L_0x00e0
            r15 = 80
            if (r8 == r15) goto L_0x00ca
            r8 = r4
            r15 = -1
            goto L_0x00fb
        L_0x00ca:
            int r8 = r6 - r14
            int r15 = r7.bottomMargin
            int r8 = r8 - r15
            r15 = -1
            if (r10 == r15) goto L_0x00fb
            int r20 = r13.getMeasuredHeight()
            int r20 = r20 - r10
            r10 = 2
            r21 = r12[r10]
            int r21 = r21 - r20
            int r8 = r8 - r21
            goto L_0x00fb
        L_0x00e0:
            r15 = -1
            int r8 = r7.topMargin
            int r8 = r8 + r4
            if (r10 == r15) goto L_0x00fb
            r17 = 1
            r20 = r11[r17]
            int r20 = r20 - r10
            int r8 = r20 + r8
            goto L_0x00fb
        L_0x00ef:
            r15 = -1
            int r8 = r5 - r14
            r10 = 2
            int r8 = r8 / r10
            int r8 = r8 + r4
            int r10 = r7.topMargin
            int r8 = r8 + r10
            int r10 = r7.bottomMargin
            int r8 = r8 - r10
        L_0x00fb:
            boolean r10 = r0.hasDividerBeforeChildAt(r3)
            if (r10 == 0) goto L_0x0104
            int r10 = r0.mDividerWidth
            int r9 = r9 + r10
        L_0x0104:
            int r10 = r7.leftMargin
            int r9 = r9 + r10
            int r10 = r0.getLocationOffset(r13)
            int r10 = r10 + r9
            int r15 = r10 + r1
            int r14 = r14 + r8
            r13.layout(r10, r8, r15, r14)
            int r7 = r7.rightMargin
            int r1 = r1 + r7
            int r7 = r0.getNextLocationOffset(r13)
            int r7 = r7 + r1
            int r7 = r7 + r9
            int r1 = r0.getChildrenSkipCount(r13, r3)
            int r2 = r2 + r1
            r9 = r7
            goto L_0x007f
        L_0x0123:
            int r2 = r2 + r1
            r7 = r26
            r3 = r1
            r8 = r16
            r10 = r18
            r15 = r19
            r13 = 2
            r1 = r25
            goto L_0x0063
        L_0x0132:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yv7.layoutHorizontal(int, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0097  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void layoutVertical(int r12, int r13, int r14, int r15) {
        /*
            r11 = this;
            int r0 = r11.getPaddingLeft()
            int r14 = r14 - r12
            int r12 = r11.getPaddingRight()
            int r12 = r14 - r12
            int r14 = r14 - r0
            int r1 = r11.getPaddingRight()
            int r14 = r14 - r1
            int r1 = r11.getVirtualChildCount()
            int r2 = r11.mGravity
            r3 = r2 & 112(0x70, float:1.57E-43)
            r4 = 8388615(0x800007, float:1.1754953E-38)
            r2 = r2 & r4
            r4 = 16
            if (r3 == r4) goto L_0x0035
            r4 = 80
            if (r3 == r4) goto L_0x002a
            int r13 = r11.getPaddingTop()
            goto L_0x0041
        L_0x002a:
            int r3 = r11.getPaddingTop()
            int r3 = r3 + r15
            int r3 = r3 - r13
            int r13 = r11.mTotalLength
            int r13 = r3 - r13
            goto L_0x0041
        L_0x0035:
            int r3 = r11.getPaddingTop()
            int r15 = r15 - r13
            int r13 = r11.mTotalLength
            int r15 = r15 - r13
            int r15 = r15 / 2
            int r13 = r15 + r3
        L_0x0041:
            r15 = 0
        L_0x0042:
            if (r15 >= r1) goto L_0x00b9
            android.view.View r3 = r11.getVirtualChildAt(r15)
            r4 = 1
            if (r3 != 0) goto L_0x0052
            int r3 = r11.measureNullChild(r15)
            int r3 = r3 + r13
            r13 = r3
            goto L_0x00b7
        L_0x0052:
            int r5 = r3.getVisibility()
            r6 = 8
            if (r5 == r6) goto L_0x00b7
            int r5 = r3.getMeasuredWidth()
            int r6 = r3.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r7 = r3.getLayoutParams()
            xv7 r7 = (defpackage.xv7) r7
            int r8 = r7.gravity
            if (r8 >= 0) goto L_0x006d
            r8 = r2
        L_0x006d:
            int r9 = r11.getLayoutDirection()
            int r8 = android.view.Gravity.getAbsoluteGravity(r8, r9)
            r8 = r8 & 7
            if (r8 == r4) goto L_0x0086
            r9 = 5
            if (r8 == r9) goto L_0x0080
            int r8 = r7.leftMargin
            int r8 = r8 + r0
            goto L_0x0091
        L_0x0080:
            int r8 = r12 - r5
            int r9 = r7.rightMargin
        L_0x0084:
            int r8 = r8 - r9
            goto L_0x0091
        L_0x0086:
            int r8 = r14 - r5
            int r8 = r8 / 2
            int r8 = r8 + r0
            int r9 = r7.leftMargin
            int r8 = r8 + r9
            int r9 = r7.rightMargin
            goto L_0x0084
        L_0x0091:
            boolean r9 = r11.hasDividerBeforeChildAt(r15)
            if (r9 == 0) goto L_0x009a
            int r9 = r11.mDividerHeight
            int r13 = r13 + r9
        L_0x009a:
            int r9 = r7.topMargin
            int r13 = r13 + r9
            int r9 = r11.getLocationOffset(r3)
            int r9 = r9 + r13
            int r5 = r5 + r8
            int r10 = r9 + r6
            r3.layout(r8, r9, r5, r10)
            int r5 = r7.bottomMargin
            int r6 = r6 + r5
            int r5 = r11.getNextLocationOffset(r3)
            int r5 = r5 + r6
            int r5 = r5 + r13
            int r13 = r11.getChildrenSkipCount(r3, r15)
            int r15 = r15 + r13
            r13 = r5
        L_0x00b7:
            int r15 = r15 + r4
            goto L_0x0042
        L_0x00b9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yv7.layoutVertical(int, int, int, int):void");
    }

    public void measureChildBeforeLayout(View view, int i, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    /* JADX WARNING: Removed duplicated region for block: B:189:0x0466  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x0488  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01a4  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01cd  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01d0  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01e6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void measureHorizontal(int r40, int r41) {
        /*
            r39 = this;
            r7 = r39
            r8 = r41
            r9 = 0
            r7.mTotalLength = r9
            int r10 = r39.getVirtualChildCount()
            int r11 = android.view.View.MeasureSpec.getMode(r40)
            int r12 = android.view.View.MeasureSpec.getMode(r41)
            int[] r0 = r7.mMaxAscent
            r13 = 4
            if (r0 == 0) goto L_0x001c
            int[] r0 = r7.mMaxDescent
            if (r0 != 0) goto L_0x0024
        L_0x001c:
            int[] r0 = new int[r13]
            r7.mMaxAscent = r0
            int[] r0 = new int[r13]
            r7.mMaxDescent = r0
        L_0x0024:
            int[] r14 = r7.mMaxAscent
            int[] r15 = r7.mMaxDescent
            r16 = 3
            r6 = -1
            r14[r16] = r6
            r17 = 2
            r14[r17] = r6
            r18 = 1
            r14[r18] = r6
            r14[r9] = r6
            r15[r16] = r6
            r15[r17] = r6
            r15[r18] = r6
            r15[r9] = r6
            boolean r5 = r7.mBaselineAligned
            boolean r4 = r7.mUseLargestChild
            r3 = 1073741824(0x40000000, float:2.0)
            if (r11 != r3) goto L_0x004a
            r19 = r18
            goto L_0x004c
        L_0x004a:
            r19 = r9
        L_0x004c:
            r20 = 0
            r1 = r9
            r2 = r1
            r13 = r2
            r21 = r13
            r22 = r21
            r23 = r22
            r25 = r23
            r27 = r25
            r26 = r18
            r0 = r20
        L_0x005f:
            r6 = 8
            if (r2 >= r10) goto L_0x020b
            android.view.View r9 = r7.getVirtualChildAt(r2)
            if (r9 != 0) goto L_0x007a
            int r6 = r7.mTotalLength
            int r9 = r7.measureNullChild(r2)
            int r9 = r9 + r6
            r7.mTotalLength = r9
            r37 = r4
            r29 = r5
            r5 = r1
            r1 = r3
            goto L_0x01fd
        L_0x007a:
            int r3 = r9.getVisibility()
            if (r3 != r6) goto L_0x008e
            int r3 = r7.getChildrenSkipCount(r9, r2)
            int r2 = r2 + r3
            r37 = r4
            r29 = r5
            r5 = r1
            r1 = 1073741824(0x40000000, float:2.0)
            goto L_0x01fd
        L_0x008e:
            boolean r3 = r7.hasDividerBeforeChildAt(r2)
            if (r3 == 0) goto L_0x009b
            int r3 = r7.mTotalLength
            int r6 = r7.mDividerWidth
            int r3 = r3 + r6
            r7.mTotalLength = r3
        L_0x009b:
            android.view.ViewGroup$LayoutParams r3 = r9.getLayoutParams()
            r6 = r3
            xv7 r6 = (defpackage.xv7) r6
            float r3 = r6.weight
            float r32 = r0 + r3
            r0 = 1073741824(0x40000000, float:2.0)
            if (r11 != r0) goto L_0x00f9
            int r0 = r6.width
            if (r0 != 0) goto L_0x00f9
            int r0 = (r3 > r20 ? 1 : (r3 == r20 ? 0 : -1))
            if (r0 <= 0) goto L_0x00f9
            if (r19 == 0) goto L_0x00c1
            int r0 = r7.mTotalLength
            int r3 = r6.leftMargin
            r33 = r1
            int r1 = r6.rightMargin
            int r3 = r3 + r1
            int r3 = r3 + r0
            r7.mTotalLength = r3
            goto L_0x00d1
        L_0x00c1:
            r33 = r1
            int r0 = r7.mTotalLength
            int r1 = r6.leftMargin
            int r1 = r1 + r0
            int r3 = r6.rightMargin
            int r1 = r1 + r3
            int r0 = java.lang.Math.max(r0, r1)
            r7.mTotalLength = r0
        L_0x00d1:
            if (r5 == 0) goto L_0x00e8
            r0 = 0
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r0)
            r9.measure(r1, r1)
            r37 = r4
            r29 = r5
            r3 = r6
            r35 = r33
            r28 = -2
            r33 = r2
            goto L_0x0174
        L_0x00e8:
            r37 = r4
            r29 = r5
            r3 = r6
            r23 = r18
            r35 = r33
            r1 = 1073741824(0x40000000, float:2.0)
            r28 = -2
            r33 = r2
            goto L_0x0176
        L_0x00f9:
            r33 = r1
            int r0 = r6.width
            if (r0 != 0) goto L_0x0108
            int r0 = (r3 > r20 ? 1 : (r3 == r20 ? 0 : -1))
            if (r0 <= 0) goto L_0x0108
            r3 = -2
            r6.width = r3
            r1 = 0
            goto L_0x010b
        L_0x0108:
            r3 = -2
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x010b:
            int r0 = (r32 > r20 ? 1 : (r32 == r20 ? 0 : -1))
            if (r0 != 0) goto L_0x0114
            int r0 = r7.mTotalLength
            r29 = r0
            goto L_0x0116
        L_0x0114:
            r29 = 0
        L_0x0116:
            r34 = 0
            r31 = 1073741824(0x40000000, float:2.0)
            r0 = r39
            r36 = r1
            r35 = r33
            r1 = r9
            r33 = r2
            r31 = r3
            r3 = r40
            r37 = r4
            r4 = r29
            r29 = r5
            r5 = r41
            r38 = r6
            r28 = r31
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r34
            r0.measureChildBeforeLayout(r1, r2, r3, r4, r5, r6)
            r0 = r36
            r3 = r38
            if (r0 == r8) goto L_0x0142
            r3.width = r0
        L_0x0142:
            int r0 = r9.getMeasuredWidth()
            if (r19 == 0) goto L_0x0159
            int r1 = r7.mTotalLength
            int r2 = r3.leftMargin
            int r2 = r2 + r0
            int r4 = r3.rightMargin
            int r2 = r2 + r4
            int r4 = r7.getNextLocationOffset(r9)
            int r4 = r4 + r2
            int r4 = r4 + r1
            r7.mTotalLength = r4
            goto L_0x016e
        L_0x0159:
            int r1 = r7.mTotalLength
            int r2 = r1 + r0
            int r4 = r3.leftMargin
            int r2 = r2 + r4
            int r4 = r3.rightMargin
            int r2 = r2 + r4
            int r4 = r7.getNextLocationOffset(r9)
            int r4 = r4 + r2
            int r1 = java.lang.Math.max(r1, r4)
            r7.mTotalLength = r1
        L_0x016e:
            if (r37 == 0) goto L_0x0174
            int r13 = java.lang.Math.max(r0, r13)
        L_0x0174:
            r1 = 1073741824(0x40000000, float:2.0)
        L_0x0176:
            if (r12 == r1) goto L_0x0182
            int r0 = r3.height
            r2 = -1
            if (r0 != r2) goto L_0x0182
            r0 = r18
            r27 = r0
            goto L_0x0183
        L_0x0182:
            r0 = 0
        L_0x0183:
            int r2 = r3.topMargin
            int r4 = r3.bottomMargin
            int r2 = r2 + r4
            int r4 = r9.getMeasuredHeight()
            int r4 = r4 + r2
            int r5 = r9.getMeasuredState()
            r6 = r25
            int r25 = android.view.View.combineMeasuredStates(r6, r5)
            if (r29 == 0) goto L_0x01c0
            int r5 = r9.getBaseline()
            r6 = -1
            if (r5 == r6) goto L_0x01c0
            int r6 = r3.gravity
            if (r6 >= 0) goto L_0x01a6
            int r6 = r7.mGravity
        L_0x01a6:
            r6 = r6 & 112(0x70, float:1.57E-43)
            r8 = 4
            int r6 = r6 >> r8
            r6 = r6 & -2
            int r6 = r6 >> 1
            r8 = r14[r6]
            int r8 = java.lang.Math.max(r8, r5)
            r14[r6] = r8
            r8 = r15[r6]
            int r5 = r4 - r5
            int r5 = java.lang.Math.max(r8, r5)
            r15[r6] = r5
        L_0x01c0:
            r5 = r35
            int r5 = java.lang.Math.max(r5, r4)
            if (r26 == 0) goto L_0x01d0
            int r6 = r3.height
            r8 = -1
            if (r6 != r8) goto L_0x01d0
            r26 = r18
            goto L_0x01d2
        L_0x01d0:
            r26 = 0
        L_0x01d2:
            float r3 = r3.weight
            int r3 = (r3 > r20 ? 1 : (r3 == r20 ? 0 : -1))
            if (r3 <= 0) goto L_0x01e6
            if (r0 == 0) goto L_0x01dd
        L_0x01da:
            r3 = r22
            goto L_0x01df
        L_0x01dd:
            r2 = r4
            goto L_0x01da
        L_0x01df:
            int r22 = java.lang.Math.max(r3, r2)
        L_0x01e3:
            r0 = r33
            goto L_0x01f6
        L_0x01e6:
            r3 = r22
            if (r0 == 0) goto L_0x01ed
        L_0x01ea:
            r4 = r21
            goto L_0x01ef
        L_0x01ed:
            r2 = r4
            goto L_0x01ea
        L_0x01ef:
            int r21 = java.lang.Math.max(r4, r2)
            r22 = r3
            goto L_0x01e3
        L_0x01f6:
            int r2 = r7.getChildrenSkipCount(r9, r0)
            int r2 = r2 + r0
            r0 = r32
        L_0x01fd:
            int r2 = r2 + 1
            r8 = r41
            r3 = r1
            r1 = r5
            r5 = r29
            r4 = r37
            r6 = -1
            r9 = 0
            goto L_0x005f
        L_0x020b:
            r37 = r4
            r29 = r5
            r4 = r21
            r9 = r25
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r28 = -2
            r5 = r1
            r1 = r3
            r3 = r22
            int r2 = r7.mTotalLength
            if (r2 <= 0) goto L_0x022c
            boolean r2 = r7.hasDividerBeforeChildAt(r10)
            if (r2 == 0) goto L_0x022c
            int r2 = r7.mTotalLength
            int r1 = r7.mDividerWidth
            int r2 = r2 + r1
            r7.mTotalLength = r2
        L_0x022c:
            r1 = r14[r18]
            r2 = -1
            if (r1 != r2) goto L_0x0244
            r21 = 0
            r6 = r14[r21]
            if (r6 != r2) goto L_0x0244
            r6 = r14[r17]
            if (r6 != r2) goto L_0x0244
            r6 = r14[r16]
            if (r6 == r2) goto L_0x0240
            goto L_0x0244
        L_0x0240:
            r1 = r5
            r25 = r9
            goto L_0x0273
        L_0x0244:
            r2 = r14[r16]
            r6 = 0
            r8 = r14[r6]
            r6 = r14[r17]
            int r1 = java.lang.Math.max(r1, r6)
            int r1 = java.lang.Math.max(r8, r1)
            int r1 = java.lang.Math.max(r2, r1)
            r2 = r15[r16]
            r6 = 0
            r8 = r15[r6]
            r6 = r15[r18]
            r25 = r9
            r9 = r15[r17]
            int r6 = java.lang.Math.max(r6, r9)
            int r6 = java.lang.Math.max(r8, r6)
            int r2 = java.lang.Math.max(r2, r6)
            int r2 = r2 + r1
            int r1 = java.lang.Math.max(r5, r2)
        L_0x0273:
            if (r37 == 0) goto L_0x027d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r11 == r2) goto L_0x027b
            if (r11 != 0) goto L_0x027d
        L_0x027b:
            r2 = 0
            goto L_0x0280
        L_0x027d:
            r21 = r1
            goto L_0x02da
        L_0x0280:
            r7.mTotalLength = r2
            r2 = 0
        L_0x0283:
            if (r2 >= r10) goto L_0x027d
            android.view.View r5 = r7.getVirtualChildAt(r2)
            if (r5 != 0) goto L_0x0295
            int r5 = r7.mTotalLength
            int r6 = r7.measureNullChild(r2)
            int r6 = r6 + r5
            r7.mTotalLength = r6
            goto L_0x02a2
        L_0x0295:
            int r6 = r5.getVisibility()
            r8 = 8
            if (r6 != r8) goto L_0x02a5
            int r5 = r7.getChildrenSkipCount(r5, r2)
            int r2 = r2 + r5
        L_0x02a2:
            r21 = r1
            goto L_0x02d5
        L_0x02a5:
            android.view.ViewGroup$LayoutParams r6 = r5.getLayoutParams()
            xv7 r6 = (defpackage.xv7) r6
            if (r19 == 0) goto L_0x02be
            int r8 = r7.mTotalLength
            int r9 = r6.leftMargin
            int r9 = r9 + r13
            int r6 = r6.rightMargin
            int r9 = r9 + r6
            int r5 = r7.getNextLocationOffset(r5)
            int r5 = r5 + r9
            int r5 = r5 + r8
            r7.mTotalLength = r5
            goto L_0x02a2
        L_0x02be:
            int r8 = r7.mTotalLength
            int r9 = r8 + r13
            r21 = r1
            int r1 = r6.leftMargin
            int r9 = r9 + r1
            int r1 = r6.rightMargin
            int r9 = r9 + r1
            int r1 = r7.getNextLocationOffset(r5)
            int r1 = r1 + r9
            int r1 = java.lang.Math.max(r8, r1)
            r7.mTotalLength = r1
        L_0x02d5:
            int r2 = r2 + 1
            r1 = r21
            goto L_0x0283
        L_0x02da:
            int r1 = r7.mTotalLength
            int r2 = r39.getPaddingLeft()
            int r5 = r39.getPaddingRight()
            int r5 = r5 + r2
            int r5 = r5 + r1
            r7.mTotalLength = r5
            int r1 = r39.getSuggestedMinimumWidth()
            int r1 = java.lang.Math.max(r5, r1)
            r6 = r40
            r2 = 0
            int r1 = android.view.View.resolveSizeAndState(r1, r6, r2)
            r2 = 16777215(0xffffff, float:2.3509886E-38)
            r2 = r2 & r1
            int r5 = r7.mTotalLength
            int r2 = r2 - r5
            if (r23 != 0) goto L_0x0350
            if (r2 == 0) goto L_0x0307
            int r8 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r8 <= 0) goto L_0x0307
            goto L_0x0350
        L_0x0307:
            int r0 = java.lang.Math.max(r4, r3)
            if (r37 == 0) goto L_0x0343
            r2 = 1073741824(0x40000000, float:2.0)
            if (r11 == r2) goto L_0x0343
            r2 = 0
        L_0x0312:
            if (r2 >= r10) goto L_0x0343
            android.view.View r3 = r7.getVirtualChildAt(r2)
            if (r3 == 0) goto L_0x0340
            int r4 = r3.getVisibility()
            r8 = 8
            if (r4 != r8) goto L_0x0323
            goto L_0x0340
        L_0x0323:
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            xv7 r4 = (defpackage.xv7) r4
            float r4 = r4.weight
            int r4 = (r4 > r20 ? 1 : (r4 == r20 ? 0 : -1))
            if (r4 <= 0) goto L_0x0340
            r4 = 1073741824(0x40000000, float:2.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r13, r4)
            int r9 = r3.getMeasuredHeight()
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r4)
            r3.measure(r8, r9)
        L_0x0340:
            int r2 = r2 + 1
            goto L_0x0312
        L_0x0343:
            r2 = r41
            r30 = r1
            r23 = r10
            r1 = r21
            r9 = r25
            r3 = 0
            goto L_0x04f5
        L_0x0350:
            float r3 = r7.mWeightSum
            int r8 = (r3 > r20 ? 1 : (r3 == r20 ? 0 : -1))
            if (r8 <= 0) goto L_0x0357
            r0 = r3
        L_0x0357:
            r3 = -1
            r14[r16] = r3
            r14[r17] = r3
            r14[r18] = r3
            r8 = 0
            r14[r8] = r3
            r15[r16] = r3
            r15[r17] = r3
            r15[r18] = r3
            r15[r8] = r3
            r7.mTotalLength = r8
            r8 = r4
            r9 = r25
            r13 = 0
            r4 = r3
        L_0x0370:
            if (r13 >= r10) goto L_0x049d
            android.view.View r3 = r7.getVirtualChildAt(r13)
            if (r3 == 0) goto L_0x0380
            int r5 = r3.getVisibility()
            r6 = 8
            if (r5 != r6) goto L_0x038b
        L_0x0380:
            r30 = r1
            r6 = r2
            r23 = r10
            r24 = 4
            r2 = r41
            goto L_0x048e
        L_0x038b:
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            xv7 r5 = (defpackage.xv7) r5
            float r6 = r5.weight
            int r23 = (r6 > r20 ? 1 : (r6 == r20 ? 0 : -1))
            if (r23 <= 0) goto L_0x03f5
            r23 = r10
            float r10 = (float) r2
            float r10 = r10 * r6
            float r10 = r10 / r0
            int r10 = (int) r10
            float r0 = r0 - r6
            int r2 = r2 - r10
            int r6 = r39.getPaddingTop()
            int r25 = r39.getPaddingBottom()
            int r25 = r25 + r6
            int r6 = r5.topMargin
            int r25 = r25 + r6
            int r6 = r5.bottomMargin
            int r6 = r25 + r6
            r25 = r0
            int r0 = r5.height
            r30 = r1
            r31 = r2
            r1 = -1
            r2 = r41
            int r0 = android.view.ViewGroup.getChildMeasureSpec(r2, r6, r0)
            int r6 = r5.width
            if (r6 != 0) goto L_0x03d5
            r6 = 1073741824(0x40000000, float:2.0)
            if (r11 == r6) goto L_0x03c9
            goto L_0x03d7
        L_0x03c9:
            if (r10 <= 0) goto L_0x03cc
            goto L_0x03cd
        L_0x03cc:
            r10 = 0
        L_0x03cd:
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r6)
            r3.measure(r10, r0)
            goto L_0x03e7
        L_0x03d5:
            r6 = 1073741824(0x40000000, float:2.0)
        L_0x03d7:
            int r32 = r3.getMeasuredWidth()
            int r10 = r32 + r10
            if (r10 >= 0) goto L_0x03e0
            r10 = 0
        L_0x03e0:
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r6)
            r3.measure(r10, r0)
        L_0x03e7:
            int r0 = r3.getMeasuredState()
            r6 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r6
            int r9 = android.view.View.combineMeasuredStates(r9, r0)
            r0 = r25
            goto L_0x03ff
        L_0x03f5:
            r30 = r1
            r6 = r2
            r23 = r10
            r1 = -1
            r2 = r41
            r31 = r6
        L_0x03ff:
            if (r19 == 0) goto L_0x0418
            int r6 = r7.mTotalLength
            int r10 = r3.getMeasuredWidth()
            int r1 = r5.leftMargin
            int r10 = r10 + r1
            int r1 = r5.rightMargin
            int r10 = r10 + r1
            int r1 = r7.getNextLocationOffset(r3)
            int r1 = r1 + r10
            int r1 = r1 + r6
            r7.mTotalLength = r1
        L_0x0415:
            r1 = 1073741824(0x40000000, float:2.0)
            goto L_0x0431
        L_0x0418:
            int r1 = r7.mTotalLength
            int r6 = r3.getMeasuredWidth()
            int r6 = r6 + r1
            int r10 = r5.leftMargin
            int r6 = r6 + r10
            int r10 = r5.rightMargin
            int r6 = r6 + r10
            int r10 = r7.getNextLocationOffset(r3)
            int r10 = r10 + r6
            int r1 = java.lang.Math.max(r1, r10)
            r7.mTotalLength = r1
            goto L_0x0415
        L_0x0431:
            if (r12 == r1) goto L_0x043b
            int r1 = r5.height
            r6 = -1
            if (r1 != r6) goto L_0x043b
            r1 = r18
            goto L_0x043c
        L_0x043b:
            r1 = 0
        L_0x043c:
            int r6 = r5.topMargin
            int r10 = r5.bottomMargin
            int r6 = r6 + r10
            int r10 = r3.getMeasuredHeight()
            int r10 = r10 + r6
            int r4 = java.lang.Math.max(r4, r10)
            if (r1 == 0) goto L_0x044d
            goto L_0x044e
        L_0x044d:
            r6 = r10
        L_0x044e:
            int r1 = java.lang.Math.max(r8, r6)
            if (r26 == 0) goto L_0x045c
            int r6 = r5.height
            r8 = -1
            if (r6 != r8) goto L_0x045d
            r6 = r18
            goto L_0x045e
        L_0x045c:
            r8 = -1
        L_0x045d:
            r6 = 0
        L_0x045e:
            if (r29 == 0) goto L_0x0488
            int r3 = r3.getBaseline()
            if (r3 == r8) goto L_0x0488
            int r5 = r5.gravity
            if (r5 >= 0) goto L_0x046c
            int r5 = r7.mGravity
        L_0x046c:
            r5 = r5 & 112(0x70, float:1.57E-43)
            r24 = 4
            int r5 = r5 >> 4
            r5 = r5 & -2
            int r5 = r5 >> 1
            r8 = r14[r5]
            int r8 = java.lang.Math.max(r8, r3)
            r14[r5] = r8
            r8 = r15[r5]
            int r10 = r10 - r3
            int r3 = java.lang.Math.max(r8, r10)
            r15[r5] = r3
            goto L_0x048a
        L_0x0488:
            r24 = 4
        L_0x048a:
            r8 = r1
            r26 = r6
            goto L_0x0490
        L_0x048e:
            r31 = r6
        L_0x0490:
            int r13 = r13 + 1
            r6 = r40
            r10 = r23
            r1 = r30
            r2 = r31
            r3 = -1
            goto L_0x0370
        L_0x049d:
            r2 = r41
            r30 = r1
            r23 = r10
            int r0 = r7.mTotalLength
            int r1 = r39.getPaddingLeft()
            int r3 = r39.getPaddingRight()
            int r3 = r3 + r1
            int r3 = r3 + r0
            r7.mTotalLength = r3
            r0 = r14[r18]
            r1 = -1
            if (r0 != r1) goto L_0x04c7
            r3 = 0
            r5 = r14[r3]
            if (r5 != r1) goto L_0x04c7
            r3 = r14[r17]
            if (r3 != r1) goto L_0x04c7
            r3 = r14[r16]
            if (r3 == r1) goto L_0x04c4
            goto L_0x04c7
        L_0x04c4:
            r1 = r4
            r3 = 0
            goto L_0x04f4
        L_0x04c7:
            r1 = r14[r16]
            r3 = 0
            r5 = r14[r3]
            r6 = r14[r17]
            int r0 = java.lang.Math.max(r0, r6)
            int r0 = java.lang.Math.max(r5, r0)
            int r0 = java.lang.Math.max(r1, r0)
            r1 = r15[r16]
            r5 = r15[r3]
            r6 = r15[r18]
            r10 = r15[r17]
            int r6 = java.lang.Math.max(r6, r10)
            int r5 = java.lang.Math.max(r5, r6)
            int r1 = java.lang.Math.max(r1, r5)
            int r1 = r1 + r0
            int r0 = java.lang.Math.max(r4, r1)
            r1 = r0
        L_0x04f4:
            r0 = r8
        L_0x04f5:
            if (r26 != 0) goto L_0x04fc
            r4 = 1073741824(0x40000000, float:2.0)
            if (r12 == r4) goto L_0x04fc
            goto L_0x04fd
        L_0x04fc:
            r0 = r1
        L_0x04fd:
            int r1 = r39.getPaddingTop()
            int r4 = r39.getPaddingBottom()
            int r4 = r4 + r1
            int r4 = r4 + r0
            int r0 = r39.getSuggestedMinimumHeight()
            int r0 = java.lang.Math.max(r4, r0)
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r1 & r9
            r1 = r30 | r1
            int r4 = r9 << 16
            int r0 = android.view.View.resolveSizeAndState(r0, r2, r4)
            r7.setMeasuredDimension(r1, r0)
            if (r27 == 0) goto L_0x0562
            int r0 = r39.getMeasuredHeight()
            r1 = 1073741824(0x40000000, float:2.0)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r9 = r3
            r8 = r23
        L_0x052c:
            if (r9 >= r8) goto L_0x0562
            android.view.View r1 = r7.getVirtualChildAt(r9)
            int r0 = r1.getVisibility()
            r10 = 8
            if (r0 == r10) goto L_0x055e
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            r11 = r0
            xv7 r11 = (defpackage.xv7) r11
            int r0 = r11.height
            r2 = -1
            if (r0 != r2) goto L_0x055c
            int r12 = r11.width
            int r0 = r1.getMeasuredWidth()
            r11.width = r0
            r3 = 0
            r5 = 0
            r0 = r39
            r13 = r2
            r2 = r40
            r4 = r6
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            r11.width = r12
            goto L_0x055f
        L_0x055c:
            r13 = r2
            goto L_0x055f
        L_0x055e:
            r13 = -1
        L_0x055f:
            int r9 = r9 + 1
            goto L_0x052c
        L_0x0562:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yv7.measureHorizontal(int, int):void");
    }

    public int measureNullChild(int i) {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02fa, code lost:
        if (r5.width == -1) goto L_0x0301;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void measureVertical(int r30, int r31) {
        /*
            r29 = this;
            r7 = r29
            r8 = r30
            r9 = 0
            r7.mTotalLength = r9
            int r10 = r29.getVirtualChildCount()
            int r11 = android.view.View.MeasureSpec.getMode(r30)
            int r12 = android.view.View.MeasureSpec.getMode(r31)
            int r13 = r7.mBaselineAlignedChildIndex
            boolean r14 = r7.mUseLargestChild
            r16 = 0
            r1 = r9
            r2 = r1
            r3 = r2
            r4 = r3
            r5 = r4
            r6 = r5
            r17 = r6
            r19 = r17
            r0 = r16
            r18 = 1
        L_0x0027:
            r20 = r5
            r5 = 8
            if (r6 >= r10) goto L_0x017d
            android.view.View r9 = r7.getVirtualChildAt(r6)
            if (r9 != 0) goto L_0x0045
            int r5 = r7.mTotalLength
            int r9 = r7.measureNullChild(r6)
            int r9 = r9 + r5
            r7.mTotalLength = r9
        L_0x003c:
            r22 = r12
            r5 = r20
            r8 = 1
            r20 = r10
            goto L_0x0174
        L_0x0045:
            int r15 = r9.getVisibility()
            if (r15 != r5) goto L_0x0051
            int r5 = r7.getChildrenSkipCount(r9, r6)
            int r6 = r6 + r5
            goto L_0x003c
        L_0x0051:
            boolean r5 = r7.hasDividerBeforeChildAt(r6)
            if (r5 == 0) goto L_0x005e
            int r5 = r7.mTotalLength
            int r15 = r7.mDividerHeight
            int r5 = r5 + r15
            r7.mTotalLength = r5
        L_0x005e:
            android.view.ViewGroup$LayoutParams r5 = r9.getLayoutParams()
            r15 = r5
            xv7 r15 = (defpackage.xv7) r15
            float r5 = r15.weight
            float r21 = r0 + r5
            r0 = 1073741824(0x40000000, float:2.0)
            if (r12 != r0) goto L_0x0095
            int r0 = r15.height
            if (r0 != 0) goto L_0x0095
            int r0 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x0095
            int r0 = r7.mTotalLength
            int r5 = r15.topMargin
            int r5 = r5 + r0
            r22 = r1
            int r1 = r15.bottomMargin
            int r5 = r5 + r1
            int r0 = java.lang.Math.max(r0, r5)
            r7.mTotalLength = r0
            r26 = r2
            r27 = r20
            r25 = r22
            r17 = 1
            r20 = r10
            r22 = r12
            r12 = r4
            r10 = r6
            goto L_0x00fa
        L_0x0095:
            r22 = r1
            int r0 = r15.height
            if (r0 != 0) goto L_0x00a4
            int r0 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x00a4
            r0 = -2
            r15.height = r0
            r5 = 0
            goto L_0x00a6
        L_0x00a4:
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x00a6:
            int r0 = (r21 > r16 ? 1 : (r21 == r16 ? 0 : -1))
            if (r0 != 0) goto L_0x00af
            int r0 = r7.mTotalLength
            r23 = r0
            goto L_0x00b1
        L_0x00af:
            r23 = 0
        L_0x00b1:
            r24 = 0
            r0 = r29
            r25 = r22
            r1 = r9
            r26 = r2
            r2 = r6
            r8 = r3
            r3 = r30
            r22 = r12
            r12 = r4
            r4 = r24
            r28 = r5
            r27 = r20
            r5 = r31
            r20 = r10
            r10 = r6
            r6 = r23
            r0.measureChildBeforeLayout(r1, r2, r3, r4, r5, r6)
            r1 = r28
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r0) goto L_0x00d9
            r15.height = r1
        L_0x00d9:
            int r0 = r9.getMeasuredHeight()
            int r1 = r7.mTotalLength
            int r2 = r1 + r0
            int r3 = r15.topMargin
            int r2 = r2 + r3
            int r3 = r15.bottomMargin
            int r2 = r2 + r3
            int r3 = r7.getNextLocationOffset(r9)
            int r3 = r3 + r2
            int r1 = java.lang.Math.max(r1, r3)
            r7.mTotalLength = r1
            if (r14 == 0) goto L_0x00f9
            int r3 = java.lang.Math.max(r0, r8)
            goto L_0x00fa
        L_0x00f9:
            r3 = r8
        L_0x00fa:
            if (r13 < 0) goto L_0x0104
            int r6 = r10 + 1
            if (r13 != r6) goto L_0x0104
            int r0 = r7.mTotalLength
            r7.mBaselineChildTop = r0
        L_0x0104:
            if (r10 >= r13) goto L_0x010c
            float r0 = r15.weight
            int r0 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r0 > 0) goto L_0x010f
        L_0x010c:
            r0 = 1073741824(0x40000000, float:2.0)
            goto L_0x0117
        L_0x010f:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex."
            r0.<init>(r1)
            throw r0
        L_0x0117:
            if (r11 == r0) goto L_0x0122
            int r0 = r15.width
            r1 = -1
            if (r0 != r1) goto L_0x0122
            r0 = 1
            r19 = 1
            goto L_0x0123
        L_0x0122:
            r0 = 0
        L_0x0123:
            int r1 = r15.leftMargin
            int r2 = r15.rightMargin
            int r1 = r1 + r2
            int r2 = r9.getMeasuredWidth()
            int r2 = r2 + r1
            r4 = r26
            int r4 = java.lang.Math.max(r4, r2)
            int r5 = r9.getMeasuredState()
            r6 = r25
            int r5 = android.view.View.combineMeasuredStates(r6, r5)
            if (r18 == 0) goto L_0x0147
            int r6 = r15.width
            r8 = -1
            if (r6 != r8) goto L_0x0147
            r18 = 1
            goto L_0x0149
        L_0x0147:
            r18 = 0
        L_0x0149:
            float r6 = r15.weight
            int r6 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r6 <= 0) goto L_0x0158
            if (r0 == 0) goto L_0x0152
            goto L_0x0153
        L_0x0152:
            r1 = r2
        L_0x0153:
            int r0 = java.lang.Math.max(r12, r1)
            goto L_0x0166
        L_0x0158:
            if (r0 == 0) goto L_0x015d
        L_0x015a:
            r2 = r27
            goto L_0x015f
        L_0x015d:
            r1 = r2
            goto L_0x015a
        L_0x015f:
            int r0 = java.lang.Math.max(r2, r1)
            r27 = r0
            r0 = r12
        L_0x0166:
            int r1 = r7.getChildrenSkipCount(r9, r10)
            int r6 = r1 + r10
            r2 = r4
            r1 = r5
            r5 = r27
            r8 = 1
            r4 = r0
            r0 = r21
        L_0x0174:
            int r6 = r6 + r8
            r8 = r30
            r10 = r20
            r12 = r22
            goto L_0x0027
        L_0x017d:
            r6 = r1
            r8 = r3
            r22 = r12
            r12 = r4
            r4 = r2
            r2 = r20
            r20 = r10
            int r1 = r7.mTotalLength
            r9 = r20
            if (r1 <= 0) goto L_0x019a
            boolean r1 = r7.hasDividerBeforeChildAt(r9)
            if (r1 == 0) goto L_0x019a
            int r1 = r7.mTotalLength
            int r3 = r7.mDividerHeight
            int r1 = r1 + r3
            r7.mTotalLength = r1
        L_0x019a:
            r1 = r22
            if (r14 == 0) goto L_0x01a6
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r3) goto L_0x01a4
            if (r1 != 0) goto L_0x01a6
        L_0x01a4:
            r3 = 0
            goto L_0x01a8
        L_0x01a6:
            r5 = 1
            goto L_0x01ed
        L_0x01a8:
            r7.mTotalLength = r3
            r3 = 0
        L_0x01ab:
            if (r3 >= r9) goto L_0x01a6
            android.view.View r10 = r7.getVirtualChildAt(r3)
            if (r10 != 0) goto L_0x01bd
            int r10 = r7.mTotalLength
            int r13 = r7.measureNullChild(r3)
            int r13 = r13 + r10
            r7.mTotalLength = r13
            goto L_0x01c8
        L_0x01bd:
            int r13 = r10.getVisibility()
            if (r13 != r5) goto L_0x01ca
            int r10 = r7.getChildrenSkipCount(r10, r3)
            int r3 = r3 + r10
        L_0x01c8:
            r5 = 1
            goto L_0x01e9
        L_0x01ca:
            android.view.ViewGroup$LayoutParams r13 = r10.getLayoutParams()
            xv7 r13 = (defpackage.xv7) r13
            int r15 = r7.mTotalLength
            int r20 = r15 + r8
            int r5 = r13.topMargin
            int r20 = r20 + r5
            int r5 = r13.bottomMargin
            int r20 = r20 + r5
            int r5 = r7.getNextLocationOffset(r10)
            int r5 = r5 + r20
            int r5 = java.lang.Math.max(r15, r5)
            r7.mTotalLength = r5
            goto L_0x01c8
        L_0x01e9:
            int r3 = r3 + r5
            r5 = 8
            goto L_0x01ab
        L_0x01ed:
            int r3 = r7.mTotalLength
            int r10 = r29.getPaddingTop()
            int r13 = r29.getPaddingBottom()
            int r13 = r13 + r10
            int r13 = r13 + r3
            r7.mTotalLength = r13
            int r3 = r29.getSuggestedMinimumHeight()
            int r3 = java.lang.Math.max(r13, r3)
            r10 = r31
            r13 = 0
            int r3 = android.view.View.resolveSizeAndState(r3, r10, r13)
            r13 = 16777215(0xffffff, float:2.3509886E-38)
            r13 = r13 & r3
            int r15 = r7.mTotalLength
            int r13 = r13 - r15
            if (r17 != 0) goto L_0x025c
            if (r13 == 0) goto L_0x021a
            int r15 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r15 <= 0) goto L_0x021a
            goto L_0x025c
        L_0x021a:
            int r0 = java.lang.Math.max(r2, r12)
            if (r14 == 0) goto L_0x0256
            r2 = 1073741824(0x40000000, float:2.0)
            if (r1 == r2) goto L_0x0256
            r1 = 0
        L_0x0225:
            if (r1 >= r9) goto L_0x0256
            android.view.View r2 = r7.getVirtualChildAt(r1)
            if (r2 == 0) goto L_0x0253
            int r5 = r2.getVisibility()
            r12 = 8
            if (r5 != r12) goto L_0x0236
            goto L_0x0253
        L_0x0236:
            android.view.ViewGroup$LayoutParams r5 = r2.getLayoutParams()
            xv7 r5 = (defpackage.xv7) r5
            float r5 = r5.weight
            int r5 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r5 <= 0) goto L_0x0253
            int r5 = r2.getMeasuredWidth()
            r12 = 1073741824(0x40000000, float:2.0)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r12)
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r12)
            r2.measure(r5, r13)
        L_0x0253:
            int r1 = r1 + 1
            goto L_0x0225
        L_0x0256:
            r10 = r30
            r2 = r4
            r1 = r6
            goto L_0x0347
        L_0x025c:
            float r8 = r7.mWeightSum
            int r12 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r12 <= 0) goto L_0x0263
            r0 = r8
        L_0x0263:
            r8 = 0
            r7.mTotalLength = r8
            r12 = r2
            r2 = r4
            r4 = r8
        L_0x0269:
            if (r4 >= r9) goto L_0x0335
            android.view.View r14 = r7.getVirtualChildAt(r4)
            int r15 = r14.getVisibility()
            r5 = 8
            if (r15 != r5) goto L_0x027d
            r10 = r30
            r22 = r1
            goto L_0x032b
        L_0x027d:
            android.view.ViewGroup$LayoutParams r5 = r14.getLayoutParams()
            xv7 r5 = (defpackage.xv7) r5
            float r15 = r5.weight
            int r17 = (r15 > r16 ? 1 : (r15 == r16 ? 0 : -1))
            if (r17 <= 0) goto L_0x02df
            float r8 = (float) r13
            float r8 = r8 * r15
            float r8 = r8 / r0
            int r8 = (int) r8
            float r0 = r0 - r15
            int r13 = r13 - r8
            int r15 = r29.getPaddingLeft()
            int r17 = r29.getPaddingRight()
            int r17 = r17 + r15
            int r15 = r5.leftMargin
            int r17 = r17 + r15
            int r15 = r5.rightMargin
            int r15 = r17 + r15
            r17 = r0
            int r0 = r5.width
            r10 = r30
            int r0 = android.view.ViewGroup.getChildMeasureSpec(r10, r15, r0)
            int r15 = r5.height
            if (r15 != 0) goto L_0x02c0
            r15 = 1073741824(0x40000000, float:2.0)
            if (r1 == r15) goto L_0x02b4
            goto L_0x02c2
        L_0x02b4:
            if (r8 <= 0) goto L_0x02b7
            goto L_0x02b8
        L_0x02b7:
            r8 = 0
        L_0x02b8:
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r15)
            r14.measure(r0, r8)
            goto L_0x02d2
        L_0x02c0:
            r15 = 1073741824(0x40000000, float:2.0)
        L_0x02c2:
            int r20 = r14.getMeasuredHeight()
            int r8 = r20 + r8
            if (r8 >= 0) goto L_0x02cb
            r8 = 0
        L_0x02cb:
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r15)
            r14.measure(r0, r8)
        L_0x02d2:
            int r0 = r14.getMeasuredState()
            r0 = r0 & -256(0xffffffffffffff00, float:NaN)
            int r6 = android.view.View.combineMeasuredStates(r6, r0)
            r0 = r17
            goto L_0x02e1
        L_0x02df:
            r10 = r30
        L_0x02e1:
            int r8 = r5.leftMargin
            int r15 = r5.rightMargin
            int r8 = r8 + r15
            int r15 = r14.getMeasuredWidth()
            int r15 = r15 + r8
            int r2 = java.lang.Math.max(r2, r15)
            r17 = r0
            r0 = 1073741824(0x40000000, float:2.0)
            if (r11 == r0) goto L_0x02fd
            int r0 = r5.width
            r22 = r1
            r1 = -1
            if (r0 != r1) goto L_0x0300
            goto L_0x0301
        L_0x02fd:
            r22 = r1
            r1 = -1
        L_0x0300:
            r8 = r15
        L_0x0301:
            int r0 = java.lang.Math.max(r12, r8)
            if (r18 == 0) goto L_0x030d
            int r8 = r5.width
            if (r8 != r1) goto L_0x030d
            r8 = 1
            goto L_0x030e
        L_0x030d:
            r8 = 0
        L_0x030e:
            int r1 = r7.mTotalLength
            int r12 = r14.getMeasuredHeight()
            int r12 = r12 + r1
            int r15 = r5.topMargin
            int r12 = r12 + r15
            int r5 = r5.bottomMargin
            int r12 = r12 + r5
            int r5 = r7.getNextLocationOffset(r14)
            int r5 = r5 + r12
            int r1 = java.lang.Math.max(r1, r5)
            r7.mTotalLength = r1
            r12 = r0
            r18 = r8
            r0 = r17
        L_0x032b:
            int r4 = r4 + 1
            r10 = r31
            r1 = r22
            r5 = 1
            r8 = 0
            goto L_0x0269
        L_0x0335:
            r10 = r30
            int r0 = r7.mTotalLength
            int r1 = r29.getPaddingTop()
            int r4 = r29.getPaddingBottom()
            int r4 = r4 + r1
            int r4 = r4 + r0
            r7.mTotalLength = r4
            r1 = r6
            r0 = r12
        L_0x0347:
            if (r18 != 0) goto L_0x034e
            r4 = 1073741824(0x40000000, float:2.0)
            if (r11 == r4) goto L_0x034e
            goto L_0x034f
        L_0x034e:
            r0 = r2
        L_0x034f:
            int r2 = r29.getPaddingLeft()
            int r4 = r29.getPaddingRight()
            int r4 = r4 + r2
            int r4 = r4 + r0
            int r0 = r29.getSuggestedMinimumWidth()
            int r0 = java.lang.Math.max(r4, r0)
            int r0 = android.view.View.resolveSizeAndState(r0, r10, r1)
            r7.setMeasuredDimension(r0, r3)
            if (r19 == 0) goto L_0x03ad
            int r0 = r29.getMeasuredWidth()
            r1 = 1073741824(0x40000000, float:2.0)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r8 = 0
        L_0x0375:
            if (r8 >= r9) goto L_0x03ad
            android.view.View r1 = r7.getVirtualChildAt(r8)
            int r0 = r1.getVisibility()
            r5 = 8
            if (r0 == r5) goto L_0x03a8
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            r10 = r0
            xv7 r10 = (defpackage.xv7) r10
            int r0 = r10.width
            r11 = -1
            if (r0 != r11) goto L_0x03a6
            int r12 = r10.height
            int r0 = r1.getMeasuredHeight()
            r10.height = r0
            r3 = 0
            r13 = 0
            r0 = r29
            r2 = r6
            r4 = r31
            r14 = r5
            r5 = r13
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            r10.height = r12
            goto L_0x03aa
        L_0x03a6:
            r14 = r5
            goto L_0x03aa
        L_0x03a8:
            r14 = r5
            r11 = -1
        L_0x03aa:
            int r8 = r8 + 1
            goto L_0x0375
        L_0x03ad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yv7.measureVertical(int, int):void");
    }

    public void onDraw(Canvas canvas) {
        if (this.mDivider != null) {
            if (this.mOrientation == 1) {
                drawDividersVertical(canvas);
            } else {
                drawDividersHorizontal(canvas);
            }
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(ACCESSIBILITY_CLASS_NAME);
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(ACCESSIBILITY_CLASS_NAME);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.mOrientation == 1) {
            layoutVertical(i, i2, i3, i4);
        } else {
            layoutHorizontal(i, i2, i3, i4);
        }
    }

    public void onMeasure(int i, int i2) {
        if (this.mOrientation == 1) {
            measureVertical(i, i2);
        } else {
            measureHorizontal(i, i2);
        }
    }

    public void setBaselineAligned(boolean z) {
        this.mBaselineAligned = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i < 0 || i >= getChildCount()) {
            throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
        }
        this.mBaselineAlignedChildIndex = i;
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable != this.mDivider) {
            this.mDivider = drawable;
            boolean z = false;
            if (drawable != null) {
                this.mDividerWidth = drawable.getIntrinsicWidth();
                this.mDividerHeight = drawable.getIntrinsicHeight();
            } else {
                this.mDividerWidth = 0;
                this.mDividerHeight = 0;
            }
            if (drawable == null) {
                z = true;
            }
            setWillNotDraw(z);
            requestLayout();
        }
    }

    public void setDividerPadding(int i) {
        this.mDividerPadding = i;
    }

    public void setGravity(int i) {
        if (this.mGravity != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.mGravity = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.mGravity;
        if ((8388615 & i3) != i2) {
            this.mGravity = i2 | (-8388616 & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.mUseLargestChild = z;
    }

    public void setOrientation(int i) {
        if (this.mOrientation != i) {
            this.mOrientation = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.mShowDividers) {
            requestLayout();
        }
        this.mShowDividers = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.mGravity;
        if ((i3 & 112) != i2) {
            this.mGravity = i2 | (i3 & -113);
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.mWeightSum = Math.max(c44.DEFAULT_ASPECT_RATIO, f);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [xv7, android.widget.LinearLayout$LayoutParams] */
    /* JADX WARNING: type inference failed for: r2v4, types: [xv7, android.widget.LinearLayout$LayoutParams] */
    public xv7 generateDefaultLayoutParams() {
        int i = this.mOrientation;
        if (i == 0) {
            return new LinearLayout.LayoutParams(-2, -2);
        }
        if (i == 1) {
            return new LinearLayout.LayoutParams(-1, -2);
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [xv7, android.widget.LinearLayout$LayoutParams] */
    public xv7 generateLayoutParams(AttributeSet attributeSet) {
        return new LinearLayout.LayoutParams(getContext(), attributeSet);
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [xv7, android.widget.LinearLayout$LayoutParams] */
    /* JADX WARNING: type inference failed for: r0v4, types: [xv7, android.widget.LinearLayout$LayoutParams] */
    /* JADX WARNING: type inference failed for: r0v5, types: [xv7, android.widget.LinearLayout$LayoutParams] */
    public xv7 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof xv7) {
            return new LinearLayout.LayoutParams((xv7) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LinearLayout.LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LinearLayout.LayoutParams(layoutParams);
    }
}
