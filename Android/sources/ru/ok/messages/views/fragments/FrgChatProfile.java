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
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.apache.http.HttpStatus;
import ru.ok.messages.calls.utils.StartCallsViewModel;
import ru.ok.messages.contacts.picker.ActAdminPicker;
import ru.ok.messages.settings.ActSettings;
import ru.ok.messages.views.ActProfilePhoto;
import ru.ok.messages.views.dialogs.ClearChatDialog;
import ru.ok.messages.views.dialogs.ConfirmationOkDialog;
import ru.ok.messages.views.dialogs.FrgDlgChatMemberDelete;
import ru.ok.messages.views.dialogs.FrgDlgDeleteChat;
import ru.ok.messages.views.dialogs.FrgDlgDisableNotifs;
import ru.ok.messages.views.dialogs.FrgDlgLeaveChat;
import ru.ok.messages.views.dialogs.FrgDlgMoveOwner;
import ru.ok.messages.views.dialogs.FrgDlgReportType;
import ru.ok.messages.views.dialogs.FrgDlgRestartLocation;
import ru.ok.messages.views.dialogs.FrgDlgShowChatHistory;
import ru.ok.messages.views.dialogs.InputDialog;
import ru.ok.messages.views.dialogs.MakeNonAdminDialog;
import ru.ok.messages.views.fragments.base.FrgBase;
import ru.ok.messages.views.fragments.base.FrgBaseProfileLinkDescription;
import ru.ok.messages.views.widgets.TamAvatarView;
import ru.ok.tamtam.android.prefs.PmsKey;

public class FrgChatProfile extends FrgBaseProfileLinkDescription implements cx6, hmf, jwb, xh6, g32, nh6, kh6, x13, eh6, uh6, gh6, hj2, ah6, md8, z3c, p18, gnf, vh6, rma, ej2 {
    public lw9 W1;
    public a32 X1;
    public we8 Y1;
    public qj2 Z1;
    public final ArrayList a2 = new ArrayList();
    public long b2;
    public long c2;
    public long d2;
    public String e2;
    public q18 f2;
    public eud g2;
    public xw3 h2;
    public yq4 i2;
    public kwb j2;

    public static void J3(b33 b33, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        b33.f(lic.menu_chat_edit__change_name, z);
        b33.f(lic.menu_chat_edit__change_photo, z2);
        b33.f(lic.menu_chat_edit__settings, z3);
        b33.f(lic.menu_chat_edit__description, z4);
        b33.f(lic.menu_chat_edit__remove, z5);
        b33.f(lic.menu_chat_edit__clear, z6);
        b33.f(lic.menu_chat_edit__report, z7);
        b33.f(lic.menu_chat_edit__leave, z8);
    }

    public final void A() {
        s5.T(O1(), ij2.MEMBER, this.X1.a);
    }

    public final void A2(View view, Bundle bundle) {
        a32 a32;
        super.A2(view, bundle);
        H3(0, false);
        if (this.j2 != null && (a32 = this.X1) != null) {
            z68.c("ru.ok.messages.views.fragments.FrgChatProfile", "folder observe: chat=%s", a32);
            this.j2.E(this.S1, (od6) X1(), this.X1, ((qra) ((id3) this.p1.b)).q());
        }
    }

    public final void A3(boolean z) {
        StartCallsViewModel startCallsViewModel = this.R1;
        a32 a32 = this.X1;
        xme xme = startCallsViewModel.n;
        xme xme2 = startCallsViewModel.q;
        if (a32 == null) {
            hsg.l(xme2);
            int i = qad.a;
            o85 o85 = new o85(new Object());
            xme.getClass();
            xme.m((Object) null, o85);
            return;
        }
        m72 m72 = a32.b;
        if (m72.a == 0) {
            hsg.l(xme2);
            int i3 = qad.a;
            o85 o852 = new o85(new Object());
            xme.getClass();
            xme.m((Object) null, o852);
            return;
        }
        startCallsViewModel.f.getClass();
        startCallsViewModel.l(new lje(a32.a, m72.a, m72.T != null), z);
    }

