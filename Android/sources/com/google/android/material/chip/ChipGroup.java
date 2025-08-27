package com.google.android.material.chip;

import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.HashMap;
import java.util.List;

public class ChipGroup extends qv5 {
    public static final int w0 = hnc.Widget_MaterialComponents_ChipGroup;
    public int v;
    public final vz2 v0;
    public int w;
    public uz2 x;
    public final g5b y;
    public final int z;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ChipGroup(android.content.Context r9, android.util.AttributeSet r10) {
        /*
            r8 = this;
            int r3 = defpackage.edc.chipGroupStyle
            int r4 = w0
            android.content.Context r9 = defpackage.fh8.a(r9, r10, r3, r4)
            r8.<init>(r9, r10, r3)
            r6 = 0
            r8.c = r6
            android.content.res.Resources$Theme r9 = r9.getTheme()
            int[] r0 = defpackage.tnc.FlowLayout
            android.content.res.TypedArray r9 = r9.obtainStyledAttributes(r10, r0, r6, r6)
            int r0 = defpackage.tnc.FlowLayout_lineSpacing
            int r0 = r9.getDimensionPixelSize(r0, r6)
            r8.a = r0
            int r0 = defpackage.tnc.FlowLayout_itemSpacing
            int r0 = r9.getDimensionPixelSize(r0, r6)
            r8.b = r0
            r9.recycle()
            g5b r9 = new g5b
            r9.<init>()
            r8.y = r9
            vz2 r7 = new vz2
            r7.<init>(r8)
            r8.v0 = r7
            android.content.Context r0 = r8.getContext()
            int[] r2 = defpackage.tnc.ChipGroup
            int[] r5 = new int[r6]
            r1 = r10
            android.content.res.TypedArray r10 = defpackage.vhf.d(r0, r1, r2, r3, r4, r5)
            int r0 = defpackage.tnc.ChipGroup_chipSpacing
            int r0 = r10.getDimensionPixelOffset(r0, r6)
            int r1 = defpackage.tnc.ChipGroup_chipSpacingHorizontal
            int r1 = r10.getDimensionPixelOffset(r1, r0)
            r8.setChipSpacingHorizontal(r1)
            int r1 = defpackage.tnc.ChipGroup_chipSpacingVertical
            int r0 = r10.getDimensionPixelOffset(r1, r0)
            r8.setChipSpacingVertical(r0)
            int r0 = defpackage.tnc.ChipGroup_singleLine
            boolean r0 = r10.getBoolean(r0, r6)
            r8.setSingleLine((boolean) r0)
            int r0 = defpackage.tnc.ChipGroup_singleSelection
            boolean r0 = r10.getBoolean(r0, r6)
            r8.setSingleSelection((boolean) r0)
            int r0 = defpackage.tnc.ChipGroup_selectionRequired
            boolean r0 = r10.getBoolean(r0, r6)
            r8.setSelectionRequired(r0)
            int r0 = defpackage.tnc.ChipGroup_checkedChip
            r1 = -1
            int r0 = r10.getResourceId(r0, r1)
            r8.z = r0
            r10.recycle()
            er7 r10 = new er7
            r0 = 12
            r10.<init>((int) r0, (java.lang.Object) r8)
            r9.v = r10
            super.setOnHierarchyChangeListener(r7)
            java.util.WeakHashMap r9 = defpackage.gag.a
            r9 = 1
            r8.setImportantForAccessibility(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.ChipGroup.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private int getVisibleChipCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof Chip) && getChildAt(i2).getVisibility() == 0) {
                i++;
            }
        }
        return i;
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof sz2);
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-2, -2);
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getCheckedChipId() {
        return this.y.n();
    }

    public List<Integer> getCheckedChipIds() {
        return this.y.l(this);
    }

    public int getChipSpacingHorizontal() {
        return this.v;
    }

    public int getChipSpacingVertical() {
        return this.w;
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.z;
        if (i != -1) {
            g5b g5b = this.y;
            yg8 yg8 = (yg8) ((HashMap) g5b.c).get(Integer.valueOf(i));
            if (yg8 != null && g5b.f(yg8)) {
                g5b.o();
            }
        }
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) e4.q(getRowCount(), this.c ? getVisibleChipCount() : -1, this.y.a ? 1 : 2).b);
    }

    public void setChipSpacing(int i) {
        setChipSpacingHorizontal(i);
        setChipSpacingVertical(i);
    }

    public void setChipSpacingHorizontal(int i) {
        if (this.v != i) {
            this.v = i;
            setItemSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingResource(int i) {
        setChipSpacing(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingVertical(int i) {
        if (this.w != i) {
            this.w = i;
            setLineSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Deprecated
    public void setOnCheckedChangeListener(tz2 tz2) {
        if (tz2 == null) {
            setOnCheckedStateChangeListener((uz2) null);
        } else {
            setOnCheckedStateChangeListener(new p7d(this, tz2, false, 7));
        }
    }

    public void setOnCheckedStateChangeListener(uz2 uz2) {
        this.x = uz2;
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.v0.a = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z2) {
        this.y.b = z2;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setSingleLine(boolean z2) {
        super.setSingleLine(z2);
    }

    public void setSingleSelection(boolean z2) {
        g5b g5b = this.y;
        if (g5b.a != z2) {
            g5b.a = z2;
            g5b.g();
        }
    }

    public void setSingleLine(int i) {
        setSingleLine(getResources().getBoolean(i));
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
