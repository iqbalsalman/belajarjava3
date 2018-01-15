// import java.math.BigDecimal;
// import java.StackOverflowError;
public class AplikasiBni{
  public static void main(String[] args){
        // cara memanggil method hitungBunga yang ada di file Aplikasi Deposito
        Aplikasideposit appDepo = new Aplikasideposit();
        appDepo.hitungBunga(1);

        // cara memanggil method hitungBunga yang ada di file Aplikasi Kredit
        Aplikasikredit appKredit = new Aplikasikredit();
        appKredit.hitungBunga(2); //masih error belah values oke
    }
}