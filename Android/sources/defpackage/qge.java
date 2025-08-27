package defpackage;

import android.util.Log;
import android.view.ViewGroup;
import androidx.fragment.app.a;
import androidx.fragment.app.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import kotlin.collections.CollectionsKt;

/* renamed from: qge  reason: default package */
public final class qge {
    public int a;
    public int b;
    public final a c;
    public final ArrayList d = new ArrayList();
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i = true;
    public final ArrayList j;
    public final ArrayList k;
    public final e l;

    public qge(int i2, int i3, e eVar) {
        a aVar = eVar.c;
        this.a = i2;
        this.b = i3;
        this.c = aVar;
        ArrayList arrayList = new ArrayList();
        this.j = arrayList;
        this.k = arrayList;
        this.l = eVar;
    }

    public final void a(ViewGroup viewGroup) {
        this.h = false;
        if (!this.e) {
            this.e = true;
            if (this.j.isEmpty()) {
                b();
                return;
            }
            for (pge pge : CollectionsKt.toList(this.k)) {
                if (!pge.b) {
                    pge.a(viewGroup);
                }
                pge.b = true;
            }
        }
    }

    public final void b() {
        this.h = false;
        if (!this.f) {
            if (Log.isLoggable("FragmentManager", 2)) {
                toString();
            }
            this.f = true;
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        this.c.w0 = false;
        this.l.k();
    }

    public final void c(pge pge) {
        ArrayList arrayList = this.j;
        if (arrayList.remove(pge) && arrayList.isEmpty()) {
            b();
        }
    }

    public final void d(int i2, int i3) {
        int y = tr1.y(i3);
        a aVar = this.c;
        if (y != 0) {
            if (y != 1) {
                if (y == 2) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Objects.toString(aVar);
                    }
                    this.a = 1;
                    this.b = 3;
                    this.i = true;
                }
            } else if (this.a == 1) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Objects.toString(aVar);
                }
                this.a = 2;
                this.b = 2;
                this.i = true;
            }
        } else if (this.a != 1) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Objects.toString(aVar);
            }
            this.a = i2;
        }
    }

    public final String toString() {
        StringBuilder p = tr1.p("Operation {", Integer.toHexString(System.identityHashCode(this)), "} {finalState = ");
        int i2 = this.a;
        p.append(i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "null" : "INVISIBLE" : "GONE" : "VISIBLE" : "REMOVED");
        p.append(" lifecycleImpact = ");
        int i3 = this.b;
        p.append(i3 != 1 ? i3 != 2 ? i3 != 3 ? "null" : "REMOVING" : "ADDING" : "NONE");
        p.append(" fragment = ");
        p.append(this.c);
        p.append('}');
        return p.toString();
    }
}
