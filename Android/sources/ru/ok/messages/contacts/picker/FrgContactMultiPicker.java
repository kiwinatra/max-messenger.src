package ru.ok.messages.contacts.picker;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import one.me.sdk.lists.widgets.EmptyRecyclerView;
import one.me.sdk.uikit.common.button.OneMeButton;
import one.me.sdk.uikit.common.views.OneMeContactsChipGroup;
import ru.ok.messages.views.dialogs.ContactsMultiPickerLimitDialog;
import ru.ok.messages.views.fragments.base.FrgBase;
import ru.ok.tamtam.android.prefs.PmsKey;

public class FrgContactMultiPicker extends FrgBase implements sw9, hkd, oj2, ro3 {
    public EmptyRecyclerView B1;
    public MultiPickerSelectionView C1;
    public LinearLayoutManager D1;
    public ut3 E1;
    public t56 F1;
    public final HashSet G1 = new HashSet();
    public final HashSet H1 = new HashSet();
    public List I1 = new ArrayList();
    public ArrayList J1;
    public a32 K1;
    public rd3 L1;
    public h3b M1;
    public OneMeButton N1;
    public OneMeContactsChipGroup O1;
    public nwe P1;
    public vo3 Q1;
    public boolean R1 = false;
    public qj2 S1;
    public final w28 T1 = new w28((Object) new vg6(this, 0), (Object) new vg6(this, 1), (Object) new vg6(this, 2), 6);
    public int U1;
    public int V1;

    public static Bundle i3(long[] jArr, int i, int i2, long j, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putLongArray("ru.ok.tamtam.CONTACT_LIST", (long[]) null);
        bundle.putLongArray("ru.ok.tamtam.DISABLED_CONTACT_LIST", jArr);
        bundle.putString("ru.ok.tamtam.PICKER_TYPE", tr1.x(i));
        bundle.putString("ru.ok.tamtam.PICKER_ACTION", tr1.w(i2));
        bundle.putLong("ru.ok.tamtam.extra.CHAT_ID", j);
        bundle.putBoolean("ru.ok.tamtam.extra.TT_ONLY", z);
        return bundle;
    }

