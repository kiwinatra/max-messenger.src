package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.io.IOException;
import kotlin.collections.ArraysKt;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: hv9  reason: default package */
public abstract class hv9 {
    public static iv9 a(byte[] bArr) {
        try {
            Tasks.MsgDelete msgDelete = (Tasks.MsgDelete) ad9.mergeFrom(new Tasks.MsgDelete(), bArr);
            return new iv9(msgDelete.requestId, msgDelete.chatId, msgDelete.chatServerId, ArraysKt.toList(msgDelete.messagesId), ArraysKt.toList(msgDelete.messagesServerId), !cvg.A(msgDelete.complaint) ? z93.a(msgDelete.complaint) : null, msgDelete.forMe, bk3.n(bl4.o, Integer.valueOf(msgDelete.itemTypeId)), msgDelete.notDeleteMessageFromDb);
        } catch (InvalidProtocolBufferNanoException e) {
            throw new IOException(e);
        }
    }
}
