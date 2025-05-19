package kr.dogfoot.hwpxlib.object.content.header_xml.enumtype;

import kr.dogfoot.hwpxlib.object.common.EnumGetStr;

public enum GradationType implements EnumGetStr {
    /**
     * 줄무늬형
     */
    LINEAR("LINEAR"),
    /**
     * 원형
     */
    RADIAL("RADIAL"),
    /**
     * 원뿔형
     */
    CONICAL("CONICAL"),
    /**
     * 사각형
     */
    SQUARE("SQUARE");

    private String str;

    GradationType(String str) {
        this.str = str;
    }

    @Override
    public String str() {
        return str;
    }

    public static GradationType fromString(String str) {
        if (str == null) return null;

        String STR = str.toUpperCase();
        for (GradationType item : values()) {
            if (item.str.equals(STR)) {
                return item;
            }
        }
        return null;
    }
}
