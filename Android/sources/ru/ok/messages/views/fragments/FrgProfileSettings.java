package ru.ok.messages.views.fragments;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import androidx.fragment.app.b;
import java.util.ArrayList;
import ru.ok.messages.contacts.profile.ActContactAvatars;
import ru.ok.messages.views.dialogs.LogoutProgressDialog;
import ru.ok.messages.views.widgets.TamAvatarView;

public final class FrgProfileSettings extends FrgContactProfile {
    public final p45 f2 = p45.a;
    public String g2;
    public gk8 h2;
    public long i2;

    public final void A2(View view, Bundle bundle) {
        super.A2(view, bundle);
        if (bundle != null) {
            this.g2 = bundle.getString("ru.ok.tamtam.extra.PROFILE_NAME");
            this.i2 = bundle.getLong("ru.ok.tamtam.extra.REMOVE_CONTACT_PHOTO_REQUEST");
        }
        b33 b33 = this.N1;
        if (b33 != null) {
            b33.j(wjc.menu_profile, this);
        }
        Z2(view);
    }

    public final void G3() {
        b33 b33 = this.N1;
        this.W1 = this.q1.i().p(this.W1.r(), true);
        if (b33 != null) {
            b33.e(n79.D(O1(), this.W1.p(this.q1.s()), this.W1.z(), ((d53) b33.o).d()));
            H3();
            String u = this.W1.u(((ltb) this.q1.u()).a.p(), kl0.c);
            TamAvatarView tamAvatarView = this.J1;
            if (tamAvatarView != null) {
                tamAvatarView.c(this.W1, false, false, u, true);
            }
            TamAvatarView tamAvatarView2 = this.K1;
            if (tamAvatarView2 != null) {
                tamAvatarView2.c(this.W1, false, false, u, true);
            }
        }
    }

    public final void H3() {
        b33 b33 = this.N1;
        if (b33 != null) {
            String c = hhf.c(this.W1.m());
            boolean A = cvg.A(c);
            d53 d53 = (d53) b33.o;
            if (!A) {
                b33.d(c);
                int i = this.r1.l;
                if (d53 != null) {
                    d53.setCollapsingSubtitleColor(i);
                }
                b5 b5Var = new b5(19, this);
                if (d53 != null) {
                    d53.setCollapsingSubtitleClickListener(b5Var);
                    return;
                }
                return;
            }
            int i3 = this.r1.K;
            if (d53 != null) {
                d53.setCollapsingSubtitleColor(i3);
            }
            if (d53 != null) {
                d53.setCollapsingSubtitleClickListener((x6) null);
            }
            if (this.W1.s() != 0) {
                a33 a33 = ((ltb) this.q1.u()).a;
                b33.d(fhf.a((aeb) ((qra) ((id3) this.p1.b)).getAccessor().g(aeb.class), String.valueOf(this.W1.s()), a33.g.getString("app.location.country.code", (String) null), a33.q()));
            } else if (!ym.v.c().c.g.getBoolean("app.privacy.online.show", true)) {
                b33.d(S1(qad.Q7));
            } else {
                b33.d(ghf.e(this.q1.s().f().toString()));
            }
        }
    }

    public final boolean I3() {
        return (TextUtils.isEmpty(this.W1.d()) ^ true) && ((this.W1.a.c.e > 0 ? 1 : (this.W1.a.c.e == 0 ? 0 : -1)) != 0);
    }

    public final String V2() {
        return "SETTINGS";
    }

    public final void Z2(View view) {
        super.Z2(view);
        f6e.C(this.C1);
        gk8 gk8 = this.h2;
        ArrayList arrayList = (ArrayList) gk8.Y;
        arrayList.clear();
        arrayList.addAll(gk8.E());
        gk8.m();
    }

    public final void b3(int i, int i3, Intent intent) {
        super.b3(i, i3, intent);
        if (i == 101 && i3 == -1) {
            LogoutProgressDialog logoutProgressDialog = new LogoutProgressDialog();
            logoutProgressDialog.r1 = false;
            Dialog dialog = logoutProgressDialog.w1;
            if (dialog != null) {
                dialog.setCancelable(false);
            }
            logoutProgressDialog.Y2(this.D0, "ru.ok.messages.views.dialogs.LogoutProgressDialog");
            this.q1.e().h(true);
        }
    }

