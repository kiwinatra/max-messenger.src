package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: sv0  reason: default package */
public abstract class sv0 {
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final String c;
    public final mz4 d;
    public final ekd e;
    public final qv0 f = new qv0(0);
    public final qv0 g = new qv0(1);
    public final ConcurrentHashMap h = new ConcurrentHashMap();

    public sv0() {
        mz4 mz4 = mz4.w;
        ekd ekd = ekd.v;
        this.d = mz4;
        this.c = "default";
        this.e = ekd;
    }

    public static void a(Object obj, t85 t85) {
        try {
            t85.a(obj);
        } catch (InvocationTargetException e2) {
            e("Could not dispatch event: " + obj.getClass() + " to handler " + t85, e2);
            throw null;
        }
    }

    public static void b(t85 t85, d95 d95) {
        try {
            Object a2 = d95.a();
            if (a2 != null) {
                a(a2, t85);
            }
        } catch (InvocationTargetException e2) {
            e("Producer " + d95 + " threw an exception.", e2);
            throw null;
        }
    }

    public static void e(String str, InvocationTargetException invocationTargetException) {
        Throwable cause = invocationTargetException.getCause();
        if (cause != null) {
            StringBuilder m = g63.m(str, ": ");
            m.append(cause.getMessage());
            throw new RuntimeException(m.toString(), cause);
        }
        StringBuilder m2 = g63.m(str, ": ");
        m2.append(invocationTargetException.getMessage());
        throw new RuntimeException(m2.toString(), invocationTargetException);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.util.Set} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(java.lang.Object r8) {
        /*
            r7 = this;
            if (r8 == 0) goto L_0x00d6
            r0 = r7
            jd8 r0 = (defpackage.jd8) r0
            mz4 r1 = r7.d
            r1.s(r0)
            java.lang.Class r1 = r8.getClass()
            java.util.concurrent.ConcurrentHashMap r2 = r7.h
            java.lang.Object r3 = r2.get(r1)
            java.util.Set r3 = (java.util.Set) r3
            r4 = 0
            if (r3 != 0) goto L_0x0049
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            r3.add(r1)
        L_0x0026:
            boolean r6 = r3.isEmpty()
            if (r6 != 0) goto L_0x003f
            java.lang.Object r6 = r3.remove(r4)
            java.lang.Class r6 = (java.lang.Class) r6
            r5.add(r6)
            java.lang.Class r6 = r6.getSuperclass()
            if (r6 == 0) goto L_0x0026
            r3.add(r6)
            goto L_0x0026
        L_0x003f:
            java.lang.Object r1 = r2.putIfAbsent(r1, r5)
            r3 = r1
            java.util.Set r3 = (java.util.Set) r3
            if (r3 != 0) goto L_0x0049
            r3 = r5
        L_0x0049:
            java.util.Iterator r1 = r3.iterator()
        L_0x004d:
            boolean r2 = r1.hasNext()
            qv0 r3 = r7.f
            if (r2 == 0) goto L_0x008d
            java.lang.Object r2 = r1.next()
            java.lang.Class r2 = (java.lang.Class) r2
            java.util.concurrent.ConcurrentHashMap r5 = r7.a
            java.lang.Object r2 = r5.get(r2)
            java.util.Set r2 = (java.util.Set) r2
            if (r2 == 0) goto L_0x004d
            boolean r5 = r2.isEmpty()
            if (r5 != 0) goto L_0x004d
            java.util.Iterator r2 = r2.iterator()
        L_0x006f:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x008a
            java.lang.Object r4 = r2.next()
            t85 r4 = (defpackage.t85) r4
            java.lang.Object r5 = r3.get()
            java.util.concurrent.ConcurrentLinkedQueue r5 = (java.util.concurrent.ConcurrentLinkedQueue) r5
            rv0 r6 = new rv0
            r6.<init>(r8, r4)
            r5.offer(r6)
            goto L_0x006f
        L_0x008a:
            r2 = 1
            r4 = r2
            goto L_0x004d
        L_0x008d:
            if (r4 != 0) goto L_0x009b
            boolean r1 = r8 instanceof defpackage.s84
            if (r1 != 0) goto L_0x009b
            s84 r1 = new s84
            r1.<init>(r0, r8)
            r7.c(r1)
        L_0x009b:
            qv0 r7 = r7.g
            java.lang.Object r8 = r7.get()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x00aa
            goto L_0x00c2
        L_0x00aa:
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            r7.set(r8)
        L_0x00af:
            java.lang.Object r8 = r3.get()     // Catch:{ all -> 0x00cf }
            java.util.concurrent.ConcurrentLinkedQueue r8 = (java.util.concurrent.ConcurrentLinkedQueue) r8     // Catch:{ all -> 0x00cf }
            java.lang.Object r8 = r8.poll()     // Catch:{ all -> 0x00cf }
            rv0 r8 = (defpackage.rv0) r8     // Catch:{ all -> 0x00cf }
            if (r8 != 0) goto L_0x00c3
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            r7.set(r8)
        L_0x00c2:
            return
        L_0x00c3:
            t85 r0 = r8.b     // Catch:{ all -> 0x00cf }
            boolean r1 = r0.d     // Catch:{ all -> 0x00cf }
            if (r1 == 0) goto L_0x00af
            java.lang.Object r8 = r8.a     // Catch:{ all -> 0x00cf }
            a(r8, r0)     // Catch:{ all -> 0x00cf }
            goto L_0x00af
        L_0x00cf:
            r8 = move-exception
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r7.set(r0)
            throw r8
        L_0x00d6:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            java.lang.String r8 = "Event to post must not be null."
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sv0.c(java.lang.Object):void");
    }

    public void d(Object obj) {
        if (obj != null) {
            this.d.s((jd8) this);
            ekd ekd = this.e;
            HashMap g2 = ekd.g(obj);
            Iterator it = g2.keySet().iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                ConcurrentHashMap concurrentHashMap = this.b;
                ConcurrentHashMap concurrentHashMap2 = this.a;
                if (hasNext) {
                    Class cls = (Class) it.next();
                    d95 d95 = (d95) g2.get(cls);
                    d95 d952 = (d95) concurrentHashMap.putIfAbsent(cls, d95);
                    if (d952 == null) {
                        Set<t85> set = (Set) concurrentHashMap2.get(cls);
                        if (set != null && !set.isEmpty()) {
                            for (t85 b2 : set) {
                                b(b2, d95);
                            }
                        }
                    } else {
                        throw new IllegalArgumentException("Producer method for type " + cls + " found on type " + d95.a.getClass() + ", but already registered by type " + d952.a.getClass() + ".");
                    }
                } else {
                    HashMap h2 = ekd.h(obj);
                    for (Class cls2 : h2.keySet()) {
                        Set set2 = (Set) concurrentHashMap2.get(cls2);
                        if (set2 == null) {
                            set2 = new CopyOnWriteArraySet();
                            Set set3 = (Set) concurrentHashMap2.putIfAbsent(cls2, set2);
                            if (set3 != null) {
                                set2 = set3;
                            }
                        }
                        if (!set2.addAll((Set) h2.get(cls2))) {
                            throw new IllegalArgumentException("Object already registered.");
                        }
                    }
                    for (Map.Entry entry : h2.entrySet()) {
                        d95 d953 = (d95) concurrentHashMap.get((Class) entry.getKey());
                        if (d953 != null && d953.d) {
                            for (t85 t85 : (Set) entry.getValue()) {
                                if (!d953.d) {
                                    break;
                                } else if (t85.d) {
                                    b(t85, d953);
                                }
                            }
                        }
                    }
                    return;
                }
            }
        } else {
            throw new NullPointerException("Object to register must not be null.");
        }
    }

    public void f(Object obj) {
        if (obj != null) {
            this.d.s((jd8) this);
            ekd ekd = this.e;
            for (Map.Entry entry : ekd.g(obj).entrySet()) {
                Class cls = (Class) entry.getKey();
                ConcurrentHashMap concurrentHashMap = this.b;
                d95 d95 = (d95) concurrentHashMap.get(cls);
                d95 d952 = (d95) entry.getValue();
                if (d952 == null || !d952.equals(d95)) {
                    throw new IllegalArgumentException("Missing event producer for an annotated method. Is " + obj.getClass() + " registered?");
                }
                ((d95) concurrentHashMap.remove(cls)).d = false;
            }
            for (Map.Entry entry2 : ekd.h(obj).entrySet()) {
                Set<t85> set = (Set) this.a.get((Class) entry2.getKey());
                Collection collection = (Collection) entry2.getValue();
                if (set == null || !set.containsAll(collection)) {
                    throw new IllegalArgumentException("Missing event handler for an annotated method. Is " + obj.getClass() + " registered?");
                }
                for (t85 t85 : set) {
                    if (collection.contains(t85)) {
                        t85.d = false;
                    }
                }
                set.removeAll(collection);
            }
            return;
        }
        throw new NullPointerException("Object to unregister must not be null.");
    }

    public final String toString() {
        return wj6.n(new StringBuilder("[Bus \""), this.c, "\"]");
    }
}
