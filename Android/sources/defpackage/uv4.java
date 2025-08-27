package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: uv4  reason: default package */
public final class uv4 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ uv4(int i) {
        this.a = i;
    }

    /* JADX WARNING: type inference failed for: r13v3, types: [rsb, b05, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r13v9, types: [android.view.ViewGroup$MarginLayoutParams, er5, bzc, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r13v10, types: [fr5, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r13v18, types: [java.lang.Object, zc6] */
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return new wv4(parcel);
            case 1:
                ? rsb = new rsb(parcel);
                rsb.a = parcel.readString();
                return rsb;
            case 2:
                return new h05(parcel);
            case 3:
                return new b95(parcel);
            case 4:
                return new c95(parcel);
            case 5:
                return new qo5(parcel.readString(), q82.valueOf(parcel.readString()), parcel.readInt() != 0);
            case 6:
                return new fq5(parcel);
            case 7:
                ? bzc = new bzc(-2, -2);
                bzc.v = c44.DEFAULT_ASPECT_RATIO;
                bzc.w = 1.0f;
                bzc.x = -1;
                bzc.y = -1.0f;
                bzc.Y = 16777215;
                bzc.Z = 16777215;
                bzc.v = parcel.readFloat();
                bzc.w = parcel.readFloat();
                bzc.x = parcel.readInt();
                bzc.y = parcel.readFloat();
                bzc.z = parcel.readInt();
                bzc.X = parcel.readInt();
                bzc.Y = parcel.readInt();
                bzc.Z = parcel.readInt();
                bzc.v0 = parcel.readByte() != 0;
                bzc.bottomMargin = parcel.readInt();
                bzc.leftMargin = parcel.readInt();
                bzc.rightMargin = parcel.readInt();
                bzc.topMargin = parcel.readInt();
                bzc.height = parcel.readInt();
                bzc.width = parcel.readInt();
                return bzc;
            case 8:
                ? obj = new Object();
                obj.a = parcel.readInt();
                obj.b = parcel.readInt();
                return obj;
            case 9:
                parcel.readInt();
                return xy5.a;
            case 10:
                return new yy5(parcel.readString());
            case 11:
                return new zy5(parcel.readString());
            case 12:
                return new z26(parcel.readString(), parcel.readInt() != 0);
            case 13:
                parcel.readInt();
                return n46.a;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                parcel.readInt();
                return o46.a;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                parcel.readInt();
                return p46.a;
            case 16:
                ? obj2 = new Object();
                obj2.a = parcel.readString();
                obj2.b = parcel.readInt();
                return obj2;
            case LangUtils.HASH_SEED /*17*/:
                return new fd6(parcel);
            case 18:
                return new id6(parcel);
            case 19:
                return new lk6(parcel.readInt());
            case 20:
                return new mk6(parcel.readString());
            case 21:
                boolean z = parcel.readInt() != 0;
                boolean z2 = parcel.readInt() != 0;
                boolean z3 = parcel.readInt() != 0;
                boolean z4 = parcel.readInt() != 0;
                boolean z5 = parcel.readInt() != 0;
                boolean z6 = parcel.readInt() != 0;
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList.add(parcel.readParcelable(pl6.class.getClassLoader()));
                }
                return new pl6(z, z2, z3, z4, z5, z6, arrayList, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            case 22:
                boolean z7 = parcel.readInt() != 0;
                boolean z8 = parcel.readInt() != 0;
                boolean z9 = parcel.readInt() != 0;
                boolean z10 = parcel.readInt() != 0;
                int readInt2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt2);
                for (int i2 = 0; i2 != readInt2; i2++) {
                    arrayList2.add(parcel.readParcelable(ql6.class.getClassLoader()));
                }
                return new ql6(z7, z8, z9, z10, arrayList2, parcel.readInt() != 0, parcel.readInt() != 0);
            case 23:
                int readInt3 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt3);
                for (int i3 = 0; i3 != readInt3; i3++) {
                    arrayList3.add(parcel.readParcelable(rl6.class.getClassLoader()));
                }
                return new rl6(arrayList3);
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                return new sl6((tqd) parcel.readParcelable(sl6.class.getClassLoader()));
            case 25:
                return new xp6(parcel);
            case 26:
                return new yp6(parcel);
            case 27:
                return new mx6(parcel.readFloat());
            case 28:
                return new i27(parcel);
            default:
                return new j27(parcel);
        }
    }

    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new wv4[i];
            case 1:
                return new b05[i];
            case 2:
                return new h05[i];
            case 3:
                return new b95[i];
            case 4:
                return new c95[i];
            case 5:
                return new qo5[i];
            case 6:
                return new fq5[i];
            case 7:
                return new er5[i];
            case 8:
                return new fr5[i];
            case 9:
                return new xy5[i];
            case 10:
                return new yy5[i];
            case 11:
                return new zy5[i];
            case 12:
                return new z26[i];
            case 13:
                return new n46[i];
            case Protos.Attaches.Attach.LOCATION /*14*/:
                return new o46[i];
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return new p46[i];
            case 16:
                return new zc6[i];
            case LangUtils.HASH_SEED /*17*/:
                return new fd6[i];
            case 18:
                return new id6[i];
            case 19:
                return new lk6[i];
            case 20:
                return new mk6[i];
            case 21:
                return new pl6[i];
            case 22:
                return new ql6[i];
            case 23:
                return new rl6[i];
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                return new sl6[i];
            case 25:
                return new xp6[i];
            case 26:
                return new yp6[i];
            case 27:
                return new mx6[i];
            case 28:
                return new i27[i];
            default:
                return new j27[i];
        }
    }
}
