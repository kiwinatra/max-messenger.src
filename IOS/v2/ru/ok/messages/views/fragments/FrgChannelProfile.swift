package ru.ok.messages.views.fragments;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.b;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.http.HttpStatus;
import ru.ok.messages.contacts.picker.ActAdminPicker;
import ru.ok.messages.settings.ActSettings;
import ru.ok.messages.views.ActProfilePhoto;
import ru.ok.messages.views.dialogs.ClearChatDialog;
import ru.ok.messages.views.dialogs.ConfirmationOkDialog;
import ru.ok.messages.views.dialogs.FrgDlgDeleteChat;
import ru.ok.messages.views.dialogs.FrgDlgDisableNotifs;
import ru.ok.messages.views.dialogs.FrgDlgLeaveChat;
import ru.ok.messages.views.dialogs.FrgDlgMoveOwner;
import ru.ok.messages.views.dialogs.FrgDlgReportType;
import ru.ok.messages.views.dialogs.InputDialog;
import ru.ok.messages.views.fragments.base.FrgBaseProfileLinkDescription;
import ru.ok.messages.views.widgets.TamAvatarView;

public class FrgChannelProfile extends FrgBaseProfileLinkDescription implements hmf, jwb, g32, kh6, nh6, eh6, x13, uh6, gh6, rma {
    public long W1;
    public long X1;
    public lw9 Y1;
    public yq4 Z1;
    public kwb a2;
    public a32 b2;
    public final ArrayList c2 = new ArrayList();

    public static void G3(b33 b33, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        b33.f(lic.menu_channel_edit__change_name, z);
        b33.f(lic.menu_channel_edit__change_photo, z2);
        b33.f(lic.menu_channel_edit__settings, z3);
        b33.f(lic.menu_channel_edit__remove, z4);
        b33.f(lic.menu_channel_edit__leave, z5);
        b33.f(lic.menu_channel_edit__clear, z6);
        b33.f(lic.menu_channel_edit__report, z7);
    }

    public final void A() {
        s5.T(O1(), ij2.MEMBER, this.b2.a);
    }

    public final void A2(View view, Bundle bundle) {
        super.A2(view, bundle);
        F3(this.b2.a, false);
        kwb kwb = this.a2;
        if (kwb != null && this.b2 != null) {
            kwb.E(this.S1, (od6) X1(), this.b2, ((qra) ((id3) this.p1.b)).q());
        }
    }

    public final String B3() {
        a32 a32 = this.b2;
        if (a32 == null) {
            return null;
        }
        return a32.b.E;
    }

    public final void C0(z93 z93) {
        r62 g = this.q1.g();
        long j = this.b2.a;
        g.getClass();
        z68.c("r62", "complainOnChat, chatId = %d, complaint = %s", Long.valueOf(j), z93);
        this.X1 = ((jna) ((rl) g.p.get())).j(j, z93);
    }

    public final String C3() {
        a32 a32 = this.b2;
        if (a32 == null) {
            return null;
        }
        return a32.b.I;
    }

    public final void D3() {
        m5 X2 = X2();
        if (X2 != null) {
            Intent intent = new Intent();
            intent.putExtra("ru.ok.tamtam.extra.EXTRA_LEAVE", true);
            X2.setResult(-1, intent);
            X2.finish();
        }
    }

    public final void E3() {
        b33 b33 = this.N1;
        if (b33 != null && this.b2 != null) {
            b33.j(wjc.menu_channel_profile, this);
            b33.f(lic.menu_channel_edit__move_owner, this.b2.d());
            if (this.b2.e0()) {
                G3(b33, this.b2.b(), this.b2.a(), true, true, false, true, false);
            } else if (this.b2.v()) {
                G3(b33, this.b2.b(), this.b2.a(), true, false, true, false, true);
            } else {
                G3(b33, false, false, false, false, this.b2.d0(), false, true);
            }
        }
    }

    public final void F1() {
        s5.T(O1(), ij2.BLOCKED_MEMBER, this.b2.a);
    }

