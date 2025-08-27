package defpackage;

import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: v52  reason: default package */
public final /* synthetic */ class v52 implements qk3, zi6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ long o;

    public /* synthetic */ v52(int i, long j, long j2, String str) {
        this.a = i;
        this.b = j;
        this.c = str;
        this.o = j2;
    }

    public void accept(Object obj) {
        long j = this.b;
        long j2 = this.o;
        Object obj2 = this.c;
        switch (this.a) {
            case 0:
                w62 w62 = (w62) obj;
                String str = (String) obj2;
                z68.c("r62", "reactions, updateLastReaction chatId = %d, lastReactedMessageId = %d, lastREaction = %s", Long.valueOf(j), Long.valueOf(j2), str);
                if (j2 == 0) {
                    w62.n0 = 0;
                    w62.o0 = null;
                    return;
                }
                if (w62.n0 != j2) {
                    w62.n0 = j2;
                }
                String str2 = w62.o0;
                if (str2 == null || !str2.equals(str)) {
                    w62.o0 = str;
                    return;
                }
                return;
            case 1:
                w62 w622 = (w62) obj;
                w622.getClass();
                w622.m0 = new i72(this.o, (String) obj2, this.b);
                return;
            default:
                j10 j10 = (j10) obj;
                fa9 fa9 = (fa9) obj2;
                fa9.getClass();
                if (j10.e != null && j2 != 0) {
                    cud cud = ((ltb) fa9.c).b;
                    cud.getClass();
                    if (j2 >= ((long) ((int) cud.r(PmsKey.f78mindurationsaveaudiostarttime, (long) 20)))) {
                        if (j2 - j <= CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS) {
                            j = 0;
                        }
                        i10 i10 = j10.e;
                        if (i10 == null) {
                            i10 = i10.j;
                        }
                        h10 a2 = i10.a();
                        a2.g = j;
                        a2.c = j2;
                        a2.h = System.currentTimeMillis();
                        j10.e = new i10(a2);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public Object apply(Object obj) {
        jc2 jc2 = (jc2) obj;
        switch (this.a) {
            case 2:
                jc2.getClass();
                d7d a2 = d7d.a(4, "SELECT * FROM chat_location WHERE contact_server_id=? AND device_id=? AND ?>=start_time AND ?<=end_time");
                a2.k(1, this.b);
                String str = (String) this.c;
                if (str == null) {
                    a2.X(2);
                } else {
                    a2.h(2, str);
                }
                long j = this.o;
                a2.k(3, j);
                a2.k(4, j);
                return new bi8(new gc2(jc2, a2, 1));
            default:
                jc2.getClass();
                d7d a3 = d7d.a(3, "SELECT * FROM chat_location WHERE end_time >= ? AND contact_server_id = ? AND device_id = ?");
                a3.k(1, this.o);
                a3.k(2, this.b);
                String str2 = (String) this.c;
                if (str2 == null) {
                    a3.X(3);
                } else {
                    a3.h(3, str2);
                }
                return new bi8(new gc2(jc2, a3, 5));
        }
    }

    public /* synthetic */ v52(long j, long j2) {
        this.a = 0;
        this.b = j;
        this.o = j2;
        this.c = null;
    }

    public /* synthetic */ v52(fa9 fa9, long j, long j2) {
        this.a = 4;
        this.c = fa9;
        this.b = j;
        this.o = j2;
    }
}
