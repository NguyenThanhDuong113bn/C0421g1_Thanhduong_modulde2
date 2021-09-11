package _18_string_regex.bai_tap.bai1_validate_ten_cua_lop_hoc;

public class TestClassExample {
    private static ClassExample classExample;
    public final static String[] string = new String[]{"A1", "A2", "A3","A4"};

    public static void main(String[] args) {
        classExample =new ClassExample();
        for (String test : string){
            boolean isvalid = classExample.validate(test);
            System.out.println(" Class is" + test +" is valid :" + isvalid);
        }
    }
}

