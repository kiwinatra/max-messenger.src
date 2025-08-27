package androidx.media3.exoplayer.mediacodec;

import androidx.media3.decoder.DecoderException;

public class MediaCodecDecoderException extends DecoderException {
    public final int a;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MediaCodecDecoderException(java.lang.IllegalStateException r3, defpackage.on8 r4) {
        /*
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Decoder failed: "
            r0.<init>(r1)
            r1 = 0
            if (r4 != 0) goto L_0x000c
            r4 = r1
            goto L_0x000e
        L_0x000c:
            java.lang.String r4 = r4.a
        L_0x000e:
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r2.<init>(r4, r3)
            int r4 = defpackage.v0g.a
            r0 = 21
            if (r4 < r0) goto L_0x0029
            boolean r0 = r3 instanceof android.media.MediaCodec.CodecException
            if (r0 == 0) goto L_0x0029
            r0 = r3
            android.media.MediaCodec$CodecException r0 = (android.media.MediaCodec.CodecException) r0
            java.lang.String r1 = r0.getDiagnosticInfo()
        L_0x0029:
            r0 = 23
            if (r4 < r0) goto L_0x003a
            boolean r4 = r3 instanceof android.media.MediaCodec.CodecException
            if (r4 == 0) goto L_0x0038
            android.media.MediaCodec$CodecException r3 = (android.media.MediaCodec.CodecException) r3
            int r3 = r3.getErrorCode()
            goto L_0x003e
        L_0x0038:
            r3 = 0
            goto L_0x003e
        L_0x003a:
            int r3 = defpackage.v0g.y(r1)
        L_0x003e:
            r2.a = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException.<init>(java.lang.IllegalStateException, on8):void");
    }
}
