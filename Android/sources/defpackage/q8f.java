package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.tabs.TabLayout;
import java.util.WeakHashMap;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: q8f  reason: default package */
public final class q8f extends LinearLayout {
    public static final /* synthetic */ int x0 = 0;
    public o8f a;
    public TextView b;
    public ImageView c;
    public View o;
    public rg0 v;
    public int v0 = 2;
    public View w;
    public final /* synthetic */ TabLayout w0;
    public TextView x;
    public ImageView y;
    public Drawable z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q8f(TabLayout tabLayout, Context context) {
        super(context);
        this.w0 = tabLayout;
        f(context);
        int i = tabLayout.v;
        WeakHashMap weakHashMap = gag.a;
        setPaddingRelative(i, tabLayout.w, tabLayout.x, tabLayout.y);
        setGravity(17);
        setOrientation(tabLayout.P0 ^ true ? 1 : 0);
        setClickable(true);
        x9g.d(this, hqb.b(getContext(), 1002));
    }

    private rg0 getBadge() {
        return this.v;
    }

    private rg0 getOrCreateBadge() {
        if (this.v == null) {
            Context context = getContext();
            this.v = new rg0(rg0.x0, rg0.w0, context);
        }
        c();
        rg0 rg0 = this.v;
        if (rg0 != null) {
            return rg0;
        }
        throw new IllegalStateException("Unable to create badge");
    }

