package defpackage;

import android.widget.CompoundButton;
import com.google.android.material.chip.Chip;
import one.me.sdk.uikit.common.views.OneMeContactsChipGroup;

/* renamed from: ura  reason: default package */
public final /* synthetic */ class ura implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ OneMeContactsChipGroup a;
    public final /* synthetic */ Chip b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long o;
    public final /* synthetic */ CharSequence v;
    public final /* synthetic */ String w;

    public /* synthetic */ ura(OneMeContactsChipGroup oneMeContactsChipGroup, Chip chip, long j, long j2, CharSequence charSequence, String str) {
        this.a = oneMeContactsChipGroup;
        this.b = chip;
        this.c = j;
        this.o = j2;
        this.v = charSequence;
        this.w = str;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = OneMeContactsChipGroup.F0;
        this.a.b(this.b, z, this.c, this.o, this.v, this.w);
    }
}
