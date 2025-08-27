package defpackage;

import android.database.sqlite.SQLiteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import org.apache.http.client.methods.HttpDelete;

/* renamed from: uj7  reason: default package */
public final class uj7 {
    public static final String[] o = {"UPDATE", HttpDelete.METHOD_NAME, "INSERT"};
    public final i6d a;
    public final Map b;
    public final Map c;
    public final LinkedHashMap d;
    public final String[] e;
    public final AtomicBoolean f = new AtomicBoolean(false);
    public volatile boolean g;
    public volatile gf6 h;
    public final pj7 i;
    public final npg j;
    public final xbd k;
    public final Object l;
    public final Object m;
    public final tj7 n;

    public uj7(i6d i6d, HashMap hashMap, HashMap hashMap2, String... strArr) {
        this.a = i6d;
        this.b = hashMap;
        this.c = hashMap2;
        this.i = new pj7(strArr.length);
        this.j = new npg(i6d, 15);
        this.k = new xbd();
        this.l = new Object();
        this.m = new Object();
        this.d = new LinkedHashMap();
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i2 = 0; i2 < length; i2++) {
            String str = strArr[i2];
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            this.d.put(lowerCase, Integer.valueOf(i2));
            String str2 = (String) this.b.get(strArr[i2]);
            String lowerCase2 = str2 != null ? str2.toLowerCase(locale) : null;
            if (lowerCase2 != null) {
                lowerCase = lowerCase2;
            }
            strArr2[i2] = lowerCase;
        }
        this.e = strArr2;
        for (Map.Entry entry : this.b.entrySet()) {
            Locale locale2 = Locale.US;
            String lowerCase3 = ((String) entry.getValue()).toLowerCase(locale2);
            if (this.d.containsKey(lowerCase3)) {
                String lowerCase4 = ((String) entry.getKey()).toLowerCase(locale2);
                LinkedHashMap linkedHashMap = this.d;
                linkedHashMap.put(lowerCase4, MapsKt.getValue(linkedHashMap, lowerCase3));
            }
        }
        this.n = new tj7(0, this);
    }

    public final void a(qj7 qj7) {
        rj7 rj7;
        boolean z;
        String[] d2 = d(qj7.a);
        ArrayList arrayList = new ArrayList(d2.length);
        int length = d2.length;
        int i2 = 0;
        while (i2 < length) {
            String str = d2[i2];
            Integer num = (Integer) this.d.get(str.toLowerCase(Locale.US));
            if (num != null) {
                arrayList.add(num);
                i2++;
            } else {
                throw new IllegalArgumentException("There is no table with name ".concat(str));
            }
        }
        int[] intArray = CollectionsKt.toIntArray(arrayList);
        rj7 rj72 = new rj7(qj7, intArray, d2);
        synchronized (this.k) {
            rj7 = (rj7) this.k.d(qj7, rj72);
        }
        if (rj7 == null) {
            pj7 pj7 = this.i;
            int[] copyOf = Arrays.copyOf(intArray, intArray.length);
            synchronized (pj7) {
                try {
                    z = false;
                    for (int i3 : copyOf) {
                        long[] jArr = pj7.a;
                        long j2 = jArr[i3];
                        jArr[i3] = 1 + j2;
                        if (j2 == 0) {
                            pj7.d = true;
                            z = true;
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                } finally {
                }
            }
            if (z) {
                i6d i6d = this.a;
                if (i6d.n()) {
                    f(i6d.h().getWritableDatabase());
                }
            }
        }
    }

    public final boolean b() {
        if (!this.a.n()) {
            return false;
        }
        if (!this.g) {
            this.a.h().getWritableDatabase();
        }
        return this.g;
    }

    public final void c(qj7 qj7) {
        rj7 rj7;
        boolean z;
        synchronized (this.k) {
            rj7 = (rj7) this.k.e(qj7);
        }
        if (rj7 != null) {
            pj7 pj7 = this.i;
            int[] iArr = rj7.b;
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            synchronized (pj7) {
                try {
                    z = false;
                    for (int i2 : copyOf) {
                        long[] jArr = pj7.a;
                        long j2 = jArr[i2];
                        jArr[i2] = j2 - 1;
                        if (j2 == 1) {
                            pj7.d = true;
                            z = true;
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                } finally {
                }
            }
            if (z) {
                i6d i6d = this.a;
                if (i6d.n()) {
                    f(i6d.h().getWritableDatabase());
                }
            }
        }
    }

    public final String[] d(String[] strArr) {
        Set createSetBuilder = SetsKt.createSetBuilder();
        for (String str : strArr) {
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            Map map = this.c;
            if (map.containsKey(lowerCase)) {
                createSetBuilder.addAll((Collection) map.get(str.toLowerCase(locale)));
            } else {
                createSetBuilder.add(str);
            }
        }
        return (String[]) SetsKt.build(createSetBuilder).toArray(new String[0]);
    }

    public final void e(af6 af6, int i2) {
        af6.V("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i2 + ", 0)");
        String str = this.e[i2];
        String[] strArr = o;
        for (int i3 = 0; i3 < 3; i3++) {
            String str2 = strArr[i3];
            StringBuilder sb = new StringBuilder("CREATE TEMP TRIGGER IF NOT EXISTS ");
            sb.append("`room_table_modification_trigger_" + str + '_' + str2 + '`');
            sb.append(" AFTER ");
            sb.append(str2);
            sb.append(" ON `");
            sb.append(str);
            sb.append("` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = ");
            sb.append(i2);
            sb.append(" AND invalidated = 0; END");
            af6.V(sb.toString());
        }
    }

    public final void f(af6 af6) {
        ReentrantReadWriteLock.ReadLock readLock;
        af6 af62 = af6;
        if (!af6.k0()) {
            try {
                readLock = this.a.i.readLock();
                readLock.lock();
                synchronized (this.l) {
                    int[] a2 = this.i.a();
                    if (a2 == null) {
                        readLock.unlock();
                        return;
                    }
                    if (af6.m0()) {
                        af6.n();
                    } else {
                        af6.m();
                    }
                    try {
                        int length = a2.length;
                        int i2 = 0;
                        int i3 = 0;
                        while (i2 < length) {
                            int i4 = a2[i2];
                            int i5 = i3 + 1;
                            if (i4 == 1) {
                                e(af62, i3);
                            } else if (i4 == 2) {
                                String str = this.e[i3];
                                String[] strArr = o;
                                for (int i6 = 0; i6 < 3; i6++) {
                                    String str2 = strArr[i6];
                                    StringBuilder sb = new StringBuilder("DROP TRIGGER IF EXISTS ");
                                    sb.append("`room_table_modification_trigger_" + str + '_' + str2 + '`');
                                    af62.V(sb.toString());
                                }
                            }
                            i2++;
                            i3 = i5;
                        }
                        af6.s0();
                        af6.U();
                        Unit unit = Unit.INSTANCE;
                        readLock.unlock();
                    } finally {
                        af6.U();
                    }
                }
            } catch (SQLiteException | IllegalStateException unused) {
            } catch (Throwable th) {
                readLock.unlock();
                throw th;
            }
        }
    }
}
