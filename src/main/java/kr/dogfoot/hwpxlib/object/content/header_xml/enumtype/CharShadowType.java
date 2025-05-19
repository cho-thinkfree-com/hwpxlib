package kr.dogfoot.hwpxlib.object.content.header_xml.enumtype;

import kr.dogfoot.hwpxlib.object.common.EnumGetStr;

public enum CharShadowType implements EnumGetStr {
    NONE("NONE"),
    DROP("DROP"),
    CONTINUOUS("CONTINUOUS");

    private String str;

    CharShadowType(String str) {
        this.str = str;
    }

    @Override
    public String str() {
        return str;
    }

    public static CharShadowType fromString(String str) {
        if (str == null) return null;

        String STR = str.toUpperCase();
        for (CharShadowType item : values()) {
            if (item.str.equals(STR)) {
                return item;
            }
        }
        return null;
    }
}

