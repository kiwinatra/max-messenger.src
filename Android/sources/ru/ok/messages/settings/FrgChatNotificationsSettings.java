package ru.ok.messages.settings;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import ru.ok.messages.views.dialogs.FrgDlgDisableNotifs;

public class FrgChatNotificationsSettings extends FrgBaseSettings implements gh6 {
    public long E1;

    public final void C(int i, Object obj) {
        if (i == lic.setting_chat_notification_mute) {
            a32 G = this.q1.g().G(this.E1);
            if (G != null) {
                boolean X = G.X(ym.v.c().a);
                long j = G.a;
                if (X) {
                    this.q1.g().q0(j);
                    k3();
                } else if (this.o1) {
                    FrgDlgDisableNotifs.f3(j).d3(this);
                }
            }
        } else if (i == lic.setting_chat_notification_sound) {
            r62 g = this.q1.g();
            long j2 = this.E1;
            Boolean bool = (Boolean) obj;
            boolean booleanValue = bool.booleanValue();
            a32 G2 = g.G(j2);
            if (G2 != null) {
                a72 a72 = a72.a;
                long j3 = G2.a;
                z68.c("r62", "changeChatOption, chatId = %d, option = %s, value = %s", Long.valueOf(j3), a72, bool);
                g.i(j3, false, new h62(booleanValue, a72));
                g.p(G2);
            }
        } else if (i == lic.setting_chat_notification_vibrate) {
            r62 g2 = this.q1.g();
            long j4 = this.E1;
            Boolean bool2 = (Boolean) obj;
            boolean booleanValue2 = bool2.booleanValue();
            a32 G3 = g2.G(j4);
            if (G3 != null) {
                a72 a722 = a72.b;
                long j5 = G3.a;
                z68.c("r62", "changeChatOption, chatId = %d, option = %s, value = %s", Long.valueOf(j5), a722, bool2);
                g2.i(j5, false, new h62(booleanValue2, a722));
                g2.p(G3);
            }
        }
    }

    public final void E(int i, Object obj) {
    }

    public final void O(long j, long j2) {
        this.q1.g().Y(j, j2);
    }

    public final String V2() {
        return "SETTINGS_NOTIFICATIONS";
    }

    public final ArrayList i3() {
        a32 G = this.q1.g().G(this.E1);
        ArrayList arrayList = new ArrayList();
        if (G != null) {
            boolean X = G.X(ym.v.c().a);
            m72 m72 = G.b;
            long j = m72.a().a;
            boolean contains = m72.a().b.contains(a72.b);
            int i = lic.setting_chat_notification_mute;
            String S1 = X ? S1(qad.a6) : S1(qad.P5);
            boolean z = !X;
            fyd a = fyd.a(S1, i, "", z);
            if (j > 0) {
                a.v = j4b.u(O1(), ((qra) ((id3) this.p1.b)).y().a.m(), j);
            }
            arrayList.add(a);
            fyd a2 = fyd.a(S1(qad.i6), lic.setting_chat_notification_sound, "", m72.a().b.contains(a72.a));
            a2.z = z;
            arrayList.add(a2);
            fyd a3 = fyd.a(S1(qad.j6), lic.setting_chat_notification_vibrate, "", contains);
            a3.z = z;
            arrayList.add(a3);
        }
        return arrayList;
    }

    public final String j3() {
        return S1(qad.U5);
    }

    public final View k2(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.E1 = this.x.getLong("ru.ok.tamtam.extra.CHAT_ID");
        return super.k2(layoutInflater, viewGroup, bundle);
    }

    @oye
    public void onEvent(xy2 xy2) {
        if (this.o1) {
            Collection collection = xy2.b;
            if (collection == null || !collection.contains(Long.valueOf(this.E1))) {
                ryg.S(this.s1, xy2, true);
            } else {
                k3();
            }
        }
    }
}
