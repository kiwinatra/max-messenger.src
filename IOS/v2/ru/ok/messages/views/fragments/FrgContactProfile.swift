package ru.ok.messages.views.fragments;

import android.content.Intent;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import androidx.fragment.app.b;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.apache.http.HttpStatus;
import ru.ok.messages.chats.common.CommonChatsViewModel;
import ru.ok.messages.contacts.profile.ActContactAvatars;
import ru.ok.messages.views.dialogs.ClearChatDialog;
import ru.ok.messages.views.dialogs.ConfirmationDestructiveDialog;
import ru.ok.messages.views.dialogs.ConfirmationDialog;
import ru.ok.messages.views.dialogs.FrgDlgDeleteChat;
import ru.ok.messages.views.dialogs.FrgDlgDisableNotifs;
import ru.ok.messages.views.dialogs.FrgDlgRestartLocation;
import ru.ok.messages.views.dialogs.InputDialog;
import ru.ok.messages.views.fragments.base.FrgBase;
import ru.ok.messages.views.fragments.base.FrgBaseProfileLinkDescription;
import ru.ok.messages.views.widgets.TamAvatarView;
import ru.ok.tamtam.android.prefs.PmsKey;

public class FrgContactProfile extends FrgBaseProfileLinkDescription implements hmf, dm3, jwb, x13, eh6, gh6, c18, z3c, p18, gnf, vh6, rma {
    public vk3 W1;
    public long X1;
    public lw9 Y1;
    public kwb Z1;
    public boolean a2;
    public q18 b2;
    public eud c2;
    public xw3 d2;
    public yq4 e2;

    public void A2(View view, Bundle bundle) {
        super.A2(view, bundle);
        G3();
        a32 K = this.q1.g().K(this.W1.r());
        if (this.Z1 != null && K != null) {
            z68.c("ru.ok.messages.views.fragments.FrgContactProfile", "folder observe: chat=%s", K);
            this.Z1.E(this.S1, (od6) X1(), K, ((qra) ((id3) this.p1.b)).q());
        }
    }

    public final String B3() {
        return this.W1.a.c.o;
    }

    public final String C3() {
        return this.W1.a.c.p;
    }

    public final void D3() {
        int S0 = this.C1.getLinearLayoutManager().S0();
        lw9 lw9 = (lw9) j3();
        this.Y1 = lw9;
        this.C1.setAdapter(lw9);
        this.C1.getLinearLayoutManager().x0(S0);
        this.C1.getLinearLayoutManager().m1(S0, 0);
    }

    public final void E3(boolean z) {
        xw3 xw3 = this.d2;
        if (xw3 != null) {
            xw3.x = z;
        }
        yq4 yq4 = this.e2;
        if (yq4 != null) {
            yq4.v = z;
        }
        lw9 lw9 = this.Y1;
        if (lw9 != null) {
            lw9.m();
        }
    }

    public final void F3() {
        Bundle bundle = new Bundle();
        int i = qad.ba;
        bundle.putInt("ru.ok.tamtam.extra.TITLE_RES_ID", i);
        bundle.putCharSequence("ru.ok.tamtam.extra.CONTENT", String.format(S1(qad.ca), new Object[]{this.W1.f()}));
        bundle.putInt("ru.ok.tamtam.extra.POSITIVE_TEXT_RES_ID", i);
        bundle.putInt("ru.ok.tamtam.extra.NEGATIVE_TEXT_RES_ID", qad.m0);
        ConfirmationDialog confirmationDialog = new ConfirmationDialog();
        confirmationDialog.L2(bundle);
        confirmationDialog.P2(HttpStatus.SC_NO_CONTENT, this);
        confirmationDialog.Y2(this.D0, "ru.ok.messages.views.dialogs.ConfirmationDialog");
    }

    public final void G0() {
        D3();
    }

