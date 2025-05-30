package kr.dogfoot.hwpxlib.object.content.section_xml.enumtype;

import kr.dogfoot.hwpxlib.object.common.EnumGetStr;

public enum TextArtShape implements EnumGetStr {
    PARALLELOGRAM("PARALLELOGRAM"),
    INVERTED_PARALLELOGRAM("INVERTED_PARALLELOGRAM"),
    INVERTED_UPWARD_CASCADE("INVERTED_UPWARD_CASCADE"),
    INVERTED_DOWNWARD_CASCADE("INVERTED_DOWNWARD_CASCADE"),
    UPWARD_CASCADE("UPWARD_CASCADE"),
    DOWNWARD_CASCADE("DOWNWARD_CASCADE"),
    REDUCE_RIGHT("REDUCE_RIGHT"),
    REDUCE_LEFT("REDUCE_LEFT"),
    ISOSCELES_TRAPEZOID("ISOSCELES_TRAPEZOID"),
    INVERTED_ISOSCELES_TRAPEZOID("INVERTED_ISOSCELES_TRAPEZOID"),
    TOP_RIBBON_RECTANGLE("TOP_RIBBON_RECTANGLE"),
    BOTTOM_RIBBON_RECTANGLE("BOTTOM_RIBBON_RECTANGLE"),
    CHEVRON_DOWN("CHEVRON_DOWN"),
    CHEVRON("CHEVRON"),
    BOW_TIE("BOW_TIE"),
    HEXAGON("HEXAGON"),
    WAVE1("WAVE1"),
    WAVE2("WAVE2"),
    WAVE3("WAVE3"),
    WAVE4("WAVE4"),
    LEFT_TILT_CYLINDER("LEFT_TILT_CYLINDER"),
    RIGHT_TILT_CYLINDER("RIGHT_TILT_CYLINDER"),
    BOTTOM_WIDE_CYLINDER("BOTTOM_WIDE_CYLINDER"),
    TOP_WIDE_CYLINDER("TOP_WIDE_CYLINDER"),
    THIN_CURVE_UP1("THIN_CURVE_UP1"),
    THIN_CURVE_UP2("THIN_CURVE_UP2"),
    THIN_CURVE_DOWN1("THIN_CURVE_DOWN1"),
    THIN_CURVE_DOWN2("THIN_CURVE_DOWN2"),
    INVERSED_FINGERNAIL("INVERSED_FINGERNAIL"),
    FINGERNAIL("FINGERNAIL"),
    GINKO_LEAF1("GINKO_LEAF1"),
    GINKO_LEAF2("GINKO_LEAF2"),
    INFLATE_RIGHT("INFLATE_RIGHT"),
    INFLATE_LEFT("INFLATE_LEFT"),
    INFLATE_UP_CONVEX("INFLATE_UP_CONVEX"),
    INFLATE_BOTTOM_CONVEX("INFLATE_BOTTOM_CONVEX"),
    DEFLATE_TOP("DEFLATE_TOP"),
    DEFLATE_BOTTOM("DEFLATE_BOTTOM"),
    DEFLATE("DEFLATE"),
    INFLATE("INFLATE"),
    INFLATE_TOP("INFLATE_TOP"),
    INFLATE_BOTTOM("INFLATE_BOTTOM"),
    RECTANGLE("RECTANGLE"),
    LEFT_CYLINDER("LEFT_CYLINDER"),
    CYLINDER("CYLINDER"),
    RIGHT_CYLINDER("RIGHT_CYLINDER"),
    CIRCLE("CIRCLE"),
    CURVE_DOWN("CURVE_DOWN"),
    ARCH_UP("ARCH_UP"),
    ARCH_DOWN("ARCH_DOWN"),
    SINGLE_LINE_CIRCLE1("SINGLE_LINE_CIRCLE1"),
    SINGLE_LINE_CIRCLE2("SINGLE_LINE_CIRCLE2"),
    TRIPLE_LINE_CIRCLE1("TRIPLE_LINE_CIRCLE1"),
    TRIPLE_LINE_CIRCLE2("TRIPLE_LINE_CIRCLE2"),
    DOUBLE_LINE_CIRCLE("DOUBLE_LINE_CIRCLE");

    private String str;

    TextArtShape(String str) {
        this.str = str;
    }

    @Override
    public String str() {
        return str;
    }

    public static TextArtShape fromString(String str) {
        if (str == null) return null;

        String STR = str.toUpperCase();
        for (TextArtShape item : values()) {
            if (item.str.equals(STR)) {
                return item;
            }
        }
        return null;
    }
}
