package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import ru.ok.tamtam.nano.ProtoException;

/* renamed from: kr3  reason: default package */
public final class kr3 implements Parcelable {
    public static final Parcelable.Creator<kr3> CREATOR = new j22(15);
    public final vk3 a;

    public kr3(vk3 vk3) {
        this.a = vk3;
    }

    public static ArrayList a(ArrayList arrayList) {
        if (arrayList == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((kr3) it.next()).a);
        }
        return arrayList2;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        vk3 vk3 = this.a;
        parcel.writeByte(vk3 == null ? (byte) 1 : 0);
        if (vk3 != null) {
            parcel.writeLong(vk3.a.b);
            te8.C(parcel, vk3.a.c.d());
            parcel.writeParcelable(new stb(vk3.a.o), i);
            parcel.writeByte(vk3.w ? (byte) 1 : 0);
        }
    }

    public kr3(Parcel parcel) {
        try {
            if (!te8.s(parcel)) {
                long readLong = parcel.readLong();
                um3 b = um3.b(te8.t(parcel));
                stb stb = (stb) parcel.readParcelable(stb.class.getClassLoader());
                boolean z = true;
                if (parcel.readByte() != 1) {
                    z = false;
                }
                vm3 vm3 = new vm3(readLong, b, stb.a);
                eaf.a().getClass();
                this.a = new vk3(vm3, z, ((sjd) eaf.b()).s());
                return;
            }
            this.a = null;
        } catch (ProtoException e) {
            throw new IllegalStateException(e);
        }
    }
}
