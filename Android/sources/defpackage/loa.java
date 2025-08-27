package defpackage;

import kotlin.jvm.functions.Function0;
import one.me.sdk.uikit.common.avatar.OneMeAvatarView;

/* renamed from: loa  reason: default package */
public final class loa implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ OneMeAvatarView b;

    public /* synthetic */ loa(OneMeAvatarView oneMeAvatarView, int i) {
        this.a = i;
        this.b = oneMeAvatarView;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                OneMeAvatarView oneMeAvatarView = this.b;
                Function0 function0 = oneMeAvatarView.w0;
                if (function0 != null) {
                    function0.invoke();
                }
                oneMeAvatarView.invalidate();
                return;
            default:
                OneMeAvatarView oneMeAvatarView2 = this.b;
                Function0 function02 = oneMeAvatarView2.w0;
                if (function02 != null) {
                    function02.invoke();
                }
                oneMeAvatarView2.invalidate();
                return;
        }
    }
}
