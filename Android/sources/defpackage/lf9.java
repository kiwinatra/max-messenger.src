package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.util.Size;
import android.view.Display;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function1;
import kotlin.math.MathKt;
import kotlin.properties.Delegates;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;

/* renamed from: lf9  reason: default package */
public final class lf9 extends View implements if9, View.OnLongClickListener, ny7, GestureDetector.OnDoubleTapListener, e25 {
    public static final /* synthetic */ KProperty[] F0 = {rae.s(lf9.class, "onDoubleClickListener", "getOnDoubleClickListener()Lkotlin/jvm/functions/Function1;", 0)};
    public Drawable A0;
    public int B0;
    public int C0;
    public final Rect D0;
    public final bj E0;
    public final q23 a;
    public final Lazy b = LazyKt.lazy(LazyThreadSafetyMode.NONE, new h49(3));
    public View.OnLongClickListener c;
    public p23 o;
    public final qy7 v = new qy7(0, 15);
    public float v0;
    public ny7 w;
    public float w0;
    public final bl x;
    public float x0;
    public q23 y;
    public boolean y0;
    public int z;
    public jf9 z0;

    public lf9(Context context, int i) {
        super(context, (AttributeSet) null, 0);
        q23 q23 = new q23(context, new td8(17, this));
        this.a = q23;
        Delegates delegates = Delegates.INSTANCE;
        this.x = new bl(14, this);
        this.y = q23;
        this.z = 1;
        this.y0 = true;
        Display defaultDisplay = kw3.a(context).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        this.C0 = new Size(point.x, point.y).getHeight();
        this.D0 = new Rect();
        this.E0 = new bj(3, this);
        super.setOnLongClickListener(this);
    }

    private final ty6 getHighlightTextHelper() {
        return (ty6) this.b.getValue();
    }

    /* access modifiers changed from: private */
    public static final void setStartDrawable$lambda$5(Drawable drawable) {
        ((AnimationDrawable) drawable).start();
    }

    public final void X(String str, sy7 sy7, ClickableSpan clickableSpan, View view) {
        ny7 ny7 = this.w;
        if (ny7 != null) {
            ny7.X(str, sy7, clickableSpan, (View) null);
        }
    }

    public final void Z0(ta9 ta9) {
        ny7 ny7 = this.w;
        if (ny7 != null) {
            ny7.Z0(ta9);
        }
    }

    public final void b(boolean z2) {
        boolean z3;
        ArrayList arrayList = getHighlightTextHelper().a;
        if (arrayList.isEmpty()) {
            z3 = false;
        } else {
            arrayList.clear();
            z3 = true;
        }
        CharSequence text = getText();
        Spannable spannable = text instanceof Spannable ? (Spannable) text : null;
        if (spannable != null) {
            for (Object obj : spannable.getSpans(0, spannable.length(), fld.class)) {
                fld fld = (fld) obj;
                ForegroundColorSpan foregroundColorSpan = fld.a;
                if (foregroundColorSpan != null) {
                    spannable.removeSpan(foregroundColorSpan);
                }
                BackgroundColorSpan backgroundColorSpan = fld.b;
                if (backgroundColorSpan != null) {
                    spannable.removeSpan(backgroundColorSpan);
                }
                spannable.removeSpan(fld);
            }
        }
        if (z2 || z3) {
            invalidate();
        }
    }

