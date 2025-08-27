package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import kotlin.jvm.functions.Function0;
import kotlin.math.MathKt;
import one.me.sdk.uikit.common.avatar.OneMeAvatarView;

/* renamed from: o2b  reason: default package */
public final /* synthetic */ class o2b implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ h3b c;

    public /* synthetic */ o2b(Context context, h3b h3b, int i) {
        this.a = i;
        this.b = context;
        this.c = h3b;
    }

    public final Object invoke() {
        ViewGroup.LayoutParams layoutParams;
        switch (this.a) {
            case 0:
                j7e j7e = new j7e(this.b);
                j7e.setId(dad.I0);
                j7e.setEllipsize(TextUtils.TruncateAt.END);
                js9 js9 = fu4.k;
                j7e.setTextColor(js9.e(j7e.getContext()).f().getText().e);
                j7e.setSingleLine();
                p3a p3a = new p3a(6);
                c7e c7e = (c7e) p3a.a;
                c7e.k = false;
                c7e.d = js9.e(j7e.getContext()).f().getText().a;
                p3a.x(js9.e(j7e.getContext()).f().getText().g);
                c7e.i = c44.DEFAULT_ASPECT_RATIO;
                p3a.y(900);
                p3a.w();
                p3a.z(MathKt.roundToInt(((float) 360) * vo4.c().getDisplayMetrics().density));
                c7e.q = new LinearInterpolator();
                c7e q = p3a.q();
                j7e.b.b(q);
                if (q.j) {
                    j7e.setLayerType(2, j7e.a);
                } else {
                    j7e.setLayerType(0, (Paint) null);
                }
                gsg.h(j7e);
                puf.o.b(j7e, uy4.b);
                h3b h3b = this.c;
                h3b.getClass();
                j7e.a(((Boolean) h3b.v.getValue(h3b, h3b.F0[4])).booleanValue());
                h3b.f(j7e);
                return j7e;
            case 1:
                OneMeAvatarView oneMeAvatarView = new OneMeAvatarView(this.b, (AttributeSet) null);
                oneMeAvatarView.setId(dad.K0);
                h3b h3b2 = this.c;
                if (h3b2.getForm() == z2b.c) {
                    float f = (float) 40;
                    layoutParams = new ViewGroup.LayoutParams(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density));
                } else {
                    float f2 = (float) 24;
                    layoutParams = new ViewGroup.LayoutParams(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2), MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density));
                }
                oneMeAvatarView.setLayoutParams(layoutParams);
                oneMeAvatarView.setAvatarShape(goa.a);
                h3b2.h(oneMeAvatarView);
                return oneMeAvatarView;
            case 2:
                ImageView imageView = new ImageView(this.b);
                imageView.setId(dad.L0);
                float f3 = (float) 16;
                imageView.setLayoutParams(new ViewGroup.LayoutParams(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f3), MathKt.roundToInt(f3 * vo4.c().getDisplayMetrics().density)));
                imageView.setImageDrawable(ew3.b(imageView.getContext(), cad.Y));
                imageView.setImageTintList(ColorStateList.valueOf(fu4.k.e(imageView.getContext()).f().getIcon().f));
                this.c.h(imageView);
                return imageView;
            default:
                k3b k3b = new k3b(this.b);
                k3b.setId(dad.H0);
                k3b.setVisibility(8);
                k3b.setAlpha(c44.DEFAULT_ASPECT_RATIO);
                k3b.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                this.c.h(k3b);
                return k3b;
        }
    }
}
