package defpackage;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty;
import one.me.folders.edit.FolderEditScreen;

/* renamed from: lz5  reason: default package */
public final /* synthetic */ class lz5 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FolderEditScreen b;

    public /* synthetic */ lz5(FolderEditScreen folderEditScreen, int i) {
        this.a = i;
        this.b = folderEditScreen;
    }

    public final Object invoke(Object obj) {
        FolderEditScreen folderEditScreen = this.b;
        View view = (View) obj;
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = FolderEditScreen.y;
                folderEditScreen.e0();
                fma onBackPressedDispatcher = folderEditScreen.getOnBackPressedDispatcher();
                if (onBackPressedDispatcher != null) {
                    onBackPressedDispatcher.d();
                }
                return Unit.INSTANCE;
            default:
                KProperty[] kPropertyArr2 = FolderEditScreen.y;
                folderEditScreen.d0().n();
                folderEditScreen.e0();
                return Unit.INSTANCE;
        }
    }
}
