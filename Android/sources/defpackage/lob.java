package defpackage;

import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* renamed from: lob  reason: default package */
public final class lob implements Parcelable {
    public static final Parcelable.Creator<lob> CREATOR = new w0b(11);
    public final String a;
    public final CharSequence b;
    public final int c;
    public final Bundle o;
    public PlaybackState.CustomAction v;

    public lob(String str, CharSequence charSequence, int i, Bundle bundle) {
        this.a = str;
        this.b = charSequence;
        this.c = i;
        this.o = bundle;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "Action:mName='" + this.b + ", mIcon=" + this.c + ", mExtras=" + this.o;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        TextUtils.writeToParcel(this.b, parcel, i);
        parcel.writeInt(this.c);
        parcel.writeBundle(this.o);
    }

    public lob(Parcel parcel) {
        String readString = parcel.readString();
        readString.getClass();
        this.a = readString;
        CharSequence charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        charSequence.getClass();
        this.b = charSequence;
        this.c = parcel.readInt();
        this.o = parcel.readBundle(px8.class.getClassLoader());
    }
}
