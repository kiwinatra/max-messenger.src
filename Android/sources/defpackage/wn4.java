package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;

/* renamed from: wn4  reason: default package */
public abstract class wn4 {
    public static final String a = h88.V("DiagnosticsWrkr");

    /* JADX INFO: finally extract failed */
    public static final String a(npg npg, aqg aqg, m7f m7f, ArrayList arrayList) {
        StringBuilder sb = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            xpg xpg = (xpg) it.next();
            l7f m = m7f.m(m5a.z(xpg));
            Integer valueOf = m != null ? Integer.valueOf(m.c) : null;
            npg.getClass();
            d7d a2 = d7d.a(1, "SELECT name FROM workname WHERE work_spec_id=?");
            String str = xpg.a;
            if (str == null) {
                a2.X(1);
            } else {
                a2.h(1, str);
            }
            i6d i6d = (i6d) npg.b;
            i6d.b();
            Cursor o = i6d.o(a2, (CancellationSignal) null);
            try {
                ArrayList arrayList2 = new ArrayList(o.getCount());
                while (o.moveToNext()) {
                    arrayList2.add(o.isNull(0) ? null : o.getString(0));
                }
                o.close();
                a2.o();
                String p = CollectionsKt___CollectionsKt.joinToString$default(arrayList2, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
                String p2 = CollectionsKt___CollectionsKt.joinToString$default(aqg.k(str), ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
                StringBuilder p3 = tr1.p("\n", str, "\t ");
                p3.append(xpg.c);
                p3.append("\t ");
                p3.append(valueOf);
                p3.append("\t ");
                p3.append(xpg.b.name());
                p3.append("\t ");
                p3.append(p);
                p3.append("\t ");
                p3.append(p2);
                p3.append(9);
                sb.append(p3.toString());
            } catch (Throwable th) {
                o.close();
                a2.o();
                throw th;
            }
        }
        return sb.toString();
    }
}
