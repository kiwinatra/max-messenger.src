package defpackage;

import android.net.Uri;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import kotlin.ranges.RangesKt;
import ru.ok.messages.media.mediabar.ActLocalMedias;

/* renamed from: u0a  reason: default package */
public final /* synthetic */ class u0a implements qk3, ice {
    public final /* synthetic */ int a;
    public final /* synthetic */ z0a b;

    public /* synthetic */ u0a(z0a z0a, int i) {
        this.a = i;
        this.b = z0a;
    }

    public void accept(Object obj) {
        qac qac;
        z0a z0a = this.b;
        switch (this.a) {
            case 0:
                Throwable th = (Throwable) obj;
                z0a.getClass();
                int i = qad.t1;
                ActLocalMedias actLocalMedias = (ActLocalMedias) z0a.b;
                actLocalMedias.getClass();
                Handler handler = hi7.j;
                hi7.b0(0, actLocalMedias, actLocalMedias.getString(i));
                return;
            case 2:
                Throwable th2 = (Throwable) obj;
                z0a.getClass();
                int i2 = qad.t1;
                ActLocalMedias actLocalMedias2 = (ActLocalMedias) z0a.b;
                actLocalMedias2.getClass();
                Handler handler2 = hi7.j;
                hi7.b0(0, actLocalMedias2, actLocalMedias2.getString(i2));
                return;
            case 3:
                z0a.getClass();
                z68.h("z0a", (Throwable) obj, "startCrop error", new Object[0]);
                int i3 = qad.t1;
                ActLocalMedias actLocalMedias3 = (ActLocalMedias) z0a.b;
                actLocalMedias3.getClass();
                Handler handler3 = hi7.j;
                hi7.b0(0, actLocalMedias3, actLocalMedias3.getString(i3));
                return;
            default:
                y0a y0a = (y0a) obj;
                z0a.getClass();
                z68.a("z0a", "initVideoLocalMediasResult doOnSuccess");
                z0a.w = y0a.c;
                long j = y0a.a;
                z0a.x = j;
                z0a.y = y0a.b;
                if (j == 0) {
                    z68.a("z0a", "videoDuration == 0 -> hide controls");
                    z0a.c0(new es1(11));
                } else if (y0a.d) {
                    z68.a("z0a", "showQualityButton == true");
                    z0a.c0(new x0a(z0a, y0a, 0));
                } else {
                    z68.a("z0a", "showQualityButton == false");
                    if (z0a.w.isEmpty()) {
                        z68.a("z0a", "allowedQualities is empty -> set default 480p");
                        qac = qac.P_480;
                    } else {
                        qac = z0a.y.a;
                    }
                    z0a.c0(new x0a(z0a, qac, 1));
                }
                s0a s0a = z0a.b;
                if (s0a != null) {
                    ((ActLocalMedias) s0a).b0(!z0a.y.d, false);
                    return;
                }
                return;
        }
    }

    public void h(pbe pbe) {
        p4g p4g;
        z0a z0a = this.b;
        String a2 = z0a.o.a();
        ActLocalMedias actLocalMedias = (ActLocalMedias) z0a.b;
        actLocalMedias.getClass();
        iq5 C = o5a.C(actLocalMedias, Uri.parse(a2));
        Collections.emptyList();
        if (C.c != 0 && !pbe.f()) {
            i20 i20 = new i20(1);
            Object obj = null;
            i20.a = null;
            i20.b = c44.DEFAULT_ASPECT_RATIO;
            i20.c = 1.0f;
            i20.d = false;
            p4g p4g2 = new p4g(i20);
            uqd i = z0a.Y.i(z0a.o);
            if (!(i == null || i.b == null)) {
                i20 i202 = new i20(1);
                p4g p4g3 = i.b;
                i202.a = p4g3.a;
                i202.b = p4g3.b;
                i202.c = p4g3.c;
                i202.d = p4g3.d;
                p4g2 = new p4g(i202);
            }
            if (!pbe.f()) {
                ArrayList a3 = sac.a(Uri.parse(z0a.o.a()), actLocalMedias, (wj0) ((qra) ((id3) actLocalMedias.x.b)).getAccessor().g(wj0.class));
                if (a3 == null) {
                    a3 = new ArrayList();
                } else {
                    Collections.sort(a3, rac.g);
                }
                ArrayList arrayList = a3;
                boolean z = arrayList.size() > 1;
                if (arrayList.size() > 0 && p4g2.a == null) {
                    Iterator it = arrayList.iterator();
                    if (it.hasNext()) {
                        obj = it.next();
                        if (it.hasNext()) {
                            qac qac = ((rac) obj).a;
                            do {
                                Object next = it.next();
                                qac qac2 = ((rac) next).a;
                                if (qac.compareTo(qac2) > 0) {
                                    obj = next;
                                    qac = qac2;
                                }
                            } while (it.hasNext());
                        }
                    }
                    rac rac = (rac) obj;
                    y3g y3g = z0a.v;
                    qac qac3 = rac == null ? y3g.a : (qac) RangesKt.coerceAtLeast(rac.a, y3g.a);
                    i20 a4 = p4g2.a();
                    a4.a = qac3;
                    p4g2 = new p4g(a4);
                }
                if (!C.b) {
                    i20 a5 = p4g2.a();
                    a5.d = true;
                    p4g = new p4g(a5);
                } else {
                    p4g = p4g2;
                }
                pbe.a(new y0a(C.c, p4g, arrayList, z, C.b));
            }
        }
    }
}
