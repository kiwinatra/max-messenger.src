package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.io.IOException;
import java.util.HashMap;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: vr2  reason: default package */
public abstract class vr2 {
    public static wr2 a(byte[] bArr) {
        try {
            Tasks.ChatUpdate chatUpdate = (Tasks.ChatUpdate) ad9.mergeFrom(new Tasks.ChatUpdate(), bArr);
            Tasks.Rect rect = chatUpdate.crop;
            Long l = null;
            a20 a20 = rect != null ? new a20(rect.left, rect.top, rect.right, rect.bottom, 3) : null;
            long j = chatUpdate.requestId;
            long j2 = chatUpdate.chatId;
            long j3 = chatUpdate.chatServerId;
            String str = chatUpdate.descriptionIsNull ? null : chatUpdate.description;
            String str2 = chatUpdate.themeIsNull ? null : chatUpdate.theme;
            String str3 = chatUpdate.photoTokenIsNull ? null : chatUpdate.photoToken;
            if (!chatUpdate.pinMessageIdIsNull) {
                l = Long.valueOf(chatUpdate.pinMessageId);
            }
            return new wr2(j, j2, j3, 0, (String) null, false, str, (HashMap) null, str2, str3, a20, l, chatUpdate.notifyPin, 0);
        } catch (InvalidProtocolBufferNanoException e) {
            throw new IOException(e);
        }
    }
}
