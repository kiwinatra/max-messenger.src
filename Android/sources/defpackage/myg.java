package defpackage;

import android.app.Activity;
import android.os.RemoteException;
import androidx.fragment.app.a;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: myg  reason: default package */
public final class myg extends f0 {
    public final a v;
    public p3a w;
    public Activity x;
    public final ArrayList y = new ArrayList();

    public myg(a aVar) {
        super(1);
        this.v = aVar;
    }

    public final void P() {
        Activity activity = this.x;
        if (activity != null && this.w != null && ((wu7) this.a) == null) {
            try {
                int i = te8.h;
                synchronized (te8.class) {
                    te8.q(activity);
                }
                l5h K0 = kv0.c0(this.x).K0(new hha(this.x));
                if (K0 != null) {
                    this.w.v(new lyg(this.v, K0));
                    ArrayList arrayList = this.y;
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((lyg) ((wu7) this.a)).a((ee8) it.next());
                    }
                    arrayList.clear();
                }
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            } catch (GooglePlayServicesNotAvailableException unused) {
            }
        }
    }

    public final void c(p3a p3a) {
        this.w = p3a;
        P();
    }
}
