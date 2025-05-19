package kr.dogfoot.hwpxlib.object.content.section_xml.enumtype;

import kr.dogfoot.hwpxlib.object.common.EnumGetStr;

/**
 * 보기 옵션
 */
public enum VisibilityOption implements EnumGetStr {
    /**
     * 첫 페이지에서만 감추기
     */
    HIDE_FIRST("HIDE_FIRST"),
    /**
     * 첫 페이지에만 보여주기
     */
    SHOW_FIRST("SHOW_FIRST"),
    /**
     * 모두 보여주기
     */
    SHOW_ALL("SHOW_ALL");

    private String str;

    VisibilityOption(String str) {
        this.str = str;
    }

    @Override
    public String str() {
        return str;
    }

    public static VisibilityOption fromString(String str) {
        if (str == null) return null;

        String STR = str.toUpperCase();
        for (VisibilityOption item : values()) {
            if (item.str.equals(STR)) {
                return item;
            }
        }
        return null;
    }
}
