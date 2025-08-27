package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: o21  reason: default package */
public final class o21 implements pm, tm {
    public final Lazy a;
    public final Lazy b;
    public final Lazy c;

    public /* synthetic */ o21(Lazy lazy, Lazy lazy2, Lazy lazy3) {
        this.a = lazy;
        this.b = lazy2;
        this.c = lazy3;
    }

    public x23 a() {
        return (x23) this.a.getValue();
    }

    public sm e() {
        String str = (String) ev0.C(EmptyCoroutineContext.INSTANCE, new n21(this, (Continuation) null));
        akd akd = (akd) ((bud) this.b.getValue());
        akd.getClass();
        String z = akd.z(PmsKey.f15callsendpoint, (String) null);
        if (z == null) {
            z = "";
        }
        return new sm(str, z);
    }

    public om getSessionInfo() {
        try {
            qjd qjd = (qjd) a();
            qjd.getClass();
            List arrayList = new ArrayList();
            String string = qjd.g.getString("user.callSession", (String) null);
            if (string != null) {
                arrayList = Arrays.asList(TextUtils.split(string, ","));
            }
            Collection collection = arrayList;
            if (collection == null) {
                return null;
            }
            if (collection.isEmpty()) {
                return null;
            }
            if (arrayList.size() < 3) {
                return null;
            }
            return new om((String) arrayList.get(0), (String) arrayList.get(1), (String) arrayList.get(2));
        } catch (Throwable th) {
            z68.b("OKConfigStoreTag", "Call session info cache error: ", th);
            return null;
        }
    }

    public void setSessionInfo(om omVar) {
        if (omVar == null) {
            x23 a2 = a();
            List emptyList = CollectionsKt.emptyList();
            qjd qjd = (qjd) a2;
            qjd.getClass();
            String join = TextUtils.join(",", emptyList);
            cn5 cn5 = (cn5) qjd.g.edit();
            cn5.putString("user.callSession", join);
            cn5.apply();
            return;
        }
        x23 a3 = a();
        List listOf = CollectionsKt.listOf(omVar.a, omVar.b, omVar.c);
        qjd qjd2 = (qjd) a3;
        qjd2.getClass();
        String join2 = TextUtils.join(",", listOf);
        cn5 cn52 = (cn5) qjd2.g.edit();
        cn52.putString("user.callSession", join2);
        cn52.apply();
    }
}
