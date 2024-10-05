package colorcoder;

import colorcoder.MajorColor;
import colorcoder.MinorColor;
import colorcoder.ColorUtils;

public class ColorPair {
    private MajorColor majorColor;
    private MinorColor minorColor;
    
    public ColorPair(MajorColor major, MinorColor minor) {
        majorColor = major;
        minorColor = minor;
    }

    public MajorColor getMajor() {
        return majorColor;
    }

    public MinorColor getMinor() {
        return minorColor;
    }

    public String toString() {
        String colorPairStr = ColorUtils.MajorColorNames[majorColor.getIndex()];
        colorPairStr += " ";
        colorPairStr += ColorUtils.MinorColorNames[minorColor.getIndex()];
        return colorPairStr;
    }
}