    public final void c(List list) {
        ty6 ty6;
        CharSequence charSequence;
        ty6 highlightTextHelper = getHighlightTextHelper();
        CharSequence text = getText();
        Layout layout = getLayout();
        ArrayList arrayList = highlightTextHelper.a;
        if (!arrayList.isEmpty()) {
            arrayList.clear();
        }
        Collection collection = list;
        if (!(collection == null || collection.isEmpty() || text == null || StringsKt.isBlank(text) || layout == null)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                sld sld = (sld) it.next();
                float height = (float) (layout.getHeight() / layout.getLineCount());
                int i = sld.a;
                while (true) {
                    int lineForOffset = layout.getLineForOffset(i);
                    int lineEnd = layout.getLineEnd(lineForOffset);
                    int i2 = sld.b;
                    boolean z2 = i2 <= lineEnd;
                    if (!z2) {
                        i2 = lineEnd;
                    }
                    String obj = text.subSequence(i, i2).toString();
                    ArrayList arrayList2 = highlightTextHelper.a;
                    ty6 = highlightTextHelper;
                    sy6 sy6 = r6;
                    charSequence = text;
                    sy6 sy62 = new sy6(lineForOffset, obj, layout.getPrimaryHorizontal(i), (float) layout.getLineTop(lineForOffset), (float) layout.getLineBaseline(lineForOffset), layout.getPaint().measureText(obj), height);
                    arrayList2.add(sy6);
                    if (z2) {
                        break;
                    }
                    i = lineEnd;
                    text = charSequence;
                    highlightTextHelper = ty6;
                }
                text = charSequence;
                highlightTextHelper = ty6;
            }
        }
        invalidate();
    }

    public final void d() {
        int i;
        jf9 jf9 = this.z0;
        Layout a2 = jf9 != null ? jf9.a() : null;
        Drawable drawable = this.A0;
        int i2 = 0;
        int intrinsicWidth = drawable != null ? drawable.getIntrinsicWidth() + this.B0 : 0;
        this.w0 = (float) intrinsicWidth;
        int paddingLeft = getPaddingLeft();
        if (a2 == null) {
            i = 0;
        } else {
            int lineCount = a2.getLineCount();
            i = 0;
            for (int i3 = 0; i3 < lineCount; i3++) {
                i = Math.max(i, MathKt.roundToInt(a2.getLineMax(i3)));
            }
        }
        int paddingRight = getPaddingRight() + paddingLeft + i + intrinsicWidth;
        if (a2 != null) {
            i2 = a2.getHeight();
        }
        setMeasuredDimension(paddingRight, i2);
    }

    public final void f() {
        invalidate();
    }

    public final q23 getDefaultMovementMethod() {
        return this.a;
    }

    public final Layout getLayout() {
        jf9 jf9 = this.z0;
        if (jf9 != null) {
            return jf9.a();
        }
        return null;
    }

    public final int getLineCount() {
        Layout a2;
        jf9 jf9 = this.z0;
        if (jf9 == null || (a2 = jf9.a()) == null) {
            return 0;
        }
        return a2.getLineCount();
    }

    public final boolean getLinksClickable() {
        return this.y0;
    }

    public final int getMaxHeightForClip() {
        return this.C0;
    }

    public final q23 getMovementMethod() {
        return this.y;
    }

    public final Function1<lf9, Boolean> getOnDoubleClickListener() {
        return (Function1) this.x.getValue(this, F0[0]);
    }

    public final CharSequence getText() {
        Layout a2;
        jf9 jf9 = this.z0;
        if (jf9 == null || (a2 = jf9.a()) == null) {
            return null;
        }
        return a2.getText();
    }

    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        jf9 jf9 = this.z0;
        if (jf9 != null) {
            jf9.f.add(this);
        }
        CharSequence text = getText();
        Spannable spannable = text instanceof Spannable ? (Spannable) text : null;
        if (spannable != null) {
            this.v.b(spannable);
        }
        jf9 jf92 = this.z0;
        if (jf92 != null) {
            hsg.H(this, jf92.a(), this.E0);
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        jf9 jf9 = this.z0;
        if (jf9 != null) {
            jf9.f.remove(this);
        }
        CharSequence text = getText();
        Spannable spannable = text instanceof Spannable ? (Spannable) text : null;
        if (spannable != null) {
            this.v.getClass();
            qy7.a(spannable);
        }
        jf9 jf92 = this.z0;
        if (jf92 != null) {
            hsg.I(jf92.a(), this.E0);
        }
    }

    public final boolean onDoubleTap(MotionEvent motionEvent) {
        Function1<lf9, Boolean> onDoubleClickListener = getOnDoubleClickListener();
        return onDoubleClickListener != null && onDoubleClickListener.invoke(this).booleanValue();
    }

    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return onDoubleTap(motionEvent);
    }

    public final void onDraw(Canvas canvas) {
        Layout layout = getLayout();
        if (layout != null) {
            ejd ejd = ii.a;
            Rect rect = this.D0;
            if (!rect.isEmpty()) {
                canvas.clipRect(rect);
            }
            Drawable drawable = this.A0;
            int save = canvas.save();
            if (drawable != null) {
                canvas.translate(this.v0, this.x0);
                drawable.draw(canvas);
            }
            canvas.translate(this.v0 + this.w0, c44.DEFAULT_ASPECT_RATIO);
            layout.draw(canvas);
            ty6 highlightTextHelper = getHighlightTextHelper();
            k2b f = fu4.k.e(getContext()).f();
            TextPaint textPaint = (TextPaint) highlightTextHelper.c.getValue();
            textPaint.set(layout.getPaint());
            textPaint.setColor(f.getText().a);
            Lazy lazy = highlightTextHelper.b;
            f.e().getClass();
            ((Paint) lazy.getValue()).setColor(-16745729);
            Iterator it = highlightTextHelper.a.iterator();
            while (it.hasNext()) {
                sy6 sy6 = (sy6) it.next();
                float f2 = sy6.c;
                float f3 = sy6.d;
                canvas.drawRect(f2, f3, f2 + sy6.f, f3 + sy6.g, (Paint) lazy.getValue());
                canvas.drawText(sy6.b, sy6.c, sy6.e, textPaint);
            }
            canvas.restoreToCount(save);
            ejd ejd2 = ii.a;
        }
    }

    public final boolean onLongClick(View view) {
        View.OnLongClickListener onLongClickListener = this.c;
        if (onLongClickListener == null) {
            return true;
        }
        onLongClickListener.onLongClick(view);
        return true;
    }

    public final void onMeasure(int i, int i2) {
        d();
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return performClick();
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.v0 = (float) (this.z == -1 ? getPaddingRight() : getPaddingLeft());
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        q23 q23 = this.y;
        if ((getText() instanceof Spannable) && this.y0 && q23 != null) {
            SpannableString spannableString = new SpannableString(getText());
            if (motionEvent.getAction() == 0) {
                q23.d = new WeakReference(this);
                q23.e = spannableString;
            }
            if (q23.l.onTouchEvent(motionEvent)) {
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void scrollTo(int i, int i2) {
    }

    public final void setLayout(jf9 jf9) {
        jf9 jf92 = this.z0;
        if (jf92 != null) {
            jf92.f.remove(this);
        }
        this.z0 = jf9;
        jf9.f.add(this);
        this.z = jf9.a().getParagraphDirection(0);
        jf9.a().getLineRight(0);
        CharSequence text = getText();
        Spannable spannable = text instanceof Spannable ? (Spannable) text : null;
        if (spannable != null) {
            this.v.b(spannable);
        }
        hsg.H(this, jf9.a(), this.E0);
        this.x0 = (float) jf9.a().getTopPadding();
        requestLayout();
        invalidate();
        setContentDescription(getText());
    }

    public final void setLinkListener(ny7 ny7) {
        Layout a2;
        this.w = ny7;
        qy7 qy7 = this.v;
        qy7.a = ny7;
        jf9 jf9 = this.z0;
        if (jf9 != null && (a2 = jf9.a()) != null) {
            qy7.b(a2.getText());
        }
    }

    public final void setLinkLongClickListener(p23 p23) {
        this.o = p23;
    }

    public final void setLinksClickable(boolean z2) {
        this.y0 = z2;
    }

    public final void setMaxHeightForClip(int i) {
        this.C0 = i;
    }

    public final void setMovementMethod(q23 q23) {
        this.y = q23;
    }

    public final void setOnDoubleClickListener(Function1<? super lf9, Boolean> function1) {
        this.x.setValue(this, F0[0], function1);
    }

    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.c = onLongClickListener;
    }

    public final void setSingleClickAction(Runnable runnable) {
        if (runnable == null) {
            q23 q23 = this.y;
            if (q23 != null) {
                q23.h = null;
                return;
            }
            return;
        }
        q23 q232 = this.y;
        if (q232 != null) {
            q232.h = new ha5(runnable, 1);
        }
    }

    public final void setStartDrawable(Drawable drawable) {
        this.A0 = drawable;
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
        if (drawable instanceof AnimationDrawable) {
            post(new kf9(drawable, 0));
        }
        requestLayout();
    }

    public final void setStartDrawablePadding(int i) {
        if (this.B0 != i) {
            this.B0 = i;
            requestLayout();
        }
    }

    public final void setTextColors(ws0 ws0) {
        TextPaint paint;
        Layout layout = getLayout();
        if (!(layout == null || (paint = layout.getPaint()) == null)) {
            paint.setColor(ws0.b.d);
        }
        CharSequence text = getText();
        Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
        if (spanned != null) {
            Object[] spans = spanned.getSpans(0, spanned.length(), Object.class);
            if (spans != null) {
                for (Object obj : spans) {
                    if (obj instanceof xa9) {
                        ((xa9) obj).b = ws0.b.b;
                    } else if (obj instanceof ky7) {
                        ((ky7) obj).a = ws0.b.b;
                    } else if (obj instanceof my7) {
                        ((my7) obj).b = ws0.b.b;
                    }
                }
            }
        }
        invalidate();
    }

    public final void setTryToSingleClickAction(Runnable runnable) {
        q23 q23 = this.y;
        if (q23 != null) {
            q23.j = runnable;
        }
    }

    public final boolean verifyDrawable(Drawable drawable) {
        return (drawable instanceof Animatable) || super.verifyDrawable(drawable);
    }
}