    public final tyc j3() {
        lw9 lw9 = new lw9();
        b M1 = M1();
        ltb y = ((qra) ((id3) this.p1.b)).y();
        cq f = ((qra) ((id3) this.p1.b)).f();
        saf saf = (saf) ((qra) ((id3) this.p1.b)).getAccessor().g(saf.class);
        kv0.K();
        int n = ((qra) ((id3) this.p1.b)).y().b.n();
        i94 i94 = i94.DISABLED;
        gk8 gk8 = new gk8(M1, this, y, f, n == 3);
        this.h2 = gk8;
        lw9.E(gk8);
        return lw9;
    }

    public final void l2() {
        super.l2();
        this.f2.getClass();
    }

    public final boolean n3() {
        return false;
    }

    public final boolean o3() {
        return false;
    }

    @oye
    public void onEvent(zu3 zu3) {
        super.onEvent(zu3);
    }

    @oye
    public void onLogout(p98 p98) {
        if (this.o1) {
            LogoutProgressDialog logoutProgressDialog = (LogoutProgressDialog) this.D0.E("ru.ok.messages.views.dialogs.LogoutProgressDialog");
            if (logoutProgressDialog != null) {
                logoutProgressDialog.T2(false, false);
                return;
            }
            return;
        }
        T0(p98);
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        if (menuItem.getItemId() != lic.menu_profile__edit) {
            return true;
        }
        Context O1 = O1();
        int i = d6.z0;
        O1.startActivity(new Intent(O1, d6.class));
        return true;
    }

    public final void p2(boolean z) {
        super.p2(z);
        if (!z) {
            G3();
        }
    }

    public final boolean p3() {
        return false;
    }

    public final void s3() {
        if (!TextUtils.isEmpty(this.W1.h(ym.v.c().a))) {
            long r = this.W1.r();
            int i = ActContactAvatars.L0;
            ActContactAvatars.X(r, M1());
            return;
        }
        i3(I3());
    }

    public final void t3(String str, RectF rectF, Rect rect) {
        try {
            String r = m5a.r(str, rect, ((qra) ((id3) this.p1.b)).y().b);
            if (r != null) {
                ((qra) ((id3) this.p1.b)).m().f(r, 0, (String) null, (String) null);
            }
        } catch (Exception unused) {
            z68.f("ru.ok.messages.views.fragments.FrgProfileSettings", "local crop failed. Crop will be applied after update from server", (Throwable) null);
        }
        ((jna) ((qra) ((id3) this.p1.b)).e()).N(str, m5a.n(rectF));
        hi7.a0(qad.i7, O1());
    }

    public final void u3() {
        if (I3()) {
            this.i2 = ((jna) this.q1.d()).S(this.W1.a.c.e);
            this.W1 = this.q1.i().f((String) null, 0, (String) null, (String) null);
            hi7.a0(qad.q7, O1());
        }
    }

    public final void w2() {
        super.w2();
        G3();
        gk8 gk8 = this.h2;
        if (gk8.F() != ((cq) gk8.X).c()) {
            ArrayList arrayList = (ArrayList) gk8.Y;
            arrayList.clear();
            arrayList.addAll(gk8.E());
            gk8.m();
        }
    }

    public final void x2(Bundle bundle) {
        super.x2(bundle);
        bundle.putString("ru.ok.tamtam.extra.PROFILE_NAME", this.g2);
        bundle.putLong("ru.ok.tamtam.extra.REMOVE_CONTACT_PHOTO_REQUEST", this.i2);
    }

    @oye
    public void onEvent(xy2 xy2) {
        super.onEvent(xy2);
    }

    @oye
    public void onEvent(hj0 hj0) {
        if (hj0.a != this.i2) {
            return;
        }
        if (this.o1) {
            this.i2 = 0;
            if (!m58.A(hj0.b.b)) {
                hi7.b0(1, O1(), S1(qad.z));
                return;
            }
            return;
        }
        ryg.S(this.s1, hj0, false);
    }
}
