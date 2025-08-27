package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import java.util.ArrayList;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: nje  reason: default package */
public final class nje implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ nje(int i) {
        this.a = i;
    }

    /* JADX WARNING: type inference failed for: r6v19, types: [rsb, cuf, java.lang.Object] */
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return new oje(parcel.readLong());
            case 1:
                return zke.valueOf(parcel.readString());
            case 2:
                return goe.valueOf(parcel.readString());
            case 3:
                return new kpe(parcel);
            case 4:
                return new exe(parcel);
            case 5:
                return new fxe(parcel);
            case 6:
                SparseArray sparseArray = new SparseArray();
                int readInt = parcel.readInt();
                for (int i = 0; i < readInt; i++) {
                    sparseArray.put(parcel.readInt(), parcel.readString());
                }
                return new cye(sparseArray);
            case 7:
                return new mff(parcel);
            case 8:
                String readString = parcel.readString();
                readString.getClass();
                String readString2 = parcel.readString();
                String[] createStringArray = parcel.createStringArray();
                createStringArray.getClass();
                return new nff(readString, readString2, tb7.q(createStringArray));
            case 9:
                return new ejf(parcel.readInt());
            case 10:
                return new ijf(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
            case 11:
                return new tjf(parcel.readLong(), parcel.readLong());
            case 12:
                return new ujf(parcel.readLong(), parcel.readLong());
            case 13:
                return new npf(parcel);
            case Protos.Attaches.Attach.LOCATION /*14*/:
                return new mpf(parcel);
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                ? rsb = new rsb(parcel);
                boolean z = true;
                if (parcel.readInt() != 1) {
                    z = false;
                }
                rsb.a = z;
                return rsb;
            case 16:
                return new pzf(parcel);
            case LangUtils.HASH_SEED /*17*/:
                return new qzf(parcel);
            case 18:
                parcel.readInt();
                return a4g.a;
            case 19:
                return new b4g(y3g.valueOf(parcel.readString()));
            case 20:
                parcel.readInt();
                return w7g.a;
            case 21:
                return new x7g(qac.valueOf(parcel.readString()));
            case 22:
                return new geg(parcel);
            case 23:
                return new eeg(parcel);
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                return new eeg(parcel);
            case 25:
                return new geg(parcel);
            case 26:
                int Y = n79.Y(parcel);
                Bundle bundle = null;
                int i2 = 0;
                int i3 = 0;
                while (parcel.dataPosition() < Y) {
                    int readInt2 = parcel.readInt();
                    char c = (char) readInt2;
                    if (c == 1) {
                        i2 = n79.N(parcel, readInt2);
                    } else if (c == 2) {
                        i3 = n79.N(parcel, readInt2);
                    } else if (c != 3) {
                        n79.T(parcel, readInt2);
                    } else {
                        bundle = n79.s(parcel, readInt2);
                    }
                }
                n79.z(parcel, Y);
                return new qt6(i2, i3, bundle);
            case 27:
                int Y2 = n79.Y(parcel);
                String str = null;
                int i4 = 0;
                while (parcel.dataPosition() < Y2) {
                    int readInt3 = parcel.readInt();
                    char c2 = (char) readInt3;
                    if (c2 == 1) {
                        i4 = n79.N(parcel, readInt3);
                    } else if (c2 != 2) {
                        n79.T(parcel, readInt3);
                    } else {
                        str = n79.u(parcel, readInt3);
                    }
                }
                n79.z(parcel, Y2);
                return new t23(i4, str);
            case 28:
                int Y3 = n79.Y(parcel);
                ArrayList arrayList = null;
                int i5 = 0;
                while (parcel.dataPosition() < Y3) {
                    int readInt4 = parcel.readInt();
                    char c3 = (char) readInt4;
                    if (c3 == 1) {
                        i5 = n79.N(parcel, readInt4);
                    } else if (c3 != 2) {
                        n79.T(parcel, readInt4);
                    } else {
                        arrayList = n79.w(parcel, readInt4, lq9.CREATOR);
                    }
                }
                n79.z(parcel, Y3);
                return new mef(i5, arrayList);
            default:
                int Y4 = n79.Y(parcel);
                Intent intent = null;
                int i6 = 0;
                int i7 = 0;
                while (parcel.dataPosition() < Y4) {
                    int readInt5 = parcel.readInt();
                    char c4 = (char) readInt5;
                    if (c4 == 1) {
                        i6 = n79.N(parcel, readInt5);
                    } else if (c4 == 2) {
                        i7 = n79.N(parcel, readInt5);
                    } else if (c4 != 3) {
                        n79.T(parcel, readInt5);
                    } else {
                        intent = (Intent) n79.t(parcel, readInt5, Intent.CREATOR);
                    }
                }
                n79.z(parcel, Y4);
                return new dvg(i6, i7, intent);
        }
    }

    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new oje[i];
            case 1:
                return new zke[i];
            case 2:
                return new goe[i];
            case 3:
                return new kpe[i];
            case 4:
                return new exe[i];
            case 5:
                return new fxe[i];
            case 6:
                return new cye[i];
            case 7:
                return new mff[i];
            case 8:
                return new nff[i];
            case 9:
                return new ejf[i];
            case 10:
                return new ijf[i];
            case 11:
                return new tjf[i];
            case 12:
                return new ujf[i];
            case 13:
                return new npf[i];
            case Protos.Attaches.Attach.LOCATION /*14*/:
                return new mpf[i];
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return new cuf[i];
            case 16:
                return new pzf[i];
            case LangUtils.HASH_SEED /*17*/:
                return new qzf[i];
            case 18:
                return new a4g[i];
            case 19:
                return new b4g[i];
            case 20:
                return new w7g[i];
            case 21:
                return new x7g[i];
            case 22:
                return new deg[i];
            case 23:
                return new eeg[i];
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                return new feg[i];
            case 25:
                return new geg[i];
            case 26:
                return new qt6[i];
            case 27:
                return new t23[i];
            case 28:
                return new mef[i];
            default:
                return new dvg[i];
        }
    }
}
