package org.apache.http.message;

import org.apache.http.HeaderElement;
import org.apache.http.NameValuePair;
import org.apache.http.util.CharArrayBuffer;
import org.apache.http.util.LangUtils;

@Deprecated
public class BasicHeaderElement implements HeaderElement, Cloneable {
    private final String name;
    private final NameValuePair[] parameters;
    private final String value;

    public BasicHeaderElement(String str, String str2, NameValuePair[] nameValuePairArr) {
        if (str != null) {
            this.name = str;
            this.value = str2;
            if (nameValuePairArr != null) {
                this.parameters = nameValuePairArr;
            } else {
                this.parameters = new NameValuePair[0];
            }
        } else {
            throw new IllegalArgumentException("Name may not be null");
        }
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HeaderElement)) {
            return false;
        }
        BasicHeaderElement basicHeaderElement = (BasicHeaderElement) obj;
        return this.name.equals(basicHeaderElement.name) && LangUtils.equals((Object) this.value, (Object) basicHeaderElement.value) && LangUtils.equals((Object[]) this.parameters, (Object[]) basicHeaderElement.parameters);
    }

    public String getName() {
        return this.name;
    }

    public NameValuePair getParameter(int i) {
        return this.parameters[i];
    }

    public NameValuePair getParameterByName(String str) {
        if (str != null) {
            int i = 0;
            while (true) {
                NameValuePair[] nameValuePairArr = this.parameters;
                if (i >= nameValuePairArr.length) {
                    return null;
                }
                NameValuePair nameValuePair = nameValuePairArr[i];
                if (nameValuePair.getName().equalsIgnoreCase(str)) {
                    return nameValuePair;
                }
                i++;
            }
        } else {
            throw new IllegalArgumentException("Name may not be null");
        }
    }

    public int getParameterCount() {
        return this.parameters.length;
    }

    public NameValuePair[] getParameters() {
        return (NameValuePair[]) this.parameters.clone();
    }

    public String getValue() {
        return this.value;
    }

    public int hashCode() {
        int hashCode = LangUtils.hashCode(LangUtils.hashCode(17, (Object) this.name), (Object) this.value);
        int i = 0;
        while (true) {
            NameValuePair[] nameValuePairArr = this.parameters;
            if (i >= nameValuePairArr.length) {
                return hashCode;
            }
            hashCode = LangUtils.hashCode(hashCode, (Object) nameValuePairArr[i]);
            i++;
        }
    }

    public String toString() {
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(64);
        charArrayBuffer.append(this.name);
        if (this.value != null) {
            charArrayBuffer.append("=");
            charArrayBuffer.append(this.value);
        }
        for (NameValuePair append : this.parameters) {
            charArrayBuffer.append("; ");
            charArrayBuffer.append((Object) append);
        }
        return charArrayBuffer.toString();
    }

    public BasicHeaderElement(String str, String str2) {
        this(str, str2, (NameValuePair[]) null);
    }
}
