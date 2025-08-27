package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.a;

/* renamed from: jzc  reason: default package */
public final class jzc extends z {
    public static final Parcelable.Creator<jzc> CREATOR = new y(8);
    public Parcelable c;

    public jzc(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.c = parcel.readParcelable(classLoader == null ? a.class.getClassLoader() : classLoader);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.c, 0);
    }
}
