package ru.ok.messages.settings;

import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.apache.http.HttpStatus;
import ru.ok.messages.settings.locations.FrgLiveLocationSettings;
import ru.ok.messages.views.dialogs.ConfirmationDestructiveDialog;
import ru.ok.messages.views.dialogs.FrgDlgListOptionPicker;

public class FrgPrivacySettings extends FrgBaseSettings {
    public wvd E1;
    public List F1 = new ArrayList();
    public long G1;
    public long H1;
    public final hq I1 = ym.v.c().c;

    public FrgPrivacySettings() {
        ((qra) ym.e()).x();
    }

    public final void C(int i, Object obj) {
    }

    public final void E(int i, Object obj) {
        if (i == lic.setting_privacy_online) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(S1(qad.E7));
            arrayList.add(S1(qad.O7));
            FrgDlgListOptionPicker.f3(105, S1(qad.P7), arrayList).d3(this);
        } else if (i == lic.setting_privacy_close_sessions) {
            String str = ConfirmationDestructiveDialog.B1;
            q8.w((String) null, S1(qad.M7), S1(qad.m0), S1(qad.g2)).Y2(N1(), ConfirmationDestructiveDialog.B1);
            N1().g0("CONFIRMATION_DESTRUCTIVE_REQUEST_KEY", this, new ms1(21, new ata(8, new u75(15, this), new a46(18))));
        } else if (i == lic.setting_privacy_black_list) {
            if (h3() != null) {
                ActSettings actSettings = (ActSettings) h3();
                if (actSettings.Z) {
                    ed6 v = actSettings.v();
                    v.getClass();
                    xe0 xe0 = new xe0(v);
                    xe0.k(lic.act_settings__container, new FrgBlackListSettings(), "ru.ok.messages.settings.FrgBlackListSettings");
                    xe0.c("ru.ok.messages.settings.FrgBlackListSettings");
                    xe0.e(false);
                }
            }
        } else if (i == lic.setting_privacy_pin_lock) {
            if (((qra) ym.e()).x().a()) {
                p6.T(this, 3, HttpStatus.SC_PROCESSING);
            } else if (h3() != null) {
                ((ActSettings) h3()).U();
            }
        } else if (i == lic.setting_privacy_chats_invite) {
            ArrayList arrayList2 = new ArrayList(2);
            arrayList2.add(S1(qad.E7));
            arrayList2.add(S1(qad.N7));
            FrgDlgListOptionPicker.f3(104, S1(qad.F7), arrayList2).d3(this);
        } else if (i == lic.setting_privacy_incoming_call) {
            ArrayList arrayList3 = new ArrayList(2);
            arrayList3.add(S1(qad.E7));
            arrayList3.add(S1(qad.N7));
            FrgDlgListOptionPicker.f3(103, S1(qad.K7), arrayList3).d3(this);
        } else if (i == lic.setting_privacy_live_location && h3() != null) {
            ActSettings actSettings2 = (ActSettings) h3();
            if (actSettings2.Z) {
                ed6 v2 = actSettings2.v();
                v2.getClass();
                xe0 xe02 = new xe0(v2);
                xe02.k(lic.act_settings__container, new FrgLiveLocationSettings(), "ru.ok.messages.settings.locations.FrgLiveLocationSettings");
                xe02.c("ru.ok.messages.settings.locations.FrgLiveLocationSettings");
                xe02.e(false);
            }
        }
    }

    public final String V2() {
        return "SETTINGS_PRIVACY";
    }

    public final void b3(int i, int i2, Intent intent) {
        if (i2 == -1 && i == 102 && h3() != null) {
            ((ActSettings) h3()).U();
        }
    }

    public final void e3(int i, String[] strArr, int[] iArr) {
        k3();
    }

    public final void i2(Bundle bundle) {
        super.i2(bundle);
        if (bundle != null) {
            this.E1 = (wvd) bundle.getSerializable("ru.ok.tamtam.extra.CURRENT_SESSION");
            this.F1 = (List) bundle.getSerializable("ru.ok.tamtam.extra.OTHER_SESSIONS");
            this.G1 = bundle.getLong("ru.ok.tamtam.extra.SESSION_CLOSE_REQUEST_ID");
            this.H1 = bundle.getLong("ru.ok.tamtam.extra.SESSIONS_INFO_REQUEST_ID");
        }
    }

    public final ArrayList i3() {
        ArrayList arrayList = new ArrayList();
        int i = lic.setting_privacy_online;
        String S1 = S1(qad.P7);
        hq hqVar = this.I1;
        arrayList.add(fyd.c(i, S1, S1(hqVar.g.getBoolean("app.privacy.online.show", true) ? qad.E7 : qad.O7)));
        int i2 = lic.setting_privacy_incoming_call;
        String S12 = S1(qad.K7);
        ls7 ls7 = hqVar.g;
        arrayList.add(fyd.c(i2, S12, n3(ls7.getString("app.privacy.incoming.call", "ALL"))));
        arrayList.add(fyd.c(lic.setting_privacy_chats_invite, S1(qad.D7), n3(ls7.getString("app.privacy.chats.invite", "ALL"))));
        fyd c = fyd.c(lic.setting_privacy_black_list, S1(qad.I7), S1(qad.J7));
        c.X = true;
        arrayList.add(c);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(fyd.b(S1(qad.T7)));
        wvd wvd = this.E1;
        if (wvd == null) {
            arrayList2.add(new fyd(0, (CharSequence) null, (String) null, (String) null, (Object) null, 6));
        } else {
            arrayList2.add(l3(wvd));
            if (!this.F1.isEmpty()) {
                for (wvd l3 : this.F1) {
                    arrayList2.add(l3(l3));
                }
                fyd c2 = fyd.c(lic.setting_privacy_close_sessions, S1(qad.L7), (String) null);
                c2.Y = this.r1.z;
                arrayList2.add(c2);
            }
        }
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    public final String j3() {
        return S1(qad.u7);
    }

    public final fyd l3(wvd wvd) {
        String str;
        String r;
        StringBuilder sb = new StringBuilder();
        sb.append(wvd.b);
        boolean z = wvd.v;
        if (z) {
            str = " (" + S1(qad.C7) + ")";
        } else {
            str = "";
        }
        sb.append(str);
        String sb2 = sb.toString();
        ym ymVar = ym.v;
        if (z) {
            r = null;
        } else {
            r = j4b.r(ymVar, ymVar.c().a.u(), wvd.a, ymVar.c().a.m(), false);
        }
        fyd fyd = new fyd(0, sb2, wvd.c, wvd.o, r, 10);
        fyd.z = false;
        fyd.Z = true;
        return fyd;
    }

    public final int m3(String str) {
        if (S1(qad.O7).equals(str)) {
            return 2;
        }
        return (!S1(qad.E7).equals(str) && S1(qad.N7).equals(str)) ? 3 : 1;
    }

    public final String n3(String str) {
        return "ALL".equals(str) ? S1(qad.E7) : "CONTACTS".equals(str) ? S1(qad.N7) : "_NONE_".equals(str) ? S1(qad.O7) : S1(qad.E7);
    }

    @oye
    public void onEvent(sh3 sh3) {
        z68.c("ru.ok.messages.settings.FrgPrivacySettings", "onEvent, connectionState", new Object[0]);
        if (!this.o1) {
            T0(sh3);
        } else if (sh3.b == 3 && this.H1 == 0) {
            this.H1 = ((jna) ((qra) ym.e()).e()).V();
        }
    }

    public final void w2() {
        super.w2();
        z5a w = ((qra) ((id3) this.p1.b)).w();
        jgd jgd = jgd.SETTINGS_PRIVACY;
        h8b h8b = h8b.e;
        w.f(jgd, h8b.e);
    }

    public final void x2(Bundle bundle) {
        super.x2(bundle);
        bundle.putSerializable("ru.ok.tamtam.extra.CURRENT_SESSION", this.E1);
        bundle.putSerializable("ru.ok.tamtam.extra.OTHER_SESSIONS", (ArrayList) this.F1);
        bundle.putLong("ru.ok.tamtam.extra.SESSION_CLOSE_REQUEST_ID", this.G1);
        bundle.putLong("ru.ok.tamtam.extra.SESSIONS_INFO_REQUEST_ID", this.H1);
    }

    public final void y2() {
        super.y2();
        if (this.H1 == 0) {
            this.H1 = ((jna) ((qra) ym.e()).e()).V();
        }
    }

    @oye
    public void onEvent(vxd vxd) {
        if (vxd.a != this.H1) {
            return;
        }
        if (this.o1) {
            this.H1 = 0;
            List list = vxd.b;
            this.F1 = list;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                wvd wvd = (wvd) it.next();
                if (wvd.v) {
                    this.E1 = wvd;
                    break;
                }
            }
            this.F1.remove(this.E1);
            Collections.sort(this.F1, new oj4(6));
            k3();
            return;
        }
        ryg.S(this.s1, vxd, true);
    }

    @oye
    public void onEvent(oe3 oe3) {
        if (this.o1) {
            k3();
        } else {
            T0(oe3);
        }
    }

    @oye
    public void onEvent(txd txd) {
        if (txd.a != this.G1) {
            return;
        }
        if (this.o1) {
            a3();
            this.F1.clear();
            k3();
            hi7.b0(0, O1(), S1(qad.R7));
            return;
        }
        ryg.S(this.s1, txd, true);
    }

    @oye
    public void onEvent(hj0 hj0) {
        long j = hj0.a;
        if (j == this.G1) {
            if (this.o1) {
                a3();
                hi7.b0(0, O1(), S1(qad.C1));
                return;
            }
            ryg.S(this.s1, hj0, true);
        } else if (j == this.H1) {
            this.H1 = 0;
        }
    }
}
