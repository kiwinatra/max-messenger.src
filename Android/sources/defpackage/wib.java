package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import one.me.chats.picker.chats.PickerChatsListWidget2;

/* renamed from: wib  reason: default package */
public final /* synthetic */ class wib extends FunctionReferenceImpl implements Function1 {
    public final /* synthetic */ PickerChatsListWidget2 a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wib(PickerChatsListWidget2 pickerChatsListWidget2) {
        super(1, Intrinsics.Kotlin.class, "isChatItem", "configureChatsList$lambda$18$isChatItem(Lone/me/chats/picker/chats/PickerChatsListWidget2;I)Z", 0);
        this.a = pickerChatsListWidget2;
    }

    public final Object invoke(Object obj) {
        return Boolean.valueOf(PickerChatsListWidget2.c0(this.a, ((Number) obj).intValue()));
    }
}
