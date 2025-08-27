package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: y  reason: default package */
public final class y implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ int a;

    public /* synthetic */ y(int i) {
        this.a = i;
    }

    /* JADX WARNING: type inference failed for: r2v19, types: [android.view.View$BaseSavedState, bcg, java.lang.Object] */
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                if (parcel.readParcelable((ClassLoader) null) == null) {
                    return z.b;
                }
                throw new IllegalStateException("superState must be null");
            case 1:
                return new tr0(parcel, (ClassLoader) null);
            case 2:
                return new ez2(parcel, (ClassLoader) null);
            case 3:
                return new yz3(parcel, (ClassLoader) null);
            case 4:
                return new j54(parcel, (ClassLoader) null);
            case 5:
                return new ae5(parcel, (ClassLoader) null);
            case 6:
                return new mc6(parcel, (ClassLoader) null);
            case 7:
                return new mg8(parcel, (ClassLoader) null);
            case 8:
                return new jzc(parcel, (ClassLoader) null);
            case 9:
                return new emd(parcel, (ClassLoader) null);
            case 10:
                return new d9e(parcel, (ClassLoader) null);
            case 11:
                return new rff(parcel, (ClassLoader) null);
            case 12:
                return new imf(parcel, (ClassLoader) null);
            case 13:
                return new sbg(parcel, (ClassLoader) null);
            default:
                ? baseSavedState = new View.BaseSavedState(parcel, (ClassLoader) null);
                baseSavedState.a = parcel.readInt();
                baseSavedState.b = parcel.readInt();
                baseSavedState.c = parcel.readParcelable((ClassLoader) null);
                return baseSavedState;
        }
    }

    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new z[i];
            case 1:
                return new tr0[i];
            case 2:
                return new ez2[i];
            case 3:
                return new yz3[i];
            case 4:
                return new j54[i];
            case 5:
                return new ae5[i];
            case 6:
                return new mc6[i];
            case 7:
                return new mg8[i];
            case 8:
                return new jzc[i];
            case 9:
                return new emd[i];
            case 10:
                return new d9e[i];
            case 11:
                return new rff[i];
            case 12:
                return new imf[i];
            case 13:
                return new sbg[i];
            default:
                return new bcg[i];
        }
    }

    /* JADX WARNING: type inference failed for: r1v18, types: [android.view.View$BaseSavedState, bcg, java.lang.Object] */
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.a) {
            case 0:
                if (parcel.readParcelable(classLoader) == null) {
                    return z.b;
                }
                throw new IllegalStateException("superState must be null");
            case 1:
                return new tr0(parcel, classLoader);
            case 2:
                return new ez2(parcel, classLoader);
            case 3:
                return new yz3(parcel, classLoader);
            case 4:
                return new j54(parcel, classLoader);
            case 5:
                return new ae5(parcel, classLoader);
            case 6:
                return new mc6(parcel, classLoader);
            case 7:
                return new mg8(parcel, classLoader);
            case 8:
                return new jzc(parcel, classLoader);
            case 9:
                return new emd(parcel, classLoader);
            case 10:
                return new d9e(parcel, classLoader);
            case 11:
                return new rff(parcel, classLoader);
            case 12:
                return new imf(parcel, classLoader);
            case 13:
                return new sbg(parcel, classLoader);
            default:
                ? baseSavedState = new View.BaseSavedState(parcel, classLoader);
                baseSavedState.a = parcel.readInt();
                baseSavedState.b = parcel.readInt();
                baseSavedState.c = parcel.readParcelable(classLoader);
                return baseSavedState;
        }
    }
}