    public final void B0(bj2 bj2) {
        if (bj2.a.a == ((id3) this.p1.b).a()) {
            hi7.b0(0, O1(), S1(qad.E8));
        } else {
            q6.T(M1(), bj2.a.a);
        }
    }

    public final String B3() {
        a32 a32 = this.X1;
        if (a32 == null) {
            return null;
        }
        return a32.b.E;
    }

    public final void C0(z93 z93) {
        r62 g = this.q1.g();
        long j = this.X1.a;
        g.getClass();
        z68.c("r62", "complainOnChat, chatId = %d, complaint = %s", Long.valueOf(j), z93);
        this.c2 = ((jna) ((rl) g.p.get())).j(j, z93);
    }

    public final void C1(long j) {
        z4.T(X2(), 0, j, this.X1.a);
    }

    public final String C3() {
        a32 a32 = this.X1;
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

    public final CharSequence E3(boolean z) {
        int t;
        a32 a32 = this.X1;
        a32.l0();
        CharSequence D = n79.D(O1(), a32.X, this.X1.Y(), z);
        if (!this.X1.L()) {
            return D;
        }
        a32 a322 = this.X1;
        a322.z0.getClass();
        if ((!cvg.A(a322.b.g)) || D.length() <= (t = ((ltb) this.q1.u()).b.t())) {
            return D;
        }
        return D.subSequence(0, t) + "…";
    }

    public final void F1() {
        s5.T(O1(), ij2.BLOCKED_MEMBER, this.X1.a);
    }

    public final void F3(boolean z) {
        xw3 xw3 = this.h2;
        if (xw3 != null) {
            xw3.x = z;
        }
        yq4 yq4 = this.i2;
        if (yq4 != null) {
            yq4.v = z;
        }
        lw9 lw9 = this.W1;
        if (lw9 != null) {
            lw9.m();
        }
    }

    public final void G3() {
        b33 b33 = this.N1;
        if (b33 != null) {
            b33.j(wjc.menu_chat_profile, this);
            b33.f(lic.menu_chat_move_admin_ownership, this.X1.G(this.q1.i().r().r()) && this.X1.e0());
            boolean z = !this.X1.b.J.b(8);
            boolean b = this.X1.b();
            boolean a = this.X1.a();
            if (this.X1.e0()) {
                J3(b33, b, a, true, false, true, true, false, z);
            } else if (this.X1.W()) {
                J3(b33, b, a, false, this.X1.v() || !this.X1.b.H.b, false, true, true, z);
            } else {
                J3(b33, false, false, false, false, false, false, true, this.X1.f0() && z);
            }
            b33.f(lic.menu_chat_edit__settings, false);
        }
    }

    public final void H3(long j, boolean z) {
        if (j != 0) {
            this.X1 = this.q1.g().G(j);
        }
        a32 a32 = this.X1;
        if (a32 == null) {
            U2();
            return;
        }
        q18 q18 = this.f2;
        if (q18 != null) {
            q18.e(a32);
            this.f2.f();
        }
        b33 b33 = this.N1;
        if (b33 != null) {
            d53 d53 = (d53) b33.o;
            b33.e(E3(d53.d()));
            b33.d(this.X1.q(true));
            Integer n = te8.n(this.X1);
            if (n != null) {
                String S1 = S1(n.intValue());
                if (d53 != null) {
                    d53.setCollapsingTopSubtitle(S1);
                }
            } else if (d53 != null) {
                d53.setCollapsingTopSubtitle((CharSequence) null);
            }
        }
        TamAvatarView tamAvatarView = this.J1;
        if (tamAvatarView != null) {
            tamAvatarView.a(this.X1, true);
        }
        TamAvatarView tamAvatarView2 = this.K1;
        if (tamAvatarView2 != null) {
            tamAvatarView2.a(this.X1, true);
        }
        x3();
        I3(z);
    }

    public final void I(long j) {
        e1d e1d = (e1d) this.q1.getAccessor().g(e1d.class);
        e1d.getClass();
        e1d.a(e1d, j);
        D3();
    }

    public final void I3(boolean z) {
        ArrayList arrayList = this.a2;
        arrayList.clear();
        arrayList.addAll(this.Z1.b.f);
        if (arrayList.size() > 10) {
            arrayList.subList(10, arrayList.size()).clear();
        }
        if (z) {
            this.C1.setAdapter(j3());
        } else {
            this.W1.m();
        }
    }

    public final void K(long j) {
    }

    public final void L(long j, String str, boolean z) {
        FrgDlgChatMemberDelete.f3(j, str, z, this.X1.K()).d3(this);
    }

    public final void M(int i, long j) {
        rl d = this.q1.d();
        a32 a32 = this.X1;
        long d3 = ((jna) d).d(i, a32.a, a32.b.a, Collections.singletonList(Long.valueOf(j)));
        if (i != 0) {
            this.d2 = d3;
            g3(false);
            return;
        }
        this.Z1.f(j);
    }

    public final void O(long j, long j3) {
        this.q1.g().Y(j, j3);
        this.W1.m();
    }

    public final void O0() {
        if (this.X1.X(((ltb) this.q1.u()).a)) {
            this.q1.g().q0(this.X1.a);
            this.W1.m();
        } else if (this.X1.N() || ((ltb) this.q1.u()).c.n() == 0) {
            FrgDlgDisableNotifs.f3(this.X1.a).d3(this);
        } else {
            ActSettings.T(lic.setting_notifications, O1(), false);
        }
    }

    public final boolean Q0(bj2 bj2) {
        a32 a32 = this.X1;
        if (a32 == null) {
            return false;
        }
        long j = bj2.a.a;
        return j != a32.b.d && this.Y1.c(j);
    }

    public final void R0(long j, String str) {
        Bundle bundle = new Bundle();
        bundle.putLong("ru.ok.tamtam.extra.CONTACT_IDs", j);
        bundle.putString("ru.ok.tamtam.extra.NAME", str);
        MakeNonAdminDialog makeNonAdminDialog = new MakeNonAdminDialog();
        makeNonAdminDialog.L2(bundle);
        makeNonAdminDialog.Y2(N1(), "ru.ok.messages.views.dialogs.MakeNonAdminDialog");
    }

    public final void S(long j) {
        this.q1.g().X(this.X1.a);
        D3();
    }

    public final void T(long j) {
        rl d = this.q1.d();
        a32 a32 = this.X1;
        ((jna) d).Q(a32.a, a32.b.a, Collections.singletonList(Long.valueOf(j)), true, this.X1.f(j));
        this.q1.g().d0(this.X1.a, Collections.singletonList(Long.valueOf(j)));
    }

    public final void V() {
    }

    public final String V2() {
        return "CHAT_PROFILE";
    }

    public final void a(boolean z) {
        wh8 c = ((j18) this.q1.p()).c(this.X1.a);
        jbf H = ((qra) ((id3) this.p1.b)).H();
        H.getClass();
        oi8 f = c.h(((kbf) H).a()).f(qe.a());
        oh8 oh8 = new oh8(new h62(this, z, 3), new og6(this), m58.e);
        f.a(oh8);
        T2(oh8);
    }

    public final void a0(kx6 kx6) {
        if (kx6 == kx6.b || kx6 == kx6.a) {
            ArrayList arrayList = new ArrayList(this.q1.i().s());
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                try {
                    arrayList2.add(Long.valueOf(((vk3) it.next()).r()));
                } catch (Throwable th) {
                    throw new RuntimeException(th);
                }
            }
            ArrayList k = this.X1.k();
            ArrayList arrayList3 = new ArrayList(k.size());
            Iterator it2 = k.iterator();
            while (it2.hasNext()) {
                try {
                    arrayList3.add(Long.valueOf(((vk3) it2.next()).r()));
                } catch (Throwable th2) {
                    throw new RuntimeException(th2);
                }
            }
            b6.U(this, 0, arrayList2, arrayList3, 2, 3, this.X1.a);
        }
    }

