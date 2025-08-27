package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.room.MultiInstanceInvalidationService;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: pw9  reason: default package */
public final class pw9 extends Binder implements n67 {
    public final /* synthetic */ MultiInstanceInvalidationService c;

    public pw9(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.c = multiInstanceInvalidationService;
        attachInterface(this, n67.b);
    }

    public final int R(m67 m67, String str) {
        int i = 0;
        if (str == null) {
            return 0;
        }
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.c;
        synchronized (multiInstanceInvalidationService.c) {
            try {
                int i2 = multiInstanceInvalidationService.a + 1;
                multiInstanceInvalidationService.a = i2;
                if (multiInstanceInvalidationService.c.register(m67, Integer.valueOf(i2))) {
                    multiInstanceInvalidationService.b.put(Integer.valueOf(i2), str);
                    i = i2;
                } else {
                    multiInstanceInvalidationService.a--;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }

    public final IBinder asBinder() {
        return this;
    }

    public final void g0(m67 m67, int i) {
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.c;
        synchronized (multiInstanceInvalidationService.c) {
            multiInstanceInvalidationService.c.unregister(m67);
            String str = (String) multiInstanceInvalidationService.b.remove(Integer.valueOf(i));
        }
    }

    public final void l(int i, String[] strArr) {
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.c;
        synchronized (multiInstanceInvalidationService.c) {
            try {
                String str = (String) multiInstanceInvalidationService.b.get(Integer.valueOf(i));
                if (str != null) {
                    int beginBroadcast = multiInstanceInvalidationService.c.beginBroadcast();
                    for (int i2 = 0; i2 < beginBroadcast; i2++) {
                        Integer num = (Integer) multiInstanceInvalidationService.c.getBroadcastCookie(i2);
                        int intValue = num.intValue();
                        String str2 = (String) multiInstanceInvalidationService.b.get(num);
                        if (i != intValue && Intrinsics.areEqual((Object) str, (Object) str2)) {
                            try {
                                ((m67) multiInstanceInvalidationService.c.getBroadcastItem(i2)).m(strArr);
                            } catch (RemoteException unused) {
                            }
                        }
                    }
                    multiInstanceInvalidationService.c.finishBroadcast();
                    Unit unit = Unit.INSTANCE;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, l67] */
    /* JADX WARNING: type inference failed for: r0v8, types: [java.lang.Object, l67] */
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = n67.b;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        m67 m67 = null;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                Object queryLocalInterface = readStrongBinder.queryLocalInterface(m67.a);
                if (queryLocalInterface == null || !(queryLocalInterface instanceof m67)) {
                    ? obj = new Object();
                    obj.c = readStrongBinder;
                    m67 = obj;
                } else {
                    m67 = (m67) queryLocalInterface;
                }
            }
            int R = R(m67, parcel.readString());
            parcel2.writeNoException();
            parcel2.writeInt(R);
        } else if (i == 2) {
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                Object queryLocalInterface2 = readStrongBinder2.queryLocalInterface(m67.a);
                if (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof m67)) {
                    ? obj2 = new Object();
                    obj2.c = readStrongBinder2;
                    m67 = obj2;
                } else {
                    m67 = (m67) queryLocalInterface2;
                }
            }
            g0(m67, parcel.readInt());
            parcel2.writeNoException();
        } else if (i != 3) {
            return super.onTransact(i, parcel, parcel2, i2);
        } else {
            l(parcel.readInt(), parcel.createStringArray());
        }
        return true;
    }
}
