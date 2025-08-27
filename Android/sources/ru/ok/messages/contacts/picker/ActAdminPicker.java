package ru.ok.messages.contacts.picker;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.a;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import java.util.List;
import ru.ok.messages.channels.FrgChatMembers;
import ru.ok.messages.views.dialogs.FrgDlgLeaveChat;
import ru.ok.messages.views.dialogs.FrgDlgMoveOwnerConfirm;
import ru.ok.messages.views.dialogs.ProgressDialog;

public class ActAdminPicker extends m5 implements yg6, rbg, zg3, kh6, ph6, hkd, ikd {
    public static final /* synthetic */ int N0 = 0;
    public ng6 A0;
    public Class B0;
    public ViewGroup C0;
    public ViewPager D0;
    public TabLayout E0;
    public a32 F0;
    public long G0;
    public long H0;
    public FrgDlgMoveOwnerConfirm I0;
    public int J0;
    public b33 K0;
    public jkd L0;
    public ProgressDialog M0;
    public tx9 z0;

    public static Intent T(long j, ArrayList arrayList, ng6 ng6, Context context, boolean z) {
        Intent intent = new Intent(context, ActAdminPicker.class);
        intent.putExtra("ru.ok.tamtam.extra.CHAT_ID", j);
        intent.putExtra("ru.ok.tamtam.extra.TYPES", arrayList);
        intent.putExtra("ru.ok.tamtam.extra.BEFORE_LEAVE", z);
        intent.putExtra("ru.ok.tamtam.extra.PICKER_ACTION", ng6);
        return intent;
    }

    public final String E() {
        return null;
    }

    public final void G1(Bundle bundle) {
    }

    public final void H(int i, int i2, Intent intent) {
        if (i == 656 && i2 == -1) {
            finish();
        }
    }

    public final void S(long j) {
        ((qra) ((id3) this.x.b)).l().X(j);
        Intent intent = new Intent();
        intent.putExtra("ru.ok.tamtam.extra.EXTRA_LEAVE", true);
        setResult(-1, intent);
        finish();
    }

    public final void U(long j) {
        FrgDlgMoveOwnerConfirm frgDlgMoveOwnerConfirm = this.I0;
        if (frgDlgMoveOwnerConfirm != null) {
            frgDlgMoveOwnerConfirm.T2(false, false);
            this.I0 = null;
        }
        long j2 = this.F0.a;
        Bundle bundle = new Bundle();
        bundle.putLong("ru.ok.tamtam.extra.EXTRA_CONTACT_ID", j);
        bundle.putLong("ru.ok.tamtam.extra.EXTRA_CHAT_ID", j2);
        FrgDlgMoveOwnerConfirm frgDlgMoveOwnerConfirm2 = new FrgDlgMoveOwnerConfirm();
        frgDlgMoveOwnerConfirm2.L2(bundle);
        this.I0 = frgDlgMoveOwnerConfirm2;
        frgDlgMoveOwnerConfirm2.Y2(v(), "ru.ok.messages.views.dialogs.FrgDlgMoveOwnerConfirm");
    }

    public final void W(List list) {
        if (list != null && !list.isEmpty()) {
            vk3 vk3 = (vk3) list.get(0);
            if (((vk3) list.get(0)).r() != ym.e().a()) {
                ng6 ng6 = this.A0;
                if (ng6 == null || ng6 != ng6.b) {
                    z4.T(this, 656, vk3.r(), getIntent().getLongExtra("ru.ok.tamtam.extra.CHAT_ID", 0));
                    return;
                }
                U(vk3.r());
            }
        }
    }

    public final void X(int i) {
        SparseArray sparseArray = this.z0.j;
        if (i < sparseArray.size()) {
            a aVar = (a) sparseArray.get(i);
            if (aVar instanceof FrgChatMembers) {
                z68.a("ru.ok.messages.contacts.picker.ActAdminPicker", "onPageSelected: FrgChatMembers");
                Y(FrgChatMembers.class);
            } else if (aVar instanceof FrgContactMultiPicker) {
                z68.a("ru.ok.messages.contacts.picker.ActAdminPicker", "onPageSelected: FrgContactMultiPicker");
                Y(FrgContactMultiPicker.class);
            }
        }
    }

    public final void Y(Class cls) {
        long j = 0;
        if (this.H0 != 0) {
            SystemClock.elapsedRealtime();
            Class cls2 = this.B0;
            if (this.F0 != null) {
                if (FrgChatMembers.class.isAssignableFrom(cls2)) {
                    this.F0.K();
                } else {
                    FrgContactMultiPicker.class.isAssignableFrom(cls2);
                }
            }
        }
        this.B0 = cls;
        if (cls != null) {
            j = SystemClock.elapsedRealtime();
        }
        this.H0 = j;
    }

    public final void Y0(String str) {
        SparseArray sparseArray = this.z0.j;
        for (int i = 0; i < sparseArray.size(); i++) {
            a aVar = (a) sparseArray.get(i);
            if (aVar instanceof ikd) {
                ((ikd) aVar).Y0(str);
            }
            if (aVar instanceof FrgContactMultiPicker) {
                ((FrgContactMultiPicker) aVar).h3(str);
            }
        }
    }

    public final void f(float f, int i) {
    }

    public final void l(int i) {
    }

    public final void m(int i) {
        this.J0 = i;
        X(i);
    }

