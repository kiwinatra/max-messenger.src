package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: lgf  reason: default package */
public final class lgf implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        CharSequence charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        return Intrinsics.areEqual((Object) charSequence, (Object) "") ? ngf.a : new mgf(charSequence);
    }

    public final Object[] newArray(int i) {
        return new mgf[i];
    }
}
