package androidx.appcompat.widget;

import android.animation.ObjectAnimator;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.IBinder;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.view.ActionMode;
import android.view.VelocityTracker;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.core.widget.a;
import java.util.WeakHashMap;

public class SwitchCompat extends CompoundButton implements t15 {
    public static final dz1 d1 = new dz1(Float.class, "thumbPos", 10);
    public static final int[] e1 = {16842912};
    public CharSequence A0;
    public CharSequence B0;
    public CharSequence C0;
    public CharSequence D0;
    public boolean E0;
    public int F0;
    public final int G0;
    public float H0;
    public float I0;
    public final VelocityTracker J0 = VelocityTracker.obtain();
    public final int K0;
    public float L0;
    public int M0;
    public int N0;
    public int O0;
    public int P0;
    public int Q0;
    public int R0;
    public int S0;
    public boolean T0 = true;
    public final TextPaint U0;
    public final ColorStateList V0;
    public StaticLayout W0;
    public StaticLayout X0;
    public final fd Y0;
    public ObjectAnimator Z0;
    public Drawable a;
    public jo a1;
    public ColorStateList b = null;
    public u35 b1;
    public PorterDuff.Mode c = null;
    public final Rect c1 = new Rect();
    public boolean o = false;
    public boolean v = false;
    public boolean v0 = false;
    public Drawable w;
    public int w0;
    public ColorStateList x = null;
    public int x0;
    public PorterDuff.Mode y = null;
    public int y0;
    public boolean z = false;
    public boolean z0;

