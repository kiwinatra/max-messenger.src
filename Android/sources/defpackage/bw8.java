package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.mediarouter.app.e;
import androidx.mediarouter.app.f;
import androidx.mediarouter.app.g;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: bw8  reason: default package */
public final class bw8 extends tyc {
    public aw8 X;
    public final int Y;
    public final AccelerateDecelerateInterpolator Z;
    public final ArrayList o = new ArrayList();
    public final LayoutInflater v;
    public final /* synthetic */ dw8 v0;
    public final Drawable w;
    public final Drawable x;
    public final Drawable y;
    public final Drawable z;

    public bw8(dw8 dw8) {
        this.v0 = dw8;
        this.v = LayoutInflater.from(dw8.w0);
        int i = bdc.mediaRouteDefaultIconDrawable;
        Context context = dw8.w0;
        this.w = zw8.e(i, context);
        this.x = zw8.e(bdc.mediaRouteTvIconDrawable, context);
        this.y = zw8.e(bdc.mediaRouteSpeakerIconDrawable, context);
        this.z = zw8.e(bdc.mediaRouteSpeakerGroupIconDrawable, context);
        this.Y = context.getResources().getInteger(yic.mr_cast_volume_slider_layout_animation_duration_ms);
        this.Z = new AccelerateDecelerateInterpolator();
        H();
    }

    public final void E(View view, int i) {
        jv8 jv8 = new jv8(view, i, view.getLayoutParams().height, 1);
        jv8.setAnimationListener(new fv8(1, this));
        jv8.setDuration((long) this.Y);
        jv8.setInterpolator(this.Z);
        view.startAnimation(jv8);
    }

    public final Drawable F(rw8 rw8) {
        Uri uri = rw8.f;
        if (uri != null) {
            try {
                Drawable createFromStream = Drawable.createFromStream(this.v0.w0.getContentResolver().openInputStream(uri), (String) null);
                if (createFromStream != null) {
                    return createFromStream;
                }
            } catch (IOException unused) {
                uri.toString();
            }
        }
        int i = rw8.m;
        return i != 1 ? i != 2 ? rw8.e() ? this.z : this.w : this.y : this.x;
    }

    public final void G() {
        dw8 dw8 = this.v0;
        dw8.v0.clear();
        ArrayList arrayList = dw8.v0;
        ArrayList arrayList2 = dw8.Y;
        ArrayList arrayList3 = new ArrayList();
        qw8 qw8 = dw8.z.a;
        qw8.getClass();
        sw8.b();
        for (rw8 rw8 : Collections.unmodifiableList(qw8.b)) {
            grg b = dw8.z.b(rw8);
            if (b != null && b.z()) {
                arrayList3.add(rw8);
            }
        }
        HashSet hashSet = new HashSet(arrayList2);
        hashSet.removeAll(arrayList3);
        arrayList.addAll(hashSet);
        m();
    }

