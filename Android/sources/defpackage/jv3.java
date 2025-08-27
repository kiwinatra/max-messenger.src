package defpackage;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.List;

/* renamed from: jv3  reason: default package */
public final class jv3 implements iv3, kv3 {
    public final /* synthetic */ int a;
    public Object b;
    public int c;
    public int o;
    public Comparable v;
    public Object w;

    public /* synthetic */ jv3() {
        this.a = 0;
    }

    public static String f(hp5 hp5) {
        hp5.a();
        rp5 rp5 = hp5.c;
        String str = rp5.e;
        if (str != null) {
            return str;
        }
        hp5.a();
        String str2 = rp5.b;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] split = str2.split(":");
        if (split.length < 2) {
            return null;
        }
        String str3 = split[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    public void a(Uri uri) {
        this.v = uri;
    }

    public ClipData b() {
        return (ClipData) this.b;
    }

    public lv3 build() {
        return new lv3(new jv3(this));
    }

    public void c(ClipData clipData) {
        this.b = clipData;
    }

    public synchronized String d() {
        try {
            if (((String) this.v) == null) {
                h();
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return (String) this.v;
    }

    public Uri e() {
        return (Uri) this.v;
    }

    public boolean g() {
        int i;
        synchronized (this) {
            i = this.o;
            if (i == 0) {
                PackageManager packageManager = ((Context) this.b).getPackageManager();
                if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                    i = 0;
                } else {
                    Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
                    intent.setPackage("com.google.android.gms");
                    List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
                    if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
                        this.o = 2;
                    } else {
                        this.o = 2;
                    }
                    i = 2;
                }
            }
        }
        return i != 0;
    }

    public Bundle getExtras() {
        return (Bundle) this.w;
    }

    public int getFlags() {
        return this.o;
    }

    public synchronized void h() {
        PackageInfo packageInfo;
        try {
            packageInfo = ((Context) this.b).getPackageManager().getPackageInfo(((Context) this.b).getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e) {
            e.toString();
            packageInfo = null;
        }
        if (packageInfo != null) {
            this.v = Integer.toString(packageInfo.versionCode);
            this.w = packageInfo.versionName;
        }
    }

    public ContentInfo i() {
        return null;
    }

    public int l() {
        return this.c;
    }

    public void setExtras(Bundle bundle) {
        this.w = bundle;
    }

    public void setFlags(int i) {
        this.o = i;
    }

    public String toString() {
        String str;
        switch (this.a) {
            case 1:
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(((ClipData) this.b).getDescription());
                sb.append(", source=");
                int i = this.c;
                sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                sb.append(", flags=");
                int i2 = this.o;
                sb.append((i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2));
                String str2 = "";
                Uri uri = (Uri) this.v;
                if (uri == null) {
                    str = str2;
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                if (((Bundle) this.w) != null) {
                    str2 = ", hasExtras";
                }
                return wj6.n(sb, str2, "}");
            default:
                return super.toString();
        }
    }

    public jv3(Context context) {
        this.a = 2;
        this.o = 0;
        this.b = context;
    }

    public jv3(jv3 jv3) {
        this.a = 1;
        ClipData clipData = (ClipData) jv3.b;
        clipData.getClass();
        this.b = clipData;
        int i = jv3.c;
        bs0.o(i, "source", 0, 5);
        this.c = i;
        int i2 = jv3.o;
        if ((i2 & 1) == i2) {
            this.o = i2;
            this.v = (Uri) jv3.v;
            this.w = (Bundle) jv3.w;
            return;
        }
        throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i2) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
    }
}