    public void G3() {
        vk3 p = this.q1.i().p(this.W1.r(), true);
        this.W1 = p;
        b33 b33 = this.N1;
        if (b33 != null) {
            b33.e(n79.D(O1(), p.p(this.q1.s()), this.W1.z(), ((d53) b33.o).d()));
        }
        H3();
        b33 b332 = this.N1;
        if (b332 != null) {
            b332.j(wjc.menu_contact_profile, this);
            a32 K = this.q1.g().K(this.W1.r());
            if (K != null) {
                long j = K.b.a;
            }
        }
        D3();
        TamAvatarView tamAvatarView = this.J1;
        if (tamAvatarView != null) {
            tamAvatarView.c(this.W1, true, true, (String) null, true);
        }
        TamAvatarView tamAvatarView2 = this.K1;
        if (tamAvatarView2 != null) {
            tamAvatarView2.c(this.W1, false, true, (String) null, true);
        }
        x3();
        j();
    }

    public void H3() {
        b33 b33 = this.N1;
        if (b33 != null) {
            if (this.W1.w()) {
                b33.d(S1(qad.y8));
            } else if (this.W1.B()) {
                b33.d((CharSequence) null);
            } else if (this.W1.x()) {
                b33.d(this.W1.A() ? S1(qad.T8) : S1(qad.J));
            } else {
                b33.d(this.q1.v().d(this.W1, true));
            }
        }
    }

    public final void I(long j) {
        e1d e1d = (e1d) this.q1.getAccessor().g(e1d.class);
        e1d.getClass();
        e1d.a(e1d, j);
        U2();
    }

    public final void K(long j) {
    }

    public final void O(long j, long j2) {
        this.q1.g().Y(j, j2);
        this.Z1.m();
    }

    public final void O0() {
        a32 K = this.q1.g().K(this.W1.r());
        if (K == null) {
            return;
        }
        if (K.X(((ltb) this.q1.u()).a)) {
            this.q1.g().q0(this.X1);
            this.Z1.m();
            return;
        }
        FrgDlgDisableNotifs.f3(K.a).d3(this);
    }

    public String V2() {
        return this.W1.x() ? "BOT_PROFILE" : "CONTACT_PROFILE";
    }

    public final void a(boolean z) {
        wh8 c = ((j18) this.q1.p()).c(this.X1);
        jbf H = ((qra) ((id3) this.p1.b)).H();
        H.getClass();
        oi8 f = c.h(((kbf) H).a()).f(qe.a());
        oh8 oh8 = new oh8(new h62(this, z, 4), new zg6(this, 6), m58.e);
        f.a(oh8);
        T2(oh8);
    }

