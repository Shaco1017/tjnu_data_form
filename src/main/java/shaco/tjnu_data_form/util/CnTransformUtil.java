package shaco.tjnu_data_form.util;

public class CnTransformUtil {

    public static String convert(String input) {
        int underscoreIndex = input.indexOf('_');
        if (underscoreIndex == -1) {
            return input;
        }
        String frontPart = input.substring(0, underscoreIndex);
        String backPart = input.substring(underscoreIndex + 1);

        String convertedFront = capitalizeFirstLetter(frontPart);
        String convertedBack = capitalizeFirstLetter(backPart);

        return convertedFront + convertedBack;
    }

    private static String capitalizeFirstLetter(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

}
