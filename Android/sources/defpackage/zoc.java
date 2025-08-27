package defpackage;

import java.math.BigInteger;
import kotlin.reflect.KProperty;
import org.webrtc.RTCStats;

/* renamed from: zoc  reason: default package */
public abstract class zoc {
    public static final /* synthetic */ KProperty[] a;
    public static final a62 b = new a62("mimeType", 7);
    public static final a62 c = new a62("decoderImplementation", 7);
    public static final a62 d = new a62("encoderImplementation", 7);
    public static final a62 e = new a62("sdpFmtpLine", 7);
    public static final a62 f = new a62();

    static {
        Class<zoc> cls = zoc.class;
        a = new KProperty[]{wj6.p(cls, "mimeType", "getMimeType(Lorg/webrtc/RTCStats;)Ljava/lang/String;", 1), wj6.p(cls, "decoderImplementation", "getDecoderImplementation(Lorg/webrtc/RTCStats;)Ljava/lang/String;", 1), wj6.p(cls, "encoderImplementation", "getEncoderImplementation(Lorg/webrtc/RTCStats;)Ljava/lang/String;", 1), wj6.p(cls, "sdpFmtpLine", "getSdpFmtpLine(Lorg/webrtc/RTCStats;)Ljava/lang/String;", 1), wj6.p(cls, "payloadType", "getPayloadType(Lorg/webrtc/RTCStats;)Ljava/lang/Long;", 1), wj6.p(cls, "channels", "getChannels(Lorg/webrtc/RTCStats;)Ljava/lang/Long;", 1)};
    }

    public static final BigInteger a(Object obj) {
        Number number = obj instanceof Number ? (Number) obj : null;
        if (number == null) {
            return null;
        }
        return number instanceof BigInteger ? (BigInteger) number : number instanceof Long ? BigInteger.valueOf(number.longValue()) : number instanceof Integer ? BigInteger.valueOf((long) number.intValue()) : BigInteger.valueOf(number.longValue());
    }

    public static final Double b(Object obj) {
        Number number = obj instanceof Number ? (Number) obj : null;
        if (number != null) {
            return Double.valueOf(number.doubleValue());
        }
        return null;
    }

    public static final Long c(Object obj) {
        Number number = obj instanceof Number ? (Number) obj : null;
        if (number != null) {
            return Long.valueOf(number.longValue());
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0051 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String d(org.webrtc.RTCStats r3) {
        /*
            java.util.Map r0 = r3.getMembers()
            java.lang.String r1 = "address"
            java.lang.Object r0 = r0.get(r1)
            r1 = 0
            if (r0 == 0) goto L_0x0012
            java.lang.String r0 = r0.toString()
            goto L_0x0013
        L_0x0012:
            r0 = r1
        L_0x0013:
            if (r0 != 0) goto L_0x0016
            return r1
        L_0x0016:
            java.util.Map r3 = r3.getMembers()
            java.lang.String r2 = "port"
            java.lang.Object r3 = r3.get(r2)
            if (r3 == 0) goto L_0x0035
            boolean r2 = r3 instanceof java.lang.Number
            if (r2 == 0) goto L_0x0029
            java.lang.Number r3 = (java.lang.Number) r3
            goto L_0x002a
        L_0x0029:
            r3 = r1
        L_0x002a:
            if (r3 == 0) goto L_0x0035
            int r3 = r3.intValue()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x0036
        L_0x0035:
            r3 = r1
        L_0x0036:
            if (r3 == 0) goto L_0x0051
            int r3 = r3.intValue()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = ":"
            r1.append(r0)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            return r3
        L_0x0051:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zoc.d(org.webrtc.RTCStats):java.lang.String");
    }

    public static final String e(RTCStats rTCStats) {
        Object obj = rTCStats.getMembers().get("kind");
        if (obj != null) {
            return obj.toString();
        }
        return null;
    }

    public static final BigInteger f(RTCStats rTCStats) {
        Object obj = rTCStats.getMembers().get("packetsLost");
        if (obj != null) {
            return a(obj);
        }
        return null;
    }

    public static final Long g(RTCStats rTCStats) {
        Object obj = rTCStats.getMembers().get("ssrc");
        if (obj != null) {
            return c(obj);
        }
        return null;
    }

    public static final String h(RTCStats rTCStats) {
        Object obj = rTCStats.getMembers().get("trackIdentifier");
        if (obj != null) {
            return obj.toString();
        }
        return null;
    }

    public static final String i(RTCStats rTCStats) {
        Object obj = rTCStats.getMembers().get("transportId");
        if (obj != null) {
            return obj.toString();
        }
        return null;
    }
}
