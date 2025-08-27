package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: vx6  reason: default package */
public final class vx6 {
    public final SharedPreferences a;

    public vx6(Context context, String str) {
        this.a = context.getSharedPreferences("FirebaseHeartBeat" + str, 0);
    }

    public final synchronized void a() {
        try {
            long j = this.a.getLong("fire-count", 0);
            String str = "";
            String str2 = null;
            for (Map.Entry next : this.a.getAll().entrySet()) {
                if (next.getValue() instanceof Set) {
                    for (String str3 : (Set) next.getValue()) {
                        if (str2 != null) {
                            if (str2.compareTo(str3) > 0) {
                            }
                        }
                        str = (String) next.getKey();
                        str2 = str3;
                    }
                }
            }
            HashSet hashSet = new HashSet(this.a.getStringSet(str, new HashSet()));
            hashSet.remove(str2);
            this.a.edit().putStringSet(str, hashSet).putLong("fire-count", j - 1).commit();
        } finally {
            while (true) {
            }
        }
    }

    public final synchronized void b() {
        try {
            SharedPreferences.Editor edit = this.a.edit();
            int i = 0;
            for (Map.Entry next : this.a.getAll().entrySet()) {
                if (next.getValue() instanceof Set) {
                    String d = d(System.currentTimeMillis());
                    String str = (String) next.getKey();
                    if (((Set) next.getValue()).contains(d)) {
                        HashSet hashSet = new HashSet();
                        hashSet.add(d);
                        i++;
                        edit.putStringSet(str, hashSet);
                    } else {
                        edit.remove(str);
                    }
                }
            }
            if (i == 0) {
                edit.remove("fire-count");
            } else {
                edit.putLong("fire-count", (long) i);
            }
            edit.commit();
        } finally {
            while (true) {
            }
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final synchronized java.util.ArrayList c() {
        /*
            r6 = this;
            monitor-enter(r6)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0058 }
            r0.<init>()     // Catch:{ all -> 0x0058 }
            android.content.SharedPreferences r1 = r6.a     // Catch:{ all -> 0x0058 }
            java.util.Map r1 = r1.getAll()     // Catch:{ all -> 0x0058 }
            java.util.Set r1 = r1.entrySet()     // Catch:{ all -> 0x0058 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0058 }
        L_0x0014:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0058 }
            if (r2 == 0) goto L_0x005a
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0058 }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ all -> 0x0058 }
            java.lang.Object r3 = r2.getValue()     // Catch:{ all -> 0x0058 }
            boolean r3 = r3 instanceof java.util.Set     // Catch:{ all -> 0x0058 }
            if (r3 == 0) goto L_0x0014
            java.util.HashSet r3 = new java.util.HashSet     // Catch:{ all -> 0x0058 }
            java.lang.Object r4 = r2.getValue()     // Catch:{ all -> 0x0058 }
            java.util.Set r4 = (java.util.Set) r4     // Catch:{ all -> 0x0058 }
            r3.<init>(r4)     // Catch:{ all -> 0x0058 }
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0058 }
            java.lang.String r4 = r6.d(r4)     // Catch:{ all -> 0x0058 }
            r3.remove(r4)     // Catch:{ all -> 0x0058 }
            boolean r4 = r3.isEmpty()     // Catch:{ all -> 0x0058 }
            if (r4 != 0) goto L_0x0014
            java.lang.Object r2 = r2.getKey()     // Catch:{ all -> 0x0058 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0058 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x0058 }
            r4.<init>(r3)     // Catch:{ all -> 0x0058 }
            za0 r3 = new za0     // Catch:{ all -> 0x0058 }
            r3.<init>(r2, r4)     // Catch:{ all -> 0x0058 }
            r0.add(r3)     // Catch:{ all -> 0x0058 }
            goto L_0x0014
        L_0x0058:
            r0 = move-exception
            goto L_0x0074
        L_0x005a:
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0058 }
            monitor-enter(r6)     // Catch:{ all -> 0x0058 }
            android.content.SharedPreferences r3 = r6.a     // Catch:{ all -> 0x0071 }
            android.content.SharedPreferences$Editor r3 = r3.edit()     // Catch:{ all -> 0x0071 }
            java.lang.String r4 = "fire-global"
            android.content.SharedPreferences$Editor r1 = r3.putLong(r4, r1)     // Catch:{ all -> 0x0071 }
            r1.commit()     // Catch:{ all -> 0x0071 }
            monitor-exit(r6)     // Catch:{ all -> 0x0058 }
            monitor-exit(r6)
            return r0
        L_0x0071:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0071 }
            throw r0     // Catch:{ all -> 0x0058 }
        L_0x0074:
            monitor-exit(r6)     // Catch:{ all -> 0x0058 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vx6.c():java.util.ArrayList");
    }

    public final synchronized String d(long j) {
        return new Date(j).toInstant().atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
    }

    public final synchronized String e(String str) {
        for (Map.Entry next : this.a.getAll().entrySet()) {
            if (next.getValue() instanceof Set) {
                for (String equals : (Set) next.getValue()) {
                    if (str.equals(equals)) {
                        return (String) next.getKey();
                    }
                }
                continue;
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void f(java.lang.String r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.lang.String r0 = r4.e(r5)     // Catch:{ all -> 0x0030 }
            if (r0 != 0) goto L_0x0009
            monitor-exit(r4)
            return
        L_0x0009:
            java.util.HashSet r1 = new java.util.HashSet     // Catch:{ all -> 0x0030 }
            android.content.SharedPreferences r2 = r4.a     // Catch:{ all -> 0x0030 }
            java.util.HashSet r3 = new java.util.HashSet     // Catch:{ all -> 0x0030 }
            r3.<init>()     // Catch:{ all -> 0x0030 }
            java.util.Set r2 = r2.getStringSet(r0, r3)     // Catch:{ all -> 0x0030 }
            r1.<init>(r2)     // Catch:{ all -> 0x0030 }
            r1.remove(r5)     // Catch:{ all -> 0x0030 }
            boolean r5 = r1.isEmpty()     // Catch:{ all -> 0x0030 }
            if (r5 == 0) goto L_0x0032
            android.content.SharedPreferences r5 = r4.a     // Catch:{ all -> 0x0030 }
            android.content.SharedPreferences$Editor r5 = r5.edit()     // Catch:{ all -> 0x0030 }
            android.content.SharedPreferences$Editor r5 = r5.remove(r0)     // Catch:{ all -> 0x0030 }
            r5.commit()     // Catch:{ all -> 0x0030 }
            goto L_0x003f
        L_0x0030:
            r5 = move-exception
            goto L_0x0041
        L_0x0032:
            android.content.SharedPreferences r5 = r4.a     // Catch:{ all -> 0x0030 }
            android.content.SharedPreferences$Editor r5 = r5.edit()     // Catch:{ all -> 0x0030 }
            android.content.SharedPreferences$Editor r5 = r5.putStringSet(r0, r1)     // Catch:{ all -> 0x0030 }
            r5.commit()     // Catch:{ all -> 0x0030 }
        L_0x003f:
            monitor-exit(r4)
            return
        L_0x0041:
            monitor-exit(r4)     // Catch:{ all -> 0x0030 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vx6.f(java.lang.String):void");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final synchronized boolean g(long r6) {
        /*
            r5 = this;
            java.lang.String r0 = "fire-global"
            monitor-enter(r5)
            android.content.SharedPreferences r1 = r5.a     // Catch:{ all -> 0x0033 }
            boolean r1 = r1.contains(r0)     // Catch:{ all -> 0x0033 }
            r2 = 1
            if (r1 == 0) goto L_0x003b
            android.content.SharedPreferences r1 = r5.a     // Catch:{ all -> 0x0033 }
            r3 = -1
            long r3 = r1.getLong(r0, r3)     // Catch:{ all -> 0x0033 }
            monitor-enter(r5)     // Catch:{ all -> 0x0033 }
            java.lang.String r1 = r5.d(r3)     // Catch:{ all -> 0x0038 }
            java.lang.String r3 = r5.d(r6)     // Catch:{ all -> 0x0038 }
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0038 }
            monitor-exit(r5)     // Catch:{ all -> 0x0033 }
            if (r1 != 0) goto L_0x0035
            android.content.SharedPreferences r1 = r5.a     // Catch:{ all -> 0x0033 }
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch:{ all -> 0x0033 }
            android.content.SharedPreferences$Editor r6 = r1.putLong(r0, r6)     // Catch:{ all -> 0x0033 }
            r6.commit()     // Catch:{ all -> 0x0033 }
            monitor-exit(r5)
            return r2
        L_0x0033:
            r6 = move-exception
            goto L_0x004a
        L_0x0035:
            monitor-exit(r5)
            r5 = 0
            return r5
        L_0x0038:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0038 }
            throw r6     // Catch:{ all -> 0x0033 }
        L_0x003b:
            android.content.SharedPreferences r1 = r5.a     // Catch:{ all -> 0x0033 }
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch:{ all -> 0x0033 }
            android.content.SharedPreferences$Editor r6 = r1.putLong(r0, r6)     // Catch:{ all -> 0x0033 }
            r6.commit()     // Catch:{ all -> 0x0033 }
            monitor-exit(r5)
            return r2
        L_0x004a:
            monitor-exit(r5)     // Catch:{ all -> 0x0033 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vx6.g(long):boolean");
    }

    public final synchronized void h(long j, String str) {
        String d = d(j);
        if (this.a.getString("last-used-date", "").equals(d)) {
            String e = e(d);
            if (e != null) {
                if (!e.equals(str)) {
                    i(str, d);
                    return;
                }
                return;
            }
            return;
        }
        long j2 = this.a.getLong("fire-count", 0);
        if (j2 + 1 == 30) {
            a();
            j2 = this.a.getLong("fire-count", 0);
        }
        HashSet hashSet = new HashSet(this.a.getStringSet(str, new HashSet()));
        hashSet.add(d);
        this.a.edit().putStringSet(str, hashSet).putLong("fire-count", j2 + 1).putString("last-used-date", d).commit();
    }

    public final synchronized void i(String str, String str2) {
        f(str2);
        HashSet hashSet = new HashSet(this.a.getStringSet(str, new HashSet()));
        hashSet.add(str2);
        this.a.edit().putStringSet(str, hashSet).commit();
    }
}
