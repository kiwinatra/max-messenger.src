package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import ru.ok.tamtam.util.HandledException;

/* renamed from: rvd  reason: default package */
public final class rvd extends gud {
    public final Lazy b;
    public final Lazy c;
    public final Lazy o;
    public final Lazy v;
    public final Lazy w;
    public final Lazy x;
    public final jqg y;

    public rvd(Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4, Lazy lazy5, Lazy lazy6, jqg jqg) {
        this.b = lazy;
        this.c = lazy2;
        this.o = lazy3;
        this.v = lazy4;
        this.w = lazy5;
        this.x = lazy6;
        this.y = jqg;
    }

    public static void A(jqg jqg) {
        jqg.a(new rvd(jqg.a, jqg.d, jqg.b, jqg.e, jqg.f, jqg.g, jqg));
    }

    public final void B(hdb hdb) {
        try {
            hdb.c();
        } catch (Throwable th) {
            ((uta) ((m95) this.o.getValue())).c(new Exception("failed to execute onMaxFailCount method for task " + hdb.getId() + " type " + hdb.getType(), th), true);
        }
    }

    public final void z() {
        ArrayList arrayList;
        HashSet hashSet;
        Iterator it;
        boolean z;
        int i;
        boolean z2;
        Lazy lazy = this.o;
        Lazy lazy2 = this.b;
        try {
            if (((rh3) this.v.getValue()).e()) {
                boolean z3 = true;
                try {
                    arrayList = ((eef) lazy2.getValue()).l();
                } catch (Exception e) {
                    int k = ((eef) lazy2.getValue()).k();
                    z68.c("rvd", "process: selectWaitingAndFailedTaskCount count=%d", Integer.valueOf(k));
                    ((uta) ((m95) lazy.getValue())).c(new Exception("Exception during selectWaitingAndFailedTasks. Count=" + k + "; Exception: " + e.getMessage()), true);
                    arrayList = ((a74) ((s74) ((eef) lazy2.getValue()).a.get())).f.b().b(500, CollectionsKt.listOf(gef.WAITING, gef.FAILED));
                }
                int size = arrayList.size();
                z68.c("rvd", "selected taskIds count = " + size, new Object[0]);
                boolean z4 = false;
                if (size > 2000) {
                    StringBuilder sb = new StringBuilder();
                    Iterator it2 = ((eef) lazy2.getValue()).m().iterator();
                    while (it2.hasNext()) {
                        sdf sdf = (sdf) it2.next();
                        sb.append("t=");
                        sb.append(sdf.a);
                        sb.append(", c=");
                        sb.append(sdf.b);
                        sb.append("; ");
                    }
                    String sb2 = sb.toString();
                    ekd ekd = idb.b;
                    ((eef) lazy2.getValue()).f();
                    ArrayList l = ((eef) lazy2.getValue()).l();
                    ((uta) ((m95) lazy.getValue())).c(new HandledException("Too much tasks, count=%d. Count by type: %s", Integer.valueOf(size), sb2), false);
                    arrayList = l;
                }
                ArrayList arrayList2 = new ArrayList();
                HashSet hashSet2 = new HashSet();
                HashSet hashSet3 = new HashSet();
                Iterator it3 = arrayList.iterator();
                boolean z5 = false;
                while (it3.hasNext()) {
                    tdf j = ((eef) lazy2.getValue()).j(((Long) it3.next()).longValue());
                    if (j != null) {
                        z68.c("rvd", "process task: %s", j.f.getClass().getName());
                        hdb hdb = j.f;
                        if (hdb instanceof gud) {
                            ((gud) hdb).a = (hud) this.w.getValue();
                        } else if (hdb instanceof qm) {
                            ((qm) hdb).c = (rm) this.x.getValue();
                        } else {
                            throw new IllegalStateException("unknown task! " + j.f.getClass());
                        }
                        if (j.b != gef.FAILED || j.c < j.f.f()) {
                            if (j.e != 0) {
                                long j2 = j.d;
                                if (!(j2 == 0 || ((eef) lazy2.getValue()).j(j2) == null || j.e != z3)) {
                                }
                            }
                            boolean z6 = j.f.getType() == idb.TYPE_SYNC_CHAT_HISTORY ? z3 : z4;
                            if (z6) {
                                qvd qvd = (qvd) j.f;
                                bl4 bl4 = qvd.v;
                                hashSet = hashSet3;
                                long j3 = qvd.c;
                                HashSet hashSet4 = bl4 == bl4.REGULAR ? hashSet2 : hashSet;
                                if (hashSet4.contains(Long.valueOf(j3))) {
                                    z68.c("rvd", "task <%s> already in list, delete it!", qvd.w);
                                    arrayList2.add(j);
                                } else {
                                    hashSet4.add(Long.valueOf(j3));
                                }
                                if (z5) {
                                    it = it3;
                                    z = true;
                                    z3 = z;
                                    it3 = it;
                                    hashSet3 = hashSet;
                                    z4 = false;
                                }
                            } else {
                                hashSet = hashSet3;
                            }
                            try {
                                i = j.f.b();
                                it = it3;
                                z = true;
                            } catch (Throwable th) {
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append("failed to execute onPreExecute method for task ");
                                it = it3;
                                sb3.append(j.f.getId());
                                sb3.append(" type ");
                                sb3.append(j.f.getType());
                                String sb4 = sb3.toString();
                                z68.f("rvd", sb4, th);
                                B(j.f);
                                Exception exc = new Exception(sb4, th);
                                z = true;
                                ((uta) ((m95) lazy.getValue())).c(exc, true);
                                i = 3;
                            }
                            if (i == 2) {
                                ((eef) lazy2.getValue()).n(j.a, gef.WAITING);
                                if (z6) {
                                    z3 = z;
                                    z5 = z3;
                                    it3 = it;
                                    hashSet3 = hashSet;
                                    z4 = false;
                                } else {
                                    z68.c("rvd", "task " + j + " skip", new Object[0]);
                                }
                            } else if (i == 3) {
                                z68.c("rvd", "task " + j + " will be removed, reason: onPreExecute returned REMOVE", new Object[0]);
                                arrayList2.add(j);
                            } else {
                                ((eef) lazy2.getValue()).n(j.a, gef.PROCESSING);
                                if (z6) {
                                    z5 = z;
                                }
                                if (j.c > 0) {
                                    z68.c("rvd", "task " + j + " retry", new Object[0]);
                                    z2 = z;
                                } else {
                                    z2 = false;
                                }
                                hdb hdb2 = j.f;
                                if (hdb2 instanceof qm) {
                                    qm qmVar = (qm) hdb2;
                                    ((wbf) ((pbf) this.c.getValue())).b(qmVar, (lcf) qmVar, z2);
                                } else {
                                    this.y.a((gud) hdb2);
                                }
                            }
                            z3 = z;
                            it3 = it;
                            hashSet3 = hashSet;
                            z4 = false;
                        } else {
                            arrayList2.add(j);
                            z68.c("rvd", "task " + j + " will be removed, reason: max fails count limit is reached", new Object[0]);
                        }
                    }
                    z = z3;
                    hashSet = hashSet3;
                    it = it3;
                    z3 = z;
                    it3 = it;
                    hashSet3 = hashSet;
                    z4 = false;
                }
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    tdf tdf = (tdf) it4.next();
                    hdb hdb3 = tdf.f;
                    if (tdf.c >= hdb3.f()) {
                        B(hdb3);
                    }
                    ((eef) lazy2.getValue()).d(tdf.a);
                    z68.c("rvd", "task " + tdf + " deleted", new Object[0]);
                }
            }
        } catch (Exception e2) {
            z68.f("rvd", "process: failed", e2);
        }
    }
}