    /* JADX WARNING: type inference failed for: r7v22, types: [hvd, zud] */
    public void b3(int i, int i2, Intent intent) {
        int i3 = i;
        Intent intent2 = intent;
        super.b3(i, i2, intent);
        if (i2 == -1) {
            String str = null;
            switch (i3) {
                case HttpStatus.SC_ACCEPTED:
                    this.q1.i().c(this.W1.r());
                    hi7.b0(0, M1(), S1(qad.f));
                    break;
                case HttpStatus.SC_NO_CONTENT:
                    this.q1.i().E(this.W1.r());
                    hi7.b0(0, M1(), S1(qad.ea));
                    break;
                case HttpStatus.SC_RESET_CONTENT:
                    ArrayList a = kr3.a(intent2.getParcelableArrayListExtra("ru.ok.tamtam.extra.CONTACT_LIST"));
                    eaf.a().getClass();
                    r62 g = ((sjd) eaf.b()).g();
                    ArrayList arrayList = new ArrayList(a.size());
                    Iterator it = a.iterator();
                    while (it.hasNext()) {
                        try {
                            arrayList.add(Long.valueOf(((vk3) it.next()).r()));
                        } catch (Throwable th) {
                            throw new RuntimeException(th);
                        }
                    }
                    zg6 zg6 = new zg6(this, 0);
                    g.getClass();
                    jbd.b(new z52(0, g, arrayList), xfd.b(), zg6, (qk3) null, g.u);
                    break;
                case HttpStatus.SC_MULTI_STATUS:
                    km3 i4 = this.q1.i();
                    long r = this.W1.r();
                    String stringExtra = intent2.getStringExtra("ru.ok.tamtam.extra.INPUT_RESULT");
                    i4.getClass();
                    z68.c("km3", "rename, id = %d => %s", Long.valueOf(r), stringExtra);
                    vk3 p = i4.p(r, false);
                    pm3 pm3 = !p.l().isEmpty() ? (pm3) p.l().get(0) : null;
                    String str2 = pm3 != null ? pm3.a : null;
                    if (pm3 != null) {
                        str = pm3.b;
                    }
                    i4.e(r, new im3(stringExtra, "", 0));
                    zu3 zu3 = new zu3(r);
                    sv0 sv0 = i4.g;
                    sv0.c(zu3);
                    jna jna = (jna) ((rl) i4.i.get());
                    ts3 ts3 = r8;
                    long j = r;
                    ts3 ts32 = new ts3(5, ((ltb) jna.D()).a.n(), r, str2, str, stringExtra, "");
                    ocf.d(jna.E(), ts3, false, 0, 12);
                    ((uu3) i4.m.get()).b(Collections.singletonList(Long.valueOf(j)));
                    sv0.c(new zu3(j));
                    hi7.b0(0, M1(), S1(qad.k8));
                    break;
                case 208:
                    long[] longArrayExtra = intent2.getLongArrayExtra("ru.ok.tamtam.extra.CHAT_IDS");
                    String stringExtra2 = intent2.getStringExtra("ru.ok.tamtam.extra.DESCRIPTION");
                    LinkedList linkedList = new LinkedList();
                    if (stringExtra2 != null && !TextUtils.isEmpty(stringExtra2)) {
                        linkedList.add(new mvd(new kvd(0, stringExtra2, true, CollectionsKt.emptyList())));
                    }
                    ? hvd = new hvd(0);
                    hvd.m = this.W1.r();
                    linkedList.add(new avd(hvd));
                    if (longArrayExtra != null && longArrayExtra.length > 0) {
                        for (long kud : longArrayExtra) {
                            this.q1.A().a(new jvd(new kud(kud, new LinkedList(linkedList), 2)));
                        }
                        if (longArrayExtra.length != 1) {
                            hi7.a0(qad.v9, O1());
                            break;
                        } else {
                            q5.T(M1(), new t5(longArrayExtra[0]));
                            U2();
                            break;
                        }
                    }
            }
            if (i3 == 301) {
                this.c2.K();
            }
            ((qra) ((id3) this.p1.b)).c();
            O1();
            fqc.C(i, i2);
        }
    }

    public final void e0(long j, long j2) {
        this.q1.c().f("LIVE_LOCATION_RESTART", "INFO");
        eud eud = this.c2;
        eud.o = new y55(2, j, j2, this);
        eud.K();
    }

    public final void e3(int i, String[] strArr, int[] iArr) {
        super.e3(i, strArr, iArr);
        if (eud.t(i)) {
            this.c2.I(i, strArr, iArr);
        }
    }

    public final void f1() {
        a32 K = this.q1.g().K(this.W1.r());
        if (K != null) {
            r5.T(M1(), K.a);
        }
    }

    public final void i2(Bundle bundle) {
        super.i2(bundle);
        long j = this.x.getLong("ru.ok.tamtam.extra.EXTRA_CONTACT_ID");
        this.a2 = this.x.getBoolean("ru.ok.tamtam.extra.PRIVACY_WARNING");
        this.W1 = this.q1.i().p(j, true);
        a32 K = this.q1.g().K(j);
        this.X1 = K != null ? K.a : 0;
        fn4 k = this.q1.k();
        jbf z = this.q1.z();
        z.getClass();
        q18 q18 = r0;
        q18 q182 = new q18(O1(), this.q1.p(), this.q1.u(), this.q1.i(), (taf) this.q1.getAccessor().g(taf.class), (g68) this.q1.getAccessor().g(g68.class), k, ((kbf) z).a(), ((kbf) this.q1.z()).a(), this.q1.s(), this, K);
        this.b2 = q18;
        this.c2 = new eud(this.q1.l(), (FrgBase) this);
        if (bundle == null) {
            if (!(K == null || K.b.a == 0 || this.W1.w)) {
                this.q1.h().b(K, b10.z0);
            }
            if (!this.q1.i().m(this.W1.r())) {
                ((jna) this.q1.d()).x(this.W1.r());
                ((jna) this.q1.d()).y(Collections.singletonList(Long.valueOf(this.W1.r())));
            }
        }
    }

