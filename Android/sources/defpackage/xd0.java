package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

/* renamed from: xd0  reason: default package */
public final class xd0 extends ri0 {
    public final /* synthetic */ oia a;
    public final /* synthetic */ yd0 b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ i0 d;

    public xd0(yha yha, yd0 yd0, Context context, i0 i0Var) {
        this.a = yha;
        this.b = yd0;
        this.c = context;
        this.d = i0Var;
    }

    public final void e(i0 i0Var) {
        Drawable c2 = this.b.c(this.c);
        oia oia = this.a;
        ((yha) oia).d(c2);
        ((yha) oia).b();
        i0Var.a();
    }

    public final void g(Bitmap bitmap) {
        i0 i0Var = this.d;
        Context context = this.c;
        oia oia = this.a;
        if (bitmap == null) {
            ((yha) oia).d(this.b.c(context));
            ((yha) oia).b();
            i0Var.a();
            return;
        }
        u8d u8d = new u8d(context.getResources(), Bitmap.createBitmap(bitmap));
        u8d.d.setAntiAlias(true);
        u8d.invalidateSelf();
        ((yha) oia).d(u8d);
        ((yha) oia).b();
        i0Var.a();
    }
}
