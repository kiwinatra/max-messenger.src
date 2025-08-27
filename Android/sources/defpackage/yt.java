package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import me.leolin.shortcutbadger.impl.NewHtcHomeBadger;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Protos;

/* renamed from: yt  reason: default package */
public final class yt extends fbf {
    public final /* synthetic */ int v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yt(x3b x3b, int i) {
        super(x3b);
        this.v = i;
    }

    public short N() {
        switch (this.v) {
            case 0:
                s9a s9a = x3b.c;
                return 29;
            case 1:
                s9a s9a2 = x3b.c;
                return 28;
            case 2:
                s9a s9a3 = x3b.c;
                return 26;
            case 3:
                s9a s9a4 = x3b.c;
                return 261;
            case 4:
                s9a s9a5 = x3b.c;
                return 260;
            case 5:
                s9a s9a6 = x3b.c;
                return 259;
            case 6:
                s9a s9a7 = x3b.c;
                return 27;
            case 10:
                s9a s9a8 = x3b.c;
                return 76;
            case 12:
                return x3b.CHAT_BOT_COMMANDS.a;
            case Protos.Attaches.Attach.LOCATION:
                s9a s9a9 = x3b.c;
                return 54;
            case Protos.Attaches.Attach.DAILY_MEDIA:
                s9a s9a10 = x3b.c;
                return 61;
            case 16:
                s9a s9a11 = x3b.c;
                return 117;
            case LangUtils.HASH_SEED:
                s9a s9a12 = x3b.c;
                return 63;
            case 18:
                s9a s9a13 = x3b.c;
                return 52;
            case 19:
                return x3b.CHAT_HIDE.a;
            case 21:
                s9a s9a14 = x3b.c;
                return 48;
            case 22:
                s9a s9a15 = x3b.c;
                return 57;
            case 23:
                s9a s9a16 = x3b.c;
                return 58;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                s9a s9a17 = x3b.c;
                return 50;
            case 26:
                s9a s9a18 = x3b.c;
                return 59;
            case 27:
                s9a s9a19 = x3b.c;
                return 77;
            case 28:
                s9a s9a20 = x3b.c;
                return 86;
            case 29:
                s9a s9a21 = x3b.c;
                return 68;
            default:
                return super.N();
        }
    }

    public boolean U() {
        switch (this.v) {
            case 7:
                return false;
            case 8:
                return false;
            case 11:
                return true;
            default:
                return super.U();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yt(int i, long j, long j2, long j3) {
        super((x3b) null);
        this.v = 6;
        if (i != 0) {
            t("type", tr1.d(i));
        }
        p(j, "sync");
        if (j2 != 0) {
            p(j2, ApiProtocol.PARAM_CHAT_ID);
        }
        if (j3 != 0) {
            p(j3, "userId");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yt(int i, String str, long j, int i2, String str2) {
        super((x3b) null);
        this.v = 2;
        if (i != 0 || !cvg.A(str)) {
            if (i != 0) {
                t("type", tr1.d(i));
            }
            if (!cvg.A(str)) {
                t("sectionId", str);
            }
            p(j, "from");
            h(i2, NewHtcHomeBadger.COUNT);
            if (str2 != null) {
                t("query", str2);
                return;
            }
            return;
        }
        throw new RuntimeException("Asset type or sectionId should be set");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yt(long j, String str, long j2, int i, String str2) {
        super((x3b) null);
        this.v = 26;
        p(j, ApiProtocol.PARAM_CHAT_ID);
        if (!cvg.A(str)) {
            t("type", str);
        }
        if (j2 != 0) {
            p(j2, "marker");
        }
        if (i > 0) {
            h(i, NewHtcHomeBadger.COUNT);
        }
        if (!cvg.A(str2)) {
            t("query", str2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yt(String str, String str2, int i) {
        super((x3b) null);
        this.v = i;
        switch (i) {
            case 29:
                super((x3b) null);
                t("query", str);
                h(50, NewHtcHomeBadger.COUNT);
                if (!cvg.A(str2)) {
                    t("marker", str2);
                    return;
                }
                return;
            default:
                if (!cvg.A(str2)) {
                    t("chatAccessToken", str2);
                    return;
                } else if (!cvg.A(str)) {
                    t("link", str);
                    return;
                } else {
                    return;
                }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yt(long[] jArr, int i) {
        super((x3b) null);
        this.v = 1;
        if (i == 0) {
            throw new IllegalArgumentException("type must not be null");
        } else if (jArr == null || jArr.length == 0) {
            throw new IllegalArgumentException("ids must not be null or empty");
        } else {
            t("type", tr1.d(i));
            j("ids", jArr);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yt(long j, Long l, Set set, Integer num, Integer num2) {
        super(x3b.CHAT_MEDIA);
        this.v = 25;
        p(j, ApiProtocol.PARAM_CHAT_ID);
        if (l != null) {
            ((HashMap) this.b).put("messageId", l);
        }
        if (set != null && !set.isEmpty()) {
            b10 b10 = b10.UNKNOWN;
            ArrayList arrayList = new ArrayList();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                switch (((b10) it.next()).ordinal()) {
                    case 2:
                        arrayList.add("PHOTO");
                        break;
                    case 3:
                        arrayList.add("VIDEO");
                        break;
                    case 4:
                        arrayList.add("AUDIO");
                        break;
                    case 6:
                        arrayList.add("SHARE");
                        break;
                    case 7:
                        arrayList.add("APP");
                        break;
                    case 8:
                        arrayList.add("CALL");
                        break;
                    case 9:
                        arrayList.add("FILE");
                        break;
                    case 10:
                        arrayList.add("CONTACT");
                        break;
                    case 11:
                        arrayList.add("PRESENT");
                        break;
                    case 12:
                        arrayList.add("INLINE_KEYBOARD");
                        break;
                    case 13:
                        arrayList.add("LOCATION");
                        break;
                    case Protos.Attaches.Attach.LOCATION:
                        arrayList.add("REPLY_KEYBOARD");
                        break;
                }
            }
            i("attachTypes", arrayList);
        }
        if (num != null) {
            ((HashMap) this.b).put("forward", num);
        }
        if (num2 != null) {
            ((HashMap) this.b).put("backward", num2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yt(long j, long j2, int i, long j3, int i2, long j4, boolean z, boolean z2, String str, bl4 bl4) {
        super(x3b.CHAT_HISTORY);
        this.v = 20;
        p(j, ApiProtocol.PARAM_CHAT_ID);
        p(j2, "from");
        h(i, "forward");
        p(j3, "forwardTime");
        h(i2, "backward");
        p(j4, "backwardTime");
        d("getChat", z);
        d("getMessages", z2);
        if (!(str == null || str.length() == 0)) {
            t("chatAccessToken", str);
        }
        t("itemType", bl4.name());
    }
}
