package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import one.me.rlottie.RLottieImageView;
import one.me.rlottie.RLottieImageViewUtils;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* renamed from: pb8  reason: default package */
public final class pb8 extends FrameLayout {
    public final y35 a;
    public final db8 b;
    public boolean c;
    public boolean o;
    public ore v;

    /* JADX WARNING: type inference failed for: r2v0, types: [android.view.View, one.me.rlottie.RLottieImageView, db8] */
    public pb8(Context context) {
        super(context, (AttributeSet) null);
        y35 y35 = new y35(context);
        this.a = y35;
        ? rLottieImageView = new RLottieImageView(context, (AttributeSet) null);
        rLottieImageView.setId(fza.b);
        rLottieImageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.b = rLottieImageView;
        addView((OneMeDraweeView) y35.b);
        addView(rLottieImageView);
    }

    public final void a(gpe gpe, int i) {
        ore ore = this.v;
        if (ore != null) {
            ore.f = gpe;
            ore.b();
        }
        String str = gpe.v;
        y35 y35 = this.a;
        boolean z = true;
        db8 db8 = this.b;
        if (str == null || str.length() == 0) {
            db8.getClass();
            RLottieImageViewUtils.release(db8);
            db8.x = null;
            db8.setVisibility(8);
            ((OneMeDraweeView) y35.b).setVisibility(0);
        } else {
            db8.setAutoRepeat(true);
            db8.setOnFirstFrameListener(new ob8(this));
            db8.setFailureListener(new ob8(this));
            db8.setVisibility(0);
            this.c = true;
            boolean a2 = db8.a(i, i, str);
            this.c = false;
            if (!a2 || this.o) {
                z = false;
            }
            this.o = false;
        }
        if (z) {
            y35.getClass();
            qa7 b2 = qa7.b(gpe.o);
            OneMeDraweeView oneMeDraweeView = (OneMeDraweeView) y35.b;
            int i2 = OneMeDraweeView.z0;
            oneMeDraweeView.o(b2, (qa7) null);
            oneMeDraweeView.setVisibility(0);
        }
    }

    public final void b(hb8 hb8) {
        if (hb8.a == null) {
            hb8.a = Collections.newSetFromMap(new WeakHashMap());
        }
        Set set = hb8.a;
        if (set != null) {
            set.add(this.b);
        }
    }

    public final ore getSizeConfigurator() {
        return this.v;
    }

    public final void onMeasure(int i, int i2) {
        ore ore = this.v;
        ft a2 = ore != null ? ore.a(i, i2) : null;
        if (a2 != null) {
            i = a2.b;
        }
        if (a2 != null) {
            i2 = a2.c;
        }
        super.onMeasure(i, i2);
    }

    public final void setSizeConfigurator(ore ore) {
        this.v = ore;
    }
}
