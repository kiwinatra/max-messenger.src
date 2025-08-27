package defpackage;

import android.graphics.Bitmap;

/* renamed from: v0d  reason: default package */
public final class v0d extends ri0 {
    public final /* synthetic */ th8 a;

    public v0d(rh8 rh8) {
        this.a = rh8;
    }

    public final void e(i0 i0Var) {
        th8 th8 = this.a;
        if (!((rh8) th8).f()) {
            ((rh8) th8).onError(i0Var.c());
        }
    }

    public final void g(Bitmap bitmap) {
        th8 th8 = this.a;
        if (((rh8) th8).f()) {
            if (bitmap != null) {
                bitmap.recycle();
            }
        } else if (bitmap == null) {
            ((rh8) th8).b();
        } else {
            ((rh8) th8).a(bitmap);
        }
    }
}
