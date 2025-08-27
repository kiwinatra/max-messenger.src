package kotlin.sequences;

import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class SequencesKt___SequencesKt$minus$2$iterator$1 extends Lambda implements Function1<T, Boolean> {
    final /* synthetic */ T[] $elements;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SequencesKt___SequencesKt$minus$2$iterator$1(T[] tArr) {
        super(1);
        this.$elements = tArr;
    }

    public final Boolean invoke(T t) {
        return Boolean.valueOf(ArraysKt.contains(this.$elements, t));
    }
}
