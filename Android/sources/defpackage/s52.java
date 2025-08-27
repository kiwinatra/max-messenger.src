package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Trace;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;

/* renamed from: s52  reason: default package */
public final /* synthetic */ class s52 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r62 b;

    public /* synthetic */ s52(r62 r62, int i) {
        this.a = i;
        this.b = r62;
    }

    /* JADX INFO: finally extract failed */
    public final void run() {
        ArrayList arrayList;
        int i;
        byte[] bArr;
        switch (this.a) {
            case 0:
                r62 r62 = this.b;
                if (!r62.i) {
                    z68.c("r62", "load 1: start", new Object[0]);
                    if (!r62.i) {
                        ((iof) r62.A.get()).getClass();
                        iof.a("ChatController.load()");
                        long nanoTime = System.nanoTime();
                        ws wsVar = new ws(0);
                        ArrayList arrayList2 = new ArrayList();
                        hs7 hs7 = r62.A;
                        ((iof) hs7.get()).getClass();
                        iof.a("ChatController.selectChats()");
                        f6d f6d = ((a74) ((s74) r62.l.get())).b;
                        hs2 c = f6d.c();
                        c.getClass();
                        d7d a2 = d7d.a(0, "SELECT * FROM chats");
                        i6d i6d = c.a;
                        i6d.b();
                        Cursor o = i6d.o(a2, (CancellationSignal) null);
                        try {
                            int u = kne.u(o, "id");
                            int u2 = kne.u(o, "server_id");
                            int u3 = kne.u(o, "data");
                            int u4 = kne.u(o, "favourite_index");
                            int u5 = kne.u(o, "sort_time");
                            long j = nanoTime;
                            int u6 = kne.u(o, "cid");
                            ArrayList arrayList3 = arrayList2;
                            ArrayList arrayList4 = new ArrayList(o.getCount());
                            while (o.moveToNext()) {
                                long j2 = o.getLong(u);
                                long j3 = o.getLong(u2);
                                if (o.isNull(u3)) {
                                    i = u;
                                    bArr = null;
                                } else {
                                    bArr = o.getBlob(u3);
                                    i = u;
                                }
                                arrayList4.add(new n82(j2, j3, c.a().a(bArr), o.getLong(u4), o.getLong(u5), o.getLong(u6)));
                                u = i;
                            }
                            o.close();
                            a2.o();
                            TreeSet treeSet = new TreeSet(f6d.g);
                            Iterator it = arrayList4.iterator();
                            while (it.hasNext()) {
                                treeSet.add(f6d.a((n82) it.next()));
                            }
                            List<n72> list = CollectionsKt.toList(treeSet);
                            ((iof) hs7.get()).getClass();
                            Trace.endSection();
                            ArrayList arrayList5 = new ArrayList();
                            z68.c("r62", "load 2", new Object[0]);
                            for (n72 n72 : list) {
                                m72 m72 = n72.c;
                                if (m72.b != l72.b || ((m72.r0 != 1 && !m72.i0) || m72.e.containsKey(Long.valueOf(r62.Q())))) {
                                    r62.c0(n72.b, n72);
                                    wsVar.add(Long.valueOf(n72.b));
                                    long j4 = n72.c.j;
                                    if (j4 > 0) {
                                        arrayList = arrayList3;
                                        arrayList.add(Long.valueOf(j4));
                                    } else {
                                        arrayList = arrayList3;
                                    }
                                    arrayList3 = arrayList;
                                } else {
                                    arrayList5.add(n72);
                                }
                            }
                            ArrayList arrayList6 = arrayList3;
                            z68.c("r62", "load 3", new Object[0]);
                            if (!arrayList5.isEmpty()) {
                                r62.y.c(new ir1(7, r62, arrayList5));
                            }
                            z68.c("r62", "load 4", new Object[0]);
                            ((iof) r62.A.get()).getClass();
                            iof.a("ChatController.load().processedChats");
                            ts m = ((fa9) r62.s.get()).m(arrayList6);
                            z68.c("r62", "load 5", new Object[0]);
                            ps psVar = new ps(wsVar);
                            while (psVar.hasNext()) {
                                n72 n722 = (n72) r62.d.get((Long) psVar.next());
                                if (n722 != null) {
                                    a32 h = r62.h(n722, (ha9) m.get(Long.valueOf(n722.c.j)));
                                    if (h.b.h(((ltb) r62.n).a.s())) {
                                        r62.a = h;
                                    }
                                }
                            }
                            z68.c("r62", "load 6", new Object[0]);
                            ((iof) r62.A.get()).getClass();
                            Trace.endSection();
                            r62.i = true;
                            z68.c("r62", "load 7", new Object[0]);
                            r62.j.b();
                            a67 a67 = z68.b;
                            if (a67 != null && a67.c()) {
                                w78 w78 = w78.o;
                                Locale locale = Locale.ROOT;
                                int size = wsVar.size();
                                long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - j);
                                a67.d(w78, "r62", "chats loaded to memory cache size: " + size + " by time " + millis + "ms", (Throwable) null);
                            }
                            r62.m.c(new xy2(wsVar, true, true, (bl4) null, (zub) null, 120));
                            ((iof) r62.A.get()).getClass();
                            Trace.endSection();
                            z68.c("r62", "load 8: finish", new Object[0]);
                            return;
                        } catch (Throwable th) {
                            o.close();
                            a2.o();
                            throw th;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            default:
                r62 r622 = this.b;
                r622.f.clear();
                r622.c.clear();
                r622.g.clear();
                r622.d.clear();
                r622.b.clear();
                r622.e.clear();
                r622.h.clear();
                r622.a = null;
                return;
        }
    }
}
