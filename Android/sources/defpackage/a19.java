package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import one.me.sdk.media.transformer.MediaTransformException;

/* renamed from: a19  reason: default package */
public final class a19 {
    public final s09 a;
    public final long b;
    public final z09 c;
    public volatile int d = -1;
    public volatile int e = -1;
    public final AtomicReference f = new AtomicReference();
    public final AtomicReference g = new AtomicReference();

    public a19(s09 s09) {
        this.a = s09;
        long currentTimeMillis = System.currentTimeMillis();
        this.b = currentTimeMillis;
        z09 z09 = new z09();
        z09.a = currentTimeMillis;
        this.c = z09;
    }

    public final void a(MediaTransformException mediaTransformException) {
        this.g.set(mediaTransformException);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0060  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String toString() {
        /*
            r17 = this;
            r0 = r17
            z09 r1 = r0.c
            java.util.concurrent.atomic.AtomicReference r1 = r1.b
            java.lang.Object r1 = r1.get()
            hq8 r1 = (defpackage.hq8) r1
            long r2 = r0.b
            z09 r4 = r0.c
            long r4 = r4.a
            long r4 = r4 - r2
            float r2 = (float) r4
            r3 = 1148846080(0x447a0000, float:1000.0)
            float r2 = r2 / r3
            java.lang.String r3 = "?"
            if (r1 == 0) goto L_0x0027
            boolean r4 = r1.b
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            java.lang.String r4 = r4.toString()
            if (r4 != 0) goto L_0x0028
        L_0x0027:
            r4 = r3
        L_0x0028:
            r5 = 1232348160(0x49742400, float:1000000.0)
            if (r1 == 0) goto L_0x0046
            long r6 = r1.a
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 == 0) goto L_0x003a
            r6 = r1
            goto L_0x003b
        L_0x003a:
            r6 = 0
        L_0x003b:
            if (r6 == 0) goto L_0x0046
            long r6 = r6.a
            float r6 = (float) r6
            float r6 = r6 / r5
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            goto L_0x0047
        L_0x0046:
            r6 = r3
        L_0x0047:
            if (r1 == 0) goto L_0x0053
            ea6[] r7 = r1.c
            if (r7 == 0) goto L_0x0053
            int r7 = r7.length
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto L_0x0054
        L_0x0053:
            r7 = r3
        L_0x0054:
            if (r1 == 0) goto L_0x0060
            ea6[] r8 = r1.d
            if (r8 == 0) goto L_0x0060
            int r8 = r8.length
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            goto L_0x0061
        L_0x0060:
            r8 = r3
        L_0x0061:
            if (r1 == 0) goto L_0x006c
            ea6[] r1 = r1.e
            if (r1 == 0) goto L_0x006c
            int r1 = r1.length
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
        L_0x006c:
            s09 r0 = r0.a
            android.net.Uri r1 = r0.b
            java.lang.String r9 = r0.c
            boolean r10 = r0.j
            boolean r11 = r0.k
            boolean r12 = r0.i
            int r13 = r0.d
            int r14 = r0.e
            int r15 = r0.f
            float r15 = (float) r15
            float r15 = r15 / r5
            float r5 = r0.g
            float r0 = r0.h
            r17 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r16 = r5
            java.lang.String r5 = "\n            MediaTransformRequest(\n              in={\n                  uri="
            r0.<init>(r5)
            r0.append(r1)
            java.lang.String r1 = "\n                  MediaInfo(\n                      took="
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = " s\n                      duration="
            r0.append(r1)
            r0.append(r6)
            java.lang.String r1 = " s\n                      hdr="
            r0.append(r1)
            r0.append(r4)
            java.lang.String r1 = "\n                      video_tracks="
            r0.append(r1)
            r0.append(r7)
            java.lang.String r1 = "\n                      audio_tracks="
            r0.append(r1)
            r0.append(r8)
            java.lang.String r1 = "\n                      other_tracks="
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = "\n                  )\n              }\n              out="
            r0.append(r1)
            r0.append(r9)
            java.lang.String r1 = "\n              anc={\n                  hdr_allowed="
            r0.append(r1)
            r0.append(r10)
            java.lang.String r1 = "\n                  hevc_allowed="
            r0.append(r1)
            r0.append(r11)
            java.lang.String r1 = "\n                  ping_delay=500 ms\n                  stuck_delay=300000 ms\n              }\n              request={\n                  mute="
            r0.append(r1)
            r0.append(r12)
            java.lang.String r1 = "\n                  video_size="
            r0.append(r1)
            r0.append(r13)
            java.lang.String r1 = "x"
            r0.append(r1)
            r0.append(r14)
            java.lang.String r1 = "\n                  video_bitrate="
            r0.append(r1)
            r0.append(r15)
            java.lang.String r1 = " Mbps\n                  position_range=["
            r0.append(r1)
            r1 = r16
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            r1 = r17
            r0.append(r1)
            java.lang.String r1 = "]\n              }\n            )\n            "
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = kotlin.text.StringsKt.trimIndent(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a19.toString():java.lang.String");
    }
}