    public final void F3(long j, boolean z) {
        if (j != 0) {
            this.b2 = this.q1.g().G(j);
        }
        a32 a32 = this.b2;
        if (a32 == null) {
            return;
        }
        if (a32.E() || this.b2.b0()) {
            a32 a322 = this.b2;
            a322.l0();
            CharSequence charSequence = a322.X;
            b33 b33 = this.N1;
            if (b33 != null) {
                b33.e(n79.D(O1(), charSequence, this.b2.Y(), ((d53) b33.o).d()));
                b33.d(this.b2.q(false));
                Integer n = te8.n(this.b2);
                if (n != null) {
                    String S1 = S1(n.intValue());
                    d53 d53 = (d53) b33.o;
                    if (d53 != null) {
                        d53.setCollapsingTopSubtitle(S1);
                    }
                } else {
                    d53 d532 = (d53) b33.o;
                    if (d532 != null) {
                        d532.setCollapsingTopSubtitle((CharSequence) null);
                    }
                }
            }
            TamAvatarView tamAvatarView = this.J1;
            if (tamAvatarView != null) {
                tamAvatarView.a(this.b2, true);
            }
            TamAvatarView tamAvatarView2 = this.K1;
            if (tamAvatarView2 != null) {
                tamAvatarView2.a(this.b2, true);
            }
            x3();
            this.c2.clear();
            this.c2.addAll(this.b2.k());
            ns3 j2 = this.q1.j();
            ArrayList arrayList = this.c2;
            j2.d(arrayList);
            ConcurrentHashMap concurrentHashMap = j2.g;
            if (concurrentHashMap.isEmpty()) {
                Collections.sort(arrayList, new ms3(j2, j2.b.d(), (Collator) j2.a.f(), 0));
            } else {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!concurrentHashMap.containsKey(Long.valueOf(((vk3) it.next()).r()))) {
                            break;
                        }
                    } else {
                        Collections.sort(arrayList, new ls3(j2, 1));
                        break;
                    }
                }
                Collections.sort(arrayList, new ms3(j2, j2.b.d(), (Collator) j2.a.f(), 0));
            }
            this.c2.add(0, this.q1.i().p(ym.e().a(), true));
            if (z) {
                this.C1.setAdapter(j3());
            } else {
                this.Y1.m();
            }
            H3();
        }
    }

    public final void H3() {
        if (!TextUtils.isEmpty(B3()) || !TextUtils.isEmpty(C3())) {
            this.Z1.v = true;
        } else {
            this.Z1.v = false;
        }
    }

    public final void I(long j) {
        e1d e1d = (e1d) this.q1.getAccessor().g(e1d.class);
        e1d.getClass();
        e1d.a(e1d, j);
        D3();
    }

    public final void O(long j, long j2) {
        this.q1.g().Y(j, j2);
        this.Y1.m();
    }

    public final void O0() {
        if (this.b2.X(((ltb) this.q1.u()).a)) {
            this.q1.g().q0(this.b2.a);
            this.Y1.m();
        } else if (((ltb) this.q1.u()).c.n() != 0) {
            ActSettings.T(lic.setting_notifications, O1(), false);
        } else {
            FrgDlgDisableNotifs.f3(this.b2.a).d3(this);
        }
    }

    public final void S(long j) {
        ((qra) ym.e()).c().e("ACTION_CHANNEL_UNSUBSCRIBE");
        this.q1.g().X(j);
        D3();
    }

    public final void V() {
    }

    public final String V2() {
        return "CHANNEL_PROFILE";
    }

    public final void b3(int i, int i2, Intent intent) {
        super.b3(i, i2, intent);
        if (i2 != -1) {
            return;
        }
        if (i == 102) {
            String stringExtra = intent.getStringExtra("ru.ok.tamtam.extra.INPUT_RESULT");
            b33 b33 = this.N1;
            if (b33 != null) {
                b33.e(n79.D(O1(), stringExtra, this.b2.Y(), ((d53) b33.o).d()));
            }
            this.q1.g().l(this.b2.a, stringExtra);
        } else if (i == 105) {
            long[] longArrayExtra = intent.getLongArrayExtra("ru.ok.tamtam.extra.CHAT_IDS");
            String stringExtra2 = intent.getStringExtra("ru.ok.tamtam.extra.DESCRIPTION");
            ((qra) ((id3) this.p1.b)).getClass();
            u9 u9Var = new u9();
            u9Var.c = C3();
            ((q5e) sjd.a.getAccessor().g(q5e.class)).b(u9Var, cjf.h(longArrayExtra), stringExtra2, (List) null);
            if (longArrayExtra.length == 1) {
                q5.T(X2(), new t5(longArrayExtra[0]));
                U2();
                return;
            }
            hi7.a0(qad.B0, O1());
        } else if (i != 106) {
        } else {
            if (intent == null || !intent.getBooleanExtra("ru.ok.tamtam.extra.EXTRA_LEAVE", false)) {
                U2();
            } else {
                D3();
            }
        }
    }

    public final void f1() {
        if (this.b2 != null) {
            r5.T(M1(), this.b2.a);
        }
    }

    public final void i2(Bundle bundle) {
        super.i2(bundle);
        a32 G = this.q1.g().G(this.x.getLong("ru.ok.tamtam.extra.EXTRA_CHAT_ID"));
        this.b2 = G;
        if (G == null) {
            ((uta) ((qra) ((id3) this.p1.b)).o()).c(new Exception("chat is null"), true);
            M1().finish();
        } else if (!G.K()) {
            ((uta) ((qra) ((id3) this.p1.b)).o()).c(new Exception("not a channel"), true);
            M1().finish();
        } else if (bundle == null) {
            km3 i = this.q1.i();
            ArrayList k = this.b2.k();
            i.getClass();
            jbd.a.r(new p00(2, i, k), new zb2(9));
            if (this.b2.b.a != 0) {
                this.q1.h().b(this.b2, b10.z0);
            }
        } else {
            this.W1 = bundle.getLong("ru.ok.tamtam.extra.CHAT_JOIN_REQUEST_ID", 0);
            this.X1 = bundle.getLong("ru.ok.tamtam.extra.CHAT_COMPLAIN_REQUEST_ID", 0);
        }
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [gy7, java.lang.ref.WeakReference] */
    public final tyc j3() {
        this.Y1 = new lw9();
        this.Z1 = new yq4(xq4.SHORT_DIVIDER);
        H3();
        this.Y1.E(new df7(O1(), this, new WeakReference(this), this.q1.s(), this.b2.o0(), 3));
        if (this.b2.d0()) {
            this.Y1.E(new yq4(xq4.FAT_DIVIDER));
            a32 a32 = this.b2;
            kwb kwb = new kwb(a32.a, this, a32.E(), this.b2.c0(), ((qra) ((id3) this.p1.b)).q().a(this.b2), this.q1.g(), this.q1.u());
            this.a2 = kwb;
            this.Y1.E(kwb);
        }
        if (this.b2.c0()) {
            this.Y1.E(new yq4(xq4.FAT_DIVIDER));
            ArrayList arrayList = new ArrayList();
            arrayList.add(Integer.valueOf(lic.channel_admin_subscribers));
            arrayList.add(Integer.valueOf(lic.chat_admin_admins));
            if (this.b2.b.G > 0) {
                arrayList.add(Integer.valueOf(lic.chat_admin_blocked));
            }
            this.Y1.E(new lf0(this.b2, arrayList, (g32) this));
        }
        if (this.b2.b0()) {
            this.Y1.E(new yq4(xq4.FAT_DIVIDER));
            this.Y1.E(new xw3(Collections.singletonList(l5c.SHARE_CHANNEL), this, (String) null));
        }
        return this.Y1;
    }

    public final View k2(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View k2 = super.k2(layoutInflater, viewGroup, bundle);
        E3();
        return k2;
    }

    public final a32 k3() {
        return this.b2;
    }

    @oye
    public void onEvent(zu3 zu3) {
        z68.c("ru.ok.messages.views.fragments.FrgChannelProfile", "onEvent ContactsUpdateEvent", new Object[0]);
        if (this.b2 != null) {
            List list = zu3.b;
            ArrayList arrayList = this.c2;
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                try {
                    arrayList2.add(Long.valueOf(((vk3) it.next()).r()));
                } catch (Throwable th) {
                    throw new RuntimeException(th);
                }
            }
            if (!(!Collections.disjoint(list, arrayList2))) {
                return;
            }
            if (this.o1) {
                F3(this.b2.a, false);
            } else {
                ryg.S(this.s1, zu3, true);
            }
        }
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == lic.menu_channel_edit__change_name) {
            InputDialog Z2 = InputDialog.Z2(qad.l2, qad.m2, this.b2.b.g, qad.s0, qad.m0, 16385, ym.v.c().b.t(), false);
            Z2.P2(HttpStatus.SC_PROCESSING, this);
            Z2.Y2(this.D0, "ru.ok.messages.views.dialogs.InputDialog");
        } else if (itemId == lic.menu_channel_edit__change_photo) {
            i3(!TextUtils.isEmpty(this.b2.b.d()));
        } else if (itemId == lic.menu_channel_edit__settings) {
            b M1 = M1();
            a32 a32 = this.b2;
            o5.U(0, a32.a, M1, !a32.e0());
        } else if (itemId == lic.menu_channel_edit__move_owner) {
            FrgDlgMoveOwner.f3(this.b2.a, false).d3(this);
        } else if (itemId == lic.menu_channel_edit__clear) {
            ClearChatDialog.f3(this.b2.a).d3(this);
        } else if (itemId == lic.menu_channel_edit__report) {
            long j = this.b2.a;
            Bundle bundle = new Bundle();
            bundle.putLong("ru.ok.tamtam.extra.CHAT_ID", j);
            FrgDlgReportType frgDlgReportType = new FrgDlgReportType();
            frgDlgReportType.L2(bundle);
            frgDlgReportType.d3(this);
        } else if (itemId == lic.menu_channel_edit__leave) {
            FrgDlgLeaveChat.f3(this.b2.a).d3(this);
        } else if (itemId == lic.menu_channel_edit__remove) {
            if (this.b2.d()) {
                FrgDlgMoveOwner.f3(this.b2.a, true).d3(this);
            } else {
                FrgDlgDeleteChat.f3(this.b2.a).d3(this);
            }
        }
        return true;
    }

    public final boolean p3() {
        return !this.b2.f0();
    }

    public final int r3() {
        return qad.L0;
    }

    public final void s1(l5c l5c) {
        if (l5c == l5c.SHARE_CHANNEL) {
            u5.T(this, (Bundle) null, 105, (Serializable) null);
        }
    }

    public final void s3() {
        if (this.o1) {
            String str = this.b2.b.i;
            if (!TextUtils.isEmpty(!cvg.A(str) ? cjf.A(str, kl0.v, jl0.b) : null)) {
                Context O1 = O1();
                a32 a32 = this.b2;
                int i = ActProfilePhoto.C0;
                Objects.requireNonNull(a32);
                t6 t6Var = new t6(gsg.k(new r6(0, a32)), a32.r());
                Intent intent = new Intent(O1, ActProfilePhoto.class);
                intent.putExtra("ru.ok.tamtam.extra.PHOTO_HOLDER", t6Var);
                O1.startActivity(intent);
            } else if (this.b2.a()) {
                i3(!TextUtils.isEmpty(this.b2.b.d()));
            }
        }
    }

    public final void t3(String str, RectF rectF, Rect rect) {
        try {
            String r = m5a.r(str, rect, ((qra) ((id3) this.p1.b)).y().b);
            if (r != null) {
                this.q1.g().j(this.b2.a, r);
            }
        } catch (Exception unused) {
            z68.c("ru.ok.messages.views.fragments.FrgChannelProfile", "local crop failed. Crop will be applied after update from server", new Object[0]);
        }
        ((jna) ((qra) ((id3) this.p1.b)).e()).M(this.b2.a, m5a.n(rectF), str);
        hi7.b0(0, O1(), S1(qad.i7));
    }

    public final void u3() {
        if (!TextUtils.isEmpty(this.b2.b.d())) {
            this.q1.g().x(this.b2.a);
        }
    }

    public final void v3() {
        zma zma;
        ((qra) ym.e()).c().e("ACTION_CHANNEL_SUBSCRIBE");
        synchronized (zma.class) {
            try {
                if (zma.b == null) {
                    zma.b = new zma();
                }
                zma = zma.b;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        zma.getClass();
        this.W1 = ((jna) this.q1.d()).m(this.b2.b.I, (String) null);
        g3(false);
    }

    public final void w() {
        x9f x9f = ((s54) ((qra) ((id3) this.p1.b)).getAccessor().g(s54.class)).a;
        b E2 = E2();
        long j = this.b2.b.a;
        x9f.getClass();
        x9f.a(E2, j);
    }

    public final void w1() {
        s5.T(O1(), ij2.ADMIN, this.b2.a);
    }

    public final void w2() {
        super.w2();
        this.Y1.m();
        kwb kwb = this.a2;
        if (kwb != null && this.b2 != null) {
            kwb.F(((qra) ((id3) this.p1.b)).q().a(this.b2));
        }
    }

    public final void x() {
        this.Y1.m();
    }

    public final void x2(Bundle bundle) {
        super.x2(bundle);
        bundle.putLong("ru.ok.tamtam.extra.CHAT_JOIN_REQUEST_ID", this.W1);
        bundle.putLong("ru.ok.tamtam.extra.CHAT_COMPLAIN_REQUEST_ID", this.X1);
    }

    public final void y() {
        hi7.b0(0, O1(), S1(qad.T0));
    }

    public final void y0() {
        FrgDlgDeleteChat.f3(this.b2.a).d3(this);
    }

    public final void y1(boolean z) {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(y4.a);
        arrayList.add(y4.c);
        long j = this.b2.a;
        ng6 ng6 = ng6.b;
        int i = ActAdminPicker.N0;
        S2(ActAdminPicker.T(j, arrayList, ng6, O1(), z), 106, (Bundle) null);
    }

    @oye
    public void onEvent(xy2 xy2) {
        a32 a32 = this.b2;
        if (a32 != null && xy2.b.contains(Long.valueOf(a32.a))) {
            if (this.o1) {
                F3(this.b2.a, true);
                E3();
                return;
            }
            ryg.S(this.s1, xy2, true);
        }
    }

    @oye
    public void onEvent(hj0 hj0) {
        a32 a32;
        if ((hj0 instanceof gea) && (a32 = this.b2) != null) {
            if (a32.a == ((gea) hj0).a() && this.o1) {
                int i = qad.t1;
                String g = this.q1.s().g(hj0);
                ConfirmationOkDialog confirmationOkDialog = new ConfirmationOkDialog();
                Bundle bundle = new Bundle();
                bundle.putInt("ru.ok.tamtam.extra.TITLE_RES_ID", i);
                bundle.putString("ru.ok.tamtam.extra.CONTENT", g);
                confirmationOkDialog.L2(bundle);
                confirmationOkDialog.Y2(N1(), "ru.ok.messages.views.dialogs.ConfirmationOkDialog");
            }
        }
        long j = hj0.a;
        if (j == this.W1) {
            if (this.o1) {
                this.W1 = 0;
                a3();
                hi7.b0(0, O1(), fhf.c(O1(), hj0.b));
                return;
            }
            ryg.S(this.s1, hj0, true);
        } else if (j == this.X1) {
            this.X1 = 0;
        }
    }

    @oye
    public void onEvent(ab2 ab2) {
        if (ab2.a != this.W1) {
            return;
        }
        if (this.o1) {
            this.W1 = 0;
            a3();
            hi7.b0(0, O1(), S1(qad.M0));
            return;
        }
        ryg.S(this.s1, ab2, true);
    }

    @oye
    public void onEvent(m52 m52) {
        if (m52.a == this.X1) {
            if (this.o1) {
                this.X1 = 0;
                hi7.b0(0, O1(), S1(qad.l8));
                return;
            }
            ryg.S(this.s1, m52, true);
        }
    }
}
