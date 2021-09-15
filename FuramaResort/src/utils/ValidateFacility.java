package utils;

import java.util.regex.Pattern;

public class ValidateFacility {
    // Tên id dịch vụ
    public static boolean validateId(String str){
        String regexString ="^(SV)((VL)|(HO)|(RO))[-]\\\\d{4}$";
        return Pattern.matches(regexString,str);
    }
    //Tên dịch vụ
    public static boolean validateServiceName(String str) {
        String regexSring = "[ A - Z][a - z]*[0 - 9]*$";
        return Pattern.matches(regexSring, str);
    }

    //Dien tich su dung
    public static boolean validateArea(String str) {
        String regexString = "^[1-9] [0-9]*$";
        if (Pattern.matches(regexString, str)) {
            boolean check = 30 < Integer.parseInt(str);
            return check;
        }
        return false;
    }

    // chi phi thue
    public static boolean validatePrice(String str) {
        String regexString = " ^[1 -9] [0 - 9]*$";
        return Pattern.matches(regexString, str);
    }

    //Dien tich ho boi
    public static boolean validateSwimmingPool(String str) {
        String regexString = "^[1-9] [0-9]*$";
        if (Pattern.matches(regexString, str)) {
            boolean check = 30 < Integer.parseInt(str);
            return check;
        }
        return false;
    }
    //Kieu thue
    public static boolean validateRentalType(String str){
        String regexString =" ^[A - Z][a -z ]*[0 -9]*$";
        return Pattern.matches(regexString, str);
    }
    //Tieu chuan phong

    public static  boolean validateRoomStandard(String str){
        String regexString ="^[A - Z][a - z]*[0 - 9]*$";
        return Pattern.matches(regexString, str);
    }
    // So tang
    public static  boolean validateFloors(String str){
        String regexString ="^[1-9]";
        return Pattern.matches(regexString, str);
    }
    //  Số người tối đa
    public static boolean validateMaxPeople(String str){
        String regexString ="^[1 - 9][0 - 9]*$";
        if (Pattern.matches(regexString, str)){
            boolean check =0 < Integer.parseInt(str) && Integer.parseInt(str) < 20 ;
            return check;
        }
        return false;
    }
}

