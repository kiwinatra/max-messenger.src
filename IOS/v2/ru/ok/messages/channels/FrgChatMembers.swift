package ru.ok.messages.channels;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import one.me.sdk.lists.widgets.EndlessRecyclerView;
import ru.ok.messages.contacts.picker.ActAdminPicker;
import ru.ok.messages.contacts.picker.MultiPickerSelectionView;
import ru.ok.messages.contacts.picker.MultiPickerSelectionViewController;
import ru.ok.messages.search.KeyboardHandlerSearchView;
import ru.ok.messages.views.dialogs.ConfirmationDialog;
import ru.ok.messages.views.dialogs.FrgDlgChatMemberDelete;
import ru.ok.messages.views.dialogs.FrgDlgShowChatHistory;
import ru.ok.messages.views.dialogs.MakeNonAdminDialog;
import ru.ok.messages.views.fragments.base.FrgBase;

public class FrgChatMembers extends FrgBase implements cx6, ej2, u65, xh6, ikd, hmf, sw9, ah6, md8, hj2 {
    public a32 B1;
    public ij2 C1;
    public ng6 D1;
    public ArrayList E1;
    public EndlessRecyclerView F1;
    public cj2 G1;
    public ax6 H1;
    public TextView I1;
    public jkd J1;
    public MultiPickerSelectionView K1;
    public MultiPickerSelectionViewController L1;
    public lw9 M1;
    public long N1;
    public long O1;
    public long P1;
    public long Q1;
    public long R1;
    public we8 S1;
    public boolean T1;
    public b33 U1;
    public ArrayList V1;
    public qj2 W1;
    public int X1;

    public FrgChatMembers() {
        ym.v.c().a.s();
    }

    public static FrgChatMembers j3(long j, ij2 ij2, ng6 ng6) {
        Bundle bundle = new Bundle();
        bundle.putLong("ru.ok.tamtam.extra.CHAT_ID", j);
        bundle.putString("ru.ok.tamtam.extra.CHAT_MEMBER_TYPE", ij2.a);
        bundle.putString("ru.ok.tamtam.PICKER_TYPE", "SINGLE");
        bundle.putString("ru.ok.tamtam.PICKER_ACTION", ng6.name());
        FrgChatMembers frgChatMembers = new FrgChatMembers();
        frgChatMembers.L2(bundle);
        return frgChatMembers;
    }

    public final boolean B() {
        return false;
    }

    public final void B0(bj2 bj2) {
        try {
            if (bj2.a.a == ym.e().a()) {
                hi7.b0(0, O1(), S1(qad.E8));
            } else if (this.D1 != ng6.b || !bj2.a.c()) {
                int i = this.X1;
                if (i == 2) {
                    k3(bj2, new lg6(this, bj2, 0));
                } else if (i == 1) {
                    k3(bj2, new lg6(this, bj2, 1));
                }
            } else {
                hi7.b0(0, O1(), this.B1.K() ? S1(qad.K) : S1(qad.L));
            }
        } catch (Throwable unused) {
            hi7.a0(qad.t1, O1());
        }
    }

    public final void C1(long j) {
        z4.T(X2(), 115, j, this.B1.a);
    }

    public final void E0() {
    }

    public final boolean E1() {
        tj2 tj2 = this.W1.b;
        return tj2.h != 0 || tj2.g == null;
    }

    public final void L(long j, String str, boolean z) {
        FrgDlgChatMemberDelete.f3(j, str, z, this.B1.K()).d3(this);
    }

    public final void M(int i, long j) {
        rl d = this.q1.d();
        a32 a32 = this.B1;
        long d2 = ((jna) d).d(i, a32.a, a32.b.a, Collections.singletonList(Long.valueOf(j)));
        if (i != 0) {
            this.Q1 = d2;
            g3(false);
            return;
        }
        this.W1.f(j);
    }

