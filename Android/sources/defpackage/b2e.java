package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import one.me.sdk.arch.Widget;
import one.me.settings.SettingsListScreen;
import ru.ok.messages.gallery.GalleryResultViewModel;

/* renamed from: b2e  reason: default package */
public final /* synthetic */ class b2e implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SettingsListScreen b;

    public /* synthetic */ b2e(SettingsListScreen settingsListScreen, int i) {
        this.a = i;
        this.b = settingsListScreen;
    }

    public final Object invoke() {
        SettingsListScreen settingsListScreen = this.b;
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = SettingsListScreen.y0;
                return new e0b((Widget) settingsListScreen);
            default:
                KProperty[] kPropertyArr2 = SettingsListScreen.y0;
                hn requireActivity = settingsListScreen.requireActivity();
                return new bbg(Reflection.getOrCreateKotlinClass(GalleryResultViewModel.class), (Function0) new zb3(requireActivity, 5), (Function0) new zb3(requireActivity, 4), (Function0) new zb3(requireActivity, 6));
        }
    }
}
