package one.me.rlottie.network;

import java.io.IOException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lone/me/rlottie/network/LottieNetworkFetcher;", "", "fetch", "Lone/me/rlottie/network/LottieFetchCall;", "url", "", "rlottie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface LottieNetworkFetcher {
    LottieFetchCall fetch(String str) throws IOException;
}
