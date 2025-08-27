package org.apache.http.message;

import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.ParseException;
import org.apache.http.util.CharArrayBuffer;

@Deprecated
public class BasicHeader implements Header, Cloneable {
    private final String name;
    private final String value;

    public BasicHeader(String str, String str2) {
        if (str != null) {
            this.name = str;
            this.value = str2;
            return;
        }
        throw new IllegalArgumentException("Name may not be null");
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public HeaderElement[] getElements() throws ParseException {
        String str = this.value;
        return str != null ? BasicHeaderValueParser.parseElements(str, (HeaderValueParser) null) : new HeaderElement[0];
    }

    public String getName() {
        return this.name;
    }

    public String getValue() {
        return this.value;
    }

    public String toString() {
        return BasicLineFormatter.DEFAULT.formatHeader((CharArrayBuffer) null, (Header) this).toString();
    }
}
