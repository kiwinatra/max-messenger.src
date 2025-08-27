package com.futuremind.recyclerviewfastscroll;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.InsetDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

public class FastScroller extends LinearLayout {
    public static final /* synthetic */ int z0 = 0;
    public final t65 a = new t65(this);
    public RecyclerView b;
    public View c;
    public View o;
    public TextView v;
    public int v0;
    public int w;
    public int w0;
    public int x;
    public boolean x0;
    public int y;
    public lid y0;
    public int z;

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r4v3, types: [lid, java.lang.Object] */
    public FastScroller(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setClipChildren(false);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, unc.fastscroll__fastScroller, fdc.fastscroll__style, 0);
        try {
            this.y = obtainStyledAttributes.getColor(unc.fastscroll__fastScroller_fastscroll__bubbleColor, -1);
            this.x = obtainStyledAttributes.getColor(unc.fastscroll__fastScroller_fastscroll__handleColor, -1);
            this.z = obtainStyledAttributes.getResourceId(unc.fastscroll__fastScroller_fastscroll__bubbleTextAppearance, -1);
            obtainStyledAttributes.recycle();
            this.w0 = getVisibility();
            setViewProvider(new Object());
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* access modifiers changed from: private */
    public void setRecyclerViewPosition(float f) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            int j = recyclerView.getAdapter().j();
            float max = Math.max(c44.DEFAULT_ASPECT_RATIO, (float) ((int) (f * ((float) j))));
            this.b.z0((int) Math.min(max, (float) (j - 1)));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x005c, code lost:
        if ((r3.b.getAdapter().j() * r3.b.getChildAt(0).getWidth()) <= r3.b.getWidth()) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003e, code lost:
        if ((r3.b.getAdapter().j() * r3.b.getChildAt(0).getHeight()) <= r3.b.getHeight()) goto L_0x0068;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r3 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r3.b
            tyc r0 = r0.getAdapter()
            if (r0 == 0) goto L_0x0068
            androidx.recyclerview.widget.RecyclerView r0 = r3.b
            tyc r0 = r0.getAdapter()
            int r0 = r0.j()
            if (r0 == 0) goto L_0x0068
            androidx.recyclerview.widget.RecyclerView r0 = r3.b
            r1 = 0
            android.view.View r0 = r0.getChildAt(r1)
            if (r0 == 0) goto L_0x0068
            boolean r0 = r3.c()
            if (r0 == 0) goto L_0x0041
            androidx.recyclerview.widget.RecyclerView r0 = r3.b
            android.view.View r0 = r0.getChildAt(r1)
            int r0 = r0.getHeight()
            androidx.recyclerview.widget.RecyclerView r2 = r3.b
            tyc r2 = r2.getAdapter()
            int r2 = r2.j()
            int r2 = r2 * r0
            androidx.recyclerview.widget.RecyclerView r0 = r3.b
            int r0 = r0.getHeight()
            if (r2 > r0) goto L_0x005f
            goto L_0x0068
        L_0x0041:
            androidx.recyclerview.widget.RecyclerView r0 = r3.b
            android.view.View r0 = r0.getChildAt(r1)
            int r0 = r0.getWidth()
            androidx.recyclerview.widget.RecyclerView r2 = r3.b
            tyc r2 = r2.getAdapter()
            int r2 = r2.j()
            int r2 = r2 * r0
            androidx.recyclerview.widget.RecyclerView r0 = r3.b
            int r0 = r0.getWidth()
            if (r2 > r0) goto L_0x005f
            goto L_0x0068
        L_0x005f:
            int r0 = r3.w0
            if (r0 == 0) goto L_0x0064
            goto L_0x0068
        L_0x0064:
            super.setVisibility(r1)
            goto L_0x006c
        L_0x0068:
            r0 = 4
            super.setVisibility(r0)
        L_0x006c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.futuremind.recyclerviewfastscroll.FastScroller.b():void");
    }

    public final boolean c() {
        return this.v0 == 1;
    }

