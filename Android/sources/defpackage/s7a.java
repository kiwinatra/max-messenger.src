package defpackage;

import android.net.Uri;
import kotlin.math.MathKt;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* renamed from: s7a  reason: default package */
public final class s7a extends kbe {
    /* renamed from: P */
    public final void M(q7a q7a) {
        OneMeDraweeView oneMeDraweeView = (OneMeDraweeView) this.a;
        oneMeDraweeView.setId(Long.hashCode(q7a.a));
        ra7 d = ra7.d(Uri.parse(q7a.b));
        float f = (float) 64;
        d.d = new v3d(c44.DEFAULT_ASPECT_RATIO, MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density), 12);
        qa7 a = d.a();
        int i = OneMeDraweeView.z0;
        oneMeDraweeView.o(a, (qa7) null);
    }
}
