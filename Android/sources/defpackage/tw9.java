package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import java.util.HashSet;

/* renamed from: tw9  reason: default package */
public final class tw9 extends rsb {
    public static final Parcelable.Creator<tw9> CREATOR = new ia9(14);
    public HashSet a;

    public tw9(AbsSavedState absSavedState) {
        super(absSavedState);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a.size());
        HashSet hashSet = this.a;
        parcel.writeStringArray((String[]) hashSet.toArray(new String[hashSet.size()]));
    }
}
