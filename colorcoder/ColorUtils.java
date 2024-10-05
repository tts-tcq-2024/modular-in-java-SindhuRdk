package colorcoder;

import colorcoder.MajorColor;
import colorcoder.MinorColor;
import colorcoder.ColorPair;

public class ColorUtils {
    public static final String MajorColorNames[] = {"White", "Red", "Black", "Yellow", "Violet"};
    public static final int numberOfMajorColors = MajorColorNames.length;
    public static final String MinorColorNames[] = {"Blue", "Orange", "Green", "Brown", "Slate"};
    public static final int numberOfMinorColors = MinorColorNames.length;

    public static ColorPair getColorFromPairNumber(int pairNumber) {
        int zeroBasedPairNumber = pairNumber - 1;
        MajorColor majorColor = MajorColor.fromIndex(zeroBasedPairNumber / numberOfMinorColors);
        MinorColor minorColor = MinorColor.fromIndex(zeroBasedPairNumber % numberOfMinorColors);
        return new ColorPair(majorColor, minorColor);
    }

    public static int getPairNumberFromColor(MajorColor major, MinorColor minor) {
        return major.getIndex() * numberOfMinorColors + minor.getIndex() + 1;
    }

    public static void testNumberToPair(int pairNumber, MajorColor expectedMajor, MinorColor expectedMinor) {
        ColorPair colorPair = getColorFromPairNumber(pairNumber);
        System.out.println("Got pair " + colorPair.toString());
        assert (colorPair.getMajor() == expectedMajor);
        assert (colorPair.getMinor() == expectedMinor);
    }

    public static void testPairToNumber(MajorColor major, MinorColor minor, int expectedPairNumber) {
        int pairNumber = getPairNumberFromColor(major, minor);
        System.out.println("Got pair number " + pairNumber);
        assert (pairNumber == expectedPairNumber);
    }

    public static void printColorCodeReference() {
        System.out.println("Color Code Reference Manual:");
        for (int i = 1; i <= numberOfMajorColors * numberOfMinorColors; i++) {
            ColorPair colorPair = getColorFromPairNumber(i);
            System.out.println("Pair Number " + i + " : " + colorPair.toString());
        }
    }
}
