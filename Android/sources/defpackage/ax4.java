package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.InvocationTargetException;

/* renamed from: ax4  reason: default package */
public class ax4 extends ListView {
    public final Rect a = new Rect();
    public int b = 0;
    public int c = 0;
    public int o = 0;
    public int v = 0;
    public boolean v0;
    public int w;
    public wz7 w0;
    public yw4 x;
    public cf x0;
    public boolean y;
    public final boolean z;

    public ax4(Context context, boolean z2) {
        super(context, (AttributeSet) null, hdc.dropDownListViewStyle);
        this.z = z2;
        setCacheColorHint(0);
    }

    public final int a(int i, int i2) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i3 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i4 = 0;
        View view = null;
        for (int i5 = 0; i5 < count; i5++) {
            int itemViewType = adapter.getItemViewType(i5);
            if (itemViewType != i4) {
                view = null;
                i4 = itemViewType;
            }
            view = adapter.getView(i5, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i6 = layoutParams.height;
            view.measure(i, i6 > 0 ? View.MeasureSpec.makeMeasureSpec(i6, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i5 > 0) {
                i3 += dividerHeight;
            }
            i3 += view.getMeasuredHeight();
            if (i3 >= i2) {
                return i2;
            }
        }
        return i3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x017a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(android.view.MotionEvent r17, int r18) {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            int r3 = r17.getActionMasked()
            r4 = 1
            r5 = 0
            if (r3 == r4) goto L_0x001a
            r0 = 2
            if (r3 == r0) goto L_0x0018
            r0 = 3
            if (r3 == r0) goto L_0x0015
            r0 = r4
            goto L_0x0146
        L_0x0015:
            r0 = r5
            goto L_0x0146
        L_0x0018:
            r0 = r4
            goto L_0x001b
        L_0x001a:
            r0 = r5
        L_0x001b:
            int r6 = r17.findPointerIndex(r18)
            if (r6 >= 0) goto L_0x0022
            goto L_0x0015
        L_0x0022:
            float r7 = r2.getX(r6)
            int r7 = (int) r7
            float r6 = r2.getY(r6)
            int r6 = (int) r6
            int r8 = r1.pointToPosition(r7, r6)
            r9 = -1
            if (r8 != r9) goto L_0x0036
            r5 = r4
            goto L_0x0146
        L_0x0036:
            int r0 = r16.getFirstVisiblePosition()
            int r0 = r8 - r0
            android.view.View r10 = r1.getChildAt(r0)
            float r7 = (float) r7
            float r6 = (float) r6
            r1.v0 = r4
            int r0 = android.os.Build.VERSION.SDK_INT
            defpackage.vw4.a(r1, r7, r6)
            boolean r11 = r16.isPressed()
            if (r11 != 0) goto L_0x0052
            r1.setPressed(r4)
        L_0x0052:
            r16.layoutChildren()
            int r11 = r1.w
            if (r11 == r9) goto L_0x006f
            int r12 = r16.getFirstVisiblePosition()
            int r11 = r11 - r12
            android.view.View r11 = r1.getChildAt(r11)
            if (r11 == 0) goto L_0x006f
            if (r11 == r10) goto L_0x006f
            boolean r12 = r11.isPressed()
            if (r12 == 0) goto L_0x006f
            r11.setPressed(r5)
        L_0x006f:
            r1.w = r8
            int r11 = r10.getLeft()
            float r11 = (float) r11
            float r11 = r7 - r11
            int r12 = r10.getTop()
            float r12 = (float) r12
            float r12 = r6 - r12
            defpackage.vw4.a(r10, r11, r12)
            boolean r11 = r10.isPressed()
            if (r11 != 0) goto L_0x008b
            r10.setPressed(r4)
        L_0x008b:
            android.graphics.drawable.Drawable r11 = r16.getSelector()
            if (r11 == 0) goto L_0x0095
            if (r8 == r9) goto L_0x0095
            r12 = r4
            goto L_0x0096
        L_0x0095:
            r12 = r5
        L_0x0096:
            if (r12 == 0) goto L_0x009b
            r11.setVisible(r5, r5)
        L_0x009b:
            int r13 = r10.getLeft()
            int r14 = r10.getTop()
            int r15 = r10.getRight()
            int r5 = r10.getBottom()
            android.graphics.Rect r9 = r1.a
            r9.set(r13, r14, r15, r5)
            int r5 = r9.left
            int r13 = r1.b
            int r5 = r5 - r13
            r9.left = r5
            int r5 = r9.top
            int r13 = r1.c
            int r5 = r5 - r13
            r9.top = r5
            int r5 = r9.right
            int r13 = r1.o
            int r5 = r5 + r13
            r9.right = r5
            int r5 = r9.bottom
            int r13 = r1.v
            int r5 = r5 + r13
            r9.bottom = r5
            r5 = 33
            if (r0 < r5) goto L_0x00d5
            boolean r0 = defpackage.xw4.a(r16)
            goto L_0x00e4
        L_0x00d5:
            java.lang.reflect.Field r0 = defpackage.zw4.a
            if (r0 == 0) goto L_0x00e3
            boolean r0 = r0.getBoolean(r1)     // Catch:{ IllegalAccessException -> 0x00de }
            goto L_0x00e4
        L_0x00de:
            r0 = move-exception
            r13 = r0
            r13.printStackTrace()
        L_0x00e3:
            r0 = 0
        L_0x00e4:
            boolean r13 = r10.isEnabled()
            if (r13 == r0) goto L_0x010a
            r0 = r0 ^ r4
            int r13 = android.os.Build.VERSION.SDK_INT
            if (r13 < r5) goto L_0x00f4
            defpackage.xw4.b(r1, r0)
        L_0x00f2:
            r5 = -1
            goto L_0x0105
        L_0x00f4:
            java.lang.reflect.Field r5 = defpackage.zw4.a
            if (r5 == 0) goto L_0x00f2
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ IllegalAccessException -> 0x0100 }
            r5.set(r1, r0)     // Catch:{ IllegalAccessException -> 0x0100 }
            goto L_0x00f2
        L_0x0100:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x00f2
        L_0x0105:
            if (r8 == r5) goto L_0x010a
            r16.refreshDrawableState()
        L_0x010a:
            if (r12 == 0) goto L_0x0125
            float r0 = r9.exactCenterX()
            float r5 = r9.exactCenterY()
            int r9 = r16.getVisibility()
            if (r9 != 0) goto L_0x011d
            r9 = r4
        L_0x011b:
            r12 = 0
            goto L_0x011f
        L_0x011d:
            r9 = 0
            goto L_0x011b
        L_0x011f:
            r11.setVisible(r9, r12)
            defpackage.ru4.e(r11, r0, r5)
        L_0x0125:
            android.graphics.drawable.Drawable r0 = r16.getSelector()
            if (r0 == 0) goto L_0x0131
            r5 = -1
            if (r8 == r5) goto L_0x0131
            defpackage.ru4.e(r0, r7, r6)
        L_0x0131:
            yw4 r0 = r1.x
            if (r0 == 0) goto L_0x0138
            r5 = 0
            r0.b = r5
        L_0x0138:
            r16.refreshDrawableState()
            if (r3 != r4) goto L_0x0144
            long r5 = r1.getItemIdAtPosition(r8)
            r1.performItemClick(r10, r8, r5)
        L_0x0144:
            r0 = r4
            r5 = 0
        L_0x0146:
            if (r0 == 0) goto L_0x014a
            if (r5 == 0) goto L_0x0163
        L_0x014a:
            r3 = 0
            r1.v0 = r3
            r1.setPressed(r3)
            r16.drawableStateChanged()
            int r5 = r1.w
            int r6 = r16.getFirstVisiblePosition()
            int r5 = r5 - r6
            android.view.View r5 = r1.getChildAt(r5)
            if (r5 == 0) goto L_0x0163
            r5.setPressed(r3)
        L_0x0163:
            if (r0 == 0) goto L_0x017a
            wz7 r3 = r1.w0
            if (r3 != 0) goto L_0x0170
            wz7 r3 = new wz7
            r3.<init>(r1)
            r1.w0 = r3
        L_0x0170:
            wz7 r3 = r1.w0
            boolean r5 = r3.y0
            r3.y0 = r4
            r3.onTouch(r1, r2)
            goto L_0x0188
        L_0x017a:
            wz7 r1 = r1.w0
            if (r1 == 0) goto L_0x0188
            boolean r2 = r1.y0
            if (r2 == 0) goto L_0x0185
            r1.d()
        L_0x0185:
            r2 = 0
            r1.y0 = r2
        L_0x0188:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ax4.b(android.view.MotionEvent, int):boolean");
    }

    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.a;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    public final void drawableStateChanged() {
        if (this.x0 == null) {
            super.drawableStateChanged();
            yw4 yw4 = this.x;
            if (yw4 != null) {
                yw4.b = true;
            }
            Drawable selector = getSelector();
            if (selector != null && this.v0 && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
    }

    public final boolean hasFocus() {
        return this.z || super.hasFocus();
    }

    public final boolean hasWindowFocus() {
        return this.z || super.hasWindowFocus();
    }

    public final boolean isFocused() {
        return this.z || super.isFocused();
    }

    public final boolean isInTouchMode() {
        return (this.z && this.y) || super.isInTouchMode();
    }

    public final void onDetachedFromWindow() {
        this.x0 = null;
        super.onDetachedFromWindow();
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i = Build.VERSION.SDK_INT;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.x0 == null) {
            cf cfVar = new cf(18, this);
            this.x0 = cfVar;
            post(cfVar);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (!(pointToPosition == -1 || pointToPosition == getSelectedItemPosition())) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i < 30 || !ww4.d) {
                        setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                    } else {
                        try {
                            ww4.a.invoke(this, new Object[]{Integer.valueOf(pointToPosition), childAt, Boolean.FALSE, -1, -1});
                            ww4.b.invoke(this, new Object[]{Integer.valueOf(pointToPosition)});
                            ww4.c.invoke(this, new Object[]{Integer.valueOf(pointToPosition)});
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        } catch (InvocationTargetException e2) {
                            e2.printStackTrace();
                        }
                    }
                }
                Drawable selector = getSelector();
                if (selector != null && this.v0 && isPressed()) {
                    selector.setState(getDrawableState());
                }
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.w = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        cf cfVar = this.x0;
        if (cfVar != null) {
            ax4 ax4 = (ax4) cfVar.b;
            ax4.x0 = null;
            ax4.removeCallbacks(cfVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z2) {
        this.y = z2;
    }

    public void setSelector(Drawable drawable) {
        yw4 yw4;
        if (drawable != null) {
            yw4 = new yw4(drawable);
            yw4.b = true;
        } else {
            yw4 = null;
        }
        this.x = yw4;
        super.setSelector(yw4);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.b = rect.left;
        this.c = rect.top;
        this.o = rect.right;
        this.v = rect.bottom;
    }
}
