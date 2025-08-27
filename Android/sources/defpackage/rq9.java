package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import ru.ok.tamtam.logout.a;

/* renamed from: rq9  reason: default package */
public final class rq9 extends pq9 {
    public final a c;
    public final xt4 d;

    public rq9(a aVar, xt4 xt4) {
        super(1, 2);
        this.c = aVar;
        this.d = xt4;
    }

    public final void a(af6 af6) {
        z68.c("Migration_1_2", "start", new Object[0]);
        wy2 wy2 = new wy2(this.d);
        ArrayList arrayList = new ArrayList();
        af6.m();
        try {
            Cursor r0 = af6.r0("SELECT * FROM chats");
            try {
                int columnIndex = r0.getColumnIndex("id");
                int columnIndex2 = r0.getColumnIndex("data");
                while (r0.moveToNext()) {
                    if (!r0.isNull(columnIndex2)) {
                        long j = r0.getLong(columnIndex);
                        try {
                            arrayList.add(new Long[]{Long.valueOf(wy2.a(r0.getBlob(columnIndex2)).l), Long.valueOf(j)});
                        } catch (Throwable unused) {
                            z68.p("Migration_1_2", "could not parse blob for chat #" + j);
                        }
                    }
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(r0, (Throwable) null);
                if (arrayList.isEmpty()) {
                    af6.s0();
                    z68.c("Migration_1_2", "no data, finished!", new Object[0]);
                    af6.U();
                    return;
                }
                af6.V("DROP INDEX IF EXISTS index_chats_server_id");
                af6.V("CREATE INDEX IF NOT EXISTS `index_chats_server_id` ON `chats` (`server_id`)");
                af6.V("ALTER TABLE chats ADD COLUMN cid INTEGER NOT NULL DEFAULT 0");
                af6.V("CREATE INDEX IF NOT EXISTS `index_chats_cid` ON `chats` (`cid`)");
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    af6.e0("UPDATE chats SET cid = ? WHERE id = ?", (Long[]) it.next());
                }
                af6.V("CREATE TABLE IF NOT EXISTS `temp_messages` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `server_id` INTEGER NOT NULL, `time` INTEGER NOT NULL, `update_time` INTEGER NOT NULL, `sender` INTEGER NOT NULL, `cid` INTEGER NOT NULL, `text` TEXT, `delivery_status` INTEGER NOT NULL, `status` INTEGER NOT NULL, `time_local` INTEGER NOT NULL, `error` TEXT, `localized_error` TEXT, `attaches` BLOB, `media_type` INTEGER NOT NULL, `detect_share` INTEGER NOT NULL, `msg_link_type` INTEGER NOT NULL, `msg_link_id` INTEGER NOT NULL, `inserted_from_msg_link` INTEGER NOT NULL, `msg_link_chat_id` INTEGER NOT NULL, `msg_link_chat_name` TEXT, `msg_link_chat_link` TEXT, `msg_link_out_chat_id` INTEGER NOT NULL, `msg_link_out_msg_id` INTEGER NOT NULL, `type` INTEGER NOT NULL, `chat_id` INTEGER NOT NULL, `ttl` INTEGER NOT NULL, `channel_views` INTEGER NOT NULL, `channel_forwards` INTEGER NOT NULL, `view_time` INTEGER NOT NULL, `zoom` INTEGER NOT NULL, `options` INTEGER NOT NULL, `live_until` INTEGER NOT NULL, `constructor_id` INTEGER NOT NULL, `elements` BLOB NOT NULL, `reactions` BLOB, `delayed_attrs_time_to_fire` INTEGER, `delayed_attrs_notify_sender` INTEGER, FOREIGN KEY(`chat_id`) REFERENCES `chats`(`id`) ON UPDATE NO ACTION ON DELETE NO ACTION )");
                af6.V("INSERT INTO temp_messages SELECT * FROM messages");
                af6.V("DROP TABLE messages");
                af6.V("ALTER TABLE temp_messages RENAME TO messages");
                af6.V("CREATE INDEX IF NOT EXISTS `index_messages_chat_id` ON `messages` (`chat_id`)");
                af6.V("CREATE INDEX IF NOT EXISTS `index_messages_cid` ON `messages` (`cid`)");
                af6.V("CREATE INDEX IF NOT EXISTS `index_messages_server_id` ON `messages` (`server_id`)");
                af6.V("CREATE INDEX IF NOT EXISTS `index_messages_chat_id_time` ON `messages` (`chat_id`, `time`)");
                af6.V("CREATE INDEX IF NOT EXISTS `index_messages_chat_id_media_type` ON `messages` (`chat_id`, `media_type`)");
                af6.V("CREATE INDEX IF NOT EXISTS `index_messages_delayed_attrs_time_to_fire_delayed_attrs_notify_sender` ON `messages` (`delayed_attrs_time_to_fire`, `delayed_attrs_notify_sender`)");
                af6.s0();
                a67 a67 = z68.b;
                if (a67 != null) {
                    if (a67.c()) {
                        w78 w78 = w78.o;
                        int size = arrayList.size();
                        a67.d(w78, "Migration_1_2", "finish! migrate " + size + " chats", (Throwable) null);
                    }
                }
                af6.U();
            } catch (Throwable th) {
                CloseableKt.closeFinally(r0, th);
                throw th;
            }
        } catch (Throwable th2) {
            af6.U();
            throw th2;
        }
    }
}