    public final void N(fo3 fo3) {
        lf0 lf0;
        this.G1.I(fo3.a);
        this.G1.m();
        HashSet hashSet = this.G1.X;
        long j = fo3.a;
        boolean z = false;
        if (!hashSet.contains(Long.valueOf(j))) {
            MultiPickerSelectionView multiPickerSelectionView = this.K1;
            int i = 0;
            while (true) {
                lf0 = multiPickerSelectionView.w;
                ArrayList arrayList = (ArrayList) lf0.v;
                if (i >= arrayList.size()) {
                    i = -1;
                    break;
                }
                fo3 fo32 = ((lu3) arrayList.get(i)).b;
                if (fo32 != null && fo32.a == j) {
                    break;
                }
                i++;
            }
            ArrayList arrayList2 = (ArrayList) lf0.v;
            Iterator it = arrayList2.iterator();
            while (true) {
                if (it.hasNext()) {
                    lu3 lu3 = (lu3) it.next();
                    fo3 fo33 = lu3.b;
                    if (fo33 != null && fo33.a == j) {
                        arrayList2.remove(lu3);
                        break;
                    }
                } else {
                    break;
                }
            }
            lf0.a.f(i, 1);
            multiPickerSelectionView.c.setCount(multiPickerSelectionView.w.j());
        } else {
            this.K1.a(fo3);
        }
        MultiPickerSelectionViewController multiPickerSelectionViewController = this.L1;
        if (this.K1.w.j() == 0) {
            z = true;
        }
        multiPickerSelectionViewController.b(true, !z);
    }

    public final boolean Q0(bj2 bj2) {
        return this.S1.c(bj2.a.a);
    }

    public final void R0(long j, String str) {
        Bundle bundle = new Bundle();
        bundle.putLong("ru.ok.tamtam.extra.CONTACT_IDs", j);
        bundle.putString("ru.ok.tamtam.extra.NAME", str);
        MakeNonAdminDialog makeNonAdminDialog = new MakeNonAdminDialog();
        makeNonAdminDialog.L2(bundle);
        makeNonAdminDialog.Y2(N1(), "ru.ok.messages.views.dialogs.MakeNonAdminDialog");
    }

    public final void T(long j) {
        rl d = this.q1.d();
        a32 a32 = this.B1;
        this.P1 = ((jna) d).Q(a32.a, a32.b.a, Collections.singletonList(Long.valueOf(j)), true, this.B1.f(j));
        this.q1.g().d0(this.B1.a, Collections.singletonList(Long.valueOf(j)));
    }

    public final String V2() {
        if (this.B1 == null) {
            return null;
        }
        int ordinal = this.C1.ordinal();
        if (ordinal == 0) {
            return this.B1.K() ? "CHANNEL_SUBSCRIBERS" : "CHAT_PARTICIPANTS";
        }
        if (ordinal == 1) {
            return this.B1.K() ? "CHANNEL_ADMINS" : "CHAT_ADMINS";
        }
        if (ordinal != 2) {
            return null;
        }
        return this.B1.K() ? "CHANNEL_BLOCKED" : "CHAT_BLOCKED";
    }

    public final void Y0(String str) {
        qj2 qj2 = this.W1;
        String str2 = qj2.f;
        if (str2 == null || !str2.equals(str)) {
            qj2.f = str;
            qj2.e();
        }
        cj2 cj2 = this.G1;
        cj2.o = str;
        cj2.m();
        n3();
    }

    public final void Z(ArrayList arrayList, ArrayList arrayList2) {
        i3(arrayList2);
    }

    public final void a0(kx6 kx6) {
        if (kx6 == kx6.v) {
            long j = this.B1.a;
            int i = b6.z0;
            S2(b6.T(M1(), (ArrayList) null, (List) new yia(jha.n(this.E1), new ip5(17), 3).B().f(), 3, 3, j), 111, (Bundle) null);
        } else if (kx6 == kx6.b || kx6 == kx6.a) {
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
            b6.U(this, 111, arrayList2, (List) new yia(jha.n(this.E1), new ip5(12), 3).B().f(), 2, 3, this.B1.a);
        } else if (kx6 == kx6.w) {
            ArrayList arrayList3 = new ArrayList(2);
            arrayList3.add(y4.b);
            arrayList3.add(y4.c);
            long j2 = this.B1.a;
            ng6 ng6 = ng6.a;
            int i2 = ActAdminPicker.N0;
            S2(ActAdminPicker.T(j2, arrayList3, ng6, O1(), false), 113, (Bundle) null);
        }
    }

