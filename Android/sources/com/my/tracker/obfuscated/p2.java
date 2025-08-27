package com.my.tracker.obfuscated;

import android.content.Context;
import com.my.tracker.obfuscated.j2;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.jvm.internal.IntCompanionObject;

public final class p2 implements o2 {
    final int a;
    b2 b;
    j2 c = null;
    int d = IntCompanionObject.MIN_VALUE;

    private p2(int i, b2 b2Var) {
        this.a = i;
        this.b = b2Var;
        x2.a("TimeSpentRepository: repository created but not initialized. Will initialized when first timespent tick will arrive");
    }

    private boolean c() {
        return this.c != null && this.d >= 0;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ j2 d() {
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        r3 = "TimeSpentRepository: something went wrong while deleting " + r3.length + " packets from db";
        com.my.tracker.obfuscated.x2.b(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0029, code lost:
        throw new java.lang.Exception(r3);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x000f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void a(long[] r3) {
        /*
            r2 = this;
            java.lang.String r0 = "TimeSpentRepository: something went wrong while deleting "
            monitor-enter(r2)
            com.my.tracker.obfuscated.j2 r1 = r2.c     // Catch:{ Exception -> 0x000f }
            java.util.Objects.requireNonNull(r1)     // Catch:{ Exception -> 0x000f }
            r1.a((long[]) r3)     // Catch:{ Exception -> 0x000f }
            monitor-exit(r2)
            return
        L_0x000d:
            r3 = move-exception
            goto L_0x002a
        L_0x000f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x000d }
            r1.<init>(r0)     // Catch:{ all -> 0x000d }
            int r3 = r3.length     // Catch:{ all -> 0x000d }
            r1.append(r3)     // Catch:{ all -> 0x000d }
            java.lang.String r3 = " packets from db"
            r1.append(r3)     // Catch:{ all -> 0x000d }
            java.lang.String r3 = r1.toString()     // Catch:{ all -> 0x000d }
            com.my.tracker.obfuscated.x2.b(r3)     // Catch:{ all -> 0x000d }
            java.lang.Exception r0 = new java.lang.Exception     // Catch:{ all -> 0x000d }
            r0.<init>(r3)     // Catch:{ all -> 0x000d }
            throw r0     // Catch:{ all -> 0x000d }
        L_0x002a:
            monitor-exit(r2)     // Catch:{ all -> 0x000d }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.tracker.obfuscated.p2.a(long[]):void");
    }

    public void b() {
        if (!c()) {
            x2.a("TimeSpentRepository: initializing repository...");
            try {
                j2 j2Var = (j2) this.b.a();
                this.c = j2Var;
                this.d = j2Var.a();
                this.b = new hxf(21);
                x2.a("TimeSpentRepository: successfully initialized, current size = " + this.d + ", max size = " + this.a);
            } catch (Exception e) {
                x2.b("TimeSpentRepository: error occured while initialization repository, repository not initialized", e);
                this.c = null;
                this.d = IntCompanionObject.MIN_VALUE;
                throw e;
            }
        }
    }

    private void a() {
        int i = (this.d - this.a) + 1;
        try {
            j2 j2Var = this.c;
            Objects.requireNonNull(j2Var);
            int a2 = j2Var.a(i);
            this.d -= a2;
            x2.a("TimeSpentRepository: successfully deleted " + a2 + "(requested = " + i + ") oldest tick packets from db, currentDbSize = " + this.d + " (reason: need free up space for new packet)");
        } catch (Exception e) {
            StringBuilder o = wj6.o(i, "TimeSpentRepository: something went wrong while trying to delete oldest", " tick packets from db (reason: need free up space for new packet, maxSize = ");
            o.append(this.a);
            o.append(", current size = ");
            o.append(this.d);
            o.append("), can't store new tick packet");
            x2.b(o.toString(), e);
            throw new Exception(e);
        }
    }

    public synchronized s2[] a(int i) {
        j2.b b2;
        s2[] s2VarArr;
        try {
            j2 j2Var = this.c;
            Objects.requireNonNull(j2Var);
            b2 = j2Var.b(i);
            ArrayList arrayList = new ArrayList(i);
            while (b2.b()) {
                arrayList.add(new s2(b2.n(), b2.m()));
            }
            x2.a("TimeSpentRepository: read " + arrayList.size() + " freshest packets from db");
            s2VarArr = arrayList.isEmpty() ? null : (s2[]) arrayList.toArray(new s2[0]);
            b2.close();
        } catch (Throwable th) {
            x2.b("TimeSpentRepository: error while reading " + i + " freshest tick packets", th);
            return null;
        }
        return s2VarArr;
        throw th;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ j2 a(String str, Context context) {
        try {
            return j2.a(str, context);
        } catch (Exception e) {
            x2.b("TimeSpentRepository: can't initialize sql database", e);
            throw new RuntimeException(e);
        }
    }

    public static p2 a(int i, y2 y2Var, Context context) {
        return new p2(i, new hzf(context, y2Var.g()));
    }

    public synchronized void a(long j, byte[] bArr) {
        try {
            if (!c()) {
                b();
            }
            if (this.d >= this.a) {
                a();
            }
            long a2 = this.c.a(j, bArr);
            this.d++;
            x2.a("TimeSpentRepository: successfully stored new tick packet to db, tickPacketId = " + a2 + " (current db size = " + this.d + ")");
        } catch (Exception e) {
            x2.b("TimeSpentRepository: something went wrong while saving new tick packet in database, this tick wouldn't be stored");
            throw new Exception(e);
        } catch (Exception e2) {
            x2.b("TimeSpentRepository: free up database failed, can't put new TimeSpentTick (reason: db still full)");
            throw new Exception(e2);
        } catch (Throwable th) {
            throw th;
        }
    }
}
