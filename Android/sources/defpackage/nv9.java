package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import ru.ok.tamtam.nano.Protos;
import ru.ok.tamtam.nano.Tasks;
import ru.ok.tamtam.nano.b;

/* renamed from: nv9  reason: default package */
public abstract class nv9 {
    public static ov9 a(byte[] bArr) {
        try {
            Tasks.MsgEdit msgEdit = (Tasks.MsgEdit) ad9.mergeFrom(new Tasks.MsgEdit(), bArr);
            Protos.Attaches attaches = msgEdit.oldAttaches;
            ArrayList arrayList = null;
            List list = attaches != null ? (List) b.e(attaches).b : null;
            Protos.MessageElements messageElements = msgEdit.oldElements;
            if (messageElements != null) {
                arrayList = ua9.a(messageElements);
            }
            ArrayList arrayList2 = arrayList;
            long j = msgEdit.requestId;
            long j2 = msgEdit.chatId;
            long j3 = msgEdit.messageId;
            long j4 = msgEdit.chatServerId;
            long j5 = msgEdit.messageServerId;
            String str = msgEdit.text;
            String str2 = msgEdit.oldText;
            sq6 sq6 = qe9.b;
            ov9 ov9 = r3;
            int i = msgEdit.oldStatus;
            sq6.getClass();
            ov9 ov92 = new ov9(j, j2, j3, j4, j5, str, str2, sq6.D(i), list, arrayList2, msgEdit.editAttaches);
            return ov9;
        } catch (InvalidProtocolBufferNanoException e) {
            throw new IOException(e);
        }
    }
}
