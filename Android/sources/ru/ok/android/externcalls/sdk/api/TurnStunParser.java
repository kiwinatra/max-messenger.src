package ru.ok.android.externcalls.sdk.api;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.webrtc.PeerConnection;
import ru.ok.android.api.json.JsonTypeMismatchException;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lru/ok/android/externcalls/sdk/api/TurnStunParser;", "", "<init>", "()V", "Lsp7;", "reader", "", "Lorg/webrtc/PeerConnection$IceServer;", "parseTurn", "(Lsp7;)Ljava/util/List;", "parseStun", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class TurnStunParser {
    public static final TurnStunParser INSTANCE = new TurnStunParser();

    private TurnStunParser() {
    }

    @JvmStatic
    public static final List<PeerConnection.IceServer> parseStun(sp7 sp7) throws IOException, JsonTypeMismatchException {
        ArrayList<String> arrayList = new ArrayList<>();
        sp7.t();
        while (sp7.hasNext()) {
            String name = sp7.name();
            if (name.hashCode() == 3598564 && name.equals("urls")) {
                sp7.v();
                while (sp7.hasNext()) {
                    arrayList.add(sp7.I());
                }
                sp7.u();
            } else {
                sp7.A();
            }
        }
        sp7.r();
        ArrayList arrayList2 = new ArrayList();
        for (String str : arrayList) {
            if (str.length() != 0) {
                arrayList2.add(PeerConnection.IceServer.builder(str).createIceServer());
            }
        }
        return arrayList2;
    }

    @JvmStatic
    public static final List<PeerConnection.IceServer> parseTurn(sp7 sp7) throws IOException, JsonTypeMismatchException {
        ArrayList<String> arrayList = new ArrayList<>();
        sp7.t();
        String str = null;
        String str2 = null;
        while (sp7.hasNext()) {
            String name = sp7.name();
            int hashCode = name.hashCode();
            if (hashCode != -683415465) {
                if (hashCode != -265713450) {
                    if (hashCode == 3598564 && name.equals("urls")) {
                        sp7.v();
                        while (sp7.hasNext()) {
                            arrayList.add(sp7.I());
                        }
                        sp7.u();
                    }
                } else if (name.equals("username")) {
                    str2 = sp7.g0();
                }
            } else if (name.equals("credential")) {
                str = sp7.g0();
            }
            sp7.A();
        }
        sp7.r();
        ArrayList arrayList2 = new ArrayList();
        for (String str3 : arrayList) {
            if (str3.length() != 0) {
                arrayList2.add(PeerConnection.IceServer.builder(str3).setUsername(str2).setPassword(str).setTlsCertPolicy(PeerConnection.TlsCertPolicy.TLS_CERT_POLICY_SECURE).createIceServer());
            }
        }
        return arrayList2;
    }
}