    public final void a1(long j, String str) {
    }

    public final void b3(int i, int i3, Intent intent) {
        super.b3(i, i3, intent);
        if (i3 == -1) {
            if (i == 0) {
                ArrayList a = kr3.a(intent.getParcelableArrayListExtra("ru.ok.tamtam.extra.CONTACT_LIST"));
                if (cjf.B(a) || a.size() != 1 || !((vk3) a.get(0)).x()) {
                    this.Z1.b(a);
                    ArrayList arrayList = new ArrayList(a.size());
                    Iterator it = a.iterator();
                    while (it.hasNext()) {
                        try {
                            arrayList.add(Long.valueOf(((vk3) it.next()).r()));
                        } catch (Throwable th) {
                            throw new RuntimeException(th);
                        }
                    }
                    FrgDlgShowChatHistory frgDlgShowChatHistory = new FrgDlgShowChatHistory();
                    Bundle bundle = new Bundle();
                    bundle.putLongArray("ru.ok.tamtam.extra.contact_ids", cjf.i(arrayList));
                    bundle.putBundle("ru.ok.tamtam.extra.TRANSITION_BUNDLE", (Bundle) null);
                    frgDlgShowChatHistory.L2(bundle);
                    frgDlgShowChatHistory.Y2(N1(), "ru.ok.messages.views.dialogs.FrgDlgShowChatHistory");
                } else {
                    List singletonList = Collections.singletonList(Long.valueOf(((vk3) a.get(0)).r()));
                    r62 g = this.q1.g();
                    a32 a32 = this.X1;
                    g.c(a32.a, a32.b.a, singletonList, true);
                    this.W1.m();
                }
            } else if (i == 102) {
                String stringExtra = intent.getStringExtra("ru.ok.tamtam.extra.INPUT_RESULT");
                b33 b33 = this.N1;
                if (b33 != null) {
                    b33.e(E3(((d53) b33.o).d()));
                }
                this.q1.g().l(this.X1.a, stringExtra);
            } else if (i != 105) {
                if (i == 301) {
                    this.g2.K();
                }
            } else if (intent == null || !intent.getBooleanExtra("ru.ok.tamtam.extra.EXTRA_LEAVE", false)) {
                U2();
            } else {
                D3();
                return;
            }
            ((qra) ((id3) this.p1.b)).c();
            O1();
            fqc.C(i, i3);
        }
    }

