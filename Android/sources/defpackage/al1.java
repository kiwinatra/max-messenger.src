package defpackage;

import ru.ok.android.externcalls.sdk.connection.MediaConnectionListener;
import ru.ok.android.externcalls.sdk.events.ConversationEventsListener;

/* renamed from: al1  reason: default package */
public interface al1 extends ConversationEventsListener, vk1, MediaConnectionListener {
    void b(String str) {
    }

    void onMediaConnected(MediaConnectionListener.ConnectedInfo connectedInfo) {
    }

    void onMediaDisconnected(MediaConnectionListener.DisconnectedInfo disconnectedInfo) {
    }
}
