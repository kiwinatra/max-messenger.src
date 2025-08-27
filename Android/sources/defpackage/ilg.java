package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.security.KeyStore;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.Boxing;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: ilg  reason: default package */
public final class ilg implements olg {
    public final long a;
    public final long b;
    public final Context c;
    public final tgg d;
    public final int e;
    public final String f = ilg.class.getName();

    /* JADX WARNING: type inference failed for: r0v0, types: [tgg, java.lang.Object] */
    public ilg(long j, long j2, Context context, bud bud) {
        StringBuilder n = tr1.n(j2, "webapp_s_key_", "_");
        n.append(j);
        String sb = n.toString();
        ? obj = new Object();
        obj.a = sb;
        obj.b = tgg.class.getName();
        obj.c = LazyKt.lazy(new i2g(7));
        obj.o = LazyKt.lazy(new i2g(8));
        this.a = j;
        this.b = j2;
        this.c = context;
        this.d = obj;
        akd akd = (akd) bud;
        akd.getClass();
        this.e = (int) akd.r(PmsKey.f121webappsskeyscount, (long) 10);
    }

    public final Boolean a(String str, String str2) {
        Object obj;
        SharedPreferences b2 = b();
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.m23constructorimpl(this.d.s(str2));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.m23constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m29isFailureimpl(obj)) {
            z68.o(this.f, "Can't encrypt value", Result.m26exceptionOrNullimpl(obj));
            return Boxing.boxBoolean(false);
        }
        ResultKt.throwOnFailure(obj);
        String str3 = (String) obj;
        if (b2.contains(str)) {
            b2.edit().putString(str, str3).apply();
        } else if (b2.getAll().size() == this.e) {
            return Boxing.boxBoolean(false);
        } else {
            b2.edit().putString(str, str3).apply();
        }
        return Boxing.boxBoolean(true);
    }

    public final SharedPreferences b() {
        return this.c.getApplicationContext().getSharedPreferences("webapp_ss_" + this.b + "_" + this.a, 0);
    }

    public final Boolean clear() {
        Object obj;
        SharedPreferences b2 = b();
        if (b2.getAll().isEmpty()) {
            return Boxing.boxBoolean(false);
        }
        tgg tgg = this.d;
        tgg.getClass();
        try {
            Result.Companion companion = Result.Companion;
            ((KeyStore) ((Lazy) tgg.c).getValue()).deleteEntry((String) tgg.a);
            obj = Result.m23constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.m23constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m26exceptionOrNullimpl(obj) != null) {
            z68.p((String) tgg.b, "Can't remove secret key");
        }
        b2.edit().clear().apply();
        return Boxing.boxBoolean(true);
    }

    public final String get(String str) {
        Object obj;
        String str2 = null;
        String string = b().getString(str, (String) null);
        if (string == null) {
            return null;
        }
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.m23constructorimpl(this.d.r(string));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.m23constructorimpl(ResultKt.createFailure(th));
        }
        if (!Result.m29isFailureimpl(obj)) {
            str2 = obj;
        }
        return str2;
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
