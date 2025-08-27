package defpackage;

import android.os.Parcel;

/* renamed from: zvg  reason: default package */
public final class zvg extends jb7 {
    public final /* synthetic */ int d = 1;
    public Object e;

    public zvg() {
        this.c = null;
        this.a = false;
        this.b = 0;
    }

    public final void g(ql qlVar, qdf qdf) {
        switch (this.d) {
            case 0:
                ((t0d) ((ur0) this.e).d).accept(qlVar, qdf);
                return;
            default:
                this.e = qdf;
                z2h z2h = (z2h) ((t4h) qlVar).o();
                p5h p5h = new p5h(this);
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
                int i = rzg.a;
                obtain.writeStrongBinder(p5h);
                Parcel obtain2 = Parcel.obtain();
                try {
                    z2h.c.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return;
                } finally {
                    obtain.recycle();
                    obtain2.recycle();
                }
        }
    }

    public zvg(ur0 ur0, tj5[] tj5Arr, boolean z, int i) {
        this.e = ur0;
        this.c = tj5Arr;
        boolean z2 = false;
        if (tj5Arr != null && z) {
            z2 = true;
        }
        this.a = z2;
        this.b = i;
    }
}
