package ru.ok.android.externcalls.sdk.id.mapping;

import java.util.Collection;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u001e\n\u0000\bæ\u0001\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0006\b\u0001\u0010\u0002 \u00012\u00020\u0003J\"\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H'ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/id/mapping/IdsMapper;", "From", "To", "", "map", "", "from", "", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface IdsMapper<From, To> {
    Map<From, To> map(Collection<? extends From> collection);
}
