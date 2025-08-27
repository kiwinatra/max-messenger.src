package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.util.concurrent.CancellationException;
import kotlin.KotlinVersion;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.Delegates;
import kotlin.reflect.KProperty;
import one.me.rlottie.RLottieDrawable;

/* renamed from: cl  reason: default package */
public final class cl extends Drawable implements Animatable {
    public static final Lazy A0 = LazyKt.lazy(LazyThreadSafetyMode.NONE, new m(6));
    public static final sq6 x0 = new sq6(7);
    public static final /* synthetic */ KProperty[] y0 = {rae.s(cl.class, "state", "getState()Lone/me/sdk/animoji/AnimojiStateDrawable$State;", 0)};
    public static final ThreadLocal z0 = ThreadLocal.withInitial(new vk(0));
    public final Lazy X;
    public final Drawable Y;
    public final Lazy Z;
    public final int a;
    public final bs5 b;
    public final kj c;
    public final aj o;
    public final boolean v;
    public RLottieDrawable v0;
    public final gc8 w;
    public jx3 w0;
    public final bl x;
    public final String y;
    public final xf z;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public cl(Context context, int i, xme xme, kj kjVar, aj ajVar) {
        this(context, i, xme, kjVar, ajVar, true, lc8.a);
        bi4 bi4 = dq4.a;
    }

    public final void a(Canvas canvas, float f, float f2, float f3, Paint paint) {
        Canvas canvas2;
        Drawable b2 = b();
        canvas.save();
        float f4 = f3 - f2;
        canvas.translate(f, f4 > ((float) b2.getBounds().height()) ? (f4 / ((float) 2)) - ((float) (b2.getBounds().height() / 2)) : f3 - ((float) b2.getBounds().height()));
        if (this.v && paint.getAlpha() != 255) {
            paint.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
        }
        RLottieDrawable rLottieDrawable = this.v0;
        Class<cl> cls = cl.class;
        if (b2 == rLottieDrawable) {
            Picture picture = (Picture) z0.get();
            if (picture != null) {
                try {
                    canvas2 = picture.beginRecording(((RLottieDrawable) b2).getBounds().width(), ((RLottieDrawable) b2).getBounds().height());
                } catch (IllegalStateException unused) {
                    picture.endRecording();
                    RLottieDrawable rLottieDrawable2 = (RLottieDrawable) b2;
                    canvas2 = picture.beginRecording(rLottieDrawable2.getBounds().width(), rLottieDrawable2.getBounds().height());
                }
            } else {
                canvas2 = null;
            }
            try {
                ((RLottieDrawable) b2).draw(canvas2, paint);
            } catch (IllegalStateException e) {
                z68.f(cls.getName(), "fail to draw drawable", e);
                if (StringsKt__StringsKt.contains$default((CharSequence) e.toString(), (CharSequence) "Underflow in restore", false, 2, (Object) null) && isRunning()) {
                    d();
                }
            }
            if (picture != null) {
                picture.endRecording();
            }
        } else {
            b2.setAlpha(paint.getAlpha());
            b2.draw(canvas);
        }
        canvas.restore();
        if (rLottieDrawable != null && b2 == rLottieDrawable) {
            Bitmap renderingBitmap = rLottieDrawable.getRenderingBitmap();
            if (renderingBitmap == null) {
                String name = cls.getName();
                a67 a67 = z68.b;
                if (a67 != null && a67.c()) {
                    a67.d(w78.w, name, a81.m("Can't draw lottie because bitmap is null. Draw static, url:", rLottieDrawable.getCurrentUrl()), (Throwable) null);
                }
                Lazy lazy = this.Z;
                (lazy.isInitialized() ? (Drawable) lazy.getValue() : this.Y).draw(canvas);
                d();
                return;
            }
            canvas.save();
            canvas.translate(f, f3 - ((float) rLottieDrawable.getBounds().height()));
            canvas.scale(((float) rLottieDrawable.getBounds().width()) / ((float) rLottieDrawable.getIntrinsicWidth()), ((float) rLottieDrawable.getBounds().height()) / ((float) rLottieDrawable.getIntrinsicHeight()));
            canvas.drawBitmap(renderingBitmap, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, paint);
            canvas.restore();
        }
    }

