package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: yb6  reason: default package */
public final class yb6 implements f3d {
    public final ArrayList a;

    public yb6(Set set) {
        if (set == null) {
            this.a = new ArrayList();
            return;
        }
        ArrayList arrayList = new ArrayList(set.size());
        this.a = arrayList;
        CollectionsKt___CollectionsKt.filterNotNullTo(set, arrayList);
    }

    public final void a(yvb yvb, String str, Map map) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((f3d) it.next()).a(yvb, str, map);
            } catch (Exception e) {
                bg5.d("ForwardingRequestListener2", "InternalListener exception in onProducerFinishWithSuccess", e);
            }
        }
    }

    public final void b(yvb yvb) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((f3d) it.next()).b(yvb);
            } catch (Exception e) {
                bg5.d("ForwardingRequestListener2", "InternalListener exception in onIntermediateChunkStart", e);
            }
        }
    }

    public final void c(yvb yvb) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((f3d) it.next()).c(yvb);
            } catch (Exception e) {
                bg5.d("ForwardingRequestListener2", "InternalListener exception in onRequestStart", e);
            }
        }
    }

    public final void d(yvb yvb, String str, Throwable th, Map map) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((f3d) it.next()).d(yvb, str, th, map);
            } catch (Exception e) {
                bg5.d("ForwardingRequestListener2", "InternalListener exception in onProducerFinishWithFailure", e);
            }
        }
    }

    public final void e(yvb yvb, String str, boolean z) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((f3d) it.next()).e(yvb, str, z);
            } catch (Exception e) {
                bg5.d("ForwardingRequestListener2", "InternalListener exception in onProducerFinishWithSuccess", e);
            }
        }
    }

    public final void f(yvb yvb, Throwable th) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((f3d) it.next()).f(yvb, th);
            } catch (Exception e) {
                bg5.d("ForwardingRequestListener2", "InternalListener exception in onRequestFailure", e);
            }
        }
    }

    public final void g(yvb yvb) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((f3d) it.next()).g(yvb);
            } catch (Exception e) {
                bg5.d("ForwardingRequestListener2", "InternalListener exception in onRequestSuccess", e);
            }
        }
    }

    public final void h(yvb yvb) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((f3d) it.next()).h(yvb);
            } catch (Exception e) {
                bg5.d("ForwardingRequestListener2", "InternalListener exception in onRequestCancellation", e);
            }
        }
    }

    public final boolean i(yvb yvb, String str) {
        ArrayList arrayList = this.a;
        if ((arrayList instanceof Collection) && arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((f3d) it.next()).i(yvb, str)) {
                return true;
            }
        }
        return false;
    }

    public final void j(yvb yvb, String str) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((f3d) it.next()).j(yvb, str);
            } catch (Exception e) {
                bg5.d("ForwardingRequestListener2", "InternalListener exception in onProducerStart", e);
            }
        }
    }

    public final void k(yvb yvb, String str) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((f3d) it.next()).k(yvb, str);
            } catch (Exception e) {
                bg5.d("ForwardingRequestListener2", "InternalListener exception in onProducerFinishWithCancellation", e);
            }
        }
    }
}
