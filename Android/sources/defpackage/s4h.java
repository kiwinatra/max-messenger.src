package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: s4h  reason: default package */
public final class s4h {
    public static final e35 c = new e35("ReviewService");
    public final h7h a;
    public final String b;

    public s4h(Context context) {
        int length;
        String str;
        this.b = context.getPackageName();
        e35 e35 = t7h.a;
        try {
            if (!context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                e35.b("Play Store package is disabled.", new Object[0]);
                return;
            }
            try {
                Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                if (signatureArr == null || (length = signatureArr.length) == 0) {
                    e35.b("Play Store package is not signed -- possibly self-built package. Could not verify.", new Object[0]);
                    return;
                }
                ArrayList arrayList = new ArrayList();
                int i = 0;
                while (i < length) {
                    byte[] byteArray = signatureArr[i].toByteArray();
                    try {
                        MessageDigest instance = MessageDigest.getInstance("SHA-256");
                        instance.update(byteArray);
                        str = Base64.encodeToString(instance.digest(), 11);
                    } catch (NoSuchAlgorithmException unused) {
                        str = "";
                    }
                    arrayList.add(str);
                    if (!"8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(str)) {
                        String str2 = Build.TAGS;
                        if ((!str2.contains("dev-keys") && !str2.contains("test-keys")) || !"GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(str)) {
                            i++;
                        }
                    }
                    this.a = new h7h(context, c, new Intent("com.google.android.finsky.BIND_IN_APP_REVIEW_SERVICE").setPackage("com.android.vending"));
                    return;
                }
                StringBuilder sb = new StringBuilder();
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    while (true) {
                        sb.append((CharSequence) it.next());
                        if (!it.hasNext()) {
                            break;
                        }
                        sb.append(", ");
                    }
                }
                e35.b(wj6.k("Play Store package certs are not valid. Found these sha256 certs: [", sb.toString(), "]."), new Object[0]);
            } catch (PackageManager.NameNotFoundException unused2) {
                e35.b("Play Store package is not found.", new Object[0]);
            }
        } catch (PackageManager.NameNotFoundException unused3) {
            e35.b("Play Store package is not found.", new Object[0]);
        }
    }
}