    public final void onCreate(Bundle bundle) {
        Bundle bundle2 = bundle;
        super.onCreate(bundle);
        long longExtra = getIntent().getLongExtra("ru.ok.tamtam.extra.CHAT_ID", 0);
        a32 G = ((qra) ((id3) this.x.b)).l().G(longExtra);
        this.F0 = G;
        if (G == null) {
            finish();
        }
        setContentView(ujc.act_multiple_source_contact_picker);
        fj fjVar = new fj((hn) this);
        this.L0 = new jkd(fjVar, lic.menu_search__search, getString(qad.x8), this.X, this, ((qra) ((id3) this.x.b)).v(), getLifecycle());
        obd obd = new obd(fjVar, (Toolbar) findViewById(lic.toolbar));
        obd.x = this.X;
        obd.w = this.L0;
        b33 b33 = new b33(obd);
        this.K0 = b33;
        b33.g(nad.u);
        this.K0.i(new x4(0, (Object) this));
        this.L0.i(this, true, this.K0);
        this.C0 = (ViewGroup) findViewById(lic.act_multiple_source_contact_picker__root);
        ng6 ng6 = (ng6) getIntent().getSerializableExtra("ru.ok.tamtam.extra.PICKER_ACTION");
        this.A0 = ng6;
        ng6 ng62 = ng6.b;
        if (ng6 == null || ng6 != ng62) {
            this.K0.k(qad.h);
        } else {
            this.K0.k(qad.t0);
        }
        ArrayList arrayList = (ArrayList) getIntent().getSerializableExtra("ru.ok.tamtam.extra.TYPES");
        ng6 ng63 = this.A0;
        if (ng63 != null && ng63 == ng62 && arrayList.size() > 1) {
            y4 y4Var = y4.a;
            if (arrayList.contains(y4Var) && this.F0.b.R.size() == 1) {
                arrayList.remove(y4Var);
            }
        }
        if (bundle2 != null) {
            this.J0 = bundle2.getInt("ru.ok.tamtam.extra.SELECTED_POS", 0);
            this.G0 = bundle2.getLong("ru.ok.tamtam.extra.CHANGE_OWNER_REQUEST_ID", 0);
            this.L0.f("", bundle2);
        }
        ViewPager viewPager = (ViewPager) findViewById(lic.viewpager);
        this.D0 = viewPager;
        viewPager.b(this);
        this.D0.setOffscreenPageLimit(arrayList.size());
        this.D0.setCurrentItem(this.J0);
        tx9 tx9 = new tx9(this, v(), arrayList, longExtra, this.A0);
        this.z0 = tx9;
        this.D0.setAdapter(tx9);
        this.z0.h();
        this.E0 = (TabLayout) findViewById(lic.tabs);
        if (arrayList.size() == 1) {
            this.E0.setVisibility(8);
        } else {
            this.E0.setupWithViewPager(this.D0);
        }
        this.D0.post(new c(2, this, bundle2));
        L(this.X.M);
        this.C0.setBackgroundColor(this.X.n);
        this.D0.setBackgroundColor(this.X.n);
        this.E0.setBackgroundColor(this.X.n);
        TabLayout tabLayout = this.E0;
        scf scf = this.X;
        int i = scf.N;
        tabLayout.getClass();
        tabLayout.setTabTextColors(TabLayout.f(i, scf.G));
        this.E0.setSelectedTabIndicatorColor(this.X.l);
    }

    public final void onDestroy() {
        super.onDestroy();
        jkd jkd = this.L0;
        if (jkd != null) {
            or7 or7 = jkd.x;
            if (or7 != null) {
                qq4.a(or7);
                jkd.x = null;
            }
            this.L0 = null;
        }
        this.K0 = null;
    }

    @oye
    public void onEvent(yr2 yr2) {
        if (yr2.a != this.G0) {
            ryg.S(this.v0, yr2, false);
        } else if (this.Z) {
            this.M0.T2(false, false);
            this.G0 = 0;
            FrgDlgMoveOwnerConfirm frgDlgMoveOwnerConfirm = this.I0;
            if (frgDlgMoveOwnerConfirm != null) {
                frgDlgMoveOwnerConfirm.T2(false, false);
                this.I0 = null;
            }
            if (getIntent().getBooleanExtra("ru.ok.tamtam.extra.BEFORE_LEAVE", false)) {
                FrgDlgLeaveChat.f3(this.F0.a).Y2(v(), "ru.ok.messages.views.dialogs.FrgDlgLeaveChat");
            } else {
                finish();
            }
        }
    }

    public final void onPause() {
        super.onPause();
        Y((Class) null);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putLong("ru.ok.tamtam.extra.CHANGE_OWNER_REQUEST_ID", this.G0);
        bundle.putInt("ru.ok.tamtam.extra.SELECTED_POS", this.J0);
        jkd jkd = this.L0;
        if (jkd != null) {
            jkd.g("", bundle);
        }
    }

    public final void onStart() {
        super.onStart();
        this.D0.post(new b(2, (Object) this));
    }

    @oye
    public void onEvent(hj0 hj0) {
        if (hj0.a != this.G0) {
            return;
        }
        if (this.Z) {
            this.M0.T2(false, false);
            this.G0 = 0;
            FrgDlgMoveOwnerConfirm frgDlgMoveOwnerConfirm = this.I0;
            if (frgDlgMoveOwnerConfirm != null) {
                frgDlgMoveOwnerConfirm.T2(false, false);
                this.I0 = null;
            }
            String str = hj0.b.o;
            if (cvg.A(str)) {
                str = getString(qad.l);
            }
            hi7.b0(0, this, str);
            return;
        }
        ryg.S(this.v0, hj0, true);
    }
}
