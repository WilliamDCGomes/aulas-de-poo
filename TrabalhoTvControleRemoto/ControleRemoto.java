public class ControleRemoto{
    public static void main(String[] args) {
        Televisao televisao = new Televisao(10, 1);
        System.out.println(televisao.ConsultarInfo() + "\n");
        
        System.out.println(televisao.AumentarVolume());
        System.out.println(televisao.AumentarVolume() + "\n");
        
        System.out.println(televisao.DiminuirVolume() + "\n");
        
        System.out.println(televisao.AumentarCanal() + "\n");
        
        System.out.println(televisao.DiminuirCanal());
        System.out.println(televisao.DiminuirCanal() + "\n");
        
        System.out.println(televisao.TrocaCanal(115) + "\n");
        
        System.out.println(televisao.ConsultarInfo() + "\n");
    }
}
