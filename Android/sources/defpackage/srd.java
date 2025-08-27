package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.fragment.app.a;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.inject.Provider;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: srd  reason: default package */
public final class srd implements hy0, ez6, vz8, hw4, ize, Provider, r15 {
    public static final String[] v = {"id", "key", "metadata"};
    public static final /* synthetic */ int w = 0;
    public Object a;
    public Object b;
    public Object c;
    public Object o;

    public /* synthetic */ srd(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public static void y(String str) {
        FileInputStream fileInputStream;
        try {
            File file = new File(str);
            MessageDigest instance = MessageDigest.getInstance("MD5");
            fileInputStream = new FileInputStream(file);
            byte[] bArr = new byte[ConstantsKt.DEFAULT_BLOCK_SIZE];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    instance.update(bArr, 0, read);
                } else {
                    String.format("%32x", new Object[]{new BigInteger(1, instance.digest())});
                    fileInputStream.close();
                    return;
                }
            }
        } catch (IOException | SecurityException | NoSuchAlgorithmException e) {
            e.toString();
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public void A(int i, mz8 mz8) {
        if (I(i, mz8)) {
            ((fw4) this.c).f();
        }
    }

    public void B(SQLiteDatabase sQLiteDatabase) {
        String str = (String) this.a;
        str.getClass();
        p2g.b(sQLiteDatabase, 1, str, 1);
        String str2 = (String) this.o;
        str2.getClass();
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ".concat(str2));
        sQLiteDatabase.execSQL("CREATE TABLE " + ((String) this.o) + " (id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)");
    }

    public void C(int i, mz8 mz8, es8 es8) {
        if (I(i, mz8)) {
            ((uz8) this.b).c(J(es8));
        }
    }

    public void D(int i, mz8 mz8, es8 es8) {
        if (I(i, mz8)) {
            ((uz8) this.b).m(J(es8));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object E(long r26, java.lang.String r28, defpackage.dw0 r29, defpackage.xv0 r30, kotlin.coroutines.Continuation r31) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            r3 = r31
            boolean r4 = r3 instanceof defpackage.rrd
            if (r4 == 0) goto L_0x0019
            r4 = r3
            rrd r4 = (defpackage.rrd) r4
            int r5 = r4.z
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x0019
            int r5 = r5 - r6
            r4.z = r5
            goto L_0x001e
        L_0x0019:
            rrd r4 = new rrd
            r4.<init>(r0, r3)
        L_0x001e:
            java.lang.Object r3 = r4.x
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r6 = r4.z
            r7 = 0
            r8 = 2
            r9 = 1
            if (r6 == 0) goto L_0x0057
            if (r6 == r9) goto L_0x0049
            if (r6 != r8) goto L_0x0041
            long r0 = r4.w
            ha9 r2 = r4.v
            xv0 r5 = r4.o
            dw0 r6 = r4.c
            java.lang.String r8 = r4.b
            srd r4 = r4.a
            kotlin.ResultKt.throwOnFailure(r3)
            r15 = r8
            goto L_0x00c5
        L_0x0041:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0049:
            long r0 = r4.w
            xv0 r2 = r4.o
            dw0 r6 = r4.c
            java.lang.String r10 = r4.b
            srd r11 = r4.a
            kotlin.ResultKt.throwOnFailure(r3)
            goto L_0x0088
        L_0x0057:
            kotlin.ResultKt.throwOnFailure(r3)
            java.lang.Object r3 = r0.o
            kotlin.Lazy r3 = (kotlin.Lazy) r3
            java.lang.Object r3 = r3.getValue()
            to9 r3 = (defpackage.to9) r3
            r4.a = r0
            r6 = r28
            r4.b = r6
            r10 = r29
            r4.c = r10
            r11 = r30
            r4.o = r11
            r4.w = r1
            r4.z = r9
            java.lang.Object r3 = r3.a(r1, r4)
            if (r3 != r5) goto L_0x007d
            return r5
        L_0x007d:
            r23 = r11
            r11 = r0
            r0 = r1
            r2 = r23
            r24 = r10
            r10 = r6
            r6 = r24
        L_0x0088:
            ha9 r3 = (defpackage.ha9) r3
            if (r6 == 0) goto L_0x014e
            if (r3 != 0) goto L_0x0090
            goto L_0x014e
        L_0x0090:
            java.lang.Object r9 = r11.o
            kotlin.Lazy r9 = (kotlin.Lazy) r9
            java.lang.Object r9 = r9.getValue()
            to9 r9 = (defpackage.to9) r9
            ued r12 = new ued
            r13 = 3
            r12.<init>(r13, r10, r6)
            r4.a = r11
            r4.b = r10
            r4.c = r6
            r4.o = r2
            r4.v = r3
            r4.w = r0
            r4.z = r8
            r9.getClass()
            uq r4 = new uq
            r8 = 5
            r4.<init>(r8, r12)
            z6d r8 = r9.a
            r8.n(r0, r4)
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            if (r4 != r5) goto L_0x00c1
            return r5
        L_0x00c1:
            r5 = r2
            r2 = r3
            r15 = r10
            r4 = r11
        L_0x00c5:
            java.lang.Object r3 = r4.c
            kotlin.Lazy r3 = (kotlin.Lazy) r3
            java.lang.Object r3 = r3.getValue()
            sv0 r3 = (defpackage.sv0) r3
            twf r8 = new twf
            long r9 = r2.z
            long r11 = r2.b
            r2 = 0
            r25 = r8
            r26 = r2
            r27 = r9
            r29 = r11
            r25.<init>(r26, r27, r29)
            r3.c(r8)
            java.lang.Object r2 = r4.a
            java.lang.String r2 = (java.lang.String) r2
            a67 r3 = defpackage.z68.b
            if (r3 != 0) goto L_0x00ed
            goto L_0x0113
        L_0x00ed:
            boolean r8 = r3.c()
            if (r8 == 0) goto L_0x0113
            w78 r8 = defpackage.w78.o
            java.lang.String r9 = r5.v
            java.lang.String r10 = "Msg keyboard, sendCallback: callbackId:"
            java.lang.String r11 = "|payload:"
            java.lang.String r12 = "|msgId:"
            java.lang.StringBuilder r9 = defpackage.rae.r(r10, r15, r11, r9, r12)
            r9.append(r0)
            java.lang.String r10 = "|btnP:"
            r9.append(r10)
            r9.append(r6)
            java.lang.String r9 = r9.toString()
            r3.d(r8, r2, r9, r7)
        L_0x0113:
            java.lang.Object r2 = r4.b
            kotlin.Lazy r2 = (kotlin.Lazy) r2
            java.lang.Object r2 = r2.getValue()
            rl r2 = (defpackage.rl) r2
            java.lang.String r3 = r5.v
            fw0 r4 = r5.b
            jna r2 = (defpackage.jna) r2
            boolean r5 = r2.s(r0)
            if (r5 != 0) goto L_0x012a
            goto L_0x014b
        L_0x012a:
            dw9 r5 = new dw9
            jtb r7 = r2.D()
            ltb r7 = (defpackage.ltb) r7
            a33 r7 = r7.a
            long r13 = r7.n()
            long r17 = java.lang.System.currentTimeMillis()
            r12 = r5
            r16 = r3
            r19 = r0
            r21 = r6
            r22 = r4
            r12.<init>(r13, r15, r16, r17, r19, r21, r22)
            defpackage.jna.A(r2, r5)
        L_0x014b:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x014e:
            java.lang.Object r0 = r11.a
            java.lang.String r0 = (java.lang.String) r0
            a67 r1 = defpackage.z68.b
            if (r1 != 0) goto L_0x0157
            goto L_0x017c
        L_0x0157:
            boolean r2 = r1.c()
            if (r2 == 0) goto L_0x017c
            w78 r2 = defpackage.w78.w
            if (r3 == 0) goto L_0x0162
            goto L_0x0163
        L_0x0162:
            r9 = 0
        L_0x0163:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Msg keyboard, fail sendCallback btnP:"
            r3.<init>(r4)
            r3.append(r6)
            java.lang.String r4 = "|msgExist:"
            r3.append(r4)
            r3.append(r9)
            java.lang.String r3 = r3.toString()
            r1.d(r2, r0, r3, r7)
        L_0x017c:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.srd.E(long, java.lang.String, dw0, xv0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public void F(int i, mz8 mz8) {
        if (I(i, mz8)) {
            ((fw4) this.c).c();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:23|24|34|35|36|38|39|40) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0039, code lost:
        if (r5 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003b, code lost:
        y(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0062, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0083, code lost:
        if (r1 != null) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0085, code lost:
        y(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0088, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x0064 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void G(int r6, java.lang.String r7) {
        /*
            r5 = this;
            java.lang.String r0 = "nativeLoad() returned error for "
            java.lang.Object r1 = r5.c
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            if (r1 != 0) goto L_0x000c
            java.lang.System.load(r7)
            return
        L_0x000c:
            r1 = 4
            r6 = r6 & r1
            if (r6 != r1) goto L_0x0015
            java.lang.Object r6 = r5.a
        L_0x0012:
            java.lang.String r6 = (java.lang.String) r6
            goto L_0x0018
        L_0x0015:
            java.lang.Object r6 = r5.o
            goto L_0x0012
        L_0x0018:
            r1 = 0
            java.lang.Object r2 = r5.b     // Catch:{ IllegalAccessException | IllegalArgumentException | InvocationTargetException -> 0x0064 }
            java.lang.Runtime r2 = (java.lang.Runtime) r2     // Catch:{ IllegalAccessException | IllegalArgumentException | InvocationTargetException -> 0x0064 }
            monitor-enter(r2)     // Catch:{ IllegalAccessException | IllegalArgumentException | InvocationTargetException -> 0x0064 }
            java.lang.Object r3 = r5.c     // Catch:{ all -> 0x005e }
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3     // Catch:{ all -> 0x005e }
            java.lang.Object r5 = r5.b     // Catch:{ all -> 0x005e }
            java.lang.Runtime r5 = (java.lang.Runtime) r5     // Catch:{ all -> 0x005e }
            java.lang.Class<com.facebook.soloader.SoLoader> r4 = com.facebook.soloader.SoLoader.class
            java.lang.ClassLoader r4 = r4.getClassLoader()     // Catch:{ all -> 0x005c }
            java.lang.Object[] r6 = new java.lang.Object[]{r7, r4, r6}     // Catch:{ all -> 0x005c }
            java.lang.Object r5 = r3.invoke(r5, r6)     // Catch:{ all -> 0x005c }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x005c }
            if (r5 != 0) goto L_0x0042
            monitor-exit(r2)     // Catch:{ all -> 0x003f }
            if (r5 == 0) goto L_0x003e
            y(r7)
        L_0x003e:
            return
        L_0x003f:
            r6 = move-exception
            r1 = r5
            goto L_0x0060
        L_0x0042:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x003f }
            r6.<init>(r0)     // Catch:{ all -> 0x003f }
            r6.append(r7)     // Catch:{ all -> 0x003f }
            java.lang.String r0 = ": "
            r6.append(r0)     // Catch:{ all -> 0x003f }
            r6.append(r5)     // Catch:{ all -> 0x003f }
            java.lang.String r1 = r6.toString()     // Catch:{ all -> 0x003f }
            mfe r5 = new mfe     // Catch:{ all -> 0x005c }
            r5.<init>(r7, r1)     // Catch:{ all -> 0x005c }
            throw r5     // Catch:{ all -> 0x005c }
        L_0x005c:
            r6 = move-exception
            goto L_0x0060
        L_0x005e:
            r5 = move-exception
            r6 = r5
        L_0x0060:
            monitor-exit(r2)     // Catch:{ all -> 0x005c }
            throw r6     // Catch:{ IllegalAccessException | IllegalArgumentException | InvocationTargetException -> 0x0064 }
        L_0x0062:
            r5 = move-exception
            goto L_0x0083
        L_0x0064:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0062 }
            r5.<init>()     // Catch:{ all -> 0x0062 }
            java.lang.String r6 = "nativeLoad() error during invocation for "
            r5.append(r6)     // Catch:{ all -> 0x0062 }
            r5.append(r7)     // Catch:{ all -> 0x0062 }
            java.lang.String r6 = ": "
            r5.append(r6)     // Catch:{ all -> 0x0062 }
            r5.append(r1)     // Catch:{ all -> 0x0062 }
            java.lang.String r1 = r5.toString()     // Catch:{ all -> 0x0062 }
            java.lang.RuntimeException r5 = new java.lang.RuntimeException     // Catch:{ all -> 0x0062 }
            r5.<init>(r1)     // Catch:{ all -> 0x0062 }
            throw r5     // Catch:{ all -> 0x0062 }
        L_0x0083:
            if (r1 == 0) goto L_0x0088
            y(r7)
        L_0x0088:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.srd.G(int, java.lang.String):void");
    }

    public void H(int i, mz8 mz8) {
        if (I(i, mz8)) {
            ((fw4) this.c).b();
        }
    }

    public boolean I(int i, mz8 mz8) {
        mz8 mz82;
        rc3 rc3 = (rc3) this.o;
        if (mz8 != null) {
            mz82 = rc3.p(this.a, mz8);
            if (mz82 == null) {
                return false;
            }
        } else {
            mz82 = null;
        }
        rc3.getClass();
        uz8 uz8 = (uz8) this.b;
        if (uz8.a != i || !t0g.a(uz8.b, mz82)) {
            this.b = new uz8(rc3.c.c, i, mz82, 0);
        }
        fw4 fw4 = (fw4) this.c;
        if (fw4.a == i && t0g.a(fw4.b, mz82)) {
            return true;
        }
        this.c = new fw4(rc3.d.c, i, mz82);
        return true;
    }

    public es8 J(es8 es8) {
        ((rc3) this.o).getClass();
        long j = es8.e;
        long j2 = es8.e;
        int i = (j2 > j ? 1 : (j2 == j ? 0 : -1));
        long j3 = es8.f;
        if (i == 0 && j3 == j3) {
            return es8;
        }
        return new es8(es8.a, es8.b, (ca6) es8.g, es8.c, es8.d, j2, j3);
    }

    public void K(int i, mz8 mz8, k28 k28, es8 es8) {
        if (I(i, mz8)) {
            ((uz8) this.b).g(k28, J(es8));
        }
    }

    public void L(int i, mz8 mz8, k28 k28, es8 es8) {
        if (I(i, mz8)) {
            ((uz8) this.b).l(k28, J(es8));
        }
    }

    public void M(RecyclerView recyclerView) {
        recyclerView.setImportantForAccessibility(2);
        this.c = new tbg(1, this);
        ViewPager2 viewPager2 = (ViewPager2) this.o;
        if (viewPager2.getImportantForAccessibility() == 0) {
            viewPager2.setImportantForAccessibility(1);
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
    public void N() {
        /*
            r8 = this;
            byte[] r0 = defpackage.u0g.a
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            monitor-enter(r8)
            java.lang.Object r1 = r8.b     // Catch:{ all -> 0x0046 }
            java.util.ArrayDeque r1 = (java.util.ArrayDeque) r1     // Catch:{ all -> 0x0046 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0046 }
        L_0x0010:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0046 }
            if (r2 == 0) goto L_0x0048
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0046 }
            htc r2 = (defpackage.htc) r2     // Catch:{ all -> 0x0046 }
            java.lang.Object r3 = r8.c     // Catch:{ all -> 0x0046 }
            java.util.ArrayDeque r3 = (java.util.ArrayDeque) r3     // Catch:{ all -> 0x0046 }
            int r3 = r3.size()     // Catch:{ all -> 0x0046 }
            r4 = 64
            if (r3 < r4) goto L_0x0029
            goto L_0x0048
        L_0x0029:
            java.util.concurrent.atomic.AtomicInteger r3 = r2.a     // Catch:{ all -> 0x0046 }
            int r3 = r3.get()     // Catch:{ all -> 0x0046 }
            r4 = 5
            if (r3 < r4) goto L_0x0033
            goto L_0x0010
        L_0x0033:
            r1.remove()     // Catch:{ all -> 0x0046 }
            java.util.concurrent.atomic.AtomicInteger r3 = r2.a     // Catch:{ all -> 0x0046 }
            r3.incrementAndGet()     // Catch:{ all -> 0x0046 }
            r0.add(r2)     // Catch:{ all -> 0x0046 }
            java.lang.Object r3 = r8.c     // Catch:{ all -> 0x0046 }
            java.util.ArrayDeque r3 = (java.util.ArrayDeque) r3     // Catch:{ all -> 0x0046 }
            r3.add(r2)     // Catch:{ all -> 0x0046 }
            goto L_0x0010
        L_0x0046:
            r0 = move-exception
            goto L_0x00a3
        L_0x0048:
            monitor-enter(r8)     // Catch:{ all -> 0x0046 }
            java.lang.Object r1 = r8.c     // Catch:{ all -> 0x00a0 }
            java.util.ArrayDeque r1 = (java.util.ArrayDeque) r1     // Catch:{ all -> 0x00a0 }
            r1.size()     // Catch:{ all -> 0x00a0 }
            java.lang.Object r1 = r8.o     // Catch:{ all -> 0x00a0 }
            java.util.ArrayDeque r1 = (java.util.ArrayDeque) r1     // Catch:{ all -> 0x00a0 }
            r1.size()     // Catch:{ all -> 0x00a0 }
            monitor-exit(r8)     // Catch:{ all -> 0x0046 }
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0046 }
            monitor-exit(r8)
            int r1 = r0.size()
            r2 = 0
        L_0x0060:
            if (r2 >= r1) goto L_0x009f
            java.lang.Object r3 = r0.get(r2)
            htc r3 = (defpackage.htc) r3
            java.util.concurrent.ExecutorService r4 = r8.s()
            jtc r5 = r3.c
            rla r6 = r5.y0
            srd r6 = r6.a
            byte[] r6 = defpackage.u0g.a
            r4.execute(r3)     // Catch:{ RejectedExecutionException -> 0x007a }
            goto L_0x0094
        L_0x0078:
            r8 = move-exception
            goto L_0x0097
        L_0x007a:
            r4 = move-exception
            java.io.InterruptedIOException r6 = new java.io.InterruptedIOException     // Catch:{ all -> 0x0078 }
            java.lang.String r7 = "executor rejected"
            r6.<init>(r7)     // Catch:{ all -> 0x0078 }
            r6.initCause(r4)     // Catch:{ all -> 0x0078 }
            r5.l(r6)     // Catch:{ all -> 0x0078 }
            yn1 r4 = r3.b     // Catch:{ all -> 0x0078 }
            r4.o(r5, r6)     // Catch:{ all -> 0x0078 }
            rla r4 = r5.y0
            srd r4 = r4.a
            r4.x(r3)
        L_0x0094:
            int r2 = r2 + 1
            goto L_0x0060
        L_0x0097:
            rla r0 = r5.y0
            srd r0 = r0.a
            r0.x(r3)
            throw r8
        L_0x009f:
            return
        L_0x00a0:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x00a0 }
            throw r0     // Catch:{ all -> 0x0046 }
        L_0x00a3:
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.srd.N():void");
    }

    public void O(qk3 qk3, qk3 qk32) {
        or7 or7 = (or7) this.o;
        if (or7 == null || or7.f()) {
            jha d = ((pz) ((List) this.b).get(0)).d();
            jbf jbf = (jbf) ((hs7) this.a).get();
            jbf.getClass();
            pka x = d.x(((kbf) jbf).a());
            or7 or72 = new or7(qk3, qk32, m58.e);
            x.a(or72);
            this.o = or72;
        }
    }

    public void P() {
        int j;
        int i = 16908360;
        ViewPager2 viewPager2 = (ViewPager2) this.o;
        gag.h(viewPager2, 16908360);
        boolean z = false;
        gag.e(viewPager2, 0);
        gag.h(viewPager2, 16908361);
        gag.e(viewPager2, 0);
        gag.h(viewPager2, 16908358);
        gag.e(viewPager2, 0);
        gag.h(viewPager2, 16908359);
        gag.e(viewPager2, 0);
        if (viewPager2.getAdapter() != null && (j = viewPager2.getAdapter().j()) != 0 && viewPager2.D0) {
            int orientation = viewPager2.getOrientation();
            yu9 yu9 = (yu9) this.b;
            syc syc = (syc) this.a;
            if (orientation == 0) {
                if (viewPager2.x.H() == 1) {
                    z = true;
                }
                int i2 = z ? 16908360 : 16908361;
                if (z) {
                    i = 16908361;
                }
                if (viewPager2.o < j - 1) {
                    gag.i(viewPager2, new a4(i2, (String) null), syc);
                }
                if (viewPager2.o > 0) {
                    gag.i(viewPager2, new a4(i, (String) null), yu9);
                    return;
                }
                return;
            }
            if (viewPager2.o < j - 1) {
                gag.i(viewPager2, new a4(16908359, (String) null), syc);
            }
            if (viewPager2.o > 0) {
                gag.i(viewPager2, new a4(16908358, (String) null), yu9);
            }
        }
    }

    public void a(int i, mz8 mz8, k28 k28, es8 es8) {
        if (I(i, mz8)) {
            ((uz8) this.b).e(k28, J(es8));
        }
    }

    public void b(HashMap hashMap) {
        SQLiteDatabase writableDatabase;
        try {
            writableDatabase = ((u74) this.b).getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            B(writableDatabase);
            for (fy0 o2 : hashMap.values()) {
                o(writableDatabase, o2);
            }
            writableDatabase.setTransactionSuccessful();
            ((SparseArray) this.c).clear();
            writableDatabase.endTransaction();
        } catch (SQLException e) {
            throw new IOException(e);
        } catch (Throwable th) {
            writableDatabase.endTransaction();
            throw th;
        }
    }

    public void c(fy0 fy0, boolean z) {
        SparseArray sparseArray = (SparseArray) this.c;
        int i = fy0.a;
        if (z) {
            sparseArray.delete(i);
        } else {
            sparseArray.put(i, (Object) null);
        }
    }

    public void d(fy0 fy0) {
        ((SparseArray) this.c).put(fy0.a, fy0);
    }

    public boolean e() {
        try {
            SQLiteDatabase readableDatabase = ((u74) this.b).getReadableDatabase();
            String str = (String) this.a;
            str.getClass();
            return p2g.a(readableDatabase, 1, str) != -1;
        } catch (SQLException e) {
            throw new IOException(e);
        }
    }

    public void g(int i, mz8 mz8, Exception exc) {
        if (I(i, mz8)) {
            ((fw4) this.c).e(exc);
        }
    }

    public Object get() {
        lzf lzf = (lzf) ((Provider) this.o).get();
        return new rm7((Context) ((Provider) this.a).get(), (g95) ((Provider) this.b).get(), (bc0) ((Provider) this.c).get());
    }

    public void h(kv0 kv0) {
        if (!jbd.d((or7) this.o)) {
            z68.c("a96", "Font already loading", new Object[0]);
            return;
        }
        aja aja = new aja(1, new h5(19, this));
        Lazy lazy = (Lazy) this.b;
        jbf jbf = (jbf) lazy.getValue();
        jbf.getClass();
        lja s = aja.x(((kbf) jbf).a()).s(((kbf) ((jbf) lazy.getValue())).c());
        or7 or7 = new or7(new maf(this, kv0, 0), new maf(this, kv0, 1), m58.e);
        s.a(or7);
        this.o = or7;
    }

    public void i(HashMap hashMap) {
        SQLiteDatabase writableDatabase;
        SparseArray sparseArray = (SparseArray) this.c;
        if (sparseArray.size() != 0) {
            try {
                writableDatabase = ((u74) this.b).getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                for (int i = 0; i < sparseArray.size(); i++) {
                    fy0 fy0 = (fy0) sparseArray.valueAt(i);
                    if (fy0 == null) {
                        int keyAt = sparseArray.keyAt(i);
                        String str = (String) this.o;
                        str.getClass();
                        writableDatabase.delete(str, "id = ?", new String[]{Integer.toString(keyAt)});
                    } else {
                        o(writableDatabase, fy0);
                    }
                }
                writableDatabase.setTransactionSuccessful();
                sparseArray.clear();
                writableDatabase.endTransaction();
            } catch (SQLException e) {
                throw new IOException(e);
            } catch (Throwable th) {
                writableDatabase.endTransaction();
                throw th;
            }
        }
    }

    public void j(long j) {
        String hexString = Long.toHexString(j);
        this.a = hexString;
        this.o = a81.m("ExoPlayerCacheIndex", hexString);
    }

    public dz6 k() {
        a32 G = ((r62) this.c).G(((a32) this.a).a);
        if (G != null) {
            this.a = G;
        }
        return new xc2(this, r62.N(((a32) this.a).b, (Set) this.o));
    }

    public void l(HashMap hashMap, SparseArray sparseArray) {
        Cursor query;
        SQLiteDatabase writableDatabase;
        u74 u74 = (u74) this.b;
        n79.n(((SparseArray) this.c).size() == 0);
        try {
            SQLiteDatabase readableDatabase = u74.getReadableDatabase();
            String str = (String) this.a;
            str.getClass();
            if (p2g.a(readableDatabase, 1, str) != 1) {
                writableDatabase = u74.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                B(writableDatabase);
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
            }
            SQLiteDatabase readableDatabase2 = u74.getReadableDatabase();
            String str2 = (String) this.o;
            str2.getClass();
            query = readableDatabase2.query(str2, v, (String) null, (String[]) null, (String) null, (String) null, (String) null);
            while (query.moveToNext()) {
                int i = query.getInt(0);
                String string = query.getString(1);
                string.getClass();
                hashMap.put(string, new fy0(i, string, d23.d(new DataInputStream(new ByteArrayInputStream(query.getBlob(2))))));
                sparseArray.put(i, string);
            }
            query.close();
            return;
        } catch (SQLiteException e) {
            hashMap.clear();
            sparseArray.clear();
            throw new IOException(e);
        } catch (Throwable th) {
            writableDatabase.endTransaction();
            throw th;
        }
        throw th;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01df, code lost:
        r11 = kotlin.uuid.Uuid.SIZE_BITS;
        r15 = null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m(byte[] r33, int r34, int r35, defpackage.hze r36, defpackage.pk3 r37) {
        /*
            r32 = this;
            r0 = r32
            r1 = r34
            r2 = 4
            r3 = 128(0x80, float:1.794E-43)
            int r5 = r1 + r35
            java.lang.Object r6 = r0.a
            l8b r6 = (defpackage.l8b) r6
            r7 = r33
            r6.E(r5, r7)
            r6.G(r1)
            int r1 = r6.a()
            r5 = 255(0xff, float:3.57E-43)
            r7 = 0
            r8 = 2
            if (r1 <= 0) goto L_0x00ab
            byte[] r1 = r6.a
            int r9 = r6.b
            byte r1 = r1[r9]
            r1 = r1 & r5
            r9 = 120(0x78, float:1.68E-43)
            if (r1 != r9) goto L_0x00ab
            java.lang.Object r1 = r0.o
            java.util.zip.Inflater r1 = (java.util.zip.Inflater) r1
            if (r1 != 0) goto L_0x0037
            java.util.zip.Inflater r1 = new java.util.zip.Inflater
            r1.<init>()
            r0.o = r1
        L_0x0037:
            java.lang.Object r1 = r0.o
            java.util.zip.Inflater r1 = (java.util.zip.Inflater) r1
            int r9 = defpackage.v0g.a
            int r9 = r6.a()
            if (r9 > 0) goto L_0x0044
            goto L_0x00ab
        L_0x0044:
            java.lang.Object r9 = r0.b
            l8b r9 = (defpackage.l8b) r9
            byte[] r10 = r9.a
            int r10 = r10.length
            int r11 = r6.a()
            if (r10 >= r11) goto L_0x0059
            int r10 = r6.a()
            int r10 = r10 * r8
            r9.b(r10)
        L_0x0059:
            if (r1 != 0) goto L_0x0060
            java.util.zip.Inflater r1 = new java.util.zip.Inflater
            r1.<init>()
        L_0x0060:
            byte[] r10 = r6.a
            int r11 = r6.b
            int r12 = r6.a()
            r1.setInput(r10, r11, r12)
            r10 = r7
        L_0x006c:
            byte[] r11 = r9.a     // Catch:{ DataFormatException -> 0x00a3, all -> 0x0089 }
            int r12 = r11.length     // Catch:{ DataFormatException -> 0x00a3, all -> 0x0089 }
            int r12 = r12 - r10
            int r11 = r1.inflate(r11, r10, r12)     // Catch:{ DataFormatException -> 0x00a3, all -> 0x0089 }
            int r10 = r10 + r11
            boolean r11 = r1.finished()     // Catch:{ DataFormatException -> 0x00a3, all -> 0x0089 }
            if (r11 == 0) goto L_0x008b
            r9.F(r10)     // Catch:{ DataFormatException -> 0x00a3, all -> 0x0089 }
            r1.reset()
            byte[] r1 = r9.a
            int r9 = r9.c
            r6.E(r9, r1)
            goto L_0x00ab
        L_0x0089:
            r0 = move-exception
            goto L_0x00a7
        L_0x008b:
            boolean r11 = r1.needsDictionary()     // Catch:{ DataFormatException -> 0x00a3, all -> 0x0089 }
            if (r11 != 0) goto L_0x00a3
            boolean r11 = r1.needsInput()     // Catch:{ DataFormatException -> 0x00a3, all -> 0x0089 }
            if (r11 == 0) goto L_0x0098
            goto L_0x00a3
        L_0x0098:
            byte[] r11 = r9.a     // Catch:{ DataFormatException -> 0x00a3, all -> 0x0089 }
            int r12 = r11.length     // Catch:{ DataFormatException -> 0x00a3, all -> 0x0089 }
            if (r10 != r12) goto L_0x006c
            int r11 = r11.length     // Catch:{ DataFormatException -> 0x00a3, all -> 0x0089 }
            int r11 = r11 * r8
            r9.b(r11)     // Catch:{ DataFormatException -> 0x00a3, all -> 0x0089 }
            goto L_0x006c
        L_0x00a3:
            r1.reset()
            goto L_0x00ab
        L_0x00a7:
            r1.reset()
            throw r0
        L_0x00ab:
            java.lang.Object r0 = r0.c
            odb r0 = (defpackage.odb) r0
            r0.c = r7
            r0.d = r7
            r0.e = r7
            r0.f = r7
            r0.g = r7
            r0.h = r7
            java.lang.Object r1 = r0.i
            l8b r1 = (defpackage.l8b) r1
            r1.D(r7)
            r0.b = r7
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
        L_0x00c9:
            int r9 = r6.a()
            r10 = 3
            if (r9 < r10) goto L_0x02be
            int r9 = r6.c
            int r11 = r6.u()
            int r12 = r6.A()
            int r13 = r6.b
            int r13 = r13 + r12
            if (r13 <= r9) goto L_0x00e9
            r6.G(r9)
            r11 = r3
            r35 = r14
            r9 = 1
            r15 = 0
            goto L_0x02b1
        L_0x00e9:
            java.lang.Object r9 = r0.a
            int[] r9 = (int[]) r9
            if (r11 == r3) goto L_0x01e5
            switch(r11) {
                case 20: goto L_0x0161;
                case 21: goto L_0x0119;
                case 22: goto L_0x00f6;
                default: goto L_0x00f2;
            }
        L_0x00f2:
            r35 = r14
            goto L_0x01df
        L_0x00f6:
            r9 = 19
            if (r12 >= r9) goto L_0x00fb
            goto L_0x00f2
        L_0x00fb:
            int r9 = r6.A()
            r0.c = r9
            int r9 = r6.A()
            r0.d = r9
            r9 = 11
            r6.H(r9)
            int r9 = r6.A()
            r0.e = r9
            int r9 = r6.A()
            r0.f = r9
            goto L_0x00f2
        L_0x0119:
            if (r12 >= r2) goto L_0x011c
            goto L_0x00f2
        L_0x011c:
            r6.H(r10)
            int r9 = r6.u()
            r9 = r9 & r3
            if (r9 == 0) goto L_0x0128
            r9 = 1
            goto L_0x0129
        L_0x0128:
            r9 = r7
        L_0x0129:
            int r10 = r12 + -4
            if (r9 == 0) goto L_0x014a
            r9 = 7
            if (r10 >= r9) goto L_0x0131
            goto L_0x00f2
        L_0x0131:
            int r9 = r6.x()
            if (r9 >= r2) goto L_0x0138
            goto L_0x00f2
        L_0x0138:
            int r10 = r6.A()
            r0.g = r10
            int r10 = r6.A()
            r0.h = r10
            int r9 = r9 - r2
            r1.D(r9)
            int r10 = r12 + -11
        L_0x014a:
            int r9 = r1.b
            int r11 = r1.c
            if (r9 >= r11) goto L_0x00f2
            if (r10 <= 0) goto L_0x00f2
            int r11 = r11 - r9
            int r10 = java.lang.Math.min(r10, r11)
            byte[] r11 = r1.a
            r6.e(r9, r11, r10)
            int r9 = r9 + r10
            r1.G(r9)
            goto L_0x00f2
        L_0x0161:
            int r10 = r12 % 5
            if (r10 == r8) goto L_0x0166
            goto L_0x00f2
        L_0x0166:
            r6.H(r8)
            java.util.Arrays.fill(r9, r7)
            int r12 = r12 / 5
            r10 = r7
        L_0x016f:
            if (r10 >= r12) goto L_0x01da
            int r11 = r6.u()
            int r2 = r6.u()
            int r16 = r6.u()
            int r17 = r6.u()
            int r18 = r6.u()
            r32 = r9
            double r8 = (double) r2
            int r2 = r16 + -128
            double r4 = (double) r2
            r19 = 4608992865850220347(0x3ff66e978d4fdf3b, double:1.402)
            double r19 = r19 * r4
            r35 = r14
            double r14 = r19 + r8
            int r14 = (int) r14
            int r15 = r17 + -128
            double r2 = (double) r15
            r20 = 4599871095020959050(0x3fd60663c74fb54a, double:0.34414)
            double r20 = r20 * r2
            double r20 = r8 - r20
            r22 = 4604607620821057148(0x3fe6da3c21187e7c, double:0.71414)
            double r4 = r4 * r22
            double r4 = r20 - r4
            int r4 = (int) r4
            r20 = 4610659197712347431(0x3ffc5a1cac083127, double:1.772)
            double r2 = r2 * r20
            double r2 = r2 + r8
            int r2 = (int) r2
            int r3 = r18 << 24
            r5 = 255(0xff, float:3.57E-43)
            int r8 = defpackage.v0g.j(r14, r7, r5)
            int r8 = r8 << 16
            r3 = r3 | r8
            int r4 = defpackage.v0g.j(r4, r7, r5)
            int r4 = r4 << 8
            r3 = r3 | r4
            int r2 = defpackage.v0g.j(r2, r7, r5)
            r2 = r2 | r3
            r32[r11] = r2
            r2 = 1
            int r10 = r10 + r2
            r9 = r32
            r14 = r35
            r2 = 4
            r3 = 128(0x80, float:1.794E-43)
            r8 = 2
            goto L_0x016f
        L_0x01da:
            r35 = r14
            r2 = 1
            r0.b = r2
        L_0x01df:
            r9 = 1
            r11 = 128(0x80, float:1.794E-43)
            r15 = 0
            goto L_0x02ae
        L_0x01e5:
            r32 = r9
            r35 = r14
            int r2 = r0.c
            if (r2 == 0) goto L_0x0205
            int r2 = r0.d
            if (r2 == 0) goto L_0x0205
            int r2 = r0.g
            if (r2 == 0) goto L_0x0205
            int r2 = r0.h
            if (r2 == 0) goto L_0x0205
            int r2 = r1.c
            if (r2 == 0) goto L_0x0205
            int r3 = r1.b
            if (r3 != r2) goto L_0x0205
            boolean r2 = r0.b
            if (r2 != 0) goto L_0x020a
        L_0x0205:
            r9 = 1
            r11 = 128(0x80, float:1.794E-43)
            goto L_0x029c
        L_0x020a:
            r1.G(r7)
            int r2 = r0.g
            int r3 = r0.h
            int r2 = r2 * r3
            int[] r3 = new int[r2]
            r4 = r7
        L_0x0215:
            if (r4 >= r2) goto L_0x0254
            int r8 = r1.u()
            if (r8 == 0) goto L_0x0228
            r9 = 1
            int r10 = r4 + 1
            r8 = r32[r8]
            r3[r4] = r8
            r4 = r10
        L_0x0225:
            r11 = 128(0x80, float:1.794E-43)
            goto L_0x0215
        L_0x0228:
            r9 = 1
            int r8 = r1.u()
            if (r8 == 0) goto L_0x0225
            r10 = r8 & 64
            if (r10 != 0) goto L_0x0238
            r10 = r8 & 63
        L_0x0235:
            r11 = 128(0x80, float:1.794E-43)
            goto L_0x0242
        L_0x0238:
            r10 = r8 & 63
            int r10 = r10 << 8
            int r11 = r1.u()
            r10 = r10 | r11
            goto L_0x0235
        L_0x0242:
            r8 = r8 & r11
            if (r8 != 0) goto L_0x0248
            r8 = r32[r7]
            goto L_0x024e
        L_0x0248:
            int r8 = r1.u()
            r8 = r32[r8]
        L_0x024e:
            int r10 = r10 + r4
            java.util.Arrays.fill(r3, r4, r10, r8)
            r4 = r10
            goto L_0x0215
        L_0x0254:
            r9 = 1
            r11 = 128(0x80, float:1.794E-43)
            int r2 = r0.g
            int r4 = r0.h
            android.graphics.Bitmap$Config r8 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r18 = android.graphics.Bitmap.createBitmap(r3, r2, r4, r8)
            int r2 = r0.e
            float r2 = (float) r2
            int r3 = r0.c
            float r3 = (float) r3
            float r22 = r2 / r3
            int r2 = r0.f
            float r2 = (float) r2
            int r4 = r0.d
            float r4 = (float) r4
            float r19 = r2 / r4
            int r2 = r0.g
            float r2 = (float) r2
            float r26 = r2 / r3
            int r2 = r0.h
            float r2 = (float) r2
            float r27 = r2 / r4
            n44 r2 = new n44
            r14 = r2
            r29 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r31 = 0
            r16 = 0
            r17 = r16
            r15 = r16
            r20 = 0
            r21 = 0
            r23 = 0
            r30 = -2147483648(0xffffffff80000000, float:-0.0)
            r24 = r30
            r25 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r28 = 0
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r15 = r2
            goto L_0x029d
        L_0x029c:
            r15 = 0
        L_0x029d:
            r0.c = r7
            r0.d = r7
            r0.e = r7
            r0.f = r7
            r0.g = r7
            r0.h = r7
            r1.D(r7)
            r0.b = r7
        L_0x02ae:
            r6.G(r13)
        L_0x02b1:
            r2 = r35
            if (r15 == 0) goto L_0x02b8
            r2.add(r15)
        L_0x02b8:
            r14 = r2
            r3 = r11
            r2 = 4
            r8 = 2
            goto L_0x00c9
        L_0x02be:
            r2 = r14
            q44 r0 = new q44
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r9 = r0
            r9.<init>(r10, r12, r14)
            r1 = r37
            r1.accept(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.srd.m(byte[], int, int, hze, pk3):void");
    }

    public void n() {
        SQLiteDatabase writableDatabase;
        u74 u74 = (u74) this.b;
        String str = (String) this.a;
        str.getClass();
        try {
            String concat = "ExoPlayerCacheIndex".concat(str);
            writableDatabase = u74.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            int i = p2g.a;
            if (v0g.f0(writableDatabase, "ExoPlayerVersions")) {
                writableDatabase.delete("ExoPlayerVersions", "feature = ? AND instance_uid = ?", new String[]{Integer.toString(1), str});
            }
            writableDatabase.execSQL("DROP TABLE IF EXISTS " + concat);
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
        } catch (SQLException e) {
            throw new IOException(e);
        } catch (SQLException e2) {
            throw new IOException(e2);
        } catch (Throwable th) {
            writableDatabase.endTransaction();
            throw th;
        }
    }

    public void o(SQLiteDatabase sQLiteDatabase, fy0 fy0) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        d23.e(fy0.e, new DataOutputStream(byteArrayOutputStream));
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Integer.valueOf(fy0.a));
        contentValues.put("key", fy0.b);
        contentValues.put("metadata", byteArray);
        String str = (String) this.o;
        str.getClass();
        sQLiteDatabase.replaceOrThrow(str, (String) null, contentValues);
    }

    public synchronized void p() {
        try {
            Iterator it = ((ArrayDeque) this.b).iterator();
            while (it.hasNext()) {
                ((htc) it.next()).c.e();
            }
            Iterator it2 = ((ArrayDeque) this.c).iterator();
            while (it2.hasNext()) {
                ((htc) it2.next()).c.e();
            }
            Iterator it3 = ((ArrayDeque) this.o).iterator();
            while (it3.hasNext()) {
                ((jtc) it3.next()).e();
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public int q() {
        return 2;
    }

    public boolean r(a aVar, int i, int i2, Intent intent, x6 x6Var) {
        if (i != 666 || i2 != -1) {
            return false;
        }
        osa osa = (osa) ((qra) ym.e()).G();
        ev0.v(ys6.a, osa.b(), (f14) null, new zv6(intent, this, aVar, osa, x6Var, (Continuation) null), 2);
        return true;
    }

    public synchronized ExecutorService s() {
        try {
            if (((ExecutorService) this.a) == null) {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                SynchronousQueue synchronousQueue = new SynchronousQueue();
                this.a = new ThreadPoolExecutor(0, IntCompanionObject.MAX_VALUE, 60, timeUnit, synchronousQueue, new re3(u0g.g + " Dispatcher", false));
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return (ExecutorService) this.a;
    }

    public void t(ArrayDeque arrayDeque, Object obj) {
        synchronized (this) {
            if (arrayDeque.remove(obj)) {
                Unit unit = Unit.INSTANCE;
            } else {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        N();
    }

    public void u(int i, mz8 mz8, k28 k28, es8 es8, IOException iOException, boolean z) {
        if (I(i, mz8)) {
            ((uz8) this.b).j(k28, J(es8), iOException, z);
        }
    }

    public void v(int i, mz8 mz8) {
        if (I(i, mz8)) {
            ((fw4) this.c).a();
        }
    }

    public void w(int i, mz8 mz8, int i2) {
        if (I(i, mz8)) {
            ((fw4) this.c).d(i2);
        }
    }

    public void x(htc htc) {
        htc.a.decrementAndGet();
        t((ArrayDeque) this.c, htc);
    }

    public up9 z(String str) {
        if (!((ConcurrentHashMap) this.o).containsKey(str)) {
            synchronized (this) {
                try {
                    if (!((ConcurrentHashMap) this.o).containsKey(str)) {
                        InputStream c2 = ((bq9) this.a).c(str);
                        ((cq9) this.b).getClass();
                        for (reb c3 : cq9.a(c2)) {
                            ((up9) this.c).c(c3);
                        }
                        ((ConcurrentHashMap) this.o).put(str, str);
                    }
                } catch (IllegalArgumentException | IllegalStateException e) {
                    throw new IllegalStateException("Failed to read file " + str, e);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return (up9) this.c;
    }

    public /* synthetic */ srd(Object obj, Object obj2, Object obj3, Object obj4) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.o = obj4;
    }

    public srd(Lazy lazy, Lazy lazy2, Lazy lazy3, int i) {
        switch (i) {
            case 8:
                this.b = LazyKt.lazy(new ur(18, lazy3));
                this.c = lazy2;
                this.o = lazy;
                this.a = lazy3;
                return;
            default:
                this.a = srd.class.getName();
                this.b = lazy;
                this.c = lazy2;
                this.o = lazy3;
                return;
        }
    }

    public srd(int i) {
        switch (i) {
            case 9:
                this.a = new l8b();
                this.b = new l8b();
                this.c = new odb(1);
                return;
            case 11:
                this.b = Runtime.getRuntime();
                Method nativeLoadRuntimeMethod = w6f.getNativeLoadRuntimeMethod();
                this.c = nativeLoadRuntimeMethod;
                String str = null;
                String classLoaderLdLoadLibrary = nativeLoadRuntimeMethod != null ? w6f.getClassLoaderLdLoadLibrary() : null;
                this.a = classLoaderLdLoadLibrary;
                if (classLoaderLdLoadLibrary != null) {
                    String[] split = classLoaderLdLoadLibrary.split(":");
                    ArrayList arrayList = new ArrayList(split.length);
                    for (String str2 : split) {
                        if (!str2.contains("!")) {
                            arrayList.add(str2);
                        }
                    }
                    str = TextUtils.join(":", arrayList);
                }
                this.o = str;
                return;
            default:
                this.b = new ArrayDeque();
                this.c = new ArrayDeque();
                this.o = new ArrayDeque();
                return;
        }
    }
}
