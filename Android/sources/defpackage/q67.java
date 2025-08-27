package defpackage;

import android.os.SystemClock;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: q67  reason: default package */
public final class q67 {
    public static final Pattern i = Pattern.compile(".*typ (host|prflx|srflx|relay+).*");
    public static final Pattern j = Pattern.compile(".*transport=(tcp|udp).*");
    public static final Pattern k = Pattern.compile(".*(?:tcp|udp) \\d+ (\\S+).*");
    public final yoc a;
    public final voc b;
    public final int c;
    public final HashMap d;
    public long e;
    public long f;
    public boolean g = false;
    public String h;

    public q67(yoc yoc, voc voc, int i2) {
        this.a = yoc;
        this.b = voc;
        this.c = i2;
        this.d = new HashMap();
        for (jug put : jug.values()) {
            this.d.put(put, 0);
        }
    }

    public final void a(boolean z) {
        if (this.f != 0 && !this.g) {
            this.g = true;
            HashMap hashMap = new HashMap();
            String str = this.h;
            if (str == null) {
                this.h = null;
                int i2 = this.c;
                if (i2 == 0) {
                    this.h = "direct";
                } else if (i2 == 1) {
                    this.h = "server_send";
                } else if (i2 == 2) {
                    this.h = "server_recv";
                }
                str = this.h;
            }
            if (str == null) {
                this.b.log("CandidateLog", "unknown topology, not logging connect");
            }
            StringBuilder m = g63.m(str, ":");
            m.append(z ? SystemClock.elapsedRealtime() - this.f : -1);
            hashMap.put("param", m.toString());
            this.a.log(yoc.COLLECTOR_VIDEO, "callCandidatesApply", (Map) hashMap);
        }
    }
}
