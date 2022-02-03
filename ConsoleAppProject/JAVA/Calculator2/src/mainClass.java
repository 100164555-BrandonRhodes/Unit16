public class mainClass {
    public static void main(String[] args){
        calculator2 c1 = new calculator2();
        calculator2 c2 = new calculator2();
        
        c1.name = "Ebic";
        c2.name = "Not Ebic";
        
        System.out.println(c1.name + " Calculated " + c1.add(3, 4));
        System.out.println(c2.name + " Calculated " + c2.modulus(29, 5));
        
             
    }
}
