package ru.ok.messages.settings;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.IntCompanionObject;
import one.me.android.deeplink.NewWidgetActivity;
import one.me.sdk.lists.widgets.EndlessRecyclerView;
import one.me.sdk.uikit.common.emptyview.OneMeEmptyView;
import org.apache.http.HttpStatus;
import ru.ok.messages.views.dialogs.ConfirmationDialog;
import ru.ok.messages.views.fragments.base.FrgBase;

public class FrgBlackListSettings extends FrgBase implements dm3, u65 {
    public EndlessRecyclerView B1;
    public yu3 C1;
    public OneMeEmptyView D1;
    public final ArrayList E1 = new ArrayList();
    public ArrayList F1 = new ArrayList();
    public int G1;
    public long H1;

    public final boolean B() {
        return false;
    }

    public final void E0() {
    }

    public final boolean E1() {
        return this.G1 < Integer.MAX_VALUE;
    }

    public final String V2() {
        return "SETTINGS_PRIVACY_BLACK_LIST";
    }

    public final void b3(int i, int i2, Intent intent) {
        Bundle bundleExtra;
        if (i2 == -1 && i == 101 && (bundleExtra = intent.getBundleExtra("ru.ok.tamtam.extra.DATA")) != null && bundleExtra.containsKey("ru.ok.tamtam.extra.UNBLOCK_CONTACT_ID")) {
            long j = bundleExtra.getLong("ru.ok.tamtam.extra.UNBLOCK_CONTACT_ID");
            z68.c("ru.ok.messages.settings.FrgBlackListSettings", "contact unblock = " + j, new Object[0]);
            this.q1.i().E(j);
            FrameLayout frameLayout = (FrameLayout) this.S0;
            if (frameLayout != null) {
                String string = R1().getString(qad.da);
                e0b e0b = new e0b((ViewGroup) frameLayout);
                e0b.f(new o0b(cad.o));
                e0b.i(string);
                e0b.j();
            }
        }
    }

