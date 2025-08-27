package defpackage;

import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* renamed from: jg7  reason: default package */
public final class jg7 extends InputConnectionWrapper {
    public final /* synthetic */ kg7 a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jg7(InputConnection inputConnection, kg7 kg7) {
        super(inputConnection, false);
        this.a = kg7;
    }

    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        if (this.a.b(inputContentInfo == null ? null : new rt6(23, (Object) new vs6((Object) inputContentInfo)), i, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
