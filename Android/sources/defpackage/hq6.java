package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.jvm.internal.Reflection;

/* renamed from: hq6  reason: default package */
public final class hq6 {
    public static final String d = Reflection.getOrCreateKotlinClass(hq6.class).getSimpleName();
    public final Context a;
    public final Lazy b;
    public final Lazy c;

    public hq6(Context context, Lazy lazy, Lazy lazy2) {
        this.a = context;
        this.b = lazy;
        this.c = lazy2;
    }

    public final String a(a32 a32) {
        z68.c(d, "execute: " + a32, new Object[0]);
        long j = a32.b.a;
        ArrayList arrayList = new ArrayList();
        for (Object next : ((ia2) ((u82) this.b.getValue())).X.values()) {
            Iterable iterable = ((zx5) next).v;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it = iterable.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((a32) it.next()).b.a == j) {
                            arrayList.add(next);
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            if (!((zx5) next2).b()) {
                arrayList2.add(next2);
            }
        }
        return arrayList2.isEmpty() ? this.a.getString(qad.m5) : CollectionsKt___CollectionsKt.joinToString$default(arrayList2, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, "…", new rx2(24, this), 15, (Object) null);
    }
}
