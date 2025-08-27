package defpackage;

import android.media.MediaDescription;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.view.View;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: f27  reason: default package */
public final class f27 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ f27(int i) {
        this.a = i;
    }

    /* JADX WARNING: type inference failed for: r0v12, types: [bw7, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v14, types: [rsb, tz7, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v20, types: [android.view.View$BaseSavedState, vg8, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v30, types: [java.lang.Object, nx8] */
    public final Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        switch (this.a) {
            case 0:
                return new g27(parcel2);
            case 1:
                return new h27(parcel2);
            case 2:
                return new j77(parcel2);
            case 3:
                return new k77(parcel2);
            case 4:
                return new l77(parcel2);
            case 5:
                return new m77(parcel2);
            case 6:
                return new ui7(parcel2);
            case 7:
                return new xi7(parcel2);
            case 8:
                return new yi7(parcel2);
            case 9:
                return new bs7(parcel2);
            case 10:
                ? obj = new Object();
                obj.a = parcel.readInt();
                obj.b = parcel.readInt();
                boolean z = true;
                if (parcel.readInt() != 1) {
                    z = false;
                }
                obj.c = z;
                return obj;
            case 11:
                return new dz7(parcel2);
            case 12:
                ? rsb = new rsb(parcel2);
                rsb.a = parcel.readString();
                return rsb;
            case 13:
                return new a48(parcel2);
            case Protos.Attaches.Attach.LOCATION /*14*/:
                return new d48(parcel2);
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                long readLong = parcel.readLong();
                Class<k48> cls = k48.class;
                Uri uri = (Uri) parcel2.readParcelable(cls.getClassLoader());
                String readString = parcel.readString();
                int readInt = parcel.readInt();
                long readLong2 = parcel.readLong();
                Long l = null;
                Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                if (parcel.readInt() != 0) {
                    l = Long.valueOf(parcel.readLong());
                }
                return new k48(readLong, uri, readString, readInt, readLong2, valueOf, l, parcel.readInt(), parcel.readInt(), parcel.readLong(), (Uri) parcel2.readParcelable(cls.getClassLoader()));
            case 16:
                return new x58(parcel2);
            case LangUtils.HASH_SEED /*17*/:
                return new rd8(parcel2);
            case 18:
                ? baseSavedState = new View.BaseSavedState(parcel2);
                baseSavedState.a = ((Integer) parcel2.readValue(vg8.class.getClassLoader())).intValue();
                return baseSavedState;
            case 19:
                return new xi8(parcel2);
            case 20:
                return new yi8(parcel2);
            case 21:
                return new wj8(parcel.readInt() != 0, uk2.CREATOR.createFromParcel(parcel2));
            case 22:
                return new km8(parcel2);
            case 23:
                zp8 a2 = zp8.a(MediaDescription.CREATOR.createFromParcel(parcel2));
                a2.getClass();
                return a2;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                return new vs8(parcel2);
            case 25:
                return new mx8(parcel2);
            case 26:
                ? obj2 = new Object();
                obj2.a = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel2);
                return obj2;
            case 27:
                Parcelable readParcelable = parcel2.readParcelable((ClassLoader) null);
                readParcelable.getClass();
                return new ox8(readParcelable, (h67) null);
            case 28:
                Class<s29> cls2 = s29.class;
                return new s29(parcel.readInt(), (ngf) parcel2.readParcelable(cls2.getClassLoader()), h1e.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (f1e) parcel2.readParcelable(cls2.getClassLoader()));
            default:
                return new w39(parcel.readLong(), ij2.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }
    }

    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new g27[i];
            case 1:
                return new h27[i];
            case 2:
                return new j77[i];
            case 3:
                return new k77[i];
            case 4:
                return new l77[i];
            case 5:
                return new m77[i];
            case 6:
                return new ui7[i];
            case 7:
                return new xi7[i];
            case 8:
                return new yi7[i];
            case 9:
                return new bs7[i];
            case 10:
                return new bw7[i];
            case 11:
                return new dz7[i];
            case 12:
                return new tz7[i];
            case 13:
                return new a48[i];
            case Protos.Attaches.Attach.LOCATION /*14*/:
                return new d48[i];
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return new k48[i];
            case 16:
                return new x58[i];
            case LangUtils.HASH_SEED /*17*/:
                return new rd8[i];
            case 18:
                return new vg8[i];
            case 19:
                return new xi8[i];
            case 20:
                return new yi8[i];
            case 21:
                return new wj8[i];
            case 22:
                return new km8[i];
            case 23:
                return new zp8[i];
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                return new vs8[i];
            case 25:
                return new mx8[i];
            case 26:
                return new nx8[i];
            case 27:
                return new ox8[i];
            case 28:
                return new s29[i];
            default:
                return new w39[i];
        }
    }
}
