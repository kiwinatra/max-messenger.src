package defpackage;

import kotlin.text.Charsets;

/* renamed from: a  reason: default package */
public abstract class a {
    public static final byte[] a;

    static {
        vw0 vw0 = new vw0("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".getBytes(Charsets.UTF_8));
        vw0.b = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";
        a = vw0.c;
        new vw0("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_".getBytes(Charsets.UTF_8)).b = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_";
    }
}