    public final void a1(long j, String str) {
        Bundle bundle = new Bundle();
        bundle.putLong("ru.ok.tamtam.extra.UNBLOCK_CONTACT_ID", j);
        Bundle bundle2 = new Bundle();
        int i = qad.ba;
        bundle2.putInt("ru.ok.tamtam.extra.TITLE_RES_ID", i);
        bundle2.putCharSequence("ru.ok.tamtam.extra.CONTENT", String.format(S1(qad.ca), new Object[]{str}));
        bundle2.putInt("ru.ok.tamtam.extra.POSITIVE_TEXT_RES_ID", i);
        bundle2.putInt("ru.ok.tamtam.extra.NEGATIVE_TEXT_RES_ID", qad.m0);
        bundle2.putBundle("ru.ok.tamtam.extra.DATA", bundle);
        ConfirmationDialog confirmationDialog = new ConfirmationDialog();
        confirmationDialog.L2(bundle2);
        confirmationDialog.P2(114, this);
        confirmationDialog.Y2(this.D0, "ru.ok.messages.views.dialogs.ConfirmationDialog");
    }

    public final void b3(int i, int i2, Intent intent) {
        Bundle bundleExtra;
        if (i == 111 && i2 == -1) {
            ArrayList a = kr3.a(intent.getParcelableArrayListExtra("ru.ok.tamtam.extra.CONTACT_LIST"));
            this.W1.b(a);
            if (this.B1.K() || !cvg.A(this.B1.b.I)) {
                rl d = this.q1.d();
                a32 a32 = this.B1;
                long j = a32.a;
                long j2 = a32.b.a;
                ArrayList arrayList = new ArrayList(a.size());
                Iterator it = a.iterator();
                while (it.hasNext()) {
                    try {
                        arrayList.add(Long.valueOf(((vk3) it.next()).r()));
                    } catch (Throwable th) {
                        throw new RuntimeException(th);
                    }
                }
                this.N1 = ((jna) d).e(j, j2, arrayList, true);
            } else {
                ArrayList arrayList2 = new ArrayList(a.size());
                Iterator it2 = a.iterator();
                while (it2.hasNext()) {
                    try {
                        arrayList2.add(Long.valueOf(((vk3) it2.next()).r()));
                    } catch (Throwable th2) {
                        throw new RuntimeException(th2);
                    }
                }
                FrgDlgShowChatHistory frgDlgShowChatHistory = new FrgDlgShowChatHistory();
                Bundle bundle = new Bundle();
                bundle.putLongArray("ru.ok.tamtam.extra.contact_ids", cjf.i(arrayList2));
                bundle.putBundle("ru.ok.tamtam.extra.TRANSITION_BUNDLE", (Bundle) null);
                frgDlgShowChatHistory.L2(bundle);
                frgDlgShowChatHistory.Y2(N1(), "ru.ok.messages.views.dialogs.FrgDlgShowChatHistory");
            }
        } else if (i == 114 && i2 == -1 && (bundleExtra = intent.getBundleExtra("ru.ok.tamtam.extra.DATA")) != null && bundleExtra.containsKey("ru.ok.tamtam.extra.UNBLOCK_CONTACT_ID")) {
            bundleExtra.getLong("ru.ok.tamtam.extra.UNBLOCK_CONTACT_ID");
            jha.n(this.E1);
            Objects.requireNonNull((Object) null, "defaultItem is null");
            throw null;
        }
        ((qra) ((id3) this.p1.b)).c();
        O1();
        fqc.C(i, i2);
    }

    public final void g0(bj2 bj2, View view) {
        we8 we8 = this.S1;
        fo3 fo3 = bj2.a;
        we8.e(fo3.a, fo3.a(), view);
    }

