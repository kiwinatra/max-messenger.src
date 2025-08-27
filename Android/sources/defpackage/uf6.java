package defpackage;

import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import ru.ok.messages.settings.FrgAppearanceSettings;

/* renamed from: uf6  reason: default package */
public final /* synthetic */ class uf6 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrgAppearanceSettings b;

    public /* synthetic */ uf6(FrgAppearanceSettings frgAppearanceSettings, int i) {
        this.a = i;
        this.b = frgAppearanceSettings;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return this.b.T1;
            case 1:
                FrgAppearanceSettings frgAppearanceSettings = this.b;
                frgAppearanceSettings.getClass();
                return new j2b(LazyKt.lazy(new uf6(frgAppearanceSettings, 0)), frgAppearanceSettings.O1(), (ltb) null, LazyKt.lazy(new a46(14)));
            case 2:
                return this.b.T1;
            case 3:
                FrgAppearanceSettings frgAppearanceSettings2 = this.b;
                frgAppearanceSettings2.getClass();
                return new j2b(LazyKt.lazy(new uf6(frgAppearanceSettings2, 5)), frgAppearanceSettings2.O1(), (ltb) null, LazyKt.lazy(new a46(13)));
            case 4:
                return this.b.U1;
            default:
                return this.b.U1;
        }
    }
}
