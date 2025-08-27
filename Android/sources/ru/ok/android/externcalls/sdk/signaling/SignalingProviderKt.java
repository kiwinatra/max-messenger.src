package ru.ok.android.externcalls.sdk.signaling;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ru.ok.android.externcalls.sdk.exceptions.ConversationNotPreparedException;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "Lkotlin/Function1;", "", "", "onError", "Lo9e;", "get", "(Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;Lkotlin/jvm/functions/Function1;)Lo9e;", "calls-sdk_release"}, k = 2, mv = {1, 9, 0})
public final class SignalingProviderKt {
    public static final o9e get(SignalingProvider signalingProvider, Function1<? super Throwable, Unit> function1) {
        if (signalingProvider.getSignaling() == null && function1 != null) {
            function1.invoke(new ConversationNotPreparedException());
        }
        return signalingProvider.getSignaling();
    }
}
