package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.widget.ImageView;
import kotlin.Lazy;
import ru.ok.messages.views.widgets.EllipsizingEndTextView;
import ru.ok.messages.views.widgets.ImageSpanEllipsizedTextView;
import ru.ok.messages.views.widgets.TamAvatarView;

/* renamed from: y18  reason: default package */
public final class y18 extends pzc implements bif {
    public final TamAvatarView D0;
    public final ImageView E0;
    public final ImageSpanEllipsizedTextView F0;
    public final EllipsizingEndTextView G0;
    public mc2 H0;
    public final /* synthetic */ lf0 I0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y18(lf0 lf0, View view) {
        super(view);
        this.I0 = lf0;
        this.D0 = (TamAvatarView) view.findViewById(lic.row_chat_location__vw_avatar);
        ImageView imageView = (ImageView) view.findViewById(lic.row_chat_location__stop);
        this.E0 = imageView;
        ImageSpanEllipsizedTextView imageSpanEllipsizedTextView = (ImageSpanEllipsizedTextView) view.findViewById(lic.row_chat_location__tv_title);
        this.F0 = imageSpanEllipsizedTextView;
        cvg.x(imageSpanEllipsizedTextView).b();
        this.G0 = (EllipsizingEndTextView) view.findViewById(lic.row_chat_location__tv_subtitle);
        y64.n(view, new x18(this, 0));
        y64.n(imageView, new x18(this, 1));
        c();
    }

    public final void c() {
        View view = this.a;
        Context context = view.getContext();
        Lazy lazy = scf.b0;
        scf k0 = j4b.k0(context);
        view.setBackground(k0.e());
        RippleDrawable d = k0.d();
        ImageView imageView = this.E0;
        imageView.setBackground(d);
        imageView.setColorFilter(k0.N, PorterDuff.Mode.SRC_IN);
        this.F0.setTextColor(k0.G);
        this.G0.setTextColor(k0.K);
    }
}
