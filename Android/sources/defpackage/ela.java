package defpackage;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.TextView;

/* renamed from: ela  reason: default package */
public class ela extends TextView {
    public jbg a;

    public ela(Context context) {
        super(context, (AttributeSet) null, 0);
    }

    public final jbg getObserverSpanListener() {
        return this.a;
    }

    public final void onWindowVisibilityChanged(int i) {
        jbg jbg;
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            jbg jbg2 = this.a;
            if (jbg2 != null) {
                jbg2.onViewAttachedToWindow(this);
            }
        } else if (i == 8 && (jbg = this.a) != null) {
            jbg.onViewDetachedFromWindow(this);
        }
    }

    public final void setObserverSpanListener(jbg jbg) {
        this.a = jbg;
    }

    public final boolean verifyDrawable(Drawable drawable) {
        return (drawable instanceof Animatable) || super.verifyDrawable(drawable);
    }
}
