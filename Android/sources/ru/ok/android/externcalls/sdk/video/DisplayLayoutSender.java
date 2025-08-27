package ru.ok.android.externcalls.sdk.video;

import java.util.Collection;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.layout.ConversationDisplayLayoutItem;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\nJ\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0016\u0010\u0006\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/video/DisplayLayoutSender;", "", "applyFilter", "", "condition", "Lru/ok/android/externcalls/sdk/video/DisplayLayoutSender$SendFilter;", "sendDisplayLayouts", "items", "", "Lru/ok/android/externcalls/sdk/layout/ConversationDisplayLayoutItem;", "SendFilter", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface DisplayLayoutSender {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\bæ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/video/DisplayLayoutSender$SendFilter;", "", "shouldSend", "", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface SendFilter {
        boolean shouldSend();
    }

    void applyFilter(SendFilter sendFilter);

    void sendDisplayLayouts(Collection<ConversationDisplayLayoutItem> collection);
}
