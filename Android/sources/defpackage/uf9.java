package defpackage;

import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: uf9  reason: default package */
public final class uf9 extends q2 {
    public final /* synthetic */ int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uf9(i6d i6d, int i) {
        super(i6d);
        this.o = i;
    }

    public final String F() {
        switch (this.o) {
            case 0:
                return "DELETE FROM message_uploads";
            case 1:
                return "UPDATE messages SET localized_error = ? WHERE id = ?";
            case 2:
                return "UPDATE messages SET update_time = ? WHERE id = ?";
            case 3:
                return "UPDATE messages SET status = ? WHERE chat_id = ? AND time <= ?";
            case 4:
                return "UPDATE messages SET status = ? WHERE chat_id = ? AND time >= ? AND time <= ?";
            case 5:
                return "UPDATE messages SET channel_views = ? AND channel_forwards = ? WHERE server_id = ?";
            case 6:
                return "UPDATE messages SET reactions = ? WHERE server_id = ?";
            case 7:
                return "UPDATE messages SET delayed_attrs_time_to_fire = ? AND delayed_attrs_notify_sender = ? WHERE id = ?";
            case 8:
                return "DELETE FROM messages WHERE chat_id = ?";
            case 9:
                return "DELETE FROM messages";
            case 10:
                return "DELETE FROM messages WHERE chat_id = ? AND time <= ? AND inserted_from_msg_link = 0 AND delayed_attrs_time_to_fire IS NULL AND delayed_attrs_notify_sender IS NULL";
            case 11:
                return "DELETE FROM messages WHERE chat_id = ? AND delayed_attrs_time_to_fire <= ? AND inserted_from_msg_link = 0 AND delayed_attrs_time_to_fire IS NOT NULL AND delayed_attrs_notify_sender IS NOT NULL";
            case 12:
                return "DELETE FROM messages WHERE chat_id = ? AND server_id = 0 AND time_local >= ? AND time_local <= ?";
            case 13:
                return "DELETE FROM messages WHERE media_type = ?";
            case Protos.Attaches.Attach.LOCATION:
                return "UPDATE messages SET delivery_status = ? WHERE id = ?";
            case Protos.Attaches.Attach.DAILY_MEDIA:
                return "UPDATE messages SET error = ? WHERE id = ?";
            case 16:
                return "DELETE FROM fcm_notifications WHERE time <= ?";
            case LangUtils.HASH_SEED:
                return "DELETE FROM fcm_notifications WHERE time <= ? AND chat_id = ?";
            case 18:
                return "DELETE FROM fcm_notifications";
            case 19:
                return "DELETE FROM fcm_notifications WHERE chat_id = ?";
            case 20:
                return "DELETE FROM notifications_read_marks";
            case 21:
                return "DELETE FROM notifications_tracker_messages WHERE time<=?";
            case 22:
                return "DELETE FROM notifications_tracker_messages";
            case 23:
                return "UPDATE phones SET server_phone = ?, type = ? WHERE phone = ?";
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                return "DELETE FROM phones";
            case 25:
                return "DELETE FROM phones WHERE id = ?";
            case 26:
                return "DELETE FROM reactions_section";
            case 27:
                return "DELETE FROM recent";
            case 28:
                return "DELETE FROM folder_and_chats WHERE folderId = ? AND chatId = ?";
            default:
                return "UPDATE chat_folder SET title = ?, emoji = ? WHERE id = ?";
        }
    }
}
