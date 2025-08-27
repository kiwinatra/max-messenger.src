package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.JvmField;

/* renamed from: ui7  reason: default package */
public final class ui7 implements Parcelable {
    @JvmField
    public static final Parcelable.Creator<ui7> CREATOR = new f27(6);
    public final IntentSender a;
    public final Intent b;
    public final int c;
    public final int o;

    public ui7(IntentSender intentSender, Intent intent, int i, int i2) {
        this.a = intentSender;
        this.b = intent;
        this.c = i;
        this.o = i2;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
        parcel.writeInt(this.c);
        parcel.writeInt(this.o);
    }

    public ui7(Parcel parcel) {
        this((IntentSender) parcel.readParcelable(IntentSender.class.getClassLoader()), (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
    }
}