    public final boolean h3() {
        if (this.X1 != 2 || this.C1 != ij2.ADMIN || this.B1.e0() || this.B1.c0()) {
            return false;
        }
        U2();
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v25, types: [m5] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i2(android.os.Bundle r6) {
        /*
            r5 = this;
            super.i2(r6)
            sjd r0 = r5.q1
            r62 r0 = r0.g()
            android.os.Bundle r1 = r5.x
            java.lang.String r2 = "ru.ok.tamtam.extra.CHAT_ID"
            long r1 = r1.getLong(r2)
            a32 r0 = r0.G(r1)
            r5.B1 = r0
            r1 = 0
            if (r0 != 0) goto L_0x0025
            java.lang.String r6 = "ru.ok.messages.channels.FrgChatMembers"
            java.lang.String r0 = "Chat is null"
            defpackage.z68.f(r6, r0, r1)
            r5.U2()
            return
        L_0x0025:
            android.os.Bundle r0 = r5.x
            java.lang.String r2 = "ru.ok.tamtam.extra.CHAT_MEMBER_TYPE"
            java.lang.String r0 = r0.getString(r2)
            ij2 r0 = defpackage.ij2.valueOf(r0)
            r5.C1 = r0
            we8 r2 = new we8
            a32 r3 = r5.B1
            r2.<init>(r5, r3, r0)
            r5.S1 = r2
            android.os.Bundle r0 = r5.x
            java.lang.String r2 = "ru.ok.tamtam.PICKER_TYPE"
            java.lang.String r0 = r0.getString(r2)
            if (r0 == 0) goto L_0x00e5
            java.lang.String r2 = "SINGLE"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x0050
            r0 = 1
            goto L_0x0059
        L_0x0050:
            java.lang.String r2 = "NONE"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x00d9
            r0 = 2
        L_0x0059:
            r5.X1 = r0
            android.os.Bundle r0 = r5.x
            java.lang.String r2 = "ru.ok.tamtam.PICKER_ACTION"
            java.lang.String r0 = r0.getString(r2)
            ng6 r0 = defpackage.ng6.valueOf(r0)
            r5.D1 = r0
            boolean r0 = r5.h3()
            if (r0 == 0) goto L_0x0070
            return
        L_0x0070:
            ng6 r0 = r5.D1
            ng6 r2 = defpackage.ng6.a
            if (r0 != r2) goto L_0x008c
            m5 r0 = r5.X2()
            boolean r2 = r0 instanceof defpackage.yg6
            if (r2 == 0) goto L_0x0081
            r1 = r0
            yg6 r1 = (defpackage.yg6) r1
        L_0x0081:
            if (r1 == 0) goto L_0x0084
            goto L_0x008c
        L_0x0084:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            java.lang.String r6 = "FrgChatMembers with mode PICK_ADMIN must be attached to activity that implements FrgContactMultiPicker.ContactPickerListener"
            r5.<init>(r6)
            throw r5
        L_0x008c:
            ij2 r0 = r5.C1
            java.lang.String r0 = defpackage.qj2.c(r0)
            kg6 r1 = new kg6
            r1.<init>(r5)
            java.lang.Object r0 = r5.W2(r0, r1)
            qj2 r0 = (defpackage.qj2) r0
            r5.W1 = r0
            if (r6 == 0) goto L_0x00d5
            java.lang.String r0 = "ru.ok.tamtam.extra.EXTRA_ADD_SUBSCRIBERS_REQUEST_ID"
            r1 = 0
            long r3 = r6.getLong(r0, r1)
            r5.N1 = r3
            java.lang.String r0 = "ru.ok.tamtam.extra.EXTRA_ADD_ADMIN_REQUEST_ID"
            long r3 = r6.getLong(r0, r1)
            r5.O1 = r3
            java.lang.String r0 = "ru.ok.tamtam.extra.EXTRA_REMOVE_ADMIN_REQUEST_ID"
            long r3 = r6.getLong(r0, r1)
            r5.P1 = r3
            java.lang.String r0 = "ru.ok.tamtam.extra.BLOCK_DELETE_MEMBER_REQUEST_ID"
            long r3 = r6.getLong(r0, r1)
            r5.Q1 = r3
            java.lang.String r0 = "ru.ok.tamtam.extra.UNBLOCK_MEMBER_REQUEST_ID"
            long r0 = r6.getLong(r0, r1)
            r5.R1 = r0
            java.lang.String r0 = "ru.ok.tamtam.extra.NOT_FOUND_REQUESTED"
            r1 = 0
            boolean r6 = r6.getBoolean(r0, r1)
            r5.T1 = r6
            goto L_0x00d8
        L_0x00d5:
            r0.d()
        L_0x00d8:
            return
        L_0x00d9:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "No enum constant ru.ok.messages.channels.FrgChatMembers.PickerType."
            java.lang.String r6 = r6.concat(r0)
            r5.<init>(r6)
            throw r5
        L_0x00e5:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r6 = "Name is null"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.channels.FrgChatMembers.i2(android.os.Bundle):void");
    }

    public final void i3(List list) {
        m5 X2 = X2();
        if (X2 != null && list.size() > 0) {
            Intent intent = new Intent();
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                try {
                    arrayList.add(Long.valueOf(((fo3) it.next()).a));
                } catch (Throwable th) {
                    throw new RuntimeException(th);
                }
            }
            intent.putExtra("ru.ok.tamtam.extra.SELECTED_IDS", cjf.i(arrayList));
            X2.setResult(-1, intent);
            X2.finish();
        }
    }

    public final View k2(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View view;
        Bundle bundle2;
        jkd jkd;
        ArrayList<mo3> parcelableArrayList;
        Bundle bundle3 = bundle;
        if (h3()) {
            return new View(O1());
        }
        View inflate = layoutInflater.inflate(ujc.frg_channel_users, viewGroup, false);
        ng6 ng6 = this.D1;
        ng6 ng62 = ng6.c;
        ij2 ij2 = ij2.ADMIN;
        if (ng6 == ng62) {
            fj fjVar = new fj((a) this);
            scf scf = this.r1;
            int i = lic.menu_search__search;
            String S12 = S1(qad.n5);
            yva v = ((qra) ((id3) this.p1.b)).v();
            od6 od6 = (od6) X1();
            od6.b();
            this.J1 = new jkd(fjVar, i, S12, scf, (hkd) null, v, od6.v);
            obd obd = new obd(fjVar, (Toolbar) inflate.findViewById(lic.toolbar));
            obd.x = scf;
            obd.w = this.J1;
            b33 b33 = new b33(obd);
            this.U1 = b33;
            Toolbar toolbar = (Toolbar) b33.c;
            if (toolbar != null) {
                toolbar.setOnMenuItemClickListener(this);
            }
            this.J1.i(O1(), true, this.U1);
            this.U1.g(nad.u);
            this.U1.i(new xu3(12, (Object) this));
            ij2 ij22 = this.C1;
            if (ij22 == ij2.BLOCKED_MEMBER) {
                this.U1.l(S1(qad.P0));
            } else if (ij22 == ij2) {
                this.U1.l(S1(qad.y0));
            } else if (this.B1.K()) {
                this.U1.l(S1(qad.O0));
            } else {
                this.U1.l(S1(qad.p1));
            }
        }
        EndlessRecyclerView endlessRecyclerView = (EndlessRecyclerView) inflate.findViewById(lic.frg_channel_users__rv_users);
        this.F1 = endlessRecyclerView;
        O1();
        endlessRecyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        this.F1.setPager(this);
        this.F1.setProgressView(ujc.base_list_progress);
        this.E1 = new ArrayList();
        l3();
        ArrayList arrayList = new ArrayList();
        this.V1 = arrayList;
        if (this.X1 == 2 || this.D1 != ng6.a) {
            ij2 ij23 = this.C1;
            if (ij23 == ij2.MEMBER || ij23 == ij2) {
                arrayList.add(Long.valueOf(this.B1.b.d));
            }
        } else {
            arrayList.addAll(this.B1.b.R.keySet());
        }
        Context O12 = O1();
        ArrayList arrayList2 = this.V1;
        ArrayList arrayList3 = this.E1;
        int i2 = this.X1;
        ij2 ij24 = this.C1;
        a32 a32 = this.B1;
        qra qra = (qra) ((id3) this.p1.b);
        cj2 cj2 = r0;
        View view2 = inflate;
        cj2 cj22 = new cj2(O12, arrayList2, arrayList3, this, i2, ij24, a32, qra.v(), ((sjd) tr1.h(qra)).v(), qra.a(), qra.m());
        this.G1 = cj2;
        cj2.C(true);
        this.M1.E(this.G1);
        this.F1.setAdapter(this.M1);
        TextView textView = (TextView) view2.findViewById(lic.frg_channel_users__tv_empty);
        this.I1 = textView;
        textView.setTextColor(this.r1.G);
        MultiPickerSelectionView multiPickerSelectionView = (MultiPickerSelectionView) view2.findViewById(lic.frg_channel_users__vw_selection);
        this.K1 = multiPickerSelectionView;
        if (this.X1 == 1) {
            multiPickerSelectionView.setVisibility(8);
            bundle2 = bundle;
            view = view2;
        } else {
            multiPickerSelectionView.a.add(this);
            this.L1 = new MultiPickerSelectionViewController(((qra) ((id3) this.p1.b)).d(), this.K1, this.F1, view2.findViewById(lic.frg_channel_users__iv_shadow));
            this.K1.setDoneAction(rw9.a);
            bundle2 = bundle;
            view = view2;
            if (!(bundle2 == null || (parcelableArrayList = bundle2.getParcelableArrayList("ru.ok.tamtam.extra.SELECTED_CONTACTS")) == null)) {
                for (mo3 mo3 : parcelableArrayList) {
                    fo3 fo3 = mo3.a;
                    if (fo3 != null) {
                        this.G1.I(fo3.a);
                        this.K1.a(mo3.a);
                        this.L1.b(false, !(this.K1.w.j() == 0));
                    }
                }
            }
        }
        if (!(bundle2 == null || (jkd = this.J1) == null)) {
            jkd.f("", bundle2);
        }
        return view;
    }

    public final void k3(bj2 bj2, x6 x6Var) {
        if (this.q1.i().l(bj2.a.a)) {
            x6Var.run();
            return;
        }
        this.q1.i().z(bj2.a, bj2.b, tm3.b).i(qe.a()).j(new ao1(0, m58.g, x6Var));
    }

    public final void l2() {
        or7 or7;
        super.l2();
        jkd jkd = this.J1;
        if (jkd != null && (or7 = jkd.x) != null) {
            qq4.a(or7);
            jkd.x = null;
        }
    }

    public final void l3() {
        a32 a32;
        if (this.M1 == null) {
            this.M1 = new lw9();
        }
        if (this.X1 == 2 && this.H1 == null && (a32 = this.B1) != null) {
            ij2 ij2 = this.C1;
            if (ij2 == ij2.MEMBER) {
                if (a32.K() && this.B1.u()) {
                    ax6 ax6 = new ax6(this, kx6.v);
                    this.H1 = ax6;
                    lw9 lw9 = this.M1;
                    lw9.o.add(0, ax6);
                    t45 t45 = new t45(5, lw9.z);
                    lw9.w.put(t45, ax6);
                    ax6.A(t45);
                } else if (this.B1.u()) {
                    ax6 ax62 = new ax6(this, kx6.a);
                    this.H1 = ax62;
                    lw9 lw92 = this.M1;
                    lw92.o.add(0, ax62);
                    t45 t452 = new t45(5, lw92.z);
                    lw92.w.put(t452, ax62);
                    ax62.A(t452);
                }
            } else if (ij2 == ij2.ADMIN && a32.s()) {
                ax6 ax63 = new ax6(this, kx6.w);
                this.H1 = ax63;
                lw9 lw93 = this.M1;
                lw93.o.add(0, ax63);
                t45 t453 = new t45(5, lw93.z);
                lw93.w.put(t453, ax63);
                ax63.A(t453);
            }
        }
        ax6 ax64 = this.H1;
        if (ax64 != null) {
            ax64.z = new kg6(this);
        }
    }

    public final void m3() {
        a32 G = this.q1.g().G(this.B1.a);
        this.B1 = G;
        if (G == null) {
            U2();
        }
        if (!h3()) {
            cj2 cj2 = this.G1;
            a32 a32 = this.B1;
            cj2.y0 = a32;
            this.S1.e = a32;
            l3();
        }
    }

    public final void n2() {
        super.n2();
        jkd jkd = this.J1;
        if (jkd != null) {
            or7 or7 = jkd.x;
            if (or7 != null) {
                qq4.a(or7);
                jkd.x = null;
            }
            this.J1 = null;
        }
        this.U1 = null;
    }

    public final void n3() {
        String str;
        if (!this.W1.h) {
            EndlessRecyclerView endlessRecyclerView = this.F1;
            if (!endlessRecyclerView.b2) {
                endlessRecyclerView.postDelayed(new y86(6, (Object) this), 500);
            }
        } else {
            this.F1.setRefreshingNext(false);
        }
        this.E1.clear();
        ArrayList arrayList = this.W1.b.f;
        this.V1.addAll((List) new yia(new mha(jha.n(arrayList), new kg6(this), 1), new zb2(5), 3).B().f());
        this.E1.addAll(arrayList);
        ax6 ax6 = this.H1;
        String str2 = null;
        if (ax6 != null) {
            jkd jkd = this.J1;
            if (jkd != null) {
                KeyboardHandlerSearchView e = jkd.e();
                str = e != null ? e.getQuery() : "";
            } else {
                str = null;
            }
            ax6.x = TextUtils.isEmpty(str);
        }
        if (arrayList.size() != 0 || !this.W1.h) {
            this.I1.setVisibility(8);
        } else {
            this.I1.setVisibility(0);
            jkd jkd2 = this.J1;
            if (jkd2 != null) {
                KeyboardHandlerSearchView e2 = jkd2.e();
                str2 = e2 != null ? e2.getQuery() : "";
            }
            if (!TextUtils.isEmpty(str2)) {
                this.I1.setText(qad.Q1);
            } else if (this.C1 == ij2.BLOCKED_MEMBER) {
                this.I1.setText(qad.Q0);
            } else {
                this.I1.setVisibility(8);
            }
        }
        this.F1.getAdapter().m();
    }

    @oye
    public void onEvent(zu3 zu3) {
        if (!this.o1) {
            T0(zu3);
        } else if (this.C1 == ij2.ADMIN) {
            jha r = jha.r(new yia(jha.n(this.E1), new ip5(14), 3), new yia(new mha(jha.n(this.B1.b.R.entrySet()), new ip5(15), 1), new ip5(16), 3));
            List list = zu3.b;
            Objects.requireNonNull(list);
            if (((Boolean) new oha(r, new mg6(list)).f()).booleanValue()) {
                this.W1.e();
            }
        }
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        return false;
    }

    public final void t1(int i, long j) {
        if (i == 0) {
            r62 g = this.q1.g();
            a32 a32 = this.B1;
            g.e0(a32.a, a32.b.a, Collections.singletonList(Long.valueOf(j)));
            this.W1.f(j);
            return;
        }
        rl d = this.q1.d();
        a32 a322 = this.B1;
        this.Q1 = ((jna) d).R(i, a322.a, a322.b.a, Collections.singletonList(Long.valueOf(j)));
        g3(false);
    }

    public final void t2() {
        super.t2();
        this.W1.h((oj2) null);
    }

    public final void u1() {
        this.F1.setRefreshingNext(true);
        this.W1.d();
    }

    public final void w2() {
        super.w2();
        if (!h3()) {
            if (this.D1 != ng6.b || this.B1.e0()) {
                m3();
                if (this.B1 != null) {
                    this.W1.h(new kg6(this));
                    n3();
                }
            }
        }
    }

    public final void x2(Bundle bundle) {
        super.x2(bundle);
        bundle.putLong("ru.ok.tamtam.extra.EXTRA_ADD_SUBSCRIBERS_REQUEST_ID", this.N1);
        bundle.putLong("ru.ok.tamtam.extra.EXTRA_ADD_ADMIN_REQUEST_ID", this.O1);
        bundle.putLong("ru.ok.tamtam.extra.EXTRA_REMOVE_ADMIN_REQUEST_ID", this.P1);
        bundle.putLong("ru.ok.tamtam.extra.BLOCK_DELETE_MEMBER_REQUEST_ID", this.Q1);
        bundle.putLong("ru.ok.tamtam.extra.UNBLOCK_MEMBER_REQUEST_ID", this.R1);
        bundle.putBoolean("ru.ok.tamtam.extra.NOT_FOUND_REQUESTED", this.T1);
        if (this.X1 != 1) {
            bundle.putParcelableArrayList("ru.ok.tamtam.extra.SELECTED_CONTACTS", new ArrayList((List) new yia(jha.n(this.K1.getContactInfos()), new ip5(13), 3).B().f()));
        }
        jkd jkd = this.J1;
        if (jkd != null) {
            jkd.g("", bundle);
        }
    }

    public final void z0(long j) {
        z4.T(X2(), 115, j, this.B1.a);
    }

    public final void z1(List list, boolean z) {
        rl d = this.q1.d();
        a32 a32 = this.B1;
        this.N1 = ((jna) d).e(a32.a, a32.b.a, list, z);
    }

    @oye
    public void onEvent(xy2 xy2) {
        a32 a32 = this.B1;
        if (a32 != null && xy2.b.contains(Long.valueOf(a32.a))) {
            if (this.o1) {
                m3();
                if (this.D1 != ng6.b || this.B1.e0()) {
                    this.W1.e();
                    return;
                }
                return;
            }
            ryg.S(this.s1, xy2, true);
        }
    }

    @oye
    public void onEvent(hj0 hj0) {
        long j = this.N1;
        long j2 = hj0.a;
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        HashSet hashSet = this.s1;
        qaf qaf = hj0.b;
        if (i == 0) {
            if (!this.o1) {
                ryg.S(hashSet, hj0, true);
            } else if (!m58.A(qaf.b)) {
                hi7.b0(0, O1(), S1(qad.w0));
                this.W1.e();
                n3();
            }
        } else if (this.O1 == j2) {
            if (!this.o1) {
                ryg.S(hashSet, hj0, true);
            } else if (!m58.A(qaf.b)) {
                hi7.b0(1, O1(), fhf.c(O1(), qaf));
                this.O1 = 0;
                this.W1.e();
                n3();
            }
        } else if (this.Q1 == j2) {
            if (this.o1) {
                a3();
                hi7.b0(1, O1(), fhf.c(O1(), qaf));
                this.Q1 = 0;
                this.W1.e();
                n3();
                return;
            }
            ryg.S(hashSet, hj0, true);
        } else if (this.P1 == j2) {
            if (!this.o1) {
                ryg.S(hashSet, hj0, true);
            } else if (!m58.A(qaf.b)) {
                hi7.b0(1, O1(), fhf.c(O1(), qaf));
                this.P1 = 0;
                this.W1.e();
                n3();
            }
        } else if (this.R1 != j2) {
        } else {
            if (!this.o1) {
                ryg.S(hashSet, hj0, true);
            } else if (!m58.A(qaf.b)) {
                hi7.b0(1, O1(), fhf.c(O1(), qaf));
                this.R1 = 0;
                this.W1.e();
                n3();
            }
        }
    }

    @oye
    public void onEvent(dk2 dk2) {
        long j = this.Q1;
        long j2 = dk2.a;
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        HashSet hashSet = this.s1;
        if (i == 0) {
            if (this.o1) {
                this.W1.g(dk2.b);
                a3();
                hi7.a0(dk2.c == ij2.BLOCKED_MEMBER ? qad.c1 : qad.e1, O1());
                this.Q1 = 0;
                return;
            }
            ryg.S(hashSet, dk2, true);
        } else if (this.O1 == j2) {
            if (this.o1) {
                hi7.a0(qad.h1, O1());
                m3();
                this.O1 = 0;
                return;
            }
            ryg.S(hashSet, dk2, true);
        } else if (this.P1 != j2) {
            if (dk2.o != this.B1.a) {
                return;
            }
            if (this.o1) {
                m3();
            } else {
                ryg.S(hashSet, dk2, true);
            }
        } else if (this.o1) {
            hi7.a0(qad.j1, O1());
            m3();
            this.P1 = 0;
        } else {
            ryg.S(hashSet, dk2, true);
        }
    }
}