    public static ArrayList m3(ArrayList arrayList, boolean z) {
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        if (z) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList3.add((vk3) it.next());
            }
        } else {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList3.add((vk3) it2.next());
            }
        }
        if (z) {
            arrayList2.addAll(arrayList3);
        } else {
            arrayList2.addAll(arrayList3);
        }
        return arrayList2;
    }

    public final void H(long j, View view) {
    }

    public final String V2() {
        return "CONTACTS_MULTIPICKER";
    }

    public final void Z(ArrayList arrayList, ArrayList arrayList2) {
        if (j3() != null) {
            ((ActAdminPicker) j3()).W(arrayList);
        }
    }

    public final void Z2(View view) {
        nwe nwe = this.P1;
        if (nwe != null) {
            nwe.j();
        }
    }

    public final void b3(int i, int i2, Intent intent) {
        if (i == 111 && i2 == -1) {
            long j = intent.getBundleExtra("ru.ok.tamtam.extra.DATA").getLong("ru.ok.tamtam.extra.CONTACT_ID", 0);
            this.G1.add(Long.valueOf(j));
            this.L1.m();
            a32 a32 = this.K1;
            if (a32 != null) {
                String T12 = a32.b.e() ? this.K1.K() ? T1(qad.p5, this.K1.b.I) : T1(qad.q5, this.K1.b.I) : null;
                if (cvg.A(T12)) {
                    T12 = T1(qad.r5, ym.v.c().b.p());
                }
                this.q1.g().P(j, new ib4(20, this, T12));
                hi7.b0(0, O1(), S1(qad.B0));
            }
        } else if (i2 == -1 && i == 101) {
            m5 X2 = X2();
            if (X2 != null) {
                X2.finish();
            }
        } else if (i2 == -1 && i == 112) {
            this.q1.c().f("OK_TT_CHAT_SEPARATION_SWITCH_ALERT", "OK");
            for (vk3 vk3 : this.C1.getSelectedContacts()) {
                vk3.getClass();
            }
        } else if (i2 == 0 && i == 112) {
            this.q1.c().f("OK_TT_CHAT_SEPARATION_SWITCH_ALERT", "CANCEL");
        }
    }

    public final void c3(m5 m5Var) {
        this.n1 = false;
    }

    public final void h3(String str) {
        String trim = str.trim();
        String lowerCase = trim.isEmpty() ? null : trim.toLowerCase();
        this.J1.clear();
        ArrayList arrayList = this.J1;
        List list = this.I1;
        tld B = ((qra) ym.e()).B();
        if (!cvg.A(lowerCase)) {
            list = cjf.q(list, new ba(24, B, lowerCase));
        }
        arrayList.addAll(list);
        this.F1.G(this.T1.R(O1(), this.J1, this.H1));
    }

    public final void i2(Bundle bundle) {
        int i;
        int i2;
        ArrayList arrayList;
        super.i2(bundle);
        this.K1 = this.q1.g().G(this.x.getLong("ru.ok.tamtam.extra.CHAT_ID"));
        long[] longArray = this.x.getLongArray("ru.ok.tamtam.CONTACT_LIST");
        if (longArray != null) {
            for (long p : longArray) {
                this.I1.add(this.q1.i().p(p, true));
            }
        } else {
            this.I1 = this.q1.i().s();
        }
        this.x.getBoolean("ru.ok.tamtam.extra.TT_ONLY", true);
        String string = this.x.getString("ru.ok.tamtam.PICKER_ACTION");
        if (string != null) {
            if (string.equals("CREATE_CHAT")) {
                i = 1;
            } else if (string.equals("CREATE_GROUP_CALL")) {
                i = 2;
            } else if (string.equals("ADD_TO_CHAT")) {
                i = 3;
            } else if (string.equals("SHARE_CONTACTS")) {
                i = 4;
            } else if (string.equals("PICK_ADMIN")) {
                i = 5;
            } else if (string.equals("MOVE_OWNER")) {
                i = 6;
            } else {
                throw new IllegalArgumentException("No enum constant ru.ok.messages.contacts.picker.ActContactMultiPicker.PickerAction.".concat(string));
            }
            this.V1 = i;
            String string2 = this.x.getString("ru.ok.tamtam.PICKER_TYPE");
            if (string2 != null) {
                if (string2.equals("SINGLE")) {
                    i2 = 1;
                } else if (string2.equals("MULTI")) {
                    i2 = 2;
                } else if (string2.equals("SUBSCRIBERS")) {
                    i2 = 3;
                } else if (string2.equals("MULTI_PHONES_AND_CONTACTS")) {
                    i2 = 4;
                } else {
                    throw new IllegalArgumentException("No enum constant ru.ok.messages.contacts.picker.ActContactMultiPicker.PickerType.".concat(string2));
                }
                this.U1 = i2;
                HashSet hashSet = this.H1;
                HashSet hashSet2 = this.G1;
                if (bundle == null) {
                    long[] longArray2 = this.x.getLongArray("ru.ok.tamtam.DISABLED_CONTACT_LIST");
                    if (!(this.V1 == 1 || longArray2 == null)) {
                        for (long valueOf : longArray2) {
                            hashSet2.add(Long.valueOf(valueOf));
                        }
                    }
                    if (this.V1 == 1 && longArray2 != null) {
                        for (long valueOf2 : longArray2) {
                            hashSet.add(Long.valueOf(valueOf2));
                        }
                    }
                } else {
                    long[] longArray3 = bundle.getLongArray("ru.ok.tamtam.DISABLED_CONTACT_LIST");
                    if (longArray3 != null) {
                        for (long valueOf3 : longArray3) {
                            hashSet2.add(Long.valueOf(valueOf3));
                        }
                    }
                    long[] longArray4 = bundle.getLongArray("ru.ok.tamtam.extra.PICKER_SELECTION");
                    if (longArray4 != null) {
                        for (long valueOf4 : longArray4) {
                            hashSet.add(Long.valueOf(valueOf4));
                        }
                    }
                }
                ArrayList arrayList2 = new ArrayList(this.I1);
                ns3 j = this.q1.j();
                j.getClass();
                Collections.sort(arrayList2, new ls3(j, 0));
                if (this.U1 != 4) {
                    arrayList2 = this.K1 == null ? m3(arrayList2, true) : m3(arrayList2, false);
                }
                if (arrayList2.isEmpty()) {
                    arrayList = Collections.emptyList();
                } else {
                    ArrayList arrayList3 = new ArrayList();
                    for (Object next : arrayList2) {
                        try {
                            if (!((vk3) next).A()) {
                                arrayList3.add(next);
                            }
                        } catch (Throwable th) {
                            throw new RuntimeException(th);
                        }
                    }
                    arrayList = arrayList3;
                }
                this.I1 = arrayList;
                ArrayList arrayList4 = new ArrayList();
                this.J1 = arrayList4;
                arrayList4.addAll(this.I1);
                if (this.U1 == 2 && this.V1 == 3 && this.K1.b.c() > 99) {
                    qj2 qj2 = (qj2) W2(qj2.c(ij2.MEMBER), new tg6(this));
                    this.S1 = qj2;
                    if (bundle == null) {
                        qj2.d();
                        return;
                    }
                    return;
                }
                return;
            }
            throw new NullPointerException("Name is null");
        }
        throw new NullPointerException("Name is null");
    }

    public final yg6 j3() {
        if (X2() == null || !(X2() instanceof yg6)) {
            return null;
        }
        return (yg6) X2();
    }

    public final void k1(vk3 vk3) {
        n3(vk3.r());
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0206  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x021f  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0287  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x028a  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x02b5  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0363  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View k2(android.view.LayoutInflater r21, android.view.ViewGroup r22, android.os.Bundle r23) {
        /*
            r20 = this;
            r9 = r20
            r10 = r23
            ut3 r11 = new ut3
            androidx.fragment.app.b r1 = r20.M1()
            java.util.ArrayList r2 = r9.J1
            int r3 = r9.U1
            int r4 = r9.V1
            java.util.HashSet r12 = r9.H1
            java.util.HashSet r7 = r9.G1
            a32 r8 = r9.K1
            r0 = r11
            r5 = r20
            r6 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.E1 = r11
            t56 r0 = new t56
            sjd r1 = r9.q1
            aua r1 = r1.t()
            java.util.concurrent.ExecutorService r1 = r1.a()
            r2 = 7
            r0.<init>((java.lang.Object) r9, (java.util.concurrent.ExecutorService) r1, (int) r2)
            r9.F1 = r0
            android.content.Context r1 = r20.O1()
            java.util.ArrayList r2 = r9.J1
            w28 r3 = r9.T1
            java.util.ArrayList r1 = r3.R(r1, r2, r12)
            r0.G(r1)
            int r0 = defpackage.ujc.frg_contact_multi_picker
            r1 = 0
            r2 = r21
            r3 = r22
            android.view.View r0 = r2.inflate(r0, r3, r1)
            android.content.Context r2 = r20.G2()
            r3 = 0
            h3b r2 = defpackage.o54.d(r2, r3)
            r9.M1 = r2
            int r4 = defpackage.lic.toolbar
            r2.setId(r4)
            h3b r2 = r9.M1
            android.widget.RelativeLayout$LayoutParams r4 = new android.widget.RelativeLayout$LayoutParams
            r5 = -1
            r6 = -2
            r4.<init>(r5, r6)
            r2.setLayoutParams(r4)
            r2 = r0
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            h3b r4 = r9.M1
            r2.addView(r4)
            int r2 = defpackage.lic.frg_contact_multi_picker__rv_contacts
            android.view.View r2 = r0.findViewById(r2)
            one.me.sdk.lists.widgets.EmptyRecyclerView r2 = (one.me.sdk.lists.widgets.EmptyRecyclerView) r2
            r9.B1 = r2
            int r2 = defpackage.lic.fl_empty_search
            android.view.View r2 = r0.findViewById(r2)
            int r4 = defpackage.lic.fl_empty_search__main
            android.view.View r4 = r0.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            int r5 = defpackage.lic.fl_empty_search__info
            android.view.View r5 = r0.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            ogf r6 = defpackage.puf.i
            uy4 r7 = defpackage.uy4.b
            r6.b(r4, r7)
            ogf r4 = defpackage.puf.m
            r4.b(r5, r7)
            int r4 = defpackage.lic.frg_contact_multi_picker__vw_selection
            android.view.View r4 = r0.findViewById(r4)
            ru.ok.messages.contacts.picker.MultiPickerSelectionView r4 = (ru.ok.messages.contacts.picker.MultiPickerSelectionView) r4
            r9.C1 = r4
            java.util.HashSet r4 = r4.a
            r4.add(r9)
            int r4 = r9.V1
            int r4 = defpackage.tr1.y(r4)
            r5 = 5
            r6 = 3
            r7 = 2
            r8 = 1
            if (r4 == 0) goto L_0x00fc
            if (r4 == r8) goto L_0x00fc
            if (r4 == r7) goto L_0x00fc
            if (r4 == r6) goto L_0x00f4
            r11 = 4
            if (r4 == r11) goto L_0x00fc
            if (r4 != r5) goto L_0x00c2
            goto L_0x00fc
        L_0x00c2:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Developer should implement type "
            r1.<init>(r2)
            int r2 = r9.V1
            switch(r2) {
                case 1: goto L_0x00e2;
                case 2: goto L_0x00df;
                case 3: goto L_0x00dc;
                case 4: goto L_0x00d9;
                case 5: goto L_0x00d6;
                case 6: goto L_0x00d3;
                default: goto L_0x00d0;
            }
        L_0x00d0:
            java.lang.String r2 = "null"
            goto L_0x00e4
        L_0x00d3:
            java.lang.String r2 = "MOVE_OWNER"
            goto L_0x00e4
        L_0x00d6:
            java.lang.String r2 = "PICK_ADMIN"
            goto L_0x00e4
        L_0x00d9:
            java.lang.String r2 = "SHARE_CONTACTS"
            goto L_0x00e4
        L_0x00dc:
            java.lang.String r2 = "ADD_TO_CHAT"
            goto L_0x00e4
        L_0x00df:
            java.lang.String r2 = "CREATE_GROUP_CALL"
            goto L_0x00e4
        L_0x00e2:
            java.lang.String r2 = "CREATE_CHAT"
        L_0x00e4:
            r1.append(r2)
            java.lang.String r2 = " in FrgContactMultiPicker"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00f4:
            ru.ok.messages.contacts.picker.MultiPickerSelectionView r4 = r9.C1
            rw9 r11 = defpackage.rw9.b
            r4.setDoneAction(r11)
            goto L_0x0103
        L_0x00fc:
            ru.ok.messages.contacts.picker.MultiPickerSelectionView r4 = r9.C1
            rw9 r11 = defpackage.rw9.a
            r4.setDoneAction(r11)
        L_0x0103:
            int r4 = defpackage.lic.frg_contact_multi_picker__iv_shadow
            android.view.View r4 = r0.findViewById(r4)
            ru.ok.messages.contacts.picker.MultiPickerSelectionViewController r11 = new ru.ok.messages.contacts.picker.MultiPickerSelectionViewController
            dm4 r13 = r9.p1
            java.lang.Object r13 = r13.b
            id3 r13 = (defpackage.id3) r13
            qra r13 = (defpackage.qra) r13
            ch r13 = r13.d()
            ru.ok.messages.contacts.picker.MultiPickerSelectionView r14 = r9.C1
            one.me.sdk.lists.widgets.EmptyRecyclerView r15 = r9.B1
            r11.<init>(r13, r14, r15, r4)
            rd3 r4 = new rd3
            tyc[] r11 = new defpackage.tyc[r1]
            r4.<init>(r11)
            r9.L1 = r4
            int r11 = r9.V1
            sd3 r4 = r4.o
            if (r11 == r8) goto L_0x013e
            if (r11 != r6) goto L_0x0130
            goto L_0x013e
        L_0x0130:
            ut3 r11 = r9.E1
            java.lang.Object r13 = r4.d
            java.util.ArrayList r13 = (java.util.ArrayList) r13
            int r13 = r13.size()
            r4.a(r13, r11)
            goto L_0x014b
        L_0x013e:
            t56 r11 = r9.F1
            java.lang.Object r13 = r4.d
            java.util.ArrayList r13 = (java.util.ArrayList) r13
            int r13 = r13.size()
            r4.a(r13, r11)
        L_0x014b:
            int r4 = r9.V1
            if (r4 != r7) goto L_0x0151
            r11 = r8
            goto L_0x0152
        L_0x0151:
            r11 = r1
        L_0x0152:
            if (r4 != r8) goto L_0x0156
            r13 = r8
            goto L_0x0157
        L_0x0156:
            r13 = r1
        L_0x0157:
            if (r13 != 0) goto L_0x01b4
            if (r11 == 0) goto L_0x015c
            goto L_0x01b4
        L_0x015c:
            if (r4 != r6) goto L_0x020e
            int r4 = defpackage.lic.frg_contact_multi_picker__create_chat_button
            android.view.View r4 = r0.findViewById(r4)
            one.me.sdk.uikit.common.button.OneMeButton r4 = (one.me.sdk.uikit.common.button.OneMeButton) r4
            r9.N1 = r4
            aqa r11 = defpackage.aqa.c
            r4.setSize(r11)
            one.me.sdk.uikit.common.button.OneMeButton r4 = r9.N1
            xpa r11 = defpackage.xpa.o
            r4.setAppearance(r11)
            one.me.sdk.uikit.common.button.OneMeButton r4 = r9.N1
            zpa r11 = defpackage.zpa.a
            r4.setMode(r11)
            one.me.sdk.uikit.common.button.OneMeButton r4 = r9.N1
            int r11 = defpackage.umc.add
            r4.setText((int) r11)
            boolean r4 = r12.isEmpty()
            if (r4 == 0) goto L_0x0195
            one.me.sdk.uikit.common.button.OneMeButton r4 = r9.N1
            r11 = 8
            r4.setVisibility(r11)
            one.me.sdk.uikit.common.button.OneMeButton r4 = r9.N1
            r4.c(r3, r1)
            goto L_0x01a7
        L_0x0195:
            one.me.sdk.uikit.common.button.OneMeButton r4 = r9.N1
            r4.setVisibility(r1)
            one.me.sdk.uikit.common.button.OneMeButton r4 = r9.N1
            int r11 = r12.size()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r4.c(r11, r8)
        L_0x01a7:
            one.me.sdk.uikit.common.button.OneMeButton r4 = r9.N1
            b5 r11 = new b5
            r13 = 15
            r11.<init>(r13, r9)
            defpackage.y64.n(r4, r11)
            goto L_0x020e
        L_0x01b4:
            if (r13 == 0) goto L_0x0204
            int r4 = defpackage.lic.frg_contact_multi_picker__create_chat_button
            android.view.View r4 = r0.findViewById(r4)
            one.me.sdk.uikit.common.button.OneMeButton r4 = (one.me.sdk.uikit.common.button.OneMeButton) r4
            r9.N1 = r4
            aqa r13 = defpackage.aqa.c
            r4.setSize(r13)
            one.me.sdk.uikit.common.button.OneMeButton r4 = r9.N1
            xpa r13 = defpackage.xpa.o
            r4.setAppearance(r13)
            one.me.sdk.uikit.common.button.OneMeButton r4 = r9.N1
            zpa r13 = defpackage.zpa.a
            r4.setMode(r13)
            one.me.sdk.uikit.common.button.OneMeButton r4 = r9.N1
            int r13 = defpackage.umc.chat_create_continue
            r4.setText((int) r13)
            boolean r4 = r12.isEmpty()
            if (r4 == 0) goto L_0x01e6
            one.me.sdk.uikit.common.button.OneMeButton r4 = r9.N1
            r4.c(r3, r1)
            goto L_0x01f3
        L_0x01e6:
            one.me.sdk.uikit.common.button.OneMeButton r4 = r9.N1
            int r13 = r12.size()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r4.c(r13, r8)
        L_0x01f3:
            one.me.sdk.uikit.common.button.OneMeButton r4 = r9.N1
            r4.setVisibility(r1)
            one.me.sdk.uikit.common.button.OneMeButton r4 = r9.N1
            xu3 r13 = new xu3
            r14 = 13
            r13.<init>((int) r14, (java.lang.Object) r9)
            defpackage.ct.G(r4, 300, r13)
        L_0x0204:
            if (r11 == 0) goto L_0x020e
            int r4 = defpackage.lic.frg_contact_multi_picker__call_link_buttons_stub
            android.view.View r4 = r0.findViewById(r4)
            android.view.ViewStub r4 = (android.view.ViewStub) r4
        L_0x020e:
            one.me.sdk.lists.widgets.EmptyRecyclerView r4 = r9.B1
            r4.setHasFixedSize(r8)
            androidx.recyclerview.widget.LinearLayoutManager r4 = new androidx.recyclerview.widget.LinearLayoutManager
            r20.M1()
            r4.<init>()
            r9.D1 = r4
            if (r10 == 0) goto L_0x022a
            java.lang.String r11 = "ru.ok.tamtam.extra.RECYCLER_STATE"
            java.lang.Object r10 = r10.get(r11)
            android.os.Parcelable r10 = (android.os.Parcelable) r10
            r4.l0(r10)
        L_0x022a:
            one.me.sdk.lists.widgets.EmptyRecyclerView r4 = r9.B1
            androidx.recyclerview.widget.LinearLayoutManager r10 = r9.D1
            r4.setLayoutManager(r10)
            one.me.sdk.lists.widgets.EmptyRecyclerView r4 = r9.B1
            r4.setItemAnimator(r3)
            one.me.sdk.lists.widgets.EmptyRecyclerView r4 = r9.B1
            r4.setEmptyView(r2)
            one.me.sdk.lists.widgets.EmptyRecyclerView r2 = r9.B1
            rd3 r4 = r9.L1
            r2.setAdapter(r4)
            fl2 r2 = new fl2
            rx2 r4 = new rx2
            r10 = 22
            r4.<init>(r10, r9)
            r10 = 4
            r2.<init>(r10, r4)
            vo3 r4 = new vo3
            one.me.sdk.lists.widgets.EmptyRecyclerView r10 = r9.B1
            js9 r11 = defpackage.fu4.k
            k2b r10 = r11.f(r10)
            r4.<init>((defpackage.fl2) r2, (defpackage.k2b) r10, (defpackage.uo3) r3)
            r9.Q1 = r4
            nwe r4 = new nwe
            one.me.sdk.lists.widgets.EmptyRecyclerView r10 = r9.B1
            rd3 r13 = r9.L1
            r4.<init>(r10, r13, r2)
            r9.P1 = r4
            r9.o3(r8)
            int r2 = r9.U1
            if (r2 == r7) goto L_0x0275
            if (r2 != r6) goto L_0x0273
            goto L_0x0275
        L_0x0273:
            r2 = r1
            goto L_0x0276
        L_0x0275:
            r2 = r8
        L_0x0276:
            int r4 = r9.V1
            if (r4 == r5) goto L_0x02a3
            r5 = 6
            if (r4 == r5) goto L_0x02a3
            int r4 = defpackage.lic.toolbar
            android.view.View r4 = r0.findViewById(r4)
            h3b r4 = (defpackage.h3b) r4
            if (r2 == 0) goto L_0x028a
            int r5 = defpackage.umc.chat_create_select_members
            goto L_0x028c
        L_0x028a:
            int r5 = defpackage.qad.r7
        L_0x028c:
            r9.M1 = r4
            r4.setVisibility(r1)
            r4.setTitle((int) r5)
            p2b r5 = new p2b
            of3 r6 = new of3
            r7 = 24
            r6.<init>(r7)
            r5.<init>(r6)
            r4.setLeftActions(r5)
        L_0x02a3:
            if (r2 == 0) goto L_0x0313
            boolean r2 = r12.isEmpty()
            if (r2 != 0) goto L_0x0313
            java.util.Iterator r2 = r12.iterator()
        L_0x02af:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0310
            java.lang.Object r4 = r2.next()
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r4.longValue()
            java.util.List r6 = r9.I1
            java.util.Iterator r6 = r6.iterator()
        L_0x02c5:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x02da
            java.lang.Object r7 = r6.next()
            vk3 r7 = (defpackage.vk3) r7
            long r13 = r7.r()
            int r10 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r10 != 0) goto L_0x02c5
            goto L_0x02db
        L_0x02da:
            r7 = r3
        L_0x02db:
            if (r7 == 0) goto L_0x02af
            ru.ok.messages.contacts.picker.MultiPickerSelectionView r4 = r9.C1
            lf0 r5 = r4.w
            java.lang.Object r6 = r5.v
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            int r6 = r6.size()
            java.lang.Object r10 = r5.v
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            lu3 r13 = new lu3
            r13.<init>((defpackage.vk3) r7)
            r10.add(r13)
            uyc r5 = r5.a
            r5.e(r6, r8)
            int r5 = r10.size()
            int r5 = r5 - r8
            androidx.recyclerview.widget.RecyclerView r6 = r4.v
            r6.D0(r5)
            lf0 r5 = r4.w
            int r5 = r5.j()
            ru.ok.utils.widgets.BadgeCountView r4 = r4.c
            r4.setCount(r5)
            goto L_0x02af
        L_0x0310:
            r20.p3()
        L_0x0313:
            int r2 = defpackage.lic.chips_layout_scroll_container
            android.view.View r2 = r0.findViewById(r2)
            one.me.sdk.uikit.common.views.MaxHeightScrollView r2 = (one.me.sdk.uikit.common.views.MaxHeightScrollView) r2
            r20.O1()
            r4 = 1120403456(0x42c80000, float:100.0)
            int r4 = defpackage.ro4.a(r4)
            r2.setMaxHeight(r4)
            r2.setVerticalScrollBarEnabled(r1)
            int r1 = defpackage.lic.chips_layout
            android.view.View r1 = r0.findViewById(r1)
            one.me.sdk.uikit.common.views.OneMeContactsChipGroup r1 = (one.me.sdk.uikit.common.views.OneMeContactsChipGroup) r1
            r9.O1 = r1
            android.widget.EditText r1 = r1.getEditText()
            int r4 = defpackage.umc.chat_create_search_by_name
            r1.setHint(r4)
            one.me.sdk.uikit.common.views.OneMeContactsChipGroup r1 = r9.O1
            android.widget.EditText r1 = r1.getEditText()
            u2 r4 = new u2
            r5 = 5
            r4.<init>(r5, r9)
            r1.addTextChangedListener(r4)
            one.me.sdk.uikit.common.views.OneMeContactsChipGroup r1 = r9.O1
            zqd r4 = new zqd
            r5 = 13
            r6 = 0
            r4.<init>(r9, r2, r6, r5)
            r1.setCallback(r4)
            java.util.Iterator r1 = r12.iterator()
        L_0x035d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x03a5
            java.lang.Object r2 = r1.next()
            java.lang.Long r2 = (java.lang.Long) r2
            long r4 = r2.longValue()
            java.util.List r2 = r9.I1
            java.util.Iterator r2 = r2.iterator()
        L_0x0373:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x0388
            java.lang.Object r6 = r2.next()
            vk3 r6 = (defpackage.vk3) r6
            long r7 = r6.r()
            int r7 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r7 != 0) goto L_0x0373
            goto L_0x0389
        L_0x0388:
            r6 = r3
        L_0x0389:
            if (r6 == 0) goto L_0x035d
            one.me.sdk.uikit.common.views.OneMeContactsChipGroup r12 = r9.O1
            long r13 = r6.r()
            java.lang.String r18 = r6.f()
            java.lang.String r19 = r6.d()
            long r15 = r6.r()
            java.lang.CharSequence r17 = r6.q()
            r12.a(r13, r15, r17, r18, r19)
            goto L_0x035d
        L_0x03a5:
            int r1 = defpackage.lic.separator
            android.view.View r1 = r0.findViewById(r1)
            android.content.Context r2 = r20.O1()
            fu4 r2 = r11.e(r2)
            k2b r2 = r2.f()
            fye r2 = r2.h()
            int r2 = r2.j
            r1.setBackgroundColor(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.contacts.picker.FrgContactMultiPicker.k2(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void k3(vk3 vk3) {
        int y = tr1.y(this.U1);
        if (y != 0) {
            if (y == 1 || y == 2) {
                HashSet hashSet = this.H1;
                if (hashSet.contains(Long.valueOf(vk3.r()))) {
                    n3(vk3.r());
                } else {
                    cud cud = ym.v.c().b;
                    cud.getClass();
                    int r = (int) cud.r(PmsKey.f69maxparticipants, (long) 20000);
                    ym.v.c().b.getClass();
                    if (this.G1.size() + hashSet.size() + 1 >= r) {
                        a32 a32 = this.K1;
                        ContactsMultiPickerLimitDialog.Z2(r, S1((a32 == null || !a32.K()) ? qad.k4 : qad.j4), S1(qad.l4)).Y2(this.D0, "ru.ok.messages.views.dialogs.ContactsMultiPickerLimitDialog");
                    } else if (hashSet.size() + 1 > 100) {
                        a32 a322 = this.K1;
                        String S12 = S1((a322 == null || !a322.K()) ? qad.k4 : qad.j4);
                        a32 a323 = this.K1;
                        ContactsMultiPickerLimitDialog.Z2(100, S12, S1((a323 == null || !a323.K()) ? qad.n4 : qad.m4)).Y2(this.D0, "ru.ok.messages.views.dialogs.ContactsMultiPickerLimitDialog");
                    } else {
                        this.O1.a(vk3.r(), vk3.r(), vk3.q(), vk3.f(), vk3.d());
                        hashSet.add(Long.valueOf(vk3.r()));
                        p3();
                    }
                }
                if (this.N1 != null) {
                    if (hashSet.isEmpty()) {
                        this.N1.c((Integer) null, false);
                        if (this.V1 == 3) {
                            this.N1.setVisibility(8);
                        }
                    } else {
                        this.N1.c(Integer.valueOf(hashSet.size()), true);
                        if (this.V1 == 3) {
                            this.N1.setVisibility(0);
                        }
                    }
                }
            }
        } else if (j3() != null) {
            ((ActAdminPicker) j3()).W(new ArrayList(Collections.singletonList(vk3)));
        }
        this.O1.getEditText().setHint(umc.chat_create_search_by_name);
    }

    public final void l3(List list) {
        if (X2() == null || !(X2() instanceof yg6) || j3() == null) {
            int size = list.size();
            long[] jArr = new long[size];
            boolean z = false;
            for (int i = 0; i < list.size(); i++) {
                jArr[i] = ((vk3) list.get(i)).r();
            }
            ta4 W0 = mt7.b.W0();
            zqd zqd = new zqd(9);
            zqd.b = ":chat/add-icon";
            if (size == 0) {
                z = true;
            }
            if (!z) {
                zqd.z(ArraysKt___ArraysKt.joinToString$default(jArr, (CharSequence) ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null), "ids");
            }
            W0.c(zqd.p(), (Bundle) null);
            return;
        }
        ((ActAdminPicker) j3()).W(list);
    }

    public final void n3(long j) {
        this.O1.c(j);
        this.H1.remove(Long.valueOf(j));
        if (this.V1 == 1) {
            HashSet hashSet = this.G1;
            if (hashSet.contains(Long.valueOf(j))) {
                hashSet.remove(Long.valueOf(j));
            }
        }
        p3();
    }

    public final void o3(boolean z) {
        if (z && !this.R1) {
            this.B1.r0(this.P1);
            this.B1.r0(this.Q1);
            this.B1.j(this.P1);
            this.B1.j(this.Q1);
            this.R1 = true;
        } else if (!z && this.R1) {
            this.B1.r0(this.P1);
            this.B1.r0(this.Q1);
            this.R1 = false;
        }
    }

    @oye
    public void onEvent(z41 z41) {
        if (this.V1 == 2 && this.o1) {
            w21 k = ((qra) ((id3) this.p1.b)).k();
            O1();
            k.getClass();
        }
    }

    public final void p3() {
        this.F1.G(this.T1.R(O1(), this.J1, this.H1));
    }

    public final void s() {
        qj2 qj2 = this.S1;
        if (qj2 != null) {
            ArrayList arrayList = qj2.b.f;
            if (!arrayList.isEmpty()) {
                HashSet hashSet = this.G1;
                ArrayList arrayList2 = this.S1.b.f;
                ArrayList arrayList3 = new ArrayList(arrayList2.size());
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    try {
                        arrayList3.add(Long.valueOf(((bj2) it.next()).a.a));
                    } catch (Throwable th) {
                        throw new RuntimeException(th);
                    }
                }
                hashSet.addAll(arrayList3);
                p3();
                tj2 tj2 = this.S1.b;
                if ((tj2.h != 0 || tj2.g == null) && arrayList.size() < 1000) {
                    this.S1.d();
                }
            }
        }
    }

    public final void t0(long j) {
        int i = this.V1;
        if ((i == 1 || i == 3) && this.U1 == 2) {
            this.J1.stream().filter(new wg6(j, 0)).findFirst().ifPresent(new xg6(0, this));
        }
    }

    public final void t2() {
        super.t2();
        qj2 qj2 = this.S1;
        if (qj2 != null) {
            qj2.h((oj2) null);
        }
    }

    public final void v(long j) {
    }

    public final void w2() {
        super.w2();
        int i = this.V1;
        if (i == 5 || i == 6) {
            Editable text = this.O1.getEditText().getText();
            if (!cvg.A(text)) {
                h3(String.valueOf(text));
            } else {
                h3("");
            }
        }
        if (this.V1 == 2) {
            w21 k = ((qra) ((id3) this.p1.b)).k();
            O1();
            k.getClass();
        }
        qj2 qj2 = this.S1;
        if (qj2 != null) {
            qj2.h(this);
        }
    }

    public final void x2(Bundle bundle) {
        super.x2(bundle);
        HashSet hashSet = this.H1;
        if (!hashSet.isEmpty()) {
            bundle.putLongArray("ru.ok.tamtam.extra.PICKER_SELECTION", cjf.j(hashSet));
        }
        bundle.putParcelable("ru.ok.tamtam.extra.RECYCLER_STATE", this.D1.m0());
        HashSet hashSet2 = this.G1;
        if (!hashSet2.isEmpty()) {
            bundle.putLongArray("ru.ok.tamtam.DISABLED_CONTACT_LIST", cjf.j(hashSet2));
        }
    }
}
