package ru.ok.messages.contacts.profile;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;
import java.util.ArrayList;
import java.util.List;

public class ActContactAvatars extends o5 implements rbg, sg6, hi6, rg6, kmf {
    public static final /* synthetic */ int L0 = 0;
    public ws3 A0;
    public FrgContactAvatarsLoader B0;
    public i04 C0;
    public ArrayList D0;
    public final ArrayList E0 = new ArrayList();
    public int F0;
    public int G0;
    public int H0;
    public b33 I0;
    public ch J0;
    public ao1 K0;
    public ViewPager z0;

    public static void X(long j, Context context) {
        Intent intent = new Intent(context, ActContactAvatars.class);
        intent.putExtra("ru.ok.tamtam.extra.CONTACT_ID", j);
        context.startActivity(intent);
    }

    public final String E() {
        return "AVATAR_PHOTO";
    }

    public final scf K0() {
        return vi4.f0;
    }

    public final void W(int i, List list) {
        z68.c("ru.ok.messages.contacts.profile.ActContactAvatars", "urls = " + list.size() + ", total = " + i, new Object[0]);
        this.F0 = i;
        ArrayList arrayList = this.E0;
        arrayList.clear();
        arrayList.addAll(list);
        this.A0.h();
        this.z0.post(new b(4, (Object) this));
    }

    public final void Y(int i) {
        if (this.F0 != 0) {
            if (i == -1) {
                i = 0;
            }
            b33 b33 = this.I0;
            b33.l((i + 1) + " " + getString(jad.E) + " " + this.F0);
        }
    }

    public final void b(boolean z, boolean z2, boolean z3) {
        if (z) {
            M((View.OnSystemUiVisibilityChangeListener) null);
        } else {
            G((View.OnSystemUiVisibilityChangeListener) null);
        }
        if (z) {
            this.J0.e((Toolbar) this.I0.c);
        } else {
            this.J0.o((Toolbar) this.I0.c);
        }
    }

    public final void c() {
        b(((Toolbar) this.I0.c).getVisibility() != 0, true, false);
    }

    public final boolean d() {
        return ((Toolbar) this.I0.c).getVisibility() == 0;
    }

    public final void f(float f, int i) {
    }

    public final void l(int i) {
    }

    public final void m(int i) {
        z68.c("ru.ok.messages.contacts.profile.ActContactAvatars", "onPageSelected: " + i, new Object[0]);
        this.H0 = i;
        Y(i);
        if (this.E0.size() - i < 3) {
            this.B0.h3();
        }
        ((qra) ym.e()).c().e("AVATAR_PHOTO");
    }

    public final void onCreate(Bundle bundle) {
        FrgContactAvatarsLoader frgContactAvatarsLoader;
        super.onCreate(bundle);
        this.J0 = ((qra) ((id3) this.x.b)).d();
        boolean z = true;
        getWindow().getAttributes().layoutInDisplayCutoutMode = 1;
        b33 T = T(ujc.act_contact_avatars);
        this.I0 = T;
        Drawable E = iq.E(nad.U0, -1, this);
        Toolbar toolbar = (Toolbar) T.c;
        if (toolbar != null) {
            toolbar.setOverflowIcon(E);
        }
        M((View.OnSystemUiVisibilityChangeListener) null);
        int i = lad.f;
        L(getResources().getColor(i));
        getWindow().setNavigationBarColor(getResources().getColor(i));
        Toolbar toolbar2 = (Toolbar) this.I0.c;
        if (toolbar2 != null) {
            toolbar2.setBackgroundResource(i);
        }
        b33 b33 = this.I0;
        Drawable E2 = iq.E(nad.u, -1, this);
        Toolbar toolbar3 = (Toolbar) b33.c;
        if (toolbar3 != null) {
            toolbar3.setNavigationIcon(E2);
        }
        this.I0.h(-1);
        this.I0.i(new x4(2, (Object) this));
        TextView textView = (TextView) this.I0.w;
        if (textView != null) {
            textView.setTextColor(-1);
        }
        ViewPager viewPager = (ViewPager) findViewById(lic.act_contact_profile__vp_pager);
        this.z0 = viewPager;
        viewPager.b(new e5(this, 1));
        if (((qra) ((id3) this.x.b)).y().a.s() != getIntent().getLongExtra("ru.ok.tamtam.extra.CONTACT_ID", 0)) {
            z = false;
        }
        ws3 ws3 = new ws3(v(), this.E0, z, this.G0);
        this.A0 = ws3;
        this.z0.setAdapter(ws3);
        if (bundle != null) {
            this.C0 = (i04) bundle.getSerializable("ru.ok.tamtam.extra.REMOVE_REQUESTS");
            this.D0 = (ArrayList) bundle.getSerializable("ru.ok.tamtam.extra.MAKE_MAIN_REQUESTS");
            int i2 = bundle.getInt("ru.ok.tamtam.extra.MAIN_PHOTO_INDEX");
            this.G0 = i2;
            this.A0.k = i2;
            this.H0 = bundle.getInt("ru.ok.tamtam.extra.CURRENT_PAGE");
        }
        FrgContactAvatarsLoader frgContactAvatarsLoader2 = (FrgContactAvatarsLoader) v().E("ru.ok.messages.contacts.profile.FrgContactAvatarsLoader");
        this.B0 = frgContactAvatarsLoader2;
        if (frgContactAvatarsLoader2 == null) {
            this.H0 = 0;
            long longExtra = getIntent().getLongExtra("ru.ok.tamtam.extra.CONTACT_ID", 0);
            if (longExtra == 0) {
                fo3 fo3 = ((mo3) getIntent().getParcelableExtra("ru.ok.tamtam.extra.CONTACT_INFO")).a;
                frgContactAvatarsLoader = new FrgContactAvatarsLoader();
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("ru.ok.tamtam.extra.CONTACT_INFO", new mo3(fo3));
                frgContactAvatarsLoader.L2(bundle2);
            } else {
                FrgContactAvatarsLoader frgContactAvatarsLoader3 = new FrgContactAvatarsLoader();
                Bundle bundle3 = new Bundle();
                bundle3.putLong("ru.ok.tamtam.extra.CONTACT_ID", longExtra);
                frgContactAvatarsLoader3.L2(bundle3);
                frgContactAvatarsLoader = frgContactAvatarsLoader3;
            }
            this.B0 = frgContactAvatarsLoader;
            b59.d(v(), this.B0, "ru.ok.messages.contacts.profile.FrgContactAvatarsLoader");
        }
        ((qra) ym.e()).c().e("AVATAR_PHOTO");
    }

