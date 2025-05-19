package kr.dogfoot.hwpxlib.object.content.header_xml.enumtype;

import kr.dogfoot.hwpxlib.object.common.EnumGetStr;

public enum ValueUnit1 implements EnumGetStr {
    PERCENT("PERCENT"),
    HWPUNIT("HWPUNIT");

    private String str;

    ValueUnit1(String str) {
        this.str = str;
    }

    @Override
    public String str() {
        return str;
    }

    public static ValueUnit1 fromString(String str) {
        if (str == null) return null;

        String STR = str.toUpperCase();
        for (ValueUnit1 item : values()) {
            if (item.str.equals(STR)) {
                return item;
            }
        }
        return null;
    }
}
