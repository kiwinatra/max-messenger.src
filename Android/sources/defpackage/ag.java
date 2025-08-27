package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: ag  reason: default package */
public final class ag extends n1g implements Animatable {
    public final yf b;
    public final Context c;
    public z6 o = null;
    public ArrayList v = null;
    public final xf w = new xf(0, this);

    /* JADX WARNING: type inference failed for: r3v1, types: [android.graphics.drawable.Drawable$ConstantState, yf] */
    public ag(Context context) {
        this.c = context;
        this.b = new Drawable.ConstantState();
    }

    public static ag a(int i, Context context) {
        ag agVar = new ag(context);
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        ThreadLocal threadLocal = h4d.a;
        Drawable a = c4d.a(resources, i, theme);
        agVar.a = a;
        a.setCallback(agVar.w);
        new zf(agVar.a.getConstantState());
        return agVar;
    }

    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.a;
        if (drawable != null) {
            ru4.a(drawable, theme);
        }
    }

    public final void b(ye yeVar) {
        Drawable drawable = this.a;
        if (drawable != null) {
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
            if (yeVar.a == null) {
                yeVar.a = new xe(yeVar);
            }
            animatedVectorDrawable.registerAnimationCallback(yeVar.a);
        } else if (yeVar != null) {
            if (this.v == null) {
                this.v = new ArrayList();
            }
            if (!this.v.contains(yeVar)) {
                this.v.add(yeVar);
                if (this.o == null) {
                    this.o = new z6(1, (Object) this);
                }
                this.b.b.addListener(this.o);
            }
        }
    }

    public final boolean c(ye yeVar) {
        z6 z6Var;
        Drawable drawable = this.a;
        if (drawable != null) {
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
            if (yeVar.a == null) {
                yeVar.a = new xe(yeVar);
            }
            animatedVectorDrawable.unregisterAnimationCallback(yeVar.a);
        }
        ArrayList arrayList = this.v;
        if (arrayList == null || yeVar == null) {
            return false;
        }
        boolean remove = arrayList.remove(yeVar);
        if (this.v.size() == 0 && (z6Var = this.o) != null) {
            this.b.b.removeListener(z6Var);
            this.o = null;
        }
        return remove;
    }

    public final boolean canApplyTheme() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return ru4.b(drawable);
        }
        return false;
    }

    public final void draw(Canvas canvas) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        yf yfVar = this.b;
        yfVar.a.draw(canvas);
        if (yfVar.b.isStarted()) {
            invalidateSelf();
        }
    }

    public final int getAlpha() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getAlpha() : this.b.a.getAlpha();
    }

    public final int getChangingConfigurations() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.b.getClass();
        return changingConfigurations | 0;
    }

    public final ColorFilter getColorFilter() {
        Drawable drawable = this.a;
        return drawable != null ? ru4.c(drawable) : this.b.a.getColorFilter();
    }

    public final Drawable.ConstantState getConstantState() {
        if (this.a != null) {
            return new zf(this.a.getConstantState());
        }
        return null;
    }

    public final int getIntrinsicHeight() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getIntrinsicHeight() : this.b.a.getIntrinsicHeight();
    }

    public final int getIntrinsicWidth() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getIntrinsicWidth() : this.b.a.getIntrinsicWidth();
    }

    public final int getOpacity() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getOpacity() : this.b.a.getOpacity();
    }

    /* JADX WARNING: type inference failed for: r7v8, types: [qae, ts] */
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        yf yfVar;
        Drawable drawable = this.a;
        if (drawable != null) {
            ru4.d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            yfVar = this.b;
            if (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    if ("animated-vector".equals(name)) {
                        TypedArray F = b0h.F(resources, theme, attributeSet, o54.e);
                        int resourceId = F.getResourceId(0, 0);
                        if (resourceId != 0) {
                            w1g w1g = new w1g();
                            ThreadLocal threadLocal = h4d.a;
                            w1g.a = c4d.a(resources, resourceId, theme);
                            new v1g(w1g.a.getConstantState());
                            w1g.w = false;
                            w1g.setCallback(this.w);
                            w1g w1g2 = yfVar.a;
                            if (w1g2 != null) {
                                w1g2.setCallback((Drawable.Callback) null);
                            }
                            yfVar.a = w1g;
                        }
                        F.recycle();
                    } else if ("target".equals(name)) {
                        TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, o54.f);
                        String string = obtainAttributes.getString(0);
                        int resourceId2 = obtainAttributes.getResourceId(1, 0);
                        if (resourceId2 != 0) {
                            Context context = this.c;
                            if (context != null) {
                                Animator loadAnimator = AnimatorInflater.loadAnimator(context, resourceId2);
                                loadAnimator.setTarget(yfVar.a.b.b.o.get(string));
                                if (yfVar.c == null) {
                                    yfVar.c = new ArrayList();
                                    yfVar.d = new qae(0);
                                }
                                yfVar.c.add(loadAnimator);
                                yfVar.d.put(loadAnimator, string);
                            } else {
                                obtainAttributes.recycle();
                                throw new IllegalStateException("Context can't be null when inflating animators");
                            }
                        }
                        obtainAttributes.recycle();
                    } else {
                        continue;
                    }
                }
                eventType = xmlPullParser.next();
            }
        }
        if (yfVar.b == null) {
            yfVar.b = new AnimatorSet();
        }
        yfVar.b.playTogether(yfVar.c);
    }

    public final boolean isAutoMirrored() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.isAutoMirrored() : this.b.a.isAutoMirrored();
    }

    public final boolean isRunning() {
        Drawable drawable = this.a;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.b.b.isRunning();
    }

    public final boolean isStateful() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.isStateful() : this.b.a.isStateful();
    }

    public final Drawable mutate() {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.b.a.setBounds(rect);
        }
    }

    public final boolean onLevelChange(int i) {
        Drawable drawable = this.a;
        return drawable != null ? drawable.setLevel(i) : this.b.a.setLevel(i);
    }

    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.a;
        return drawable != null ? drawable.setState(iArr) : this.b.a.setState(iArr);
    }

    public final void setAlpha(int i) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.b.a.setAlpha(i);
        }
    }

    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.b.a.setAutoMirrored(z);
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.b.a.setColorFilter(colorFilter);
        }
    }

    public final void setTint(int i) {
        Drawable drawable = this.a;
        if (drawable != null) {
            f6e.D(drawable, i);
        } else {
            this.b.a.setTint(i);
        }
    }

    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.a;
        if (drawable != null) {
            f6e.E(drawable, colorStateList);
        } else {
            this.b.a.setTintList(colorStateList);
        }
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.a;
        if (drawable != null) {
            f6e.F(drawable, mode);
        } else {
            this.b.a.setTintMode(mode);
        }
    }

    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.b.a.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    public final void start() {
        Drawable drawable = this.a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        yf yfVar = this.b;
        if (!yfVar.b.isStarted()) {
            yfVar.b.start();
            invalidateSelf();
        }
    }

    public final void stop() {
        Drawable drawable = this.a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.b.b.end();
        }
    }

    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
    }
}
