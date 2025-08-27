package defpackage;

import java.util.BitSet;
import kotlin.text.StringsKt;

/* renamed from: g1e  reason: default package */
public final class g1e extends j3h {
    public final String toString() {
        BitSet bitSet = (BitSet) this.a;
        boolean z = bitSet.get(0);
        boolean z2 = bitSet.get(1);
        boolean z3 = bitSet.get(2);
        boolean z4 = bitSet.get(3);
        boolean z5 = bitSet.get(4);
        boolean z6 = bitSet.get(5);
        boolean z7 = bitSet.get(6);
        boolean z8 = bitSet.get(7);
        boolean z9 = bitSet.get(4);
        return StringsKt.trimIndent("\n            Payload(\n                isSectionChanged=" + z + ",\n                isTitleChanged=" + z2 + ",\n                isTypeChanged=" + z3 + ",\n                isDescriptionResChanged=" + z4 + ",\n                isStartIconResChanged=" + z5 + ",\n                isEndViewChanged=" + z6 + ",\n                isCounterTypeChanged=" + z7 + ",\n                isUpperTextChanged=" + z8 + "\n                isStartIconPaddingChanged=" + z9 + "\n            )\n        ");
    }
}
