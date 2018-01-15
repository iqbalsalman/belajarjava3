public class Multiparams{
	public static void sayHalo( String namaDepan, String namaBelakang, Integer umur){
StringBuilder sb = new StringBuilder();

 sb.append(namaDepan).append(" ").append(namaBelakang);
        String namaLengkap = sb.toString();
        System.out.println(
            "Halo nama lengkap saya adalah " + namaLengkap + " dan umur saya berusia " + umur + " tahun "
        );

	}
	  public static void main(String[] args){
        sayHalo("Dimas", "Maryanto", 25);
    }

}
