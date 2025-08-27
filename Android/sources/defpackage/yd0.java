package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.LruCache;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* renamed from: yd0  reason: default package */
public final class yd0 {
    public static int n;
    public static int o;
    public static final int p;
    public static final wd0 q = new LruCache(20);
    public final yva a;
    public final r62 b;
    public final ce0 c;
    public final qdb d;
    public final a32 e;
    public final vk3 f;
    public final String g;
    public final CharSequence h;
    public final Long i;
    public final int j;
    public final int k;
    public final Drawable l;
    public final boolean m;

    /* JADX WARNING: type inference failed for: r0v0, types: [wd0, android.util.LruCache] */
    static {
        int dimension = (int) Resources.getSystem().getDimension(17104901);
        if (dimension == 0) {
            dimension = Math.round(((float) 64) * Resources.getSystem().getDisplayMetrics().density);
        }
        p = dimension;
    }

    public yd0(yva yva, r62 r62, ce0 ce0, CharSequence charSequence, Long l2) {
        this.j = -1;
        this.k = -1;
        this.a = yva;
        this.c = ce0;
        this.h = charSequence;
        this.i = l2;
        this.m = false;
        this.b = r62;
    }

    public static Bitmap a(Context context, yva yva, r62 r62, ce0 ce0, vk3 vk3, a32 a32, String str, long j2, String str2, lfd lfd) {
        Context context2 = context;
        yva yva2 = yva;
        r62 r622 = r62;
        ce0 ce02 = ce0;
        vk3 vk32 = vk3;
        a32 a322 = a32;
        String str3 = str2;
        int i2 = p;
        yd0 yd0 = str != null ? new yd0(yva, r62, ce0, str, o) : a322 != null ? new yd0(yva, r62, ce0, a32) : vk32 != null ? new yd0(yva, r62, ce0, vk3) : new yd0(yva, r62, ce0, (CharSequence) null, (Long) null);
        Bitmap createBitmap = Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        if (yd0.b(str3, false) == null) {
            Drawable c2 = yd0.c(context);
            c2.setBounds(0, 0, i2, i2);
            c2.draw(canvas);
        } else {
            pka x = new gb3(3, new vd0(yd0, str3, i2, context)).x(lfd);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            Objects.requireNonNull(timeUnit, "unit is null");
            ryg.k0(new zka(x, j2, timeUnit, lfd), new ud0(canvas, i2, 0), new vd0((Object) canvas, (Object) yd0, (Object) context, i2, 0), m58.e);
        }
        return createBitmap;
    }

    public static Uri d(vk3 vk3, String str, boolean z) {
        return o5a.x(vk3.u(str, z ? kl0.o : kl0.c));
    }

    public final Uri b(String str, boolean z) {
        String str2 = this.g;
        if (str2 != null) {
            return o5a.x(str2);
        }
        a32 a32 = this.e;
        if (a32 == null) {
            vk3 vk3 = this.f;
            if (vk3 != null) {
                return d(vk3, str, z);
            }
            qdb qdb = this.d;
            if (qdb != null) {
                return o5a.x(qdb.g);
            }
            return null;
        } else if (a32.N()) {
            vk3 m2 = a32.m();
            if (m2 != null) {
                return d(m2, str, z);
            }
            return null;
        } else {
            String b2 = a32.b.b(z ? kl0.o : kl0.c, jl0.a);
            if (!cvg.A(b2)) {
                return o5a.x(b2);
            }
            return null;
        }
    }

    public final Drawable c(Context context) {
        int i2;
        vk3 vk3 = this.f;
        a32 a32 = this.e;
        wd0 wd0 = q;
        Bitmap bitmap = a32 != null ? (Bitmap) wd0.get(Long.valueOf(a32.b.a)) : vk3 != null ? (Bitmap) wd0.get(Long.valueOf(vk3.r() ^ this.b.Q())) : null;
        if (bitmap != null && !bitmap.isRecycled()) {
            try {
                return new BitmapDrawable(context.getResources(), bitmap.copy(bitmap.getConfig(), false));
            } catch (Throwable th) {
                z68.o("yd0", "couldnt use cached bitmap", th);
            }
        }
        Drawable drawable = this.l;
        if (drawable != null) {
            return drawable;
        }
        if (this.g != null && (i2 = this.k) != -1) {
            return ew3.b(context, i2);
        }
        boolean z = this.m;
        yva yva = this.a;
        ce0 ce0 = this.c;
        if (a32 != null) {
            return a32.N() ? new de0(ce0, a32.m(), z) : new de0(ce0, a32, yva);
        }
        if (vk3 != null) {
            return new de0(ce0, vk3, z);
        }
        qdb qdb = this.d;
        if (qdb != null) {
            return new de0(ce0, qdb);
        }
        CharSequence charSequence = this.h;
        if (!cvg.A(charSequence)) {
            Long l2 = this.i;
            if (l2 == null || l2.longValue() == 0) {
                return new de0(ce0, yva, charSequence);
            }
            return new de0(this.c, this.a, this.h, l2.longValue(), this.m);
        }
        int i3 = this.j;
        return i3 != -1 ? new ColorDrawable(fw3.a(context, i3)) : ew3.b(context, n);
    }

    public yd0(yva yva, r62 r62, ce0 ce0, vk3 vk3) {
        this.i = null;
        this.j = -1;
        this.k = -1;
        this.a = yva;
        this.c = ce0;
        this.f = vk3;
        this.b = r62;
    }

    public yd0(yva yva, r62 r62, ce0 ce0, a32 a32) {
        this.i = null;
        this.j = -1;
        this.k = -1;
        this.a = yva;
        this.c = ce0;
        this.e = a32;
        this.b = r62;
    }

    public yd0(yva yva, r62 r62, ce0 ce0, qdb qdb) {
        this.i = null;
        this.j = -1;
        this.k = -1;
        this.a = yva;
        this.c = ce0;
        this.d = qdb;
        this.b = r62;
    }

    public yd0(yva yva, r62 r62, ce0 ce0, int i2) {
        this.i = null;
        this.k = -1;
        this.a = yva;
        this.c = ce0;
        this.j = i2;
        this.b = r62;
    }

    public yd0(yva yva, r62 r62, ce0 ce0, String str, int i2) {
        this.i = null;
        this.j = -1;
        this.a = yva;
        this.c = ce0;
        this.g = str;
        this.k = i2;
        this.b = r62;
    }

    public yd0(yva yva, r62 r62, ce0 ce0, Drawable drawable) {
        this.i = null;
        this.j = -1;
        this.k = -1;
        this.a = yva;
        this.c = ce0;
        if ((drawable instanceof fe0) || (drawable instanceof de0)) {
            this.l = drawable;
        } else {
            this.l = new fe0(drawable.mutate(), drawable.getCurrent() instanceof ColorDrawable ? ((ColorDrawable) drawable.getCurrent()).getColor() : 0);
        }
        this.b = r62;
    }
}
