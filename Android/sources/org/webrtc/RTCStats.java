package org.webrtc;

import java.util.Map;
import kotlin.text.Typography;

public class RTCStats {
    private final String id;
    private final Map<String, Object> members;
    private final long timestampUs;
    private final String type;

    public RTCStats(long j, String str, String str2, Map<String, Object> map) {
        this.timestampUs = j;
        this.type = str;
        this.id = str2;
        this.members = map;
    }

    private static void appendValue(StringBuilder sb, Object obj) {
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            sb.append('[');
            for (int i = 0; i < objArr.length; i++) {
                if (i != 0) {
                    sb.append(", ");
                }
                appendValue(sb, objArr[i]);
            }
            sb.append(']');
        } else if (obj instanceof String) {
            sb.append(Typography.quote);
            sb.append(obj);
            sb.append(Typography.quote);
        } else {
            sb.append(obj);
        }
    }

    @CalledByNative
    public static RTCStats create(long j, String str, String str2, Map map) {
        return new RTCStats(j, str, str2, map);
    }

    public String getId() {
        return this.id;
    }

    public Map<String, Object> getMembers() {
        return this.members;
    }

    public double getTimestampUs() {
        return (double) this.timestampUs;
    }

    public String getType() {
        return this.type;
    }

    public String toString() {
        StringBuilder o = tr1.o("{ timestampUs: ");
        o.append(this.timestampUs);
        o.append(", type: ");
        o.append(this.type);
        o.append(", id: ");
        o.append(this.id);
        for (Map.Entry next : this.members.entrySet()) {
            o.append(", ");
            o.append((String) next.getKey());
            o.append(": ");
            appendValue(o, next.getValue());
        }
        o.append(" }");
        return o.toString();
    }
}
