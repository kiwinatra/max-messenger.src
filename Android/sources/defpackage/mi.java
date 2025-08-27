package defpackage;

import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: mi  reason: default package */
public final class mi extends q2 {
    public final /* synthetic */ int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mi(i6d i6d, int i) {
        super(i6d);
        this.o = i;
    }

    public final String F() {
        switch (this.o) {
            case 0:
                return "DELETE FROM animoji";
            case 1:
                return "DELETE FROM animoji_set";
            case 2:
                return "DELETE FROM call_links WHERE conversation_id=?";
            case 3:
                return "DELETE FROM call_links";
            case 4:
                return "DELETE FROM chat_location WHERE message_id=?";
            case 5:
                return "DELETE FROM chat_location WHERE chat_id=? AND message_time>=? AND message_time <=?";
            case 6:
                return "DELETE FROM chat_location WHERE chat_id=?";
            case 7:
                return "DELETE FROM chat_location";
            case 8:
                return "DELETE FROM chats WHERE id = ?";
            case 9:
                return "DELETE FROM chats";
            case 10:
                return "INSERT OR REPLACE INTO chat_title (docid, normalizedTitle, originalTitle, normalizedTitleWithoutEmoji, originalTitleWithoutEmoji, sortTime) VALUES(?, ?, ?, ?, ?, ?)";
            case 11:
                return "DELETE FROM chat_title WHERE docid=?";
            case 12:
                return "DELETE FROM chat_title";
            case 13:
                return "DELETE FROM contact_location";
            case Protos.Attaches.Attach.LOCATION /*14*/:
                return "UPDATE contacts SET server_id = ?, data = ? WHERE id = ?";
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return "UPDATE contacts SET presence = ?, presence_type = ? WHERE server_id = ?";
            case 16:
                return "DELETE FROM contacts";
            case LangUtils.HASH_SEED /*17*/:
                return "INSERT OR REPLACE INTO contact_title (docid, link, allNormalizedTitles, allOriginalTitles, allNormalizedTitlesWithoutEmoji, allOriginalTitlesWithoutEmoji) VALUES(?, ?, ?, ?, ?, ?)";
            case 18:
                return "DELETE FROM contact_title WHERE docid=?";
            case 19:
                return "DELETE FROM contact_title";
            case 20:
                return "DELETE FROM default_emoji";
            case 21:
                return "DELETE FROM draft_uploads WHERE chat_id=? AND attach_id=?";
            case 22:
                return "DELETE FROM draft_uploads";
            case 23:
                return "DELETE FROM favorite_sticker_sets";
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                return "DELETE FROM favorite_stickers";
            case 25:
                return "DELETE FROM fcm_notifications_analytics";
            case 26:
                return "DELETE FROM fcm_notifications_analytics WHERE analytics_status=? AND chat_id=? AND time<=?";
            case 27:
                return "DELETE FROM fcm_notifications_analytics WHERE received_time<=?";
            case 28:
                return "DELETE FROM fcm_notifications_history";
            default:
                return "DELETE FROM message_uploads WHERE message_id=? AND chat_id=? AND attach_id=?";
        }
    }
}
