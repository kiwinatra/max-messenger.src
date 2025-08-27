package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.io.IOException;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: ef5  reason: default package */
public abstract class ef5 {
    public static ff5 a(byte[] bArr) {
        try {
            Tasks.ExternalVideoSend externalVideoSend = (Tasks.ExternalVideoSend) ad9.mergeFrom(new Tasks.ExternalVideoSend(), bArr);
            return new ff5(externalVideoSend.requestId, externalVideoSend.externalUrl, externalVideoSend.attachLocalId, externalVideoSend.messageId, externalVideoSend.chatId, externalVideoSend.stickerId);
        } catch (InvalidProtocolBufferNanoException e) {
            throw new IOException(e);
        }
    }
}
