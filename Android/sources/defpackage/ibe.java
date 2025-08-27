package defpackage;

import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: ibe  reason: default package */
public abstract class ibe implements wye, x94 {
    public SubtitleDecoderException X;
    public boolean Y;
    public boolean Z;
    public final yae a;
    public final Object b = new Object();
    public final ArrayDeque c = new ArrayDeque();
    public final ArrayDeque o = new ArrayDeque();
    public final aa4[] v = new bze[2];
    public final dze[] w;
    public int x = 2;
    public int y;
    public aa4 z;

    public ibe() {
        boolean z2;
        dze[] dzeArr = new dze[2];
        int i = 0;
        while (true) {
            z2 = true;
            if (i >= this.x) {
                break;
            }
            this.v[i] = new aa4(1);
            i++;
        }
        this.w = dzeArr;
        this.y = 2;
        for (int i2 = 0; i2 < this.y; i2++) {
            this.w[i2] = new py1(this, 2);
        }
        yae yae = new yae(0, this);
        this.a = yae;
        yae.start();
        int i3 = this.x;
        aa4[] aa4Arr = this.v;
        y64.j(i3 != aa4Arr.length ? false : z2);
        for (aa4 B : aa4Arr) {
            B.B(1024);
        }
    }

    public abstract uye a(int i, byte[] bArr, boolean z2);

    public final void b(long j) {
    }

    public final SubtitleDecoderException c(aa4 aa4, dze dze, boolean z2) {
        bze bze = (bze) aa4;
        try {
            ByteBuffer byteBuffer = bze.o;
            byteBuffer.getClass();
            dze.A(bze.w, a(byteBuffer.limit(), byteBuffer.array(), z2), bze.X);
            dze.b &= IntCompanionObject.MAX_VALUE;
            return null;
        } catch (SubtitleDecoderException e) {
            return e;
        }
    }

