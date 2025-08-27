package defpackage;

import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: esf  reason: default package */
public abstract class esf {
    public static final u90 a = new u90();
    public static final ThreadLocal b = new ThreadLocal();
    public static final ArrayList c = new ArrayList();

    /* JADX WARNING: type inference failed for: r0v7, types: [dsf, android.view.ViewTreeObserver$OnPreDrawListener, java.lang.Object, android.view.View$OnAttachStateChangeListener] */
    public static void a(ViewGroup viewGroup, yrf yrf) {
        ArrayList arrayList = c;
        if (!arrayList.contains(viewGroup) && viewGroup.isLaidOut()) {
            arrayList.add(viewGroup);
            if (yrf == null) {
                yrf = a;
            }
            yrf l = yrf.clone();
            ArrayList arrayList2 = (ArrayList) c().get(viewGroup);
            if (arrayList2 != null && arrayList2.size() > 0) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((yrf) it.next()).B(viewGroup);
                }
            }
            if (l != null) {
                l.j(viewGroup, true);
            }
            rae.w(viewGroup.getTag(yfc.transition_current_scene));
            viewGroup.setTag(yfc.transition_current_scene, (Object) null);
            ? obj = new Object();
            obj.a = l;
            obj.b = viewGroup;
            viewGroup.addOnAttachStateChangeListener(obj);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(obj);
        }
    }

    public static void b(ViewGroup viewGroup) {
        c.remove(viewGroup);
        ArrayList arrayList = (ArrayList) c().get(viewGroup);
        if (arrayList != null && !arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(arrayList);
            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                ((yrf) arrayList2.get(size)).q(viewGroup);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [qae, java.lang.Object, ts] */
    public static ts c() {
        ts tsVar;
        ThreadLocal threadLocal = b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (tsVar = (ts) weakReference.get()) != null) {
            return tsVar;
        }
        ? qae = new qae();
        threadLocal.set(new WeakReference(qae));
        return qae;
    }
}
