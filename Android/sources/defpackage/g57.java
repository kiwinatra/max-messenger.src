package defpackage;

import org.json.HTTP;

/* renamed from: g57  reason: default package */
public final class g57 {
    public final h57 a;
    public final String b;

    public g57(String str, String str2, String str3, mm5 mm5) {
        this.a = mm5;
        StringBuilder sb = new StringBuilder();
        sb.append("Content-Disposition: form-data; name=");
        e57.a(sb, str);
        if (str2 != null) {
            sb.append("; filename=");
            e57.a(sb, str2);
        }
        sb.append(HTTP.CRLF);
        if (str3 != null) {
            sb.append("Content-Type: ");
            sb.append(str3);
            sb.append(HTTP.CRLF);
        }
        this.b = sb.toString();
    }
}
