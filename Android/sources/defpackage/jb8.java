package defpackage;

import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

/* renamed from: jb8  reason: default package */
public final class jb8 {
    public LinkedList a;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: hb8} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.hb8 r6) {
        /*
            r5 = this;
            java.util.LinkedList r0 = r5.a
            if (r0 == 0) goto L_0x008d
            java.util.Iterator r0 = r0.descendingIterator()
            if (r0 != 0) goto L_0x000c
            goto L_0x008d
        L_0x000c:
            r1 = 0
            r2 = r1
        L_0x000e:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x004c
            java.lang.Object r3 = r0.next()
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            java.lang.Object r3 = r3.get()
            hb8 r3 = (defpackage.hb8) r3
            if (r3 != 0) goto L_0x0026
            r0.remove()
            goto L_0x000e
        L_0x0026:
            if (r2 != 0) goto L_0x0029
            r2 = r3
        L_0x0029:
            if (r3 != r6) goto L_0x000e
            if (r2 != r6) goto L_0x0048
            java.util.Set r3 = r6.a
            if (r3 != 0) goto L_0x0032
            goto L_0x0048
        L_0x0032:
            java.util.Iterator r3 = r3.iterator()
        L_0x0036:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0048
            java.lang.Object r4 = r3.next()
            fb8 r4 = (defpackage.fb8) r4
            db8 r4 = (defpackage.db8) r4
            r4.stopAnimation()
            goto L_0x0036
        L_0x0048:
            r0.remove()
            goto L_0x000e
        L_0x004c:
            java.util.LinkedList r5 = r5.a
            if (r5 == 0) goto L_0x0070
            java.util.Iterator r5 = r5.descendingIterator()
            if (r5 != 0) goto L_0x0057
            goto L_0x0070
        L_0x0057:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0070
            java.lang.Object r6 = r5.next()
            java.lang.ref.WeakReference r6 = (java.lang.ref.WeakReference) r6
            java.lang.Object r6 = r6.get()
            r1 = r6
            hb8 r1 = (defpackage.hb8) r1
            if (r1 != 0) goto L_0x0070
            r5.remove()
            goto L_0x0057
        L_0x0070:
            if (r1 == 0) goto L_0x008d
            java.util.Set r5 = r1.a
            if (r5 != 0) goto L_0x0077
            goto L_0x008d
        L_0x0077:
            java.util.Iterator r5 = r5.iterator()
        L_0x007b:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x008d
            java.lang.Object r6 = r5.next()
            fb8 r6 = (defpackage.fb8) r6
            db8 r6 = (defpackage.db8) r6
            r6.playAnimation()
            goto L_0x007b
        L_0x008d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jb8.a(hb8):void");
    }

    public final void b(hb8 hb8) {
        Set<fb8> set;
        LinkedList linkedList = this.a;
        WeakReference weakReference = null;
        if (linkedList == null) {
            this.a = new LinkedList();
        } else {
            Iterator descendingIterator = linkedList.descendingIterator();
            if (descendingIterator != null) {
                hb8 hb82 = null;
                while (descendingIterator.hasNext()) {
                    WeakReference weakReference2 = (WeakReference) descendingIterator.next();
                    hb8 hb83 = (hb8) weakReference2.get();
                    if (hb83 == null) {
                        descendingIterator.remove();
                    } else {
                        if (hb82 == null) {
                            if (!(hb83 == hb8 || (set = hb83.a) == null)) {
                                for (fb8 fb8 : set) {
                                    ((db8) fb8).stopAnimation();
                                }
                            }
                            hb82 = hb83;
                        }
                        if (hb83 == hb8) {
                            descendingIterator.remove();
                            weakReference = weakReference2;
                        }
                    }
                }
            } else {
                return;
            }
        }
        if (weakReference == null) {
            weakReference = new WeakReference(hb8);
        }
        LinkedList linkedList2 = this.a;
        if (linkedList2 != null) {
            linkedList2.add(weakReference);
        }
        Set<fb8> set2 = hb8.a;
        if (set2 != null) {
            for (fb8 fb82 : set2) {
                ((db8) fb82).playAnimation();
            }
        }
    }
}
