package ru.ok.android.externcalls.sdk;

import ru.ok.android.externcalls.sdk.stereo.internal.StereoRoomManagerImpl;

public final /* synthetic */ class p implements qk3, StereoRoomManagerImpl.GrantRolesRequest {
    public final /* synthetic */ ConversationImpl a;

    public /* synthetic */ p(ConversationImpl conversationImpl) {
        this.a = conversationImpl;
    }

    public void accept(Object obj) {
        this.a.lambda$addParticipant$29((Throwable) obj);
    }

    public void grantRoles(ue1 ue1, boolean z, xe1[] xe1Arr, Runnable runnable, Runnable runnable2) {
        this.a.grantRoles(ue1, z, xe1Arr, runnable, runnable2);
    }
}
