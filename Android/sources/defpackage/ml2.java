package defpackage;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.a;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: ml2  reason: default package */
public final /* synthetic */ class ml2 implements x6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ml2(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                g32 g32 = (g32) this.c;
                if (g32 != null) {
                    int i = lic.chat_admin_admins;
                    int i2 = this.b;
                    if (i2 == i) {
                        g32.w1();
                    }
                    if (i2 == lic.channel_admin_subscribers || i2 == lic.chat_admin_participants) {
                        g32.A();
                    }
                    if (i2 == lic.chat_admin_blocked) {
                        g32.F1();
                        return;
                    }
                    return;
                }
                return;
            default:
                r25 r25 = (r25) this.c;
                ArrayList arrayList = r25.N0;
                if (arrayList != null) {
                    Locale locale = Locale.ENGLISH;
                    int G = r25.M0.G((tyc) arrayList.get(this.b));
                    a layoutManager = r25.J0.getLayoutManager();
                    if (layoutManager instanceof GridLayoutManager) {
                        ((GridLayoutManager) layoutManager).m1(G, 0);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
