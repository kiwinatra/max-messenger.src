package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: w0b  reason: default package */
public final class w0b implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ w0b(int i) {
        this.a = i;
    }

    public final Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        switch (this.a) {
            case 0:
                return new x0b((ngf) parcel2.readParcelable(x0b.class.getClassLoader()));
            case 1:
                return new ParcelImpl(parcel2);
            case 2:
                return new j8b(parcel2);
            case 3:
                return new nbb(parcel.readString(), parcel.createStringArray(), parcel.readInt());
            case 4:
                return new beb(parcel2);
            case 5:
                Class<Uri> cls = Uri.class;
                return new dfb((Uri) parcel2.readParcelable(cls.getClassLoader()), (Uri) parcel2.readParcelable(cls.getClassLoader()), (d44) parcel2.readParcelable(d44.class.getClassLoader()), (h05) parcel2.readParcelable(h05.class.getClassLoader()), (Uri) parcel2.readParcelable(cls.getClassLoader()), (Uri) parcel2.readParcelable(cls.getClassLoader()));
            case 6:
                return new ffb(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            case 7:
                return new ikb(parcel.readString(), parcel.readInt() != 0);
            case 8:
                return new vkb(parcel2);
            case 9:
                return new wkb(parcel2);
            case 10:
                return new mob(parcel2);
            case 11:
                return new lob(parcel2);
            case 12:
                return new rsb(parcel2);
            case 13:
                return new zsb(parcel2);
            case Protos.Attaches.Attach.LOCATION:
                return new stb(parcel2);
            case Protos.Attaches.Attach.DAILY_MEDIA:
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
                for (int i = 0; i != readInt; i++) {
                    linkedHashMap.put(Integer.valueOf(parcel.readInt()), parcel.readString());
                }
                int readInt2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt2);
                for (int i2 = 0; i2 != readInt2; i2++) {
                    arrayList.add(q7a.CREATOR.createFromParcel(parcel2));
                }
                return new ytb(linkedHashMap, arrayList, parcel.readInt() == 0 ? null : q7a.CREATOR.createFromParcel(parcel2));
            case 16:
                return new xub(parcel2);
            case LangUtils.HASH_SEED:
                return new yub(parcel2);
            case 18:
                return new avb(parcel2);
            case 19:
                return new bvb(parcel2);
            case 20:
                return txb.valueOf(parcel.readString());
            case 21:
                return eyb.valueOf(parcel.readString());
            case 22:
                return fzb.valueOf(parcel.readString());
            case 23:
                return gzb.valueOf(parcel.readString());
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                return new hac(parcel.readLong(), parcel.readString(), parcel.readLong(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readLong(), parcel.readString(), parcel.readLong(), zk2.CREATOR.createFromParcel(parcel2));
            case 25:
                return new uac(new rac(qac.values()[parcel.readInt()], parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readLong(), Byte.valueOf(parcel.readByte()).equals(1)));
            case 26:
                return new upc(parcel.readInt(), parcel.readFloat());
            case 27:
                return new f0d(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
            case 28:
                int Y = n79.Y(parcel);
                Bundle bundle = null;
                while (parcel.dataPosition() < Y) {
                    int readInt3 = parcel.readInt();
                    if (((char) readInt3) != 2) {
                        n79.T(parcel2, readInt3);
                    } else {
                        bundle = n79.s(parcel2, readInt3);
                    }
                }
                n79.z(parcel2, Y);
                return new b1d(bundle);
            default:
                return new l3d(parcel.readInt());
        }
    }

    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new x0b[i];
            case 1:
                return new ParcelImpl[i];
            case 2:
                return new j8b[i];
            case 3:
                return new nbb[i];
            case 4:
                return new beb[i];
            case 5:
                return new dfb[i];
            case 6:
                return new ffb[i];
            case 7:
                return new ikb[i];
            case 8:
                return new vkb[i];
            case 9:
                return new wkb[i];
            case 10:
                return new mob[i];
            case 11:
                return new lob[i];
            case 12:
                return new rsb[i];
            case 13:
                return new zsb[i];
            case Protos.Attaches.Attach.LOCATION:
                return new stb[i];
            case Protos.Attaches.Attach.DAILY_MEDIA:
                return new ytb[i];
            case 16:
                return new xub[i];
            case LangUtils.HASH_SEED:
                return new yub[i];
            case 18:
                return new avb[i];
            case 19:
                return new bvb[i];
            case 20:
                return new txb[i];
            case 21:
                return new eyb[i];
            case 22:
                return new fzb[i];
            case 23:
                return new gzb[i];
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                return new hac[i];
            case 25:
                return new uac[i];
            case 26:
                return new upc[i];
            case 27:
                return new f0d[i];
            case 28:
                return new b1d[i];
            default:
                return new l3d[i];
        }
    }
}
