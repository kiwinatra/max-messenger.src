package com.google.android.material.button;

import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;

public class MaterialButtonToggleGroup extends LinearLayout {
    public static final int w0 = hnc.Widget_MaterialComponents_MaterialButtonToggleGroup;
    public final ArrayList a = new ArrayList();
    public final grg b = new grg(25, this);
    public final LinkedHashSet c = new LinkedHashSet();
    public final j95 o = new j95(2, this);
    public Integer[] v;
    public HashSet v0 = new HashSet();
    public boolean w = false;
    public boolean x;
    public boolean y;
    public final int z;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialButtonToggleGroup(android.content.Context r7, android.util.AttributeSet r8) {
        /*
            r6 = this;
            int r3 = defpackage.edc.materialButtonToggleGroupStyle
            int r4 = w0
            android.content.Context r7 = defpackage.fh8.a(r7, r8, r3, r4)
            r6.<init>(r7, r8, r3)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r6.a = r7
            grg r7 = new grg
            r0 = 25
            r7.<init>(r0, r6)
            r6.b = r7
            java.util.LinkedHashSet r7 = new java.util.LinkedHashSet
            r7.<init>()
            r6.c = r7
            j95 r7 = new j95
            r0 = 2
            r7.<init>(r0, r6)
            r6.o = r7
            r7 = 0
            r6.w = r7
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r6.v0 = r0
            android.content.Context r0 = r6.getContext()
            int[] r2 = defpackage.tnc.MaterialButtonToggleGroup
            int[] r5 = new int[r7]
            r1 = r8
            android.content.res.TypedArray r8 = defpackage.vhf.d(r0, r1, r2, r3, r4, r5)
            int r0 = defpackage.tnc.MaterialButtonToggleGroup_singleSelection
            boolean r0 = r8.getBoolean(r0, r7)
            r6.setSingleSelection((boolean) r0)
            int r0 = defpackage.tnc.MaterialButtonToggleGroup_checkedButton
            r1 = -1
            int r0 = r8.getResourceId(r0, r1)
            r6.z = r0
            int r0 = defpackage.tnc.MaterialButtonToggleGroup_selectionRequired
            boolean r7 = r8.getBoolean(r0, r7)
            r6.y = r7
            r7 = 1
            r6.setChildrenDrawingOrderEnabled(r7)
            int r0 = defpackage.tnc.MaterialButtonToggleGroup_android_enabled
            boolean r0 = r8.getBoolean(r0, r7)
            r6.setEnabled(r0)
            r8.recycle()
            java.util.WeakHashMap r8 = defpackage.gag.a
            r6.setImportantForAccessibility(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButtonToggleGroup.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (c(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (c(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof MaterialButton) && c(i2)) {
                i++;
            }
        }
        return i;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            WeakHashMap weakHashMap = gag.a;
            materialButton.setId(View.generateViewId());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.b);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    public final void a() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex != -1) {
            for (int i = firstVisibleChildIndex + 1; i < getChildCount(); i++) {
                MaterialButton materialButton = (MaterialButton) getChildAt(i);
                int min = Math.min(materialButton.getStrokeWidth(), ((MaterialButton) getChildAt(i - 1)).getStrokeWidth());
                ViewGroup.LayoutParams layoutParams = materialButton.getLayoutParams();
                LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
                if (getOrientation() == 0) {
                    layoutParams2.setMarginEnd(0);
                    layoutParams2.setMarginStart(-min);
                    layoutParams2.topMargin = 0;
                } else {
                    layoutParams2.bottomMargin = 0;
                    layoutParams2.topMargin = -min;
                    layoutParams2.setMarginStart(0);
                }
                materialButton.setLayoutParams(layoutParams2);
            }
            if (getChildCount() != 0 && firstVisibleChildIndex != -1) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((MaterialButton) getChildAt(firstVisibleChildIndex)).getLayoutParams();
                if (getOrientation() == 1) {
                    layoutParams3.topMargin = 0;
                    layoutParams3.bottomMargin = 0;
                    return;
                }
                layoutParams3.setMarginEnd(0);
                layoutParams3.setMarginStart(0);
                layoutParams3.leftMargin = 0;
                layoutParams3.rightMargin = 0;
            }
        }
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof MaterialButton) {
            super.addView(view, i, layoutParams);
            MaterialButton materialButton = (MaterialButton) view;
            setGeneratedIdIfNeeded(materialButton);
            setupButtonChild(materialButton);
            b(materialButton.getId(), materialButton.A0);
            j4e shapeAppearanceModel = materialButton.getShapeAppearanceModel();
            this.a.add(new og8(shapeAppearanceModel.e, shapeAppearanceModel.h, shapeAppearanceModel.f, shapeAppearanceModel.g));
            materialButton.setEnabled(isEnabled());
            gag.j(materialButton, new el0(3, this));
        }
    }

    public final void b(int i, boolean z2) {
        if (i != -1) {
            HashSet hashSet = new HashSet(this.v0);
            if (z2 && !hashSet.contains(Integer.valueOf(i))) {
                if (this.x && !hashSet.isEmpty()) {
                    hashSet.clear();
                }
                hashSet.add(Integer.valueOf(i));
            } else if (!z2 && hashSet.contains(Integer.valueOf(i))) {
                if (!this.y || hashSet.size() > 1) {
                    hashSet.remove(Integer.valueOf(i));
                }
            } else {
                return;
            }
            d(hashSet);
        }
    }

    public final boolean c(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    public final void d(Set set) {
        HashSet hashSet = this.v0;
        this.v0 = new HashSet(set);
        for (int i = 0; i < getChildCount(); i++) {
            int id = ((MaterialButton) getChildAt(i)).getId();
            boolean contains = set.contains(Integer.valueOf(id));
            View findViewById = findViewById(id);
            if (findViewById instanceof MaterialButton) {
                this.w = true;
                ((MaterialButton) findViewById).setChecked(contains);
                this.w = false;
            }
            if (hashSet.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                boolean contains2 = set.contains(Integer.valueOf(id));
                Iterator it = this.c.iterator();
                while (it.hasNext()) {
                    ((pg8) it.next()).a(id, contains2);
                }
            }
        }
        invalidate();
    }

    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.o);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put((MaterialButton) getChildAt(i), Integer.valueOf(i));
        }
        this.v = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    public final void e() {
        og8 og8;
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i = 0; i < childCount; i++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i);
            if (materialButton.getVisibility() != 8) {
                ypg e = materialButton.getShapeAppearanceModel().e();
                og8 og82 = (og8) this.a.get(i);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    boolean z2 = getOrientation() == 0;
                    d0 d0Var = og8.e;
                    if (i == firstVisibleChildIndex) {
                        og8 = z2 ? ct.x(this) ? new og8(d0Var, d0Var, og82.b, og82.c) : new og8(og82.a, og82.d, d0Var, d0Var) : new og8(og82.a, d0Var, og82.b, d0Var);
                    } else if (i == lastVisibleChildIndex) {
                        og8 = z2 ? ct.x(this) ? new og8(og82.a, og82.d, d0Var, d0Var) : new og8(d0Var, d0Var, og82.b, og82.c) : new og8(d0Var, og82.d, d0Var, og82.c);
                    } else {
                        og82 = null;
                    }
                    og82 = og8;
                }
                if (og82 == null) {
                    e.e = new d0(c44.DEFAULT_ASPECT_RATIO);
                    e.f = new d0(c44.DEFAULT_ASPECT_RATIO);
                    e.g = new d0(c44.DEFAULT_ASPECT_RATIO);
                    e.h = new d0(c44.DEFAULT_ASPECT_RATIO);
                } else {
                    e.e = og82.a;
                    e.h = og82.d;
                    e.f = og82.b;
                    e.g = og82.c;
                }
                materialButton.setShapeAppearanceModel(e.c());
            }
        }
    }

    public int getCheckedButtonId() {
        if (!this.x || this.v0.isEmpty()) {
            return -1;
        }
        return ((Integer) this.v0.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            int id = ((MaterialButton) getChildAt(i)).getId();
            if (this.v0.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    public final int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.v;
        return (numArr == null || i2 >= numArr.length) ? i2 : numArr[i2].intValue();
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.z;
        if (i != -1) {
            d(Collections.singleton(Integer.valueOf(i)));
        }
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) e4.q(1, getVisibleButtonCount(), this.x ? 1 : 2).b);
    }

    public final void onMeasure(int i, int i2) {
        e();
        a();
        super.onMeasure(i, i2);
    }

    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal((lg8) null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.a.remove(indexOfChild);
        }
        e();
        a();
    }

    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
        for (int i = 0; i < getChildCount(); i++) {
            ((MaterialButton) getChildAt(i)).setEnabled(z2);
        }
    }

    public void setSelectionRequired(boolean z2) {
        this.y = z2;
    }

    public void setSingleSelection(boolean z2) {
        if (this.x != z2) {
            this.x = z2;
            d(new HashSet());
        }
        for (int i = 0; i < getChildCount(); i++) {
            ((MaterialButton) getChildAt(i)).setA11yClassName((this.x ? RadioButton.class : ToggleButton.class).getName());
        }
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
