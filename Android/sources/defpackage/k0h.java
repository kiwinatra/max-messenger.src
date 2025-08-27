package defpackage;

import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: k0h  reason: default package */
public final class k0h implements Parcelable {
    public static final Parcelable.Creator<k0h> CREATOR = new ivg(26);
    public final Messenger a;

    public k0h(IBinder iBinder) {
        this.a = new Messenger(iBinder);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            Messenger messenger = this.a;
            messenger.getClass();
            IBinder binder = messenger.getBinder();
            Messenger messenger2 = ((k0h) obj).a;
            messenger2.getClass();
            return binder.equals(messenger2.getBinder());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        Messenger messenger = this.a;
        messenger.getClass();
        return messenger.getBinder().hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Messenger messenger = this.a;
        messenger.getClass();
        parcel.writeStrongBinder(messenger.getBinder());
    }
}
