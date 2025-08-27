package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import one.me.chats.picker.PickerChatsListWidget;

/* renamed from: oib  reason: default package */
public final /* synthetic */ class oib extends FunctionReferenceImpl implements Function1 {
    public final /* synthetic */ PickerChatsListWidget a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public oib(PickerChatsListWidget pickerChatsListWidget) {
        super(1, Intrinsics.Kotlin.class, "isChatItem", "configureChatsList$lambda$11$isChatItem(Lone/me/chats/picker/PickerChatsListWidget;I)Z", 0);
        this.a = pickerChatsListWidget;
    }

    public final Object invoke(Object obj) {
        return Boolean.valueOf(PickerChatsListWidget.c0(this.a, ((Number) obj).intValue()));
    }
}
