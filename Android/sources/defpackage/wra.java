package defpackage;

import com.google.android.material.chip.Chip;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import one.me.sdk.uikit.common.views.OneMeContactsChipGroup;

/* renamed from: wra  reason: default package */
public final /* synthetic */ class wra implements Function0 {
    public final /* synthetic */ OneMeContactsChipGroup a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Chip c;

    public /* synthetic */ wra(OneMeContactsChipGroup oneMeContactsChipGroup, long j, Chip chip) {
        this.a = oneMeContactsChipGroup;
        this.b = j;
        this.c = chip;
    }

    public final Object invoke() {
        OneMeContactsChipGroup oneMeContactsChipGroup = this.a;
        xra xra = oneMeContactsChipGroup.x0;
        if (xra != null) {
            xra.x(this.b);
        }
        oneMeContactsChipGroup.removeView(this.c);
        return Unit.INSTANCE;
    }
}
