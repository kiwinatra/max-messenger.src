package ru.ok.messages.settings;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.timepicker.MaterialTimePicker;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.LazyKt;
import ru.ok.messages.settings.view.ExtraTextSizeView;
import ru.ok.messages.settings.view.ThemePreviewView;
import ru.ok.messages.views.dialogs.FrgDlgNightMode;
import ru.ok.messages.views.dialogs.FrgDlgNightTheme;
import ru.ok.messages.views.fragments.base.FrgBase;

public class FrgAppearanceSettings extends FrgBase implements b0e, qh6, rh6, hsd {
    public ExtraTextSizeView B1;
    public ThemePreviewView C1;
    public ThemePreviewView D1;
    public ImageView E1;
    public Button F1;
    public boolean G1 = true;
    public boolean H1 = false;
    public RecyclerView I1;
    public RecyclerView J1;
    public lf0 K1;
    public lf0 L1;
    public final ArrayList M1 = new ArrayList();
    public fyd N1;
    public float O1 = 0.5f;
    public final ArrayList P1 = new ArrayList();
    public hq Q1;
    public a33 R1;
    public tcf S1;
    public wf6 T1;
    public wf6 U1;
    public ef9 V1;
    public ef9 W1;

    public final void C(int i, Object obj) {
        if (i == lic.setting_color_scheme) {
            scf scf = (scf) obj;
            String str = scf.e;
            hq hqVar = this.Q1;
            hqVar.getClass();
            if (!str.equals(hqVar.g.getString("app.theme", vi4.f0.e))) {
                ((qra) ym.e()).I().a(scf.e, true);
                ((qra) ym.e()).c().f("ACTION_THEME_CHANGED", scf.c ? "dark" : "light");
            }
        } else if (i == lic.setting_night_mode_brightness) {
            Integer num = (Integer) obj;
            fu4.k.e(G2()).j(new e9a(num.intValue()));
            this.Q1.j(num.intValue(), "app.night.mode.brightness");
            fyd fyd = this.N1;
            if (fyd != null) {
                fyd.w = obj;
            }
            this.S1.b(true);
        } else if (i == lic.setting_appearance_enable_animations) {
            Boolean bool = (Boolean) obj;
            ((qra) ym.e()).c().f("ACTION_ANIMATIONS_ENABLED", bool.booleanValue() ? "1" : "0");
            this.Q1.i("app.messages.enable.animations", bool.booleanValue());
        }
    }

    public final void E(int i, Object obj) {
        if (i == lic.setting_night_mode) {
            new FrgDlgNightMode().d3(this);
        } else if (i == lic.setting_night_mode_start) {
            m3(true);
        } else if (i == lic.setting_night_mode_end) {
            m3(false);
        } else if (i == lic.setting_night_mode_theme) {
            new FrgDlgNightTheme().d3(this);
        } else if (i == lic.setting_color_scheme) {
            Bundle bundle = new Bundle();
            bundle.putString("ru.ok.tamtam.extra.THEME_FORWARD", ((scf) obj).e);
            u5.T(this, bundle, 111, (Serializable) null);
        }
    }

    public final String V2() {
        return "SETTINGS_BACKGROUND";
    }

    public final void Z2(View view) {
        h3(view);
    }

    public final void b3(int i, int i2, Intent intent) {
        if (intent != null) {
            if (i == 10400 && i2 == -1) {
                int i3 = ik6.z0;
                Bundle extras = intent.getExtras();
                tl6 tl6 = extras == null ? null : (tl6) extras.getParcelable("GalleryActivity:result");
                if (tl6 != null && (tl6 instanceof sl6)) {
                    new ule(((qra) ((id3) this.p1.b)).p(), ((qra) ((id3) this.p1.b)).n(), ((qra) ((id3) this.p1.b)).y().b).a(this, ((sl6) tl6).a.c.toString());
                    return;
                }
                return;
            }
            if (!new srd((Object) ((qra) ((id3) this.p1.b)).p(), (Object) ((qra) ((id3) this.p1.b)).y(), (Object) ((qra) ((id3) this.p1.b)).I(), (Object) ((qra) ((id3) this.p1.b)).c()).r(this, i, i2, intent, new vf6(this, 2)) && i == 111 && i2 == -1) {
                long[] longArrayExtra = intent.getLongArrayExtra("ru.ok.tamtam.extra.CHAT_IDS");
                String string = intent.getBundleExtra("ru.ok.tamtam.extra.TRANSIT_BUNDLE").getString("ru.ok.tamtam.extra.THEME_FORWARD");
                for (long fvd : longArrayExtra) {
                    cbe cbe = new cbe(7, string);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(cbe);
                    this.q1.A().a(new gvd(new fvd(fvd, arrayList)));
                }
            }
        }
    }

