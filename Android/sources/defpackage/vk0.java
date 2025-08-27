package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import java.util.ArrayList;

/* renamed from: vk0  reason: default package */
public final class vk0 extends View.BaseSavedState {
    public static final Parcelable.Creator<vk0> CREATOR = new s6(12);
    public float a;
    public float b;
    public ArrayList c;
    public float o;
    public boolean v;

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeFloat(this.a);
        parcel.writeFloat(this.b);
        parcel.writeList(this.c);
        parcel.writeFloat(this.o);
        parcel.writeBooleanArray(new boolean[]{this.v});
    }
}
