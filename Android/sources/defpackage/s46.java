package defpackage;

import kotlin.jvm.functions.Function1;
import ru.ok.messages.settings.folders.settings.presentation.FolderSettingsViewModel;

/* renamed from: s46  reason: default package */
public final /* synthetic */ class s46 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FolderSettingsViewModel b;

    public /* synthetic */ s46(FolderSettingsViewModel folderSettingsViewModel, int i) {
        this.a = i;
        this.b = folderSettingsViewModel;
    }

    public final Object invoke(Object obj) {
        zx5 zx5 = (zx5) obj;
        switch (this.a) {
            case 0:
                return new x16(zx5.a, this.b.d.a(zx5), zx5.b.toString(), zx5.v, zx5.x, zx5.w, zx5.y);
            default:
                return new x16(zx5.a, this.b.d.a(zx5), zx5.b.toString(), zx5.v, zx5.x, zx5.w, zx5.y);
        }
    }
}
