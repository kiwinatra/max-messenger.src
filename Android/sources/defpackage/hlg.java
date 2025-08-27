package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.coroutines.jvm.internal.Boxing;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: hlg  reason: default package */
public final class hlg implements olg {
    public final long a;
    public final long b;
    public final Context c;
    public final int d;

    public hlg(long j, long j2, Context context, bud bud) {
        this.a = j;
        this.b = j2;
        this.c = context;
        akd akd = (akd) bud;
        akd.getClass();
        this.d = (int) akd.r(PmsKey.f120webappdskeyscount, (long) 100);
    }

    public final Boolean a(String str, String str2) {
        SharedPreferences b2 = b();
        if (b2.contains(str)) {
            b2.edit().putString(str, str2).apply();
        } else if (b2.getAll().size() == this.d) {
            return Boxing.boxBoolean(false);
        } else {
            b2.edit().putString(str, str2).apply();
        }
        return Boxing.boxBoolean(true);
    }

    public final SharedPreferences b() {
        return this.c.getApplicationContext().getSharedPreferences("webapp_ds_" + this.b + "_" + this.a, 0);
    }

    public final Boolean clear() {
        SharedPreferences b2 = b();
        if (b2.getAll().isEmpty()) {
            return Boxing.boxBoolean(false);
        }
        b2.edit().clear().apply();
        return Boxing.boxBoolean(true);
    }

    public final String get(String str) {
        return b().getString(str, (String) null);
    }

    public final Boolean remove(String str) {
        SharedPreferences b2 = b();
        if (!b2.contains(str)) {
            return Boxing.boxBoolean(false);
        }
        b2.edit().remove(str).apply();
        return Boxing.boxBoolean(true);
    }
}
