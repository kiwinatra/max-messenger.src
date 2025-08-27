package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: sbg  reason: default package */
public final class sbg extends z {
    public static final Parcelable.Creator<sbg> CREATOR = new y(13);
    public int c;
    public Parcelable o;
    public final ClassLoader v;

    public sbg(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        classLoader = classLoader == null ? sbg.class.getClassLoader() : classLoader;
        this.c = parcel.readInt();
        this.o = parcel.readParcelable(classLoader);
        this.v = classLoader;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentPager.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" position=");
        return wj6.l(sb, this.c, "}");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.c);
        parcel.writeParcelable(this.o, i);
    }
}
