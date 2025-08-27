package defpackage;

import android.os.Bundle;
import one.me.calls.ui.bottomsheet.ratecall.CallRateBottomSheet;

/* renamed from: s31  reason: default package */
public final class s31 implements ya4 {
    public final /* synthetic */ Bundle a;

    public s31(Bundle bundle) {
        this.a = bundle;
    }

    public final Object a() {
        Bundle bundle = this.a;
        return new CallRateBottomSheet(o54.N("call_id", bundle), o54.I("is_video", bundle), bundle.containsKey("sdk_reasons") ? StringsKt__StringsKt.split$default((CharSequence) o54.N("sdk_reasons", bundle), new String[]{","}, true, 0, 4, (Object) null) : null);
    }
}
