package defpackage;

import android.util.AttributeSet;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import one.me.folders.pickerfolders.FoldersPickerScreen;
import one.me.sdk.uikit.common.emptyview.OneMeEmptyView;

/* renamed from: j76  reason: default package */
public final /* synthetic */ class j76 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FoldersPickerScreen b;

    public /* synthetic */ j76(FoldersPickerScreen foldersPickerScreen, int i) {
        this.a = i;
        this.b = foldersPickerScreen;
    }

    public final Object invoke() {
        FoldersPickerScreen foldersPickerScreen = this.b;
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = FoldersPickerScreen.z;
                foldersPickerScreen.getClass();
                KProperty kProperty = FoldersPickerScreen.z[0];
                return new l86(((Number) foldersPickerScreen.b.a(foldersPickerScreen)).longValue());
            default:
                KProperty[] kPropertyArr2 = FoldersPickerScreen.z;
                OneMeEmptyView oneMeEmptyView = new OneMeEmptyView(foldersPickerScreen.getContext(), (AttributeSet) null);
                oneMeEmptyView.setIcon(cad.Q);
                oneMeEmptyView.setTitle(new igf(iua.p));
                oneMeEmptyView.M(oneMeEmptyView.getContext().getString(iua.m), new l76(foldersPickerScreen, 1));
                return oneMeEmptyView;
        }
    }
}
