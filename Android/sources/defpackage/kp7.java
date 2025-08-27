package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import kotlin.jvm.internal.IntCompanionObject;
import org.apache.http.HttpStatus;
import ru.ok.android.api.json.JsonSyntaxException;

/* renamed from: kp7  reason: default package */
public final class kp7 implements Closeable {
    public final Reader a;
    public int b = IntCompanionObject.MIN_VALUE;
    public final char[] c = new char[32];
    public int o;

    public kp7(InputStreamReader inputStreamReader) {
        this.a = inputStreamReader;
    }

    public final int U() {
        int o2 = o();
        if (o2 == -1) {
            return 0;
        }
        int i = 34;
        if (o2 != 34) {
            i = 91;
            if (o2 != 91) {
                i = 93;
                if (o2 != 93) {
                    if (o2 == 102) {
                        return 98;
                    }
                    int i2 = 110;
                    if (o2 != 110) {
                        if (o2 == 116) {
                            return 98;
                        }
                        i2 = 123;
                        if (o2 != 123) {
                            i2 = 125;
                            if (o2 != 125) {
                                i2 = 44;
                                if (o2 != 44) {
                                    if (o2 == 45) {
                                        return 49;
                                    }
                                    switch (o2) {
                                        case 48:
                                        case 49:
                                        case 50:
                                        case 51:
                                        case 52:
                                        case 53:
                                        case 54:
                                        case 55:
                                        case 56:
                                        case 57:
                                            return 49;
                                        case 58:
                                            return 58;
                                        default:
                                            throw JsonSyntaxException.a(this.b, m(), (long) this.o);
                                    }
                                }
                            }
                        }
                    }
                    return i2;
                }
            }
        }
        return i;
    }

