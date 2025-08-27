package defpackage;

import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: wy1  reason: default package */
public final class wy1 {
    public static final wy1 c = new wy1(CollectionsKt.toSet(new ArrayList()), (iq) null);
    public final Set a;
    public final iq b;

    public wy1(Set set, iq iqVar) {
        this.a = set;
        this.b = iqVar;
    }

    public final void a(String str, Function0 function0) {
        List<Object> emptyList = CollectionsKt.emptyList();
        Iterator it = this.a.iterator();
        if (it.hasNext()) {
            rae.w(it.next());
            throw null;
        } else if (!emptyList.isEmpty()) {
            List<X509Certificate> list = (List) function0.invoke();
            for (X509Certificate x509Certificate : list) {
                Iterator it2 = emptyList.iterator();
                if (it2.hasNext()) {
                    rae.w(it2.next());
                    throw null;
                }
            }
            StringBuilder sb = new StringBuilder("Certificate pinning failure!\n  Peer certificate chain:");
            for (X509Certificate x509Certificate2 : list) {
                sb.append("\n    ");
                sb.append(ct.E(x509Certificate2));
                sb.append(": ");
                sb.append(x509Certificate2.getSubjectDN().getName());
            }
            sb.append("\n  Pinned certificates for ");
            sb.append(str);
            sb.append(":");
            for (Object w : emptyList) {
                rae.w(w);
                sb.append("\n    null");
            }
            throw new SSLPeerUnverifiedException(sb.toString());
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wy1) {
            wy1 wy1 = (wy1) obj;
            return Intrinsics.areEqual((Object) wy1.a, (Object) this.a) && Intrinsics.areEqual((Object) wy1.b, (Object) this.b);
        }
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() + 1517) * 41;
        iq iqVar = this.b;
        return hashCode + (iqVar != null ? iqVar.hashCode() : 0);
    }
}
