package defpackage;

import android.os.Bundle;
import android.view.View;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.reflect.KProperty;
import one.me.folders.pickerfolders.FoldersPickerScreen;

/* renamed from: l76  reason: default package */
public final /* synthetic */ class l76 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ FoldersPickerScreen b;

    public /* synthetic */ l76(FoldersPickerScreen foldersPickerScreen, int i) {
        this.a = i;
        this.b = foldersPickerScreen;
    }

    public final void onClick(View view) {
        FoldersPickerScreen foldersPickerScreen = this.b;
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = FoldersPickerScreen.z;
                l86 c0 = foldersPickerScreen.c0();
                c0.getClass();
                CoroutineContext plus = caa.a.plus(((osa) c0.v).b());
                f14 f14 = f14.a;
                f86 f86 = new f86(c0, (Continuation) null);
                ev0.u(c0.a, plus, f14.c, f86);
                foldersPickerScreen.getRouter().C();
                return;
            default:
                KProperty[] kPropertyArr2 = FoldersPickerScreen.z;
                z16 z16 = z16.b;
                foldersPickerScreen.getClass();
                KProperty kProperty = FoldersPickerScreen.z[0];
                long longValue = ((Number) foldersPickerScreen.b.a(foldersPickerScreen)).longValue();
                z16.W0().d();
                ta4 W0 = z16.W0();
                W0.b(":settings/folder/create?chat_id=" + longValue, (Bundle) null);
                return;
        }
    }
}
