package defpackage;

import android.opengl.GLES20;
import java.util.LinkedList;

/* renamed from: fk6  reason: default package */
public class fk6 {
    public final LinkedList a = new LinkedList();
    public final String b = "attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}";
    public final String c;
    public int d;
    public int e;
    public int f;
    public int g;
    public boolean h;

    public fk6(String str) {
        this.c = str;
    }

    public void a() {
        int[] iArr = new int[1];
        int[] iArr2 = new int[1];
        int glCreateShader = GLES20.glCreateShader(35633);
        GLES20.glShaderSource(glCreateShader, this.b);
        GLES20.glCompileShader(glCreateShader);
        int i = 0;
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr2, 0);
        if (iArr2[0] == 0) {
            GLES20.glGetShaderInfoLog(glCreateShader);
            glCreateShader = 0;
        }
        if (glCreateShader != 0) {
            int[] iArr3 = new int[1];
            int glCreateShader2 = GLES20.glCreateShader(35632);
            GLES20.glShaderSource(glCreateShader2, this.c);
            GLES20.glCompileShader(glCreateShader2);
            GLES20.glGetShaderiv(glCreateShader2, 35713, iArr3, 0);
            if (iArr3[0] == 0) {
                GLES20.glGetShaderInfoLog(glCreateShader2);
                glCreateShader2 = 0;
            }
            if (glCreateShader2 != 0) {
                int glCreateProgram = GLES20.glCreateProgram();
                GLES20.glAttachShader(glCreateProgram, glCreateShader);
                GLES20.glAttachShader(glCreateProgram, glCreateShader2);
                GLES20.glLinkProgram(glCreateProgram);
                GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
                if (iArr[0] > 0) {
                    GLES20.glDeleteShader(glCreateShader);
                    GLES20.glDeleteShader(glCreateShader2);
                    i = glCreateProgram;
                }
            }
        }
        this.d = i;
        this.e = GLES20.glGetAttribLocation(i, "position");
        this.f = GLES20.glGetUniformLocation(this.d, "inputImageTexture");
        this.g = GLES20.glGetAttribLocation(this.d, "inputTextureCoordinate");
        this.h = true;
    }

    public void b(int i, int i2) {
    }

    public final void c(Runnable runnable) {
        synchronized (this.a) {
            this.a.addLast(runnable);
        }
    }
}
