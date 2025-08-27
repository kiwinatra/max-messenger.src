package defpackage;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty;
import one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet;

/* renamed from: v99  reason: default package */
public final /* synthetic */ class v99 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessageContextMenuBottomSheet b;

    public /* synthetic */ v99(MessageContextMenuBottomSheet messageContextMenuBottomSheet, int i) {
        this.a = i;
        this.b = messageContextMenuBottomSheet;
    }

    public final Object invoke(Object obj) {
        MessageContextMenuBottomSheet messageContextMenuBottomSheet = this.b;
        switch (this.a) {
            case 0:
                View view = (View) obj;
                KProperty[] kPropertyArr = MessageContextMenuBottomSheet.X0;
                messageContextMenuBottomSheet.i0(true);
                return Unit.INSTANCE;
            case 1:
                KProperty[] kPropertyArr2 = MessageContextMenuBottomSheet.X0;
                messageContextMenuBottomSheet.q0(((ow3) obj).a);
                return Unit.INSTANCE;
            default:
                KProperty[] kPropertyArr3 = MessageContextMenuBottomSheet.X0;
                messageContextMenuBottomSheet.q0(((ow3) obj).a);
                return Unit.INSTANCE;
        }
    }
}
