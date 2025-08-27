package defpackage;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.View;
import org.apache.http.HttpStatus;

/* renamed from: fg8  reason: default package */
public abstract class fg8 {
    public final TimeInterpolator a;
    public final View b;
    public final int c;
    public final int d;
    public final int e;
    public we0 f;

    public fg8(View view) {
        this.b = view;
        Context context = view.getContext();
        this.a = ld8.o0(context, edc.motionEasingStandardDecelerateInterpolator, kab.b(c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, 1.0f));
        this.c = ld8.n0(edc.motionDurationMedium2, HttpStatus.SC_MULTIPLE_CHOICES, context);
        this.d = ld8.n0(edc.motionDurationShort3, 150, context);
        this.e = ld8.n0(edc.motionDurationShort2, 100, context);
    }
}
