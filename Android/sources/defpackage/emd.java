package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: emd  reason: default package */
public final class emd extends z {
    public static final Parcelable.Creator<emd> CREATOR = new y(9);
    public boolean c;

    public emd(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.c = ((Boolean) parcel.readValue((ClassLoader) null)).booleanValue();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchView.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" isIconified=");
        return tr1.m(sb, this.c, "}");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeValue(Boolean.valueOf(this.c));
    }
}
