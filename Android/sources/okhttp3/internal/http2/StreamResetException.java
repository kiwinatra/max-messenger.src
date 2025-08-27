package okhttp3.internal.http2;

import java.io.IOException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/http2/StreamResetException;", "Ljava/io/IOException;", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class StreamResetException extends IOException {
    public final int a;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public StreamResetException(int r3) {
        /*
            r2 = this;
            switch(r3) {
                case 1: goto L_0x002d;
                case 2: goto L_0x002a;
                case 3: goto L_0x0027;
                case 4: goto L_0x0024;
                case 5: goto L_0x0021;
                case 6: goto L_0x001e;
                case 7: goto L_0x001b;
                case 8: goto L_0x0018;
                case 9: goto L_0x0015;
                case 10: goto L_0x0012;
                case 11: goto L_0x000f;
                case 12: goto L_0x000c;
                case 13: goto L_0x0009;
                case 14: goto L_0x0006;
                default: goto L_0x0003;
            }
        L_0x0003:
            java.lang.String r0 = "null"
            goto L_0x002f
        L_0x0006:
            java.lang.String r0 = "HTTP_1_1_REQUIRED"
            goto L_0x002f
        L_0x0009:
            java.lang.String r0 = "INADEQUATE_SECURITY"
            goto L_0x002f
        L_0x000c:
            java.lang.String r0 = "ENHANCE_YOUR_CALM"
            goto L_0x002f
        L_0x000f:
            java.lang.String r0 = "CONNECT_ERROR"
            goto L_0x002f
        L_0x0012:
            java.lang.String r0 = "COMPRESSION_ERROR"
            goto L_0x002f
        L_0x0015:
            java.lang.String r0 = "CANCEL"
            goto L_0x002f
        L_0x0018:
            java.lang.String r0 = "REFUSED_STREAM"
            goto L_0x002f
        L_0x001b:
            java.lang.String r0 = "FRAME_SIZE_ERROR"
            goto L_0x002f
        L_0x001e:
            java.lang.String r0 = "STREAM_CLOSED"
            goto L_0x002f
        L_0x0021:
            java.lang.String r0 = "SETTINGS_TIMEOUT"
            goto L_0x002f
        L_0x0024:
            java.lang.String r0 = "FLOW_CONTROL_ERROR"
            goto L_0x002f
        L_0x0027:
            java.lang.String r0 = "INTERNAL_ERROR"
            goto L_0x002f
        L_0x002a:
            java.lang.String r0 = "PROTOCOL_ERROR"
            goto L_0x002f
        L_0x002d:
            java.lang.String r0 = "NO_ERROR"
        L_0x002f:
            java.lang.String r1 = "stream was reset: "
            java.lang.String r0 = r1.concat(r0)
            r2.<init>(r0)
            r2.a = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.StreamResetException.<init>(int):void");
    }
}
