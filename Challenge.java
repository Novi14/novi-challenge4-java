public class Challenge{
    public static void main(String[] args){
        dataNilai(105);
    }
    static void dataNilai (int nilai){
        if(nilai>=101){
            System.out.println("Invalid Number");
        } else if (nilai>=91){
            System.out.println("Nilai Anda; A");
        } else if (nilai>=76){
            System.out.println("Nilai Anda; B");
        } else if (nilai>=51){
            System.out.println("Nilai Anda; C");  
        } else if (nilai>=26){
            System.out.println("Nilai Anda; D");
        } else if (nilai>=0){
            System.out.println("Nilai Anda; E");
        }
    }

}