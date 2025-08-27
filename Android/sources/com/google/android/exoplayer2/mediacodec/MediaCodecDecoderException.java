package com.google.android.exoplayer2.mediacodec;

import com.google.android.exoplayer2.decoder.DecoderException;

public class MediaCodecDecoderException extends DecoderException {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MediaCodecDecoderException(java.lang.IllegalStateException r3, defpackage.nn8 r4) {
        /*
            r2 = this;
            if (r4 != 0) goto L_0x0004
            r4 = 0
            goto L_0x0006
        L_0x0004:
            java.lang.String r4 = r4.a
        L_0x0006:
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r0 = r4.length()
            java.lang.String r1 = "Decoder failed: "
            if (r0 == 0) goto L_0x0017
            java.lang.String r4 = r1.concat(r4)
            goto L_0x001c
        L_0x0017:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r1)
        L_0x001c:
            r2.<init>(r4, r3)
            int r2 = defpackage.t0g.a
            r4 = 21
            if (r2 < r4) goto L_0x002e
            boolean r2 = r3 instanceof android.media.MediaCodec.CodecException
            if (r2 == 0) goto L_0x002e
            android.media.MediaCodec$CodecException r3 = (android.media.MediaCodec.CodecException) r3
            r3.getDiagnosticInfo()
        L_0x002e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecDecoderException.<init>(java.lang.IllegalStateException, nn8):void");
    }
}
