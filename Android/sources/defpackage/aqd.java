package defpackage;

import android.net.Uri;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* renamed from: aqd  reason: default package */
public final class aqd extends kbe {
    public static final /* synthetic */ int H0 = 0;
    public final y3a D0;
    public final OneMeDraweeView E0;
    public final AppCompatTextView F0;
    public al6 G0;

    public aqd(y3a y3a, OneMeDraweeView oneMeDraweeView, AppCompatTextView appCompatTextView, LinearLayout linearLayout) {
        super(linearLayout);
        this.D0 = y3a;
        this.E0 = oneMeDraweeView;
        this.F0 = appCompatTextView;
        ct.G(linearLayout, 300, new u99(23, (Object) this));
    }

    /* renamed from: P */
    public final void M(al6 al6) {
        String str;
        this.G0 = al6;
        h3 c = al6.a.a.c();
        boolean z = c instanceof lk6;
        AppCompatTextView appCompatTextView = this.F0;
        if (z) {
            str = appCompatTextView.getContext().getString(((lk6) c).a);
        } else if (c instanceof mk6) {
            str = ((mk6) c).a;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        appCompatTextView.setText(str);
        b0h.H(appCompatTextView, new zpd(al6, this, (Continuation) null));
        OneMeDraweeView oneMeDraweeView = this.E0;
        Uri uri = al6.b;
        if (uri != null) {
            ra7 d = ra7.d(uri);
            d.i = true;
            qa7 a = d.a();
            int i = OneMeDraweeView.z0;
            oneMeDraweeView.o(a, (qa7) null);
            return;
        }
        int i2 = OneMeDraweeView.z0;
        oneMeDraweeView.o((qa7) null, (qa7) null);
    }
}
