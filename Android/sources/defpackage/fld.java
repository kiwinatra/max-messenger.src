package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;

/* renamed from: fld  reason: default package */
public final class fld implements Parcelable {
    public static final Parcelable.Creator<fld> CREATOR = new g9d(4);
    public final ForegroundColorSpan a;
    public final BackgroundColorSpan b;

    public fld(ForegroundColorSpan foregroundColorSpan, BackgroundColorSpan backgroundColorSpan) {
        this.a = foregroundColorSpan;
        this.b = backgroundColorSpan;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
    }
}
