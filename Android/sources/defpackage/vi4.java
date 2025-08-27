package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;

/* renamed from: vi4  reason: default package */
public final class vi4 extends scf {
    public static final vi4 f0;

    static {
        int i = (int) 4285103359L;
        int i2 = (int) 4294967295L;
        int i3 = (int) 4278190080L;
        int i4 = (int) 4281545540L;
        int i5 = (int) 4284177257L;
        int i6 = i5;
        int i7 = i5;
        int i8 = i5;
        int i9 = (int) 4294309365L;
        int i10 = i9;
        int i11 = (int) 4293717228L;
        int i12 = i;
        int i13 = i2;
        int i14 = i2;
        int i15 = i3;
        int i16 = (int) 4285106400L;
        int i17 = i2;
        int i18 = i4;
        int i19 = i2;
        int i20 = i4;
        int i21 = i2;
        int i22 = i3;
        int i23 = i2;
        int i24 = i;
        f0 = new scf("TamTam Default", "TamTam Team", false, 1, "DEFAULT", new x53(i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i6, i7, i9, (int) 4294917951L, (int) 4294688829L, i11, i23, (int) 4294111986L, (int) 4292343228L, (int) 4290571153L, (int) 4280427042L, i24, i10, i11, i8, (int) 4293454056L, (int) 4290625485L, (int) 4288256409L, i2, (int) 4279286791L, (int) 4288521391L, i2, i2, i4, (int) 4284177256L, (int) 4282861399L, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 992), nfd.v, nfd.o, nfd.c);
    }

    public final Uri b(Context context) {
        Resources resources = context.getResources();
        int i = kfc.bg_001;
        String resourcePackageName = resources.getResourcePackageName(i);
        String resourceTypeName = resources.getResourceTypeName(i);
        String resourceEntryName = resources.getResourceEntryName(i);
        StringBuilder r = rae.r("android.resource://", resourcePackageName, "/", resourceTypeName, "/");
        r.append(resourceEntryName);
        return Uri.parse(r.toString());
    }
}