    public final void H() {
        ArrayList arrayList = this.o;
        arrayList.clear();
        dw8 dw8 = this.v0;
        this.X = new aw8(1, dw8.z);
        ArrayList arrayList2 = dw8.X;
        if (!arrayList2.isEmpty()) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList.add(new aw8(3, (rw8) it.next()));
            }
        } else {
            arrayList.add(new aw8(3, dw8.z));
        }
        ArrayList arrayList3 = dw8.Y;
        boolean z2 = false;
        if (!arrayList3.isEmpty()) {
            Iterator it2 = arrayList3.iterator();
            boolean z3 = false;
            while (it2.hasNext()) {
                rw8 rw8 = (rw8) it2.next();
                if (!arrayList2.contains(rw8)) {
                    if (!z3) {
                        dw8.z.getClass();
                        gw8 a = rw8.a();
                        String j = a != null ? a.j() : null;
                        if (TextUtils.isEmpty(j)) {
                            j = dw8.w0.getString(wlc.mr_dialog_groupable_header);
                        }
                        arrayList.add(new aw8(2, j));
                        z3 = true;
                    }
                    arrayList.add(new aw8(3, rw8));
                }
            }
        }
        ArrayList arrayList4 = dw8.Z;
        if (!arrayList4.isEmpty()) {
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                rw8 rw82 = (rw8) it3.next();
                rw8 rw83 = dw8.z;
                if (rw83 != rw82) {
                    if (!z2) {
                        rw83.getClass();
                        gw8 a2 = rw8.a();
                        String k = a2 != null ? a2.k() : null;
                        if (TextUtils.isEmpty(k)) {
                            k = dw8.w0.getString(wlc.mr_dialog_transferable_header);
                        }
                        arrayList.add(new aw8(2, k));
                        z2 = true;
                    }
                    arrayList.add(new aw8(4, rw82));
                }
            }
        }
        G();
    }

    public final int j() {
        return this.o.size() + 1;
    }

    public final int l(int i) {
        return (i == 0 ? this.X : (aw8) this.o.get(i - 1)).b;
    }

    public final void s(pzc pzc, int i) {
        grg b;
        fw8 fw8;
        ArrayList arrayList = this.o;
        int i2 = (i == 0 ? this.X : (aw8) arrayList.get(i - 1)).b;
        boolean z2 = true;
        aw8 aw8 = i == 0 ? this.X : (aw8) arrayList.get(i - 1);
        dw8 dw8 = this.v0;
        int i3 = 0;
        if (i2 == 1) {
            dw8.E0.put(((rw8) aw8.a).c, (e) pzc);
            f fVar = (f) pzc;
            dw8 dw82 = fVar.J0.v0;
            if (dw82.b1 && Collections.unmodifiableList(dw82.z.u).size() > 1) {
                i3 = fVar.I0;
            }
            View view = fVar.a;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = i3;
            view.setLayoutParams(layoutParams);
            rw8 rw8 = (rw8) aw8.a;
            fVar.M(rw8);
            fVar.H0.setText(rw8.d);
        } else if (i2 != 2) {
            float f = 1.0f;
            if (i2 == 3) {
                dw8.E0.put(((rw8) aw8.a).c, (e) pzc);
                g gVar = (g) pzc;
                rw8 rw82 = (rw8) aw8.a;
                bw8 bw8 = gVar.Q0;
                dw8 dw83 = bw8.v0;
                if (rw82 == dw83.z && Collections.unmodifiableList(rw82.u).size() > 0) {
                    Iterator it = Collections.unmodifiableList(rw82.u).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        rw8 rw83 = (rw8) it.next();
                        if (!dw83.Y.contains(rw83)) {
                            rw82 = rw83;
                            break;
                        }
                    }
                }
                gVar.M(rw82);
                Drawable F = bw8.F(rw82);
                ImageView imageView = gVar.I0;
                imageView.setImageDrawable(F);
                gVar.K0.setText(rw82.d);
                CheckBox checkBox = gVar.M0;
                checkBox.setVisibility(0);
                boolean O = gVar.O(rw82);
                boolean z3 = !dw83.v0.contains(rw82) && (!gVar.O(rw82) || Collections.unmodifiableList(dw83.z.u).size() >= 2) && (!gVar.O(rw82) || ((b = dw83.z.b(rw82)) != null && ((fw8 = (fw8) b.b) == null || fw8.c)));
                checkBox.setChecked(O);
                gVar.J0.setVisibility(4);
                imageView.setVisibility(0);
                View view2 = gVar.H0;
                view2.setEnabled(z3);
                checkBox.setEnabled(z3);
                gVar.E0.setEnabled(z3 || O);
                if (!z3 && !O) {
                    z2 = false;
                }
                gVar.F0.setEnabled(z2);
                wld wld = gVar.P0;
                view2.setOnClickListener(wld);
                checkBox.setOnClickListener(wld);
                if (O && !gVar.D0.e()) {
                    i3 = gVar.O0;
                }
                RelativeLayout relativeLayout = gVar.L0;
                ViewGroup.LayoutParams layoutParams2 = relativeLayout.getLayoutParams();
                layoutParams2.height = i3;
                relativeLayout.setLayoutParams(layoutParams2);
                float f2 = gVar.N0;
                view2.setAlpha((z3 || O) ? 1.0f : f2);
                if (!z3 && O) {
                    f = f2;
                }
                checkBox.setAlpha(f);
            } else if (i2 == 4) {
                yv8 yv8 = (yv8) pzc;
                rw8 rw84 = (rw8) aw8.a;
                yv8.I0 = rw84;
                ImageView imageView2 = yv8.E0;
                imageView2.setVisibility(0);
                yv8.F0.setVisibility(4);
                bw8 bw82 = yv8.J0;
                List unmodifiableList = Collections.unmodifiableList(bw82.v0.z.u);
                if (unmodifiableList.size() == 1 && unmodifiableList.get(0) == rw84) {
                    f = yv8.H0;
                }
                View view3 = yv8.D0;
                view3.setAlpha(f);
                view3.setOnClickListener(new wld(8, yv8));
                imageView2.setImageDrawable(bw82.F(rw84));
                yv8.G0.setText(rw84.d);
            }
        } else {
            ((zv8) pzc).D0.setText(aw8.a.toString());
        }
    }

    public final pzc u(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = this.v;
        if (i == 1) {
            return new f(this, layoutInflater.inflate(njc.mr_cast_group_volume_item, viewGroup, false));
        }
        if (i == 2) {
            return new zv8(layoutInflater.inflate(njc.mr_cast_header_item, viewGroup, false));
        }
        if (i == 3) {
            return new g(this, layoutInflater.inflate(njc.mr_cast_route_item, viewGroup, false));
        }
        if (i != 4) {
            return null;
        }
        return new yv8(this, layoutInflater.inflate(njc.mr_cast_group_item, viewGroup, false));
    }

    public final void z(pzc pzc) {
        this.v0.E0.values().remove(pzc);
    }
}
