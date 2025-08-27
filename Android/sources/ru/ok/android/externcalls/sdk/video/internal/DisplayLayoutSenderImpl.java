package ru.ok.android.externcalls.sdk.video.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.layout.ConversationDisplayLayoutItem;
import ru.ok.android.externcalls.sdk.video.DisplayLayoutSender;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B;\u0012\u0018\u0010\u0006\u001a\u0014\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002\u0012\u0018\u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\t0\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0014\u001a\u00020\t2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R&\u0010\u0006\u001a\u0014\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0016R&\u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\t0\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0016R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ok/android/externcalls/sdk/video/internal/DisplayLayoutSenderImpl;", "Lru/ok/android/externcalls/sdk/video/DisplayLayoutSender;", "Lkotlin/Function1;", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "Lru/ok/android/externcalls/sdk/ConversationParticipant;", "store", "", "Lo41;", "", "sender", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Lru/ok/android/externcalls/sdk/video/DisplayLayoutSender$SendFilter;", "condition", "applyFilter", "(Lru/ok/android/externcalls/sdk/video/DisplayLayoutSender$SendFilter;)V", "", "Lru/ok/android/externcalls/sdk/layout/ConversationDisplayLayoutItem;", "items", "sendDisplayLayouts", "(Ljava/util/Collection;)V", "Lkotlin/jvm/functions/Function1;", "Lru/ok/android/externcalls/sdk/video/DisplayLayoutSender$SendFilter;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class DisplayLayoutSenderImpl implements DisplayLayoutSender {
    private DisplayLayoutSender.SendFilter condition;
    private final Function1<List<o41>, Unit> sender;
    private final Function1<ParticipantId, ConversationParticipant> store;

    public DisplayLayoutSenderImpl(Function1<? super ParticipantId, ? extends ConversationParticipant> function1, Function1<? super List<o41>, Unit> function12) {
        this.store = function1;
        this.sender = function12;
    }

    public void applyFilter(DisplayLayoutSender.SendFilter sendFilter) {
        this.condition = sendFilter;
    }

    public void sendDisplayLayouts(Collection<ConversationDisplayLayoutItem> collection) {
        ue1 ue1;
        DisplayLayoutSender.SendFilter sendFilter = this.condition;
        if (sendFilter == null || sendFilter.shouldSend()) {
            ArrayList arrayList = new ArrayList();
            for (ConversationDisplayLayoutItem next : collection) {
                a9g type = next.getVideoTrackParticipantKey().getType();
                ConversationParticipant invoke = this.store.invoke(next.getVideoTrackParticipantKey().getParticipantId());
                if (!(invoke == null || !invoke.isUseable() || (ue1 = invoke.getCallParticipant().a) == null)) {
                    l15 l15 = new l15();
                    l15.a = ue1;
                    l15.b = type;
                    l15.c = next.getVideoTrackParticipantKey().getMovieId();
                    arrayList.add(new o41(l15.e(), next.getLayout()));
                }
            }
            this.sender.invoke(arrayList);
            return;
        }
        this.sender.invoke(CollectionsKt.emptyList());
    }
}
