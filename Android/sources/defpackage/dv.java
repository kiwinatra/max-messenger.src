package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.text.StringsKt;
import kotlin.text.Typography;

/* renamed from: dv  reason: default package */
public final class dv implements l47 {
    public final /* synthetic */ int a;
    public volatile long b;
    public Object c;
    public volatile Object o;

    public dv(grg grg) {
        this.a = 1;
        this.c = grg;
        this.b = Long.MIN_VALUE;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public synchronized void a() {
        /*
            r2 = this;
            monitor-enter(r2)
            monitor-enter(r2)     // Catch:{ all -> 0x0013 }
            r0 = -1
            r2.b = r0     // Catch:{ all -> 0x0015 }
            monitor-exit(r2)     // Catch:{ all -> 0x0013 }
            java.lang.Object r0 = r2.o     // Catch:{ all -> 0x0013 }
            mq4 r0 = (defpackage.mq4) r0     // Catch:{ all -> 0x0013 }
            defpackage.jbd.c(r0)     // Catch:{ all -> 0x0013 }
            r0 = 0
            r2.o = r0     // Catch:{ all -> 0x0013 }
            monitor-exit(r2)
            return
        L_0x0013:
            r0 = move-exception
            goto L_0x0018
        L_0x0015:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0015 }
            throw r0     // Catch:{ all -> 0x0013 }
        L_0x0018:
            monitor-exit(r2)     // Catch:{ all -> 0x0013 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dv.a():void");
    }

    public synchronized void b() {
        x6 x6Var = (x6) this.c;
        if (x6Var != null) {
            x6Var.run();
            this.c = null;
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "LoadOperation{operationTime=" + this.b + ", disposable=" + ((mq4) this.o) + ", onComplete=" + ((x6) this.c) + '}';
            default:
                return super.toString();
        }
    }

    public Uri u(String str) {
        Uri u = ((l47) this.c).u(str);
        if (!Intrinsics.areEqual((Object) str, (Object) "api")) {
            return u;
        }
        Uri uri = um.a;
        String uri2 = u.toString();
        String uri3 = uri.toString();
        if (!Intrinsics.areEqual((Object) uri2, (Object) uri3)) {
            int lastIndex = StringsKt__StringsKt.endsWith$default((CharSequence) uri2, '/', false, 2, (Object) null) ? StringsKt.getLastIndex(uri2) : uri2.length();
            if (lastIndex != (StringsKt__StringsKt.endsWith$default((CharSequence) uri3, '/', false, 2, (Object) null) ? StringsKt.getLastIndex(uri3) : uri3.length()) || !StringsKt__StringsJVMKt.regionMatches$default(uri2, 0, uri3, 0, lastIndex, false, 16, (Object) null)) {
                return u;
            }
        }
        if (SystemClock.elapsedRealtime() > this.b) {
            synchronized (this) {
                try {
                    if (SystemClock.elapsedRealtime() > this.b) {
                        ni0 u2 = nfd.u();
                        String str2 = (String) u2.c;
                        if (StringsKt__StringsKt.startsWith$default((CharSequence) str2, (char) Typography.quote, false, 2, (Object) null) && StringsKt__StringsKt.endsWith$default((CharSequence) str2, (char) Typography.quote, false, 2, (Object) null)) {
                            str2 = str2.substring(1, StringsKt.getLastIndex(str2));
                        }
                        if (StringsKt__StringsKt.contains$default((CharSequence) str2, (CharSequence) "\"\"", false, 2, (Object) null)) {
                            str2 = StringsKt__StringsJVMKt.replace$default(str2, "\"\"", "", false, 4, (Object) null);
                        }
                        String obj = StringsKt.trim((CharSequence) str2).toString();
                        if (StringsKt__StringsKt.contains$default((CharSequence) obj, ' ', false, 2, (Object) null)) {
                            obj = obj.substring(StringsKt__StringsKt.lastIndexOf$default((CharSequence) obj, ' ', 0, false, 6, (Object) null) + 1);
                        }
                        if (StringsKt__StringsKt.endsWith$default((CharSequence) obj, '/', false, 2, (Object) null)) {
                            obj = obj.substring(0, StringsKt.getLastIndex(obj));
                        }
                        Uri parse = Uri.parse(obj);
                        this.o = parse;
                        this.b = SystemClock.elapsedRealtime() + ((long) (u2.b * 1000));
                        return parse;
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Exception unused) {
                    this.b = LongCompanionObject.MAX_VALUE;
                    Uri uri4 = (Uri) this.o;
                    if (uri4 != null) {
                        u = uri4;
                    }
                    return u;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        Uri uri5 = (Uri) this.o;
        return uri5 == null ? u : uri5;
    }

    public dv() {
        this.a = 0;
        this.b = -1;
        this.o = null;
        this.c = null;
    }
}
