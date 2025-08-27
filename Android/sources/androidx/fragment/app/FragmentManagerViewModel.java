package androidx.fragment.app;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

final class FragmentManagerViewModel extends yag {
    public static final d i = new Object();
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public final HashMap e = new HashMap();
    public final boolean f;
    public boolean g = false;
    public boolean h = false;

    public FragmentManagerViewModel(boolean z) {
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || FragmentManagerViewModel.class != obj.getClass()) {
            return false;
        }
        FragmentManagerViewModel fragmentManagerViewModel = (FragmentManagerViewModel) obj;
        return this.c.equals(fragmentManagerViewModel.c) && this.d.equals(fragmentManagerViewModel.d) && this.e.equals(fragmentManagerViewModel.e);
    }

    public final int hashCode() {
        int hashCode = this.d.hashCode();
        return this.e.hashCode() + ((hashCode + (this.c.hashCode() * 31)) * 31);
    }

    public final void i() {
        if (Log.isLoggable("FragmentManager", 3)) {
            toString();
        }
        this.g = true;
    }

    public final void j(a aVar) {
        if (!this.h) {
            HashMap hashMap = this.c;
            if (!hashMap.containsKey(aVar.w)) {
                hashMap.put(aVar.w, aVar);
                if (Log.isLoggable("FragmentManager", 2)) {
                    aVar.toString();
                }
            }
        }
    }

    public final void k(String str, boolean z) {
        HashMap hashMap = this.d;
        FragmentManagerViewModel fragmentManagerViewModel = (FragmentManagerViewModel) hashMap.get(str);
        if (fragmentManagerViewModel != null) {
            if (z) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(fragmentManagerViewModel.d.keySet());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    fragmentManagerViewModel.k((String) it.next(), true);
                }
            }
            fragmentManagerViewModel.i();
            hashMap.remove(str);
        }
        HashMap hashMap2 = this.e;
        gbg gbg = (gbg) hashMap2.get(str);
        if (gbg != null) {
            gbg.a();
            hashMap2.remove(str);
        }
    }

    public final void l(a aVar) {
        if (!this.h && this.c.remove(aVar.w) != null && Log.isLoggable("FragmentManager", 2)) {
            aVar.toString();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.c.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.d.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.e.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
