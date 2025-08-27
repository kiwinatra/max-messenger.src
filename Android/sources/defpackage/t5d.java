package defpackage;

import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: t5d  reason: default package */
public final class t5d extends q2 {
    public final /* synthetic */ int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t5d(i6d i6d, int i) {
        super(i6d);
        this.o = i;
    }

    public final String F() {
        switch (this.o) {
            case 0:
                return "UPDATE chat_folder SET hideIfEmpty = ? WHERE id = ?";
            case 1:
                return "DELETE FROM folder_and_chats WHERE chatId = ?";
            case 2:
                return "UPDATE chat_folder SET isRemoved = 1 WHERE id=?";
            case 3:
                return "UPDATE chat_folder SET isHiddenForAllFolder=? WHERE id=?";
            case 4:
                return "DELETE FROM chat_folder";
            case 5:
                return "DELETE FROM chat_folder WHERE id=?";
            case 6:
                return "INSERT OR REPLACE INTO folder_and_chats VALUES (?, ?)";
            case 7:
                return "DELETE FROM folder_and_chats WHERE folderId = ?";
            case 8:
                return "DELETE FROM folder_and_chats";
            case 9:
                return "INSERT OR REPLACE INTO saved_msg_chat(user_id, chat_id) VALUES(?, ?)";
            case 10:
                return "DELETE FROM saved_msg_chat WHERE chat_id = ?";
            case 11:
                return "DELETE FROM saved_msg_chat";
            case 12:
                return "DELETE FROM events";
            case 13:
                return "DELETE FROM sticker_sets";
            case Protos.Attaches.Attach.LOCATION:
                return "DELETE FROM stickers";
            case Protos.Attaches.Attach.DAILY_MEDIA:
                return "DELETE FROM SystemIdInfo where work_spec_id=? AND generation=?";
            case 16:
                return "DELETE FROM SystemIdInfo where work_spec_id=?";
            case LangUtils.HASH_SEED:
                return "UPDATE tasks SET status = ? WHERE id = ?";
            case 18:
                return "UPDATE tasks SET data = ? WHERE id = ?";
            case 19:
                return "UPDATE tasks SET data = ?, status = ? WHERE id = ?";
            case 20:
                return "UPDATE tasks SET fails_count = fails_count + 1 WHERE id = ?";
            case 21:
                return "DELETE FROM tasks WHERE id = ?";
            case 22:
                return "DELETE FROM tasks";
            case 23:
                return "DELETE FROM tasks WHERE type = ?";
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                return "DELETE FROM uploads WHERE path=? AND upload_type=? AND last_modified=?";
            case 25:
                return "DELETE FROM uploads WHERE attach_id=?";
            case 26:
                return "DELETE FROM uploads WHERE photo_token=?";
            case 27:
                return "DELETE FROM uploads";
            case 28:
                return "DELETE FROM video_conversions WHERE source_uri=? AND quality=? AND start_trim_position=? AND end_trim_position=? AND mute=?";
            default:
                return "DELETE FROM video_conversions";
        }
    }
}
