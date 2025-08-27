package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: zb6  reason: default package */
public final class zb6 implements g3d {
    public final ArrayList a;

    public zb6(Set set) {
        this.a = new ArrayList(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            g3d g3d = (g3d) it.next();
            if (g3d != null) {
                this.a.add(g3d);
            }
        }
    }

    public static void l(Exception exc, String str) {
        bg5.d("ForwardingRequestListener", str, exc);
    }

    public final void a(qa7 qa7, String str, boolean z) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((g3d) arrayList.get(i)).a(qa7, str, z);
            } catch (Exception e) {
                l(e, "InternalListener exception in onRequestSuccess");
            }
        }
    }

    public final void b(qa7 qa7, Object obj, String str, boolean z) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((g3d) arrayList.get(i)).b(qa7, obj, str, z);
            } catch (Exception e) {
                l(e, "InternalListener exception in onRequestStart");
            }
        }
    }

    public final void c(qa7 qa7, String str, Throwable th, boolean z) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((g3d) arrayList.get(i)).c(qa7, str, th, z);
            } catch (Exception e) {
                l(e, "InternalListener exception in onRequestFailure");
            }
        }
    }

    public final void d(String str, String str2) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((g3d) arrayList.get(i)).d(str, str2);
            } catch (Exception e) {
                l(e, "InternalListener exception in onProducerStart");
            }
        }
    }

    public final void e(String str, String str2) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((g3d) arrayList.get(i)).e(str, str2);
            } catch (Exception e) {
                l(e, "InternalListener exception in onProducerFinishWithCancellation");
            }
        }
    }

    public final void f(String str, String str2, boolean z) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((g3d) arrayList.get(i)).f(str, str2, z);
            } catch (Exception e) {
                l(e, "InternalListener exception in onProducerFinishWithSuccess");
            }
        }
    }

    public final void g(String str) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((g3d) arrayList.get(i)).g(str);
            } catch (Exception e) {
                l(e, "InternalListener exception in onIntermediateChunkStart");
            }
        }
    }

    public final boolean h(String str) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((g3d) arrayList.get(i)).h(str)) {
                return true;
            }
        }
        return false;
    }

    public final void i(String str, String str2, Map map) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((g3d) arrayList.get(i)).i(str, str2, map);
            } catch (Exception e) {
                l(e, "InternalListener exception in onProducerFinishWithSuccess");
            }
        }
    }

    public final void j(String str, String str2, Throwable th, Map map) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((g3d) arrayList.get(i)).j(str, str2, th, map);
            } catch (Exception e) {
                l(e, "InternalListener exception in onProducerFinishWithFailure");
            }
        }
    }

    public final void k(String str) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((g3d) arrayList.get(i)).k(str);
            } catch (Exception e) {
                l(e, "InternalListener exception in onRequestCancellation");
            }
        }
    }

    public zb6(g3d... g3dArr) {
        this.a = new ArrayList(g3dArr.length);
        for (g3d g3d : g3dArr) {
            if (g3d != null) {
                this.a.add(g3d);
            }
        }
    }
}
