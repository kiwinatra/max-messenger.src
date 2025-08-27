package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;

public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(r2g r2g) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        Object obj = remoteActionCompat.a;
        boolean z = true;
        if (r2g.e(1)) {
            obj = r2g.h();
        }
        remoteActionCompat.a = (IconCompat) obj;
        CharSequence charSequence = remoteActionCompat.b;
        if (r2g.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((s2g) r2g).e);
        }
        remoteActionCompat.b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.c;
        if (r2g.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((s2g) r2g).e);
        }
        remoteActionCompat.c = charSequence2;
        remoteActionCompat.d = (PendingIntent) r2g.g(remoteActionCompat.d, 4);
        boolean z2 = remoteActionCompat.e;
        if (r2g.e(5)) {
            z2 = ((s2g) r2g).e.readInt() != 0;
        }
        remoteActionCompat.e = z2;
        boolean z3 = remoteActionCompat.f;
        if (r2g.e(6)) {
            if (((s2g) r2g).e.readInt() == 0) {
                z = false;
            }
            z3 = z;
        }
        remoteActionCompat.f = z3;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, r2g r2g) {
        r2g.getClass();
        IconCompat iconCompat = remoteActionCompat.a;
        r2g.i(1);
        r2g.l(iconCompat);
        CharSequence charSequence = remoteActionCompat.b;
        r2g.i(2);
        Parcel parcel = ((s2g) r2g).e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.c;
        r2g.i(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        r2g.k(remoteActionCompat.d, 4);
        boolean z = remoteActionCompat.e;
        r2g.i(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.f;
        r2g.i(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
