package defpackage;

import android.app.PendingIntent;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* renamed from: qca  reason: default package */
public final class qca {
    public final Bundle a;
    public IconCompat b;
    public final a1d[] c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final boolean g;
    public final int h;
    public final CharSequence i;
    public final PendingIntent j;
    public final boolean k;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public qca(int i2, String str, PendingIntent pendingIntent) {
        this(i2 != 0 ? IconCompat.d((Resources) null, "", i2) : null, (CharSequence) str, pendingIntent);
    }

    public final IconCompat a() {
        int i2;
        if (this.b == null && (i2 = this.h) != 0) {
            this.b = IconCompat.d((Resources) null, "", i2);
        }
        return this.b;
    }

    public qca(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
        this(iconCompat, charSequence, pendingIntent, new Bundle(), (a1d[]) null, (a1d[]) null, true, 0, true, false, false);
    }

    public qca(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, a1d[] a1dArr, a1d[] a1dArr2, boolean z, int i2, boolean z2, boolean z3, boolean z4) {
        this.e = true;
        this.b = iconCompat;
        if (iconCompat != null) {
            int i3 = iconCompat.a;
            if ((i3 == -1 ? x67.c(iconCompat.b) : i3) == 2) {
                this.h = iconCompat.e();
            }
        }
        this.i = eda.c(charSequence);
        this.j = pendingIntent;
        this.a = bundle == null ? new Bundle() : bundle;
        this.c = a1dArr;
        this.d = z;
        this.f = i2;
        this.e = z2;
        this.g = z3;
        this.k = z4;
    }
}
