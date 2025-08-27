package ru.ok.tamtam.chats;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0005\u0010\t¨\u0006\n"}, d2 = {"Lru/ok/tamtam/chats/ChatsEventsByBus;", "Lwi0;", "Ltwf;", "updateMessageEvent", "", "onEvent", "(Ltwf;)V", "Lxy2;", "chatsUpdateEvent", "(Lxy2;)V", "tamtam-android-sdk_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nChatsEvents.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChatsEvents.kt\nru/ok/tamtam/chats/ChatsEventsByBus\n+ 2 ArraySet.kt\none/me/sdk/android/collections/ArraySetKt\n*L\n1#1,162:1\n8#2:163\n*S KotlinDebug\n*F\n+ 1 ChatsEvents.kt\nru/ok/tamtam/chats/ChatsEventsByBus\n*L\n155#1:163\n*E\n"})
final class ChatsEventsByBus extends wi0 {
    @oye
    @Keep
    public final void onEvent(twf twf) {
        if (twf.v) {
            a(new ks2(SetsKt.setOf(Long.valueOf(twf.b)), false, SetsKt.emptySet()));
        }
    }

    @oye
    @Keep
    public final void onEvent(xy2 xy2) {
        a(new ks2(new ws(xy2.b), xy2.c, xy2.y));
    }
}
