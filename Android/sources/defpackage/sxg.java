package defpackage;

import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.maps.GoogleMapOptions;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: sxg  reason: default package */
public final class sxg extends f0 {
    public final ViewGroup v;
    public final Context w;
    public p3a x;
    public final GoogleMapOptions y;
    public final ArrayList z = new ArrayList();

    public sxg(ViewGroup viewGroup, Context context, GoogleMapOptions googleMapOptions) {
        super(1);
        this.v = viewGroup;
        this.w = context;
        this.y = googleMapOptions;
    }

    public final void c(p3a p3a) {
        this.x = p3a;
        if (p3a != null && ((wu7) this.a) == null) {
            try {
                Context context = this.w;
                int i = te8.h;
                synchronized (te8.class) {
                    te8.q(context);
                }
                t5h L0 = kv0.c0(context).L0(new hha(context), this.y);
                if (L0 != null) {
                    this.x.v(new qxg(this.v, L0));
                    ArrayList arrayList = this.z;
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((qxg) ((wu7) this.a)).a((ee8) it.next());
                    }
                    arrayList.clear();
                }
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            } catch (GooglePlayServicesNotAvailableException unused) {
            }
        }
    }
}
