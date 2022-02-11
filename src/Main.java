public class Main {

    public static void main(String[] args) {
	int[] sayilar= new int[]{1,2,5,7,9,0};
    int aranacak=6;
    boolean varMi=false;
    for(int i=0;i<sayilar[i];i++) {
        if (aranacak == sayilar[i]) {
            varMi=true;
            break;
        }
        }
    if(varMi==true){

        System.out.println("Sayı dizinin içinde");}
        else {
        System.out.println("Sayı dizinin içinde değil");
    }
        }
}