    /* JADX WARNING: type inference failed for: r0v7, types: [java.lang.Object, fd] */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x011f, code lost:
        r4 = defpackage.q8.j((r4 = r1.getResourceId(r2, 0)), r14);
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SwitchCompat(android.content.Context r14, android.util.AttributeSet r15) {
        /*
            r13 = this;
            r0 = 1
            int r8 = defpackage.hdc.switchStyle
            r13.<init>(r14, r15, r8)
            r9 = 0
            r13.b = r9
            r13.c = r9
            r10 = 0
            r13.o = r10
            r13.v = r10
            r13.x = r9
            r13.y = r9
            r13.z = r10
            r13.v0 = r10
            android.view.VelocityTracker r1 = android.view.VelocityTracker.obtain()
            r13.J0 = r1
            r13.T0 = r0
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r13.c1 = r1
            android.content.Context r1 = r13.getContext()
            defpackage.zhf.a(r1, r13)
            android.text.TextPaint r11 = new android.text.TextPaint
            r11.<init>(r0)
            r13.U0 = r11
            android.content.res.Resources r1 = r13.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            r11.density = r1
            int[] r1 = defpackage.koc.SwitchCompat
            g6d r12 = defpackage.g6d.w(r14, r15, r1, r8, r10)
            int[] r3 = defpackage.koc.SwitchCompat
            java.util.WeakHashMap r1 = defpackage.gag.a
            java.lang.Object r1 = r12.c
            r5 = r1
            android.content.res.TypedArray r5 = (android.content.res.TypedArray) r5
            r7 = 0
            r1 = r13
            r2 = r14
            r4 = r15
            r6 = r8
            defpackage.bag.d(r1, r2, r3, r4, r5, r6, r7)
            int r1 = defpackage.koc.SwitchCompat_android_thumb
            android.graphics.drawable.Drawable r1 = r12.q(r1)
            r13.a = r1
            if (r1 == 0) goto L_0x0065
            r1.setCallback(r13)
        L_0x0065:
            int r1 = defpackage.koc.SwitchCompat_track
            android.graphics.drawable.Drawable r1 = r12.q(r1)
            r13.w = r1
            if (r1 == 0) goto L_0x0072
            r1.setCallback(r13)
        L_0x0072:
            int r1 = defpackage.koc.SwitchCompat_android_textOn
            java.lang.Object r2 = r12.c
            android.content.res.TypedArray r2 = (android.content.res.TypedArray) r2
            java.lang.CharSequence r1 = r2.getText(r1)
            r13.setTextOnInternal(r1)
            int r1 = defpackage.koc.SwitchCompat_android_textOff
            java.lang.CharSequence r1 = r2.getText(r1)
            r13.setTextOffInternal(r1)
            int r1 = defpackage.koc.SwitchCompat_showText
            boolean r1 = r2.getBoolean(r1, r0)
            r13.E0 = r1
            int r1 = defpackage.koc.SwitchCompat_thumbTextPadding
            int r1 = r2.getDimensionPixelSize(r1, r10)
            r13.w0 = r1
            int r1 = defpackage.koc.SwitchCompat_switchMinWidth
            int r1 = r2.getDimensionPixelSize(r1, r10)
            r13.x0 = r1
            int r1 = defpackage.koc.SwitchCompat_switchPadding
            int r1 = r2.getDimensionPixelSize(r1, r10)
            r13.y0 = r1
            int r1 = defpackage.koc.SwitchCompat_splitTrack
            boolean r1 = r2.getBoolean(r1, r10)
            r13.z0 = r1
            int r1 = defpackage.koc.SwitchCompat_thumbTint
            android.content.res.ColorStateList r1 = r12.o(r1)
            if (r1 == 0) goto L_0x00bc
            r13.b = r1
            r13.o = r0
        L_0x00bc:
            int r1 = defpackage.koc.SwitchCompat_thumbTintMode
            r3 = -1
            int r1 = r2.getInt(r1, r3)
            android.graphics.PorterDuff$Mode r1 = defpackage.yu4.c(r1, r9)
            android.graphics.PorterDuff$Mode r4 = r13.c
            if (r4 == r1) goto L_0x00cf
            r13.c = r1
            r13.v = r0
        L_0x00cf:
            boolean r1 = r13.o
            if (r1 != 0) goto L_0x00d7
            boolean r1 = r13.v
            if (r1 == 0) goto L_0x00da
        L_0x00d7:
            r13.b()
        L_0x00da:
            int r1 = defpackage.koc.SwitchCompat_trackTint
            android.content.res.ColorStateList r1 = r12.o(r1)
            if (r1 == 0) goto L_0x00e6
            r13.x = r1
            r13.z = r0
        L_0x00e6:
            int r1 = defpackage.koc.SwitchCompat_trackTintMode
            int r1 = r2.getInt(r1, r3)
            android.graphics.PorterDuff$Mode r1 = defpackage.yu4.c(r1, r9)
            android.graphics.PorterDuff$Mode r4 = r13.y
            if (r4 == r1) goto L_0x00f8
            r13.y = r1
            r13.v0 = r0
        L_0x00f8:
            boolean r1 = r13.z
            if (r1 != 0) goto L_0x0100
            boolean r1 = r13.v0
            if (r1 == 0) goto L_0x0103
        L_0x0100:
            r13.c()
        L_0x0103:
            int r1 = defpackage.koc.SwitchCompat_switchTextAppearance
            int r1 = r2.getResourceId(r1, r10)
            if (r1 == 0) goto L_0x01d0
            int[] r2 = defpackage.koc.TextAppearance
            android.content.res.TypedArray r1 = r14.obtainStyledAttributes(r1, r2)
            int r2 = defpackage.koc.TextAppearance_android_textColor
            boolean r4 = r1.hasValue(r2)
            if (r4 == 0) goto L_0x0126
            int r4 = r1.getResourceId(r2, r10)
            if (r4 == 0) goto L_0x0126
            android.content.res.ColorStateList r4 = defpackage.q8.j(r4, r14)
            if (r4 == 0) goto L_0x0126
            goto L_0x012a
        L_0x0126:
            android.content.res.ColorStateList r4 = r1.getColorStateList(r2)
        L_0x012a:
            if (r4 == 0) goto L_0x012f
            r13.V0 = r4
            goto L_0x0135
        L_0x012f:
            android.content.res.ColorStateList r2 = r13.getTextColors()
            r13.V0 = r2
        L_0x0135:
            int r2 = defpackage.koc.TextAppearance_android_textSize
            int r2 = r1.getDimensionPixelSize(r2, r10)
            if (r2 == 0) goto L_0x014c
            float r2 = (float) r2
            float r4 = r11.getTextSize()
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto L_0x014c
            r11.setTextSize(r2)
            r13.requestLayout()
        L_0x014c:
            int r2 = defpackage.koc.TextAppearance_android_typeface
            int r2 = r1.getInt(r2, r3)
            int r4 = defpackage.koc.TextAppearance_android_textStyle
            int r3 = r1.getInt(r4, r3)
            r4 = 2
            if (r2 == r0) goto L_0x0168
            if (r2 == r4) goto L_0x0165
            r5 = 3
            if (r2 == r5) goto L_0x0162
            r2 = r9
            goto L_0x016a
        L_0x0162:
            android.graphics.Typeface r2 = android.graphics.Typeface.MONOSPACE
            goto L_0x016a
        L_0x0165:
            android.graphics.Typeface r2 = android.graphics.Typeface.SERIF
            goto L_0x016a
        L_0x0168:
            android.graphics.Typeface r2 = android.graphics.Typeface.SANS_SERIF
        L_0x016a:
            r5 = 0
            if (r3 <= 0) goto L_0x0198
            if (r2 != 0) goto L_0x0174
            android.graphics.Typeface r2 = android.graphics.Typeface.defaultFromStyle(r3)
            goto L_0x0178
        L_0x0174:
            android.graphics.Typeface r2 = android.graphics.Typeface.create(r2, r3)
        L_0x0178:
            r13.setSwitchTypeface(r2)
            if (r2 == 0) goto L_0x0182
            int r2 = r2.getStyle()
            goto L_0x0183
        L_0x0182:
            r2 = r10
        L_0x0183:
            int r2 = ~r2
            r2 = r2 & r3
            r3 = r2 & 1
            if (r3 == 0) goto L_0x018a
            goto L_0x018b
        L_0x018a:
            r0 = r10
        L_0x018b:
            r11.setFakeBoldText(r0)
            r0 = r2 & 2
            if (r0 == 0) goto L_0x0194
            r5 = -1098907648(0xffffffffbe800000, float:-0.25)
        L_0x0194:
            r11.setTextSkewX(r5)
            goto L_0x01a1
        L_0x0198:
            r11.setFakeBoldText(r10)
            r11.setTextSkewX(r5)
            r13.setSwitchTypeface(r2)
        L_0x01a1:
            int r0 = defpackage.koc.TextAppearance_textAllCaps
            boolean r0 = r1.getBoolean(r0, r10)
            if (r0 == 0) goto L_0x01c1
            fd r0 = new fd
            android.content.Context r2 = r13.getContext()
            r0.<init>()
            android.content.res.Resources r2 = r2.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
            java.util.Locale r2 = r2.locale
            r0.a = r2
            r13.Y0 = r0
            goto L_0x01c3
        L_0x01c1:
            r13.Y0 = r9
        L_0x01c3:
            java.lang.CharSequence r0 = r13.A0
            r13.setTextOnInternal(r0)
            java.lang.CharSequence r0 = r13.C0
            r13.setTextOffInternal(r0)
            r1.recycle()
        L_0x01d0:
            gp r0 = new gp
            r0.<init>(r13)
            r0.f(r15, r8)
            r12.x()
            android.view.ViewConfiguration r14 = android.view.ViewConfiguration.get(r14)
            int r0 = r14.getScaledTouchSlop()
            r13.G0 = r0
            int r14 = r14.getScaledMinimumFlingVelocity()
            r13.K0 = r14
            jo r14 = r13.getEmojiTextViewHelper()
            r14.c(r15, r8)
            r13.refreshDrawableState()
            boolean r14 = r13.isChecked()
            r13.setChecked(r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private jo getEmojiTextViewHelper() {
        if (this.a1 == null) {
            this.a1 = new jo(this);
        }
        return this.a1;
    }

    private boolean getTargetCheckedState() {
        return this.L0 > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((getLayoutDirection() == 1 ? 1.0f - this.L0 : this.L0) * ((float) getThumbScrollRange())) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.w;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.c1;
        drawable.getPadding(rect);
        Drawable drawable2 = this.a;
        Rect b2 = drawable2 != null ? yu4.b(drawable2) : yu4.c;
        return ((((this.M0 - this.O0) - rect.left) - rect.right) - b2.left) - b2.right;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.C0 = charSequence;
        jo emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod N = ((y64) emojiTextViewHelper.b.b).N(this.Y0);
        if (N != null) {
            charSequence = N.getTransformation(charSequence, this);
        }
        this.D0 = charSequence;
        this.X0 = null;
        if (this.E0) {
            e();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.A0 = charSequence;
        jo emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod N = ((y64) emojiTextViewHelper.b.b).N(this.Y0);
        if (N != null) {
            charSequence = N.getTransformation(charSequence, this);
        }
        this.B0 = charSequence;
        this.W0 = null;
        if (this.E0) {
            e();
        }
    }

    public final boolean a() {
        return getEmojiTextViewHelper().b();
    }

    public final void b() {
        Drawable drawable = this.a;
        if (drawable == null) {
            return;
        }
        if (this.o || this.v) {
            Drawable mutate = drawable.mutate();
            this.a = mutate;
            if (this.o) {
                ru4.h(mutate, this.b);
            }
            if (this.v) {
                ru4.i(this.a, this.c);
            }
            if (this.a.isStateful()) {
                this.a.setState(getDrawableState());
            }
        }
    }

    public final void c() {
        Drawable drawable = this.w;
        if (drawable == null) {
            return;
        }
        if (this.z || this.v0) {
            Drawable mutate = drawable.mutate();
            this.w = mutate;
            if (this.z) {
                ru4.h(mutate, this.x);
            }
            if (this.v0) {
                ru4.i(this.w, this.y);
            }
            if (this.w.isStateful()) {
                this.w.setState(getDrawableState());
            }
        }
    }

    public final void d() {
        setTextOnInternal(this.A0);
        setTextOffInternal(this.C0);
        requestLayout();
    }

    public final void draw(Canvas canvas) {
        int i;
        int i2;
        int i3 = this.P0;
        int i4 = this.Q0;
        int i5 = this.R0;
        int i6 = this.S0;
        int thumbOffset = getThumbOffset() + i3;
        Drawable drawable = this.a;
        Rect b2 = drawable != null ? yu4.b(drawable) : yu4.c;
        Drawable drawable2 = this.w;
        Rect rect = this.c1;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i7 = rect.left;
            thumbOffset += i7;
            if (b2 != null) {
                int i8 = b2.left;
                if (i8 > i7) {
                    i3 += i8 - i7;
                }
                int i9 = b2.top;
                int i10 = rect.top;
                i = i9 > i10 ? (i9 - i10) + i4 : i4;
                int i11 = b2.right;
                int i12 = rect.right;
                if (i11 > i12) {
                    i5 -= i11 - i12;
                }
                int i13 = b2.bottom;
                int i14 = rect.bottom;
                if (i13 > i14) {
                    i2 = i6 - (i13 - i14);
                    this.w.setBounds(i3, i, i5, i2);
                }
            } else {
                i = i4;
            }
            i2 = i6;
            this.w.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.a;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i15 = thumbOffset - rect.left;
            int i16 = thumbOffset + this.O0 + rect.right;
            this.a.setBounds(i15, i4, i16, i6);
            Drawable background = getBackground();
            if (background != null) {
                ru4.f(background, i15, i4, i16, i6);
            }
        }
        super.draw(canvas);
    }

    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.a;
        if (drawable != null) {
            ru4.e(drawable, f, f2);
        }
        Drawable drawable2 = this.w;
        if (drawable2 != null) {
            ru4.e(drawable2, f, f2);
        }
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.a;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.w;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    public final void e() {
        if (this.b1 == null && this.a1.b() && s15.p != null) {
            s15 a2 = s15.a();
            int b2 = a2.b();
            if (b2 == 3 || b2 == 0) {
                u35 u35 = new u35(this);
                this.b1 = u35;
                a2.i(u35);
            }
        }
    }

    public int getCompoundPaddingLeft() {
        if (getLayoutDirection() != 1) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.M0;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.y0 : compoundPaddingLeft;
    }

    public int getCompoundPaddingRight() {
        if (getLayoutDirection() == 1) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.M0;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.y0 : compoundPaddingRight;
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return a.b(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.E0;
    }

    public boolean getSplitTrack() {
        return this.z0;
    }

    public int getSwitchMinWidth() {
        return this.x0;
    }

    public int getSwitchPadding() {
        return this.y0;
    }

    public CharSequence getTextOff() {
        return this.C0;
    }

    public CharSequence getTextOn() {
        return this.A0;
    }

    public Drawable getThumbDrawable() {
        return this.a;
    }

    public final float getThumbPosition() {
        return this.L0;
    }

    public int getThumbTextPadding() {
        return this.w0;
    }

    public ColorStateList getThumbTintList() {
        return this.b;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.c;
    }

    public Drawable getTrackDrawable() {
        return this.w;
    }

    public ColorStateList getTrackTintList() {
        return this.x;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.y;
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.w;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.Z0;
        if (objectAnimator != null && objectAnimator.isStarted()) {
            this.Z0.end();
            this.Z0 = null;
        }
    }

    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, e1);
        }
        return onCreateDrawableState;
    }

    public void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        Drawable drawable = this.w;
        Rect rect = this.c1;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i2 = this.Q0;
        int i3 = this.S0;
        int i4 = i2 + rect.top;
        int i5 = i3 - rect.bottom;
        Drawable drawable2 = this.a;
        if (drawable != null) {
            if (!this.z0 || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect b2 = yu4.b(drawable2);
                drawable2.copyBounds(rect);
                rect.left += b2.left;
                rect.right -= b2.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        StaticLayout staticLayout = getTargetCheckedState() ? this.W0 : this.X0;
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.V0;
            TextPaint textPaint = this.U0;
            if (colorStateList != null) {
                textPaint.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            textPaint.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                i = bounds.left + bounds.right;
            } else {
                i = getWidth();
            }
            canvas.translate((float) ((i / 2) - (staticLayout.getWidth() / 2)), (float) (((i4 + i5) / 2) - (staticLayout.getHeight() / 2)));
            staticLayout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.A0 : this.C0;
            if (!TextUtils.isEmpty(charSequence)) {
                CharSequence text = accessibilityNodeInfo.getText();
                if (TextUtils.isEmpty(text)) {
                    accessibilityNodeInfo.setText(charSequence);
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(text);
                sb.append(' ');
                sb.append(charSequence);
                accessibilityNodeInfo.setText(sb);
            }
        }
    }

    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        super.onLayout(z2, i, i2, i3, i4);
        int i10 = 0;
        if (this.a != null) {
            Drawable drawable = this.w;
            Rect rect = this.c1;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect b2 = yu4.b(this.a);
            i5 = Math.max(0, b2.left - rect.left);
            i10 = Math.max(0, b2.right - rect.right);
        } else {
            i5 = 0;
        }
        if (getLayoutDirection() == 1) {
            i7 = getPaddingLeft() + i5;
            i6 = ((this.M0 + i7) - i5) - i10;
        } else {
            i6 = (getWidth() - getPaddingRight()) - i10;
            i7 = (i6 - this.M0) + i5 + i10;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int paddingTop = getPaddingTop();
            int i11 = this.N0;
            int height = (((getHeight() + paddingTop) - getPaddingBottom()) / 2) - (i11 / 2);
            int i12 = height;
            i8 = i11 + height;
            i9 = i12;
        } else if (gravity != 80) {
            i9 = getPaddingTop();
            i8 = this.N0 + i9;
        } else {
            i8 = getHeight() - getPaddingBottom();
            i9 = i8 - this.N0;
        }
        this.P0 = i7;
        this.Q0 = i9;
        this.S0 = i8;
        this.R0 = i6;
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5 = 0;
        if (this.E0) {
            StaticLayout staticLayout = this.W0;
            TextPaint textPaint = this.U0;
            if (staticLayout == null) {
                CharSequence charSequence = this.B0;
                this.W0 = new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil((double) Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, c44.DEFAULT_ASPECT_RATIO, true);
            }
            if (this.X0 == null) {
                CharSequence charSequence2 = this.D0;
                this.X0 = new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil((double) Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, c44.DEFAULT_ASPECT_RATIO, true);
            }
        }
        Drawable drawable = this.a;
        Rect rect = this.c1;
        if (drawable != null) {
            drawable.getPadding(rect);
            i4 = (this.a.getIntrinsicWidth() - rect.left) - rect.right;
            i3 = this.a.getIntrinsicHeight();
        } else {
            i4 = 0;
            i3 = 0;
        }
        this.O0 = Math.max(this.E0 ? (this.w0 * 2) + Math.max(this.W0.getWidth(), this.X0.getWidth()) : 0, i4);
        Drawable drawable2 = this.w;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i5 = this.w.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i6 = rect.left;
        int i7 = rect.right;
        Drawable drawable3 = this.a;
        if (drawable3 != null) {
            Rect b2 = yu4.b(drawable3);
            i6 = Math.max(i6, b2.left);
            i7 = Math.max(i7, b2.right);
        }
        int max = this.T0 ? Math.max(this.x0, (this.O0 * 2) + i6 + i7) : this.x0;
        int max2 = Math.max(i5, i3);
        this.M0 = max;
        this.N0 = max2;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.A0 : this.C0;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        if (r1 != 3) goto L_0x0141;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            android.view.VelocityTracker r0 = r9.J0
            r0.addMovement(r10)
            int r1 = r10.getActionMasked()
            int r2 = r9.G0
            r3 = 1
            if (r1 == 0) goto L_0x00f5
            r4 = 3
            r5 = 0
            r6 = 2
            if (r1 == r3) goto L_0x008d
            if (r1 == r6) goto L_0x0019
            if (r1 == r4) goto L_0x008d
            goto L_0x0141
        L_0x0019:
            int r0 = r9.F0
            if (r0 == r3) goto L_0x005d
            if (r0 == r6) goto L_0x0021
            goto L_0x0141
        L_0x0021:
            float r10 = r10.getX()
            int r0 = r9.getThumbScrollRange()
            float r1 = r9.H0
            float r1 = r10 - r1
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L_0x0034
            float r0 = (float) r0
            float r1 = r1 / r0
            goto L_0x003d
        L_0x0034:
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x003a
            r1 = r2
            goto L_0x003d
        L_0x003a:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1 = r0
        L_0x003d:
            int r0 = r9.getLayoutDirection()
            if (r0 != r3) goto L_0x0044
            float r1 = -r1
        L_0x0044:
            float r0 = r9.L0
            float r1 = r1 + r0
            int r4 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r4 >= 0) goto L_0x004c
            goto L_0x0053
        L_0x004c:
            int r4 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x0052
            r5 = r2
            goto L_0x0053
        L_0x0052:
            r5 = r1
        L_0x0053:
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x005c
            r9.H0 = r10
            r9.setThumbPosition(r5)
        L_0x005c:
            return r3
        L_0x005d:
            float r0 = r10.getX()
            float r1 = r10.getY()
            float r4 = r9.H0
            float r4 = r0 - r4
            float r4 = java.lang.Math.abs(r4)
            float r5 = (float) r2
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L_0x007f
            float r4 = r9.I0
            float r4 = r1 - r4
            float r4 = java.lang.Math.abs(r4)
            float r2 = (float) r2
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x0141
        L_0x007f:
            r9.F0 = r6
            android.view.ViewParent r10 = r9.getParent()
            r10.requestDisallowInterceptTouchEvent(r3)
            r9.H0 = r0
            r9.I0 = r1
            return r3
        L_0x008d:
            int r1 = r9.F0
            r2 = 0
            if (r1 != r6) goto L_0x00ef
            r9.F0 = r2
            int r1 = r10.getAction()
            if (r1 != r3) goto L_0x00a2
            boolean r1 = r9.isEnabled()
            if (r1 == 0) goto L_0x00a2
            r1 = r3
            goto L_0x00a3
        L_0x00a2:
            r1 = r2
        L_0x00a3:
            boolean r6 = r9.isChecked()
            if (r1 == 0) goto L_0x00d5
            r1 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r1)
            float r0 = r0.getXVelocity()
            float r1 = java.lang.Math.abs(r0)
            int r7 = r9.K0
            float r7 = (float) r7
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 <= 0) goto L_0x00d0
            int r1 = r9.getLayoutDirection()
            if (r1 != r3) goto L_0x00cb
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x00c9
        L_0x00c7:
            r0 = r3
            goto L_0x00d6
        L_0x00c9:
            r0 = r2
            goto L_0x00d6
        L_0x00cb:
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x00c9
            goto L_0x00c7
        L_0x00d0:
            boolean r0 = r9.getTargetCheckedState()
            goto L_0x00d6
        L_0x00d5:
            r0 = r6
        L_0x00d6:
            if (r0 == r6) goto L_0x00db
            r9.playSoundEffect(r2)
        L_0x00db:
            r9.setChecked(r0)
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r10)
            r0.setAction(r4)
            super.onTouchEvent(r0)
            r0.recycle()
            super.onTouchEvent(r10)
            return r3
        L_0x00ef:
            r9.F0 = r2
            r0.clear()
            goto L_0x0141
        L_0x00f5:
            float r0 = r10.getX()
            float r1 = r10.getY()
            boolean r4 = r9.isEnabled()
            if (r4 == 0) goto L_0x0141
            android.graphics.drawable.Drawable r4 = r9.a
            if (r4 != 0) goto L_0x0108
            goto L_0x0141
        L_0x0108:
            int r4 = r9.getThumbOffset()
            android.graphics.drawable.Drawable r5 = r9.a
            android.graphics.Rect r6 = r9.c1
            r5.getPadding(r6)
            int r5 = r9.Q0
            int r5 = r5 - r2
            int r7 = r9.P0
            int r7 = r7 + r4
            int r7 = r7 - r2
            int r4 = r9.O0
            int r4 = r4 + r7
            int r8 = r6.left
            int r4 = r4 + r8
            int r6 = r6.right
            int r4 = r4 + r6
            int r4 = r4 + r2
            int r6 = r9.S0
            int r6 = r6 + r2
            float r2 = (float) r7
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x0141
            float r2 = (float) r4
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x0141
            float r2 = (float) r5
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x0141
            float r2 = (float) r6
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x0141
            r9.F0 = r3
            r9.H0 = r0
            r9.I0 = r1
        L_0x0141:
            boolean r9 = super.onTouchEvent(r10)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().d(z2);
    }

    public void setChecked(boolean z2) {
        super.setChecked(z2);
        boolean isChecked = isChecked();
        Class<CharSequence> cls = CharSequence.class;
        if (isChecked) {
            if (Build.VERSION.SDK_INT >= 30) {
                Object obj = this.A0;
                if (obj == null) {
                    obj = getResources().getString(zmc.abc_capital_on);
                }
                Object obj2 = obj;
                WeakHashMap weakHashMap = gag.a;
                new r9g(ahc.tag_state_description, cls, 64, 30, 1).e(this, obj2);
            }
        } else if (Build.VERSION.SDK_INT >= 30) {
            Object obj3 = this.C0;
            if (obj3 == null) {
                obj3 = getResources().getString(zmc.abc_capital_off);
            }
            Object obj4 = obj3;
            WeakHashMap weakHashMap2 = gag.a;
            new r9g(ahc.tag_state_description, cls, 64, 30, 1).e(this, obj4);
        }
        IBinder windowToken = getWindowToken();
        float f = c44.DEFAULT_ASPECT_RATIO;
        if (windowToken == null || !isLaidOut()) {
            ObjectAnimator objectAnimator = this.Z0;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            if (isChecked) {
                f = 1.0f;
            }
            setThumbPosition(f);
            return;
        }
        if (isChecked) {
            f = 1.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, d1, new float[]{f});
        this.Z0 = ofFloat;
        ofFloat.setDuration(250);
        this.Z0.setAutoCancel(true);
        this.Z0.start();
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().e(z2);
        setTextOnInternal(this.A0);
        setTextOffInternal(this.C0);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z2) {
        this.T0 = z2;
        invalidate();
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setShowText(boolean z2) {
        if (this.E0 != z2) {
            this.E0 = z2;
            requestLayout();
            if (z2) {
                e();
            }
        }
    }

    public void setSplitTrack(boolean z2) {
        this.z0 = z2;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.x0 = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.y0 = i;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        TextPaint textPaint = this.U0;
        if ((textPaint.getTypeface() != null && !textPaint.getTypeface().equals(typeface)) || (textPaint.getTypeface() == null && typeface != null)) {
            textPaint.setTypeface(typeface);
            requestLayout();
            invalidate();
        }
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (!isChecked() && Build.VERSION.SDK_INT >= 30) {
            Object obj = this.C0;
            if (obj == null) {
                obj = getResources().getString(zmc.abc_capital_off);
            }
            WeakHashMap weakHashMap = gag.a;
            new r9g(ahc.tag_state_description, CharSequence.class, 64, 30, 1).e(this, obj);
        }
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (isChecked() && Build.VERSION.SDK_INT >= 30) {
            Object obj = this.A0;
            if (obj == null) {
                obj = getResources().getString(zmc.abc_capital_on);
            }
            WeakHashMap weakHashMap = gag.a;
            new r9g(ahc.tag_state_description, CharSequence.class, 64, 30, 1).e(this, obj);
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.a;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f) {
        this.L0 = f;
        invalidate();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(iq.D(getContext(), i));
    }

    public void setThumbTextPadding(int i) {
        this.w0 = i;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.b = colorStateList;
        this.o = true;
        b();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.c = mode;
        this.v = true;
        b();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.w;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.w = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(iq.D(getContext(), i));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.x = colorStateList;
        this.z = true;
        c();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.y = mode;
        this.v0 = true;
        c();
    }

    public final void toggle() {
        setChecked(!isChecked());
    }

    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.a || drawable == this.w;
    }
}
