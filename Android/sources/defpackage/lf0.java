package defpackage;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.LongCompanionObject;
import ru.ok.messages.settings.FrgAppearanceSettings;
import ru.ok.messages.settings.view.BrightnessSeekBar;
import ru.ok.messages.views.fragments.FrgContactProfile;
import ru.ok.messages.views.widgets.EllipsizingEndTextView;
import ru.ok.messages.views.widgets.ImageSpanEllipsizedTextView;
import ru.ok.messages.views.widgets.TamAvatarView;

/* renamed from: lf0  reason: default package */
public final class lf0 extends tyc {
    public final /* synthetic */ int o;
    public Object v;
    public final Object w;
    public Object x;

    public lf0(Context context, ArrayList arrayList, ms1 ms1) {
        this.o = 2;
        this.x = LayoutInflater.from(context);
        this.v = arrayList;
        this.w = ms1;
    }

    public List E() {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) this.v).iterator();
        while (it.hasNext()) {
            fo3 fo3 = ((lu3) it.next()).b;
            if (fo3 != null) {
                arrayList.add(fo3);
            }
        }
        return arrayList;
    }

    public List F() {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) this.v).iterator();
        while (it.hasNext()) {
            vk3 vk3 = ((lu3) it.next()).a;
            if (vk3 != null) {
                arrayList.add(vk3);
            }
        }
        return arrayList;
    }

    public final int j() {
        switch (this.o) {
            case 0:
                return ((List) this.v).size();
            case 1:
                return ((List) this.v).size();
            case 2:
                return ((List) this.v).size();
            case 3:
                return ((ArrayList) this.v).size();
            case 4:
                return ((List) this.v).size();
            case 5:
                return 1;
            default:
                return ((List) this.v).size();
        }
    }

    public long k(int i) {
        switch (this.o) {
            case 3:
                if (i < 0) {
                    return 0;
                }
                ArrayList arrayList = (ArrayList) this.v;
                if (i >= arrayList.size()) {
                    return 0;
                }
                lu3 lu3 = (lu3) arrayList.get(i);
                vk3 vk3 = lu3.a;
                if (vk3 != null) {
                    return vk3.r();
                }
                fo3 fo3 = lu3.b;
                if (fo3 != null) {
                    return fo3.a;
                }
                return 0;
            default:
                return super.k(i);
        }
    }

    public int l(int i) {
        switch (this.o) {
            case 1:
                return ((Integer) ((List) this.v).get(i)).intValue();
            case 5:
                return lic.row_profile_contact_name_and_type;
            case 6:
                return ((fyd) ((List) this.v).get(i)).y;
            default:
                return super.l(i);
        }
    }

    public final void s(pzc pzc, int i) {
        int i2;
        p01 p01;
        String str;
        p01 p012;
        String str2;
        int i3;
        pzc pzc2 = pzc;
        int i4 = i;
        int i5 = 4;
        int i6 = 8;
        boolean z = true;
        boolean z2 = false;
        switch (this.o) {
            case 0:
                mf0 mf0 = (mf0) pzc2;
                Uri uri = (Uri) ((List) this.v).get(i4);
                mf0.H0 = uri;
                a33 a33 = ym.v.c().a;
                View view = mf0.a;
                view.getContext().getApplicationContext();
                boolean equals = nf0.c(a33, ((qra) ym.e()).I().g()).equals(uri);
                ImageView imageView = mf0.G0;
                if (equals) {
                    imageView.setVisibility(0);
                    imageView.setBackgroundColor(fw3.a(view.getContext(), lad.d));
                } else {
                    imageView.setVisibility(8);
                }
                ColorDrawable d = nf0.d(uri);
                SimpleDraweeView simpleDraweeView = mf0.F0;
                if (d != null) {
                    simpleDraweeView.setController((gv4) null);
                    simpleDraweeView.setBackground(d);
                    return;
                }
                ra7 d2 = ra7.d(uri);
                int i7 = mf0.D0.L;
                d2.d = i7 <= 0 ? null : new v3d(c44.DEFAULT_ASPECT_RATIO, i7, i7, 12);
                simpleDraweeView.setImageRequest(d2.a());
                simpleDraweeView.setBackground((Drawable) null);
                return;
            case 1:
                int i8 = pzc2.w;
                if (i8 == lic.chat_admin_admins || i8 == lic.channel_admin_subscribers || i8 == lic.chat_admin_participants || i8 == lic.chat_admin_blocked) {
                    nl2 nl2 = (nl2) pzc2;
                    Context context = nl2.a.getContext();
                    int i9 = lic.chat_admin_admins;
                    int i10 = nl2.G0;
                    a32 a32 = (a32) this.x;
                    ImageView imageView2 = nl2.D0;
                    TextView textView = nl2.F0;
                    TextView textView2 = nl2.E0;
                    if (i10 == i9) {
                        imageView2.setImageResource(nad.M1);
                        textView2.setText(context.getString(qad.y0));
                        textView.setText(String.valueOf(a32.b.R.size()));
                        return;
                    } else if (i10 == lic.channel_admin_subscribers) {
                        imageView2.setImageResource(nad.Y1);
                        textView2.setText(context.getString(qad.O0));
                        textView.setText(String.valueOf(a32.b.c()));
                        return;
                    } else if (i10 == lic.chat_admin_blocked) {
                        imageView2.setImageResource(nad.j1);
                        textView2.setText(context.getString(qad.P0));
                        textView.setText(String.valueOf(a32.b.G));
                        return;
                    } else {
                        textView2.setText(context.getString(qad.p1));
                        textView.setText(String.valueOf(a32.b.c()));
                        return;
                    }
                } else {
                    throw new IllegalStateException("unknown view type");
                }
            case 2:
                mk3 mk3 = (mk3) pzc2;
                List list = (List) this.v;
                ck3 ck3 = (ck3) list.get(i4);
                if (i4 >= list.size() - 1) {
                    z = false;
                }
                mk3.H0 = ck3;
                String str3 = ck3.b;
                String str4 = ck3.c;
                mk3.D0.g(str3, String.valueOf(str4.charAt(0)), (Long) null, 0, -1, -1);
                mk3.E0.setText(str4);
                String str5 = ck3.v;
                boolean A = cvg.A(str5);
                TextView textView3 = mk3.F0;
                if (!A) {
                    textView3.setText(str5);
                } else {
                    textView3.setText(ck3.o);
                }
                if (z) {
                    i5 = 0;
                }
                mk3.G0.setVisibility(i5);
                return;
            case 3:
                lu3 lu3 = (lu3) ((ArrayList) this.v).get(i4);
                vk3 vk3 = lu3.a;
                if (vk3 != null) {
                    z2 = true;
                }
                if (z2) {
                    fs3 fs3 = (fs3) pzc2;
                    fs3.H0 = null;
                    fs3.I0 = null;
                    fs3.J0 = null;
                    fs3.G0 = vk3;
                    fs3.E0.b(vk3, true);
                    return;
                }
                fo3 fo3 = lu3.b;
                if (fo3 != null) {
                    fs3 fs32 = (fs3) pzc2;
                    fs32.G0 = null;
                    fs32.H0 = null;
                    fs32.I0 = null;
                    fs32.J0 = fo3;
                    TamAvatarView tamAvatarView = fs32.E0;
                    tamAvatarView.getClass();
                    tamAvatarView.g(fo3.b(), fo3.a(), Long.valueOf(fo3.a), 0, -1, -1);
                    return;
                }
                return;
            case 4:
                y18 y18 = (y18) pzc2;
                mc2 mc2 = (mc2) ((List) this.v).get(i4);
                y18.H0 = mc2;
                y18.D0.a(mc2.a, true);
                ImageSpanEllipsizedTextView imageSpanEllipsizedTextView = y18.F0;
                a32 a322 = mc2.a;
                a322.l0();
                imageSpanEllipsizedTextView.setText(a322.X);
                ImageSpanEllipsizedTextView imageSpanEllipsizedTextView2 = y18.F0;
                a32 a323 = mc2.a;
                Context context2 = y18.a.getContext();
                Lazy lazy = scf.b0;
                n79.a(imageSpanEllipsizedTextView2, a323, j4b.k0(context2));
                long j = mc2.b.g;
                if (j == LongCompanionObject.MAX_VALUE) {
                    y18.G0.setText(y18.a.getContext().getString(qad.K3));
                    return;
                }
                EllipsizingEndTextView ellipsizingEndTextView = y18.G0;
                yva yva = (yva) y18.I0.w;
                long m = j - yva.c.m();
                if (m < 60000) {
                    p01 = new p01(0, 1, 1, false);
                    i2 = 2;
                } else {
                    if (m < 3600000) {
                        i2 = 2;
                        p012 = new p01((long) ((int) (m / 60000)), 2, 1, false);
                    } else {
                        i2 = 2;
                        p012 = new p01((long) ((int) (m / 3600000)), 3, 1, false);
                    }
                    p01 = p012;
                }
                String[] strArr = ghf.c;
                int y = tr1.y(p01.b);
                Context context3 = yva.a;
                if (y != 0) {
                    long j2 = p01.c;
                    str = y != 1 ? y != i2 ? "" : ghf.s(zjc.tt_dates_hours_left, (int) j2, context3) : ghf.s(zjc.tt_dates_minutes_left, (int) j2, context3);
                } else {
                    str = context3.getString(tmc.tt_less_minute_left);
                }
                ellipsizingEndTextView.setText(str);
                return;
            case 5:
                lxb lxb = (lxb) pzc2;
                pm3 pm3 = (pm3) this.v;
                lxb.G0 = pm3;
                int ordinal = pm3.c.ordinal();
                View view2 = lxb.a;
                if (ordinal != 1) {
                    i3 = nad.M0;
                    str2 = view2.getContext().getString(qad.Y7);
                } else {
                    i3 = nad.c1;
                    str2 = view2.getContext().getString(qad.Z7);
                }
                lxb.F0.setImageResource(i3);
                lxb.E0.setText(str2);
                TextView textView4 = lxb.D0;
                if (textView4 == null) {
                    return;
                }
                if (cvg.A(pm3.a())) {
                    textView4.setVisibility(8);
                    return;
                }
                textView4.setVisibility(0);
                textView4.setText(pm3.a());
                return;
            default:
                int i11 = pzc2.w;
                List list2 = (List) this.v;
                if (i11 == 4) {
                    ts7 ts7 = (ts7) pzc2;
                    fyd fyd = (fyd) list2.get(i4);
                    ts7.J0 = fyd;
                    ts7.I0.setText(fyd.b);
                    SwitchCompat switchCompat = ts7.F0;
                    switchCompat.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
                    switchCompat.setChecked(((Integer) ts7.J0.w).intValue() != 0);
                    switchCompat.setOnCheckedChangeListener(new zy2(3, ts7));
                    switchCompat.setEnabled(ts7.J0.z);
                    int intValue = ((Integer) ts7.J0.w).intValue();
                    if (intValue == 0) {
                        z = false;
                    }
                    ts7.H0.setVisibility(z ? 0 : 8);
                    if (z) {
                        ts7.D0.setColor(intValue);
                    }
                    boolean z3 = ts7.J0.z;
                    View view3 = ts7.a;
                    view3.setEnabled(z3);
                    view3.setAlpha(ts7.J0.z ? 1.0f : 0.5f);
                    if (ts7.J0.X) {
                        i6 = 0;
                    }
                    ts7.G0.setVisibility(i6);
                    return;
                } else if (i11 == 9) {
                    ls0 ls0 = (ls0) pzc2;
                    fyd fyd2 = (fyd) list2.get(i4);
                    ls0.E0 = fyd2;
                    boolean z4 = ls0.F0;
                    BrightnessSeekBar brightnessSeekBar = ls0.D0;
                    if (!z4) {
                        brightnessSeekBar.setProgress(((Integer) fyd2.w).intValue());
                    }
                    Object obj = fyd2.x;
                    if (obj != null) {
                        brightnessSeekBar.setBrightnessThumbProgress(((Float) obj).floatValue());
                        return;
                    }
                    return;
                } else {
                    hyd hyd = (hyd) pzc2;
                    fyd fyd3 = (fyd) list2.get(i4);
                    if (i4 != list2.size() - 1) {
                        z = false;
                    }
                    hyd.M(fyd3, z);
                    return;
                }
        }
    }

    public final pzc u(ViewGroup viewGroup, int i) {
        pzc az2;
        switch (this.o) {
            case 0:
                return new mf0(((LayoutInflater) this.x).inflate(ujc.row_background_select, viewGroup, false), (FrgAppearanceSettings) this.w);
            case 1:
                if (i == lic.chat_admin_admins || i == lic.channel_admin_subscribers || i == lic.chat_admin_participants || i == lic.chat_admin_blocked) {
                    return new nl2(LayoutInflater.from(viewGroup.getContext()).inflate(ujc.row_channel_people, viewGroup, false), (g32) this.w, i);
                }
                throw new IllegalStateException("unknown view type");
            case 2:
                return new mk3(((LayoutInflater) this.x).inflate(ujc.row_constructor, viewGroup, false), (ms1) ((zj3) this.w));
            case 3:
                return new fs3(((LayoutInflater) this.x).inflate(ujc.row_selected_contact, viewGroup, false), (mu3) this.w);
            case 4:
                return new y18(this, LayoutInflater.from(viewGroup.getContext()).inflate(ujc.row_chat_location, viewGroup, false));
            case 5:
                return new lxb(this, ((LayoutInflater) this.x).inflate(ujc.row_profile_contact_name_and_type, viewGroup, false));
            default:
                LayoutInflater layoutInflater = (LayoutInflater) this.x;
                if (i == 3) {
                    return new hyd(layoutInflater.inflate(ujc.row_setting_header, viewGroup, false), (b0e) null);
                }
                if (i == 6) {
                    return new hyd(layoutInflater.inflate(ujc.row_setting_progress, viewGroup, false), (b0e) null);
                }
                b0e b0e = (b0e) this.w;
                if (i == 4) {
                    az2 = new ts7(layoutInflater.inflate(ujc.row_setting_led, viewGroup, false), b0e);
                } else if (i == 7) {
                    az2 = new gs3(layoutInflater.inflate(ujc.row_setting_contact, viewGroup, false), b0e);
                } else if (i == 9) {
                    az2 = new ls0(layoutInflater.inflate(ujc.row_setting_brightness, viewGroup, false), b0e);
                } else if (i == 8) {
                    az2 = new az2(layoutInflater.inflate(ujc.row_setting_theme, viewGroup, false), b0e);
                } else {
                    View inflate = layoutInflater.inflate(ujc.row_setting, viewGroup, false);
                    az2 = i == 2 ? new az2((ViewGroup) inflate, layoutInflater, b0e, 0) : i == 1 ? new cgf((ViewGroup) inflate, layoutInflater, b0e) : i == 10 ? new az2((ViewGroup) inflate, layoutInflater, b0e, 1) : new hyd(inflate, b0e);
                }
                return az2;
        }
    }

    public lf0(List list, FrgAppearanceSettings frgAppearanceSettings) {
        this.o = 0;
        this.v = list;
        this.w = frgAppearanceSettings;
        this.x = LayoutInflater.from(ym.v);
    }

    public lf0(a32 a32, ArrayList arrayList, g32 g32) {
        this.o = 1;
        this.x = a32;
        this.w = g32;
        this.v = arrayList;
    }

    public lf0(Context context, pm3 pm3, FrgContactProfile frgContactProfile) {
        this.o = 5;
        this.x = LayoutInflater.from(context);
        this.v = pm3;
        this.w = frgContactProfile;
    }

    public lf0(Context context, mu3 mu3) {
        this.o = 3;
        this.v = new ArrayList();
        this.x = LayoutInflater.from(context);
        this.w = mu3;
    }

    public lf0(a32 a32, Integer num, g32 g32) {
        this.o = 1;
        this.x = a32;
        this.w = g32;
        this.v = Collections.singletonList(num);
    }

    public lf0(Context context, List list, b0e b0e) {
        this.o = 6;
        this.v = list;
        this.x = LayoutInflater.from(context);
        this.w = b0e;
    }

    public lf0(yva yva, List list) {
        this.o = 4;
        this.w = yva;
        this.v = list;
    }
}
