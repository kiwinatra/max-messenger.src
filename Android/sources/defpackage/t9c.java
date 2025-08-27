package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: t9c  reason: default package */
public final /* synthetic */ class t9c implements vma, u2f {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ t9c(int i, Context context, boolean z) {
        this.a = i;
        this.b = context;
        this.c = z;
    }

    public void a(Object obj) {
        Void voidR = (Void) obj;
        SharedPreferences.Editor edit = te8.l(this.b).edit();
        edit.putBoolean("proxy_retention", this.c);
        edit.apply();
    }

    public Object get() {
        switch (this.a) {
            case 1:
                return ghf.r(this.b, false, this.c);
            case 2:
                return ghf.r(this.b, true, this.c);
            default:
                return ghf.t(this.b, this.c);
        }
    }
}
