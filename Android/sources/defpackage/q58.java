package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.StrictMode;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.android.gms.maps.GoogleMapOptions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.Lazy;
import ru.ok.utils.widgets.RoundedRectFrameLayout;

/* renamed from: q58  reason: default package */
public final class q58 extends RoundedRectFrameLayout implements de8, ud8, o23 {
    public final r20 A0;
    public final r20 B0;
    public final d18 C0 = ((sjd) tr1.h((qra) ym.e())).p();
    public final iz D0 = ((iz) ((sjd) tr1.h((qra) ym.e())).getAccessor().g(iz.class));
    public final hn4 E0 = ((qra) ym.e()).n();
    public vd8 F0;
    public final ro4 G0;
    public final scf H0;
    public boolean I0 = false;
    public p58 J0;
    public final int v;
    public final pc8 v0;
    public l20 w;
    public final LinearLayout w0;
    public ha9 x;
    public final SimpleDraweeView x0;
    public boolean y;
    public final AppCompatImageView y0;
    public final View z;
    public final AppCompatTextView z0;

    /* JADX INFO: finally extract failed */
    public q58(Context context) {
        super(context, (AttributeSet) null);
        getContext();
        this.G0 = ro4.b();
        Context context2 = getContext();
        Lazy lazy = scf.b0;
        this.H0 = j4b.k0(context2);
        this.G0.getClass();
        this.v = vo4.b((int) 11.0f);
        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        googleMapOptions.Y = Boolean.TRUE;
        Boolean bool = Boolean.FALSE;
        googleMapOptions.v = bool;
        googleMapOptions.y = bool;
        googleMapOptions.z0 = bool;
        googleMapOptions.Z = bool;
        googleMapOptions.w = bool;
        googleMapOptions.v0 = bool;
        googleMapOptions.X = bool;
        googleMapOptions.z = bool;
        googleMapOptions.x = bool;
        googleMapOptions.c = 1;
        pc8 pc8 = new pc8(getContext(), googleMapOptions);
        this.v0 = pc8;
        addView(pc8, new FrameLayout.LayoutParams(-1, -1));
        pc8 pc82 = this.v0;
        pc82.getClass();
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            sxg sxg = (sxg) pc82.b;
            sxg.getClass();
            sxg.O((Bundle) null, new qvg(sxg, (Bundle) null));
            if (((wu7) sxg.a) == null) {
                f0.M(pc82);
            }
            StrictMode.setThreadPolicy(threadPolicy);
            pc8 pc83 = this.v0;
            jbf H = ((qra) ym.e()).H();
            H.getClass();
            lfd a = ((kbf) H).a();
            pc83.getClass();
            ee8 ee8 = new ee8((ae8) ((qra) ym.e()).getAccessor().g(ae8.class), a, this, 0);
            if (Looper.getMainLooper() == Looper.myLooper()) {
                sxg sxg2 = (sxg) pc83.b;
                wu7 wu7 = (wu7) sxg2.a;
                if (wu7 != null) {
                    ((qxg) wu7).a(ee8);
                } else {
                    sxg2.z.add(ee8);
                }
                View view = new View(getContext());
                this.z = view;
                view.setAlpha(c44.DEFAULT_ASPECT_RATIO);
                addView(this.z, new FrameLayout.LayoutParams(-1, -1));
                y64.n(this.z, new o58(this, 0));
                this.x0 = new SimpleDraweeView(getContext());
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                this.x0.setScaleType(ImageView.ScaleType.CENTER_CROP);
                if (this.H0.c) {
                    this.x0.setImageResource(nad.j);
                } else {
                    this.x0.setImageResource(nad.k);
                }
                addView(this.x0, layoutParams);
                LinearLayout linearLayout = new LinearLayout(getContext());
                this.w0 = linearLayout;
                linearLayout.setOrientation(1);
                y64.n(this.w0, new o58(this, 1));
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
                layoutParams2.gravity = 17;
                addView(this.w0, layoutParams2);
                this.y0 = new AppCompatImageView(getContext(), (AttributeSet) null);
                int i = this.G0.C;
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(i, i);
                layoutParams3.gravity = 17;
                this.w0.addView(this.y0, layoutParams3);
                this.A0 = new r20(getContext());
                this.B0 = new r20(getContext(), -1);
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), (AttributeSet) null);
                this.z0 = appCompatTextView;
                appCompatTextView.setText(qad.V1);
                this.z0.setTextSize(0, this.G0.T);
                this.z0.setTextColor(fw3.a(getContext(), lad.t));
                AppCompatTextView appCompatTextView2 = this.z0;
                ro4 ro4 = this.G0;
                int i2 = ro4.x;
                int i3 = ro4.h;
                appCompatTextView2.setPadding(i2, i3, i2, i3);
                this.z0.setGravity(17);
                LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams4.gravity = 17;
                this.w0.addView(this.z0, layoutParams4);
                setupLoadingVisibility((l20) null);
                return;
            }
            throw new IllegalStateException("getMapAsync() must be called on the main thread");
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicy);
            throw th;
        }
    }

    private void setupLoadingVisibility(l20 l20) {
        gsf gsf = new gsf();
        gsf.S(new yrf());
        gsf.S(new odg());
        gsf.I(((qra) ym.e()).d().a.b());
        pc8 pc8 = this.v0;
        ArrayList arrayList = gsf.z;
        if (pc8 != null) {
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            if (!arrayList.contains(pc8)) {
                arrayList.add(pc8);
            }
        }
        gsf.z = arrayList;
        esf.a(this, gsf);
        xt6 xt6 = (xt6) ((qra) ym.e()).D();
        if (!(xt6.a() && xt6.d() >= 12000000)) {
            this.x0.setVisibility(0);
            this.w0.setVisibility(0);
            this.z0.setVisibility(0);
            this.z0.setText(getResources().getString(qad.S3, new Object[]{((xt6) ((qra) ym.e()).D()).f}));
            this.y0.setVisibility(8);
        } else if (l20 != null && l20.n.a()) {
            this.x0.setVisibility(0);
            this.w0.setVisibility(0);
            this.z0.setVisibility(0);
            this.z0.setText(jad.z);
            this.y0.setVisibility(0);
            this.y0.setImageResource(nad.K0);
            this.y0.setColorFilter(-1);
            this.y0.setBackground(i8b.K(Integer.valueOf(this.H0.r), (Integer) null, (Integer) null));
            AppCompatImageView appCompatImageView = this.y0;
            int i = this.G0.l;
            appCompatImageView.setPadding(i, i, i, i);
        } else if (l20 != null && l20.n.d()) {
            this.x0.setVisibility(0);
            this.w0.setVisibility(0);
            this.z0.setVisibility(0);
            this.z0.setText(qad.V1);
            this.y0.setVisibility(0);
            this.y0.setImageDrawable(this.A0);
            this.y0.clearColorFilter();
            this.y0.setPadding(0, 0, 0, 0);
        } else if (l20 == null || this.F0 == null || !this.I0) {
            this.x0.setVisibility(0);
            this.w0.setVisibility(0);
            this.z0.setVisibility(8);
            this.y0.setVisibility(0);
            this.y0.setImageDrawable(this.B0);
            this.y0.clearColorFilter();
            this.y0.setPadding(0, 0, 0, 0);
        } else {
            this.x0.setVisibility(8);
            this.w0.setVisibility(8);
        }
    }

    public final void a() {
        this.I0 = true;
        setupLoadingVisibility(this.w);
    }

    public final void b() {
        l20 l20;
        vd8 vd8 = this.F0;
        if (vd8 == null || (l20 = this.w) == null || l20.m == null) {
            setupLoadingVisibility((l20) null);
            return;
        }
        if (this.H0.c) {
            vd8.h(nkc.google_map_night_style, getContext());
            this.x0.setImageResource(nad.j);
        } else {
            jbd.c(vd8.n);
            ((wsb) vd8.d.b).f0((be8) null);
            this.x0.setImageResource(nad.k);
        }
        this.F0.b();
        u10 u10 = this.w.m;
        this.D0.a(this.x);
        float f = u10.g;
        if (f <= c44.DEFAULT_ASPECT_RATIO) {
            f = 14.0f;
        }
        qq3 d = ((j18) this.C0).d(this.x);
        vd8 vd82 = this.F0;
        s58 s58 = d.c;
        double d2 = s58.a;
        Float valueOf = Float.valueOf(f);
        vd82.f(d2, s58.b, valueOf, (Float) null, (Float) null);
        of8 of8 = new of8(d.c);
        ha9 ha9 = this.x;
        of8.b = ha9.w;
        of8.c = ha9.b;
        of8.d = tf8.b;
        of8.e = null;
        of8.f = null;
        of8.h = ((j18) this.C0).g(ha9);
        of8.k = ((j18) this.C0).f(this.x);
        of8.l = d.d;
        this.F0.a(getContext(), Collections.singletonList(new pf8(of8)));
        setupLoadingVisibility(this.w);
        if (((j18) this.C0).f(this.x)) {
            if (!cvg.c(u10.f, this.E0.a())) {
                ((j18) this.C0).k(this.x.z);
            }
        }
    }

    public List<View> getClickableChildren() {
        return Arrays.asList(new View[]{this.v0, this.z});
    }

    public void setListener(p58 p58) {
        this.J0 = p58;
    }
}
