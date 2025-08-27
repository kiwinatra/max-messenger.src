package defpackage;

import android.widget.CompoundButton;
import com.google.android.material.chip.Chip;

/* renamed from: lpc  reason: default package */
public final /* synthetic */ class lpc implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ npc a;
    public final /* synthetic */ Chip b;
    public final /* synthetic */ int c;

    public /* synthetic */ lpc(npc npc, Chip chip, int i) {
        this.a = npc;
        this.b = chip;
        this.c = i;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.a.b(this.b, z, this.c);
    }
}
