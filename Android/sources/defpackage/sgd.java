package defpackage;

import android.animation.ValueAnimator;
import java.util.Objects;

/* renamed from: sgd  reason: default package */
public final class sgd implements x87 {
    public float a;
    public ValueAnimator b;
    public final /* synthetic */ tgd c;

    public sgd(tgd tgd) {
        this.c = tgd;
    }

    public final void a(long j, ps1 ps1) {
        tgd tgd = this.c;
        this.a = tgd.getBrightness();
        tgd.setBrightness(1.0f);
        ValueAnimator valueAnimator = this.b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        Objects.requireNonNull(ps1);
        mgd mgd = new mgd(1, ps1);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{c44.DEFAULT_ASPECT_RATIO, 1.0f});
        ofFloat.setDuration(tgd.getVisibilityRampUpAnimationDurationMillis());
        ofFloat.addUpdateListener(new z00(20, (Object) tgd));
        ofFloat.addListener(new uf(7, mgd));
        ofFloat.start();
        this.b = ofFloat;
    }

    public final void clear() {
        ValueAnimator valueAnimator = this.b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.b = null;
        }
        tgd tgd = this.c;
        tgd.setAlpha(c44.DEFAULT_ASPECT_RATIO);
        tgd.setBrightness(this.a);
    }
}
