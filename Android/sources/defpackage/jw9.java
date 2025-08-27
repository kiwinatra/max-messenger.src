package defpackage;

import java.util.HashMap;
import me.leolin.shortcutbadger.impl.NewHtcHomeBadger;
import org.apache.http.util.LangUtils;
import org.webrtc.MediaStreamTrack;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Protos;

/* renamed from: jw9  reason: default package */
public final class jw9 extends fbf {
    public final /* synthetic */ int v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jw9(x3b x3b, int i) {
        super(x3b);
        this.v = i;
    }

    public short N() {
        switch (this.v) {
            case 0:
                s9a s9a = x3b.c;
                return 70;
            case 1:
                s9a s9a2 = x3b.c;
                return 65;
            case 3:
                s9a s9a3 = x3b.c;
                return 80;
            case 4:
                s9a s9a4 = x3b.c;
                return 1;
            case 5:
                s9a s9a5 = x3b.c;
                return 16;
            case 6:
                s9a s9a6 = x3b.c;
                return 60;
            case 7:
                s9a s9a7 = x3b.c;
                return 43;
            case 10:
                s9a s9a8 = x3b.c;
                return 97;
            case 11:
                s9a s9a9 = x3b.c;
                return 96;
            case 12:
                s9a s9a10 = x3b.c;
                return 193;
            case 13:
                s9a s9a11 = x3b.c;
                return 194;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                s9a s9a12 = x3b.c;
                return 81;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                s9a s9a13 = x3b.c;
                return 119;
            case LangUtils.HASH_SEED /*17*/:
                s9a s9a14 = x3b.c;
                return 79;
            case 18:
                s9a s9a15 = x3b.c;
                return 195;
            case 19:
                s9a s9a16 = x3b.c;
                return 83;
            case 20:
                s9a s9a17 = x3b.c;
                return 82;
            default:
                return super.N();
        }
    }

    public int O() {
        switch (this.v) {
            case 4:
                return 0;
            default:
                return super.O();
        }
    }

    public boolean w() {
        switch (this.v) {
            case 1:
                return true;
            case 4:
                return true;
            default:
                return super.w();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jw9(long j, long j2, long j3, String str) {
        super((x3b) null);
        this.v = 19;
        p(j, "videoId");
        if (j2 != 0) {
            p(j2, ApiProtocol.PARAM_CHAT_ID);
        }
        if (j3 > 0) {
            p(j3, "messageId");
        }
        if (!cvg.A(str)) {
            t(ApiProtocol.KEY_TOKEN, str);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jw9(Boolean bool) {
        super((x3b) null);
        this.v = 3;
        h(1, NewHtcHomeBadger.COUNT);
        ((HashMap) this.b).put("profile", bool);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jw9(boolean z) {
        super((x3b) null);
        this.v = 20;
        h(1, NewHtcHomeBadger.COUNT);
        d(MediaStreamTrack.AUDIO_TRACK_KIND, z);
    }
}
