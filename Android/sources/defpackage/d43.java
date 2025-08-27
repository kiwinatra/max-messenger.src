package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* renamed from: d43  reason: default package */
public final class d43 extends CharacterStyle implements UpdateAppearance, Parcelable, jf8 {
    public static final Parcelable.Creator<d43> CREATOR = new j22(6);
    public final int a;
    public final if8 b;

    public /* synthetic */ d43() {
        this(-65536);
    }

    public final zz3 copy() {
        return new d43();
    }

    public final int describeContents() {
        return 0;
    }

    public final if8 getType() {
        return this.b;
    }

    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(this.a);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
    }

    public d43(int i) {
        this.a = i;
        this.b = if8.z;
    }

    public d43(Parcel parcel) {
        this(parcel.readInt());
    }
}