    public final void e0(long j, long j3) {
        if (this.X1 != null) {
            this.q1.c().f("LIVE_LOCATION_RESTART", "INFO");
            eud eud = this.g2;
            eud.o = new y55(1, j, j3, this);
            eud.K();
        }
    }

    public final void e3(int i, String[] strArr, int[] iArr) {
        super.e3(i, strArr, iArr);
        if (eud.t(i)) {
            this.g2.I(i, strArr, iArr);
        }
    }

    public final void f1() {
        r5.T(M1(), this.X1.a);
    }

    public final void g0(bj2 bj2, View view) {
        we8 we8 = this.Y1;
        fo3 fo3 = bj2.a;
        we8.e(fo3.a, fo3.a(), view);
    }

    public final void i2(Bundle bundle) {
        super.i2(bundle);
        long j = this.x.getLong("ru.ok.tamtam.extra.EXTRA_CHAT_ID");
        this.e2 = this.x.getString("ru.ok.tamtam.extra.EXTRA_CHAT_ACCESS_TOKEN");
        a32 G = this.q1.g().G(j);
        this.X1 = G;
        if (G == null) {
            ((uta) ((qra) ((id3) this.p1.b)).o()).c(new Exception("chat is null"), true);
            U2();
            return;
        }
        ij2 ij2 = ij2.MEMBER;
        this.Y1 = new we8(this, G, ij2);
        this.Z1 = (qj2) W2(qj2.c(ij2), new og6(this));
        fn4 k = this.q1.k();
        jbf z = this.q1.z();
        z.getClass();
        this.f2 = new q18(O1(), this.q1.p(), this.q1.u(), this.q1.i(), (taf) this.q1.getAccessor().g(taf.class), (g68) this.q1.getAccessor().g(g68.class), k, ((kbf) z).a(), ((kbf) this.q1.z()).a(), this.q1.s(), this, this.X1);
        this.g2 = new eud(this.q1.l(), (FrgBase) this);
        if (bundle == null) {
            km3 i = this.q1.i();
            ArrayList k2 = this.X1.k();
            i.getClass();
            jbd.a.r(new p00(2, i, k2), new zb2(9));
            if (this.X1.b.a != 0) {
                this.q1.h().b(this.X1, b10.z0);
            }
            qj2 qj2 = this.Z1;
            if (!qj2.h) {
                qj2.d();
                return;
            }
            return;
        }
        this.b2 = bundle.getLong("ru.ok.tamtam.extra.CHAT_JOIN_REQUEST_ID", 0);
        this.c2 = bundle.getLong("ru.ok.tamtam.extra.CHAT_COMPLAIN_REQUEST_ID", 0);
        this.d2 = bundle.getLong("ru.ok.tamtam.extra.BLOCK_MEMBER_REQUEST_ID", 0);
    }

