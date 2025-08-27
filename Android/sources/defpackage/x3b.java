package defpackage;

import java.util.HashMap;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* renamed from: x3b  reason: default package */
public enum x3b {
    AUTH_REQUEST(17, (int) null),
    AUTH(18, (int) null),
    LOGIN(19, m88.a),
    LOGOUT(20, (int) null),
    SYNC(21, (int) null),
    AUTH_CONFIRM(23, (int) null),
    ASSETS_LIST_MODIFY(261, (int) null),
    ASSETS_REMOVE(259, (int) null),
    ASSETS_MOVE(260, (int) null),
    ASSETS_ADD(29, (int) null),
    PRESET_AVATARS(25, mz4.v),
    CONTACT_INFO(32, ko3.a),
    CONTACT_INFO_BY_PHONE(46, io3.a),
    CONTACT_VERIFY(42, (int) null),
    REMOVE_CONTACT_PHOTO(43, (int) null),
    CHAT_HISTORY(49, (int) null),
    CHAT_MEDIA(51, (int) null),
    CHAT_CHECK_LINK(56, (int) null),
    MSG_SEND(64, (int) null),
    MSG_DELETE(66, (int) null),
    MSG_EDIT(67, (int) null),
    MSG_DELETE_RANGE(92, (int) null),
    MSG_GET_REACTIONS(180, o9a.v),
    VIDEO_CHAT_START(76, (int) null),
    VIDEO_CHAT_HISTORY(79, (int) null),
    STICKER_UPLOAD(81, (int) null),
    FILE_UPLOAD(87, (int) null),
    FILE_DOWNLOAD(88, (int) null),
    LINK_INFO(89, (int) null),
    CONFIRM_PRESENT(101, (int) null),
    GET_INBOUND_CALLS(103, (int) null),
    EXTERNAL_CALLBACK(105, pe5.a),
    CALLS_TOKEN(158, (int) null),
    CHAT_COMPLAIN(117, (int) null),
    MSG_SEND_CALLBACK(118, (int) null),
    LOCATION_STOP(124, (int) null),
    LOCATION_SEND(125, (int) null),
    LOCATION_REQUEST(126, (int) null),
    GET_LAST_MENTIONS(127, (int) null),
    STICKER_CREATE(193, (int) null),
    STICKER_SUGGEST(194, (int) null),
    VIDEO_CHAT_MEMBERS(195, (int) null),
    NOTIF_MESSAGE(128, lba.a),
    NOTIF_TYPING(129, (int) null),
    NOTIF_MARK(130, (int) null),
    NOTIF_CONTACT(131, (int) null),
    NOTIF_PRESENCE(132, (int) null),
    NOTIF_CONFIG(134, (int) null),
    NOTIF_CHAT(135, (int) null),
    NOTIF_ATTACH(136, (int) null),
    NOTIF_CALL_START(137, (int) null),
    NOTIF_CONTACT_SORT(139, (int) null),
    NOTIF_MSG_DELETE_RANGE(140, (int) null),
    NOTIF_MSG_DELETE(142, vba.a),
    NOTIF_MSG_REACTIONS_CHANGED(155, (int) null),
    NOTIF_MSG_YOU_REACTED(156, (int) null),
    NOTIF_CALLBACK_ANSWER(143, (int) null),
    CHAT_BOT_COMMANDS(144, (int) null),
    BOT_INFO(145, rq0.a),
    NOTIF_LOCATION(147, (int) null),
    NOTIF_LOCATION_REQUEST(148, (int) null),
    NOTIF_ASSETS_UPDATE(150, (int) null),
    NOTIF_DRAFT(152, (int) null),
    NOTIF_DRAFT_DISCARD(153, (int) null),
    DRAFT_SAVE(176, (int) null),
    DRAFT_DISCARD(177, (int) null),
    CHAT_HIDE(196, (int) null),
    CHAT_SEARCH_COMMON_PARTICIPANTS(198, (int) null),
    NOTIF_MSG_DELAYED(154, qba.a),
    PROFILE_DELETE(199, k1d.a),
    PROFILE_DELETE_TIME(200, m1d.a),
    WEB_APP_INIT_DATA(160, bhg.a);
    
    public static final s9a c = null;
    public static final HashMap o = null;
    public final short a;
    public final c43 b;

    static {
        x3b[] x3bArr;
        EnumEntries<x3b> enumEntries = EnumEntriesKt.enumEntries((E[]) x3bArr);
        I1 = enumEntries;
        c = new s9a(16, (byte) 0);
        o = new HashMap();
        for (x3b x3b : enumEntries) {
            o.put(Short.valueOf(x3b.a), x3b.name());
        }
    }

    /* access modifiers changed from: public */
    x3b(short s, c43 c43) {
        this.a = s;
        this.b = c43;
    }

    public static final String b(short s) {
        c.getClass();
        HashMap hashMap = o;
        Short valueOf = Short.valueOf(s);
        Object obj = hashMap.get(valueOf);
        if (obj == null) {
            obj = s9a.f(s);
            hashMap.put(valueOf, obj);
        }
        return (String) obj;
    }

    public final c43 a() {
        return this.b;
    }

    public final short c() {
        return this.a;
    }
}
