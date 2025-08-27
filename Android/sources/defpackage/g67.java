package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.view.Surface;

/* renamed from: g67  reason: default package */
public final class g67 implements i67 {
    public IBinder c;

    public final void A0(c67 c67, int i, int i2) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(c67);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            this.c.transact(3017, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void B(c67 c67, int i, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(c67);
            obtain.writeInt(i);
            kr7.e(obtain, bundle);
            this.c.transact(3048, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void B0(c67 c67, int i, int i2, int i3, int i4) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(c67);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            obtain.writeInt(i3);
            obtain.writeInt(i4);
            this.c.transact(3023, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void C(c67 c67, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(c67);
            obtain.writeInt(i);
            this.c.transact(3041, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void D0(c67 c67, int i, int i2, int i3) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(c67);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            obtain.writeInt(i3);
            this.c.transact(3022, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void E(c67 c67, int i, int i2, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(c67);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            kr7.e(obtain, bundle);
            this.c.transact(3030, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void E0(c67 c67, int i, int i2, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(c67);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            kr7.e(obtain, bundle);
            this.c.transact(3055, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void F(c67 c67, int i, int i2) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(c67);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            this.c.transact(3052, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void F0(c67 c67, int i, boolean z) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(c67);
            obtain.writeInt(i);
            obtain.writeInt(z ? 1 : 0);
            this.c.transact(3018, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void G(c67 c67, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(c67);
            obtain.writeInt(i);
            this.c.transact(3040, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void I(c67 c67, int i, int i2) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(c67);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            this.c.transact(3053, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void J(c67 c67, int i, IBinder iBinder, boolean z) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(c67);
            obtain.writeInt(i);
            obtain.writeStrongBinder(iBinder);
            obtain.writeInt(z ? 1 : 0);
            this.c.transact(3011, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void K(c67 c67, int i, int i2, int i3) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(c67);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            obtain.writeInt(i3);
            this.c.transact(3020, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void L(c67 c67, int i, int i2) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(c67);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            this.c.transact(3019, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void N(c67 c67, int i, int i2, int i3, IBinder iBinder) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(c67);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            obtain.writeInt(i3);
            obtain.writeStrongBinder(iBinder);
            this.c.transact(3056, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void O(c67 c67, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(c67);
            obtain.writeInt(i);
            this.c.transact(3047, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void P(c67 c67, int i, int i2, long j) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(c67);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            obtain.writeLong(j);
            this.c.transact(3039, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void Q(c67 c67, int i, IBinder iBinder) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(c67);
            obtain.writeInt(i);
            obtain.writeStrongBinder(iBinder);
            this.c.transact(3031, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void S(c67 c67, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(c67);
            obtain.writeInt(i);
            this.c.transact(3036, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void U(c67 c67, int i, int i2, IBinder iBinder) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(c67);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            obtain.writeStrongBinder(iBinder);
            this.c.transact(3032, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void V(c67 c67, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(c67);
            obtain.writeInt(i);
            this.c.transact(3042, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void X(c67 c67, int i, long j) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(c67);
            obtain.writeInt(i);
            obtain.writeLong(j);
            this.c.transact(3038, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void Y(c67 c67, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(c67);
            obtain.writeInt(i);
            this.c.transact(3026, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void Z(c67 c67, int i, int i2) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(c67);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            this.c.transact(3037, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void a0(c67 c67, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(c67);
            obtain.writeInt(i);
            this.c.transact(3005, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.c;
    }

    public final void b0(c67 c67, int i, boolean z) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(c67);
            obtain.writeInt(i);
            obtain.writeInt(z ? 1 : 0);
            this.c.transact(3013, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void c(c67 c67, int i, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(c67);
            obtain.writeInt(i);
            kr7.e(obtain, bundle);
            this.c.transact(3014, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void c0(c67 c67, int i, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(c67);
            obtain.writeInt(i);
            kr7.e(obtain, bundle);
            this.c.transact(3007, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void d0(c67 c67, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(c67);
            obtain.writeInt(i);
            this.c.transact(3035, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void e(c67 c67, int i, Bundle bundle, boolean z) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(c67);
            obtain.writeInt(i);
            kr7.e(obtain, bundle);
            obtain.writeInt(z ? 1 : 0);
            this.c.transact(3057, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void f(c67 c67, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(c67);
            obtain.writeInt(i);
            this.c.transact(3025, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void h0(c67 c67, int i, Surface surface) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(c67);
            obtain.writeInt(i);
            kr7.e(obtain, surface);
            this.c.transact(3044, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void i0(c67 c67, int i, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(c67);
            obtain.writeInt(i);
            kr7.e(obtain, bundle);
            this.c.transact(3015, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void j(c67 c67, int i, Bundle bundle, long j) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(c67);
            obtain.writeInt(i);
            kr7.e(obtain, bundle);
            obtain.writeLong(j);
            this.c.transact(3008, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void k0(c67 c67, int i, Bundle bundle, boolean z) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(c67);
            obtain.writeInt(i);
            kr7.e(obtain, bundle);
            obtain.writeInt(z ? 1 : 0);
            this.c.transact(3009, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void l0(c67 c67) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(c67);
            this.c.transact(3045, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void n0(c67 c67, int i, int i2) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(c67);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            this.c.transact(3003, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void o0(c67 c67, int i, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(c67);
            obtain.writeInt(i);
            kr7.e(obtain, bundle);
            this.c.transact(3027, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void p(c67 c67, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(c67);
            obtain.writeInt(i);
            this.c.transact(3024, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void q0(c67 c67, int i, Bundle bundle, Bundle bundle2) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(c67);
            obtain.writeInt(i);
            kr7.e(obtain, bundle);
            kr7.e(obtain, bundle2);
            this.c.transact(3016, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void s(c67 c67, int i, int i2, int i3) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(c67);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            obtain.writeInt(i3);
            this.c.transact(3051, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void s0(c67 c67, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(c67);
            obtain.writeInt(i);
            this.c.transact(3021, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void t0(c67 c67, int i, boolean z, int i2) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(c67);
            obtain.writeInt(i);
            obtain.writeInt(z ? 1 : 0);
            obtain.writeInt(i2);
            this.c.transact(3054, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void v(c67 c67, int i, IBinder iBinder, int i2, long j) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(c67);
            obtain.writeInt(i);
            obtain.writeStrongBinder(iBinder);
            obtain.writeInt(i2);
            obtain.writeLong(j);
            this.c.transact(3012, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void v0(c67 c67, int i, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(c67);
            obtain.writeInt(i);
            kr7.e(obtain, bundle);
            this.c.transact(3033, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void w(c67 c67, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(c67);
            obtain.writeInt(i);
            this.c.transact(3043, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void w0(c67 c67, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(c67);
            obtain.writeInt(i);
            this.c.transact(3046, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void x(c67 c67, int i, float f) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(c67);
            obtain.writeInt(i);
            obtain.writeFloat(f);
            this.c.transact(3028, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void x0(c67 c67, int i, boolean z) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(c67);
            obtain.writeInt(i);
            obtain.writeInt(z ? 1 : 0);
            this.c.transact(3006, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void y(c67 c67, int i, float f) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(c67);
            obtain.writeInt(i);
            obtain.writeFloat(f);
            this.c.transact(3002, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void y0(c67 c67, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(c67);
            obtain.writeInt(i);
            this.c.transact(3034, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void z(c67 c67, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(c67);
            obtain.writeInt(i);
            this.c.transact(3004, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
