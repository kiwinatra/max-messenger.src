package defpackage;

import java.nio.ByteBuffer;
import org.webrtc.EncodedImage;

/* renamed from: psg  reason: default package */
public final class psg extends Thread {
    public final Object a = new Object();
    public final Object b = new Object();
    public u64 c;
    public volatile boolean o;
    public ByteBuffer v;
    public EncodedImage w;
    public final /* synthetic */ pe6 x;

    public psg(pe6 pe6, u64 u64) {
        this.x = pe6;
        this.c = u64;
        setName("SSFrameSender");
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    public final void run() {
        /*
            r18 = this;
            r0 = r18
        L_0x0002:
            boolean r1 = r0.o
            r2 = 0
            if (r1 == 0) goto L_0x000b
            org.webrtc.EncodedImage r1 = r0.w
            if (r1 == 0) goto L_0x011e
        L_0x000b:
            java.lang.Object r1 = r0.b
            monitor-enter(r1)
            u64 r3 = r0.c     // Catch:{ all -> 0x016f }
            if (r3 == 0) goto L_0x0019
            org.webrtc.DataChannel r3 = r3.a     // Catch:{ all -> 0x016f }
            long r3 = r3.bufferedAmount()     // Catch:{ all -> 0x016f }
            goto L_0x001b
        L_0x0019:
            r3 = 0
        L_0x001b:
            monitor-exit(r1)     // Catch:{ all -> 0x016f }
        L_0x001c:
            boolean r1 = r0.o
            r5 = 8000000(0x7a1200, double:3.952525E-317)
            r7 = 1
            if (r1 == 0) goto L_0x0028
            org.webrtc.EncodedImage r1 = r0.w
            if (r1 == 0) goto L_0x003c
        L_0x0028:
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 >= 0) goto L_0x00fb
            org.webrtc.EncodedImage r1 = r0.w
            if (r1 != 0) goto L_0x003c
            pe6 r1 = r0.x
            java.util.concurrent.ConcurrentLinkedQueue r1 = r1.c
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x003c
            goto L_0x00fb
        L_0x003c:
            boolean r1 = r0.o
            if (r1 == 0) goto L_0x0044
            org.webrtc.EncodedImage r1 = r0.w
            if (r1 == 0) goto L_0x011e
        L_0x0044:
            org.webrtc.EncodedImage r1 = r0.w
            r8 = 0
            if (r1 != 0) goto L_0x005e
            pe6 r1 = r0.x
            java.util.concurrent.ConcurrentLinkedQueue r1 = r1.c
            java.lang.Object r1 = r1.poll()
            org.webrtc.EncodedImage r1 = (org.webrtc.EncodedImage) r1
            r0.w = r1
            if (r1 != 0) goto L_0x0058
            goto L_0x0002
        L_0x0058:
            java.nio.ByteBuffer r1 = r1.buffer
            r0.v = r1
            r13 = r7
            goto L_0x005f
        L_0x005e:
            r13 = r8
        L_0x005f:
            long r5 = r5 - r3
            r9 = 4000(0xfa0, double:1.9763E-320)
            int r1 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r1 >= 0) goto L_0x0067
            goto L_0x0002
        L_0x0067:
            r5 = 7999989(0x7a11f5, double:3.9525197E-317)
            long r5 = r5 - r3
            r3 = 8000(0x1f40, double:3.9525E-320)
            long r3 = java.lang.Math.min(r5, r3)
            java.nio.ByteBuffer r1 = r0.v
            int r1 = r1.remaining()
            long r5 = (long) r1
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L_0x0085
            java.nio.ByteBuffer r1 = r0.v
            int r1 = r1.remaining()
            long r3 = (long) r1
            r1 = r7
            goto L_0x0086
        L_0x0085:
            r1 = r8
        L_0x0086:
            java.nio.ByteBuffer r5 = r0.v
            java.nio.ByteBuffer r5 = r5.slice()
            int r6 = (int) r3
            r5.limit(r6)
            java.nio.ByteBuffer r6 = r0.v
            int r9 = r6.position()
            long r9 = (long) r9
            long r9 = r9 + r3
            int r9 = (int) r9
            r6.position(r9)
            v64 r6 = new v64
            pe6 r9 = r0.x
            java.util.concurrent.atomic.AtomicInteger r9 = r9.e
            int r10 = r9.incrementAndGet()
            long r11 = java.lang.System.currentTimeMillis()
            org.webrtc.EncodedImage r9 = r0.w
            org.webrtc.EncodedImage$FrameType r9 = r9.frameType
            org.webrtc.EncodedImage$FrameType r14 = org.webrtc.EncodedImage.FrameType.VideoFrameKey
            if (r9 != r14) goto L_0x00b4
            r15 = r7
            goto L_0x00b5
        L_0x00b4:
            r15 = r8
        L_0x00b5:
            r16 = 0
            r9 = r6
            r14 = r1
            r17 = r5
            r9.<init>(r10, r11, r13, r14, r15, r16, r17)
            java.lang.Object r9 = r0.b
            monitor-enter(r9)
            u64 r10 = r0.c     // Catch:{ all -> 0x00d1 }
            if (r10 == 0) goto L_0x00d3
            java.nio.ByteBuffer r6 = r6.a()     // Catch:{ all -> 0x00d1 }
            java.nio.ByteBuffer[] r5 = new java.nio.ByteBuffer[]{r6, r5}     // Catch:{ all -> 0x00d1 }
            r10.d(r5)     // Catch:{ all -> 0x00d1 }
            goto L_0x00d4
        L_0x00d1:
            r0 = move-exception
            goto L_0x00f9
        L_0x00d3:
            r8 = r7
        L_0x00d4:
            monitor-exit(r9)     // Catch:{ all -> 0x00d1 }
            pe6 r5 = r0.x
            java.util.concurrent.atomic.AtomicInteger r5 = r5.d
            long r3 = -r3
            int r3 = (int) r3
            r5.addAndGet(r3)
            if (r8 == 0) goto L_0x00e3
            r0.o = r7
            goto L_0x011e
        L_0x00e3:
            if (r1 == 0) goto L_0x0002
            pe6 r1 = r0.x
            zjf r1 = r1.f
            r1.a()
            org.webrtc.EncodedImage r1 = r0.w
            if (r1 == 0) goto L_0x00f3
            r1.release()
        L_0x00f3:
            r0.w = r2
            r0.v = r2
            goto L_0x0002
        L_0x00f9:
            monitor-exit(r9)     // Catch:{ all -> 0x00d1 }
            throw r0
        L_0x00fb:
            java.lang.Object r3 = r0.a
            monitor-enter(r3)
            java.lang.Object r1 = r0.a     // Catch:{ InterruptedException -> 0x0108 }
            r4 = 50
            r1.wait(r4)     // Catch:{ InterruptedException -> 0x0108 }
            goto L_0x0108
        L_0x0106:
            r0 = move-exception
            goto L_0x016d
        L_0x0108:
            monitor-exit(r3)     // Catch:{ all -> 0x0106 }
            java.lang.Object r1 = r0.b
            monitor-enter(r1)
            u64 r3 = r0.c     // Catch:{ all -> 0x0119 }
            if (r3 == 0) goto L_0x011b
            org.webrtc.DataChannel r3 = r3.a     // Catch:{ all -> 0x0119 }
            long r3 = r3.bufferedAmount()     // Catch:{ all -> 0x0119 }
            monitor-exit(r1)     // Catch:{ all -> 0x0119 }
            goto L_0x001c
        L_0x0119:
            r0 = move-exception
            goto L_0x016b
        L_0x011b:
            r0.o = r7     // Catch:{ all -> 0x0119 }
            monitor-exit(r1)     // Catch:{ all -> 0x0119 }
        L_0x011e:
            java.lang.Object r3 = r0.b
            monitor-enter(r3)
            u64 r1 = r0.c     // Catch:{ all -> 0x014a }
            if (r1 == 0) goto L_0x014c
            v64 r1 = new v64     // Catch:{ all -> 0x014a }
            pe6 r4 = r0.x     // Catch:{ all -> 0x014a }
            java.util.concurrent.atomic.AtomicInteger r4 = r4.e     // Catch:{ all -> 0x014a }
            int r5 = r4.incrementAndGet()     // Catch:{ all -> 0x014a }
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x014a }
            r9 = 1
            r10 = 0
            r11 = 1
            r12 = 0
            r8 = 1
            r4 = r1
            r4.<init>(r5, r6, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x014a }
            u64 r4 = r0.c     // Catch:{ all -> 0x014a }
            java.nio.ByteBuffer r1 = r1.a()     // Catch:{ all -> 0x014a }
            java.nio.ByteBuffer[] r1 = new java.nio.ByteBuffer[]{r1}     // Catch:{ all -> 0x014a }
            r4.d(r1)     // Catch:{ all -> 0x014a }
            goto L_0x014c
        L_0x014a:
            r0 = move-exception
            goto L_0x0169
        L_0x014c:
            monitor-exit(r3)     // Catch:{ all -> 0x014a }
            java.nio.ByteBuffer r1 = r0.v
            if (r1 == 0) goto L_0x015d
            pe6 r3 = r0.x
            java.util.concurrent.atomic.AtomicInteger r3 = r3.d
            int r1 = r1.remaining()
            int r1 = -r1
            r3.addAndGet(r1)
        L_0x015d:
            org.webrtc.EncodedImage r1 = r0.w
            if (r1 == 0) goto L_0x0164
            r1.release()
        L_0x0164:
            r0.w = r2
            r0.v = r2
            return
        L_0x0169:
            monitor-exit(r3)     // Catch:{ all -> 0x014a }
            throw r0
        L_0x016b:
            monitor-exit(r1)     // Catch:{ all -> 0x0119 }
            throw r0
        L_0x016d:
            monitor-exit(r3)     // Catch:{ all -> 0x0106 }
            throw r0
        L_0x016f:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x016f }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.psg.run():void");
    }
}
