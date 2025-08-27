package kotlin.sequences;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class SequencesKt___SequencesKt$minus$4$iterator$1 extends Lambda implements Function1<T, Boolean> {
    final /* synthetic */ List<T> $other;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SequencesKt___SequencesKt$minus$4$iterator$1(List<? extends T> list) {
        super(1);
        this.$other = list;
    }

    public final Boolean invoke(T t) {
        return Boolean.valueOf(this.$other.contains(t));
    }
}
