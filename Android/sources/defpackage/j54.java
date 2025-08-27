package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: j54  reason: default package */
public final class j54 extends z {
    public static final Parcelable.ClassLoaderCreator<j54> CREATOR = new y(4);
    public final Bundle c;

    public j54(Parcelable parcelable) {
        super(parcelable);
        this.c = new Bundle();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeBundle(this.c);
    }

    public j54(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.c = parcel.readBundle(classLoader == null ? j54.class.getClassLoader() : classLoader);
    }
}