    @oye
    public void onEvent(i1d i1d) {
        i04 i04 = this.C0;
        if (i04 != null && i04.contains(Long.valueOf(i1d.a))) {
            FrgContactAvatarsLoader frgContactAvatarsLoader = this.B0;
            if (frgContactAvatarsLoader != null) {
                int i = frgContactAvatarsLoader.E1 - 1;
                frgContactAvatarsLoader.E1 = i;
                if (i <= 0) {
                    i = 0;
                }
                frgContactAvatarsLoader.E1 = i;
            }
            this.C0.remove((Object) Long.valueOf(i1d.a));
        }
    }

    public final void onPause() {
        super.onPause();
        this.B0.J1 = null;
    }

    public final void onResume() {
        super.onResume();
        FrgContactAvatarsLoader frgContactAvatarsLoader = this.B0;
        frgContactAvatarsLoader.J1 = this;
        if (frgContactAvatarsLoader.I1) {
            W(frgContactAvatarsLoader.G1, frgContactAvatarsLoader.D1);
        }
        FrgContactAvatarsLoader frgContactAvatarsLoader2 = this.B0;
        W(frgContactAvatarsLoader2.F1 + frgContactAvatarsLoader2.G1, frgContactAvatarsLoader2.D1);
        ((qra) ((id3) this.x.b)).w().f(jgd.AVATAR_VIEWER, h8b.e);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putSerializable("ru.ok.tamtam.extra.REMOVE_REQUESTS", this.C0);
        bundle.putSerializable("ru.ok.tamtam.extra.MAKE_MAIN_REQUESTS", this.D0);
        bundle.putInt("ru.ok.tamtam.extra.MAIN_PHOTO_INDEX", this.G0);
        bundle.putInt("ru.ok.tamtam.extra.CURRENT_PAGE", this.H0);
    }

    public final b33 q1() {
        return this.I0;
    }

    @oye
    public void onEvent(hj0 hj0) {
        ArrayList arrayList;
        long j = hj0.a;
        i04 i04 = this.C0;
        if ((i04 != null && i04.contains(Long.valueOf(j))) || ((arrayList = this.D0) != null && arrayList.contains(Long.valueOf(j)))) {
            if (this.Z) {
                i04 i042 = this.C0;
                qaf qaf = hj0.b;
                long j2 = hj0.a;
                if (i042 == null || !i042.contains(Long.valueOf(j2))) {
                    ArrayList arrayList2 = this.D0;
                    if (arrayList2 != null && arrayList2.contains(Long.valueOf(j2))) {
                        this.D0.remove(Long.valueOf(j2));
                        if (!m58.A(qaf.b)) {
                            hi7.b0(1, this, getString(qad.z));
                            return;
                        }
                        return;
                    }
                    return;
                }
                this.C0.remove((Object) Long.valueOf(j2));
                if (!m58.A(qaf.b)) {
                    hi7.b0(1, this, getString(qad.z));
                    return;
                }
                return;
            }
            ryg.S(this.v0, hj0, false);
        }
    }

    @oye
    public void onEvent(sh3 sh3) {
        if (this.Z && sh3.b != 1) {
            this.A0.h();
        }
    }
}
