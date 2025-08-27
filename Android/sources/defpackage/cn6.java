package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewStub;
import kotlin.Lazy;
import one.me.sdk.gallery.view.NumericCheckButton;
import one.me.sdk.gallery.view.VideoInfoTextView;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* renamed from: cn6  reason: default package */
public final class cn6 extends en6 {
    public final gp6 D0;
    public NumericCheckButton E0;
    public final OneMeDraweeView F0;
    public final VideoInfoTextView G0;

    public cn6(View view, gp6 gp6) {
        super(view);
        scf scf;
        scf scf2;
        this.D0 = gp6;
        OneMeDraweeView oneMeDraweeView = (OneMeDraweeView) view.findViewById(sya.e);
        this.F0 = oneMeDraweeView;
        ViewStub viewStub = (ViewStub) view.findViewById(sya.c);
        this.G0 = (VideoInfoTextView) view.findViewById(sya.f);
        Drawable b = ew3.b(view.getContext(), nad.q0);
        if (view.isInEditMode()) {
            scf = vi4.f0;
        } else {
            Context context = view.getContext();
            Lazy lazy = scf.b0;
            scf = j4b.k0(context);
        }
        b.setTint(j4b.l0(0.3f, scf.x));
        sp6 sp6 = (sp6) oneMeDraweeView.getHierarchy();
        if (sp6 != null) {
            sp6.i(b, 1);
        }
        if (view.isInEditMode()) {
            scf2 = vi4.f0;
        } else {
            Context context2 = view.getContext();
            Lazy lazy2 = scf.b0;
            scf2 = j4b.k0(context2);
        }
        oneMeDraweeView.setBackgroundColor(scf2.I);
        if (gp6.b.c) {
            viewStub.setOnInflateListener(new an6(this, 1));
            viewStub.inflate();
        }
    }
}
