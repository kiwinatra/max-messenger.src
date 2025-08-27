package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;

/* renamed from: b10  reason: default package */
public enum b10 {
    UNKNOWN("UNKNOWN"),
    CONTROL("CONTROL"),
    PHOTO("PHOTO"),
    VIDEO("VIDEO"),
    AUDIO("AUDIO"),
    STICKER("STICKER"),
    SHARE("SHARE"),
    APP("APP"),
    CALL("CALL"),
    FILE("FILE"),
    CONTACT("CONTACT"),
    PRESENT("PRESENT"),
    INLINE_KEYBOARD("INLINE_KEYBOARD"),
    LOCATION("LOCATION"),
    REPLY_KEYBOARD("REPLY_KEYBOARD");
    
    public static final HashSet A0 = null;
    public static final HashSet B0 = null;
    public static final HashSet C0 = null;
    public static final HashSet D0 = null;
    public static final HashSet E0 = null;
    public static final HashSet F0 = null;
    public static final HashSet z0 = null;
    public final String a;

    static {
        b10 b10;
        b10 b102;
        b10 b103;
        b10 b104;
        b10 b105;
        b10 b106;
        b10 b107 = b105;
        b10 b108 = b104;
        b10 b109 = b103;
        b10 b1010 = b102;
        b10 b1011 = b10;
        z0 = new HashSet(Arrays.asList(new b10[]{b1011, b1010, b109, b108, b107}));
        A0 = new HashSet(Arrays.asList(new b10[]{b1011, b1010}));
        B0 = new HashSet(Collections.singletonList(b108));
        ArrayList arrayList = new ArrayList(1);
        Object obj = new Object[]{b107}[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        C0 = new HashSet(Collections.unmodifiableList(arrayList));
        D0 = new HashSet(Collections.singletonList(b109));
        E0 = new HashSet(Collections.singletonList(b107));
        F0 = new HashSet(Collections.singletonList(b106));
    }

    /* access modifiers changed from: public */
    b10(String str) {
        this.a = str;
    }

    public static b10 a(String str) {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1611296843:
                if (str.equals("LOCATION")) {
                    c = 0;
                    break;
                }
                break;
            case -1172269795:
                if (str.equals("STICKER")) {
                    c = 1;
                    break;
                }
                break;
            case -113354035:
                if (str.equals("INLINE_KEYBOARD")) {
                    c = 2;
                    break;
                }
                break;
            case 65025:
                if (str.equals("APP")) {
                    c = 3;
                    break;
                }
                break;
            case 2060894:
                if (str.equals("CALL")) {
                    c = 4;
                    break;
                }
                break;
            case 2157948:
                if (str.equals("FILE")) {
                    c = 5;
                    break;
                }
                break;
            case 62628790:
                if (str.equals("AUDIO")) {
                    c = 6;
                    break;
                }
                break;
            case 76105234:
                if (str.equals("PHOTO")) {
                    c = 7;
                    break;
                }
                break;
            case 78862271:
                if (str.equals("SHARE")) {
                    c = 8;
                    break;
                }
                break;
            case 81665115:
                if (str.equals("VIDEO")) {
                    c = 9;
                    break;
                }
                break;
            case 399705243:
                if (str.equals("PRESENT")) {
                    c = 10;
                    break;
                }
                break;
            case 1669509120:
                if (str.equals("CONTACT")) {
                    c = 11;
                    break;
                }
                break;
            case 1669525821:
                if (str.equals("CONTROL")) {
                    c = 12;
                    break;
                }
                break;
            case 2103311804:
                if (str.equals("REPLY_KEYBOARD")) {
                    c = 13;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return LOCATION;
            case 1:
                return STICKER;
            case 2:
                return INLINE_KEYBOARD;
            case 3:
                return APP;
            case 4:
                return CALL;
            case 5:
                return FILE;
            case 6:
                return AUDIO;
            case 7:
                return PHOTO;
            case 8:
                return SHARE;
            case 9:
                return VIDEO;
            case 10:
                return PRESENT;
            case 11:
                return CONTACT;
            case 12:
                return CONTROL;
            case 13:
                return REPLY_KEYBOARD;
            default:
                return UNKNOWN;
        }
    }
}
