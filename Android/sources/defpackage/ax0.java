package defpackage;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* renamed from: ax0  reason: default package */
public final class ax0 implements i55 {
    public static final String c;
    public static final Set d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new l65[]{new l65("proto"), new l65("json")})));
    public static final ax0 e;
    public static final ax0 f;
    public final String a;
    public final String b;

    static {
        String x = y64.x("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        c = x;
        String x2 = y64.x("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String x3 = y64.x("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        e = new ax0(x, (String) null);
        f = new ax0(x2, x3);
    }

    public ax0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public static ax0 a(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (str.startsWith("1$")) {
            String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
            if (split.length == 2) {
                String str2 = split[0];
                if (!str2.isEmpty()) {
                    String str3 = split[1];
                    if (str3.isEmpty()) {
                        str3 = null;
                    }
                    return new ax0(str2, str3);
                }
                throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
            }
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        throw new IllegalArgumentException("Version marker missing from extras");
    }
}
