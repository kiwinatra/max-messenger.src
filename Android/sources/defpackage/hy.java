package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;

/* renamed from: hy  reason: default package */
public final class hy extends Handler {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ hy() {
        this.a = 6;
    }

    private final void a(Message message) {
        Set<gw4> set;
        Set<gw4> set2;
        Pair pair = (Pair) message.obj;
        Object obj = pair.first;
        Object obj2 = pair.second;
        int i = message.what;
        if (i == 1) {
            ke4 ke4 = (ke4) this.b;
            if (obj != ke4.y) {
                return;
            }
            if (ke4.p == 2 || ke4.i()) {
                ke4.y = null;
                boolean z = obj2 instanceof Exception;
                ox0 ox0 = ke4.c;
                if (z) {
                    ox0.B((Exception) obj2, false);
                    return;
                }
                try {
                    ke4.b.j((byte[]) obj2);
                    ox0.b = null;
                    HashSet hashSet = (HashSet) ox0.c;
                    tb7 p = tb7.p(hashSet);
                    hashSet.clear();
                    lx5 r = p.listIterator(0);
                    while (r.hasNext()) {
                        ke4 ke42 = (ke4) r.next();
                        if (ke42.l()) {
                            ke42.h(true);
                        }
                    }
                } catch (Exception e) {
                    ox0.B(e, true);
                }
            }
        } else if (i == 2) {
            ke4 ke43 = (ke4) this.b;
            if (obj == ke43.x && ke43.i()) {
                ke43.x = null;
                if ((obj2 instanceof Exception) || (obj2 instanceof NoSuchMethodError)) {
                    ke43.k((Throwable) obj2, false);
                    return;
                }
                try {
                    byte[] bArr = (byte[]) obj2;
                    if (ke43.e == 3) {
                        rb5 rb5 = ke43.b;
                        byte[] bArr2 = ke43.w;
                        int i2 = v0g.a;
                        rb5.i(bArr2, bArr);
                        j04 j04 = ke43.i;
                        synchronized (j04.b) {
                            set2 = j04.o;
                        }
                        for (gw4 b2 : set2) {
                            b2.b();
                        }
                        return;
                    }
                    byte[] i3 = ke43.b.i(ke43.v, bArr);
                    int i4 = ke43.e;
                    if (!((i4 != 2 && (i4 != 0 || ke43.w == null)) || i3 == null || i3.length == 0)) {
                        ke43.w = i3;
                    }
                    ke43.p = 4;
                    j04 j042 = ke43.i;
                    synchronized (j042.b) {
                        set = j042.o;
                    }
                    for (gw4 a2 : set) {
                        a2.a();
                    }
                } catch (Exception | NoSuchMethodError e2) {
                    ke43.k(e2, true);
                }
            }
        }
    }

    private final void b(Message message) {
        Set<fw4> set;
        Set<fw4> set2;
        Pair pair = (Pair) message.obj;
        Object obj = pair.first;
        Object obj2 = pair.second;
        int i = message.what;
        if (i == 0) {
            je4 je4 = (je4) this.b;
            if (obj != je4.x) {
                return;
            }
            if (je4.o == 2 || je4.i()) {
                je4.x = null;
                boolean z = obj2 instanceof Exception;
                xe8 xe8 = je4.c;
                if (z) {
                    xe8.x((Exception) obj2, false);
                    return;
                }
                try {
                    je4.b.j((byte[]) obj2);
                    xe8.c = null;
                    HashSet hashSet = (HashSet) xe8.b;
                    tb7 p = tb7.p(hashSet);
                    hashSet.clear();
                    lx5 r = p.listIterator(0);
                    while (r.hasNext()) {
                        je4 je42 = (je4) r.next();
                        if (je42.l()) {
                            je42.h(true);
                        }
                    }
                } catch (Exception e) {
                    xe8.x(e, true);
                }
            }
        } else if (i == 1) {
            je4 je43 = (je4) this.b;
            if (obj == je43.w && je43.i()) {
                je43.w = null;
                if (obj2 instanceof Exception) {
                    je43.k((Exception) obj2, false);
                    return;
                }
                try {
                    byte[] bArr = (byte[]) obj2;
                    if (je43.e == 3) {
                        qb5 qb5 = je43.b;
                        byte[] bArr2 = je43.v;
                        int i2 = t0g.a;
                        qb5.i(bArr2, bArr);
                        j04 j04 = je43.i;
                        synchronized (j04.b) {
                            set2 = j04.o;
                        }
                        for (fw4 b2 : set2) {
                            b2.b();
                        }
                        return;
                    }
                    byte[] i3 = je43.b.i(je43.u, bArr);
                    int i4 = je43.e;
                    if (!((i4 != 2 && (i4 != 0 || je43.v == null)) || i3 == null || i3.length == 0)) {
                        je43.v = i3;
                    }
                    je43.o = 4;
                    j04 j042 = je43.i;
                    synchronized (j042.b) {
                        set = j042.o;
                    }
                    for (fw4 a2 : set) {
                        a2.a();
                    }
                } catch (Exception e2) {
                    je43.k(e2, true);
                }
            }
        }
    }

