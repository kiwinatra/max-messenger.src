package defpackage;

import one.me.sdk.media.transformer.MediaTransformException;

/* renamed from: w09  reason: default package */
public final class w09 extends y09 {
    public final MediaTransformException e;

    public w09(long j, long j2, s09 s09, Object obj, MediaTransformException mediaTransformException) {
        super(j, j2, s09, obj);
        this.e = mediaTransformException;
    }

    /* JADX WARNING: type inference failed for: r7v6, types: [java.lang.Float] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String toString() {
        /*
            r23 = this;
            r0 = r23
            java.lang.Object r1 = r0.d
            z09 r1 = (defpackage.z09) r1
            java.util.concurrent.atomic.AtomicReference r2 = r1.b
            java.lang.Object r2 = r2.get()
            hq8 r2 = (defpackage.hq8) r2
            long r3 = r0.a
            long r5 = r1.a
            long r5 = r5 - r3
            float r1 = (float) r5
            r3 = 1148846080(0x447a0000, float:1000.0)
            float r1 = r1 / r3
            java.lang.String r4 = "?"
            if (r2 == 0) goto L_0x0027
            boolean r5 = r2.b
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            java.lang.String r5 = r5.toString()
            if (r5 != 0) goto L_0x0028
        L_0x0027:
            r5 = r4
        L_0x0028:
            r6 = 1232348160(0x49742400, float:1000000.0)
            r7 = 0
            if (r2 == 0) goto L_0x0046
            long r8 = r2.a
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L_0x003b
            r8 = r2
            goto L_0x003c
        L_0x003b:
            r8 = r7
        L_0x003c:
            if (r8 == 0) goto L_0x0046
            long r7 = r8.a
            float r7 = (float) r7
            float r7 = r7 / r6
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
        L_0x0046:
            if (r2 == 0) goto L_0x0052
            ea6[] r8 = r2.c
            if (r8 == 0) goto L_0x0052
            int r8 = r8.length
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            goto L_0x0053
        L_0x0052:
            r8 = r4
        L_0x0053:
            if (r2 == 0) goto L_0x005f
            ea6[] r9 = r2.d
            if (r9 == 0) goto L_0x005f
            int r9 = r9.length
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            goto L_0x0060
        L_0x005f:
            r9 = r4
        L_0x0060:
            if (r2 == 0) goto L_0x006c
            ea6[] r2 = r2.e
            if (r2 == 0) goto L_0x006c
            int r2 = r2.length
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x006d
        L_0x006c:
            r2 = r4
        L_0x006d:
            s09 r10 = r0.c
            android.net.Uri r11 = r10.b
            if (r7 != 0) goto L_0x0074
            goto L_0x0075
        L_0x0074:
            r4 = r7
        L_0x0075:
            java.lang.String r7 = r10.c
            boolean r12 = r10.j
            boolean r13 = r10.k
            boolean r14 = r10.i
            int r15 = r10.d
            int r3 = r10.e
            int r6 = r10.f
            float r6 = (float) r6
            r16 = 1232348160(0x49742400, float:1000000.0)
            float r6 = r6 / r16
            r16 = r6
            float r6 = r10.g
            float r10 = r10.h
            r17 = r14
            r18 = r15
            long r14 = r0.a
            r19 = r12
            r20 = r13
            long r12 = r0.b
            r21 = r10
            java.lang.String r10 = "yyyy-MM-dd kk:mm:ss"
            java.lang.CharSequence r14 = android.text.format.DateFormat.format(r10, r14)
            java.lang.CharSequence r10 = android.text.format.DateFormat.format(r10, r12)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "["
            r12.<init>(r13)
            r12.append(r14)
            java.lang.String r13 = ", "
            r12.append(r13)
            r12.append(r10)
            java.lang.String r10 = "]"
            r12.append(r10)
            java.lang.String r10 = r12.toString()
            long r14 = r0.a
            r22 = r13
            long r12 = r0.b
            long r12 = r12 - r14
            float r12 = (float) r12
            r13 = 1148846080(0x447a0000, float:1000.0)
            float r12 = r12 / r13
            one.me.sdk.media.transformer.MediaTransformException r0 = r0.e
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "\n            MediaTransformResult.Failure(\n              in={\n                  uri="
            r13.<init>(r14)
            r13.append(r11)
            java.lang.String r11 = "\n                  MediaInfo(\n                      took="
            r13.append(r11)
            r13.append(r1)
            java.lang.String r1 = " s\n                      duration="
            r13.append(r1)
            r13.append(r4)
            java.lang.String r1 = " s\n                      hdr="
            r13.append(r1)
            r13.append(r5)
            java.lang.String r1 = "\n                      video_tracks="
            r13.append(r1)
            r13.append(r8)
            java.lang.String r1 = "\n                      audio_tracks="
            r13.append(r1)
            r13.append(r9)
            java.lang.String r1 = "\n                      other_tracks="
            r13.append(r1)
            r13.append(r2)
            java.lang.String r1 = "\n                  )\n              }\n              out="
            r13.append(r1)
            r13.append(r7)
            java.lang.String r1 = "\n              request={\n                  settings={\n                      hdr_allowed="
            r13.append(r1)
            r1 = r19
            r13.append(r1)
            java.lang.String r1 = "\n                      hevc_allowed="
            r13.append(r1)
            r1 = r20
            r13.append(r1)
            java.lang.String r1 = "\n                      ping_delay=500 ms\n                      stuck_delay=300000 ms\n                  }\n                  mute="
            r13.append(r1)
            r1 = r17
            r13.append(r1)
            java.lang.String r1 = "\n                  video_size="
            r13.append(r1)
            r1 = r18
            r13.append(r1)
            java.lang.String r1 = "x"
            r13.append(r1)
            r13.append(r3)
            java.lang.String r1 = "\n                  video_bitrate="
            r13.append(r1)
            r1 = r16
            r13.append(r1)
            java.lang.String r1 = " Mbps\n                  position_range=["
            r13.append(r1)
            r13.append(r6)
            r1 = r22
            r13.append(r1)
            r2 = r21
            r13.append(r2)
            java.lang.String r2 = "]\n              }\n              took="
            r13.append(r2)
            r13.append(r10)
            r13.append(r1)
            r13.append(r12)
            java.lang.String r1 = " s\n              error="
            r13.append(r1)
            r13.append(r0)
            java.lang.String r0 = "\n            )\n        "
            r13.append(r0)
            java.lang.String r0 = r13.toString()
            java.lang.String r0 = kotlin.text.StringsKt.trimIndent(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w09.toString():java.lang.String");
    }
}