    public final void h3(View view) {
        Y2().a(this.r1);
        view.setBackgroundColor(this.r1.n);
        f6e.C(this.J1);
        ArrayList arrayList = this.P1;
        arrayList.clear();
        arrayList.addAll(j3());
        f6e.C(this.I1);
        this.E1.setBackground(i8b.K(Integer.valueOf(this.r1.n), (Integer) null, (Integer) null));
        this.E1.setColorFilter(this.r1.x);
        this.F1.setTextColor(this.r1.l);
        this.F1.setBackground(this.r1.e());
        view.findViewById(lic.frg_appearance_settings__top_separator).setBackgroundColor(this.r1.I);
        view.findViewById(lic.frg_appearance_settings__message_text_size_separator).setBackgroundColor(this.r1.I);
        view.findViewById(lic.frg_appearance_settings__themes_separator).setBackgroundColor(this.r1.I);
        o3();
        this.B1.c();
    }

    public final void i2(Bundle bundle) {
        super.i2(bundle);
        this.R1 = ym.v.c().a;
        this.Q1 = ym.v.c().c;
        this.S1 = ((qra) ym.e()).I();
        if (bundle != null) {
            this.O1 = bundle.getFloat("ru.ok.tamtam.extra.LAST_BRIGHTNESS", 0.5f);
            this.G1 = bundle.getBoolean("ru.ok.tamtam.extra.LIGHT_PREVIEW_SHOWING", true);
            this.H1 = bundle.getBoolean("ru.ok.tamtam.extra.TEXT_SIZE_CHANGED", false);
        }
        this.T1 = new wf6(this);
        this.S1.e(true);
        this.U1 = new wf6(this);
        this.V1 = new ef9(E2().getApplicationContext(), ((qra) ((id3) this.p1.b)).G(), LazyKt.lazy(new uf6(this, 1)), LazyKt.lazy(new uf6(this, 2)), ((qra) ((id3) this.p1.b)).o());
        this.W1 = new ef9(E2().getApplicationContext(), ((qra) ((id3) this.p1.b)).G(), LazyKt.lazy(new uf6(this, 3)), LazyKt.lazy(new uf6(this, 4)), ((qra) ((id3) this.p1.b)).o());
    }

