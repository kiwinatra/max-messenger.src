package ru.ok.messages.views.fragments;

import android.content.Intent;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.http.HttpStatus;
import ru.ok.messages.contacts.profile.ActContactAvatars;
import ru.ok.messages.views.dialogs.ConfirmationDestructiveDialog;
import ru.ok.messages.views.dialogs.ConfirmationDialog;
import ru.ok.messages.views.fragments.base.FrgBaseProfileLinkDescription;
import ru.ok.messages.views.widgets.TamAvatarView;

public class FrgContactSearchProfile extends FrgBaseProfileLinkDescription implements dm3, hmf, rma {
    public lw9 W1;
    public cs3 X1;
    public ArrayList Y1 = new ArrayList();
    public long Z1 = 0;

    public final void A2(View view, Bundle bundle) {
        super.A2(view, bundle);
        b33 b33 = this.N1;
        if (b33 != null) {
            b33.j(wjc.menu_contact_profile, this);
        }
        if (bundle == null && (this.X1.w > this.Y1.size() || this.Y1.isEmpty())) {
            jna jna = (jna) ((qra) ym.e()).e();
            this.Z1 = jna.z(jna, new pq0(1, ((ltb) jna.D()).a.n(), this.X1.a.a));
        }
        this.C1.setRefreshingNext(this.Z1 != 0);
        D3();
    }

    public final String B3() {
        return this.X1.a.Y;
    }

    public final String C3() {
        return this.X1.a.Z;
    }

    public final void D3() {
        MenuItem b;
        b33 b33 = this.N1;
        if (b33 != null) {
            b33.e(n79.D(O1(), this.X1.a.a(), this.X1.a.X.contains(eo3.OFFICIAL), ((d53) b33.o).d()));
            b33.d(this.X1.a.X.contains(eo3.BOT) ? this.X1.a.d() ? S1(qad.T8) : S1(qad.J) : this.X1.b);
        }
        TamAvatarView tamAvatarView = this.J1;
        if (tamAvatarView != null) {
            fo3 fo3 = this.X1.a;
            tamAvatarView.g(fo3.b(), fo3.a(), Long.valueOf(fo3.a), 0, -1, -1);
        }
        TamAvatarView tamAvatarView2 = this.K1;
        if (tamAvatarView2 != null) {
            fo3 fo32 = this.X1.a;
            tamAvatarView2.g(fo32.b(), fo32.a(), Long.valueOf(fo32.a), 0, -1, -1);
        }
        b33 b332 = this.N1;
        if (!(b332 == null || (b = b332.b(lic.menu_tamtam_profile__delete)) == null)) {
            b.setVisible(this.q1.i().m(this.X1.a.a));
        }
        this.C1.setAdapter(j3());
    }

