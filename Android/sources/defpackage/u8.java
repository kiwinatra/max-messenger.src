package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.JvmField;

/* renamed from: u8  reason: default package */
public final class u8 implements Parcelable {
    @JvmField
    public static final Parcelable.Creator<u8> CREATOR = new s6(1);
    public final int a;
    public final Intent b;

    public u8(int i, Intent intent) {
        this.a = i;
        this.b = intent;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i = this.a;
        sb.append(i != -1 ? i != 0 ? String.valueOf(i) : "RESULT_CANCELED" : "RESULT_OK");
        sb.append(", data=");
        sb.append(this.b);
        sb.append('}');
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        Intent intent = this.b;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public u8(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel));
    }
}