    public final void i3() {
        String S12;
        ArrayList arrayList = this.M1;
        arrayList.add(fyd.b(S1(qad.W8)));
        arrayList.add(fyd.d(lic.setting_color_scheme, vi4.f0));
        arrayList.add(fyd.d(lic.setting_color_scheme, o84.f0));
        arrayList.add(fyd.d(lic.setting_color_scheme, l9a.f0));
        arrayList.add(fyd.d(lic.setting_color_scheme, hu6.f0));
        Iterator it = ((qra) ((id3) this.p1.b)).I().d().iterator();
        while (it.hasNext()) {
            arrayList.add(fyd.d(lic.setting_color_scheme, (scf) it.next()));
        }
        if (arrayList.size() > 0) {
            ((fyd) a81.h(1, arrayList)).X = true;
        }
        int i = lic.setting_night_mode;
        String S13 = S1(qad.b9);
        String w = this.Q1.w();
        w.getClass();
        char c = 65535;
        switch (w.hashCode()) {
            case -123544841:
                if (w.equals("app.night.mode.auto")) {
                    c = 0;
                    break;
                }
                break;
            case 1712040927:
                if (w.equals("app.night.mode.schedule")) {
                    c = 1;
                    break;
                }
                break;
            case 2051489143:
                if (w.equals("app.night.mode.system")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                S12 = S1(qad.c9);
                break;
            case 1:
                S12 = S1(qad.g9);
                break;
            case 2:
                S12 = S1(qad.i9);
                break;
            default:
                S12 = S1(qad.f9);
                break;
        }
        fyd fyd = new fyd(i, S13, (String) null, (String) null, S12, 1);
        arrayList.add(fyd);
        String w2 = this.Q1.w();
        if (!w2.equals("app.night.mode")) {
            fyd.X = true;
            if (w2.equals("app.night.mode.schedule")) {
                arrayList.add(new fyd(lic.setting_night_mode_start, S1(qad.h9), (String) null, (String) null, k3(true), 1));
                fyd fyd2 = new fyd(lic.setting_night_mode_end, S1(qad.e9), (String) null, (String) null, k3(false), 1);
                fyd2.X = true;
                arrayList.add(fyd2);
            } else if (w2.equals("app.night.mode.auto")) {
                arrayList.add(fyd.b(S1(qad.d9)));
                fyd fyd3 = new fyd(lic.setting_night_mode_brightness, (CharSequence) null, (String) null, (String) null, Integer.valueOf(this.Q1.g.getInt("app.night.mode.brightness", 30)), 9);
                this.N1 = fyd3;
                float f = this.O1;
                if (f <= c44.DEFAULT_ASPECT_RATIO) {
                    f = 0.5f;
                }
                fyd3.x = Float.valueOf(f);
                arrayList.add(this.N1);
            }
            arrayList.add(new fyd(lic.setting_night_mode_theme, S1(qad.j9), (String) null, (String) null, fqc.s(this.S1.e(true), G2()), 1));
        }
        if (arrayList.size() > 0) {
            ((fyd) arrayList.get(arrayList.size() - 1)).X = true;
        }
        arrayList.add(fyd.a(S1(qad.v5), lic.setting_appearance_enable_animations, "", this.Q1.u()));
    }

    public final ArrayList j3() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        arrayList.add(this.S1.e(false).b(G2()));
        po5 p = ((qra) ym.e()).p();
        int[] iArr = nf0.a;
        ArrayList arrayList2 = new ArrayList();
        File[] listFiles = p.c.getDir("backgrounds", 0).listFiles();
        if (listFiles != null) {
            for (File fromFile : listFiles) {
                arrayList2.add(Uri.fromFile(fromFile));
            }
        }
        arrayList.addAll(arrayList2);
        while (true) {
            int[] iArr2 = nf0.a;
            if (i >= iArr2.length) {
                return arrayList;
            }
            Uri y = o5a.y(O1().getResources(), iArr2[i]);
            if (!arrayList.contains(y)) {
                arrayList.add(y);
            }
            i++;
        }
    }

    public final View k2(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(ujc.frg_appearance_settings, viewGroup, false);
        ExtraTextSizeView extraTextSizeView = (ExtraTextSizeView) inflate.findViewById(lic.frg_appearance_settings__message_text_size);
        this.B1 = extraTextSizeView;
        extraTextSizeView.setListener(new lc5(15, (Object) this));
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(lic.frg_appearance_settings__rv_items);
        this.I1 = recyclerView;
        recyclerView.setHasFixedSize(true);
        this.I1.setClipToPadding(false);
        M1();
        this.I1.setLayoutManager(new LinearLayoutManager(0, false));
        lf0 lf0 = new lf0((List) this.P1, this);
        this.K1 = lf0;
        this.I1.setAdapter(lf0);
        l3(false);
        Y2().l(S1(qad.k9));
        RecyclerView recyclerView2 = (RecyclerView) inflate.findViewById(lic.frg_appearance_settings__rv_settings);
        this.J1 = recyclerView2;
        WeakHashMap weakHashMap = gag.a;
        v9g.t(recyclerView2, false);
        RecyclerView recyclerView3 = this.J1;
        M1();
        recyclerView3.setLayoutManager(new LinearLayoutManager(1, false));
        this.J1.setItemAnimator((yyc) null);
        i3();
        lf0 lf02 = new lf0(O1(), (List) this.M1, (b0e) this);
        this.L1 = lf02;
        this.J1.setAdapter(lf02);
        Button button = (Button) inflate.findViewById(lic.frg_appearance_settings__btn_add_bg);
        this.F1 = button;
        y64.n(button, new vf6(this, 0));
        this.C1 = (ThemePreviewView) inflate.findViewById(lic.frg_appearance_settings_select__ll_messages);
        this.D1 = (ThemePreviewView) inflate.findViewById(lic.frg_appearance_settings__ll_messages_dark);
        this.E1 = (ImageView) inflate.findViewById(lic.frg_appearance_settings_select__btn_preview_switch);
        if (!this.G1) {
            this.C1.post(new y86(4, (Object) this));
        }
        if (this.G1) {
            this.E1.setImageResource(nad.Z);
        } else {
            this.E1.setImageResource(nad.F0);
        }
        y64.n(this.E1, new vf6(this, 1));
        h3(inflate);
        return inflate;
    }

