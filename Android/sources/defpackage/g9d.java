package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import java.util.ArrayList;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: g9d  reason: default package */
public final class g9d implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ g9d(int i) {
        this.a = i;
    }

    /* JADX WARNING: type inference failed for: r12v10, types: [rsb, ond, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r12v30, types: [tie, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r12v31, types: [uie, java.lang.Object] */
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList.add(Long.valueOf(parcel.readLong()));
                }
                int readInt2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt2);
                for (int i2 = 0; i2 != readInt2; i2++) {
                    arrayList2.add(parcel.readBundle(h9d.class.getClassLoader()));
                }
                int readInt3 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt3);
                for (int i3 = 0; i3 != readInt3; i3++) {
                    arrayList3.add(Long.valueOf(parcel.readLong()));
                }
                return new h9d(arrayList, arrayList2, arrayList3, parcel.readInt());
            case 1:
                return new ved(parcel.readParcelable(ved.class.getClassLoader()));
            case 2:
                return new wed(c84.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readParcelable(wed.class.getClassLoader()));
            case 3:
                return new egd(parcel.readString());
            case 4:
                Class<fld> cls = fld.class;
                return new fld((ForegroundColorSpan) parcel.readParcelable(cls.getClassLoader()), (BackgroundColorSpan) parcel.readParcelable(cls.getClassLoader()));
            case 5:
                ? rsb = new rsb(parcel);
                rsb.a = parcel.readInt();
                rsb.b = parcel.readInt();
                rsb.c = parcel.readInt();
                return rsb;
            case 6:
                Class<tqd> cls2 = tqd.class;
                return new tqd(k48.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, (Uri) parcel.readParcelable(cls2.getClassLoader()), (Uri) parcel.readParcelable(cls2.getClassLoader()), parcel.readString(), (RectF) parcel.readParcelable(cls2.getClassLoader()), (Rect) parcel.readParcelable(cls2.getClassLoader()), (Uri) parcel.readParcelable(cls2.getClassLoader()));
            case 7:
                return new d0e(parcel.readInt(), (ngf) parcel.readParcelable(d0e.class.getClassLoader()), c0e.valueOf(parcel.readString()));
            case 8:
                parcel.readInt();
                return a1e.a;
            case 9:
                return new b1e((ngf) parcel.readParcelable(b1e.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            case 10:
                boolean z = false;
                boolean z2 = parcel.readInt() != 0;
                if (parcel.readInt() != 0) {
                    z = true;
                }
                return new c1e(z2, z);
            case 11:
                boolean z3 = false;
                boolean z4 = parcel.readInt() != 0;
                if (parcel.readInt() != 0) {
                    z3 = true;
                }
                return new d1e(z4, z3);
            case 12:
                return new e1e((ngf) parcel.readParcelable(e1e.class.getClassLoader()));
            case 13:
                ArrayList arrayList4 = new ArrayList();
                parcel.readList(arrayList4, eee.class.getClassLoader());
                return new gee(arrayList4);
            case Protos.Attaches.Attach.LOCATION /*14*/:
                ArrayList arrayList5 = new ArrayList();
                parcel.readList(arrayList5, fee.class.getClassLoader());
                return new hee(arrayList5);
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return new eee(parcel.readInt(), parcel.readLong(), parcel.readLong());
            case 16:
                return new fee(parcel.readInt(), parcel.readLong(), parcel.readLong());
            case LangUtils.HASH_SEED /*17*/:
                return new cfe(parcel);
            case 18:
                return new dfe(parcel);
            case 19:
                return new dhe(parcel);
            case 20:
                return new ehe(parcel);
            case 21:
                return new Object();
            case 22:
                return new Object();
            case 23:
                return new lhe(parcel);
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                return new mhe(parcel);
            case 25:
                ? obj = new Object();
                obj.a = parcel.readInt();
                obj.b = parcel.readInt();
                boolean z5 = true;
                if (parcel.readInt() != 1) {
                    z5 = false;
                }
                obj.o = z5;
                int readInt4 = parcel.readInt();
                if (readInt4 > 0) {
                    int[] iArr = new int[readInt4];
                    obj.c = iArr;
                    parcel.readIntArray(iArr);
                }
                return obj;
            case 26:
                ? obj2 = new Object();
                obj2.a = parcel.readInt();
                obj2.b = parcel.readInt();
                int readInt5 = parcel.readInt();
                obj2.c = readInt5;
                if (readInt5 > 0) {
                    int[] iArr2 = new int[readInt5];
                    obj2.o = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int readInt6 = parcel.readInt();
                obj2.v = readInt6;
                if (readInt6 > 0) {
                    int[] iArr3 = new int[readInt6];
                    obj2.w = iArr3;
                    parcel.readIntArray(iArr3);
                }
                boolean z6 = false;
                obj2.y = parcel.readInt() == 1;
                obj2.z = parcel.readInt() == 1;
                if (parcel.readInt() == 1) {
                    z6 = true;
                }
                obj2.X = z6;
                obj2.x = parcel.readArrayList(tie.class.getClassLoader());
                return obj2;
            case 27:
                parcel.readInt();
                return kje.a;
            case 28:
                return new lje(parcel.readLong(), parcel.readLong(), parcel.readInt() != 0);
            default:
                return new mje((d4g) parcel.readSerializable());
        }
    }

    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new h9d[i];
            case 1:
                return new ved[i];
            case 2:
                return new wed[i];
            case 3:
                return new egd[i];
            case 4:
                return new fld[i];
            case 5:
                return new ond[i];
            case 6:
                return new tqd[i];
            case 7:
                return new d0e[i];
            case 8:
                return new a1e[i];
            case 9:
                return new b1e[i];
            case 10:
                return new c1e[i];
            case 11:
                return new d1e[i];
            case 12:
                return new e1e[i];
            case 13:
                return new gee[i];
            case Protos.Attaches.Attach.LOCATION /*14*/:
                return new hee[i];
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return new eee[i];
            case 16:
                return new fee[i];
            case LangUtils.HASH_SEED /*17*/:
                return new cfe[i];
            case 18:
                return new dfe[i];
            case 19:
                return new dhe[i];
            case 20:
                return new ehe[i];
            case 21:
                return new fhe[i];
            case 22:
                return new ghe[i];
            case 23:
                return new lhe[i];
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                return new mhe[i];
            case 25:
                return new tie[i];
            case 26:
                return new uie[i];
            case 27:
                return new kje[i];
            case 28:
                return new lje[i];
            default:
                return new mje[i];
        }
    }
}
