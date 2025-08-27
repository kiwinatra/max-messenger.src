package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.KotlinVersion;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: s6  reason: default package */
public final class s6 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ s6(int i) {
        this.a = i;
    }

    /* JADX WARNING: type inference failed for: r7v7, types: [android.view.View$BaseSavedState, yo, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r7v13, types: [java.lang.Object, sg0] */
    /* JADX WARNING: type inference failed for: r7v14, types: [android.view.View$BaseSavedState, vk0, java.lang.Object] */
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return new t6(parcel);
            case 1:
                return new u8(parcel);
            case 2:
                return new ta(parcel.readInt(), parcel.readInt(), parcel.readString());
            case 3:
                return new vm(parcel);
            case 4:
                return new wm(parcel);
            case 5:
                ? baseSavedState = new View.BaseSavedState(parcel);
                baseSavedState.a = parcel.readByte() != 0;
                return baseSavedState;
            case 6:
                String readString = parcel.readString();
                readString.getClass();
                return new sp(parcel.readInt(), readString);
            case 7:
                String readString2 = parcel.readString();
                readString2.getClass();
                return new tp(parcel.readInt(), readString2);
            case 8:
                return new bt(parcel);
            case 9:
                return new ye0(parcel);
            case 10:
                return new ze0(parcel);
            case 11:
                ? obj = new Object();
                obj.z = KotlinVersion.MAX_COMPONENT_VALUE;
                obj.Y = -2;
                obj.Z = -2;
                obj.v0 = -2;
                obj.C0 = Boolean.TRUE;
                obj.a = parcel.readInt();
                obj.b = (Integer) parcel.readSerializable();
                obj.c = (Integer) parcel.readSerializable();
                obj.o = (Integer) parcel.readSerializable();
                obj.v = (Integer) parcel.readSerializable();
                obj.w = (Integer) parcel.readSerializable();
                obj.x = (Integer) parcel.readSerializable();
                obj.y = (Integer) parcel.readSerializable();
                obj.z = parcel.readInt();
                obj.X = parcel.readString();
                obj.Y = parcel.readInt();
                obj.Z = parcel.readInt();
                obj.v0 = parcel.readInt();
                obj.x0 = parcel.readString();
                obj.y0 = parcel.readString();
                obj.z0 = parcel.readInt();
                obj.B0 = (Integer) parcel.readSerializable();
                obj.D0 = (Integer) parcel.readSerializable();
                obj.E0 = (Integer) parcel.readSerializable();
                obj.F0 = (Integer) parcel.readSerializable();
                obj.G0 = (Integer) parcel.readSerializable();
                obj.H0 = (Integer) parcel.readSerializable();
                obj.I0 = (Integer) parcel.readSerializable();
                obj.L0 = (Integer) parcel.readSerializable();
                obj.J0 = (Integer) parcel.readSerializable();
                obj.K0 = (Integer) parcel.readSerializable();
                obj.C0 = (Boolean) parcel.readSerializable();
                obj.w0 = (Locale) parcel.readSerializable();
                obj.M0 = (Boolean) parcel.readSerializable();
                return obj;
            case 12:
                ? baseSavedState2 = new View.BaseSavedState(parcel);
                baseSavedState2.a = parcel.readFloat();
                baseSavedState2.b = parcel.readFloat();
                ArrayList arrayList = new ArrayList();
                baseSavedState2.c = arrayList;
                parcel.readList(arrayList, Float.class.getClassLoader());
                baseSavedState2.o = parcel.readFloat();
                baseSavedState2.v = parcel.createBooleanArray()[0];
                return baseSavedState2;
            case 13:
                return new gn0(parcel);
            case Protos.Attaches.Attach.LOCATION:
                return new hn0(parcel);
            case Protos.Attaches.Attach.DAILY_MEDIA:
                return new cv0(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0);
            case 16:
                Class<at9> cls = at9.class;
                return new ly0((at9) parcel.readParcelable(cls.getClassLoader()), (at9) parcel.readParcelable(cls.getClassLoader()), (l84) parcel.readParcelable(l84.class.getClassLoader()), (at9) parcel.readParcelable(cls.getClassLoader()), parcel.readInt());
            case LangUtils.HASH_SEED:
                parcel.readInt();
                return x31.a;
            case 18:
                parcel.readInt();
                return y31.a;
            case 19:
                return new z31(parcel.readInt() != 0);
            case 20:
                int readInt = parcel.readInt();
                boolean z = false;
                boolean z2 = parcel.readInt() != 0;
                if (parcel.readInt() != 0) {
                    z = true;
                }
                return new a41(readInt, z2, z);
            case 21:
                return new b41(parcel.readInt(), parcel.createStringArray(), parcel.createIntArray());
            case 22:
                return new c41(parcel.readInt() != 0);
            case 23:
                pje pje = (pje) parcel.readParcelable(f41.class.getClassLoader());
                boolean z3 = false;
                boolean z4 = parcel.readInt() != 0;
                if (parcel.readInt() != 0) {
                    z3 = true;
                }
                return new f41(pje, z4, z3);
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                return new ze1(parcel.readLong(), parcel.readInt());
            case 25:
                Class<j02> cls2 = j02.class;
                return new j02((d48) parcel.readParcelable(cls2.getClassLoader()), (Uri) parcel.readParcelable(cls2.getClassLoader()));
            case 26:
                Class<k02> cls3 = k02.class;
                return new k02((d48) parcel.readParcelable(cls3.getClassLoader()), (Uri) parcel.readParcelable(cls3.getClassLoader()));
            case 27:
                return new l02((d48) parcel.readParcelable(l02.class.getClassLoader()), parcel.readString());
            case 28:
                return new h22(parcel);
            default:
                return new i22(parcel);
        }
    }

    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new t6[i];
            case 1:
                return new u8[i];
            case 2:
                return new ta[i];
            case 3:
                return new vm[i];
            case 4:
                return new wm[i];
            case 5:
                return new yo[i];
            case 6:
                return new sp[i];
            case 7:
                return new tp[i];
            case 8:
                return new bt[i];
            case 9:
                return new ye0[i];
            case 10:
                return new ze0[i];
            case 11:
                return new sg0[i];
            case 12:
                return new vk0[i];
            case 13:
                return new gn0[i];
            case Protos.Attaches.Attach.LOCATION:
                return new hn0[i];
            case Protos.Attaches.Attach.DAILY_MEDIA:
                return new cv0[i];
            case 16:
                return new ly0[i];
            case LangUtils.HASH_SEED:
                return new x31[i];
            case 18:
                return new y31[i];
            case 19:
                return new z31[i];
            case 20:
                return new a41[i];
            case 21:
                return new b41[i];
            case 22:
                return new c41[i];
            case 23:
                return new f41[i];
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                return new ze1[i];
            case 25:
                return new j02[i];
            case 26:
                return new k02[i];
            case 27:
                return new l02[i];
            case 28:
                return new h22[i];
            default:
                return new i22[i];
        }
    }
}
