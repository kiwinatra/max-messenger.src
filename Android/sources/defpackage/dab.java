package defpackage;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.concurrent.CopyOnWriteArraySet;
import org.webrtc.EglBase;
import org.webrtc.HardwareVideoEncoderFactory;
import org.webrtc.SoftwareVideoEncoderFactory;
import org.webrtc.VideoCodecInfo;
import org.webrtc.VideoEncoderFactory;

/* renamed from: dab  reason: default package */
public final class dab implements VideoEncoderFactory, bj8 {
    public final HardwareVideoEncoderFactory a;
    public final SoftwareVideoEncoderFactory b = new SoftwareVideoEncoderFactory();
    public final fab c;
    public final voc o;
    public VideoCodecInfo v;
    public final CopyOnWriteArraySet w = new CopyOnWriteArraySet();

    public dab(EglBase.Context context, boolean z, voc voc) {
        this.a = new HardwareVideoEncoderFactory(context, false, false);
        this.c = z ? new fab(this, voc) : null;
        this.o = voc;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0082 A[LOOP:0: B:19:0x007c->B:21:0x0082, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final org.webrtc.VideoEncoder createEncoder(org.webrtc.VideoCodecInfo r7) {
        /*
            r6 = this;
            fab r0 = r6.c
            if (r0 == 0) goto L_0x002d
            java.lang.String r1 = r7.name
            java.lang.String r2 = "VP9"
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "isSoftwareCodecProhibited check for: "
            r2.<init>(r3)
            r2.append(r7)
            java.lang.String r3 = ", resulted as "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "PatchedVideoEncoderFactoryCodecSelector"
            voc r0 = r0.b
            r0.log(r3, r2)
            if (r1 == 0) goto L_0x002d
            r0 = 1
            goto L_0x002e
        L_0x002d:
            r0 = 0
        L_0x002e:
            org.webrtc.HardwareVideoEncoderFactory r1 = r6.a
            org.webrtc.VideoEncoder r1 = r1.createEncoder(r7)
            if (r1 == 0) goto L_0x003b
            if (r0 != 0) goto L_0x0039
            goto L_0x003b
        L_0x0039:
            r0 = 0
            goto L_0x0041
        L_0x003b:
            org.webrtc.SoftwareVideoEncoderFactory r0 = r6.b
            org.webrtc.VideoEncoder r0 = r0.createEncoder(r7)
        L_0x0041:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Encoder is about to create: "
            r2.<init>(r3)
            java.lang.String r3 = r7.name
            r2.append(r3)
            java.lang.String r3 = " hw="
            r2.append(r3)
            java.lang.String r3 = "true"
            java.lang.String r4 = "false"
            if (r1 != 0) goto L_0x005a
            r5 = r4
            goto L_0x005b
        L_0x005a:
            r5 = r3
        L_0x005b:
            r2.append(r5)
            java.lang.String r5 = " sw="
            r2.append(r5)
            if (r0 != 0) goto L_0x0066
            r3 = r4
        L_0x0066:
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            voc r3 = r6.o
            java.lang.String r4 = "PatchedVideoEncoderFactory"
            r3.log(r4, r2)
            r6.v = r7
            java.util.concurrent.CopyOnWriteArraySet r6 = r6.w
            java.util.Iterator r6 = r6.iterator()
        L_0x007c:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x009f
            java.lang.Object r7 = r6.next()
            wug r7 = (defpackage.wug) r7
            fbb r7 = (defpackage.fbb) r7
            r7.getClass()
            yab r2 = new yab
            r3 = 0
            r2.<init>(r7, r3)
            yug r3 = new yug
            r4 = 1
            r3.<init>(r7, r2, r4)
            java.lang.String r2 = "onNewCodecIsCreating"
            r7.i(r2, r3)
            goto L_0x007c
        L_0x009f:
            if (r1 == 0) goto L_0x00a9
            if (r0 == 0) goto L_0x00a9
            org.webrtc.VideoEncoderFallback r6 = new org.webrtc.VideoEncoderFallback
            r6.<init>(r0, r1)
            return r6
        L_0x00a9:
            if (r1 == 0) goto L_0x00ac
            goto L_0x00ad
        L_0x00ac:
            r1 = r0
        L_0x00ad:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dab.createEncoder(org.webrtc.VideoCodecInfo):org.webrtc.VideoEncoder");
    }

    public final VideoEncoderFactory.VideoEncoderSelector getEncoderSelector() {
        return this.c;
    }

    public final VideoCodecInfo[] getSupportedCodecs() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(Arrays.asList(this.a.getSupportedCodecs()));
        linkedHashSet.addAll(Arrays.asList(this.b.getSupportedCodecs()));
        return (VideoCodecInfo[]) linkedHashSet.toArray(new VideoCodecInfo[linkedHashSet.size()]);
    }

    public final void q(dj8 dj8) {
        fab fab = this.c;
        if (fab != null) {
            fab.q(dj8);
        }
    }
}