    public final void a(Appendable appendable) {
        int n;
        String str;
        int i;
        Appendable appendable2 = appendable;
        int o2 = o();
        if (o2 == -1) {
            throw new IllegalStateException("EOF");
        } else if (o2 != 34) {
            if (!(o2 == 91 || o2 == 93 || o2 == 102 || o2 == 110 || o2 == 116 || o2 == 123 || o2 == 125 || o2 == 44)) {
                if (o2 != 45) {
                    switch (o2) {
                        case 48:
                        case 49:
                        case 50:
                        case 51:
                        case 52:
                        case 53:
                        case 54:
                        case 55:
                        case 56:
                        case 57:
                            break;
                        case 58:
                            break;
                        default:
                            throw JsonSyntaxException.a(this.b, m(), (long) this.o);
                    }
                }
                int i2 = this.b;
                if (i2 == 45) {
                    appendable2.append((char) i2);
                    i2 = n();
                }
                if (i2 == 48) {
                    appendable2.append((char) i2);
                    i = n();
                } else if (i2 < 49 || i2 > 57) {
                    throw JsonSyntaxException.a(i2, m(), (long) this.o);
                } else {
                    appendable2.append((char) i2);
                    i = n();
                    while (i >= 48 && i <= 57) {
                        appendable2.append((char) i);
                        i = n();
                    }
                }
                if (i == 46) {
                    appendable2.append((char) i);
                    int n2 = n();
                    if (n2 < 48 || n2 > 57) {
                        throw JsonSyntaxException.a(n2, m(), (long) this.o);
                    }
                    appendable2.append((char) n2);
                    int n3 = n();
                    while (i >= 48 && i <= 57) {
                        appendable2.append((char) i);
                        n3 = n();
                    }
                }
                if (i == 101 || i == 69) {
                    appendable2.append((char) i);
                    int n4 = n();
                    if (n4 == 43 || n4 == 45) {
                        appendable2.append((char) n4);
                        n4 = n();
                    }
                    if (n4 < 48 || n4 > 57) {
                        throw JsonSyntaxException.a(n4, m(), (long) this.o);
                    }
                    appendable2.append((char) n4);
                    int n5 = n();
                    while (i >= 48 && i <= 57) {
                        appendable2.append((char) i);
                        n5 = n();
                    }
                }
                if (i == 9 || i == 10 || i == 13 || i == 32) {
                    this.b = IntCompanionObject.MIN_VALUE;
                    return;
                } else {
                    this.b = i;
                    return;
                }
            }
            int i3 = this.b;
            if (i3 == 44) {
                str = ",";
            } else if (i3 == 58) {
                str = ":";
            } else if (i3 == 91) {
                str = "[";
            } else if (i3 == 93) {
                str = "]";
            } else if (i3 == 102) {
                d(97);
                d(108);
                d(115);
                d(HttpStatus.SC_SWITCHING_PROTOCOLS);
                str = "false";
            } else if (i3 == 110) {
                d(117);
                d(108);
                d(108);
                str = "null";
            } else if (i3 == 116) {
                d(114);
                d(117);
                d(HttpStatus.SC_SWITCHING_PROTOCOLS);
                str = "true";
            } else if (i3 == 123) {
                str = "{";
            } else if (i3 == 125) {
                str = "}";
            } else {
                throw new AssertionError();
            }
            this.b = IntCompanionObject.MIN_VALUE;
            appendable2.append(str);
        } else {
            appendable2.append((char) this.b);
            loop3:
            while (true) {
                int n6 = n();
                if (n6 > 31) {
                    appendable2.append((char) n6);
                    if (n6 == 34) {
                        this.b = IntCompanionObject.MIN_VALUE;
                        return;
                    } else if (n6 == 92) {
                        int n7 = n();
                        if (n7 != 34 && n7 != 47 && n7 != 92 && n7 != 98 && n7 != 102 && n7 != 110) {
                            if (!(n7 == 114 || n7 == 116)) {
                                if (n7 == 117) {
                                    appendable2.append((char) n7);
                                    for (int i4 = 0; i4 < 4; i4++) {
                                        n = n();
                                        if (n < 48 || n > 57) {
                                            if ((n < 97 || n > 102) && (n < 65 || n > 70)) {
                                            }
                                        }
                                        appendable2.append((char) n);
                                    }
                                    continue;
                                } else {
                                    throw JsonSyntaxException.a(n7, m(), (long) this.o);
                                }
                            }
                        }
                        appendable2.append((char) n7);
                    }
                } else {
                    throw JsonSyntaxException.a(n6, m(), (long) this.o);
                }
            }
            throw JsonSyntaxException.a(n, m(), (long) this.o);
        }
    }

    public final void b(int i) {
        int U = U();
        if (U != i) {
            throw JsonSyntaxException.b(U, m(), (long) this.o);
        }
    }

    public final void close() {
        this.b = IntCompanionObject.MIN_VALUE;
        this.a.close();
    }

    public final void d(int i) {
        int n = n();
        if (n != i) {
            throw JsonSyntaxException.a(n, m(), (long) this.o);
        }
    }

    public final String m() {
        StringBuilder sb = new StringBuilder(32);
        int i = this.o;
        char[] cArr = this.c;
        if (i < 32) {
            sb.append(cArr, 0, i);
        } else {
            int i2 = i % 32;
            sb.append(cArr, i2, 32 - i2);
            sb.append(cArr, 0, i2);
        }
        return sb.toString();
    }

    public final int n() {
        try {
            int read = this.a.read();
            if (read != -1) {
                char[] cArr = this.c;
                int i = this.o;
                cArr[i % 32] = (char) read;
                this.o = i + 1;
            }
            return read;
        } catch (IOException e) {
            this.b = IntCompanionObject.MIN_VALUE;
            throw e;
        }
    }

    public final int o() {
        int n;
        int i = this.b;
        if (i >= -1) {
            return i;
        }
        while (true) {
            n = n();
            if (!(n == 9 || n == 10 || n == 13 || n == 32)) {
                if (n == 65279 && this.o == 1) {
                }
            }
        }
        this.b = n;
        return n;
    }
}
