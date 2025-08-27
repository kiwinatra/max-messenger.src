package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet;

/* renamed from: w99  reason: default package */
public final /* synthetic */ class w99 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessageContextMenuBottomSheet b;

    public /* synthetic */ w99(MessageContextMenuBottomSheet messageContextMenuBottomSheet, int i) {
        this.a = i;
        this.b = messageContextMenuBottomSheet;
    }

    public final Object invoke() {
        MessageContextMenuBottomSheet messageContextMenuBottomSheet = this.b;
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = MessageContextMenuBottomSheet.X0;
                messageContextMenuBottomSheet.getClass();
                KProperty[] kPropertyArr2 = MessageContextMenuBottomSheet.X0;
                KProperty kProperty = kPropertyArr2[9];
                is isVar = messageContextMenuBottomSheet.I0;
                if (!((Boolean) isVar.a(messageContextMenuBottomSheet)).booleanValue()) {
                    KProperty kProperty2 = kPropertyArr2[9];
                    isVar.b(messageContextMenuBottomSheet, Boolean.TRUE);
                    zx3 targetController = messageContextMenuBottomSheet.getTargetController();
                    cx3 cx3 = targetController instanceof cx3 ? (cx3) targetController : null;
                    if (cx3 != null) {
                        cx3.onDismiss();
                    }
                }
                return Unit.INSTANCE;
            case 1:
                KProperty[] kPropertyArr3 = MessageContextMenuBottomSheet.X0;
                messageContextMenuBottomSheet.getClass();
                KProperty[] kPropertyArr4 = MessageContextMenuBottomSheet.X0;
                KProperty kProperty3 = kPropertyArr4[6];
                long longValue = ((Number) messageContextMenuBottomSheet.F0.a(messageContextMenuBottomSheet)).longValue();
                KProperty kProperty4 = kPropertyArr4[7];
                long longValue2 = ((Number) messageContextMenuBottomSheet.G0.a(messageContextMenuBottomSheet)).longValue();
                KProperty kProperty5 = kPropertyArr4[8];
                return new x59(longValue, longValue2, ((Number) messageContextMenuBottomSheet.H0.a(messageContextMenuBottomSheet)).longValue());
            default:
                KProperty[] kPropertyArr5 = MessageContextMenuBottomSheet.X0;
                return Boolean.valueOf(messageContextMenuBottomSheet.v0().q());
        }
    }
}
