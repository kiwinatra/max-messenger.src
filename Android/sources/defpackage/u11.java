package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;

/* renamed from: u11  reason: default package */
public final class u11 extends FrameLayout {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u11(Context context, int i) {
        super(context, (AttributeSet) null);
        this.a = i;
        switch (i) {
            case 1:
                super(context);
                return;
            default:
                Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, new m(29));
                this.b = lazy;
                Drawable b2 = ew3.b(context, pec.ic_call_speaker_24);
                l2b.f.getClass();
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                b2.setColorFilter(new PorterDuffColorFilter(-1, mode));
                this.c = b2;
                Drawable b3 = ew3.b(context, cad.a0);
                b3.setColorFilter(new PorterDuffColorFilter(-1, mode));
                this.o = b3;
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape((float[]) lazy.getValue(), (RectF) null, (float[]) null));
                shapeDrawable.getPaint().setColor(l2b.d.i);
                setBackground(shapeDrawable);
                return;
        }
    }

    public void onDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                super.onDraw(canvas);
                int paddingTop = getPaddingTop();
                int height = ((getHeight() - getPaddingTop()) - paddingTop) / 2;
                Drawable drawable = (Drawable) this.c;
                drawable.setBounds(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), (getHeight() - paddingTop) - height);
                drawable.draw(canvas);
                Drawable drawable2 = (Drawable) this.o;
                drawable2.setBounds(getPaddingLeft(), getPaddingTop() + height + paddingTop, getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                drawable2.draw(canvas);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }
}
