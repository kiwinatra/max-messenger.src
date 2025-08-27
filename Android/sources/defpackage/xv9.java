package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.io.IOException;
import java.util.Iterator;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: xv9  reason: default package */
public abstract class xv9 {
    public static yv9 a(byte[] bArr) {
        Object obj;
        try {
            Tasks.MsgReact msgReact = (Tasks.MsgReact) ad9.mergeFrom(new Tasks.MsgReact(), bArr);
            long j = msgReact.requestId;
            long j2 = msgReact.chatId;
            long j3 = msgReact.messageId;
            long j4 = msgReact.chatServerId;
            long j5 = msgReact.messageServerId;
            mz4 mz4 = vd9.b;
            int i = msgReact.reactionType;
            mz4.getClass();
            Iterator it = vd9.v.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                Iterator it2 = it;
                if (((vd9) obj).a == i) {
                    break;
                }
                it = it2;
            }
            vd9 vd9 = (vd9) obj;
            if (vd9 != null) {
                return new yv9(j, j2, j3, j4, j5, new nd9(vd9, msgReact.reaction));
            }
            throw new IllegalArgumentException(wj6.h(i, "Unknown reactionType = "));
        } catch (InvalidProtocolBufferNanoException e) {
            throw new IOException(e);
        }
    }
}
