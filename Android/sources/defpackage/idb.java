package defpackage;

import kotlin.enums.EnumEntriesKt;

/* renamed from: idb  reason: default package */
public enum idb {
    TYPE_MSG_DELETE(1),
    TYPE_MSG_SEND(2),
    TYPE_PROFILE(3),
    TYPE_CONTACT_UPDATE(4),
    TYPE_CONFIG(5),
    TYPE_CHAT_DELETE(6),
    TYPE_CHATS_LIST(7),
    TYPE_MSG_EDIT(8),
    TYPE_CHAT_CLEAR(9),
    TYPE_VIDEO_PLAY(10),
    TYPE_CHAT_MARK(11),
    TYPE_SYNC_CHAT_HISTORY(12),
    TYPE_CHAT_UPDATE(13),
    TYPE_CHAT_LEAVE(14),
    TYPE_CHAT_CLOSE(15),
    TYPE_CHAT_CREATE(16),
    TYPE_MSG_SHARE_PREVIEW(17),
    TYPE_CHAT_MEMBERS_UPDATE(18),
    TYPE_CHAT_SUBSCRIBE(19),
    TYPE_CHAT_PIN_SET_VISIBILITY(20),
    TYPE_FILE_DOWNLOAD_CMD(21),
    TYPE_REMOVE_CONTACT_PHOTO(22),
    TYPE_MSG_DELETE_RANGE(24),
    TYPE_CHAT_COMPLAIN(26),
    TYPE_MSG_SEND_CALLBACK(27),
    TYPE_SUSPEND_BOT(28),
    TYPE_LOCATION_REQUEST(29),
    TYPE_INVALIDATE_AND_DOWNLOAD_AUDIO(31),
    TYPE_CHANGE_PROFILE_OR_CHAT_PHOTO(32),
    TYPE_EXTERNAL_GIF_SEND(33),
    TYPE_LOCATION_STOP(34),
    TYPE_ASSETS_ADD(37),
    TYPE_ASSETS_LIST_MODIFY(38),
    TYPE_ASSETS_REMOVE(39),
    TYPE_ASSETS_MOVE(40),
    TYPE_CHAT_HIDE(41),
    TYPE_DRAFT_SAVE(42),
    TYPE_DRAFT_DISCARD(43),
    TYPE_MSG_REACT(44),
    TYPE_MSG_CANCEL_REACTION(45),
    TYPE_UPDATE_FIRE_TIME(46),
    TYPE_CHANGE_CHAT_PHOTO(47);
    
    public static final ekd b = null;
    public final int a;

    static {
        idb[] idbArr;
        c1 = EnumEntriesKt.enumEntries((E[]) idbArr);
        b = new ekd(16);
    }

    /* access modifiers changed from: public */
    idb(int i) {
        this.a = i;
    }
}
