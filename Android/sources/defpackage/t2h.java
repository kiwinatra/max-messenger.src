package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.my.tracker.ads.AdFormat;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: t2h  reason: default package */
public final class t2h extends z4h {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t2h(s4h s4h, qdf qdf, qdf qdf2) {
        super(qdf);
        this.c = qdf2;
        this.o = s4h;
    }

    public final void a() {
        HashMap hashMap;
        Parcel obtain;
        IInterface iInterface = null;
        switch (this.b) {
            case 0:
                try {
                    s4h s4h = (s4h) this.o;
                    u2h u2h = (u2h) s4h.a.m;
                    String str = s4h.b;
                    Bundle bundle = new Bundle();
                    HashMap hashMap2 = y4h.a;
                    synchronized (y4h.class) {
                        hashMap = y4h.a;
                        hashMap.put("java", 20002);
                    }
                    bundle.putInt("playcore_version_code", ((Integer) hashMap.get("java")).intValue());
                    if (hashMap.containsKey(AdFormat.NATIVE)) {
                        bundle.putInt("playcore_native_version", ((Integer) hashMap.get(AdFormat.NATIVE)).intValue());
                    }
                    if (hashMap.containsKey("unity")) {
                        bundle.putInt("playcore_unity_version", ((Integer) hashMap.get("unity")).intValue());
                    }
                    s4h s4h2 = (s4h) this.o;
                    String str2 = s4h2.b;
                    e4h e4h = new e4h(s4h2, (qdf) this.c);
                    i0h i0h = (i0h) u2h;
                    i0h.getClass();
                    obtain = Parcel.obtain();
                    obtain.writeInterfaceToken("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
                    obtain.writeString(str);
                    int i = mzg.a;
                    obtain.writeInt(1);
                    bundle.writeToParcel(obtain, 0);
                    obtain.writeStrongBinder(e4h);
                    i0h.c.transact(2, obtain, (Parcel) null, 1);
                    obtain.recycle();
                    return;
                } catch (RemoteException e) {
                    e35 e35 = s4h.c;
                    Object[] objArr = {((s4h) this.o).b};
                    if (Log.isLoggable("PlayCore", 6)) {
                        e35.c(e35.a, "error requesting in-app review for %s", objArr);
                    } else {
                        e35.getClass();
                    }
                    ((qdf) this.c).c(new RuntimeException(e));
                    return;
                } catch (Throwable th) {
                    obtain.recycle();
                    throw th;
                }
            default:
                int i2 = k1h.d;
                IBinder iBinder = (IBinder) this.c;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
                    iInterface = queryLocalInterface instanceof u2h ? (u2h) queryLocalInterface : new i0h(iBinder);
                }
                v6h v6h = (v6h) this.o;
                h7h h7h = (h7h) v6h.b;
                h7h.m = iInterface;
                e35 e352 = h7h.b;
                e352.a("linkToDeath", new Object[0]);
                try {
                    h7h.m.asBinder().linkToDeath(h7h.j, 0);
                } catch (RemoteException unused) {
                    Object[] objArr2 = new Object[0];
                    if (Log.isLoggable("PlayCore", 6)) {
                        e35.c(e352.a, "linkToDeath failed", objArr2);
                    } else {
                        e352.getClass();
                    }
                }
                h7h h7h2 = (h7h) v6h.b;
                h7h2.g = false;
                Iterator it = h7h2.d.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                h7h2.d.clear();
                return;
        }
    }

    public t2h(v6h v6h, IBinder iBinder) {
        this.c = iBinder;
        this.o = v6h;
    }
}
