package colorcoder;

import colorcoder.utils.ColorUtils;
import colorcoder.models.ColorPair;
import colorcoder.enums.MajorColor;
import colorcoder.enums.MinorColor;

public class Main {
    public static void main(String[] args) {
        ColorUtils.testNumberToPair(4, MajorColor.WHITE, MinorColor.BROWN);
        ColorUtils.testNumberToPair(5, MajorColor.WHITE, MinorColor.SLATE);
    
        ColorUtils.testPairToNumber(MajorColor.BLACK, MinorColor.ORANGE, 12);
        ColorUtils.testPairToNumber(MajorColor.VIOLET, MinorColor.SLATE, 25);
    }
}
