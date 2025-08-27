package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import kotlin.Lazy;
import kotlin.Triple;
import ru.ok.messages.views.widgets.TamAvatarView;

/* renamed from: c1f  reason: default package */
public final class c1f extends pzc implements wcf {
    public final TextView D0;
    public final TextView E0;
    public final TamAvatarView F0;
    public final ImageView G0;
    public final View H0;
    public final Integer I0;
    public final Drawable J0;
    public zuf K0;
    public final /* synthetic */ d1f L0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c1f(defpackage.d1f r3, android.view.ViewGroup r4) {
        /*
            r2 = this;
            r2.L0 = r3
            android.view.LayoutInflater r3 = defpackage.f6e.s(r4)
            int r0 = defpackage.ujc.row_suggest
            r1 = 0
            android.view.View r3 = r3.inflate(r0, r4, r1)
            r2.<init>(r3)
            int r4 = defpackage.lic.row_suggest__subtitle
            android.view.View r4 = r3.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r2.D0 = r4
            int r4 = defpackage.lic.row_suggest__title
            android.view.View r4 = r3.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r2.E0 = r4
            int r4 = defpackage.lic.row_suggest__iv_avatar
            android.view.View r4 = r3.findViewById(r4)
            ru.ok.messages.views.widgets.TamAvatarView r4 = (ru.ok.messages.views.widgets.TamAvatarView) r4
            r2.F0 = r4
            int r0 = defpackage.lic.row_suggest__suggest_icon
            android.view.View r0 = r3.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r2.G0 = r0
            int r0 = defpackage.lic.row_suggest__divider
            android.view.View r0 = r3.findViewById(r0)
            r2.H0 = r0
            r0 = 24
            float r0 = (float) r0
            android.content.res.Resources r1 = defpackage.vo4.c()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            float r0 = r0 * r1
            int r0 = kotlin.math.MathKt.roundToInt((float) r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r1 = defpackage.h88.L(r3)
            if (r1 == 0) goto L_0x005d
            goto L_0x005e
        L_0x005d:
            r0 = 0
        L_0x005e:
            r2.I0 = r0
            android.content.Context r0 = r3.getContext()
            int r1 = defpackage.nad.b0
            android.graphics.drawable.Drawable r0 = defpackage.ew3.b(r0, r1)
            scf r1 = r2.N()
            int r1 = r1.x
            r0.setTint(r1)
            r2.J0 = r0
            boolean r0 = r3.isInEditMode()
            if (r0 == 0) goto L_0x007e
            vi4 r0 = defpackage.vi4.f0
            goto L_0x0088
        L_0x007e:
            android.content.Context r0 = r3.getContext()
            kotlin.Lazy r1 = defpackage.scf.b0
            scf r0 = defpackage.j4b.k0(r0)
        L_0x0088:
            r2.L0(r0)
            boolean r2 = defpackage.h88.L(r3)
            if (r2 == 0) goto L_0x0095
            r2 = 1
            r4.setSmallOnlineImage(r2)
        L_0x0095:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c1f.<init>(d1f, android.view.ViewGroup):void");
    }

    public final void L0(scf scf) {
        zuf zuf = this.K0;
        CharSequence charSequence = zuf != null ? zuf.d : null;
        this.D0.setTextColor((charSequence == null || charSequence.length() == 0) ? scf.G : scf.N);
        this.E0.setTextColor(scf.G);
        int i = scf.n;
        int i2 = scf.j;
        this.a.setBackground(i8b.H(i, i2));
        this.F0.L0(scf);
        this.J0.setTint(scf.x);
        this.G0.setBackground(i8b.J(scf.I, i2));
        this.H0.setBackgroundColor(scf.L);
        M();
    }

    public final void M() {
        zuf zuf;
        Triple triple;
        if (this.a.isAttachedToWindow()) {
            TamAvatarView tamAvatarView = this.F0;
            if (tamAvatarView.isAttachedToWindow() && tamAvatarView.getVisibility() == 0 && (zuf = this.K0) != null && (triple = zuf.e) != null) {
                String str = (String) triple.getFirst();
                CharSequence charSequence = (CharSequence) triple.getSecond();
                int intValue = ((Number) triple.getThird()).intValue();
                Integer num = this.I0;
                this.F0.g(str, charSequence, (Long) null, intValue, num != null ? num.intValue() : tamAvatarView.getWidth(), num != null ? num.intValue() : tamAvatarView.getHeight());
            }
        }
    }

    public final scf N() {
        View view = this.a;
        if (view.isInEditMode()) {
            return vi4.f0;
        }
        Context context = view.getContext();
        Lazy lazy = scf.b0;
        return j4b.k0(context);
    }
}
