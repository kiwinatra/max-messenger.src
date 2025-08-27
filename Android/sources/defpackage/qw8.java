package defpackage;

import android.content.ComponentName;
import java.util.ArrayList;

/* renamed from: qw8  reason: default package */
public final class qw8 {
    public final iw8 a;
    public final ArrayList b = new ArrayList();
    public final vs6 c;
    public jw8 d;

    public qw8(iw8 iw8) {
        this.a = iw8;
        this.c = iw8.b;
    }

    public final rw8 a(String str) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((rw8) arrayList.get(i)).b.equals(str)) {
                return (rw8) arrayList.get(i);
            }
        }
        return null;
    }

    public final String toString() {
        return "MediaRouter.RouteProviderInfo{ packageName=" + ((ComponentName) this.c.b).getPackageName() + " }";
    }
}