    public final void a(View view) {
        if (this.v != null && view != null) {
            setClipChildren(false);
            setClipToPadding(false);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(false);
                viewGroup.setClipToPadding(false);
            }
            rg0 rg0 = this.v;
            Rect rect = new Rect();
            view.getDrawingRect(rect);
            rg0.setBounds(rect);
            rg0.h(view, (FrameLayout) null);
            if (rg0.c() != null) {
                rg0.c().setForeground(rg0);
            } else {
                view.getOverlay().add(rg0);
            }
            this.o = view;
        }
    }

    public final void b() {
        if (this.v != null) {
            setClipChildren(true);
            setClipToPadding(true);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(true);
                viewGroup.setClipToPadding(true);
            }
            View view = this.o;
            if (view != null) {
                rg0 rg0 = this.v;
                if (rg0 != null) {
                    if (rg0.c() != null) {
                        rg0.c().setForeground((Drawable) null);
                    } else {
                        view.getOverlay().remove(rg0);
                    }
                }
                this.o = null;
            }
        }
    }

    public final void c() {
        o8f o8f;
        if (this.v == null) {
            return;
        }
        if (this.w != null) {
            b();
            return;
        }
        ImageView imageView = this.c;
        if (imageView == null || (o8f = this.a) == null || o8f.b == null) {
            TextView textView = this.b;
            if (textView == null || this.a == null) {
                b();
            } else if (this.o != textView) {
                b();
                a(this.b);
            } else {
                d(textView);
            }
        } else if (this.o != imageView) {
            b();
            a(this.c);
        } else {
            d(imageView);
        }
    }

    public final void d(View view) {
        rg0 rg0 = this.v;
        if (rg0 != null && view == this.o) {
            Rect rect = new Rect();
            view.getDrawingRect(rect);
            rg0.setBounds(rect);
            rg0.h(view, (FrameLayout) null);
        }
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.z;
        if ((drawable == null || !drawable.isStateful()) ? false : this.z.setState(drawableState)) {
            invalidate();
            this.w0.invalidate();
        }
    }

    public final void e() {
        boolean z2;
        g();
        o8f o8f = this.a;
        if (o8f != null) {
            TabLayout tabLayout = o8f.g;
            if (tabLayout != null) {
                int selectedTabPosition = tabLayout.getSelectedTabPosition();
                if (selectedTabPosition != -1 && selectedTabPosition == o8f.e) {
                    z2 = true;
                    setSelected(z2);
                }
            } else {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
        }
        z2 = false;
        setSelected(z2);
    }

    /* JADX WARNING: type inference failed for: r3v5, types: [android.graphics.drawable.RippleDrawable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(android.content.Context r10) {
        /*
            r9 = this;
            com.google.android.material.tabs.TabLayout r0 = r9.w0
            int r1 = r0.F0
            r2 = 0
            if (r1 == 0) goto L_0x001f
            android.graphics.drawable.Drawable r10 = defpackage.iq.D(r10, r1)
            r9.z = r10
            if (r10 == 0) goto L_0x0021
            boolean r10 = r10.isStateful()
            if (r10 == 0) goto L_0x0021
            android.graphics.drawable.Drawable r10 = r9.z
            int[] r1 = r9.getDrawableState()
            r10.setState(r1)
            goto L_0x0021
        L_0x001f:
            r9.z = r2
        L_0x0021:
            android.graphics.drawable.GradientDrawable r10 = new android.graphics.drawable.GradientDrawable
            r10.<init>()
            r1 = 0
            r10.setColor(r1)
            android.content.res.ColorStateList r1 = r0.z0
            if (r1 == 0) goto L_0x0071
            android.graphics.drawable.GradientDrawable r1 = new android.graphics.drawable.GradientDrawable
            r1.<init>()
            r3 = 925353388(0x3727c5ac, float:1.0E-5)
            r1.setCornerRadius(r3)
            r3 = -1
            r1.setColor(r3)
            android.content.res.ColorStateList r3 = r0.z0
            int[] r4 = defpackage.ld8.Y
            int[] r5 = defpackage.ld8.X
            int r5 = defpackage.ld8.G(r3, r5)
            int[] r6 = defpackage.ld8.z
            int r7 = defpackage.ld8.G(r3, r6)
            int[] r8 = android.util.StateSet.NOTHING
            int[][] r4 = new int[][]{r4, r6, r8}
            int[] r6 = defpackage.ld8.y
            int r3 = defpackage.ld8.G(r3, r6)
            int[] r3 = new int[]{r5, r7, r3}
            android.content.res.ColorStateList r5 = new android.content.res.ColorStateList
            r5.<init>(r4, r3)
            android.graphics.drawable.RippleDrawable r3 = new android.graphics.drawable.RippleDrawable
            boolean r4 = r0.T0
            if (r4 == 0) goto L_0x0069
            r10 = r2
        L_0x0069:
            if (r4 == 0) goto L_0x006c
            goto L_0x006d
        L_0x006c:
            r2 = r1
        L_0x006d:
            r3.<init>(r5, r10, r2)
            r10 = r3
        L_0x0071:
            java.util.WeakHashMap r1 = defpackage.gag.a
            r9.setBackground(r10)
            r0.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q8f.f(android.content.Context):void");
    }

    public final void g() {
        int i;
        ViewParent parent;
        o8f o8f = this.a;
        View view = o8f != null ? o8f.f : null;
        if (view != null) {
            ViewParent parent2 = view.getParent();
            if (parent2 != this) {
                if (parent2 != null) {
                    ((ViewGroup) parent2).removeView(view);
                }
                View view2 = this.w;
                if (!(view2 == null || (parent = view2.getParent()) == null)) {
                    ((ViewGroup) parent).removeView(this.w);
                }
                addView(view);
            }
            this.w = view;
            TextView textView = this.b;
            if (textView != null) {
                textView.setVisibility(8);
            }
            ImageView imageView = this.c;
            if (imageView != null) {
                imageView.setVisibility(8);
                this.c.setImageDrawable((Drawable) null);
            }
            TextView textView2 = (TextView) view.findViewById(16908308);
            this.x = textView2;
            if (textView2 != null) {
                this.v0 = textView2.getMaxLines();
            }
            this.y = (ImageView) view.findViewById(16908294);
        } else {
            View view3 = this.w;
            if (view3 != null) {
                removeView(view3);
                this.w = null;
            }
            this.x = null;
            this.y = null;
        }
        if (this.w == null) {
            if (this.c == null) {
                ImageView imageView2 = (ImageView) LayoutInflater.from(getContext()).inflate(qjc.design_layout_tab_icon, this, false);
                this.c = imageView2;
                addView(imageView2, 0);
            }
            if (this.b == null) {
                TextView textView3 = (TextView) LayoutInflater.from(getContext()).inflate(qjc.design_layout_tab_text, this, false);
                this.b = textView3;
                addView(textView3);
                this.v0 = this.b.getMaxLines();
            }
            TextView textView4 = this.b;
            TabLayout tabLayout = this.w0;
            textView4.setTextAppearance(tabLayout.z);
            if (!isSelected() || (i = tabLayout.w0) == -1) {
                this.b.setTextAppearance(tabLayout.v0);
            } else {
                this.b.setTextAppearance(i);
            }
            ColorStateList colorStateList = tabLayout.x0;
            if (colorStateList != null) {
                this.b.setTextColor(colorStateList);
            }
            h(this.b, this.c, true);
            c();
            ImageView imageView3 = this.c;
            if (imageView3 != null) {
                imageView3.addOnLayoutChangeListener(new nn1(this, imageView3));
            }
            TextView textView5 = this.b;
            if (textView5 != null) {
                textView5.addOnLayoutChangeListener(new nn1(this, textView5));
            }
        } else {
            TextView textView6 = this.x;
            if (!(textView6 == null && this.y == null)) {
                h(textView6, this.y, false);
            }
        }
        if (o8f != null && !TextUtils.isEmpty(o8f.d)) {
            setContentDescription(o8f.d);
        }
    }

    public int getContentHeight() {
        View[] viewArr = {this.b, this.c, this.w};
        int i = 0;
        int i2 = 0;
        boolean z2 = false;
        for (int i3 = 0; i3 < 3; i3++) {
            View view = viewArr[i3];
            if (view != null && view.getVisibility() == 0) {
                i2 = z2 ? Math.min(i2, view.getTop()) : view.getTop();
                i = z2 ? Math.max(i, view.getBottom()) : view.getBottom();
                z2 = true;
            }
        }
        return i - i2;
    }

    public int getContentWidth() {
        View[] viewArr = {this.b, this.c, this.w};
        int i = 0;
        int i2 = 0;
        boolean z2 = false;
        for (int i3 = 0; i3 < 3; i3++) {
            View view = viewArr[i3];
            if (view != null && view.getVisibility() == 0) {
                i2 = z2 ? Math.min(i2, view.getLeft()) : view.getLeft();
                i = z2 ? Math.max(i, view.getRight()) : view.getRight();
                z2 = true;
            }
        }
        return i - i2;
    }

    public o8f getTab() {
        return this.a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = r0.b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(android.widget.TextView r9, android.widget.ImageView r10, boolean r11) {
        /*
            r8 = this;
            o8f r0 = r8.a
            r1 = 0
            if (r0 == 0) goto L_0x000e
            android.graphics.drawable.Drawable r0 = r0.b
            if (r0 == 0) goto L_0x000e
            android.graphics.drawable.Drawable r0 = r0.mutate()
            goto L_0x000f
        L_0x000e:
            r0 = r1
        L_0x000f:
            com.google.android.material.tabs.TabLayout r2 = r8.w0
            if (r0 == 0) goto L_0x001f
            android.content.res.ColorStateList r3 = r2.y0
            defpackage.ru4.h(r0, r3)
            android.graphics.PorterDuff$Mode r3 = r2.C0
            if (r3 == 0) goto L_0x001f
            defpackage.ru4.i(r0, r3)
        L_0x001f:
            o8f r3 = r8.a
            if (r3 == 0) goto L_0x0026
            java.lang.CharSequence r3 = r3.c
            goto L_0x0027
        L_0x0026:
            r3 = r1
        L_0x0027:
            r4 = 8
            r5 = 0
            if (r10 == 0) goto L_0x003e
            if (r0 == 0) goto L_0x0038
            r10.setImageDrawable(r0)
            r10.setVisibility(r5)
            r8.setVisibility(r5)
            goto L_0x003e
        L_0x0038:
            r10.setVisibility(r4)
            r10.setImageDrawable(r1)
        L_0x003e:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            r6 = 1
            r0 = r0 ^ r6
            if (r9 == 0) goto L_0x0065
            if (r0 == 0) goto L_0x004e
            o8f r7 = r8.a
            r7.getClass()
            goto L_0x004f
        L_0x004e:
            r6 = r5
        L_0x004f:
            if (r0 == 0) goto L_0x0053
            r7 = r3
            goto L_0x0054
        L_0x0053:
            r7 = r1
        L_0x0054:
            r9.setText(r7)
            if (r6 == 0) goto L_0x005b
            r7 = r5
            goto L_0x005c
        L_0x005b:
            r7 = r4
        L_0x005c:
            r9.setVisibility(r7)
            if (r0 == 0) goto L_0x0066
            r8.setVisibility(r5)
            goto L_0x0066
        L_0x0065:
            r6 = r5
        L_0x0066:
            if (r11 == 0) goto L_0x00a8
            if (r10 == 0) goto L_0x00a8
            android.view.ViewGroup$LayoutParams r9 = r10.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r9 = (android.view.ViewGroup.MarginLayoutParams) r9
            if (r6 == 0) goto L_0x0082
            int r11 = r10.getVisibility()
            if (r11 != 0) goto L_0x0082
            android.content.Context r11 = r8.getContext()
            float r11 = defpackage.ct.j(r4, r11)
            int r11 = (int) r11
            goto L_0x0083
        L_0x0082:
            r11 = r5
        L_0x0083:
            boolean r2 = r2.P0
            if (r2 == 0) goto L_0x0099
            int r2 = r9.getMarginEnd()
            if (r11 == r2) goto L_0x00a8
            r9.setMarginEnd(r11)
            r9.bottomMargin = r5
            r10.setLayoutParams(r9)
            r10.requestLayout()
            goto L_0x00a8
        L_0x0099:
            int r2 = r9.bottomMargin
            if (r11 == r2) goto L_0x00a8
            r9.bottomMargin = r11
            r9.setMarginEnd(r5)
            r10.setLayoutParams(r9)
            r10.requestLayout()
        L_0x00a8:
            o8f r9 = r8.a
            if (r9 == 0) goto L_0x00ae
            java.lang.CharSequence r1 = r9.d
        L_0x00ae:
            if (r0 == 0) goto L_0x00b1
            goto L_0x00b2
        L_0x00b1:
            r3 = r1
        L_0x00b2:
            defpackage.pmf.a(r8, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q8f.h(android.widget.TextView, android.widget.ImageView, boolean):void");
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        Context context;
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        rg0 rg0 = this.v;
        if (rg0 != null && rg0.isVisible()) {
            rg0 rg02 = this.v;
            CharSequence charSequence = null;
            if (rg02.isVisible()) {
                sg0 sg0 = rg02.v.b;
                String str = sg0.X;
                if (str != null) {
                    CharSequence charSequence2 = sg0.x0;
                    charSequence = charSequence2 != null ? charSequence2 : str;
                } else if (!rg02.f()) {
                    charSequence = sg0.y0;
                } else if (!(sg0.z0 == 0 || (context = (Context) rg02.a.get()) == null)) {
                    charSequence = (rg02.y == -2 || rg02.d() <= (i = rg02.y)) ? context.getResources().getQuantityString(sg0.z0, rg02.d(), new Object[]{Integer.valueOf(rg02.d())}) : context.getString(sg0.A0, new Object[]{Integer.valueOf(i)});
                }
            }
            accessibilityNodeInfo.setContentDescription(charSequence);
        }
        accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) f4.a(isSelected(), 0, 1, this.a.e, 1).a);
        if (isSelected()) {
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) a4.e.a);
        }
        accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(ymc.item_view_role_description));
    }

    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        TabLayout tabLayout = this.w0;
        int tabMaxWidth = tabLayout.getTabMaxWidth();
        if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
            i = View.MeasureSpec.makeMeasureSpec(tabLayout.G0, IntCompanionObject.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.b != null) {
            float f = tabLayout.D0;
            int i3 = this.v0;
            ImageView imageView = this.c;
            if (imageView == null || imageView.getVisibility() != 0) {
                TextView textView = this.b;
                if (textView != null && textView.getLineCount() > 1) {
                    f = tabLayout.E0;
                }
            } else {
                i3 = 1;
            }
            float textSize = this.b.getTextSize();
            int lineCount = this.b.getLineCount();
            int maxLines = this.b.getMaxLines();
            int i4 = (f > textSize ? 1 : (f == textSize ? 0 : -1));
            if (i4 != 0 || (maxLines >= 0 && i3 != maxLines)) {
                if (tabLayout.O0 == 1 && i4 > 0 && lineCount == 1) {
                    Layout layout = this.b.getLayout();
                    if (layout != null) {
                        if ((f / layout.getPaint().getTextSize()) * layout.getLineWidth(0) > ((float) ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()))) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                this.b.setTextSize(0, f);
                this.b.setMaxLines(i3);
                super.onMeasure(i, i2);
            }
        }
    }

    public final boolean performClick() {
        boolean performClick = super.performClick();
        if (this.a == null) {
            return performClick;
        }
        if (!performClick) {
            playSoundEffect(0);
        }
        o8f o8f = this.a;
        TabLayout tabLayout = o8f.g;
        if (tabLayout != null) {
            tabLayout.m(o8f, true);
            return true;
        }
        throw new IllegalArgumentException("Tab not attached to a TabLayout");
    }

    public void setSelected(boolean z2) {
        isSelected();
        super.setSelected(z2);
        TextView textView = this.b;
        if (textView != null) {
            textView.setSelected(z2);
        }
        ImageView imageView = this.c;
        if (imageView != null) {
            imageView.setSelected(z2);
        }
        View view = this.w;
        if (view != null) {
            view.setSelected(z2);
        }
    }

    public void setTab(o8f o8f) {
        if (o8f != this.a) {
            this.a = o8f;
            e();
        }
    }
}
