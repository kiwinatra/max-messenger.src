package defpackage;

import android.media.MediaMuxer;
import java.io.IOException;
import kotlin.TuplesKt;

/* renamed from: yl4  reason: default package */
public final class yl4 implements zi6, qk3, b0a, pie {
    public final /* synthetic */ int a;
    public long b;

    public /* synthetic */ yl4(int i, boolean z) {
        this.a = i;
    }

    public tb7 C(int i) {
        if (i == 2) {
            return xe6.y;
        }
        if (i == 1) {
            return xe6.z;
        }
        lx5 lx5 = tb7.b;
        return k0d.v;
    }

    public e0a N(String str) {
        try {
            return new xe6(new MediaMuxer(str, 0), this.b);
        } catch (IOException e) {
            throw new Exception("Error creating muxer", e);
        }
    }

    public long a(long j) {
        if (j == -1) {
            this.b = -1;
            return -1;
        }
        long j2 = this.b;
        if (j2 == -1 || j < j2) {
            this.b = j;
            return 0;
        }
        long j3 = j - j2;
        this.b = j;
        return j3;
    }

    public void accept(Object obj) {
        switch (this.a) {
            case 3:
                z68.h(kj5.y0, (Throwable) obj, "failed to delete %d", Long.valueOf(this.b));
                return;
            case 10:
                String str = qfa.z;
                z68.f(str, "onNotificationsSelfReadMarkChanged: failed, chatServerId=" + this.b, (Throwable) obj);
                return;
            case 11:
                String str2 = qfa.z;
                z68.f(str2, "onSelfReadMarkChanged: failed, chat=" + this.b, (Throwable) obj);
                return;
            default:
                String str3 = qfa.z;
                z68.f(str3, "onSelfReadMarkChangedByServerId: failed, chatServerId=" + this.b, (Throwable) obj);
                return;
        }
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 1:
                iu4 iu4 = (iu4) obj;
                iu4.getClass();
                d7d a2 = d7d.a(1, "SELECT * FROM draft_uploads WHERE chat_id = ?");
                a2.k(1, this.b);
                return new bi8(new hu4(iu4, a2, 1));
            case 2:
                bj5 bj5 = (bj5) obj;
                bj5.getClass();
                return new mka(2, new aj5(bj5, this.b, 0));
            case 4:
                gfa gfa = (gfa) obj;
                gfa.getClass();
                return new qa3(2, new aj5(gfa, this.b, 1));
            case 5:
                gfa gfa2 = (gfa) obj;
                gfa2.getClass();
                d7d a3 = d7d.a(1, "SELECT * FROM fcm_notifications where time > ? ORDER BY time ASC");
                a3.k(1, this.b);
                return new mka(1, new fbd(new ni(17, gfa2, a3), 0));
            case 12:
                return lbe.h(TuplesKt.to(Long.valueOf(this.b), (Boolean) obj));
            default:
                oga oga = (oga) obj;
                oga.getClass();
                return new mka(2, new aj5(oga, this.b, 2));
        }
    }

    public oie h() {
        return new zqd(this);
    }

    public /* synthetic */ yl4(long j, int i) {
        this.a = i;
        this.b = j;
    }

    public yl4(int i) {
        this.a = i;
        switch (i) {
            case 9:
                this.b = -9223372036854775807L;
                return;
            default:
                this.b = -1;
                return;
        }
    }
}