    public final void j() {
        q18 q18 = this.b2;
        if (q18 == null) {
            E3(false);
            return;
        }
        List<n18> d = q18.d();
        if (d == null || d.isEmpty()) {
            E3(false);
            return;
        }
        ArrayList arrayList = new ArrayList(d.size());
        for (n18 add : d) {
            arrayList.add(add);
        }
        xw3 xw3 = this.d2;
        if (xw3 != null) {
            xw3.y = arrayList;
        }
        E3(true);
    }

    /* JADX WARNING: type inference failed for: r6v2, types: [gy7, java.lang.ref.WeakReference] */
    public tyc j3() {
        a32 K;
        this.Y1 = new lw9();
        boolean z = this.a2;
        ArrayList arrayList = new ArrayList();
        for (pm3 pm3 : this.W1.l()) {
            if (pm3.c == om3.b) {
                arrayList.add(pm3);
            }
        }
        if (!this.W1.A()) {
            this.Y1.E(new df7(O1(), this, new WeakReference(this), this.q1.s(), this.W1.x(), 2));
            this.Y1.E(new yq4(xq4.FAT_DIVIDER));
        }
        if (!arrayList.isEmpty() && !z) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.Y1.E(new lf0(O1(), (pm3) it.next(), this));
            }
        }
        if (!this.W1.w() && (K = this.q1.g().K(this.W1.r())) != null) {
            kwb kwb = new kwb(K.a, this, true, true, ((qra) ((id3) this.p1.b)).q().a(K), this.q1.g(), this.q1.u());
            this.Z1 = kwb;
            this.Y1.E(kwb);
        }
        xw3 xw3 = new xw3(O1(), (z3c) this);
        this.d2 = xw3;
        this.Y1.E(xw3);
        yq4 yq4 = new yq4(xq4.SHORT_DIVIDER);
        this.e2 = yq4;
        this.Y1.E(yq4);
        j();
        lw9 lw9 = this.Y1;
        xq4 xq4 = xq4.FAT_DIVIDER;
        lw9.E(new yq4(xq4));
        lw9 lw92 = this.Y1;
        ArrayList arrayList2 = new ArrayList();
        if (!z && !this.W1.w()) {
            if ((!this.W1.C() || this.W1.a.c.i == sm3.b) && !this.W1.A()) {
                arrayList2.add(l5c.ADD_TO_CONTACT_LIST);
            }
            if (!this.W1.A()) {
                arrayList2.add(l5c.CREATE_MULTICHAT);
            }
            if (!this.W1.x()) {
                arrayList2.add(l5c.REQUEST_LOCATION);
            }
        }
        if (this.W1.w()) {
            arrayList2.add(l5c.UNBLOCK_CONTACT);
        }
        a32 K2 = this.q1.g().K(this.W1.r());
        if (this.W1.x() && K2 != null && !K2.h0() && K2.b.a != 0 && !this.W1.A()) {
            arrayList2.add(l5c.SUSPEND_BOT);
        }
        ArrayList<tyc> arrayList3 = null;
        lw92.E(new xw3(arrayList2, this, (String) null));
        if (getClass().equals(FrgContactProfile.class) || getClass().equals(FrgContactSearchProfile.class)) {
            arrayList3 = new ArrayList<>();
            arrayList3.add(new yq4(xq4));
            l83 l83 = new l83();
            arrayList3.add(l83);
            if (this.V1 == null) {
                c73 c73 = new c73((j4b) w63.F, 0);
                c73.C(true);
                this.V1 = c73;
            }
            if (((qra) ((id3) this.p1.b)).y().a.g.getBoolean("app.count_for_common_chats_enabled", false)) {
                ((CommonChatsViewModel) this.U1.get()).r.e(X1(), new yr1(3, l83));
            }
            arrayList3.add(this.V1);
        }
        if (arrayList3 != null) {
            lw9 lw93 = this.Y1;
            lw93.getClass();
            for (tyc E : arrayList3) {
                lw93.E(E);
            }
        }
        return this.Y1;
    }

    public final void l0(long j) {
    }

    public final void l1(vk3 vk3) {
    }

    public final vk3 l3() {
        return this.W1;
    }

    public boolean n3() {
        return !this.a2 && !this.W1.B();
    }

    public final void o(boolean z, boolean z2, long j, long j2) {
        if (z2) {
            FrgDlgRestartLocation.f3(j, j2).d3(this);
        } else if (z) {
            this.c2.o = new y86(8, (Object) this);
            z68.e("eud", "background permissions is not supported yet");
        }
    }

    public boolean o3() {
        return !this.W1.w() && !this.W1.x() && !this.W1.B();
    }

    @oye
    public void onEvent(zu3 zu3) {
        List list;
        vk3 vk3 = this.W1;
        if (vk3 != null && (list = zu3.b) != null && list.contains(Long.valueOf(vk3.r()))) {
            if (this.o1) {
                G3();
            } else {
                ryg.S(this.s1, zu3, true);
            }
        }
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        if (!this.o1) {
            return true;
        }
        int itemId = menuItem.getItemId();
        if (itemId == lic.menu_tamtam_profile__rename) {
            int i = qad.p2;
            int i2 = qad.q2;
            String f = this.W1.f();
            int i3 = qad.s0;
            int i4 = qad.m0;
            cud cud = ym.v.c().b;
            cud.getClass();
            InputDialog Z2 = InputDialog.Z2(i, i2, f, i3, i4, 8193, (int) cud.r(PmsKey.f62maxcnamelength, (long) 200), true);
            Z2.P2(HttpStatus.SC_MULTI_STATUS, this);
            Z2.Y2(this.D0, "ru.ok.messages.views.dialogs.InputDialog");
            return true;
        } else if (itemId == lic.menu_tamtam_profile__delete) {
            String S1 = S1(qad.Y1);
            String S12 = S1(qad.X1);
            String format = String.format(S1, new Object[]{this.W1.f()});
            String S13 = S1(qad.m0);
            String S14 = S1(qad.W1);
            String str = ConfirmationDestructiveDialog.B1;
            q8.w(S12, format, S13, S14).Y2(N1(), ConfirmationDestructiveDialog.B1);
            N1().g0("CONFIRMATION_DESTRUCTIVE_REQUEST_KEY", this, new ms1(21, new zg6(this, 3)));
            return true;
        } else if (itemId == lic.menu_tamtam_profile__block) {
            int i5 = qad.G;
            String S15 = S1(i5);
            String format2 = String.format(S1(qad.H), new Object[]{this.W1.f()});
            String S16 = S1(qad.m0);
            String S17 = S1(i5);
            String str2 = ConfirmationDestructiveDialog.B1;
            q8.w(S15, format2, S16, S17).Y2(N1(), ConfirmationDestructiveDialog.B1);
            N1().g0("CONFIRMATION_DESTRUCTIVE_REQUEST_KEY", this, new ms1(21, new ata(8, new u75(12, this), new a46(15))));
            return true;
        } else if (itemId == lic.menu_tamtam_profile__remove_dialog) {
            a32 K = this.q1.g().K(this.W1.r());
            if (K == null) {
                return true;
            }
            FrgDlgDeleteChat.f3(K.a).d3(this);
            return true;
        } else if (itemId == lic.menu_tamtam_profile__clear_dialog) {
            a32 K2 = this.q1.g().K(this.W1.r());
            if (K2 == null) {
                return true;
            }
            ClearChatDialog.f3(K2.a).d3(this);
            return true;
        } else if (itemId != lic.menu_tamtam_profile__unblock) {
            return true;
        } else {
            F3();
            return true;
        }
    }

    public boolean p3() {
        return !this.W1.B();
    }

    public final int r3() {
        if (this.W1.w()) {
            return qad.B3;
        }
        if (this.W1.x()) {
            a32 K = this.q1.g().K(this.W1.r());
            if (((K == null || !K.g0()) ? bs0.U(K) : false) && !this.W1.A()) {
                return qad.M;
            }
        }
        return qad.p;
    }

    public final void s1(l5c l5c) {
        if (this.o1) {
            switch (l5c.ordinal()) {
                case 0:
                    Bundle bundle = new Bundle();
                    bundle.putInt("ru.ok.tamtam.extra.TITLE_RES_ID", qad.d);
                    bundle.putCharSequence("ru.ok.tamtam.extra.CONTENT", String.format(S1(qad.e), new Object[]{this.W1.f()}));
                    bundle.putInt("ru.ok.tamtam.extra.POSITIVE_TEXT_RES_ID", qad.c);
                    bundle.putInt("ru.ok.tamtam.extra.NEGATIVE_TEXT_RES_ID", qad.m0);
                    ConfirmationDialog confirmationDialog = new ConfirmationDialog();
                    confirmationDialog.L2(bundle);
                    confirmationDialog.P2(HttpStatus.SC_ACCEPTED, this);
                    confirmationDialog.Y2(this.D0, "ru.ok.messages.views.dialogs.ConfirmationDialog");
                    return;
                case 1:
                    List<vk3> s = this.q1.i().s();
                    ArrayList arrayList = new ArrayList(s.size());
                    for (vk3 r : s) {
                        try {
                            arrayList.add(Long.valueOf(r.r()));
                        } catch (Throwable th) {
                            throw new RuntimeException(th);
                        }
                    }
                    if (!arrayList.contains(Long.valueOf(this.W1.r()))) {
                        arrayList.add(Long.valueOf(this.W1.r()));
                    }
                    b6.U(this, HttpStatus.SC_RESET_CONTENT, arrayList, Collections.singletonList(Long.valueOf(this.W1.r())), 2, 1, this.X1);
                    return;
                case 2:
                    F3();
                    return;
                case 3:
                    u5.T(this, (Bundle) null, 208, (Serializable) null);
                    return;
                case 5:
                    ((jqg) ((qra) ((id3) this.p1.b)).getAccessor().g(jqg.class)).a(new ovd(new ap0(11, this.X1, this.W1.r())));
                    return;
                case 6:
                    this.q1.g().P(this.W1.r(), new zg6(this, 4));
                    return;
                case 7:
                case 8:
                    v3();
                    return;
                default:
                    return;
            }
        }
    }

    public void s3() {
        if (!TextUtils.isEmpty(this.W1.h(ym.v.c().a))) {
            long r = this.W1.r();
            int i = ActContactAvatars.L0;
            ActContactAvatars.X(r, M1());
        }
    }

    public final void t2() {
        super.t2();
        q18 q18 = this.b2;
        if (q18 != null) {
            q18.a = null;
            q18.b();
        }
        ((j18) ((sjd) tr1.h((qra) ((id3) this.p1.b))).p()).n();
    }

    public void t3(String str, RectF rectF, Rect rect) {
    }

    public void u3() {
    }

    public final void v3() {
        if (this.W1.x()) {
            r62 g = this.q1.g();
            long r = this.W1.r();
            zg6 zg6 = new zg6(this, 5);
            m5 X2 = X2();
            jqg A = this.q1.A();
            a32 K = g.K(r);
            if (bs0.U(K)) {
                bs0.T(g, r, zg6, X2, K, A);
                U2();
                return;
            }
        }
        super.v3();
    }

    public final void w() {
        a32 K = this.q1.g().K(this.W1.r());
        if (K != null) {
            x9f x9f = ((s54) ((qra) ((id3) this.p1.b)).getAccessor().g(s54.class)).a;
            b E2 = E2();
            long j = K.b.a;
            x9f.getClass();
            x9f.a(E2, j);
        }
    }

    public void w2() {
        super.w2();
        q18 q18 = this.b2;
        if (q18 != null) {
            q18.a = this;
            q18.c();
        }
        a32 K = this.q1.g().K(this.W1.r());
        kwb kwb = this.Z1;
        if (kwb != null && K != null) {
            kwb.F(((qra) ((id3) this.p1.b)).q().a(K));
        }
    }

    public final void x() {
        this.Z1.m();
    }

    public final void y() {
        hi7.b0(0, O1(), S1(qad.T0));
    }

    public final void y2() {
        super.y2();
        kwb kwb = this.Z1;
        if (kwb != null) {
            kwb.m();
        }
    }

    @oye
    public void onEvent(xy2 xy2) {
        Collection collection = xy2.b;
        if (collection != null && collection.contains(Long.valueOf(this.X1))) {
            if (this.o1) {
                D3();
            } else {
                ryg.S(this.s1, xy2, true);
            }
        }
    }
}