    public lid getViewProvider() {
        return this.y0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x005b, code lost:
        r3 = r0.o;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0044, code lost:
        r3 = r0.v;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
        /*
            r0 = this;
            super.onLayout(r1, r2, r3, r4, r5)
            android.view.View r1 = r0.o
            ih5 r2 = new ih5
            r3 = 0
            r2.<init>(r3, r0)
            r1.setOnTouchListener(r2)
            lid r1 = r0.y0
            di4 r1 = (defpackage.di4) r1
            com.futuremind.recyclerviewfastscroll.FastScroller r2 = r1.a
            boolean r2 = r2.c()
            r3 = 1073741824(0x40000000, float:2.0)
            if (r2 == 0) goto L_0x002d
            android.view.View r2 = r1.d
            int r2 = r2.getHeight()
            float r2 = (float) r2
            float r2 = r2 / r3
            android.view.View r1 = r1.c
            int r1 = r1.getHeight()
        L_0x002a:
            float r1 = (float) r1
            float r2 = r2 - r1
            goto L_0x003c
        L_0x002d:
            android.view.View r2 = r1.d
            int r2 = r2.getWidth()
            float r2 = (float) r2
            float r2 = r2 / r3
            android.view.View r1 = r1.c
            int r1 = r1.getWidth()
            goto L_0x002a
        L_0x003c:
            int r1 = (int) r2
            r0.w = r1
            int r1 = r0.y
            r2 = -1
            if (r1 == r2) goto L_0x0057
            android.widget.TextView r3 = r0.v
            android.graphics.drawable.Drawable r4 = r3.getBackground()
            if (r4 != 0) goto L_0x004d
            goto L_0x0057
        L_0x004d:
            android.graphics.drawable.Drawable r5 = r4.mutate()
            defpackage.ru4.g(r5, r1)
            r3.setBackground(r4)
        L_0x0057:
            int r1 = r0.x
            if (r1 == r2) goto L_0x006e
            android.view.View r3 = r0.o
            android.graphics.drawable.Drawable r4 = r3.getBackground()
            if (r4 != 0) goto L_0x0064
            goto L_0x006e
        L_0x0064:
            android.graphics.drawable.Drawable r5 = r4.mutate()
            defpackage.ru4.g(r5, r1)
            r3.setBackground(r4)
        L_0x006e:
            int r1 = r0.z
            if (r1 == r2) goto L_0x0077
            android.widget.TextView r2 = r0.v
            r2.setTextAppearance(r1)
        L_0x0077:
            boolean r1 = r0.isInEditMode()
            if (r1 != 0) goto L_0x0084
            t65 r1 = r0.a
            androidx.recyclerview.widget.RecyclerView r0 = r0.b
            r1.c(r0)
        L_0x0084:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.futuremind.recyclerviewfastscroll.FastScroller.onLayout(boolean, int, int, int, int):void");
    }

    public void setBubbleColor(int i) {
        this.y = i;
        invalidate();
    }

    public void setBubbleTextAppearance(int i) {
        this.z = i;
        invalidate();
    }

    public void setHandleColor(int i) {
        this.x = i;
        invalidate();
    }

    public void setOrientation(int i) {
        this.v0 = i;
        super.setOrientation(i == 0 ? 1 : 0);
    }

    public void setRecyclerView(RecyclerView recyclerView) {
        this.b = recyclerView;
        recyclerView.getAdapter();
        recyclerView.m(this.a);
        b();
        recyclerView.setOnHierarchyChangeListener(new vz3(1, this));
    }

    public void setScrollerPosition(float f) {
        if (c()) {
            this.c.setY(Math.min(Math.max(c44.DEFAULT_ASPECT_RATIO, (((float) (getHeight() - this.o.getHeight())) * f) + ((float) this.w)), (float) (getHeight() - this.c.getHeight())));
            this.o.setY(Math.min(Math.max(c44.DEFAULT_ASPECT_RATIO, f * ((float) (getHeight() - this.o.getHeight()))), (float) (getHeight() - this.o.getHeight())));
            return;
        }
        this.c.setX(Math.min(Math.max(c44.DEFAULT_ASPECT_RATIO, (((float) (getWidth() - this.o.getWidth())) * f) + ((float) this.w)), (float) (getWidth() - this.c.getWidth())));
        this.o.setX(Math.min(Math.max(c44.DEFAULT_ASPECT_RATIO, f * ((float) (getWidth() - this.o.getWidth()))), (float) (getWidth() - this.o.getWidth())));
    }

    public void setViewProvider(lid lid) {
        removeAllViews();
        this.y0 = lid;
        lid.a = this;
        di4 di4 = (di4) lid;
        int i = 0;
        View inflate = LayoutInflater.from(di4.a.getContext()).inflate(rjc.fastscroll__default_bubble, this, false);
        di4.c = inflate;
        this.c = inflate;
        di4.d = new View(di4.a.getContext());
        int dimensionPixelSize = di4.a.c() ? 0 : di4.a.getContext().getResources().getDimensionPixelSize(jec.fastscroll__handle_inset);
        if (di4.a.c()) {
            i = di4.a.getContext().getResources().getDimensionPixelSize(jec.fastscroll__handle_inset);
        }
        int i2 = i;
        di4.d.setBackground(new InsetDrawable(ew3.b(di4.a.getContext(), rfc.fastscroll__default_handle), i2, dimensionPixelSize, i2, dimensionPixelSize));
        di4.d.setLayoutParams(new ViewGroup.LayoutParams(di4.a.getContext().getResources().getDimensionPixelSize(di4.a.c() ? jec.fastscroll__handle_clickable_width : jec.fastscroll__handle_height), di4.a.getContext().getResources().getDimensionPixelSize(di4.a.c() ? jec.fastscroll__handle_height : jec.fastscroll__handle_clickable_width)));
        this.o = di4.d;
        this.v = (TextView) di4.c;
        addView(this.c);
        addView(this.o);
    }

    public void setVisibility(int i) {
        this.w0 = i;
        b();
    }
}
