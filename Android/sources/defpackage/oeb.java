package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import kotlin.Lazy;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: oeb  reason: default package */
public final class oeb implements ceb {
    public final Lazy a;
    public final Lazy b;
    public final sv0 c;
    public final Lazy d;
    public final Lazy e;
    public final Lazy f;
    public final Lazy g;
    public final m95 h;
    public volatile long i;
    public volatile boolean j;
    public final HashMap k = new HashMap();

    public oeb(Lazy lazy, Lazy lazy2, sv0 sv0, Lazy lazy3, Lazy lazy4, Lazy lazy5, Lazy lazy6, m95 m95) {
        this.a = lazy;
        this.b = lazy2;
        this.c = sv0;
        this.d = lazy3;
        this.e = lazy4;
        this.f = lazy5;
        this.g = lazy6;
        this.h = m95;
        sv0.d(this);
    }

    public final void a(ArrayList arrayList) {
        z68.c("oeb", "onPhonebookUpdated", new Object[0]);
        d();
    }

    public final void c(List list, Map map, Map map2) {
        int i2 = 3;
        z68.c("oeb", "onSyncSuccess: contacts=%s, phones=%s, requested=%s", Integer.valueOf(list.size()), Integer.valueOf(map.size()), Integer.valueOf(map2.size()));
        int size = list.size();
        Lazy lazy = this.f;
        if (size > 0) {
            long s = ((ltb) ((jtb) this.d.getValue())).a.s();
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                fo3 fo3 = (fo3) it.next();
                if (fo3.a == s) {
                    list.remove(fo3);
                    break;
                }
            }
            ((jna) ((rl) this.b.getValue())).y((List) list.stream().map(new mm3(3)).collect(Collectors.toList()));
            ((km3) lazy.getValue()).D(list);
        }
        boolean z = false;
        for (String str : map.keySet()) {
            HashMap hashMap = this.k;
            Integer num = (Integer) hashMap.get(str);
            int intValue = num != null ? num.intValue() + 1 : 1;
            hashMap.put(str, Integer.valueOf(intValue));
            if (!z && intValue >= 10) {
                ((uta) this.h).c(new Exception("Contacts sync cycle"), true);
                z = true;
            }
        }
        Lazy lazy2 = this.a;
        c7d c7d = ((a74) ((s74) lazy2.getValue())).e;
        ((OneMeRoomDatabase) c7d.a.m()).q(new ovb(16, map, c7d));
        for (String remove : map.keySet()) {
            map2.remove(remove);
        }
        z68.c("oeb", "markInvalidPhones: invalid phones: %s", Integer.valueOf(map2.size()));
        if (!map2.isEmpty()) {
            c7d c7d2 = ((a74) ((s74) lazy2.getValue())).e;
            Set<String> keySet = map2.keySet();
            i6d i6d = c7d2.c().a;
            i6d.b();
            StringBuilder sb = new StringBuilder();
            sb.append("UPDATE phones SET type = ? WHERE type = ? AND phone in (");
            n79.c(sb, keySet.size());
            sb.append(")");
            gf6 d2 = i6d.d(sb.toString());
            d2.k(1, (long) 2);
            d2.k(2, (long) 0);
            for (String str2 : keySet) {
                if (str2 == null) {
                    d2.X(i2);
                } else {
                    d2.h(i2, str2);
                }
                i2++;
            }
            i6d.c();
            try {
                d2.n();
                i6d.r();
            } finally {
                i6d.l();
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry value : map.entrySet()) {
            xdb f2 = ((a74) ((s74) lazy2.getValue())).e.f(((Long) value.getValue()).longValue());
            if (f2 != null) {
                arrayList.add(f2);
            }
        }
        Set H = ((km3) lazy.getValue()).H(arrayList);
        if (!H.isEmpty()) {
            ((uu3) this.g.getValue()).b(H);
        }
        this.c.c(new ij0());
        ((lfd) this.e.getValue()).d(new neb(this, 0), 1, TimeUnit.SECONDS);
    }

    public final void d() {
        z68.a("oeb", "sync");
        if (this.j) {
            z68.a("oeb", "sync in progress, return");
            return;
        }
        this.j = true;
        ((lfd) this.e.getValue()).c(new neb(this, 1));
    }

    /* JADX INFO: finally extract failed */
    public final void e() {
        String str;
        Integer num;
        z68.c("oeb", "syncInternal", new Object[0]);
        z68.c("oeb", "select unsynced phones", new Object[0]);
        HashMap hashMap = new HashMap();
        ueb c2 = ((a74) ((s74) this.a.getValue())).e.c();
        c2.getClass();
        d7d a2 = d7d.a(1, "SELECT * FROM phones WHERE type = ?");
        a2.k(1, (long) 0);
        i6d i6d = c2.a;
        i6d.b();
        Cursor o = i6d.o(a2, (CancellationSignal) null);
        try {
            int u = kne.u(o, "id");
            int u2 = kne.u(o, "phonebook_id");
            int u3 = kne.u(o, "contact_id");
            int u4 = kne.u(o, "phone");
            int u5 = kne.u(o, "server_phone");
            int u6 = kne.u(o, "email");
            int u7 = kne.u(o, "first_name");
            int u8 = kne.u(o, "last_name");
            int u9 = kne.u(o, "avatar_path");
            int u10 = kne.u(o, "type");
            String str2 = "oeb";
            ArrayList arrayList = new ArrayList(o.getCount());
            while (o.moveToNext()) {
                arrayList.add(new ydb(o.getLong(u), o.getLong(u2), o.getInt(u3), o.isNull(u4) ? null : o.getString(u4), o.getLong(u5), o.isNull(u6) ? null : o.getString(u6), o.isNull(u7) ? null : o.getString(u7), o.isNull(u8) ? null : o.getString(u8), o.isNull(u9) ? null : o.getString(u9), i2a.a(o.getInt(u10))));
            }
            o.close();
            a2.o();
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(c7d.d((ydb) it.next()));
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                xdb xdb = (xdb) it2.next();
                hashMap.put(xdb.v, new fr3(xdb.y, xdb.z));
                if (hashMap.size() == 100) {
                    break;
                }
            }
            if (!hashMap.isEmpty()) {
                for (Map.Entry entry : this.k.entrySet()) {
                    if (!hashMap.containsKey(entry.getKey()) || (num = (Integer) entry.getValue()) == null || num.intValue() < 10) {
                        str = str2;
                    } else {
                        str = str2;
                        z68.c(str, "syncInternal: already synced, skip", new Object[0]);
                        hashMap.remove(entry.getKey());
                    }
                    str2 = str;
                }
            }
            String str3 = str2;
            z68.c(str3, "syncInternal: unsyncedPhones size=%s", Integer.valueOf(hashMap.size()));
            if (hashMap.size() == 0) {
                this.j = false;
                z68.c(str3, "syncInternal: everything synced, return", new Object[0]);
                return;
            }
            jna jna = (jna) ((rl) this.b.getValue());
            this.i = jna.z(jna, new go3(((ltb) jna.D()).a.n(), hashMap, 1));
        } catch (Throwable th) {
            o.close();
            a2.o();
            throw th;
        }
    }

    @oye
    public void onEvent(o6f o6f) {
        z68.a("oeb", "SyncResultEvent");
        ((lfd) this.e.getValue()).c(new sx8(22, this, o6f));
    }

    @oye
    public void onEvent(hj0 hj0) {
        if (hj0.a == this.i) {
            z68.c("oeb", "BaseErrorEvent :%s", hj0);
            this.j = false;
        }
    }
}
