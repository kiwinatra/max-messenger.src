package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.io.IOException;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: pvd  reason: default package */
public abstract class pvd {
    public static qvd a(byte[] bArr) {
        try {
            Tasks.SyncChatHistory syncChatHistory = (Tasks.SyncChatHistory) ad9.mergeFrom(new Tasks.SyncChatHistory(), bArr);
            qvd qvd = new qvd(syncChatHistory.taskId, syncChatHistory.chatId, syncChatHistory.count, bk3.n(bl4.o, Integer.valueOf(syncChatHistory.itemTypeId)));
            z68.c(qvd.w, "parseFrom", new Object[0]);
            return qvd;
        } catch (InvalidProtocolBufferNanoException e) {
            throw new IOException(e);
        }
    }
}
