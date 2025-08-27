package defpackage;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.api.Scope;

/* renamed from: nr6  reason: default package */
public final class nr6 extends h3 {
    public static final Parcelable.Creator<nr6> CREATOR = new o0h(9);
    public static final Scope[] x0 = new Scope[0];
    public static final tj5[] y0 = new tj5[0];
    public tj5[] X;
    public final boolean Y;
    public final int Z;
    public final int a;
    public final int b;
    public final int c;
    public String o;
    public IBinder v;
    public boolean v0;
    public Scope[] w;
    public final String w0;
    public Bundle x;
    public Account y;
    public tj5[] z;

    public nr6(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, tj5[] tj5Arr, tj5[] tj5Arr2, boolean z2, int i4, boolean z3, String str2) {
        Account account2;
        int i5 = i;
        String str3 = str;
        IBinder iBinder2 = iBinder;
        Scope[] scopeArr2 = scopeArr == null ? x0 : scopeArr;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        tj5[] tj5Arr3 = y0;
        tj5[] tj5Arr4 = tj5Arr == null ? tj5Arr3 : tj5Arr;
        tj5Arr3 = tj5Arr2 != null ? tj5Arr2 : tj5Arr3;
        this.a = i5;
        this.b = i2;
        this.c = i3;
        if ("com.google.android.gms".equals(str3)) {
            this.o = "com.google.android.gms";
        } else {
            this.o = str3;
        }
        if (i5 < 2) {
            account2 = null;
            if (iBinder2 != null) {
                int i6 = r4.d;
                IInterface queryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                Object bvg = queryLocalInterface instanceof u57 ? (u57) queryLocalInterface : new bvg(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor", 1);
                if (bvg != null) {
                    long clearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        o7h o7h = (o7h) bvg;
                        Parcel l = o7h.l(o7h.H0(), 2);
                        Account account3 = (Account) szg.a(l, Account.CREATOR);
                        l.recycle();
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                        account2 = account3;
                    } catch (RemoteException unused) {
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                    } catch (Throwable th) {
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                        throw th;
                    }
                }
            }
        } else {
            this.v = iBinder2;
            account2 = account;
        }
        this.y = account2;
        this.w = scopeArr2;
        this.x = bundle2;
        this.z = tj5Arr4;
        this.X = tj5Arr3;
        this.Y = z2;
        this.Z = i4;
        this.v0 = z3;
        this.w0 = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        o0h.a(this, parcel, i);
    }
}