    private final void c(Message message) {
        hx8 hx8;
        f0 f0Var;
        hy hyVar;
        if (message.what == 1) {
            synchronized (((f0) this.b).o) {
                hx8 = (hx8) ((WeakReference) ((f0) this.b).b).get();
                f0Var = (f0) this.b;
                hyVar = (hy) f0Var.c;
            }
            if (hx8 != null && f0Var == hx8.getCallback() && hyVar != null) {
                hx8.a((ly8) message.obj);
                ((f0) this.b).getClass();
                hx8.a((ly8) null);
            }
        }
    }

    public void d(Runnable runnable) {
        if (Thread.currentThread() == getLooper().getThread()) {
            runnable.run();
        } else {
            post(runnable);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: iy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: iy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: jy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: iy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: jy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v33, resolved type: iy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v34, resolved type: iy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v35, resolved type: iy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v36, resolved type: iy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v37, resolved type: iy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v38, resolved type: iy} */
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:871)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:128)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0390 A[LOOP:3: B:120:0x0390->B:123:0x039c, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0442 A[LOOP:7: B:177:0x0442->B:180:0x044d, LOOP_START] */
    public final void handleMessage(android.os.Message r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = 3
            r3 = 4
            r4 = 0
            r5 = 2
            r6 = 0
            r7 = 1
            int r8 = r0.a
            switch(r8) {
                case 0: goto L_0x0425;
                case 1: goto L_0x0371;
                case 2: goto L_0x036d;
                case 3: goto L_0x0369;
                case 4: goto L_0x0331;
                case 5: goto L_0x02f6;
                case 6: goto L_0x010e;
                case 7: goto L_0x00d7;
                case 8: goto L_0x00b1;
                case 9: goto L_0x008b;
                case 10: goto L_0x0072;
                case 11: goto L_0x0049;
                case 12: goto L_0x0045;
                case 13: goto L_0x002b;
                default: goto L_0x000f;
            }
        L_0x000f:
            int r1 = r1.what
            if (r1 == r7) goto L_0x0014
            goto L_0x002a
        L_0x0014:
            java.lang.Object r0 = r0.b
            androidx.preference.PreferenceFragmentCompat r0 = (androidx.preference.PreferenceFragmentCompat) r0
            dtb r1 = r0.m1
            androidx.preference.PreferenceScreen r1 = r1.g
            if (r1 == 0) goto L_0x002a
            androidx.recyclerview.widget.RecyclerView r2 = r0.n1
            tyc r0 = r0.T2(r1)
            r2.setAdapter(r0)
            r1.j()
        L_0x002a:
            return
        L_0x002b:
            java.lang.Object r1 = r1.obj
            cx8 r1 = (defpackage.cx8) r1
            java.lang.Object r0 = r0.b
            m7f r0 = (defpackage.m7f) r0
            boolean r2 = r0.p(r1)
            if (r2 == 0) goto L_0x0044
            bx8 r2 = r1.d     // Catch:{ RemoteException -> 0x0041 }
            defpackage.n79.o(r2)     // Catch:{ RemoteException -> 0x0041 }
            r2.onDisconnected()     // Catch:{ RemoteException -> 0x0041 }
        L_0x0041:
            r0.y(r1)
        L_0x0044:
            return
        L_0x0045:
            r20.c(r21)
            return
        L_0x0049:
            int r1 = r1.what
            java.lang.Object r0 = r0.b
            iw8 r0 = (defpackage.iw8) r0
            if (r1 == r7) goto L_0x005c
            if (r1 == r5) goto L_0x0054
            goto L_0x0071
        L_0x0054:
            r0.w = r6
            pv8 r1 = r0.v
            r0.f(r1)
            goto L_0x0071
        L_0x005c:
            r0.y = r6
            e4 r1 = r0.o
            if (r1 == 0) goto L_0x0071
            jw8 r2 = r0.x
            java.lang.Object r1 = r1.b
            ow8 r1 = (defpackage.ow8) r1
            qw8 r0 = r1.e(r0)
            if (r0 == 0) goto L_0x0071
            r1.l(r0, r2)
        L_0x0071:
            return
        L_0x0072:
            int r1 = r1.what
            java.lang.Object r0 = r0.b
            dw8 r0 = (defpackage.dw8) r0
            if (r1 == r7) goto L_0x0087
            if (r1 == r5) goto L_0x007d
            goto L_0x008a
        L_0x007d:
            rw8 r1 = r0.F0
            if (r1 == 0) goto L_0x008a
            r0.F0 = r4
            r0.o()
            goto L_0x008a
        L_0x0087:
            r0.n()
        L_0x008a:
            return
        L_0x008b:
            int r2 = r1.what
            if (r2 == r7) goto L_0x0090
            goto L_0x00b0
        L_0x0090:
            java.lang.Object r1 = r1.obj
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r0 = r0.b
            uv8 r0 = (defpackage.uv8) r0
            r0.getClass()
            long r2 = android.os.SystemClock.uptimeMillis()
            r0.y0 = r2
            java.util.ArrayList r2 = r0.X
            r2.clear()
            java.util.ArrayList r2 = r0.X
            r2.addAll(r1)
            tv8 r0 = r0.Y
            r0.E()
        L_0x00b0:
            return
        L_0x00b1:
            int r2 = r1.what
            if (r2 == r7) goto L_0x00b6
            goto L_0x00d6
        L_0x00b6:
            java.lang.Object r1 = r1.obj
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r0 = r0.b
            ev8 r0 = (defpackage.ev8) r0
            r0.getClass()
            long r2 = android.os.SystemClock.uptimeMillis()
            r0.w0 = r2
            java.util.ArrayList r2 = r0.X
            r2.clear()
            java.util.ArrayList r2 = r0.X
            r2.addAll(r1)
            dv8 r0 = r0.Y
            r0.notifyDataSetChanged()
        L_0x00d6:
            return
        L_0x00d7:
            int r4 = r1.what
            int r5 = r1.arg1
            java.lang.Object r6 = r1.obj
            android.os.Bundle r1 = r21.peekData()
            java.lang.Object r0 = r0.b
            uu8 r0 = (defpackage.uu8) r0
            android.util.SparseArray r7 = r0.j
            java.lang.Object r7 = r7.get(r5)
            a0d r7 = (defpackage.a0d) r7
            if (r7 != 0) goto L_0x00f0
            goto L_0x010d
        L_0x00f0:
            android.util.SparseArray r0 = r0.j
            r0.remove(r5)
            if (r4 == r2) goto L_0x0108
            if (r4 == r3) goto L_0x00fa
            goto L_0x010d
        L_0x00fa:
            if (r1 != 0) goto L_0x00fd
            goto L_0x0102
        L_0x00fd:
            java.lang.String r0 = "error"
            r1.getString(r0)
        L_0x0102:
            android.os.Bundle r6 = (android.os.Bundle) r6
            java.util.Objects.toString(r6)
            goto L_0x010d
        L_0x0108:
            android.os.Bundle r6 = (android.os.Bundle) r6
            r7.a(r6)
        L_0x010d:
            return
        L_0x010e:
            java.lang.Object r2 = r0.b
            sy8 r2 = (defpackage.sy8) r2
            if (r2 == 0) goto L_0x02f2
            android.os.Bundle r0 = r21.getData()
            int r3 = r1.what
            java.lang.String r4 = "data_callback_token"
            java.lang.String r5 = "data_calling_uid"
            java.lang.String r8 = "data_calling_pid"
            java.lang.String r9 = "data_package_name"
            java.lang.String r10 = "data_root_hints"
            java.lang.String r11 = "data_media_item_id"
            java.lang.String r12 = "data_result_receiver"
            er7 r2 = r2.b
            switch(r3) {
                case 1: goto L_0x028a;
                case 2: goto L_0x0272;
                case 3: goto L_0x0246;
                case 4: goto L_0x0222;
                case 5: goto L_0x01f4;
                case 6: goto L_0x01c5;
                case 7: goto L_0x01ac;
                case 8: goto L_0x016f;
                case 9: goto L_0x0132;
                default: goto L_0x012d;
            }
        L_0x012d:
            r21.toString()
            goto L_0x02f5
        L_0x0132:
            java.lang.String r3 = "data_custom_action_extras"
            android.os.Bundle r17 = r0.getBundle(r3)
            defpackage.px8.a(r17)
            java.lang.String r3 = "data_custom_action"
            java.lang.String r16 = r0.getString(r3)
            android.os.Parcelable r0 = r0.getParcelable(r12)
            r18 = r0
            android.support.v4.os.ResultReceiver r18 = (android.support.v4.os.ResultReceiver) r18
            vm8 r15 = new vm8
            android.os.Messenger r0 = r1.replyTo
            r15.<init>(r0)
            r2.getClass()
            boolean r0 = android.text.TextUtils.isEmpty(r16)
            if (r0 != 0) goto L_0x02f5
            if (r18 != 0) goto L_0x015d
            goto L_0x02f5
        L_0x015d:
            java.lang.Object r0 = r2.b
            sy8 r0 = (defpackage.sy8) r0
            hy r0 = r0.x
            iqg r1 = new iqg
            r13 = r1
            r14 = r2
            r13.<init>((defpackage.er7) r14, (defpackage.vm8) r15, (java.lang.String) r16, (android.os.Bundle) r17, (android.support.v4.os.ResultReceiver) r18)
            r0.d(r1)
            goto L_0x02f5
        L_0x016f:
            java.lang.String r3 = "data_search_extras"
            android.os.Bundle r17 = r0.getBundle(r3)
            defpackage.px8.a(r17)
            java.lang.String r3 = "data_search_query"
            java.lang.String r16 = r0.getString(r3)
            android.os.Parcelable r0 = r0.getParcelable(r12)
            r18 = r0
            android.support.v4.os.ResultReceiver r18 = (android.support.v4.os.ResultReceiver) r18
            vm8 r15 = new vm8
            android.os.Messenger r0 = r1.replyTo
            r15.<init>(r0)
            r2.getClass()
            boolean r0 = android.text.TextUtils.isEmpty(r16)
            if (r0 != 0) goto L_0x02f5
            if (r18 != 0) goto L_0x019a
            goto L_0x02f5
        L_0x019a:
            java.lang.Object r0 = r2.b
            sy8 r0 = (defpackage.sy8) r0
            hy r0 = r0.x
            tm8 r1 = new tm8
            r13 = r1
            r14 = r2
            r13.<init>(r14, r15, r16, r17, r18)
            r0.d(r1)
            goto L_0x02f5
        L_0x01ac:
            vm8 r0 = new vm8
            android.os.Messenger r1 = r1.replyTo
            r0.<init>(r1)
            java.lang.Object r1 = r2.b
            sy8 r1 = (defpackage.sy8) r1
            hy r1 = r1.x
            uj6 r3 = new uj6
            r4 = 13
            r3.<init>((java.lang.Object) r2, (java.lang.Object) r0, (boolean) r6, (int) r4)
            r1.d(r3)
            goto L_0x02f5
        L_0x01c5:
            android.os.Bundle r18 = r0.getBundle(r10)
            defpackage.px8.a(r18)
            vm8 r3 = new vm8
            android.os.Messenger r1 = r1.replyTo
            r3.<init>(r1)
            java.lang.String r19 = r0.getString(r9)
            int r15 = r0.getInt(r8)
            int r14 = r0.getInt(r5)
            java.lang.Object r0 = r2.b
            sy8 r0 = (defpackage.sy8) r0
            hy r0 = r0.x
            yc4 r1 = new yc4
            r13 = r1
            r16 = r2
            r17 = r3
            r13.<init>(r14, r15, r16, r17, r18, r19)
            r0.d(r1)
            goto L_0x02f5
        L_0x01f4:
            java.lang.String r3 = r0.getString(r11)
            android.os.Parcelable r0 = r0.getParcelable(r12)
            android.support.v4.os.ResultReceiver r0 = (android.support.v4.os.ResultReceiver) r0
            vm8 r4 = new vm8
            android.os.Messenger r1 = r1.replyTo
            r4.<init>(r1)
            r2.getClass()
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 != 0) goto L_0x02f5
            if (r0 != 0) goto L_0x0212
            goto L_0x02f5
        L_0x0212:
            java.lang.Object r1 = r2.b
            sy8 r1 = (defpackage.sy8) r1
            hy r1 = r1.x
            tm8 r5 = new tm8
            r5.<init>(r2, r4, r3, r0)
            r1.d(r5)
            goto L_0x02f5
        L_0x0222:
            java.lang.String r17 = r0.getString(r11)
            android.os.IBinder r18 = r0.getBinder(r4)
            vm8 r0 = new vm8
            android.os.Messenger r1 = r1.replyTo
            r0.<init>(r1)
            java.lang.Object r1 = r2.b
            sy8 r1 = (defpackage.sy8) r1
            hy r1 = r1.x
            iqg r3 = new iqg
            r14 = 3
            r13 = r3
            r15 = r2
            r16 = r0
            r13.<init>((int) r14, (java.lang.Object) r15, (java.lang.Object) r16, (java.lang.Object) r17, (java.lang.Object) r18)
            r1.d(r3)
            goto L_0x02f5
        L_0x0246:
            java.lang.String r3 = "data_options"
            android.os.Bundle r18 = r0.getBundle(r3)
            defpackage.px8.a(r18)
            java.lang.String r16 = r0.getString(r11)
            android.os.IBinder r17 = r0.getBinder(r4)
            vm8 r15 = new vm8
            android.os.Messenger r0 = r1.replyTo
            r15.<init>(r0)
            java.lang.Object r0 = r2.b
            sy8 r0 = (defpackage.sy8) r0
            hy r0 = r0.x
            sm8 r1 = new sm8
            r19 = 0
            r13 = r1
            r14 = r2
            r13.<init>(r14, r15, r16, r17, r18, r19)
            r0.d(r1)
            goto L_0x02f5
        L_0x0272:
            vm8 r0 = new vm8
            android.os.Messenger r1 = r1.replyTo
            r0.<init>(r1)
            java.lang.Object r1 = r2.b
            sy8 r1 = (defpackage.sy8) r1
            hy r1 = r1.x
            vj6 r3 = new vj6
            r4 = 10
            r3.<init>((java.lang.Object) r2, (java.lang.Object) r0, (boolean) r6, (int) r4)
            r1.d(r3)
            goto L_0x02f5
        L_0x028a:
            android.os.Bundle r18 = r0.getBundle(r10)
            defpackage.px8.a(r18)
            java.lang.String r3 = r0.getString(r9)
            int r14 = r0.getInt(r8)
            int r15 = r0.getInt(r5)
            vm8 r0 = new vm8
            android.os.Messenger r1 = r1.replyTo
            r0.<init>(r1)
            java.lang.Object r1 = r2.b
            sy8 r1 = (defpackage.sy8) r1
            if (r3 == 0) goto L_0x02d3
            android.content.pm.PackageManager r4 = r1.getPackageManager()
            java.lang.String[] r4 = r4.getPackagesForUid(r15)
            if (r4 == 0) goto L_0x02d6
            int r5 = r4.length
        L_0x02b5:
            if (r6 >= r5) goto L_0x02d6
            r8 = r4[r6]
            boolean r8 = r8.equals(r3)
            if (r8 == 0) goto L_0x02d1
            rm8 r4 = new rm8
            r13 = r4
            r16 = r2
            r17 = r0
            r19 = r3
            r13.<init>(r14, r15, r16, r17, r18, r19)
            hy r0 = r1.x
            r0.d(r4)
            goto L_0x02f5
        L_0x02d1:
            int r6 = r6 + r7
            goto L_0x02b5
        L_0x02d3:
            r1.getClass()
        L_0x02d6:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Package/uid mismatch: uid="
            r1.<init>(r2)
            r1.append(r15)
            java.lang.String r2 = " package="
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x02f2:
            r0.removeCallbacksAndMessages(r4)
        L_0x02f5:
            return
        L_0x02f6:
            java.lang.Object r2 = r1.obj
            byte[] r2 = (byte[]) r2
            if (r2 != 0) goto L_0x02fd
            goto L_0x0330
        L_0x02fd:
            java.lang.Object r0 = r0.b
            pe4 r0 = (defpackage.pe4) r0
            java.util.ArrayList r0 = r0.m
            java.util.Iterator r0 = r0.iterator()
        L_0x0307:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0330
            java.lang.Object r4 = r0.next()
            ke4 r4 = (defpackage.ke4) r4
            r4.p()
            byte[] r7 = r4.v
            boolean r7 = java.util.Arrays.equals(r7, r2)
            if (r7 == 0) goto L_0x0307
            int r0 = r1.what
            if (r0 == r5) goto L_0x0323
            goto L_0x0330
        L_0x0323:
            int r0 = r4.e
            if (r0 != 0) goto L_0x0330
            int r0 = r4.p
            if (r0 != r3) goto L_0x0330
            int r0 = defpackage.v0g.a
            r4.h(r6)
        L_0x0330:
            return
        L_0x0331:
            java.lang.Object r2 = r1.obj
            byte[] r2 = (byte[]) r2
            if (r2 != 0) goto L_0x0338
            goto L_0x0368
        L_0x0338:
            java.lang.Object r0 = r0.b
            oe4 r0 = (defpackage.oe4) r0
            java.util.ArrayList r0 = r0.m
            java.util.Iterator r0 = r0.iterator()
        L_0x0342:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0368
            java.lang.Object r4 = r0.next()
            je4 r4 = (defpackage.je4) r4
            byte[] r7 = r4.u
            boolean r7 = java.util.Arrays.equals(r7, r2)
            if (r7 == 0) goto L_0x0342
            int r0 = r1.what
            if (r0 == r5) goto L_0x035b
            goto L_0x0368
        L_0x035b:
            int r0 = r4.e
            if (r0 != 0) goto L_0x0368
            int r0 = r4.o
            if (r0 != r3) goto L_0x0368
            int r0 = defpackage.t0g.a
            r4.h(r6)
        L_0x0368:
            return
        L_0x0369:
            r20.a(r21)
            return
        L_0x036d:
            r20.b(r21)
            return
        L_0x0371:
            java.lang.Object r0 = r0.b
            r6 = r0
            ly r6 = (defpackage.ly) r6
            r6.getClass()
            int r0 = r1.what
            if (r0 == r7) goto L_0x03f0
            if (r0 == r5) goto L_0x03c2
            if (r0 == r2) goto L_0x03bc
            if (r0 == r3) goto L_0x03a0
            java.util.concurrent.atomic.AtomicReference r0 = r6.o
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            int r1 = r1.what
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r2.<init>(r1)
        L_0x0390:
            boolean r1 = r0.compareAndSet(r4, r2)
            if (r1 == 0) goto L_0x0398
            goto L_0x0417
        L_0x0398:
            java.lang.Object r1 = r0.get()
            if (r1 == 0) goto L_0x0390
            goto L_0x0417
        L_0x03a0:
            java.lang.Object r0 = r1.obj
            android.os.Bundle r0 = (android.os.Bundle) r0
            android.media.MediaCodec r1 = r6.a     // Catch:{ RuntimeException -> 0x03ab }
            r1.setParameters(r0)     // Catch:{ RuntimeException -> 0x03ab }
            goto L_0x0417
        L_0x03ab:
            r0 = move-exception
            java.util.concurrent.atomic.AtomicReference r1 = r6.o
        L_0x03ae:
            boolean r2 = r1.compareAndSet(r4, r0)
            if (r2 == 0) goto L_0x03b5
            goto L_0x0417
        L_0x03b5:
            java.lang.Object r2 = r1.get()
            if (r2 == 0) goto L_0x03ae
            goto L_0x0417
        L_0x03bc:
            bv1 r0 = r6.v
            r0.g()
            goto L_0x0417
        L_0x03c2:
            java.lang.Object r0 = r1.obj
            r2 = r0
            jy r2 = (defpackage.jy) r2
            int r8 = r2.a
            int r9 = r2.b
            android.media.MediaCodec$CryptoInfo r10 = r2.d
            long r11 = r2.e
            int r13 = r2.f
            java.lang.Object r1 = defpackage.ly.y     // Catch:{ RuntimeException -> 0x03de }
            monitor-enter(r1)     // Catch:{ RuntimeException -> 0x03de }
            android.media.MediaCodec r7 = r6.a     // Catch:{ all -> 0x03db }
            r7.queueSecureInputBuffer(r8, r9, r10, r11, r13)     // Catch:{ all -> 0x03db }
            monitor-exit(r1)     // Catch:{ all -> 0x03db }
            goto L_0x03ee
        L_0x03db:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x03db }
            throw r0     // Catch:{ RuntimeException -> 0x03de }
        L_0x03de:
            r0 = move-exception
            java.util.concurrent.atomic.AtomicReference r3 = r6.o
        L_0x03e1:
            boolean r1 = r3.compareAndSet(r4, r0)
            if (r1 == 0) goto L_0x03e8
            goto L_0x03ee
        L_0x03e8:
            java.lang.Object r1 = r3.get()
            if (r1 == 0) goto L_0x03e1
        L_0x03ee:
            r4 = r2
            goto L_0x0417
        L_0x03f0:
            java.lang.Object r0 = r1.obj
            r2 = r0
            jy r2 = (defpackage.jy) r2
            int r8 = r2.a
            int r9 = r2.b
            int r10 = r2.c
            long r11 = r2.e
            int r13 = r2.f
            android.media.MediaCodec r7 = r6.a     // Catch:{ RuntimeException -> 0x0405 }
            r7.queueInputBuffer(r8, r9, r10, r11, r13)     // Catch:{ RuntimeException -> 0x0405 }
            goto L_0x0416
        L_0x0405:
            r0 = move-exception
            r3 = r0
            java.util.concurrent.atomic.AtomicReference r6 = r6.o
        L_0x0409:
            boolean r0 = r6.compareAndSet(r4, r3)
            if (r0 == 0) goto L_0x0410
            goto L_0x0416
        L_0x0410:
            java.lang.Object r0 = r6.get()
            if (r0 == 0) goto L_0x0409
        L_0x0416:
            goto L_0x03ee
        L_0x0417:
            if (r4 == 0) goto L_0x0424
            java.util.ArrayDeque r1 = defpackage.ly.x
            monitor-enter(r1)
            r1.add(r4)     // Catch:{ all -> 0x0421 }
            monitor-exit(r1)     // Catch:{ all -> 0x0421 }
            goto L_0x0424
        L_0x0421:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0421 }
            throw r0
        L_0x0424:
            return
        L_0x0425:
            java.lang.Object r0 = r0.b
            r2 = r0
            ky r2 = (defpackage.ky) r2
            r2.getClass()
            int r0 = r1.what
            if (r0 == 0) goto L_0x0484
            if (r0 == r7) goto L_0x0456
            if (r0 == r5) goto L_0x0450
            java.util.concurrent.atomic.AtomicReference r0 = r2.d
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            int r1 = r1.what
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r3.<init>(r1)
        L_0x0442:
            boolean r1 = r0.compareAndSet(r4, r3)
            if (r1 == 0) goto L_0x0449
            goto L_0x04aa
        L_0x0449:
            java.lang.Object r1 = r0.get()
            if (r1 == 0) goto L_0x0442
            goto L_0x04aa
        L_0x0450:
            bv1 r0 = r2.e
            r0.g()
            goto L_0x04aa
        L_0x0456:
            java.lang.Object r0 = r1.obj
            r3 = r0
            iy r3 = (defpackage.iy) r3
            int r6 = r3.a
            int r7 = r3.b
            android.media.MediaCodec$CryptoInfo r8 = r3.d
            long r9 = r3.e
            int r11 = r3.f
            java.lang.Object r1 = defpackage.ky.h     // Catch:{ RuntimeException -> 0x0472 }
            monitor-enter(r1)     // Catch:{ RuntimeException -> 0x0472 }
            android.media.MediaCodec r5 = r2.a     // Catch:{ all -> 0x046f }
            r5.queueSecureInputBuffer(r6, r7, r8, r9, r11)     // Catch:{ all -> 0x046f }
            monitor-exit(r1)     // Catch:{ all -> 0x046f }
            goto L_0x0482
        L_0x046f:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x046f }
            throw r0     // Catch:{ RuntimeException -> 0x0472 }
        L_0x0472:
            r0 = move-exception
            java.util.concurrent.atomic.AtomicReference r5 = r2.d
        L_0x0475:
            boolean r1 = r5.compareAndSet(r4, r0)
            if (r1 == 0) goto L_0x047c
            goto L_0x0482
        L_0x047c:
            java.lang.Object r1 = r5.get()
            if (r1 == 0) goto L_0x0475
        L_0x0482:
            r4 = r3
            goto L_0x04aa
        L_0x0484:
            java.lang.Object r0 = r1.obj
            r1 = r0
            iy r1 = (defpackage.iy) r1
            int r6 = r1.a
            int r7 = r1.b
            int r8 = r1.c
            long r9 = r1.e
            int r11 = r1.f
            android.media.MediaCodec r5 = r2.a     // Catch:{ RuntimeException -> 0x0499 }
            r5.queueInputBuffer(r6, r7, r8, r9, r11)     // Catch:{ RuntimeException -> 0x0499 }
            goto L_0x04a9
        L_0x0499:
            r0 = move-exception
            java.util.concurrent.atomic.AtomicReference r2 = r2.d
        L_0x049c:
            boolean r3 = r2.compareAndSet(r4, r0)
            if (r3 == 0) goto L_0x04a3
            goto L_0x04a9
        L_0x04a3:
            java.lang.Object r3 = r2.get()
            if (r3 == 0) goto L_0x049c
        L_0x04a9:
            r4 = r1
        L_0x04aa:
            if (r4 == 0) goto L_0x04b7
            java.util.ArrayDeque r1 = defpackage.ky.g
            monitor-enter(r1)
            r1.add(r4)     // Catch:{ all -> 0x04b4 }
            monitor-exit(r1)     // Catch:{ all -> 0x04b4 }
            goto L_0x04b7
        L_0x04b4:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x04b4 }
            throw r0
        L_0x04b7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hy.handleMessage(android.os.Message):void");
    }

    public boolean sendMessageAtTime(Message message, long j) {
        switch (this.a) {
            case 6:
                Bundle data = message.getData();
                ClassLoader classLoader = lm8.class.getClassLoader();
                classLoader.getClass();
                data.setClassLoader(classLoader);
                data.putInt("data_calling_uid", Binder.getCallingUid());
                int callingPid = Binder.getCallingPid();
                if (callingPid > 0) {
                    data.putInt("data_calling_pid", callingPid);
                } else if (!data.containsKey("data_calling_pid")) {
                    data.putInt("data_calling_pid", -1);
                }
                return super.sendMessageAtTime(message, j);
            default:
                return super.sendMessageAtTime(message, j);
        }
    }

    public /* synthetic */ hy(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hy(Object obj, Looper looper, int i) {
        super(looper);
        this.a = i;
        this.b = obj;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hy(uu8 uu8) {
        super(Looper.getMainLooper());
        this.a = 7;
        this.b = uu8;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hy(Looper looper, m7f m7f) {
        super(looper);
        this.a = 13;
        this.b = m7f;
    }
}
