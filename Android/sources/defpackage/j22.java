package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: j22  reason: default package */
public final class j22 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ j22(int i) {
        this.a = i;
    }

    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return new k22(parcel);
            case 1:
                return new l22(parcel);
            case 2:
                return q72.valueOf(parcel.readString());
            case 3:
                return eg2.valueOf(parcel.readString());
            case 4:
                return uk2.valueOf(parcel.readString());
            case 5:
                return zk2.valueOf(parcel.readString());
            case 6:
                return new d43(parcel.readInt());
            case 7:
                return new h63(parcel);
            case 8:
                return new i63(parcel);
            case 9:
                return new j63(parcel);
            case 10:
                return new pg3(parcel.readInt(), (ngf) parcel.readParcelable(pg3.class.getClassLoader()), og3.valueOf(parcel.readString()));
            case 11:
                return new ug3(parcel.readBundle(ug3.class.getClassLoader()));
            case 12:
                return new vg3(parcel.readBundle(vg3.class.getClassLoader()));
            case 13:
                return new wg3(parcel.readBundle(wg3.class.getClassLoader()));
            case Protos.Attaches.Attach.LOCATION /*14*/:
                return new mo3(parcel);
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return new kr3(parcel);
            case 16:
                return new xv3(parcel.readInt(), parcel.readInt(), parcel.readString());
            case LangUtils.HASH_SEED /*17*/:
                return new yv3(xv3.CREATOR.createFromParcel(parcel));
            case 18:
                parcel.readInt();
                return zv3.a;
            case 19:
                parcel.readInt();
                return aw3.a;
            case 20:
                return new d44(parcel);
            case 21:
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList.add(Long.valueOf(parcel.readLong()));
                }
                int readInt2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt2);
                for (int i2 = 0; i2 != readInt2; i2++) {
                    arrayList2.add(parcel.readBundle(d54.class.getClassLoader()));
                }
                int readInt3 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt3);
                for (int i3 = 0; i3 != readInt3; i3++) {
                    arrayList3.add(Long.valueOf(parcel.readLong()));
                }
                return new d54(arrayList, arrayList2, arrayList3, parcel.readInt());
            case 22:
                Parcelable.Creator<ejf> creator = ejf.CREATOR;
                return new c84(n84.CREATOR.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel));
            case 23:
                return new l84(parcel.readLong());
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                return new n84(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readLong(), parcel.readString());
            case 25:
                return new ht4(parcel);
            case 26:
                return new sv4(parcel);
            case 27:
                return new xv4(parcel);
            case 28:
                return new yv4(parcel);
            default:
                return new vv4(parcel);
        }
    }

    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new k22[i];
            case 1:
                return new l22[i];
            case 2:
                return new q72[i];
            case 3:
                return new eg2[i];
            case 4:
                return new uk2[i];
            case 5:
                return new zk2[i];
            case 6:
                return new d43[i];
            case 7:
                return new h63[i];
            case 8:
                return new i63[i];
            case 9:
                return new j63[i];
            case 10:
                return new pg3[i];
            case 11:
                return new ug3[i];
            case 12:
                return new vg3[i];
            case 13:
                return new wg3[i];
            case Protos.Attaches.Attach.LOCATION /*14*/:
                return new mo3[i];
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return new kr3[i];
            case 16:
                return new xv3[i];
            case LangUtils.HASH_SEED /*17*/:
                return new yv3[i];
            case 18:
                return new zv3[i];
            case 19:
                return new aw3[i];
            case 20:
                return new d44[i];
            case 21:
                return new d54[i];
            case 22:
                return new c84[i];
            case 23:
                return new l84[i];
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                return new n84[i];
            case 25:
                return new ht4[i];
            case 26:
                return new sv4[i];
            case 27:
                return new xv4[i];
            case 28:
                return new yv4[i];
            default:
                return new vv4[i];
        }
    }
}