    public final String V2() {
        return null;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [hvd, zud] */
    public final void b3(int i, int i2, Intent intent) {
        long[] longArrayExtra;
        super.b3(i, i2, intent);
        if (i2 != -1) {
            return;
        }
        if (i == 101) {
            km3 i3 = this.q1.i();
            cs3 cs3 = this.X1;
            i3.z(cs3.a, cs3.o, tm3.a).i(qe.a()).j(new ao1(0, m58.g, new b5(16, this)));
        } else if (i == 103 && (longArrayExtra = intent.getLongArrayExtra("ru.ok.tamtam.extra.CHAT_IDS")) != null && longArrayExtra.length > 0) {
            for (long hvd : longArrayExtra) {
                ? hvd2 = new hvd(hvd);
                fo3 fo3 = this.X1.a;
                hvd2.m = fo3.a;
                hvd2.q = fo3.x;
                this.q1.A().a(new avd(hvd2));
            }
            if (longArrayExtra.length == 1) {
                q5.T(M1(), new t5(longArrayExtra[0]));
                U2();
                return;
            }
            hi7.a0(qad.v9, O1());
        }
    }

    public final void i2(Bundle bundle) {
        super.i2(bundle);
        cs3 cs3 = (cs3) this.x.getSerializable("ru.ok.tamtam.extra.CONTACT_SEARCH_RESULT");
        this.X1 = cs3;
        if (cs3 == null) {
            throw new IllegalArgumentException("ContactSearchResult must be non null");
        } else if (bundle == null) {
            this.Y1.addAll(cs3.v);
        } else {
            this.Y1 = cjf.h(bundle.getLongArray("ru.ok.tamtam.extra.MUTUAL_FRIEND_LIST"));
            this.Z1 = bundle.getLong("ru.ok.tamtam.MUTUAL_FRIENDS_REQUEST_ID");
        }
    }

    /* JADX WARNING: type inference failed for: r4v3, types: [gy7, java.lang.ref.WeakReference] */
    public final tyc j3() {
        this.W1 = new lw9();
        if (!this.X1.a.d()) {
            this.W1.E(new df7(O1(), this, new WeakReference(this), this.q1.s(), this.X1.a.X.contains(eo3.BOT), 2));
        }
        this.W1.E(new yq4(xq4.THIN_DIVIDER));
        lw9 lw9 = this.W1;
        ArrayList arrayList = new ArrayList();
        if (!this.X1.x && !this.q1.i().m(this.X1.a.a) && !this.X1.a.d()) {
            arrayList.add(l5c.ADD_TO_CONTACT_LIST);
        }
        if (!this.X1.a.d()) {
            arrayList.add(l5c.SHARE_CONTACT);
        }
        lw9.E(new xw3(arrayList, this, (String) null));
        if (!this.Y1.isEmpty()) {
            lw9 lw92 = this.W1;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = this.Y1.iterator();
            while (it.hasNext()) {
                arrayList2.add(this.q1.i().p(((Long) it.next()).longValue(), true));
            }
            lw92.E(new nu3(O1(), this, arrayList2, qad.v1));
        }
        return this.W1;
    }

    public final View k2(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View k2 = super.k2(layoutInflater, viewGroup, bundle);
        this.C1.setProgressView(ujc.base_list_progress);
        return k2;
    }

    public final void l1(vk3 vk3) {
        q6.T(M1(), vk3.r());
    }

    public final cs3 m3() {
        return this.X1;
    }

    public final boolean n3() {
        return !this.X1.x;
    }

    public final boolean o3() {
        return !this.X1.a.X.contains(eo3.BOT);
    }

    @oye
    public void onEvent(cr3 cr3) {
        if (cr3.a != this.Z1) {
            return;
        }
        if (this.o1) {
            List list = cr3.b;
            if (list != null) {
                this.Y1.clear();
                this.Y1.addAll(list);
                this.C1.setAdapter(j3());
            }
            this.C1.setRefreshingNext(false);
            return;
        }
        ryg.S(this.s1, cr3, true);
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        if (menuItem.getItemId() != lic.menu_tamtam_profile__delete) {
            return true;
        }
        String S1 = S1(qad.Y1);
        String str = ConfirmationDestructiveDialog.B1;
        q8.w(S1(qad.X1), String.format(S1, new Object[]{this.X1.a.a()}), S1(qad.m0), S1(qad.W1)).Y2(N1(), ConfirmationDestructiveDialog.B1);
        N1().g0("CONFIRMATION_DESTRUCTIVE_REQUEST_KEY", this, new ms1(21, new ata(8, new u75(13, this), new a46(16))));
        return true;
    }

    public final boolean p3() {
        return true;
    }

    public final int r3() {
        if (this.X1.a.X.contains(eo3.BOT)) {
            a32 K = this.q1.g().K(this.X1.a.a);
            if (((K == null || !K.g0()) ? bs0.U(K) : false) && !this.X1.a.d()) {
                return qad.M;
            }
        }
        return qad.p;
    }

    public final void s1(l5c l5c) {
        if (this.o1) {
            int ordinal = l5c.ordinal();
            if (ordinal == 0) {
                Bundle bundle = new Bundle();
                bundle.putInt("ru.ok.tamtam.extra.TITLE_RES_ID", qad.d);
                bundle.putCharSequence("ru.ok.tamtam.extra.CONTENT", String.format(S1(qad.e), new Object[]{this.X1.a.a()}));
                bundle.putInt("ru.ok.tamtam.extra.POSITIVE_TEXT_RES_ID", qad.c);
                bundle.putInt("ru.ok.tamtam.extra.NEGATIVE_TEXT_RES_ID", qad.m0);
                ConfirmationDialog confirmationDialog = new ConfirmationDialog();
                confirmationDialog.L2(bundle);
                confirmationDialog.P2(HttpStatus.SC_SWITCHING_PROTOCOLS, this);
                confirmationDialog.Y2(this.D0, "ru.ok.messages.views.dialogs.ConfirmationDialog");
            } else if (ordinal == 3) {
                u5.T(this, (Bundle) null, 103, (Serializable) null);
            } else if (ordinal == 7 || ordinal == 8) {
                v3();
            }
        }
    }

    public final void s3() {
        fo3 fo3 = this.X1.a;
        kl0 kl0 = kl0.v;
        String str = fo3.o;
        if (!cvg.A(!cvg.A(str) ? cjf.A(str, kl0, jl0.b) : null)) {
            fo3 fo32 = this.X1.a;
            int i = ActContactAvatars.L0;
            Intent intent = new Intent(M1(), ActContactAvatars.class);
            intent.putExtra("ru.ok.tamtam.extra.CONTACT_INFO", new mo3(fo32));
            R2(intent, (Bundle) null);
        }
    }

    public final void t3(String str, RectF rectF, Rect rect) {
    }

    public final void u3() {
    }

    public final void v3() {
        if (this.X1.a.X.contains(eo3.BOT)) {
            r62 g = this.q1.g();
            km3 i = this.q1.i();
            cs3 cs3 = this.X1;
            fo3 fo3 = cs3.a;
            m5 X2 = X2();
            jqg A = this.q1.A();
            a32 K = g.K(fo3.a);
            if (bs0.U(K)) {
                if (i.p(fo3.a, false) == null) {
                    i.z(fo3, cs3.o, tm3.b).i(qe.a()).j(new ao1(0, m58.g, new br0(g, fo3, X2, K, A)));
                } else {
                    bs0.T(g, fo3.a, (zg6) null, X2, K, A);
                }
                U2();
                return;
            }
        }
        super.v3();
    }

    public final void x2(Bundle bundle) {
        super.x2(bundle);
        bundle.putLongArray("ru.ok.tamtam.extra.MUTUAL_FRIEND_LIST", cjf.i(this.Y1));
        bundle.putLong("ru.ok.tamtam.MUTUAL_FRIENDS_REQUEST_ID", this.Z1);
    }

    @oye
    public void onEvent(hj0 hj0) {
        z68.c("ru.ok.messages.views.fragments.FrgContactSearchProfile", "onEvent, event = " + hj0.b, new Object[0]);
        if (hj0.a != this.Z1) {
            return;
        }
        if (this.o1) {
            rl e = ((qra) ym.e()).e();
            jna jna = (jna) e;
            this.Z1 = jna.z(jna, new pq0(1, ((ltb) jna.D()).a.n(), this.X1.a.a));
            return;
        }
        ryg.S(this.s1, hj0, true);
    }
}
