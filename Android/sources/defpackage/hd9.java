package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: hd9  reason: default package */
public final class hd9 implements Parcelable {
    public static final Parcelable.Creator<hd9> CREATOR = new ia9(2);
    public final a89 a;

    public hd9(a89 a89) {
        this.a = a89;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        a89 a89 = this.a;
        parcel.writeByte(a89 == null ? (byte) 1 : 0);
        if (a89 != null) {
            parcel.writeParcelable(new ja9(a89.a), i);
            parcel.writeParcelable(new kr3(a89.b), i);
            parcel.writeParcelable(new pc9(a89.c), i);
            parcel.writeParcelable(new hd9(a89.o), i);
        }
    }

    public hd9(Parcel parcel) {
        if (!te8.s(parcel)) {
            ha9 ha9 = ((ja9) parcel.readParcelable(ja9.class.getClassLoader())).a;
            vk3 vk3 = ((kr3) parcel.readParcelable(kr3.class.getClassLoader())).a;
            mc9 mc9 = ((pc9) parcel.readParcelable(pc9.class.getClassLoader())).a;
            eaf.a().getClass();
            sjd sjd = (sjd) eaf.b();
            this.a = new a89(ha9, vk3, mc9, ((hd9) parcel.readParcelable(hd9.class.getClassLoader())).a, ((esb) sjd.getAccessor().g(esb.class)).c(ha9), (cd9) sjd.getAccessor().g(cd9.class), (ff9) sjd.getAccessor().g(ff9.class), (fq2) sjd.getAccessor().g(fq2.class));
            return;
        }
        this.a = null;
    }
}
