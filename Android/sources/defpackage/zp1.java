package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import ru.ok.tamtam.nano.Protos;
import ru.ok.tamtam.nano.b;

/* renamed from: zp1  reason: default package */
public final class zp1 implements s98 {
    public final jtb A0;
    public final gb9 B0;
    public final lfd X;
    public final c48 Y;
    public final rl Z;
    public boolean a;
    public volatile boolean b;
    public volatile yp1 c;
    public final CopyOnWriteArrayList o = new CopyOnWriteArrayList();
    public final HashSet v = new HashSet();
    public final fa9 v0;
    public final HashSet w = new HashSet();
    public final r62 w0;
    public long x;
    public final lfd x0;
    public long y;
    public final ln5 y0;
    public long z;
    public final sv0 z0;

    public zp1(rl rlVar, fa9 fa9, r62 r62, lfd lfd, ln5 ln5, sv0 sv0, jtb jtb, lfd lfd2, c48 c48, gb9 gb9) {
        this.Z = rlVar;
        this.v0 = fa9;
        this.w0 = r62;
        this.x0 = lfd;
        this.y0 = ln5;
        this.z0 = sv0;
        this.A0 = jtb;
        this.X = lfd2;
        this.Y = c48;
        this.B0 = gb9;
    }

    public final void a() {
        i(new xp1(this, 0));
    }

    public final void b(int i, List list) {
        HashSet hashSet;
        int size = list.size();
        while (true) {
            size--;
            hashSet = this.v;
            if (size < 0) {
                break;
            } else if (hashSet.contains(Long.valueOf(((a89) list.get(size)).a.b))) {
                list.remove(size);
            }
        }
        this.o.addAll(i, list);
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                arrayList.add(Long.valueOf(((a89) it.next()).a.b));
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        }
        hashSet.addAll(arrayList);
    }

    public final void c() {
        if (this.z == 0 && this.c.w.a() > 0) {
            for (Long l : ((LinkedHashMap) this.c.w.a).keySet()) {
                if (this.w0.D(l.longValue()) != null) {
                    List list = (List) ((LinkedHashMap) this.c.w.a).get(l);
                    if (list != null && !list.isEmpty()) {
                        if (list.size() > 100) {
                            list = list.subList(0, 100);
                        }
                        z68.c("zp1", "loadMissedMessages: for chat: " + l + " messages size: " + list.size(), new Object[0]);
                        this.z = ((jna) this.Z).K(l.longValue(), new ArrayList(list));
                        return;
                    }
                } else {
                    z68.c("zp1", "loadMissedMessages: chat not found: " + l, new Object[0]);
                }
            }
        }
    }

    public final void d() {
        if (this.y == 0) {
            z68.c("zp1", "loadNext: loading from network from: " + this.c.c + " backward", new Object[0]);
            rl rlVar = this.Z;
            jna jna = (jna) rlVar;
            this.y = jna.z(jna, new t3g(((ltb) jna.D()).a.n(), this.c.c, false));
        }
    }

    public final void g() {
        if (this.c == null) {
            this.c = new yp1();
            try {
                FileInputStream fileInputStream = new FileInputStream(new File(((po5) this.y0).b(), "call_history_state"));
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                j4b.n(fileInputStream, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                j4b.k(fileInputStream);
                j4b.j(byteArrayOutputStream);
                Protos.CallHistoryState callHistoryState = new Protos.CallHistoryState();
                ad9.mergeFrom(callHistoryState, byteArray);
                this.c.a = b.i(callHistoryState.chunk);
                this.c.b = callHistoryState.forwardMarker;
                this.c.c = callHistoryState.backwardMarker;
                this.c.o = callHistoryState.hasNext;
                this.c.v = callHistoryState.hasPrev;
                Map<Long, Protos.CallHistoryState.MissedMessagesItem> map = callHistoryState.missedMessagesIds;
                if (map != null) {
                    for (Map.Entry next : map.entrySet()) {
                        ak3 ak3 = this.c.w;
                        Long l = (Long) next.getKey();
                        ArrayList h = cjf.h(((Protos.CallHistoryState.MissedMessagesItem) next.getValue()).ids);
                        LinkedHashMap linkedHashMap = (LinkedHashMap) ak3.a;
                        List list = (List) linkedHashMap.get(l);
                        if (list != null) {
                            list.addAll(h);
                        } else {
                            linkedHashMap.put(l, h);
                        }
                    }
                }
            } catch (Exception e) {
                z68.c("zp1", "loadState error, set default state " + e.getMessage(), new Object[0]);
            }
        }
    }

    public final void h() {
        this.x0.c(new xp1(this, 2));
    }

    public final void i(Runnable runnable) {
        this.X.c(runnable);
    }

    public final void j() {
        Protos.CallHistoryState callHistoryState = new Protos.CallHistoryState();
        callHistoryState.chunk = b.j(this.c.a);
        callHistoryState.forwardMarker = this.c.b;
        callHistoryState.backwardMarker = this.c.c;
        callHistoryState.hasNext = this.c.o;
        callHistoryState.hasPrev = this.c.v;
        if (this.c.w != null) {
            callHistoryState.missedMessagesIds = new HashMap();
            for (Long l : ((LinkedHashMap) this.c.w.a).keySet()) {
                Protos.CallHistoryState.MissedMessagesItem missedMessagesItem = new Protos.CallHistoryState.MissedMessagesItem();
                missedMessagesItem.ids = cjf.i((List) ((LinkedHashMap) this.c.w.a).get(l));
                callHistoryState.missedMessagesIds.put(l, missedMessagesItem);
            }
        }
        byte[] byteArray = ad9.toByteArray(callHistoryState);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(((po5) this.y0).b(), "call_history_state"));
            fileOutputStream.write(byteArray);
            j4b.j(fileOutputStream);
        } catch (IOException e) {
            z68.n("zp1", (IOException) null, "failed to save state: " + e.getMessage(), Arrays.copyOf(new Object[0], 0));
        }
    }

    public final void k() {
        ltb ltb = (ltb) this.A0;
        long j = ltb.a.g.getLong("user.callsLastSync", 0);
        long o2 = ltb.a.o();
        StringBuilder n = tr1.n(j, "setCallsLastSync: from: ", " to: ");
        n.append(o2);
        z68.c("zp1", n.toString(), new Object[0]);
        ltb.a.k("user.callsLastSync", Long.valueOf(o2));
    }

    @oye
    public void onEvent(xy2 xy2) {
        i(new c(26, this, xy2));
    }

    @oye
    public void onEvent(v3g v3g) {
        i(new c(22, this, v3g));
    }

    @oye
    public void onEvent(w88 w88) {
        i(new c(24, this, w88));
    }

    @oye
    public void onEvent(ke7 ke7) {
        i(new c(23, this, ke7));
    }

    @oye
    public void onEvent(kv9 kv9) {
        i(new c(27, this, kv9));
    }

    @oye
    public void onEvent(tv9 tv9) {
        i(new c(25, this, tv9));
    }

    @oye
    public void onEvent(hj0 hj0) {
        i(new c(21, this, hj0));
    }

    @oye
    public void onEvent(sv9 sv9) {
        i(new c(20, this, sv9));
    }
}
