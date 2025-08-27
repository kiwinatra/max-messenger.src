package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: isf  reason: default package */
public final class isf {
    public final HashMap a = new HashMap();
    public final View b;
    public final ArrayList c = new ArrayList();

    public isf(View view) {
        this.b = view;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r3 = (defpackage.isf) r3;
        r0 = r3.b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof defpackage.isf
            if (r0 == 0) goto L_0x0018
            isf r3 = (defpackage.isf) r3
            android.view.View r0 = r3.b
            android.view.View r1 = r2.b
            if (r1 != r0) goto L_0x0018
            java.util.HashMap r2 = r2.a
            java.util.HashMap r3 = r3.a
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0018
            r2 = 1
            return r2
        L_0x0018:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.isf.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder m = g63.m("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        m.append(this.b);
        m.append("\n");
        String j = tr1.j(m.toString(), "    values:");
        HashMap hashMap = this.a;
        for (String str : hashMap.keySet()) {
            j = j + "    " + str + ": " + hashMap.get(str) + "\n";
        }
        return j;
    }
}
