package defpackage;

import android.content.Context;
import android.graphics.drawable.DrawableWrapper;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import one.me.sdk.richvector.EnhancedVectorDrawable;
import one.me.sdk.richvector.VectorPath;

/* renamed from: jm5  reason: default package */
public final class jm5 extends DrawableWrapper {
    public final Lazy a;
    public final Lazy b;
    public final Lazy c;

    public jm5(Context context) {
        super(new EnhancedVectorDrawable(context, ffc.ic_file_extension));
        im5 im5 = new im5(this, 0);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.a = LazyKt.lazy(lazyThreadSafetyMode, im5);
        this.b = LazyKt.lazy(lazyThreadSafetyMode, new im5(this, 1));
        this.c = LazyKt.lazy(lazyThreadSafetyMode, new im5(this, 2));
    }

    public final void a(int i, int i2, int i3) {
        VectorPath vectorPath = (VectorPath) this.a.getValue();
        if (vectorPath != null) {
            vectorPath.setFillColor(i);
        }
        VectorPath vectorPath2 = (VectorPath) this.b.getValue();
        if (vectorPath2 != null) {
            vectorPath2.setFillColor(i2);
        }
        VectorPath vectorPath3 = (VectorPath) this.c.getValue();
        if (vectorPath3 != null) {
            vectorPath3.setFillColor(i3);
        }
    }
}
