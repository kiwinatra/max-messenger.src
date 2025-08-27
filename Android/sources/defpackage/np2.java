package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import me.leolin.shortcutbadger.impl.NewHtcHomeBadger;
import org.apache.http.util.LangUtils;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Protos;

/* renamed from: np2  reason: default package */
public final class np2 extends fbf {
    public final /* synthetic */ int v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ np2(x3b x3b, int i) {
        super(x3b);
        this.v = i;
    }

    public short N() {
        switch (this.v) {
            case 0:
                return x3b.CHAT_SEARCH_COMMON_PARTICIPANTS.a;
            case 1:
                s9a s9a = x3b.c;
                return 75;
            case 2:
                s9a s9a2 = x3b.c;
                return 55;
            case 3:
                s9a s9a3 = x3b.c;
                return 53;
            case 4:
                s9a s9a4 = x3b.c;
                return 22;
            case 7:
                s9a s9a5 = x3b.c;
                return 36;
            case 8:
                s9a s9a6 = x3b.c;
                return 38;
            case 9:
                s9a s9a7 = x3b.c;
                return 39;
            case 10:
                s9a s9a8 = x3b.c;
                return 35;
            case 11:
                s9a s9a9 = x3b.c;
                return 34;
            case 12:
                return x3b.DRAFT_DISCARD.a;
            case 13:
                return x3b.DRAFT_SAVE.a;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                s9a s9a10 = x3b.c;
                return 88;
            case 16:
                s9a s9a11 = x3b.c;
                return 87;
            case LangUtils.HASH_SEED /*17*/:
                s9a s9a12 = x3b.c;
                return 124;
            case 18:
                s9a s9a13 = x3b.c;
                return 179;
            case 22:
                s9a s9a14 = x3b.c;
                return 71;
            case 23:
                s9a s9a15 = x3b.c;
                return 181;
            case 25:
                s9a s9a16 = x3b.c;
                return 178;
            case 26:
                s9a s9a17 = x3b.c;
                return 73;
            case 27:
                s9a s9a18 = x3b.c;
                return 72;
            case 28:
                s9a s9a19 = x3b.c;
                return 118;
            default:
                return super.N();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public np2() {
        super((x3b) null);
        this.v = 16;
        h(1, NewHtcHomeBadger.COUNT);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public np2(long j, int i) {
        super((x3b) null);
        this.v = i;
        switch (i) {
            case 27:
                super((x3b) null);
                if (j != 0) {
                    p(j, ApiProtocol.PARAM_CHAT_ID);
                    return;
                }
                return;
            default:
                p(j, "fileId");
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public np2(long j, int i, String str, boolean z, String str2, HashMap hashMap, String str3, String str4, a20 a20, Long l, boolean z2, long j2) {
        super((x3b) null);
        String str5;
        this.v = 2;
        p(j, ApiProtocol.PARAM_CHAT_ID);
        if (i != 0) {
            if (i == 1) {
                str5 = "UNKNOWN";
            } else if (i == 2) {
                str5 = "PUBLIC";
            } else if (i == 3) {
                str5 = "PRIVATE";
            } else {
                throw null;
            }
            t("access", str5);
        }
        if (!cvg.A(str)) {
            t("link", str);
        }
        if (z) {
            d("revokePrivateLink", true);
        }
        if (str2 != null) {
            t("description", str2);
        }
        if (hashMap != null && hashMap.size() > 0) {
            s("options", hashMap);
        }
        if (str3 != null) {
            t("theme", str3);
        }
        if (str4 != null) {
            t("photoToken", str4);
        }
        if (a20 != null) {
            s("crop", a20.a());
        }
        if (l != null) {
            ((HashMap) this.b).put("pinMessageId", l);
            if (z2) {
                d("notifyPin", true);
            }
        }
        if (j2 != 0) {
            p(j2, "changeOwnerId");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public np2(long j, List list) {
        super((x3b) null);
        this.v = 22;
        p(j, ApiProtocol.PARAM_CHAT_ID);
        i("messageIds", list);
    }

    /* JADX WARNING: type inference failed for: r9v3, types: [qae, java.util.Map] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public np2(String str, long j, ue3 ue3, boolean z) {
        super((x3b) null);
        this.v = 4;
        Map map = null;
        if (!cvg.A(str)) {
            t("pushToken", str);
        }
        if (j > 0) {
            p(j, "pushOptions");
        }
        if (ue3 != null) {
            ? qae = new qae(4);
            String str2 = ue3.a;
            if (str2 != null) {
                qae.put("hash", str2);
            }
            Map map2 = ue3.c;
            if (map2 != null) {
                map = map2.isEmpty() ^ true ? map2 : map;
                if (map != null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
                    for (Map.Entry entry : map.entrySet()) {
                        Object key = entry.getKey();
                        rp2 rp2 = (rp2) entry.getValue();
                        rp2.getClass();
                        qae qae2 = new qae(0);
                        qae2.put("dontDisturbUntil", Long.valueOf(rp2.b));
                        Long l = rp2.c;
                        if (l != null) {
                            qae2.put("favIndex", l);
                        }
                        List list = rp2.a;
                        if (list == null || list.isEmpty()) {
                            Boolean bool = Boolean.FALSE;
                            qae2.put("sound", bool);
                            qae2.put("vibr", bool);
                            qae2.put("led", bool);
                        } else {
                            qae2.put("sound", Boolean.valueOf(list.contains(kl2.SOUND)));
                            qae2.put("vibr", Boolean.valueOf(list.contains(kl2.VIBRATION)));
                            qae2.put("led", Boolean.valueOf(list.contains(kl2.LED)));
                        }
                        linkedHashMap.put(key, qae2);
                    }
                    qae.put("chats", linkedHashMap);
                }
            }
            n0g n0g = ue3.d;
            if (n0g != null) {
                qae qae3 = new qae(0);
                Boolean bool2 = n0g.a;
                if (bool2 != null) {
                    qae3.put("PUSH_NEW_CONTACTS", bool2);
                }
                Long l2 = n0g.b;
                if (l2 != null) {
                    qae3.put("DONT_DISTURB_UNTIL", l2);
                }
                String str3 = n0g.c;
                if (str3 != null) {
                    qae3.put("DIALOGS_PUSH_NOTIFICATION", str3);
                }
                String str4 = n0g.d;
                if (str4 != null) {
                    qae3.put("CHATS_PUSH_NOTIFICATION", str4);
                }
                String str5 = n0g.e;
                if (str5 != null) {
                    qae3.put("PUSH_SOUND", str5);
                }
                String str6 = n0g.f;
                if (str6 != null) {
                    qae3.put("DIALOGS_PUSH_SOUND", str6);
                }
                String str7 = n0g.g;
                if (str7 != null) {
                    qae3.put("CHATS_PUSH_SOUND", str7);
                }
                Boolean bool3 = n0g.h;
                if (bool3 != null) {
                    qae3.put("HIDDEN", bool3);
                }
                Integer num = n0g.i;
                if (num != null) {
                    qae3.put("LED", num);
                }
                Integer num2 = n0g.j;
                if (num2 != null) {
                    qae3.put("DIALOGS_LED", num2);
                }
                Integer num3 = n0g.k;
                if (num3 != null) {
                    qae3.put("CHATS_LED", num3);
                }
                Boolean bool4 = n0g.l;
                if (bool4 != null) {
                    qae3.put("VIBR", bool4);
                }
                Boolean bool5 = n0g.m;
                if (bool5 != null) {
                    qae3.put("DIALOGS_VIBR", bool5);
                }
                Boolean bool6 = n0g.n;
                if (bool6 != null) {
                    qae3.put("CHATS_VIBR", bool6);
                }
                int i = n0g.p;
                if (i != 0) {
                    qae3.put("INCOMING_CALL", wzf.f(i));
                }
                int i2 = n0g.o;
                if (i2 != 0) {
                    qae3.put("CHATS_INVITE", wzf.f(i2));
                }
                m0g m0g = n0g.q;
                if (m0g != null) {
                    qae3.put("INACTIVE_TTL", m0g.a);
                }
                int i3 = n0g.r;
                if (i3 != 0) {
                    qae3.put("M_CALL_PUSH_NOTIFICATION", wzf.e(i3));
                }
                int i4 = n0g.s;
                if (i4 != 0) {
                    qae3.put("SUGGEST_STICKERS", wzf.g(i4));
                }
                Boolean bool7 = n0g.t;
                if (bool7 != null) {
                    qae3.put("AUDIO_TRANSCRIPTION_ENABLED", bool7);
                }
                Boolean bool8 = n0g.u;
                if (bool8 != null) {
                    qae3.put("SAFE_MODE", bool8);
                }
                int i5 = n0g.v;
                if (i5 != 0) {
                    qae3.put("SEARCH_BY_PHONE", wzf.f(i5));
                }
                qae.put("user", qae3);
            }
            t82 t82 = ue3.e;
            if (t82 != null) {
                Pair[] pairArr = {TuplesKt.to("ALL_FILTER_EXCLUDE", CollectionsKt.toList(t82.a)), TuplesKt.to("FOLDERS", CollectionsKt.toList(t82.b))};
                qae qae4 = new qae(2);
                for (int i6 = 0; i6 < 2; i6++) {
                    Pair pair = pairArr[i6];
                    qae4.put(pair.getFirst(), pair.getSecond());
                }
                qae.put("chatFolders", qae4);
            }
            s("settings", qae);
        }
        if (z) {
            d("reset", z);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public np2(long[] jArr, Long l) {
        super((x3b) null);
        this.v = 0;
        j("userIds", jArr);
        h(50, NewHtcHomeBadger.COUNT);
        if (l != null) {
            ((HashMap) this.b).put("marker", l);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public np2(long j, long j2, String str, a00 a00, ArrayList arrayList, cl4 cl4) {
        super(x3b.MSG_EDIT);
        this.v = 21;
        p(j, ApiProtocol.PARAM_CHAT_ID);
        p(j2, "messageId");
        if (str != null) {
            t("text", str);
        }
        if (a00 != null) {
            i("attachments", a00);
        }
        if (arrayList != null) {
            i("elements", arrayList);
        }
        if (cl4 != null) {
            s("delayedAttributes", MapsKt.mapOf(TuplesKt.to("timeToFire", Long.valueOf(cl4.a)), TuplesKt.to("notifySender", Boolean.valueOf(cl4.b))));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public np2(long[] jArr) {
        super(x3b.CONTACT_INFO);
        this.v = 6;
        j("contactIds", jArr);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public np2(long j, long j2, v5b v5b, Boolean bool, long j3) {
        super(x3b.MSG_SEND);
        this.v = 29;
        if (j != 0) {
            p(j, ApiProtocol.PARAM_CHAT_ID);
        }
        if (j2 != 0) {
            p(j2, "userId");
        }
        s("message", v5b.a());
        if (bool != null) {
            ((HashMap) this.b).put("notify", bool);
        }
        if (j3 != 0) {
            p(j3, "lastKnownDraftTime");
        }
    }
}
