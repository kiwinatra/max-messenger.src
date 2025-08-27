package ru.ok.android.externcalls.sdk;

import org.webrtc.PeerConnection;

public final /* synthetic */ class u {
    public static String a(Object obj) {
        return ((PeerConnection.IceServer) obj).hostname;
    }

    public static boolean b(Object obj) {
        return ConversationImpl.lambda$runStartConversation$15((PeerConnection.IceServer) obj);
    }
}
