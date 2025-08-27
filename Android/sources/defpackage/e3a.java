package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatTextView;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import kotlin.Lazy;
import ru.ok.messages.media.mediabar.NumericCheckButton;

/* renamed from: e3a  reason: default package */
public final class e3a extends q2 implements bif {
    public View A0;
    public AppCompatImageButton X;
    public AppCompatImageButton Y;
    public ImageView Z;
    public final ch o;
    public final ro4 v = ro4.b();
    public ImageView v0;
    public ViewGroup w;
    public ImageView w0;
    public FrameLayout x;
    public NumericCheckButton x0;
    public AppCompatTextView y;
    public FrameLayout y0;
    public ProgressBar z;
    public ImageView z0;

    public e3a(Context context, ViewStub viewStub, ch chVar) {
        super(context);
        this.o = chVar;
        viewStub.setLayoutResource(ujc.cl_local_media_toolbox);
        this.c = viewStub.inflate();
        M();
    }

    public static void d0(ImageView imageView, boolean z2, scf scf) {
        if (z2) {
            imageView.setBackground(i8b.K(Integer.valueOf(scf.l), (Integer) null, (Integer) null));
            imageView.setColorFilter(scf.m);
            return;
        }
        imageView.setBackground(scf.d());
        imageView.setColorFilter(scf.x);
    }

    public final void M() {
        this.w = (ViewGroup) ((View) this.c).findViewById(lic.local_media_toolbox__content);
        FrameLayout frameLayout = (FrameLayout) ((View) this.c).findViewById(lic.local_media_toolbox__quality_container);
        this.x = frameLayout;
        frameLayout.setOnClickListener(new a3a(this, 0));
        this.y = (AppCompatTextView) ((View) this.c).findViewById(lic.local_media_toolbox__quality_text);
        this.z = (ProgressBar) ((View) this.c).findViewById(lic.local_media_toolbox__quality_progress);
        AppCompatImageButton appCompatImageButton = (AppCompatImageButton) ((View) this.c).findViewById(lic.local_media_toolbox__trim_btn);
        this.X = appCompatImageButton;
        y64.n(appCompatImageButton, new d3a(this, 0));
        AppCompatImageButton appCompatImageButton2 = (AppCompatImageButton) ((View) this.c).findViewById(lic.local_media_toolbox__mute_btn);
        this.Y = appCompatImageButton2;
        Drawable drawable = ((View) this.c).getResources().getDrawable(nad.E1);
        Drawable drawable2 = ((View) this.c).getResources().getDrawable(nad.C1);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842913}, drawable2);
        stateListDrawable.addState(new int[0], drawable);
        appCompatImageButton2.setImageDrawable(stateListDrawable);
        y64.n(this.Y, new d3a(this, 1));
        this.Z = (ImageView) ((View) this.c).findViewById(lic.local_media_toolbox__photo_crop_btn);
        this.v0 = (ImageView) ((View) this.c).findViewById(lic.local_media_toolbox__photo_edit_btn);
        this.w0 = (ImageView) ((View) this.c).findViewById(lic.local_media_toolbox__photo_filter_btn);
        y64.n(this.Z, new d3a(this, 2));
        y64.n(this.v0, new d3a(this, 3));
        y64.n(this.w0, new d3a(this, 4));
        this.x0 = (NumericCheckButton) ((View) this.c).findViewById(lic.local_media_toolbox__btn_select);
        this.y0 = (FrameLayout) ((View) this.c).findViewById(lic.local_media_toolbox__fl_select);
        ImageView imageView = (ImageView) ((View) this.c).findViewById(lic.local_media_toolbox__btn_apply);
        this.z0 = imageView;
        y64.n(imageView, new d3a(this, 5));
        this.A0 = ((View) this.c).findViewById(lic.local_media_toolbox__separator_bottom);
        c();
        ViewGroup viewGroup = this.w;
        td8 td8 = new td8(28, this);
        WeakHashMap weakHashMap = gag.a;
        v9g.u(viewGroup, td8);
        t9g.c(this.w);
    }

    public final void Z(a58 a58) {
        c0(this.y, a58.b);
        c0(this.z, a58.c);
        FrameLayout frameLayout = this.x;
        float f = a58.a ? 1.0f : 0.35f;
        boolean z2 = a58.v;
        a0(f, frameLayout, z2);
        FrameLayout frameLayout2 = this.y0;
        boolean z3 = a58.o;
        c0(frameLayout2, z3);
        c0(this.z0, !z3);
        c0(this.X, z2);
        boolean z4 = z2 && a58.z0;
        c0(this.Y, z4);
        if (z4) {
            this.Y.setSelected(a58.y0);
        }
        c0(this.Z, a58.x);
        c0(this.v0, a58.z);
        c0(this.w0, a58.y);
        this.y.setText(a58.X.a);
        if (a58.Y) {
            this.x0.setEnabled(true);
            this.x0.setNumber(a58.Z);
            ct.G(this.y0, 300, new a3a(this, 1));
        } else {
            ct.G(this.y0, 300, new p71(4));
            this.x0.setNumber(0);
            this.x0.setEnabled(false);
        }
        Lazy lazy = scf.b0;
        scf k0 = j4b.k0((Context) this.b);
        d0(this.Z, a58.v0, k0);
        d0(this.w0, a58.w0, k0);
        d0(this.v0, a58.x0, k0);
    }

    public final void a0(float f, View view, boolean z2) {
        ecg a = gag.a(view);
        c3a c3a = new c3a(0, view, z2);
        WeakReference weakReference = a.a;
        View view2 = (View) weakReference.get();
        if (view2 != null) {
            view2.animate().withStartAction(c3a);
        }
        if (!z2) {
            f = c44.DEFAULT_ASPECT_RATIO;
        }
        a.a(f);
        c3a c3a2 = new c3a(1, view, z2);
        View view3 = (View) weakReference.get();
        if (view3 != null) {
            view3.animate().withEndAction(c3a2);
        }
        a.c(this.o.a.b());
        View view4 = (View) weakReference.get();
        if (view4 != null) {
            view4.animate().start();
        }
    }

    public final void c() {
        if (((View) this.c) != null) {
            Lazy lazy = scf.b0;
            Context context = (Context) this.b;
            scf k0 = j4b.k0(context);
            this.w.setBackgroundColor(k0.n);
            this.A0.setBackgroundColor(k0.L);
            AppCompatImageButton appCompatImageButton = this.X;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            int i = k0.x;
            appCompatImageButton.setColorFilter(i, mode);
            this.X.setBackground(k0.d());
            this.Y.setColorFilter(i, mode);
            this.Y.setBackground(k0.d());
            this.y.setTextColor(i);
            Integer valueOf = Integer.valueOf(i);
            ro4 ro4 = this.v;
            this.x.setBackground(i8b.O(0, valueOf, Integer.valueOf(ro4.b), ro4.d));
            ru4.g(this.z.getIndeterminateDrawable(), i);
            ru4.g(this.Z.getDrawable(), i);
            ru4.g(this.v0.getDrawable(), i);
            ru4.g(this.w0.getDrawable(), i);
            this.Z.setBackground(k0.d());
            this.v0.setBackground(k0.d());
            this.w0.setBackground(k0.d());
            ru4.g(this.z0.getDrawable(), k0.l);
            this.z0.setBackground(k0.d());
            Drawable mutate = ew3.b(context, nad.H).mutate();
            ru4.g(mutate, i);
            this.x0.setUncheckedBackground(mutate);
        }
    }

    public final void c0(View view, boolean z2) {
        a0(1.0f, view, z2);
    }
}