    public final void j() {
        q18 q18 = this.f2;
        if (q18 == null) {
            F3(false);
            return;
        }
        List<n18> d = q18.d();
        if (d == null || d.isEmpty()) {
            F3(false);
            return;
        }
        ArrayList arrayList = new ArrayList(d.size());
        for (n18 add : d) {
            arrayList.add(add);
        }
        this.h2.y = arrayList;
        F3(true);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [gy7, java.lang.ref.WeakReference] */
    public final tyc j3() {
        lw9 lw9 = new lw9();
        this.W1 = lw9;
        if (this.X1 == null) {
            return lw9;
        }
        this.W1.E(new df7(O1(), this, new WeakReference(this), this.q1.s(), this.X1.o0(), 4));
        xq4 xq4 = xq4.FAT_DIVIDER;
        this.W1.E(new yq4(xq4));
        if (this.X1.f0()) {
            a32 a32 = this.X1;
            kwb kwb = new kwb(a32.a, this, a32.E(), true, ((qra) ((id3) this.p1.b)).q().a(this.X1), this.q1.g(), this.q1.u());
            this.j2 = kwb;
            this.W1.E(kwb);
        }
        yq4 yq4 = new yq4(xq4);
        this.i2 = yq4;
        this.W1.E(yq4);
        xw3 xw3 = new xw3(O1(), (z3c) this);
        this.h2 = xw3;
        this.W1.E(xw3);
        j();
        if (this.X1.c0()) {
            this.W1.E(new yq4(xq4));
            this.W1.E(new lf0(this.X1, Integer.valueOf(lic.chat_admin_admins), (g32) this));
        }
        if (this.X1.W()) {
            int c = this.X1.b.c();
            cud cud = ym.v.c().b;
            cud.getClass();
            boolean z = c >= ((int) cud.r(PmsKey.f69maxparticipants, (long) 20000)) || !this.X1.u();
            this.W1.E(new yq4(xq4));
            if (!z) {
                this.W1.E(new ax6(this, kx6.b));
            }
        } else {
            this.W1.E(new yq4(xq4));
        }
        lw9 lw92 = this.W1;
        qra qra = (qra) ((id3) this.p1.b);
        xq4 xq42 = xq4;
        cj2 cj2 = r0;
        cj2 cj22 = new cj2(M1(), Collections.emptyList(), this.a2, this, 2, ij2.MEMBER, this.X1, qra.v(), ((sjd) tr1.h(qra)).v(), qra.a(), qra.m());
        lw92.E(cj2);
        if (this.X1.b.c() > 10) {
            this.W1.E(new xw3(Collections.singletonList(l5c.ALL_CHAT_PARTICIPANTS), this, String.format(S1(qad.n), new Object[]{Integer.valueOf(this.X1.b.c())})));
        }
        if (this.X1.b.G > 0) {
            this.W1.E(new yq4(xq42));
            this.W1.E(new lf0(this.X1, Integer.valueOf(lic.chat_admin_blocked), (g32) this));
        }
        return this.W1;
    }

    public final View k2(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View k2 = super.k2(layoutInflater, viewGroup, bundle);
        G3();
        return k2;
    }

    public final a32 k3() {
        return this.X1;
    }

    public final void l0(long j) {
    }

    public final void o(boolean z, boolean z2, long j, long j3) {
        if (this.X1 != null) {
            if (z2) {
                FrgDlgRestartLocation.f3(j, j3).d3(this);
            } else if (z) {
                this.g2.o = new y86(7, (Object) this);
                z68.e("eud", "background permissions is not supported yet");
            }
        }
    }

    public final boolean o3() {
        return this.X1.Q();
    }

    @oye
    public void onEvent(zu3 zu3) {
        a32 a32;
        z68.c("ru.ok.messages.views.fragments.FrgChatProfile", "onEvent ContactsUpdateEvent", new Object[0]);
        List list = zu3.b;
        ArrayList arrayList = this.a2;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                arrayList2.add(Long.valueOf(((bj2) it.next()).a.a));
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        }
        if ((!Collections.disjoint(list, arrayList2)) && (a32 = this.X1) != null) {
            if (this.o1) {
                H3(a32.a, false);
            } else {
                ryg.S(this.s1, zu3, true);
            }
        }
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == lic.menu_chat_edit__change_name) {
            InputDialog Z2 = InputDialog.Z2(qad.n2, qad.o2, this.X1.b.g, qad.s0, qad.m0, 16385, ym.v.c().b.t(), TextUtils.isEmpty(this.X1.b.I));
            Z2.P2(HttpStatus.SC_PROCESSING, this);
            Z2.Y2(this.D0, "ru.ok.messages.views.dialogs.InputDialog");
        } else if (itemId == lic.menu_chat_edit__change_photo) {
            i3(!TextUtils.isEmpty(this.X1.b.d()));
        } else if (itemId == lic.menu_chat_edit__description || itemId == lic.menu_chat_edit__settings) {
            Context O1 = O1();
            a32 a32 = this.X1;
            o5.U(0, a32.a, O1, !a32.e0());
        } else if (itemId == lic.menu_chat_edit__clear) {
            ClearChatDialog.f3(this.X1.a).d3(this);
        } else if (itemId == lic.menu_chat_edit__report) {
            long j = this.X1.a;
            Bundle bundle = new Bundle();
            bundle.putLong("ru.ok.tamtam.extra.CHAT_ID", j);
            FrgDlgReportType frgDlgReportType = new FrgDlgReportType();
            frgDlgReportType.L2(bundle);
            frgDlgReportType.d3(this);
        } else if (itemId == lic.menu_chat_edit__leave) {
            if (this.X1.d()) {
                FrgDlgMoveOwner.f3(this.X1.a, true).d3(this);
            } else {
                FrgDlgLeaveChat.f3(this.X1.a).d3(this);
            }
        } else if (itemId == lic.menu_chat_edit__remove) {
            FrgDlgDeleteChat.f3(this.X1.a).d3(this);
        } else if (itemId == lic.menu_chat_move_admin_ownership) {
            long j3 = this.X1.a;
            ArrayList arrayList = new ArrayList(Collections.singletonList(y4.b));
            ng6 ng6 = ng6.b;
            int i = ActAdminPicker.N0;
            S2(ActAdminPicker.T(j3, arrayList, ng6, O1(), false), 105, (Bundle) null);
        }
        return true;
    }

    public final int r3() {
        return this.X1.f0() ? qad.p : qad.W0;
    }

    public final void s1(l5c l5c) {
        if (l5c == l5c.ALL_CHAT_PARTICIPANTS) {
            A();
        }
    }

    public final void s3() {
        if (this.o1) {
            if (!TextUtils.isEmpty(this.X1.b.d())) {
                Context O1 = O1();
                a32 a32 = this.X1;
                int i = ActProfilePhoto.C0;
                Objects.requireNonNull(a32);
                t6 t6Var = new t6(gsg.k(new r6(0, a32)), a32.r());
                Intent intent = new Intent(O1, ActProfilePhoto.class);
                intent.putExtra("ru.ok.tamtam.extra.PHOTO_HOLDER", t6Var);
                O1.startActivity(intent);
            } else if (this.X1.a()) {
                i3(!TextUtils.isEmpty(this.X1.b.d()));
            }
        }
    }

    public final void t1(int i, long j) {
        if (i == 0) {
            r62 g = this.q1.g();
            a32 a32 = this.X1;
            g.e0(a32.a, a32.b.a, Collections.singletonList(Long.valueOf(j)));
            this.Z1.f(j);
            return;
        }
        rl d = this.q1.d();
        a32 a322 = this.X1;
        this.d2 = ((jna) d).R(i, a322.a, a322.b.a, Collections.singletonList(Long.valueOf(j)));
        g3(false);
    }

    public final void t2() {
        super.t2();
        q18 q18 = this.f2;
        if (q18 != null) {
            q18.a = null;
            q18.b();
        }
        ((j18) ((sjd) tr1.h((qra) ((id3) this.p1.b))).p()).n();
        this.Z1.h((oj2) null);
    }

    public final void t3(String str, RectF rectF, Rect rect) {
        try {
            String r = m5a.r(str, rect, ((qra) ((id3) this.p1.b)).y().b);
            if (r != null) {
                this.q1.g().j(this.X1.a, r);
            }
        } catch (Exception unused) {
            z68.c("ru.ok.messages.views.fragments.FrgChatProfile", "local crop failed. Crop will be applied after update from server", new Object[0]);
        }
        a20 n = m5a.n(rectF);
        ((jna) ((qra) ((id3) this.p1.b)).e()).M(this.X1.a, n, str);
        hi7.b0(0, O1(), S1(qad.i7));
    }

    public final void u3() {
        if (!TextUtils.isEmpty(this.X1.b.d())) {
            this.q1.g().x(this.X1.a);
        }
    }

    public final void v3() {
        if (this.X1.f0()) {
            super.v3();
            return;
        }
        this.b2 = ((jna) this.q1.d()).m(this.X1.b.I, this.e2);
        g3(false);
    }

    public final void w() {
        x9f x9f = ((s54) ((qra) ((id3) this.p1.b)).getAccessor().g(s54.class)).a;
        b E2 = E2();
        long j = this.X1.b.a;
        x9f.getClass();
        x9f.a(E2, j);
    }

    public final void w1() {
        s5.T(O1(), ij2.ADMIN, this.X1.a);
    }

    public final void w2() {
        super.w2();
        q18 q18 = this.f2;
        if (q18 != null) {
            q18.a = this;
            q18.c();
        }
        this.Z1.h(new og6(this));
        I3(false);
        kwb kwb = this.j2;
        if (kwb != null && this.X1 != null) {
            kwb.F(((qra) ((id3) this.p1.b)).q().a(this.X1));
        }
    }

    public final void x() {
        this.W1.m();
    }

    public final void x2(Bundle bundle) {
        super.x2(bundle);
        bundle.putLong("ru.ok.tamtam.extra.CHAT_JOIN_REQUEST_ID", this.b2);
        bundle.putLong("ru.ok.tamtam.extra.CHAT_COMPLAIN_REQUEST_ID", this.c2);
        bundle.putLong("ru.ok.tamtam.extra.BLOCK_MEMBER_REQUEST_ID", this.d2);
    }

    public final void y() {
        hi7.b0(0, O1(), S1(qad.T0));
    }

    public final void y0() {
        FrgDlgLeaveChat.f3(this.X1.a).d3(this);
    }

    public final void y1(boolean z) {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(y4.a);
        arrayList.add(y4.b);
        long j = this.X1.a;
        ng6 ng6 = ng6.b;
        int i = ActAdminPicker.N0;
        S2(ActAdminPicker.T(j, arrayList, ng6, O1(), z), 105, (Bundle) null);
    }

    public final void y2() {
        super.y2();
        this.W1.m();
    }

    public final void z0(long j) {
        z4.T(X2(), 0, j, this.X1.a);
    }

    public final void z1(List list, boolean z) {
        r62 g = this.q1.g();
        a32 a32 = this.X1;
        g.c(a32.a, a32.b.a, list, z);
        this.W1.m();
    }

    @oye
    public void onEvent(xy2 xy2) {
        a32 a32 = this.X1;
        if (a32 != null && xy2.b.contains(Long.valueOf(a32.a))) {
            if (this.o1) {
                this.Y1 = new we8(this, this.X1, ij2.MEMBER);
                a32 a322 = this.X1;
                H3(a322.a, !a322.E());
                if (this.X1 != null) {
                    G3();
                    return;
                }
                return;
            }
            ryg.S(this.s1, xy2, true);
        }
    }

    @oye
    public void onEvent(hj0 hj0) {
        a32 a32;
        if ((hj0 instanceof gea) && (a32 = this.X1) != null) {
            if (a32.a == ((gea) hj0).a()) {
                if (this.o1) {
                    int i = qad.t1;
                    String g = this.q1.s().g(hj0);
                    ConfirmationOkDialog confirmationOkDialog = new ConfirmationOkDialog();
                    Bundle bundle = new Bundle();
                    bundle.putInt("ru.ok.tamtam.extra.TITLE_RES_ID", i);
                    bundle.putString("ru.ok.tamtam.extra.CONTENT", g);
                    confirmationOkDialog.L2(bundle);
                    confirmationOkDialog.Y2(N1(), "ru.ok.messages.views.dialogs.ConfirmationOkDialog");
                    return;
                }
                return;
            }
        }
        long j = hj0.a;
        int i3 = (j > this.b2 ? 1 : (j == this.b2 ? 0 : -1));
        HashSet hashSet = this.s1;
        qaf qaf = hj0.b;
        if (i3 == 0) {
            if (this.o1) {
                this.b2 = 0;
                a3();
                hi7.b0(0, O1(), fhf.c(O1(), qaf));
                return;
            }
            ryg.S(hashSet, hj0, true);
        } else if (j == this.c2) {
            this.c2 = 0;
        } else if (this.d2 != j) {
        } else {
            if (this.o1) {
                a3();
                hi7.b0(1, O1(), fhf.c(O1(), qaf));
                this.d2 = 0;
                this.Z1.e();
                return;
            }
            ryg.S(hashSet, hj0, true);
        }
    }

    @oye
    public void onEvent(ab2 ab2) {
        if (ab2.a != this.b2) {
            return;
        }
        if (this.o1) {
            this.b2 = 0;
            a3();
            hi7.b0(0, O1(), S1(qad.X0));
            return;
        }
        ryg.S(this.s1, ab2, true);
    }

    @oye
    public void onEvent(m52 m52) {
        if (m52.a == this.c2) {
            if (this.o1) {
                this.c2 = 0;
                hi7.b0(0, O1(), S1(qad.l8));
                return;
            }
            ryg.S(this.s1, m52, true);
        }
    }

    @oye
    public void onEvent(dk2 dk2) {
        if (this.d2 == dk2.a) {
            if (this.o1) {
                this.Z1.g(dk2.b);
                a3();
                hi7.a0(dk2.c == ij2.BLOCKED_MEMBER ? qad.c1 : qad.e1, O1());
                this.d2 = 0;
            } else {
                ryg.S(this.s1, dk2, true);
            }
        }
        H3(this.X1.a, true);
    }
}