    public final Drawable b() {
        int ordinal = ((xk) this.x.getValue(this, y0[0])).ordinal();
        Drawable drawable = this.Y;
        if (ordinal == 0) {
            return drawable;
        }
        if (ordinal == 1) {
            return (Drawable) this.Z.getValue();
        }
        if (ordinal == 2) {
            RLottieDrawable rLottieDrawable = this.v0;
            if (rLottieDrawable == null) {
                return drawable;
            }
            if (!(!rLottieDrawable.isLoadingFailed())) {
                rLottieDrawable = null;
            }
            return rLottieDrawable != null ? rLottieDrawable : drawable;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void c(String str) {
        nzf nzf = (nzf) this.Z.getValue();
        nzf.c((Uri) null, str);
        lv4 lv4 = nzf.a.o;
        lv4.getClass();
        ((sp6) lv4).i(this.Y, 1);
        nzf.invalidateSelf();
        nzf.c = new wk(0, this, nzf);
        e(xk.b);
    }

    public final void d() {
        Drawable b2 = b();
        RLottieDrawable rLottieDrawable = this.v0;
        if (b2 != rLottieDrawable) {
            b().invalidateSelf();
        } else if (rLottieDrawable != null) {
            rLottieDrawable.invalidateInternal();
        }
    }

    public final void draw(Canvas canvas) {
        float height = (float) getBounds().height();
        x0.getClass();
        a(canvas, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, height, (Paint) A0.getValue());
    }

    public final void e(xk xkVar) {
        this.x.setValue(this, y0[0], xkVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cl)) {
            return false;
        }
        return Intrinsics.areEqual((Object) this.b, (Object) ((cl) obj).b);
    }

    public final int getIntrinsicHeight() {
        return b().getIntrinsicHeight();
    }

    public final int getIntrinsicWidth() {
        return b().getIntrinsicWidth();
    }

    public final int getOpacity() {
        return b().getOpacity();
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + cl.class.hashCode();
    }

    public final void invalidateSelf() {
        d();
    }

    public final boolean isRunning() {
        Drawable b2 = b();
        RLottieDrawable rLottieDrawable = this.v0;
        return b2 == rLottieDrawable && rLottieDrawable != null && rLottieDrawable.isRunning();
    }

    public final void setAlpha(int i) {
        b().setAlpha(i);
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        Lazy lazy = this.Z;
        if (lazy.isInitialized()) {
            ((nzf) lazy.getValue()).setBounds(i, i2, i3, i4);
        }
        this.Y.setBounds(i, i2, i3, i4);
        RLottieDrawable rLottieDrawable = this.v0;
        if (rLottieDrawable != null) {
            rLottieDrawable.setBounds(i, i2, i3, i4);
        }
        super.setBounds(i, i2, i3, i4);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        b().setColorFilter(colorFilter);
    }

    public final void start() {
        z68.c(cl.class.getName(), "start", new Object[0]);
        if (!e14.f(this.w0)) {
            this.w0 = e14.a(CoroutineContext.Element.DefaultImpls.plus(kr7.b(), this.w));
            bs0.K(new ps5(new on2(this.b, 28), new al(this, (Continuation) null), 5), this.w0);
        }
        Drawable drawable = this.Y;
        xf xfVar = this.z;
        drawable.setCallback(xfVar);
        RLottieDrawable rLottieDrawable = this.v0;
        if (rLottieDrawable != null) {
            rLottieDrawable.setCallback(xfVar);
        }
        Lazy lazy = this.Z;
        if (lazy.isInitialized()) {
            ((nzf) lazy.getValue()).setCallback(xfVar);
        }
        RLottieDrawable rLottieDrawable2 = this.v0;
        if (rLottieDrawable2 != null) {
            rLottieDrawable2.invalidateInternal();
        }
        Drawable b2 = b();
        RLottieDrawable rLottieDrawable3 = this.v0;
        if (b2 == rLottieDrawable3 && rLottieDrawable3 != null) {
            rLottieDrawable3.start();
        }
    }

    public final void stop() {
        z68.c(cl.class.getName(), "stop", new Object[0]);
        e14.c(this.w0, (CancellationException) null);
        this.Y.setCallback((Drawable.Callback) null);
        RLottieDrawable rLottieDrawable = this.v0;
        if (rLottieDrawable != null) {
            rLottieDrawable.setCallback((Drawable.Callback) null);
        }
        Lazy lazy = this.Z;
        if (lazy.isInitialized()) {
            ((nzf) lazy.getValue()).setCallback((Drawable.Callback) null);
        }
        RLottieDrawable rLottieDrawable2 = this.v0;
        if (rLottieDrawable2 != null) {
            rLottieDrawable2.stop();
        }
    }

    public cl(Context context, int i, bs5 bs5, kj kjVar, aj ajVar, boolean z2, gc8 gc8) {
        Drawable drawable;
        this.a = i;
        this.b = bs5;
        this.c = kjVar;
        this.o = ajVar;
        this.v = z2;
        this.w = gc8;
        Delegates delegates = Delegates.INSTANCE;
        xk xkVar = xk.a;
        this.x = new bl(this);
        this.y = cl.class.getName();
        this.z = new xf(1, this);
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, new j6(6, this));
        this.X = lazy;
        if (kjVar instanceof ij) {
            drawable = ((ij) kjVar).a;
        } else if (kjVar instanceof jj) {
            drawable = (q45) lazy.getValue();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.Y = drawable;
        this.Z = LazyKt.lazy(new s2(1, (Object) context, (Object) this));
        this.w0 = e14.a(CoroutineContext.Element.DefaultImpls.plus(kr7.b(), gc8));
        bs0.K(new ps5(new on2(bs5, 28), new al(this, (Continuation) null), 5), this.w0);
    }

    public final void setBounds(Rect rect) {
        Lazy lazy = this.Z;
        if (lazy.isInitialized()) {
            ((nzf) lazy.getValue()).setBounds(rect);
        }
        this.Y.setBounds(rect);
        RLottieDrawable rLottieDrawable = this.v0;
        if (rLottieDrawable != null) {
            rLottieDrawable.setBounds(rect);
        }
        super.setBounds(b().getBounds());
    }
}
