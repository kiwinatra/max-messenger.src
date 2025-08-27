package ru.ok.messages.views.dialogs;

import android.app.Dialog;
import android.os.Bundle;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ok/messages/views/dialogs/VideoCompressionModeDialog;", "Lru/ok/messages/views/dialogs/FrgDlgBase;", "<init>", "()V", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nVideoCompressionModeDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VideoCompressionModeDialog.kt\nru/ok/messages/views/dialogs/VideoCompressionModeDialog\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,87:1\n11102#2:88\n11437#2,3:89\n37#3,2:92\n*S KotlinDebug\n*F\n+ 1 VideoCompressionModeDialog.kt\nru/ok/messages/views/dialogs/VideoCompressionModeDialog\n*L\n21#1:88\n21#1:89,3\n25#1:92,2\n*E\n"})
public final class VideoCompressionModeDialog extends FrgDlgBase {
    public final Dialog V2(Bundle bundle) {
        y3g[] values = y3g.values();
        ArrayList arrayList = new ArrayList(values.length);
        for (y3g y3g : values) {
            arrayList.add(y3g.a.a);
        }
        cg8 q = new cg8(G2()).q(S1(qad.R4));
        q.h((CharSequence[]) arrayList.toArray(new String[0]), new w13(this, values, 9));
        return q.g();
    }
}
