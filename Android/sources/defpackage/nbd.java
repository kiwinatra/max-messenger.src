package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import javax.inject.Provider;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: nbd  reason: default package */
public final class nbd implements g95, q6f, s23 {
    public static final l65 w = new l65("proto");
    public final agd a;
    public final lzf b;
    public final lzf c;
    public final va0 o;
    public final Provider v;

    public nbd(lzf lzf, lzf lzf2, va0 va0, agd agd, Provider provider) {
        this.a = agd;
        this.b = lzf;
        this.c = lzf2;
        this.o = va0;
        this.v = provider;
    }

    public static String k0(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((rb0) it.next()).a);
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static Object m0(Cursor cursor, lbd lbd) {
        try {
            return lbd.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public static Long n(SQLiteDatabase sQLiteDatabase, tc0 tc0) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(new String[]{tc0.a, String.valueOf(wub.a(tc0.c))}));
        byte[] bArr = tc0.b;
        if (bArr != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb.append(" and extras is null");
        }
        Cursor query = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), (String) null, (String) null, (String) null);
        try {
            return !query.moveToNext() ? null : Long.valueOf(query.getLong(0));
        } finally {
            query.close();
        }
    }

    public final ArrayList U(SQLiteDatabase sQLiteDatabase, tc0 tc0, int i) {
        ArrayList arrayList = new ArrayList();
        Long n = n(sQLiteDatabase, tc0);
        if (n == null) {
            return arrayList;
        }
        m0(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", ApiProtocol.PARAM_PAYLOAD, "code", "inline"}, "context_id = ?", new String[]{n.toString()}, (String) null, (String) null, (String) null, String.valueOf(i)), new u00((Object) this, (Object) arrayList, (Object) tc0, 28));
        return arrayList;
    }

    public final void V(long j, t78 t78, String str) {
        o(new u52((Object) str, (Object) t78, j, 13));
    }

    public final void close() {
        this.a.close();
    }

    public final Object e0(p6f p6f) {
        SQLiteDatabase m = m();
        lzf lzf = this.c;
        long a2 = lzf.a();
        while (true) {
            try {
                m.beginTransaction();
                try {
                    Object a3 = p6f.a();
                    m.setTransactionSuccessful();
                    return a3;
                } finally {
                    m.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e) {
                if (lzf.a() < ((long) this.o.c) + a2) {
                    SystemClock.sleep(50);
                } else {
                    throw new RuntimeException("Timed out while trying to acquire the lock.", e);
                }
            }
        }
    }

    public final SQLiteDatabase m() {
        agd agd = this.a;
        Objects.requireNonNull(agd);
        lzf lzf = this.c;
        long a2 = lzf.a();
        while (true) {
            try {
                return agd.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e) {
                if (lzf.a() < ((long) this.o.c) + a2) {
                    SystemClock.sleep(50);
                } else {
                    throw new RuntimeException("Timed out while trying to open db.", e);
                }
            }
        }
    }

    public final Object o(lbd lbd) {
        SQLiteDatabase m = m();
        m.beginTransaction();
        try {
            Object apply = lbd.apply(m);
            m.setTransactionSuccessful();
            return apply;
        } finally {
            m.endTransaction();
        }
    }
}