    public final dze d() {
        synchronized (this.b) {
            try {
                SubtitleDecoderException subtitleDecoderException = this.X;
                if (subtitleDecoderException != null) {
                    throw subtitleDecoderException;
                } else if (this.o.isEmpty()) {
                    return null;
                } else {
                    dze dze = (dze) this.o.removeFirst();
                    return dze;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r5v4, types: [java.lang.Exception] */
    /* JADX WARNING: type inference failed for: r5v6, types: [java.lang.Exception] */
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006f  */
    public final boolean e() {
        /*
            r8 = this;
            java.lang.Object r0 = r8.b
            monitor-enter(r0)
        L_0x0003:
            boolean r1 = r8.Z     // Catch:{ all -> 0x0020 }
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x0023
            java.util.ArrayDeque r1 = r8.c     // Catch:{ all -> 0x0020 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0020 }
            if (r1 != 0) goto L_0x0017
            int r1 = r8.y     // Catch:{ all -> 0x0020 }
            if (r1 <= 0) goto L_0x0017
            r1 = r3
            goto L_0x0018
        L_0x0017:
            r1 = r2
        L_0x0018:
            if (r1 != 0) goto L_0x0023
            java.lang.Object r1 = r8.b     // Catch:{ all -> 0x0020 }
            r1.wait()     // Catch:{ all -> 0x0020 }
            goto L_0x0003
        L_0x0020:
            r8 = move-exception
            goto L_0x00a6
        L_0x0023:
            boolean r1 = r8.Z     // Catch:{ all -> 0x0020 }
            if (r1 == 0) goto L_0x0029
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            return r2
        L_0x0029:
            java.util.ArrayDeque r1 = r8.c     // Catch:{ all -> 0x0020 }
            java.lang.Object r1 = r1.removeFirst()     // Catch:{ all -> 0x0020 }
            aa4 r1 = (defpackage.aa4) r1     // Catch:{ all -> 0x0020 }
            dze[] r4 = r8.w     // Catch:{ all -> 0x0020 }
            int r5 = r8.y     // Catch:{ all -> 0x0020 }
            int r5 = r5 - r3
            r8.y = r5     // Catch:{ all -> 0x0020 }
            r4 = r4[r5]     // Catch:{ all -> 0x0020 }
            boolean r5 = r8.Y     // Catch:{ all -> 0x0020 }
            r8.Y = r2     // Catch:{ all -> 0x0020 }
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            r0 = 4
            boolean r6 = r1.h(r0)
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r6 == 0) goto L_0x004c
            r4.a(r0)
            goto L_0x0079
        L_0x004c:
            boolean r0 = r1.h(r7)
            if (r0 == 0) goto L_0x0055
            r4.a(r7)
        L_0x0055:
            com.google.android.exoplayer2.text.SubtitleDecoderException r0 = r8.c(r1, r4, r5)     // Catch:{ RuntimeException -> 0x0064, OutOfMemoryError -> 0x005a }
            goto L_0x006d
        L_0x005a:
            r0 = move-exception
            com.google.android.exoplayer2.text.SubtitleDecoderException r5 = new com.google.android.exoplayer2.text.SubtitleDecoderException
            java.lang.String r6 = "Unexpected decode error"
            r5.<init>(r6, r0)
        L_0x0062:
            r0 = r5
            goto L_0x006d
        L_0x0064:
            r0 = move-exception
            com.google.android.exoplayer2.text.SubtitleDecoderException r5 = new com.google.android.exoplayer2.text.SubtitleDecoderException
            java.lang.String r6 = "Unexpected decode error"
            r5.<init>(r6, r0)
            goto L_0x0062
        L_0x006d:
            if (r0 == 0) goto L_0x0079
            java.lang.Object r5 = r8.b
            monitor-enter(r5)
            r8.X = r0     // Catch:{ all -> 0x0076 }
            monitor-exit(r5)     // Catch:{ all -> 0x0076 }
            return r2
        L_0x0076:
            r8 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0076 }
            throw r8
        L_0x0079:
            java.lang.Object r2 = r8.b
            monitor-enter(r2)
            boolean r0 = r8.Y     // Catch:{ all -> 0x0084 }
            if (r0 == 0) goto L_0x0086
            r4.z()     // Catch:{ all -> 0x0084 }
            goto L_0x0095
        L_0x0084:
            r8 = move-exception
            goto L_0x00a4
        L_0x0086:
            boolean r0 = r4.h(r7)     // Catch:{ all -> 0x0084 }
            if (r0 == 0) goto L_0x0090
            r4.z()     // Catch:{ all -> 0x0084 }
            goto L_0x0095
        L_0x0090:
            java.util.ArrayDeque r0 = r8.o     // Catch:{ all -> 0x0084 }
            r0.addLast(r4)     // Catch:{ all -> 0x0084 }
        L_0x0095:
            r1.z()     // Catch:{ all -> 0x0084 }
            int r0 = r8.x     // Catch:{ all -> 0x0084 }
            int r4 = r0 + 1
            r8.x = r4     // Catch:{ all -> 0x0084 }
            aa4[] r8 = r8.v     // Catch:{ all -> 0x0084 }
            r8[r0] = r1     // Catch:{ all -> 0x0084 }
            monitor-exit(r2)     // Catch:{ all -> 0x0084 }
            return r3
        L_0x00a4:
            monitor-exit(r2)     // Catch:{ all -> 0x0084 }
            throw r8
        L_0x00a6:
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ibe.e():boolean");
    }

    public final Object f() {
        aa4 aa4;
        synchronized (this.b) {
            try {
                SubtitleDecoderException subtitleDecoderException = this.X;
                if (subtitleDecoderException == null) {
                    y64.j(this.z == null);
                    int i = this.x;
                    if (i == 0) {
                        aa4 = null;
                    } else {
                        aa4[] aa4Arr = this.v;
                        int i2 = i - 1;
                        this.x = i2;
                        aa4 = aa4Arr[i2];
                    }
                    this.z = aa4;
                } else {
                    throw subtitleDecoderException;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return aa4;
    }

    public final void flush() {
        synchronized (this.b) {
            try {
                this.Y = true;
                aa4 aa4 = this.z;
                if (aa4 != null) {
                    aa4.z();
                    int i = this.x;
                    this.x = i + 1;
                    this.v[i] = aa4;
                    this.z = null;
                }
                while (!this.c.isEmpty()) {
                    aa4 aa42 = (aa4) this.c.removeFirst();
                    aa42.z();
                    int i2 = this.x;
                    this.x = i2 + 1;
                    this.v[i2] = aa42;
                }
                while (!this.o.isEmpty()) {
                    ((dze) this.o.removeFirst()).z();
                }
            } finally {
            }
        }
    }

    public final void l(bze bze) {
        synchronized (this.b) {
            try {
                SubtitleDecoderException subtitleDecoderException = this.X;
                if (subtitleDecoderException == null) {
                    y64.g(bze == this.z);
                    this.c.addLast(bze);
                    if (!this.c.isEmpty() && this.y > 0) {
                        this.b.notify();
                    }
                    this.z = null;
                } else {
                    throw subtitleDecoderException;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void release() {
        synchronized (this.b) {
            this.Z = true;
            this.b.notify();
        }
        try {
            this.a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
