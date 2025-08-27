package defpackage;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import kotlin.Lazy;
import one.me.sdk.gallery.view.NumericCheckButton;
import one.me.sdk.gallery.view.VideoInfoTextView;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* renamed from: kk6  reason: default package */
public final class kk6 extends jj0 {
    public final gp6 v;

    public kk6(gp6 gp6) {
        super((j4b) w63.L);
        this.v = gp6;
    }

    public final int l(int i) {
        vm6 vm6 = (vm6) E(i);
        if (vm6 != null) {
            return vm6.a;
        }
        return 0;
    }

    public final void s(pzc pzc, int i) {
        scf scf;
        en6 en6 = (en6) pzc;
        vm6 vm6 = (vm6) E(i);
        if (vm6 != null) {
            if ((en6 instanceof cn6) && (vm6 instanceof tm6)) {
                cn6 cn6 = (cn6) en6;
                tm6 tm6 = (tm6) vm6;
                k48 k48 = tm6.c;
                j48 j48 = k48.Z;
                j48 j482 = j48.o;
                int i2 = ((j48 == j482) || j48 == j48.v) ? 0 : 8;
                VideoInfoTextView videoInfoTextView = cn6.G0;
                videoInfoTextView.setVisibility(i2);
                j48 j483 = k48.Z;
                if (j483 == j482) {
                    videoInfoTextView.setText(videoInfoTextView.getContext().getString(qad.T4));
                    videoInfoTextView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                    videoInfoTextView.setVisibility(0);
                } else if (j483 == j48.v) {
                    Context context = videoInfoTextView.getContext();
                    int i3 = nad.Z1;
                    if (videoInfoTextView.isInEditMode()) {
                        scf = vi4.f0;
                    } else {
                        Context context2 = videoInfoTextView.getContext();
                        Lazy lazy = scf.b0;
                        scf = j4b.k0(context2);
                    }
                    Drawable E = iq.E(i3, scf.u, context);
                    videoInfoTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(E, (Drawable) null, (Drawable) null, (Drawable) null);
                    if (E instanceof AnimationDrawable) {
                        videoInfoTextView.post(new kf9((AnimationDrawable) E, 1));
                    }
                    String[] strArr = ghf.c;
                    videoInfoTextView.setText(b0h.c(tm6.m));
                    videoInfoTextView.setVisibility(0);
                }
                Context context3 = cn6.a.getContext();
                ra7 d = ra7.d(tm6.l);
                d.i = false;
                d.o = Boolean.FALSE;
                d.d = tm6.d;
                int i4 = tm6.k;
                if (i4 != 0) {
                    d.l = new efb(i4, 1);
                }
                Uri uri = tm6.g;
                if (uri != null) {
                    d.l = new p6b(context3, uri);
                }
                qa7 a = d.a();
                int i5 = OneMeDraweeView.z0;
                cn6.F0.o(a, (qa7) null);
                NumericCheckButton numericCheckButton = cn6.E0;
                if (numericCheckButton != null) {
                    if (tm6.i) {
                        numericCheckButton.setEnabled(true);
                        numericCheckButton.setNumber(tm6.h);
                    } else {
                        numericCheckButton.setNumber(0);
                        numericCheckButton.setEnabled(false);
                    }
                    ct.G(numericCheckButton, 300, new xu3(17, (Object) cn6));
                }
            }
            ct.G(en6.a, 300, new r13(this, i, vm6, 3));
        }
    }

    public final pzc u(ViewGroup viewGroup, int i) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        return i == 5 ? new pzc(from.inflate(tya.b, viewGroup, false)) : new cn6(from.inflate(tya.c, viewGroup, false), this.v);
    }
}
