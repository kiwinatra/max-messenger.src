package com.google.android.exoplayer2.source;

import java.io.IOException;

public final class ClippingMediaSource$IllegalClippingException extends IOException {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ClippingMediaSource$IllegalClippingException(int r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L_0x0011
            r0 = 1
            if (r3 == r0) goto L_0x000e
            r0 = 2
            if (r3 == r0) goto L_0x000b
            java.lang.String r3 = "unknown"
            goto L_0x0013
        L_0x000b:
            java.lang.String r3 = "start exceeds end"
            goto L_0x0013
        L_0x000e:
            java.lang.String r3 = "not seekable to start"
            goto L_0x0013
        L_0x0011:
            java.lang.String r3 = "invalid period count"
        L_0x0013:
            int r0 = r3.length()
            java.lang.String r1 = "Illegal clipping: "
            if (r0 == 0) goto L_0x0020
            java.lang.String r3 = r1.concat(r3)
            goto L_0x0025
        L_0x0020:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r1)
        L_0x0025:
            r2.<init>(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.ClippingMediaSource$IllegalClippingException.<init>(int):void");
    }
}
