package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import java.util.Set;

/* renamed from: zwg  reason: default package */
public final class zwg extends hvg {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ Object e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zwg(lc5 lc5) {
        super("com.google.android.gms.maps.internal.IOnMarkerClickListener", 1);
        this.e = lc5;
    }

    public final boolean I0(int i, Parcel parcel, Parcel parcel2) {
        Object obj = null;
        Object obj2 = this.e;
        int i2 = 0;
        switch (this.d) {
            case 0:
                if (i != 1) {
                    return false;
                }
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    obj = queryLocalInterface instanceof uxg ? (uxg) queryLocalInterface : new bvg(readStrongBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate", 3);
                }
                hzg.a(parcel);
                vzg.m(obj);
                qj0 qj0 = (qj0) ((lc5) obj2).b;
                vd8 vd8 = qj0.a;
                vd8.getClass();
                try {
                    oxg oxg = (oxg) obj;
                    Parcel R = oxg.R(oxg.H0(), 30);
                    p67 L0 = hha.L0(R.readStrongBinder());
                    R.recycle();
                    Object M0 = hha.M0(L0);
                    if (M0 instanceof Long) {
                        Long l = (Long) M0;
                        l.getClass();
                        sj0 sj0 = (sj0) vd8.a.get(l);
                        f3a f3a = qj0.b;
                        if (sj0 != null) {
                            pf8 pf8 = sj0.b;
                            f3a.getClass();
                            f3a.N(new ak0(pf8, 0));
                        } else {
                            sj0 sj02 = (sj0) vd8.b.get(l);
                            if (sj02 != null) {
                                pf8 pf82 = sj02.b;
                                f3a.getClass();
                                f3a.N(new ak0(pf82, 1));
                            }
                        }
                        i2 = 1;
                    }
                    parcel2.writeNoException();
                    parcel2.writeInt(i2);
                    return true;
                } catch (RemoteException e2) {
                    throw new RuntimeException(e2);
                }
            case 1:
                if (i != 1) {
                    return false;
                }
                ((q58) ((ud8) ((d9d) ((td8) obj2).b).b)).a();
                parcel2.writeNoException();
                return true;
            default:
                if (i != 1) {
                    return false;
                }
                Parcelable.Creator<LatLng> creator = LatLng.CREATOR;
                int i3 = hzg.a;
                if (parcel.readInt() != 0) {
                    obj = creator.createFromParcel(parcel);
                }
                hzg.a(parcel);
                td8 td8 = (td8) obj2;
                td8.getClass();
                double d2 = ((LatLng) obj).a;
                qj0 qj02 = (qj0) td8.b;
                qj02.a.getClass();
                f3a f3a2 = qj02.b;
                f3a2.getClass();
                for (g1a g1a : (Set) f3a2.a) {
                    g1a.getClass();
                }
                parcel2.writeNoException();
                return true;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zwg(td8 td8) {
        super("com.google.android.gms.maps.internal.IOnMapClickListener", 1);
        this.e = td8;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zwg(td8 td8, byte b) {
        super("com.google.android.gms.maps.internal.IOnMapLoadedCallback", 1);
        this.e = td8;
    }
}
