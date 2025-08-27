package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;

/* renamed from: gm  reason: default package */
public final class gm {
    public final ArrayList a = new ArrayList();
    public boolean b = true;
    public boolean c;
    public boolean d;
    public boolean e;

    public final void a(fm fmVar) {
        this.a.add(fmVar);
        this.b &= fmVar.a();
        this.c |= fmVar.c();
        this.d |= !fmVar.b();
        this.e = fmVar.b() | this.e;
    }

    public final void b(String str, String str2) {
        a(new dye(str, str2));
    }

    public final void c(zp7 zp7) {
        if (this.d) {
            ArrayList arrayList = this.a;
            if (arrayList.size() > 1) {
                CollectionsKt.sortWith(arrayList, new cx4(8));
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                fm fmVar = (fm) it.next();
                if (!fmVar.b()) {
                    fmVar.d(zp7);
                }
            }
        }
    }

    public final void d(zp7 zp7) {
        if (this.e) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                fm fmVar = (fm) it.next();
                if (fmVar.b()) {
                    fmVar.d(zp7);
                }
            }
        }
    }
}
