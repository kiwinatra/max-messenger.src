package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.UShort;
import kotlin.jvm.internal.ByteCompanionObject;

/* renamed from: mlg  reason: default package */
public final class mlg implements Closeable {
    public final byte[] X = null;
    public final xu0 Y;
    public final llg Z;
    public boolean a;
    public int b;
    public long c;
    public boolean o;
    public boolean v;
    public final boolean v0;
    public boolean w;
    public final boolean w0;
    public final rt0 x = new Object();
    public final rt0 y = new Object();
    public ka9 z;

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, rt0] */
    /* JADX WARNING: type inference failed for: r1v2, types: [java.lang.Object, rt0] */
    public mlg(gtc gtc, ttc ttc, boolean z2, boolean z3) {
        this.Y = gtc;
        this.Z = ttc;
        this.v0 = z2;
        this.w0 = z3;
    }

    public final void close() {
        ka9 ka9 = this.z;
        if (ka9 != null) {
            ka9.close();
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [nlg, mlg, ltc] */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r3v3 */
    /* JADX WARNING: Code restructure failed: missing block: B:113:?, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m() {
        /*
            r9 = this;
            long r0 = r9.c
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x000f
            xu0 r4 = r9.Y
            rt0 r5 = r9.x
            r4.R(r5, r0)
        L_0x000f:
            int r0 = r9.b
            switch(r0) {
                case 8: goto L_0x0075;
                case 9: goto L_0x0045;
                case 10: goto L_0x0030;
                default: goto L_0x0014;
            }
        L_0x0014:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unknown control opcode: "
            r1.<init>(r2)
            int r9 = r9.b
            byte[] r2 = defpackage.u0g.a
            java.lang.String r9 = java.lang.Integer.toHexString(r9)
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            r0.<init>(r9)
            throw r0
        L_0x0030:
            llg r0 = r9.Z
            rt0 r9 = r9.x
            long r1 = r9.b
            r9.f(r1)
            ttc r0 = (defpackage.ttc) r0
            monitor-enter(r0)
            r9 = 0
            r0.q = r9     // Catch:{ all -> 0x0042 }
            monitor-exit(r0)
            goto L_0x0123
        L_0x0042:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0042 }
            throw r9
        L_0x0045:
            llg r0 = r9.Z
            rt0 r9 = r9.x
            long r1 = r9.b
            vw0 r9 = r9.f(r1)
            ttc r0 = (defpackage.ttc) r0
            monitor-enter(r0)
            boolean r1 = r0.o     // Catch:{ all -> 0x0063 }
            if (r1 != 0) goto L_0x0070
            boolean r1 = r0.l     // Catch:{ all -> 0x0063 }
            if (r1 == 0) goto L_0x0065
            java.util.ArrayDeque r1 = r0.j     // Catch:{ all -> 0x0063 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0063 }
            if (r1 == 0) goto L_0x0065
            goto L_0x0070
        L_0x0063:
            r9 = move-exception
            goto L_0x0073
        L_0x0065:
            java.util.ArrayDeque r1 = r0.i     // Catch:{ all -> 0x0063 }
            r1.add(r9)     // Catch:{ all -> 0x0063 }
            r0.f()     // Catch:{ all -> 0x0063 }
            monitor-exit(r0)
            goto L_0x0123
        L_0x0070:
            monitor-exit(r0)
            goto L_0x0123
        L_0x0073:
            monitor-exit(r0)     // Catch:{ all -> 0x0063 }
            throw r9
        L_0x0075:
            java.lang.String r0 = ""
            rt0 r1 = r9.x
            long r4 = r1.b
            r6 = 1
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x014e
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r3 = 0
            if (r2 == 0) goto L_0x00c4
            short r0 = r1.readShort()
            rt0 r1 = r9.x
            java.lang.String r1 = r1.q0()
            r2 = 1000(0x3e8, float:1.401E-42)
            if (r0 < r2) goto L_0x00b5
            r2 = 5000(0x1388, float:7.006E-42)
            if (r0 < r2) goto L_0x0099
            goto L_0x00b5
        L_0x0099:
            r2 = 1004(0x3ec, float:1.407E-42)
            if (r2 > r0) goto L_0x00a1
            r2 = 1006(0x3ee, float:1.41E-42)
            if (r2 >= r0) goto L_0x00aa
        L_0x00a1:
            r2 = 1015(0x3f7, float:1.422E-42)
            if (r2 <= r0) goto L_0x00a6
            goto L_0x00b3
        L_0x00a6:
            r2 = 2999(0xbb7, float:4.202E-42)
            if (r2 < r0) goto L_0x00b3
        L_0x00aa:
            java.lang.String r2 = "Code "
            java.lang.String r4 = " is reserved and may not be used."
            java.lang.String r2 = defpackage.a81.j(r0, r2, r4)
            goto L_0x00bb
        L_0x00b3:
            r2 = r3
            goto L_0x00bb
        L_0x00b5:
            java.lang.String r2 = "Code must be in range [1000,5000): "
            java.lang.String r2 = defpackage.wj6.h(r0, r2)
        L_0x00bb:
            if (r2 != 0) goto L_0x00be
            goto L_0x00c9
        L_0x00be:
            java.net.ProtocolException r9 = new java.net.ProtocolException
            r9.<init>(r2)
            throw r9
        L_0x00c4:
            r1 = 1005(0x3ed, float:1.408E-42)
            r8 = r1
            r1 = r0
            r0 = r8
        L_0x00c9:
            llg r2 = r9.Z
            ttc r2 = (defpackage.ttc) r2
            r2.getClass()
            r4 = -1
            if (r0 == r4) goto L_0x0142
            monitor-enter(r2)
            int r5 = r2.m     // Catch:{ all -> 0x00fb }
            if (r5 != r4) goto L_0x0134
            r2.m = r0     // Catch:{ all -> 0x00fb }
            r2.n = r1     // Catch:{ all -> 0x00fb }
            boolean r0 = r2.l     // Catch:{ all -> 0x00fb }
            if (r0 == 0) goto L_0x00fd
            java.util.ArrayDeque r0 = r2.j     // Catch:{ all -> 0x00fb }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x00fb }
            if (r0 == 0) goto L_0x00fd
            ltc r0 = r2.h     // Catch:{ all -> 0x00fb }
            r2.h = r3     // Catch:{ all -> 0x00fb }
            mlg r4 = r2.d     // Catch:{ all -> 0x00fb }
            r2.d = r3     // Catch:{ all -> 0x00fb }
            nlg r5 = r2.e     // Catch:{ all -> 0x00fb }
            r2.e = r3     // Catch:{ all -> 0x00fb }
            cef r3 = r2.f     // Catch:{ all -> 0x00fb }
            r3.e()     // Catch:{ all -> 0x00fb }
            r3 = r0
            goto L_0x00ff
        L_0x00fb:
            r9 = move-exception
            goto L_0x0140
        L_0x00fd:
            r4 = r3
            r5 = r4
        L_0x00ff:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x00fb }
            monitor-exit(r2)
            xga r0 = r2.s     // Catch:{ all -> 0x010f }
            r0.getClass()     // Catch:{ all -> 0x010f }
            if (r3 == 0) goto L_0x0111
            xga r0 = r2.s     // Catch:{ all -> 0x010f }
            r0.i(r1)     // Catch:{ all -> 0x010f }
            goto L_0x0111
        L_0x010f:
            r9 = move-exception
            goto L_0x0124
        L_0x0111:
            if (r3 == 0) goto L_0x0116
            defpackage.u0g.c(r3)
        L_0x0116:
            if (r4 == 0) goto L_0x011b
            defpackage.u0g.c(r4)
        L_0x011b:
            if (r5 == 0) goto L_0x0120
            defpackage.u0g.c(r5)
        L_0x0120:
            r0 = 1
            r9.a = r0
        L_0x0123:
            return
        L_0x0124:
            if (r3 == 0) goto L_0x0129
            defpackage.u0g.c(r3)
        L_0x0129:
            if (r4 == 0) goto L_0x012e
            defpackage.u0g.c(r4)
        L_0x012e:
            if (r5 == 0) goto L_0x0133
            defpackage.u0g.c(r5)
        L_0x0133:
            throw r9
        L_0x0134:
            java.lang.String r9 = "already closed"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00fb }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x00fb }
            r0.<init>(r9)     // Catch:{ all -> 0x00fb }
            throw r0     // Catch:{ all -> 0x00fb }
        L_0x0140:
            monitor-exit(r2)
            throw r9
        L_0x0142:
            java.lang.String r9 = "Failed requirement."
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r0.<init>(r9)
            throw r0
        L_0x014e:
            java.net.ProtocolException r9 = new java.net.ProtocolException
            java.lang.String r0 = "Malformed close payload length of 1."
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mlg.m():void");
    }

    /* JADX INFO: finally extract failed */
    public final void n() {
        boolean z2;
        if (!this.a) {
            xu0 xu0 = this.Y;
            long h = xu0.q().h();
            xu0.q().b();
            try {
                byte readByte = xu0.readByte();
                byte[] bArr = u0g.a;
                xu0.q().g(h, TimeUnit.NANOSECONDS);
                byte b2 = readByte & 15;
                this.b = b2;
                boolean z3 = false;
                boolean z4 = (readByte & ByteCompanionObject.MIN_VALUE) != 0;
                this.o = z4;
                boolean z5 = (readByte & 8) != 0;
                this.v = z5;
                if (!z5 || z4) {
                    boolean z6 = (readByte & 64) != 0;
                    if (b2 == 1 || b2 == 2) {
                        if (!z6) {
                            z2 = false;
                        } else if (this.v0) {
                            z2 = true;
                        } else {
                            throw new ProtocolException("Unexpected rsv1 flag");
                        }
                        this.w = z2;
                    } else if (z6) {
                        throw new ProtocolException("Unexpected rsv1 flag");
                    }
                    if ((readByte & 32) != 0) {
                        throw new ProtocolException("Unexpected rsv2 flag");
                    } else if ((readByte & 16) == 0) {
                        byte readByte2 = xu0.readByte();
                        if ((readByte2 & ByteCompanionObject.MIN_VALUE) != 0) {
                            z3 = true;
                        }
                        if (!z3) {
                            long j = (long) (readByte2 & ByteCompanionObject.MAX_VALUE);
                            this.c = j;
                            if (j == ((long) 126)) {
                                this.c = (long) (xu0.readShort() & UShort.MAX_VALUE);
                            } else if (j == ((long) 127)) {
                                long readLong = xu0.readLong();
                                this.c = readLong;
                                if (readLong < 0) {
                                    throw new ProtocolException("Frame length 0x" + Long.toHexString(this.c) + " > 0x7FFFFFFFFFFFFFFF");
                                }
                            }
                            if (this.v && this.c > 125) {
                                throw new ProtocolException("Control frame must be less than 125B.");
                            } else if (z3) {
                                xu0.readFully(this.X);
                            }
                        } else {
                            throw new ProtocolException("Server-sent frames must not be masked.");
                        }
                    } else {
                        throw new ProtocolException("Unexpected rsv3 flag");
                    }
                } else {
                    throw new ProtocolException("Control frames must be final.");
                }
            } catch (Throwable th) {
                xu0.q().g(h, TimeUnit.NANOSECONDS);
                throw th;
            }
        } else {
            throw new IOException("closed");
        }
    }
}
