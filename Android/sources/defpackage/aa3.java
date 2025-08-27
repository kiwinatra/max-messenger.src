package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import one.me.complaintbottomsheet.ComplaintBottomSheet;
import one.me.sdk.arch.Widget;

/* renamed from: aa3  reason: default package */
public final /* synthetic */ class aa3 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ComplaintBottomSheet b;

    public /* synthetic */ aa3(ComplaintBottomSheet complaintBottomSheet, int i) {
        this.a = i;
        this.b = complaintBottomSheet;
    }

    public final Object invoke() {
        ComplaintBottomSheet complaintBottomSheet = this.b;
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = ComplaintBottomSheet.v;
                complaintBottomSheet.getClass();
                KProperty kProperty = ComplaintBottomSheet.v[0];
                return new la3(((Number) complaintBottomSheet.a.a(complaintBottomSheet)).longValue());
            default:
                KProperty[] kPropertyArr2 = ComplaintBottomSheet.v;
                e0b e0b = new e0b((Widget) complaintBottomSheet);
                e0b.f(new o0b(cad.B));
                e0b.h(new igf(gta.b));
                return e0b;
        }
    }
}
