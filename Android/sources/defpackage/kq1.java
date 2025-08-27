package defpackage;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import androidx.core.graphics.drawable.IconCompat;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.text.StringsKt;

/* renamed from: kq1  reason: default package */
public final class kq1 {
    public final Lazy a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;
    public final Lazy e;
    public final Lazy f;
    public final Lazy g;
    public final Lazy h;
    public final Lazy i;
    public final Lazy j;
    public final Lazy k;
    public final Lazy l;

    public kq1(Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4, Lazy lazy5) {
        this.a = lazy;
        this.b = lazy4;
        this.c = lazy5;
        this.d = lazy3;
        this.e = lazy2;
        this.f = LazyKt.lazy(new ur(4, lazy2));
        ur urVar = new ur(5, lazy);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.g = LazyKt.lazy(lazyThreadSafetyMode, urVar);
        this.h = LazyKt.lazy(lazyThreadSafetyMode, new ur(6, lazy));
        this.i = LazyKt.lazy(lazyThreadSafetyMode, new ur(7, lazy));
        this.j = LazyKt.lazy(lazyThreadSafetyMode, new ur(8, lazy));
        this.k = LazyKt.lazy(lazyThreadSafetyMode, new lj1(18));
        this.l = LazyKt.lazy(lazyThreadSafetyMode, new lj1(19));
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [java.lang.Object, ldb] */
    public static ldb b(String str, String str2, Bitmap bitmap) {
        IconCompat iconCompat;
        if (!(!StringsKt.isBlank(str))) {
            str = StringsKt.isBlank(str2) ^ true ? str2 : "...";
        }
        if (bitmap != null) {
            iconCompat = new IconCompat(5);
            iconCompat.b = bitmap;
        } else {
            iconCompat = null;
        }
        ? obj = new Object();
        obj.a = str;
        obj.b = iconCompat;
        obj.c = null;
        obj.d = null;
        obj.e = false;
        obj.f = true;
        return obj;
    }

    public final void a() {
        z68.c("CallsNotification", "cancel call notification", new Object[0]);
        e().b.cancel((String) null, 239);
        e().b.cancel((String) null, 240);
    }

    public final Notification c(Context context, y11 y11, boolean z, boolean z2) {
        z68.c("CallsNotification", "createTempNotification", new Object[0]);
        CharSequence charSequence = y11.b;
        if (charSequence == null) {
            charSequence = (String) this.g.getValue();
        }
        String str = !z2 ? (String) this.j.getValue() : z ? (String) this.i.getValue() : (String) this.h.getValue();
        int intValue = z ? ((Number) this.l.getValue()).intValue() : ((Number) this.k.getValue()).intValue();
        ((pwa) this.e.getValue()).l();
        ((ed4) this.d.getValue()).getClass();
        eda eda = new eda(context, "ru.oneme.app.new.activeCalls");
        eda.k = -1;
        eda.v = "call";
        eda.F.icon = intValue;
        eda.e = eda.c(charSequence);
        eda.f = eda.c(str);
        return eda.b();
    }

    public final y91 d() {
        return (y91) this.c.getValue();
    }

    public final tea e() {
        return (tea) this.f.getValue();
    }
}