    public final String k3(boolean z) {
        v7b y = z ? this.Q1.y() : this.Q1.x();
        return new g84(j4b.D(O1()) ? "hh:mm" : "h12:mm a", this.R1.u()).b(new d84((Integer) null, (Integer) null, (Integer) null, (Integer) y.a, (Integer) y.b, 0, 0));
    }

    public final void l2() {
        super.l2();
        this.T1 = null;
        this.U1 = null;
        this.V1 = null;
        this.W1 = null;
        M1();
    }

    public final void l3(boolean z) {
        ArrayList arrayList = this.P1;
        a33 a33 = this.R1;
        O1();
        int indexOf = arrayList.indexOf(nf0.c(a33, this.S1.g()));
        if (indexOf < 0) {
            return;
        }
        if (z) {
            this.I1.D0(indexOf);
        } else {
            this.I1.z0(indexOf);
        }
    }

    public final void m3(boolean z) {
        hq hqVar = this.Q1;
        v7b y = z ? hqVar.y() : hqVar.x();
        int i = this.S1.c().c ? rad.h : rad.g;
        int i2 = 1;
        ijf ijf = new ijf(1);
        ijf.d(0);
        ijf.x = 0;
        ijf.o = 0;
        int intValue = ((Integer) y.a).intValue();
        if (intValue < 12) {
            i2 = 0;
        }
        ijf.x = i2;
        ijf.o = intValue;
        ijf.d(((Integer) y.b).intValue());
        MaterialTimePicker materialTimePicker = new MaterialTimePicker();
        Bundle bundle = new Bundle();
        bundle.putParcelable("TIME_PICKER_TIME_MODEL", ijf);
        bundle.putInt("TIME_PICKER_TITLE_RES", 0);
        bundle.putInt("TIME_PICKER_POSITIVE_BUTTON_TEXT_RES", 0);
        bundle.putInt("TIME_PICKER_NEGATIVE_BUTTON_TEXT_RES", 0);
        bundle.putInt("TIME_PICKER_OVERRIDE_THEME_RES_ID", i);
        materialTimePicker.L2(bundle);
        materialTimePicker.B1.add(new et3(this, z, materialTimePicker));
        materialTimePicker.Y2(Q1(), FrgAppearanceSettings.class.getName());
    }

    public final void n1(float f, boolean z) {
        if (this.N1 != null) {
            float a = ((float) ksd.a(f)) / 100.0f;
            this.O1 = a;
            this.N1.x = Float.valueOf(a);
            int indexOf = this.M1.indexOf(this.N1);
            if (indexOf >= 0) {
                this.L1.a.d(indexOf, 1, (Object) null);
            }
        }
    }

    public final void n3() {
        ksd ksd = (ksd) ((qra) ym.e()).getAccessor().g(ksd.class);
        Set set = ksd.e;
        if (set.remove(this) && set.size() == 0) {
            ksd.a.unregisterListener(ksd.f);
        }
    }

    public final void o3() {
        scf e = this.S1.e(false);
        a33 a33 = this.R1;
        O1();
        Uri c = nf0.c(a33, this.S1.g());
        ef9 ef9 = this.V1;
        if (ef9 != null) {
            ef9.f();
        }
        this.C1.c(e, c, this.V1);
        if (!this.S1.b.c.w().equals("app.night.mode")) {
            scf e2 = this.S1.e(true);
            if (c.equals(e.b(G2()))) {
                c = e2.b(G2());
            }
            ef9 ef92 = this.W1;
            if (ef92 != null) {
                ef92.f();
            }
            this.D1.c(e2, c, this.W1);
            this.D1.setVisibility(0);
            this.E1.setVisibility(0);
            return;
        }
        this.E1.setVisibility(8);
        this.D1.setVisibility(8);
        this.C1.setVisibility(0);
    }

    public final void p3() {
        this.M1.clear();
        i3();
        this.L1.m();
    }

    public final void t2() {
        super.t2();
        n3();
    }

    public final void w2() {
        super.w2();
        if (this.Q1.w().equals("app.night.mode.auto")) {
            ((ksd) ((qra) ym.e()).getAccessor().g(ksd.class)).b(this);
        }
    }

    public final void x2(Bundle bundle) {
        super.x2(bundle);
        bundle.putFloat("ru.ok.tamtam.extra.LAST_BRIGHTNESS", this.O1);
        bundle.putBoolean("ru.ok.tamtam.extra.LIGHT_PREVIEW_SHOWING", this.G1);
        bundle.putBoolean("ru.ok.tamtam.extra.TEXT_SIZE_CHANGED", this.H1);
    }
}