    public final void h3() {
        List q = this.q1.i().q(km3.s, km3.v);
        ns3 j = this.q1.j();
        j.getClass();
        Collections.sort(q, new ls3(j, 0));
        ArrayList arrayList = new ArrayList(q);
        Iterator it = this.F1.iterator();
        while (it.hasNext()) {
            vk3 p = this.q1.i().p(((vk3) it.next()).r(), true);
            if (p.w()) {
                long r = p.r();
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (((vk3) it2.next()).r() == r) {
                            break;
                        }
                    } else {
                        arrayList.add(p);
                        break;
                    }
                }
            }
        }
        ArrayList arrayList2 = this.E1;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        yu3 yu3 = this.C1;
        if (yu3 != null) {
            yu3.m();
        }
    }

    public final void i2(Bundle bundle) {
        super.i2(bundle);
        if (bundle == null) {
            List q = this.q1.i().q(km3.s, km3.v);
            ns3 j = this.q1.j();
            j.getClass();
            Collections.sort(q, new ls3(j, 0));
            this.F1 = new ArrayList(q);
            i3(0);
            return;
        }
        this.F1 = kr3.a(bundle.getParcelableArrayList("ru.ok.tamtam.extra.BLOCKED_LIST"));
        this.G1 = bundle.getInt("ru.ok.tamtam.extra.BLOCKED_FROM");
        this.H1 = (long) bundle.getInt("ru.ok.tamtam.extra.CONTACT_LIST_REQUEST_ID");
    }

    public final void i3(int i) {
        z68.c("ru.ok.messages.settings.FrgBlackListSettings", "load, from = " + i, new Object[0]);
        jna jna = (jna) ((qra) ym.e()).e();
        this.H1 = jna.z(jna, new so3(((ltb) jna.D()).a.n(), i));
    }

    public final View k2(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(ujc.frg_black_list, viewGroup, false);
        inflate.setBackgroundColor(this.r1.n);
        this.B1 = (EndlessRecyclerView) inflate.findViewById(lic.frg_black_list__rv_contacts);
        OneMeEmptyView oneMeEmptyView = (OneMeEmptyView) inflate.findViewById(lic.frg_black_list__ll_empty);
        this.D1 = oneMeEmptyView;
        oneMeEmptyView.setIcon(cad.m0);
        this.D1.setTitle(new igf(ead.e0));
        this.D1.onThemeChanged(fu4.k.e(viewGroup.getContext()).f());
        this.B1.setHasFixedSize(true);
        this.B1.setPager(this);
        this.B1.setProgressView(ujc.base_list_progress);
        EndlessRecyclerView endlessRecyclerView = this.B1;
        M1();
        endlessRecyclerView.setLayoutManager(new LinearLayoutManager());
        this.B1.setVerticalScrollBarEnabled(true);
        EndlessRecyclerView endlessRecyclerView2 = this.B1;
        yu3 yu3 = new yu3(O1(), this, this.E1, 6);
        this.C1 = yu3;
        endlessRecyclerView2.setAdapter(yu3);
        ProgressBar progressBar = (ProgressBar) inflate.findViewById(lic.frg_black_list__pb_loading);
        iq.h(this.r1, progressBar);
        this.B1.setEmptyView(progressBar);
        b33 Y2 = Y2();
        if (Y2 != null) {
            Y2.l(S1(qad.I7));
        }
        return inflate;
    }

    public final void l1(vk3 vk3) {
        a32 K = ((qra) ((id3) this.p1.b)).l().K(vk3.r());
        if (K != null) {
            bva bva = (bva) ((qra) ((id3) this.p1.b)).getAccessor().g(bva.class);
            bva.getClass();
            Uri c = y64.c(wj6.m(new StringBuilder(":profile?id="), K.a, "&type=local_chat&is_opened_from_dialog=false"), ((fz7) ((cm) bva.b.getValue())).b, (String) null);
            int i = NewWidgetActivity.A0;
            int i2 = NewWidgetActivity.A0;
            Context context = bva.a;
            Intent intent = new Intent(context, NewWidgetActivity.class);
            if (c == null) {
                c = null;
            }
            intent.putExtra("deep_link", c);
            intent.putExtra("snackbar", (Parcelable) null);
            intent.setFlags(268435456);
            Unit unit = Unit.INSTANCE;
            context.startActivity(intent);
        }
    }

    @oye
    public void onEvent(wo3 wo3) {
        List<Long> list;
        if (this.H1 == wo3.a && (list = wo3.o) != null) {
            if (this.o1) {
                this.B1.setEmptyView(this.D1);
                this.B1.setRefreshingNext(false);
                for (Long longValue : list) {
                    long longValue2 = longValue.longValue();
                    Iterator it = this.F1.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((vk3) it.next()).r() == longValue2) {
                                break;
                            }
                        } else {
                            this.F1.add(this.q1.i().p(longValue2, true));
                            break;
                        }
                    }
                }
                this.G1 = list.size() + this.G1;
                if (list.isEmpty() || list.size() < 40) {
                    this.G1 = IntCompanionObject.MAX_VALUE;
                }
                h3();
                return;
            }
            ryg.S(this.s1, wo3, true);
        }
    }

    public final void p0(vk3 vk3) {
        Bundle bundle = new Bundle();
        bundle.putLong("ru.ok.tamtam.extra.UNBLOCK_CONTACT_ID", vk3.r());
        Bundle bundle2 = new Bundle();
        bundle2.putCharSequence("ru.ok.tamtam.extra.CONTENT", String.format(S1(qad.ca), new Object[]{vk3.f()}));
        bundle2.putInt("ru.ok.tamtam.extra.POSITIVE_TEXT_RES_ID", qad.ba);
        bundle2.putInt("ru.ok.tamtam.extra.NEGATIVE_TEXT_RES_ID", qad.m0);
        bundle2.putBundle("ru.ok.tamtam.extra.DATA", bundle);
        ConfirmationDialog confirmationDialog = new ConfirmationDialog();
        confirmationDialog.L2(bundle2);
        confirmationDialog.P2(HttpStatus.SC_SWITCHING_PROTOCOLS, this);
        confirmationDialog.Y2(this.D0, "ru.ok.messages.views.dialogs.ConfirmationDialog");
    }

    public final void u1() {
        i3(this.G1);
    }

    public final void w2() {
        super.w2();
        z5a w = ((qra) ((id3) this.p1.b)).w();
        jgd jgd = jgd.SETTINGS_PRIVACY_BLOCK_LIST;
        h8b h8b = h8b.e;
        w.f(jgd, h8b.e);
    }

    public final void x2(Bundle bundle) {
        super.x2(bundle);
        ArrayList arrayList = this.F1;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new kr3((vk3) it.next()));
        }
        bundle.putParcelableArrayList("ru.ok.tamtam.extra.BLOCKED_LIST", arrayList2);
        bundle.putInt("ru.ok.tamtam.extra.BLOCKED_FROM", this.G1);
        bundle.putLong("ru.ok.tamtam.extra.CONTACT_LIST_REQUEST_ID", this.H1);
    }

    public final void y2() {
        super.y2();
        h3();
    }

    @oye
    public void onEvent(hj0 hj0) {
        if (hj0.a == this.H1) {
            i3(this.G1);
        }
    }

    @oye
    public void onEvent(zu3 zu3) {
        if (this.o1) {
            h3();
        } else {
            T0(zu3);
        }
    }
}
