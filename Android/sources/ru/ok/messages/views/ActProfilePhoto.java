package ru.ok.messages.views;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import ru.ok.messages.views.fragments.FrgProfilePhoto;

public class ActProfilePhoto extends o5 implements hi6, kmf {
    public static final /* synthetic */ int C0 = 0;
    public b33 A0;
    public ch B0;
    public View z0;

    public final String E() {
        return null;
    }

    public final scf K0() {
        return vi4.f0;
    }

    public final void b(boolean z, boolean z2, boolean z3) {
        if (z) {
            M((View.OnSystemUiVisibilityChangeListener) null);
        } else {
            G((View.OnSystemUiVisibilityChangeListener) null);
        }
        this.z0.setVisibility(z ? 0 : 4);
        if (z) {
            this.B0.e((Toolbar) this.A0.c);
        } else {
            this.B0.o((Toolbar) this.A0.c);
        }
    }

    public final void c() {
        b(((Toolbar) this.A0.c).getVisibility() != 0, true, false);
    }

    public final boolean d() {
        return ((Toolbar) this.A0.c).getVisibility() == 0;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.B0 = ((qra) ((id3) this.x.b)).d();
        getWindow().getAttributes().layoutInDisplayCutoutMode = 1;
        this.A0 = T(ujc.act_profile_photo);
        M((View.OnSystemUiVisibilityChangeListener) null);
        int i = lad.f;
        L(getResources().getColor(i));
        getWindow().setNavigationBarColor(getResources().getColor(i));
        b33 b33 = this.A0;
        rx0 rx0 = new rx0(14);
        Toolbar toolbar = (Toolbar) b33.c;
        if (toolbar != null) {
            toolbar.setOnMenuItemClickListener(rx0);
        }
        Toolbar toolbar2 = (Toolbar) this.A0.c;
        if (toolbar2 != null) {
            toolbar2.setBackgroundResource(i);
        }
        b33 b332 = this.A0;
        Drawable E = iq.E(nad.u, -1, this);
        Toolbar toolbar3 = (Toolbar) b332.c;
        if (toolbar3 != null) {
            toolbar3.setNavigationIcon(E);
        }
        this.A0.i(new x4(5, (Object) this));
        TextView textView = (TextView) this.A0.w;
        if (textView != null) {
            textView.setTextColor(-1);
        }
        this.A0.n();
        this.A0.h(-1);
        b33 b333 = this.A0;
        Drawable E2 = iq.E(nad.U0, -1, this);
        Toolbar toolbar4 = (Toolbar) b333.c;
        if (toolbar4 != null) {
            toolbar4.setOverflowIcon(E2);
        }
        if (bundle == null) {
            t6 t6Var = (t6) getIntent().getParcelableExtra("ru.ok.tamtam.extra.PHOTO_HOLDER");
            ja9 ja9 = (ja9) getIntent().getParcelableExtra("ru.ok.tamtam.extra.EXTRA_CONTROL_MESSAGE_DB");
            if (t6Var != null) {
                FrgProfilePhoto frgProfilePhoto = new FrgProfilePhoto();
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("ru.ok.tamtam.extra.CONTENT_HOLDER", t6Var);
                if (ja9 != null) {
                    bundle2.putParcelable("ru.ok.tamtam.extra.EXTRA_CONTROL_MSG_DB_PARC", ja9);
                }
                frgProfilePhoto.L2(bundle2);
                b59.c(v(), lic.act_profile_photo__container, frgProfilePhoto, "ru.ok.messages.views.fragments.FrgProfilePhoto");
            } else {
                throw new IllegalArgumentException("PhotoContentHolder must be non null");
            }
        }
        this.z0 = findViewById(lic.act_profile_photo__vw_top_bg);
        this.z0.getLayoutParams().height = vo4.a(this) * 2;
    }

    public final void onResume() {
        super.onResume();
        z5a w = ((qra) ((id3) this.x.b)).w();
        jgd jgd = jgd.AVATAR_VIEWER;
        h8b h8b = h8b.e;
        w.f(jgd, h8b.e);
    }

    public final b33 q1() {
        return this.A0;
    }
}
