package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.LinkedList;
import org.webrtc.PeerConnection;

/* renamed from: gw1  reason: default package */
public abstract class gw1 implements Runnable {
    public final /* synthetic */ int a;
    public final Object b;

    public gw1(fbb fbb) {
        this.a = 1;
        this.b = fbb;
    }

    public static void b(dpg dpg, String str) {
        mqg mqg;
        boolean z;
        WorkDatabase workDatabase = dpg.c;
        ypg y = workDatabase.y();
        dm4 t = workDatabase.t();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            xog j = y.j(str2);
            if (!(j == xog.c || j == xog.o)) {
                y.r(xog.w, str2);
            }
            linkedList.addAll(t.m(str2));
        }
        rvb rvb = dpg.f;
        synchronized (rvb.Z) {
            try {
                h88 x = h88.x();
                String str3 = rvb.v0;
                x.p(str3, "Processor cancelling " + str);
                rvb.X.add(str);
                mqg = (mqg) rvb.w.remove(str);
                z = mqg != null;
                if (mqg == null) {
                    mqg = (mqg) rvb.x.remove(str);
                }
                if (mqg != null) {
                    rvb.y.remove(str);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        rvb.c(str, mqg);
        if (z) {
            rvb.i();
        }
        for (mfd d : dpg.e) {
            d.d(str);
        }
    }

    public abstract void a(PeerConnection peerConnection);

    public abstract void c();

    public final void run() {
        switch (this.a) {
            case 0:
                ata ata = (ata) this.b;
                try {
                    c();
                    ata.z(u4b.U);
                    return;
                } catch (Throwable th) {
                    ata.z(new r4b(th));
                    return;
                }
            default:
                PeerConnection G = ((fbb) this.b).G();
                if (G != null) {
                    a(G);
                    return;
                }
                return;
        }
    }

    public gw1() {
        this.a = 0;
        this.b = new ata(19);
    }
}
