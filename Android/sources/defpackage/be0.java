package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import one.me.sdk.uikit.common.avatar.OneMeAvatarView;

/* renamed from: be0  reason: default package */
public final class be0 extends Drawable {
    public final Drawable a;
    public final joa b;
    public final Function1 c;
    public final Function1 d;
    public final Paint e;
    public final Lazy f;

    public be0(Drawable drawable, joa joa, Context context, Function1 function1, Function1 function12) {
        this.a = drawable;
        this.b = joa;
        this.c = function1;
        this.d = function12;
        js9 js9 = fu4.k;
        ru4.g(drawable, ((Number) function1.invoke(js9.e(context).f())).intValue());
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(((Number) function12.invoke(js9.e(context).f())).intValue());
        this.e = paint;
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, new m(16));
        this.f = lazy;
        if (joa instanceof ioa) {
            t4e.a((Path) lazy.getValue(), getBounds());
        }
    }

    public final void draw(Canvas canvas) {
        int min = Math.min(getBounds().width(), getBounds().height());
        joa joa = this.b;
        boolean z = joa instanceof goa;
        Paint paint = this.e;
        if (z) {
            canvas.drawCircle(getBounds().exactCenterX(), getBounds().exactCenterY(), ((float) getBounds().width()) / 2.0f, paint);
        } else if (joa instanceof ioa) {
            canvas.drawPath((Path) this.f.getValue(), paint);
        } else if (!Intrinsics.areEqual((Object) joa, (Object) hoa.a)) {
            throw new NoWhenBranchMatchedException();
        }
        int i = OneMeAvatarView.E0;
        int p = ct.p(min);
        Drawable drawable = this.a;
        drawable.setBounds(0, 0, p, p);
        canvas.save();
        float f2 = ((float) p) / 2.0f;
        canvas.translate(getBounds().exactCenterX() - f2, getBounds().exactCenterY() - f2);
        drawable.draw(canvas);
        canvas.restore();
    }

    public final int getOpacity() {
        return -3;
    }

    public final void onBoundsChange(Rect rect) {
        if (this.b instanceof ioa) {
            t4e.a((Path) this.f.getValue(), rect);
        }
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
