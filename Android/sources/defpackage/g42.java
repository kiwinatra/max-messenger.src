package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import kotlin.jvm.functions.Function0;

/* renamed from: g42  reason: default package */
public final /* synthetic */ class g42 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ i42 b;

    public /* synthetic */ g42(i42 i42, int i) {
        this.a = i;
        this.b = i42;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                int i = cad.q;
                i42 i42 = this.b;
                Drawable b2 = ew3.b(i42.getContext(), i);
                iq.a0(b2, fu4.k.e(i42.getContext()).f().getIcon().g);
                return b2;
            case 1:
                int i2 = cad.l;
                i42 i422 = this.b;
                Drawable b3 = ew3.b(i422.getContext(), i2);
                fu4.k.e(i422.getContext()).f().getIcon().getClass();
                iq.a0(b3, -16745729);
                return b3;
            case 2:
                int i3 = cad.j;
                i42 i423 = this.b;
                Drawable b4 = ew3.b(i423.getContext(), i3);
                fu4.k.e(i423.getContext()).f().getIcon().getClass();
                iq.a0(b4, -16745729);
                return b4;
            default:
                return new RippleDrawable(ColorStateList.valueOf(fu4.k.f(this.b).b().a.f), (Drawable) null, new ColorDrawable(-1));
        }
    }
}
