package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.util.List;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import ru.ok.tamtam.nano.ProtoException;
import ru.ok.tamtam.nano.Protos;
import ru.ok.tamtam.nano.b;

/* renamed from: hp9  reason: default package */
public final class hp9 {
    public final Lazy a;

    public hp9(Lazy lazy) {
        this.a = lazy;
    }

    public static List a(byte[] bArr) {
        try {
            Protos.MessageElements messageElements = new Protos.MessageElements();
            ad9.mergeFrom(messageElements, bArr);
            return ua9.a(messageElements);
        } catch (InvalidProtocolBufferNanoException e) {
            z68.f("MessagesTypeConverters", "InvalidProtocolBufferNanoException", e);
            return CollectionsKt.emptyList();
        }
    }

    public static byte[] c(xd9 xd9) {
        if (xd9 == null) {
            return null;
        }
        byte[] bArr = b.a;
        Protos.MessageReactions messageReactions = new Protos.MessageReactions();
        List list = xd9.a;
        int size = list.size();
        Protos.MessageReactionWithCount[] messageReactionWithCountArr = new Protos.MessageReactionWithCount[size];
        for (int i = 0; i < size; i++) {
            wd9 wd9 = (wd9) list.get(i);
            Protos.MessageReactionWithCount messageReactionWithCount = new Protos.MessageReactionWithCount();
            Protos.ReactionData reactionData = new Protos.ReactionData();
            reactionData.reaction = wd9.a.b.a.toString();
            reactionData.type = wd9.a.a.a;
            messageReactionWithCount.count = wd9.b;
            messageReactionWithCount.reaction = reactionData;
            messageReactionWithCountArr[i] = messageReactionWithCount;
        }
        messageReactions.reactions = messageReactionWithCountArr;
        messageReactions.totalCount = xd9.b;
        qqc qqc = xd9.c;
        if (qqc != null) {
            Protos.ReactionData reactionData2 = new Protos.ReactionData();
            reactionData2.reaction = qqc.b.a.toString();
            reactionData2.type = qqc.a.a;
            messageReactions.yourReaction = reactionData2;
        }
        return ad9.toByteArray(messageReactions);
    }

    public final xd9 b(byte[] bArr) {
        yd9 yd9 = (yd9) this.a.getValue();
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        try {
            return yd9.a(bArr);
        } catch (ProtoException e) {
            throw new RuntimeException(e);
        }
    }
}
