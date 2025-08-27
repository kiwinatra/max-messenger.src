package defpackage;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import one.me.rlottie.RLottieImageViewUtils;
import ru.ok.tamtam.stickers.lottie.KeyboardLottieAnimationView;

/* renamed from: hse  reason: default package */
public final class hse extends pzc {
    public static final /* synthetic */ int Q0 = 0;
    public final SimpleDraweeView D0;
    public final int E0;
    public KeyboardLottieAnimationView F0;
    public final gb8 G0;
    public final ViewStub H0;
    public final ImageView I0;
    public final ImageView J0;
    public gse K0;
    public qq7 L0;
    public xoe M0;
    public boolean N0;
    public boolean O0;
    public final t84 P0 = new t84((View.OnClickListener) new ese(this, 0), 0);

    public hse(View view, Drawable drawable, gse gse, int i, gb8 gb8) {
        super(view);
        this.K0 = gse;
        this.E0 = i;
        this.G0 = gb8;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) view.findViewById(tic.keyboard_sticker_item_view__iv_image);
        this.D0 = simpleDraweeView;
        sp6 sp6 = (sp6) simpleDraweeView.getHierarchy();
        ydd ydd = ydd.n;
        sp6.i(drawable, 1);
        vdd f = sp6.f(1);
        if (!hsg.k(f.v, ydd)) {
            f.v = ydd;
            f.w = null;
            f.p();
            f.invalidateSelf();
        }
        this.I0 = (ImageView) view.findViewById(tic.keyboard_sticker_item_view__iv_marker);
        this.H0 = (ViewStub) view.findViewById(tic.keyboard_sticker_item_view__lottie_view);
        this.J0 = (ImageView) view.findViewById(tic.keyboard_sticker_item_view__iv_selected);
        view.setOnClickListener(new t84((View.OnClickListener) new ese(this, 1), 0));
        view.setOnLongClickListener(new z20(17, this));
    }

    public final void M(qq7 qq7, xoe xoe) {
        this.L0 = qq7;
        this.M0 = xoe;
        c();
        O(qq7.f);
        boolean z = qq7.e;
        View view = this.a;
        if (z) {
            view.setAlpha(0.3f);
        } else {
            view.setAlpha(1.0f);
        }
        int i = qq7.d;
        P(i);
        String str = qq7.c;
        boolean z2 = true;
        if (TextUtils.isEmpty(str)) {
            KeyboardLottieAnimationView keyboardLottieAnimationView = this.F0;
            if (keyboardLottieAnimationView != null) {
                RLottieImageViewUtils.release(keyboardLottieAnimationView);
                keyboardLottieAnimationView.x = null;
                this.F0.setVisibility(8);
            }
        } else {
            if (this.F0 == null) {
                KeyboardLottieAnimationView keyboardLottieAnimationView2 = (KeyboardLottieAnimationView) this.H0.inflate();
                this.F0 = keyboardLottieAnimationView2;
                gb8 gb8 = this.G0;
                if (gb8 != null) {
                    if (gb8.a == null) {
                        gb8.a = Collections.newSetFromMap(new WeakHashMap());
                    }
                    gb8.a.add(keyboardLottieAnimationView2);
                }
            }
            this.F0.setAutoRepeat(true);
            this.F0.setOnFirstFrameListener(new nqd(14, this));
            this.F0.setFailureListener(new dre(12));
            this.F0.setVisibility(0);
            this.N0 = true;
            KeyboardLottieAnimationView keyboardLottieAnimationView3 = this.F0;
            int i2 = this.E0;
            boolean a = keyboardLottieAnimationView3.a(i2, i2, str);
            this.N0 = false;
            if (!a || this.O0) {
                z2 = false;
            }
            this.O0 = false;
        }
        if (z2) {
            if (i != -1) {
                P(-1);
            }
            knb a2 = ld9.p.get();
            String str2 = qq7.b;
            if (str2 == null || str2.isEmpty()) {
                a2.e = qa7.b(str2);
            } else {
                a2.c(Uri.parse(str2));
            }
            SimpleDraweeView simpleDraweeView = this.D0;
            a2.l = simpleDraweeView.getController();
            a2.h = new fse(this, i);
            simpleDraweeView.setController(a2.a());
            simpleDraweeView.setVisibility(0);
        }
    }

    public final void N(qq7 qq7, xoe xoe, List list) {
        this.L0 = qq7;
        this.M0 = xoe;
        c();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            str.getClass();
            if (str.equals("EDIT")) {
                O(qq7.f);
            } else if (str.equals("IS_ACTIVE")) {
                boolean z = qq7.e;
                View view = this.a;
                if (z) {
                    view.setAlpha(0.3f);
                } else {
                    view.setAlpha(1.0f);
                }
            }
        }
    }

    public final void O(boolean z) {
        ImageView imageView = this.J0;
        if (z) {
            imageView.setVisibility(0);
            xoe xoe = this.M0;
            if (xoe != null) {
                imageView.setImageDrawable(xoe.a(xoe.q));
                return;
            }
            return;
        }
        imageView.setVisibility(8);
    }

    public final void P(int i) {
        ImageView imageView = this.I0;
        if (i == 0) {
            imageView.setImageDrawable(xoe.a(this.M0.k));
            imageView.setVisibility(0);
            imageView.setOnClickListener((View.OnClickListener) null);
        } else if (i == 1) {
            imageView.setImageDrawable(xoe.a(this.M0.l));
            imageView.setVisibility(0);
            imageView.setOnClickListener(this.P0);
        } else if (i != 2) {
            imageView.setVisibility(4);
            imageView.setOnClickListener((View.OnClickListener) null);
        } else {
            imageView.setImageDrawable(xoe.a(this.M0.m));
            imageView.setVisibility(0);
            imageView.setOnClickListener((View.OnClickListener) null);
        }
    }

    public final void c() {
        xoe xoe = this.M0;
        if (xoe != null) {
            this.a.setBackground(xoe.a(xoe.c));
            Drawable a = xoe.a(this.M0.j);
            ImageView imageView = this.I0;
            imageView.setBackground(a);
            imageView.setColorFilter(this.M0.g, PorterDuff.Mode.SRC_IN);
        }
    }
}
