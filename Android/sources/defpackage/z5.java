package defpackage;

import android.os.Handler;
import androidx.viewpager.widget.ViewPager;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Iterator;
import ru.ok.messages.contacts.profile.ActContactAvatars;
import ru.ok.messages.contacts.profile.FrgContactAvatarsLoader;

/* renamed from: z5  reason: default package */
public final /* synthetic */ class z5 implements x6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ActContactAvatars b;
    public final /* synthetic */ long c;

    public /* synthetic */ z5(ActContactAvatars actContactAvatars, long j, int i) {
        this.a = i;
        this.b = actContactAvatars;
        this.c = j;
    }

    public final void run() {
        long j = this.c;
        int i = 0;
        ActContactAvatars actContactAvatars = this.b;
        switch (this.a) {
            case 0:
                int i2 = ActContactAvatars.L0;
                ((qra) ((id3) actContactAvatars.x.b)).m().f((String) null, 0, (String) null, (String) null);
                long S = ((jna) ((qra) ((id3) actContactAvatars.x.b)).e()).S(j);
                if (actContactAvatars.C0 == null) {
                    actContactAvatars.C0 = new i04();
                }
                actContactAvatars.C0.add(Long.valueOf(S));
                return;
            case 1:
                int i3 = ActContactAvatars.L0;
                actContactAvatars.getClass();
                int i4 = qad.q7;
                Handler handler = hi7.j;
                hi7.b0(0, actContactAvatars, actContactAvatars.getString(i4));
                int currentItem = actContactAvatars.z0.getCurrentItem();
                FrgContactAvatarsLoader frgContactAvatarsLoader = actContactAvatars.B0;
                Iterator it = frgContactAvatarsLoader.D1.iterator();
                int i5 = 0;
                while (it.hasNext()) {
                    if (((Long) ((AbstractMap.SimpleEntry) it.next()).getValue()).equals(Long.valueOf(j))) {
                        it.remove();
                        int i6 = frgContactAvatarsLoader.G1 - 1;
                        if (i5 == i6) {
                            frgContactAvatarsLoader.G1 = i6;
                            if (i6 <= 0) {
                                i6 = 0;
                            }
                            frgContactAvatarsLoader.G1 = i6;
                        } else {
                            int i7 = frgContactAvatarsLoader.F1 - 1;
                            frgContactAvatarsLoader.F1 = i7;
                            if (i7 <= 0) {
                                i7 = 0;
                            }
                            frgContactAvatarsLoader.F1 = i7;
                        }
                    }
                    i5++;
                }
                if (actContactAvatars.B0.D1.isEmpty()) {
                    actContactAvatars.finish();
                    return;
                }
                int i8 = currentItem - 1;
                if (currentItem > 0 && actContactAvatars.G0 == currentItem) {
                    actContactAvatars.G0 = i8;
                    actContactAvatars.A0.k = i8;
                }
                FrgContactAvatarsLoader frgContactAvatarsLoader2 = actContactAvatars.B0;
                actContactAvatars.W(frgContactAvatarsLoader2.F1 + frgContactAvatarsLoader2.G1, frgContactAvatarsLoader2.D1);
                if (currentItem > 0) {
                    ViewPager viewPager = actContactAvatars.z0;
                    viewPager.H0 = false;
                    viewPager.v(i8, 0, false, false);
                    return;
                }
                return;
            default:
                int i9 = ActContactAvatars.L0;
                actContactAvatars.getClass();
                int i10 = qad.i7;
                Handler handler2 = hi7.j;
                hi7.b0(0, actContactAvatars, actContactAvatars.getString(i10));
                long j2 = this.c;
                if (j2 != 0) {
                    if (actContactAvatars.D0 == null) {
                        actContactAvatars.D0 = new ArrayList();
                    }
                    actContactAvatars.D0.add(Long.valueOf(((jna) ((qra) ((id3) actContactAvatars.x.b)).e()).P((String) null, (String) null, (String) null, (a20) null, (String) null, (String) null, j2, he0.USER_AVATAR)));
                }
                while (true) {
                    ArrayList arrayList = actContactAvatars.E0;
                    if (i >= arrayList.size()) {
                        return;
                    }
                    if (((Long) ((AbstractMap.SimpleEntry) arrayList.get(i)).getValue()).equals(Long.valueOf(j2))) {
                        actContactAvatars.G0 = i;
                        actContactAvatars.A0.k = i;
                        FrgContactAvatarsLoader frgContactAvatarsLoader3 = actContactAvatars.B0;
                        actContactAvatars.W(frgContactAvatarsLoader3.F1 + frgContactAvatarsLoader3.G1, frgContactAvatarsLoader3.D1);
                        return;
                    }
                    i++;
                }
        }
    }
}
