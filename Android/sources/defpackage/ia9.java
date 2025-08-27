package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: ia9  reason: default package */
public final class ia9 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ ia9(int i) {
        this.a = i;
    }

    /* JADX WARNING: type inference failed for: r6v19, types: [rsb, tw9, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r6v21, types: [android.view.View$BaseSavedState, f6a, java.lang.Object] */
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return new ja9(parcel);
            case 1:
                return new pc9(parcel);
            case 2:
                return new hd9(parcel);
            case 3:
                return new rp9(parcel);
            case 4:
                return new sp9(parcel);
            case 5:
                return new ms9(parcel);
            case 6:
                return new ns9(parcel);
            case 7:
                return new qs9(parcel.readLong());
            case 8:
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                boolean z = false;
                for (int i = 0; i != readInt; i++) {
                    arrayList.add(ikb.CREATOR.createFromParcel(parcel));
                }
                if (parcel.readInt() != 0) {
                    z = true;
                }
                return new rs9(arrayList, z);
            case 9:
                return at9.a(parcel.readInt(), parcel.readInt());
            case 10:
                return new nt9(parcel);
            case 11:
                return new ot9(parcel);
            case 12:
                return new su9(parcel);
            case 13:
                return new tu9(parcel);
            case Protos.Attaches.Attach.LOCATION /*14*/:
                ? rsb = new rsb(parcel);
                int readInt2 = parcel.readInt();
                rsb.a = new HashSet();
                String[] strArr = new String[readInt2];
                parcel.readStringArray(strArr);
                Collections.addAll(rsb.a, strArr);
                return rsb;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return new r2a(parcel);
            case 16:
                ? baseSavedState = new View.BaseSavedState(parcel);
                baseSavedState.a = parcel.readInt();
                return baseSavedState;
            case LangUtils.HASH_SEED /*17*/:
                return new q7a(parcel.readLong(), parcel.readString(), parcel.readInt(), parcel.readInt() != 0);
            case 18:
                return new dna(parcel);
            case 19:
                return new ysa(parcel.readInt(), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
            case 20:
                return new m0b(parcel.readInt());
            case 21:
                return new n0b(m0b.CREATOR.createFromParcel(parcel).a, parcel.readInt(), parcel.readInt(), 0);
            case 22:
                Class<z0b> cls = z0b.class;
                Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
                return new z0b((s0b) parcel.readParcelable(cls.getClassLoader()), (CharSequence) creator.createFromParcel(parcel), (CharSequence) creator.createFromParcel(parcel), (y0b) parcel.readParcelable(cls.getClassLoader()), n0b.CREATOR.createFromParcel(parcel));
            case 23:
                return new o0b(parcel.readInt());
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                parcel.readInt();
                return p0b.a;
            case 25:
                return new q0b(parcel.readInt());
            case 26:
                parcel.readInt();
                return r0b.a;
            case 27:
                parcel.readInt();
                return t0b.a;
            case 28:
                parcel.readInt();
                return u0b.a;
            default:
                parcel.readInt();
                return v0b.a;
        }
    }

    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new ja9[i];
            case 1:
                return new pc9[i];
            case 2:
                return new hd9[i];
            case 3:
                return new rp9[i];
            case 4:
                return new sp9[i];
            case 5:
                return new ms9[i];
            case 6:
                return new ns9[i];
            case 7:
                return new qs9[i];
            case 8:
                return new rs9[i];
            case 9:
                return new at9[i];
            case 10:
                return new nt9[i];
            case 11:
                return new ot9[i];
            case 12:
                return new su9[i];
            case 13:
                return new tu9[i];
            case Protos.Attaches.Attach.LOCATION /*14*/:
                return new tw9[i];
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return new r2a[i];
            case 16:
                return new f6a[i];
            case LangUtils.HASH_SEED /*17*/:
                return new q7a[i];
            case 18:
                return new dna[i];
            case 19:
                return new ysa[i];
            case 20:
                return new m0b[i];
            case 21:
                return new n0b[i];
            case 22:
                return new z0b[i];
            case 23:
                return new o0b[i];
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                return new p0b[i];
            case 25:
                return new q0b[i];
            case 26:
                return new r0b[i];
            case 27:
                return new t0b[i];
            case 28:
                return new u0b[i];
            default:
                return new v0b[i];
        }
    }
}
