package kotlin.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lkotlin/coroutines/CoroutineContext;", "acc", "element", "Lkotlin/coroutines/CoroutineContext$Element;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class CoroutineContext$plus$1 extends Lambda implements Function2<CoroutineContext, CoroutineContext.Element, CoroutineContext> {
    public static final CoroutineContext$plus$1 INSTANCE = new CoroutineContext$plus$1();

    public CoroutineContext$plus$1() {
        super(2);
    }

    public final CoroutineContext invoke(CoroutineContext coroutineContext, CoroutineContext.Element element) {
        CombinedContext combinedContext;
        CoroutineContext minusKey = coroutineContext.minusKey(element.getKey());
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        if (minusKey == emptyCoroutineContext) {
            return element;
        }
        ContinuationInterceptor.Key key = ContinuationInterceptor.Key;
        ContinuationInterceptor continuationInterceptor = (ContinuationInterceptor) minusKey.get(key);
        if (continuationInterceptor == null) {
            combinedContext = new CombinedContext(minusKey, element);
        } else {
            CoroutineContext minusKey2 = minusKey.minusKey(key);
            if (minusKey2 == emptyCoroutineContext) {
                return new CombinedContext(element, continuationInterceptor);
            }
            combinedContext = new CombinedContext(new CombinedContext(minusKey2, element), continuationInterceptor);
        }
        return combinedContext;
    }
}
