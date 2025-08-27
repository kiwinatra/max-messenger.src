package defpackage;

import kotlin.jvm.functions.Function0;
import ru.ok.messages.utils.context_actions.dialog.ContextActionsDialog;

/* renamed from: wv3  reason: default package */
public final /* synthetic */ class wv3 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ContextActionsDialog b;

    public /* synthetic */ wv3(ContextActionsDialog contextActionsDialog, int i) {
        this.a = i;
        this.b = contextActionsDialog;
    }

    public final Object invoke() {
        ContextActionsDialog contextActionsDialog = this.b;
        switch (this.a) {
            case 0:
                String str = ContextActionsDialog.G1;
                return new vv3(new rx2(6, contextActionsDialog));
            default:
                String str2 = ContextActionsDialog.G1;
                return contextActionsDialog.F2().getParcelableArrayList("ru.ok.messages.CONTEXT_ACTIONS_KEY");
        }
    }
}
